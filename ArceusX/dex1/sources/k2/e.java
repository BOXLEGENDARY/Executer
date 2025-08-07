package k2;

import Y3.qE.KpBmp;
import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.concurrent.atomic.AtomicBoolean;

public class e implements MessageQueue {

    private final a f21264c;

    private final Timer f21265d;

    private final c f21268g;

    private final Object f21262a = new Object();

    private final AtomicBoolean f21266e = new AtomicBoolean(false);

    private boolean f21267f = false;

    private final h[] f21263b = new h[g.f21282H + 1];

    public e(Timer timer, c cVar) {
        this.f21264c = new a(cVar);
        this.f21268g = cVar;
        this.f21265d = timer;
    }

    public b a(d dVar) {
        long jNanoTime;
        Long lB;
        b bVarA;
        boolean z7 = false;
        while (this.f21266e.get()) {
            synchronized (this.f21262a) {
                try {
                    jNanoTime = this.f21265d.nanoTime();
                    C2491a.b("[%s] looking for next message at time %s", "priority_mq", Long.valueOf(jNanoTime));
                    lB = this.f21264c.b(jNanoTime, this);
                    C2491a.b("[%s] next delayed job %s", "priority_mq", lB);
                    for (int i7 = g.f21282H; i7 >= 0; i7--) {
                        h hVar = this.f21263b[i7];
                        if (hVar != null && (bVarA = hVar.a()) != null) {
                            return bVarA;
                        }
                    }
                    this.f21267f = false;
                } finally {
                }
            }
            if (!z7) {
                dVar.b();
                z7 = true;
            }
            synchronized (this.f21262a) {
                try {
                    C2491a.b("[%s] did on idle post a message? %s", "priority_mq", Boolean.valueOf(this.f21267f));
                    if (!this.f21267f) {
                        if (lB == null || lB.longValue() > jNanoTime) {
                            if (this.f21266e.get()) {
                                if (lB == null) {
                                    try {
                                        this.f21265d.waitOnObject(this.f21262a);
                                    } catch (InterruptedException unused) {
                                    }
                                } else {
                                    this.f21265d.waitOnObjectUntilNs(this.f21262a, lB.longValue());
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return null;
    }

    @Override
    public void cancelMessages(MessagePredicate messagePredicate) {
        synchronized (this.f21262a) {
            for (int i7 = 0; i7 <= g.f21282H; i7++) {
                try {
                    h hVar = this.f21263b[i7];
                    if (hVar != null) {
                        hVar.c(messagePredicate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f21264c.c(messagePredicate);
        }
    }

    @Override
    public void clear() {
        synchronized (this.f21262a) {
            try {
                for (int i7 = g.f21282H; i7 >= 0; i7--) {
                    h hVar = this.f21263b[i7];
                    if (hVar != null) {
                        hVar.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void consume(d dVar) {
        if (this.f21266e.getAndSet(true)) {
            throw new IllegalStateException("only 1 consumer per MQ");
        }
        while (this.f21266e.get()) {
            b bVarA = a(dVar);
            if (bVarA != null) {
                C2491a.b(KpBmp.idgkeVNpVZdkT, "priority_mq", bVarA.f21257a);
                dVar.a(bVarA);
                this.f21268g.b(bVarA);
            }
        }
    }

    @Override
    public void post(b bVar) {
        synchronized (this.f21262a) {
            try {
                this.f21267f = true;
                int i7 = bVar.f21257a.f21290e;
                h[] hVarArr = this.f21263b;
                if (hVarArr[i7] == null) {
                    hVarArr[i7] = new h(this.f21268g, "queue_" + bVar.f21257a.name());
                }
                this.f21263b[i7].post(bVar);
                this.f21265d.notifyObject(this.f21262a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void postAt(b bVar, long j7) {
        synchronized (this.f21262a) {
            this.f21267f = true;
            this.f21264c.a(bVar, j7);
            this.f21265d.notifyObject(this.f21262a);
        }
    }

    @Override
    public void stop() {
        this.f21266e.set(false);
        synchronized (this.f21262a) {
            this.f21265d.notifyObject(this.f21262a);
        }
    }
}
