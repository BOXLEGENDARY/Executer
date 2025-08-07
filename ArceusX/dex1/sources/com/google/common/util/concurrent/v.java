package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class v {
    public static <V> V a(Future<V> future) throws ExecutionException {
        V v7;
        boolean z7 = false;
        while (true) {
            try {
                v7 = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return v7;
    }
}
