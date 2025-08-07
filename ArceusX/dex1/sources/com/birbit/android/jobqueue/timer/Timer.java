package com.birbit.android.jobqueue.timer;

public interface Timer {
    long nanoTime();

    void notifyObject(Object obj);

    void waitOnObject(Object obj) throws InterruptedException;

    void waitOnObjectUntilNs(Object obj, long j7) throws InterruptedException;
}
