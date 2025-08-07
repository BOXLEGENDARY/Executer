package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.C1823h;
import com.google.android.gms.common.C1824i;
import com.google.android.gms.internal.measurement.C1833b;
import com.google.android.gms.internal.measurement.C1858e0;
import com.google.android.gms.internal.measurement.C2017y0;
import com.google.android.gms.internal.measurement.E6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import n3.C2651i;

public final class BinderC2220g2 extends W3.c {

    private final c4 f16802d;

    private Boolean f16803e;

    private String f16804i;

    public BinderC2220g2(c4 c4Var, String str) {
        C2651i.l(c4Var);
        this.f16802d = c4Var;
        this.f16804i = null;
    }

    private final void O0(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            this.f16802d.b().r().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z7) {
            try {
                if (this.f16803e == null) {
                    boolean z8 = true;
                    if (!"com.google.android.gms".equals(this.f16804i) && !v3.s.a(this.f16802d.f(), Binder.getCallingUid()) && !C1824i.a(this.f16802d.f()).c(Binder.getCallingUid())) {
                        z8 = false;
                    }
                    this.f16803e = Boolean.valueOf(z8);
                }
                if (this.f16803e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                this.f16802d.b().r().b("Measurement Service called with invalid calling package. appId", C2234j1.z(str));
                throw e7;
            }
        }
        if (this.f16804i == null && C1823h.j(this.f16802d.f(), Binder.getCallingUid(), str)) {
            this.f16804i = str;
        }
        if (str.equals(this.f16804i)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void P6(zzp zzpVar, boolean z7) {
        C2651i.l(zzpVar);
        C2651i.f(zzpVar.f17168d);
        O0(zzpVar.f17168d, false);
        this.f16802d.g0().K(zzpVar.f17169e, zzpVar.f17162J, zzpVar.f17166N);
    }

    public final void V0(zzat zzatVar, zzp zzpVar) {
        this.f16802d.e();
        this.f16802d.i(zzatVar, zzpVar);
    }

    @Override
    public final void I1(zzp zzpVar) throws IllegalStateException {
        C2651i.f(zzpVar.f17168d);
        O0(zzpVar.f17168d, false);
        O6(new W1(this, zzpVar));
    }

    @Override
    public final void I5(zzkv zzkvVar, zzp zzpVar) throws IllegalStateException {
        C2651i.l(zzkvVar);
        P6(zzpVar, false);
        O6(new RunnableC2200c2(this, zzkvVar, zzpVar));
    }

    final void M6(String str, Bundle bundle) {
        C2227i c2227iV = this.f16802d.V();
        c2227iV.h();
        c2227iV.i();
        byte[] bArrJ = c2227iV.f16519b.f0().C(new C2252n(c2227iV.f16818a, BuildConfig.FLAVOR, str, "dep", 0L, 0L, bundle)).j();
        c2227iV.f16818a.b().v().c("Saving default event parameters, appId, data size", c2227iV.f16818a.D().d(str), Integer.valueOf(bArrJ.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrJ);
        try {
            if (c2227iV.R().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c2227iV.f16818a.b().r().b("Failed to insert default event parameters (got -1). appId", C2234j1.z(str));
            }
        } catch (SQLiteException e7) {
            c2227iV.f16818a.b().r().c("Error storing default event parameters. appId", C2234j1.z(str), e7);
        }
    }

    @Override
    public final byte[] N2(zzat zzatVar, String str) {
        C2651i.f(str);
        C2651i.l(zzatVar);
        O0(str, true);
        this.f16802d.b().q().b("Log and bundle. event", this.f16802d.W().d(zzatVar.f17142d));
        long jNanoTime = this.f16802d.c().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f16802d.a().t(new CallableC2195b2(this, zzatVar, str)).get();
            if (bArr == null) {
                this.f16802d.b().r().b("Log and bundle returned null. appId", C2234j1.z(str));
                bArr = new byte[0];
            }
            this.f16802d.b().q().d("Log and bundle processed. event, size, time_ms", this.f16802d.W().d(zzatVar.f17142d), Integer.valueOf(bArr.length), Long.valueOf((this.f16802d.c().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            this.f16802d.b().r().d("Failed to log and bundle. appId, event, error", C2234j1.z(str), this.f16802d.W().d(zzatVar.f17142d), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            this.f16802d.b().r().d("Failed to log and bundle. appId, event, error", C2234j1.z(str), this.f16802d.W().d(zzatVar.f17142d), e);
            return null;
        }
    }

    final void O6(Runnable runnable) throws IllegalStateException {
        C2651i.l(runnable);
        if (this.f16802d.a().C()) {
            runnable.run();
        } else {
            this.f16802d.a().z(runnable);
        }
    }

    @Override
    public final void T5(zzat zzatVar, String str, String str2) throws IllegalStateException {
        C2651i.l(zzatVar);
        C2651i.f(str);
        O0(str, true);
        O6(new RunnableC2190a2(this, zzatVar, str));
    }

    @Override
    public final String U1(zzp zzpVar) {
        P6(zzpVar, false);
        return this.f16802d.i0(zzpVar);
    }

    @Override
    public final void U3(zzat zzatVar, zzp zzpVar) throws IllegalStateException {
        C2651i.l(zzatVar);
        P6(zzpVar, false);
        O6(new Z1(this, zzatVar, zzpVar));
    }

    @Override
    public final void a3(zzp zzpVar) throws IllegalStateException {
        P6(zzpVar, false);
        O6(new RunnableC2210e2(this, zzpVar));
    }

    @Override
    public final List<zzab> c3(String str, String str2, zzp zzpVar) {
        P6(zzpVar, false);
        String str3 = zzpVar.f17168d;
        C2651i.l(str3);
        try {
            return (List) this.f16802d.a().s(new U1(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f16802d.b().r().b("Failed to get conditional user properties", e7);
            return Collections.emptyList();
        }
    }

    @Override
    public final void f4(zzp zzpVar) throws IllegalStateException {
        C2651i.f(zzpVar.f17168d);
        C2651i.l(zzpVar.f17167O);
        Y1 y12 = new Y1(this, zzpVar);
        C2651i.l(y12);
        if (this.f16802d.a().C()) {
            y12.run();
        } else {
            this.f16802d.a().A(y12);
        }
    }

    @Override
    public final void h1(final Bundle bundle, zzp zzpVar) throws IllegalStateException {
        P6(zzpVar, false);
        final String str = zzpVar.f17168d;
        C2651i.l(str);
        O6(new Runnable() {
            @Override
            public final void run() {
                this.f16443d.M6(str, bundle);
            }
        });
    }

    final zzat h3(zzat zzatVar, zzp zzpVar) {
        zzar zzarVar;
        if ("_cmp".equals(zzatVar.f17142d) && (zzarVar = zzatVar.f17143e) != null && zzarVar.l() != 0) {
            String strS = zzatVar.f17143e.s("_cis");
            if ("referrer broadcast".equals(strS) || "referrer API".equals(strS)) {
                this.f16802d.b().u().b("Event has been filtered ", zzatVar.toString());
                return new zzat("_cmpx", zzatVar.f17143e, zzatVar.f17144i, zzatVar.f17145v);
            }
        }
        return zzatVar;
    }

    @Override
    public final void j4(long j7, String str, String str2, String str3) throws IllegalStateException {
        O6(new RunnableC2215f2(this, str2, str3, str, j7));
    }

    @Override
    public final void q1(zzab zzabVar, zzp zzpVar) throws IllegalStateException {
        C2651i.l(zzabVar);
        C2651i.l(zzabVar.f17136i);
        P6(zzpVar, false);
        zzab zzabVar2 = new zzab(zzabVar);
        zzabVar2.f17134d = zzpVar.f17168d;
        O6(new P1(this, zzabVar2, zzpVar));
    }

    @Override
    public final void r3(zzp zzpVar) throws IllegalStateException {
        P6(zzpVar, false);
        O6(new X1(this, zzpVar));
    }

    @Override
    public final List<zzkv> r4(String str, String str2, boolean z7, zzp zzpVar) {
        P6(zzpVar, false);
        String str3 = zzpVar.f17168d;
        C2651i.l(str3);
        try {
            List<g4> list = (List) this.f16802d.a().s(new R1(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (g4 g4Var : list) {
                if (z7 || !i4.V(g4Var.f16809c)) {
                    arrayList.add(new zzkv(g4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f16802d.b().r().c("Failed to query user properties. appId", C2234j1.z(zzpVar.f17168d), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f16802d.b().r().c("Failed to query user properties. appId", C2234j1.z(zzpVar.f17168d), e);
            return Collections.emptyList();
        }
    }

    @Override
    public final List<zzkv> u5(zzp zzpVar, boolean z7) {
        P6(zzpVar, false);
        String str = zzpVar.f17168d;
        C2651i.l(str);
        try {
            List<g4> list = (List) this.f16802d.a().s(new CallableC2205d2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (g4 g4Var : list) {
                if (z7 || !i4.V(g4Var.f16809c)) {
                    arrayList.add(new zzkv(g4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f16802d.b().r().c("Failed to get user properties. appId", C2234j1.z(zzpVar.f17168d), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            this.f16802d.b().r().c("Failed to get user properties. appId", C2234j1.z(zzpVar.f17168d), e);
            return null;
        }
    }

    @Override
    public final void v2(zzab zzabVar) throws IllegalStateException {
        C2651i.l(zzabVar);
        C2651i.l(zzabVar.f17136i);
        C2651i.f(zzabVar.f17134d);
        O0(zzabVar.f17134d, true);
        O6(new Q1(this, new zzab(zzabVar)));
    }

    final void w6(zzat zzatVar, zzp zzpVar) {
        if (!this.f16802d.Z().u(zzpVar.f17168d)) {
            V0(zzatVar, zzpVar);
            return;
        }
        this.f16802d.b().v().b("EES config found for", zzpVar.f17168d);
        H1 h1Z = this.f16802d.Z();
        String str = zzpVar.f17168d;
        E6.b();
        C1858e0 c1858e0D = null;
        if (h1Z.f16818a.z().B(null, Y0.f16649v0) && !TextUtils.isEmpty(str)) {
            c1858e0D = h1Z.f16316i.d(str);
        }
        if (c1858e0D == null) {
            this.f16802d.b().v().b("EES not loaded for", zzpVar.f17168d);
            V0(zzatVar, zzpVar);
            return;
        }
        try {
            Map<String, Object> mapK = this.f16802d.f0().K(zzatVar.f17143e.o(), true);
            String strA = W3.n.a(zzatVar.f17142d);
            if (strA == null) {
                strA = zzatVar.f17142d;
            }
            if (c1858e0D.e(new C1833b(strA, zzatVar.f17145v, mapK))) {
                if (c1858e0D.g()) {
                    this.f16802d.b().v().b("EES edited event", zzatVar.f17142d);
                    V0(this.f16802d.f0().B(c1858e0D.a().b()), zzpVar);
                } else {
                    V0(zzatVar, zzpVar);
                }
                if (c1858e0D.f()) {
                    for (C1833b c1833b : c1858e0D.a().c()) {
                        this.f16802d.b().v().b("EES logging created event", c1833b.d());
                        V0(this.f16802d.f0().B(c1833b), zzpVar);
                    }
                    return;
                }
                return;
            }
        } catch (C2017y0 unused) {
            this.f16802d.b().r().c("EES error. appId, eventName", zzpVar.f17169e, zzatVar.f17142d);
        }
        this.f16802d.b().v().b("EES was not applied to event", zzatVar.f17142d);
        V0(zzatVar, zzpVar);
    }

    @Override
    public final List<zzkv> y1(String str, String str2, String str3, boolean z7) {
        O0(str, true);
        try {
            List<g4> list = (List) this.f16802d.a().s(new T1(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (g4 g4Var : list) {
                if (z7 || !i4.V(g4Var.f16809c)) {
                    arrayList.add(new zzkv(g4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f16802d.b().r().c("Failed to get user properties as. appId", C2234j1.z(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f16802d.b().r().c("Failed to get user properties as. appId", C2234j1.z(str), e);
            return Collections.emptyList();
        }
    }

    @Override
    public final List<zzab> z2(String str, String str2, String str3) {
        O0(str, true);
        try {
            return (List) this.f16802d.a().s(new V1(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f16802d.b().r().b("Failed to get conditional user properties as", e7);
            return Collections.emptyList();
        }
    }
}
