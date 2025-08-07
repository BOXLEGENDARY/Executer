package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class u {

    private String f18973a = null;

    private Boolean f18974b = null;

    private Integer f18975c = null;

    private Thread.UncaughtExceptionHandler f18976d = null;

    private ThreadFactory f18977e = null;

    class a implements ThreadFactory {

        final ThreadFactory f18978a;

        final String f18979b;

        final AtomicLong f18980c;

        final Boolean f18981d;

        final Integer f18982e;

        final Thread.UncaughtExceptionHandler f18983f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f18978a = threadFactory;
            this.f18979b = str;
            this.f18980c = atomicLong;
            this.f18981d = bool;
            this.f18982e = num;
            this.f18983f = uncaughtExceptionHandler;
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f18978a.newThread(runnable);
            String str = this.f18979b;
            if (str != null) {
                AtomicLong atomicLong = this.f18980c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(u.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f18981d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f18982e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18983f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory c(u uVar) {
        String str = uVar.f18973a;
        Boolean bool = uVar.f18974b;
        Integer num = uVar.f18975c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = uVar.f18976d;
        ThreadFactory threadFactoryDefaultThreadFactory = uVar.f18977e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public u e(String str) {
        d(str, 0);
        this.f18973a = str;
        return this;
    }

    public u f(int i7) {
        K4.g.d(i7 >= 1, "Thread priority (%s) must be >= %s", i7, 1);
        K4.g.d(i7 <= 10, "Thread priority (%s) must be <= %s", i7, 10);
        this.f18975c = Integer.valueOf(i7);
        return this;
    }

    public u g(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f18976d = (Thread.UncaughtExceptionHandler) K4.g.g(uncaughtExceptionHandler);
        return this;
    }
}
