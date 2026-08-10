package org.archive.utils;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.alibaba.fastjson2.JSON;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.archive.constant.CrawlerConstants;
import org.archive.properties.ThreadPoolProperties;

import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ZhaoWeiLong
 **/
@UtilityClass
@Slf4j
public class EntityUtils {

    /**
     * 并发安全队列，多个线程同时添加数据时保证线程安全
     */
    private final ConcurrentLinkedQueue<Entity> taskQueue = new ConcurrentLinkedQueue<>();

    public static void init(ThreadPoolProperties properties) {
        Runnable runnable = getRunnable(properties.getMaxRequestSize());
        BasicThreadFactory threadFactory = new BasicThreadFactory.Builder().namingPattern("entity-scheduled-thread-pool-%d")
                .daemon(true).build();
        ScheduledExecutorService service = new ScheduledThreadPoolExecutor(properties.getCorePoolSize(), threadFactory);
        service.scheduleAtFixedRate(runnable, 0L, properties.getRequestInterval(), TimeUnit.MILLISECONDS);
    }

    /**
     * 从队列中取出指定数量的元素，返回到集合中
     *
     * @param queue 队列实例
     * @param size  指定数量
     * @return 集合实例
     */
    private static List<Entity> extractElement(Queue<Entity> queue, int size) {
        Objects.requireNonNull(queue);
        List<Entity> lists = new ArrayList<>(size);
        for (int i = 0; i < size; ++i) {
            lists.add(queue.poll());
        }
        return lists;
    }

    public static void saveEntity(Collection<Entity> models) {
        taskQueue.addAll(models);
    }


    /**
     * 构建任务实例
     *
     * @param maxRequestSize 单次最大合并请求数量
     * @return 任务实例
     */
    private Runnable getRunnable(int maxRequestSize) {
        return () -> {
            int size = Math.min(taskQueue.size(), maxRequestSize);
            if (size != 0) {
                final List<Entity> entityList = extractElement(taskQueue, size);
                try {
                    Db.use().insert(entityList);
                    log.info("save entity success, size: {}", entityList.size());
                } catch (SQLException e) {
                    log.error("save entity failed", e);
                    final String json = JSON.toJSONString(entityList);
                    RedisUtil.rpush(CrawlerConstants.CRAWLER_DB_SAVE_ERROR_QUEUE, json);
                }
            }
        };
    }
}
