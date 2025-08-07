package com.roblox.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

public class C2373v {
    public static Future<?> a(ExecutorService executorService, Runnable runnable) {
        if (executorService == null) {
            h7.l.d("ExecutorUtil", "Executor is null");
            return null;
        }
        if (runnable == null) {
            h7.l.d("ExecutorUtil", "Task is null");
            return null;
        }
        try {
            return executorService.submit(runnable);
        } catch (RejectedExecutionException e7) {
            h7.l.e("ExecutorUtil", "Failed to submit task to executor", e7);
            return null;
        }
    }
}
