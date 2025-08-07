package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class G1 {
    public static InterfaceExecutorServiceC2183z1 a(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC2183z1) {
            return (InterfaceExecutorServiceC2183z1) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new F1((ScheduledExecutorService) executorService) : new B1(executorService);
    }

    public static A1 b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof A1 ? (A1) scheduledExecutorService : new F1(scheduledExecutorService);
    }
}
