package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;

final class HandlerC2351i extends L3.e {

    private final C2348f f19047a;

    HandlerC2351i(C2348f c2348f, Looper looper) {
        super(looper);
        this.f19047a = c2348f;
    }

    @Override
    public final void handleMessage(Message message) {
        this.f19047a.d(message);
    }
}
