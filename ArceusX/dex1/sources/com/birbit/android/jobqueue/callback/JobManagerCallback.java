package com.birbit.android.jobqueue.callback;

import com.birbit.android.jobqueue.e;

public interface JobManagerCallback {
    public static final int RESULT_CANCEL_CANCELLED_VIA_SHOULD_RE_RUN = 5;
    public static final int RESULT_CANCEL_CANCELLED_WHILE_RUNNING = 3;
    public static final int RESULT_CANCEL_REACHED_RETRY_LIMIT = 2;
    public static final int RESULT_CANCEL_SINGLE_INSTANCE_WHILE_RUNNING = 6;
    public static final int RESULT_FAIL_WILL_RETRY = 4;
    public static final int RESULT_SUCCEED = 1;

    void onAfterJobRun(e eVar, int i7);

    void onDone(e eVar);

    void onJobAdded(e eVar);

    void onJobCancelled(e eVar, boolean z7, Throwable th);

    void onJobRun(e eVar, int i7);
}
