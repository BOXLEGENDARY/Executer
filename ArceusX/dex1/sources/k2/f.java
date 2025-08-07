package k2;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.concurrent.atomic.AtomicBoolean;
import y0.xyyu.hkVlaTTCDY;

public class f extends h implements MessageQueue {

    private final Object f21269f;

    private final AtomicBoolean f21270g;

    private final Timer f21271h;

    private final a f21272i;

    private boolean f21273j;

    private final c f21274k;

    public f(Timer timer, c cVar, String str) {
        super(cVar, str);
        this.f21269f = new Object();
        this.f21270g = new AtomicBoolean(false);
        this.f21273j = false;
        this.f21274k = cVar;
        this.f21271h = timer;
        this.f21272i = new a(cVar);
    }

    @Override
    public void cancelMessages(MessagePredicate messagePredicate) {
        synchronized (this.f21269f) {
            super.c(messagePredicate);
            this.f21272i.c(messagePredicate);
        }
    }

    @Override
    public void clear() {
        synchronized (this.f21269f) {
            super.clear();
        }
    }

    @Override
    public void consume(d dVar) {
        if (this.f21270g.getAndSet(true)) {
            throw new IllegalStateException("only 1 consumer per MQ");
        }
        dVar.c();
        while (this.f21270g.get()) {
            b bVarD = d(dVar);
            if (bVarD != null) {
                dVar.a(bVarD);
                this.f21274k.b(bVarD);
            }
        }
        C2491a.b("[%s] finished queue", this.f21294c);
    }

    b d(d dVar) {
        long jNanoTime;
        Long lB;
        boolean z7 = false;
        while (this.f21270g.get()) {
            synchronized (this.f21269f) {
                try {
                    jNanoTime = this.f21271h.nanoTime();
                    lB = this.f21272i.b(jNanoTime, this);
                    b bVarA = super.a();
                    if (bVarA != null) {
                        return bVarA;
                    }
                    this.f21273j = false;
                } finally {
                }
            }
            if (!z7) {
                dVar.b();
                z7 = true;
            }
            synchronized (this.f21269f) {
                try {
                    if (!this.f21273j) {
                        if (lB != null && lB.longValue() <= jNanoTime) {
                            C2491a.b("[%s] next message is ready, requery", this.f21294c);
                        } else if (this.f21270g.get()) {
                            if (lB == null) {
                                try {
                                    C2491a.b(hkVlaTTCDY.UnwuEHmI, this.f21294c);
                                    this.f21271h.waitOnObject(this.f21269f);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                C2491a.b("[%s] will wait on the lock until %d", this.f21294c, lB);
                                this.f21271h.waitOnObjectUntilNs(this.f21269f, lB.longValue());
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
    public void post(b bVar) {
        synchronized (this.f21269f) {
            this.f21273j = true;
            super.post(bVar);
            this.f21271h.notifyObject(this.f21269f);
        }
    }

    @Override
    public void postAt(b bVar, long j7) {
        synchronized (this.f21269f) {
            this.f21273j = true;
            this.f21272i.a(bVar, j7);
            this.f21271h.notifyObject(this.f21269f);
        }
    }

    @Override
    public void stop() {
        this.f21270g.set(false);
        synchronized (this.f21269f) {
            this.f21271h.notifyObject(this.f21269f);
        }
    }
}
