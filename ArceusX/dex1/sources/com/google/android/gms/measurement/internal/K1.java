package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import n3.C2651i;

final class K1 extends Thread {

    private final Object f16353d;

    private final BlockingQueue<J1<?>> f16354e;

    private boolean f16355i = false;

    final L1 f16356v;

    public K1(L1 l1, String str, BlockingQueue<J1<?>> blockingQueue) {
        this.f16356v = l1;
        C2651i.l(str);
        C2651i.l(blockingQueue);
        this.f16353d = new Object();
        this.f16354e = blockingQueue;
        setName(str);
    }

    private final void b() {
        synchronized (this.f16356v.f16373i) {
            try {
                if (!this.f16355i) {
                    this.f16356v.f16374j.release();
                    this.f16356v.f16373i.notifyAll();
                    if (this == this.f16356v.f16367c) {
                        this.f16356v.f16367c = null;
                    } else if (this == this.f16356v.f16368d) {
                        this.f16356v.f16368d = null;
                    } else {
                        this.f16356v.f16818a.b().r().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f16355i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f16356v.f16818a.b().w().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        synchronized (this.f16353d) {
            this.f16353d.notifyAll();
        }
    }

    @Override
    public final void run() throws InterruptedException {
        boolean z7 = false;
        while (!z7) {
            try {
                this.f16356v.f16374j.acquire();
                z7 = true;
            } catch (InterruptedException e7) {
                c(e7);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                J1<?> j1Poll = this.f16354e.poll();
                if (j1Poll != null) {
                    Process.setThreadPriority(true != j1Poll.f16341e ? 10 : threadPriority);
                    j1Poll.run();
                } else {
                    synchronized (this.f16353d) {
                        if (this.f16354e.peek() == null) {
                            L1.B(this.f16356v);
                            try {
                                this.f16353d.wait(30000L);
                            } catch (InterruptedException e8) {
                                c(e8);
                            }
                        }
                    }
                    synchronized (this.f16356v.f16373i) {
                        try {
                            if (this.f16354e.peek() == null) {
                                break;
                            }
                        } finally {
                        }
                    }
                }
            }
            if (this.f16356v.f16818a.z().B(null, Y0.f16629l0)) {
                b();
            }
            b();
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
