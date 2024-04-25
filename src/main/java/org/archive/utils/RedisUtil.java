package org.archive.utils;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import lombok.Setter;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;

/**
 * Redis工具
 *
 * @author ZhaoWeiLong
 **/
public class RedisUtil {


    @Setter
    private static JedisPool jedisPool;

    public static Jedis getJedis() {
        return jedisPool.getResource();
    }

    public static long del(String... keys) {
        try (Jedis jedis = getJedis()) {
            return jedis.del(keys);
        }
    }

    public static Set<String> keys(String pattern) {
        try (Jedis jedis = getJedis()) {
            return jedis.keys(pattern);
        }
    }

    public static <T> T get(String key, Class<T> clazz) {
        return JSONObject.parseObject(get(key), clazz);
    }

    public static String get(String key) {
        try (Jedis jedis = getJedis()) {
            return jedis.get(key);
        }
    }

    public static <T> String set(String key, T value) {
        return set(key, JSON.toJSONString(value));
    }

    public static String set(String key, String value) {
        try (Jedis jedis = getJedis()) {
            return jedis.set(key, value);
        }
    }

    public static long rpush(String key, String value) {
        try (Jedis jedis = getJedis()) {
             return jedis.rpush(key, value);
        }
    }

    public static void incr(String key) {
        try (Jedis jedis = getJedis()) {
            jedis.incr(key);
        }
    }
}
