package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class l extends J3.i {

    final b f14311b;

    public l(b bVar, Looper looper) {
        super(looper);
        this.f14311b = bVar;
    }

    private static final void a(Message message) {
        m mVar = (m) message.obj;
        mVar.b();
        mVar.e();
    }

    private static final boolean b(Message message) {
        int i7 = message.what;
        return i7 == 2 || i7 == 1 || i7 == 7;
    }

    @Override
    public final void handleMessage(Message message) {
        if (this.f14311b.f14288V.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !this.f14311b.t()) || message.what == 5)) && !this.f14311b.f()) {
            a(message);
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            this.f14311b.f14285S = new ConnectionResult(message.arg2);
            if (b.h0(this.f14311b)) {
                b bVar = this.f14311b;
                if (!bVar.f14286T) {
                    bVar.i0(3, null);
                    return;
                }
            }
            b bVar2 = this.f14311b;
            ConnectionResult connectionResult = bVar2.f14285S != null ? bVar2.f14285S : new ConnectionResult(8);
            this.f14311b.f14275I.a(connectionResult);
            this.f14311b.L(connectionResult);
            return;
        }
        if (i8 == 5) {
            b bVar3 = this.f14311b;
            ConnectionResult connectionResult2 = bVar3.f14285S != null ? bVar3.f14285S : new ConnectionResult(8);
            this.f14311b.f14275I.a(connectionResult2);
            this.f14311b.L(connectionResult2);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f14311b.f14275I.a(connectionResult3);
            this.f14311b.L(connectionResult3);
            return;
        }
        if (i8 == 6) {
            this.f14311b.i0(5, null);
            b bVar4 = this.f14311b;
            if (bVar4.f14280N != null) {
                bVar4.f14280N.E0(message.arg2);
            }
            this.f14311b.M(message.arg2);
            b.g0(this.f14311b, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f14311b.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((m) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
