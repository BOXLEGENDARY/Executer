package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.N1;
import com.google.android.gms.measurement.internal.N2;
import java.util.List;
import java.util.Map;
import n3.C2651i;

final class a extends d {

    private final N1 f16240a;

    private final N2 f16241b;

    public a(N1 n1) {
        super(null);
        C2651i.l(n1);
        this.f16240a = n1;
        this.f16241b = n1.I();
    }

    @Override
    public final void L0(String str) throws IllegalStateException {
        this.f16240a.y().m(str, this.f16240a.c().b());
    }

    @Override
    public final String e() {
        return this.f16241b.Y();
    }

    @Override
    public final String f() {
        return this.f16241b.X();
    }

    @Override
    public final void g0(String str) throws IllegalStateException {
        this.f16240a.y().l(str, this.f16240a.c().b());
    }

    @Override
    public final String h() {
        return this.f16241b.X();
    }

    @Override
    public final List<Bundle> h0(String str, String str2) {
        return this.f16241b.b0(str, str2);
    }

    @Override
    public final String i() {
        return this.f16241b.Z();
    }

    @Override
    public final Map<String, Object> i0(String str, String str2, boolean z7) {
        return this.f16241b.c0(str, str2, z7);
    }

    @Override
    public final void j0(Bundle bundle) throws IllegalStateException {
        this.f16241b.D(bundle);
    }

    @Override
    public final void k0(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.f16241b.r(str, str2, bundle);
    }

    @Override
    public final void l0(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.f16240a.I().h0(str, str2, bundle);
    }

    @Override
    public final int n(String str) {
        this.f16241b.S(str);
        return 25;
    }

    @Override
    public final long zzb() {
        return this.f16240a.N().r0();
    }
}
