package org.archive.proxy;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ZhaoWeiLong
 **/
public abstract class Scheduler implements Runnable {

    protected long initialDelay = 0;
    protected long period = 3;
    protected TimeUnit unit = TimeUnit.HOURS;
    protected ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    public Scheduler() {

    }

    public Scheduler(long initialDelay, long period, TimeUnit unit, ScheduledExecutorService scheduledExecutorService) {
        this.initialDelay = initialDelay;
        this.period = period;
        this.unit = unit;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    public void start() {
        scheduledExecutorService.scheduleAtFixedRate(this, initialDelay, period, unit);
    }
}
