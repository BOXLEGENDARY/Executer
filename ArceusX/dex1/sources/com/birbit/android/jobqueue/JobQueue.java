package com.birbit.android.jobqueue;

import java.util.Set;

public interface JobQueue {
    void clear();

    int count();

    int countReadyJobs(c cVar);

    f findJobById(String str);

    Set<f> findJobs(c cVar);

    Long getNextJobDelayUntilNs(c cVar);

    boolean insert(f fVar);

    boolean insertOrReplace(f fVar);

    f nextJobAndIncRunCount(c cVar);

    void onJobCancelled(f fVar);

    void remove(f fVar);

    void substitute(f fVar, f fVar2);
}
