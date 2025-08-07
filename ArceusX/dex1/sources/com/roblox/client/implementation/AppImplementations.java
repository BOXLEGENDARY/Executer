package com.roblox.client.implementation;

import E6.e;
import P5.b;
import P5.c;
import S7.f;
import W7.k;
import W7.n;
import a7.a;
import android.content.Context;
import u6.InterfaceC2940a;

public class AppImplementations implements a, H6.a, InterfaceC2940a, b {
    @Override
    public e getAppsFlyerManager() {
        return O5.b.r();
    }

    @Override
    public f getIdentityProtocol() {
        return f.z();
    }

    @Override
    public k getPermissionsProtocol() {
        return n.d0();
    }

    @Override
    public P5.a getRtcAudioManager(Context context) {
        return new c(context);
    }
}
