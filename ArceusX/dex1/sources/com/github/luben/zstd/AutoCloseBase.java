package com.github.luben.zstd;

import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

abstract class AutoCloseBase implements Closeable {
    private static final int SHARED_LOCK_CLOSED = -1;
    private static final AtomicIntegerFieldUpdater<AutoCloseBase> SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(AutoCloseBase.class, "sharedLock");
    private volatile int sharedLock;

    AutoCloseBase() {
    }

    void acquireSharedLock() {
        int i7;
        do {
            i7 = this.sharedLock;
            if (i7 < 0) {
                throw new IllegalStateException(KwdswzaUHE.SUYhSMAgCHe);
            }
            if (i7 == Integer.MAX_VALUE) {
                throw new IllegalStateException("Shared lock overflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i7, i7 + 1));
    }

    @Override
    public void close() {
        synchronized (this) {
            try {
                if (this.sharedLock == -1) {
                    return;
                }
                if (!SHARED_LOCK_UPDATER.compareAndSet(this, 0, -1)) {
                    throw new IllegalStateException("Attempt to close while in use");
                }
                doClose();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    abstract void doClose();

    void releaseSharedLock() {
        int i7;
        do {
            i7 = this.sharedLock;
            if (i7 < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i7 == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i7, i7 - 1));
    }

    void storeFence() {
        this.sharedLock = 0;
    }
}
