package k2;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import j2.C2491a;
import java.util.concurrent.atomic.AtomicInteger;

class h {

    private static final AtomicInteger f21291e = new AtomicInteger(0);

    private b f21292a = null;

    private b f21293b = null;

    public final String f21294c;

    private final c f21295d;

    public h(c cVar, String str) {
        this.f21295d = cVar;
        this.f21294c = str + "_" + f21291e.incrementAndGet();
    }

    private void b(b bVar, b bVar2) {
        if (this.f21293b == bVar2) {
            this.f21293b = bVar;
        }
        if (bVar == null) {
            this.f21292a = bVar2.f21258b;
        } else {
            bVar.f21258b = bVar2.f21258b;
        }
        this.f21295d.b(bVar2);
    }

    b a() {
        b bVar = this.f21292a;
        C2491a.b("[%s] remove message %s", this.f21294c, bVar);
        if (bVar != null) {
            this.f21292a = bVar.f21258b;
            if (this.f21293b == bVar) {
                this.f21293b = null;
            }
        }
        return bVar;
    }

    protected void c(MessagePredicate messagePredicate) {
        b bVar = this.f21292a;
        b bVar2 = null;
        while (bVar != null) {
            if (messagePredicate.onMessage(bVar)) {
                b bVar3 = bVar.f21258b;
                b(bVar2, bVar);
                bVar = bVar3;
            } else {
                bVar2 = bVar;
                bVar = bVar.f21258b;
            }
        }
    }

    public void clear() {
        while (true) {
            b bVar = this.f21292a;
            if (bVar == null) {
                this.f21293b = null;
                return;
            } else {
                this.f21292a = bVar.f21258b;
                this.f21295d.b(bVar);
            }
        }
    }

    public void post(b bVar) {
        C2491a.b("[%s] post message %s", this.f21294c, bVar);
        b bVar2 = this.f21293b;
        if (bVar2 == null) {
            this.f21292a = bVar;
            this.f21293b = bVar;
        } else {
            bVar2.f21258b = bVar;
            this.f21293b = bVar;
        }
    }
}
