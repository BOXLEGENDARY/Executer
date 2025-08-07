package k2;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import j2.C2491a;

class a {

    b f21255a = null;

    final c f21256b;

    a(c cVar) {
        this.f21256b = cVar;
    }

    void a(b bVar, long j7) {
        C2491a.b("add delayed message %s at time %s", bVar, Long.valueOf(j7));
        bVar.f21259c = j7;
        b bVar2 = this.f21255a;
        if (bVar2 == null) {
            this.f21255a = bVar;
            return;
        }
        b bVar3 = null;
        while (bVar2 != null && bVar2.f21259c <= j7) {
            bVar3 = bVar2;
            bVar2 = bVar2.f21258b;
        }
        if (bVar3 == null) {
            bVar.f21258b = this.f21255a;
            this.f21255a = bVar;
        } else {
            bVar3.f21258b = bVar;
            bVar.f21258b = bVar2;
        }
    }

    Long b(long j7, MessageQueue messageQueue) {
        b bVar;
        C2491a.b("flushing messages at time %s", Long.valueOf(j7));
        while (true) {
            bVar = this.f21255a;
            if (bVar == null || bVar.f21259c > j7) {
                break;
            }
            this.f21255a = bVar.f21258b;
            bVar.f21258b = null;
            messageQueue.post(bVar);
        }
        if (bVar == null) {
            return null;
        }
        C2491a.b("returning next ready at %d ns", Long.valueOf(bVar.f21259c - j7));
        return Long.valueOf(this.f21255a.f21259c);
    }

    public void c(MessagePredicate messagePredicate) {
        b bVar = this.f21255a;
        b bVar2 = null;
        while (bVar != null) {
            boolean zOnMessage = messagePredicate.onMessage(bVar);
            b bVar3 = bVar.f21258b;
            if (zOnMessage) {
                if (bVar2 == null) {
                    this.f21255a = bVar3;
                } else {
                    bVar2.f21258b = bVar3;
                }
                this.f21256b.b(bVar);
            } else {
                bVar2 = bVar;
            }
            bVar = bVar3;
        }
    }
}
