package com.birbit.android.jobqueue.log;

public interface CustomLogger {
    void d(String str, Object... objArr);

    void e(String str, Object... objArr);

    void e(Throwable th, String str, Object... objArr);

    boolean isDebugEnabled();

    void v(String str, Object... objArr);
}
