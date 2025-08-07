package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class C2124p1 extends C2135r1 {
    public static InterfaceFutureC2177y1 a(Object obj) {
        return new C2141s1(obj);
    }

    public static InterfaceFutureC2177y1 b(InterfaceFutureC2177y1 interfaceFutureC2177y1, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC2177y1.isDone() ? interfaceFutureC2177y1 : K1.C(interfaceFutureC2177y1, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(InterfaceFutureC2177y1 interfaceFutureC2177y1, InterfaceC2112n1 interfaceC2112n1, Executor executor) {
        interfaceFutureC2177y1.f(new RunnableC2118o1(interfaceFutureC2177y1, interfaceC2112n1), executor);
    }
}
