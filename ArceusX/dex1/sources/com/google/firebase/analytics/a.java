package com.google.firebase.analytics;

import W3.t;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.W0;
import java.util.List;
import java.util.Map;

final class a implements t {

    final W0 f18986a;

    a(W0 w02) {
        this.f18986a = w02;
    }

    @Override
    public final void L0(String str) {
        this.f18986a.H(str);
    }

    @Override
    public final String e() {
        return this.f18986a.x();
    }

    @Override
    public final String f() {
        return this.f18986a.w();
    }

    @Override
    public final void g0(String str) {
        this.f18986a.F(str);
    }

    @Override
    public final String h() {
        return this.f18986a.z();
    }

    @Override
    public final List<Bundle> h0(String str, String str2) {
        return this.f18986a.A(str, str2);
    }

    @Override
    public final String i() {
        return this.f18986a.y();
    }

    @Override
    public final Map<String, Object> i0(String str, String str2, boolean z7) {
        return this.f18986a.B(str, str2, z7);
    }

    @Override
    public final void j0(Bundle bundle) {
        this.f18986a.b(bundle);
    }

    @Override
    public final void k0(String str, String str2, Bundle bundle) {
        this.f18986a.I(str, str2, bundle);
    }

    @Override
    public final void l0(String str, String str2, Bundle bundle) {
        this.f18986a.G(str, str2, bundle);
    }

    @Override
    public final int n(String str) {
        return this.f18986a.n(str);
    }

    @Override
    public final long zzb() {
        return this.f18986a.o();
    }
}
