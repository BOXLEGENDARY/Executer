package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

final class s {
    static void a(Object obj, long j7) {
        LockSupport.parkNanos(obj, Math.min(j7, 2147483647999999999L));
    }
}
