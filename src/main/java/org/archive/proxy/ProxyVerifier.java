package org.archive.proxy;

import lombok.Getter;
import org.archive.model.ProxyEntity;
import org.archive.utils.VerifyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/**
 * @author ZhaoWeiLong
 **/
public class ProxyVerifier implements Runnable {

    private final Logger log = LoggerFactory.getLogger(ProxyVerifier.class);

    private final AtomicBoolean flag = new AtomicBoolean(true);

    @Getter
    private final BlockingQueue<ProxyEntity> proxyQueue;
    private ExecutorService executorService;
    private Consumer<ProxyEntity> successfulConsumer;
    private Consumer<ProxyEntity> failedConsumer;

    public ProxyVerifier(BlockingQueue<ProxyEntity> proxyQueue) {
        this.proxyQueue = proxyQueue;
    }

    public ProxyVerifier(BlockingQueue<ProxyEntity> proxyQueue, ExecutorService executorService) {
        this(proxyQueue);
        this.executorService = executorService;
    }

    public ProxyVerifier(BlockingQueue<ProxyEntity> proxyQueue, ExecutorService executorService,
                         Consumer<ProxyEntity> successfulConsumer, Consumer<ProxyEntity> failedConsumer) {
        this(proxyQueue, executorService);
        this.successfulConsumer = successfulConsumer;
        this.failedConsumer = failedConsumer;
    }

    public static ProxyVerifierBuilder builder() {
        return new ProxyVerifierBuilder();
    }

    public void stopVerify() {
        flag.set(false);
    }

    public void startVerify() {
        log.info("==============开始校验代理ip=========");
        flag.set(true);
        executorService.execute(this);
    }

    public void shutdown() {
        executorService.shutdown();
    }

    @Override
    public void run() {
        while (flag.get()) {
            try {
                ProxyEntity entity = getProxyQueue().take();
                executorService.execute(() -> doVerify(entity));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void doVerify(ProxyEntity entity) {
        boolean available = VerifyUtil.verify(Objects.requireNonNull(entity));
        entity.setValidateTime(LocalDateTime.now());
        entity.setAvailable(available);

        if (available) {
            successfulConsumer.accept(entity);
            log.info(String.format("校验成功： host: %s, port: %s, type: %s ", entity.getHost(), entity.getPort(), entity.getType()));
        } else {
            failedConsumer.accept(entity);
            log.info(String.format("校验失败： host: %s, port: %s, type: %s ", entity.getHost(), entity.getPort(), entity.getType()));
        }
    }

    public static class ProxyVerifierBuilder {

        private static final Consumer<ProxyEntity> EMPTY_CONSUMER = entity -> {
        };

        private BlockingQueue<ProxyEntity> proxyQueue;
        private ExecutorService executorService;

        private Consumer<ProxyEntity> successfulConsumer;
        private Consumer<ProxyEntity> failedConsumer;

        public ProxyVerifierBuilder() {

        }

        /**
         * 绑定队列
         *
         * @param proxyQueue
         * @return
         */
        public ProxyVerifierBuilder bind(BlockingQueue<ProxyEntity> proxyQueue) {
            this.proxyQueue = proxyQueue;
            return this;
        }

        public ProxyVerifierBuilder executorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * 代理验证成功后的处理
         *
         * @param consumer
         * @return
         */
        public ProxyVerifierBuilder ifVerificationSucceeds(Consumer<ProxyEntity> consumer) {
            this.successfulConsumer = consumer;
            return this;
        }

        /**
         * 代理验证失败后的处理
         *
         * @param consumer
         * @return
         */
        public ProxyVerifierBuilder ifVerificationFails(Consumer<ProxyEntity> consumer) {
            this.failedConsumer = consumer;
            return this;
        }

        public ProxyVerifier build() {
            if (proxyQueue == null) {
                throw new NullPointerException("validator must bind queue");
            }
            if (executorService == null) {
                executorService = Executors.newFixedThreadPool(5);
            }
            if (successfulConsumer == null) {
                successfulConsumer = EMPTY_CONSUMER;
            }
            if (failedConsumer == null) {
                failedConsumer = EMPTY_CONSUMER;
            }

            return new ProxyVerifier(proxyQueue, executorService, successfulConsumer, failedConsumer);
        }

        @Override
        public String toString() {
            return "ProxyValidatorBuilder{" +
                    "proxyQueue=" + proxyQueue +
                    ", executorService=" + executorService +
                    ", successfulConsumer=" + successfulConsumer +
                    ", failedConsumer=" + failedConsumer +
                    '}';
        }
    }
}
