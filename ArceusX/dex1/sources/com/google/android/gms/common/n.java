package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class n extends I3.j {

    private final Context f14395b;

    final C1818c f14396c;

    public n(C1818c c1818c, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f14396c = c1818c;
        this.f14395b = context.getApplicationContext();
    }

    @Override
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        C1818c c1818c = this.f14396c;
        int iG = c1818c.g(this.f14395b);
        if (c1818c.j(iG)) {
            this.f14396c.p(this.f14395b, iG);
        }
    }
}
