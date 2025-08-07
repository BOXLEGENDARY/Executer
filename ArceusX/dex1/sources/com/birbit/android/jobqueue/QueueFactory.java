package com.birbit.android.jobqueue;

public interface QueueFactory {
    JobQueue createNonPersistent(h2.a aVar, long j7);

    JobQueue createPersistentQueue(h2.a aVar, long j7);
}
