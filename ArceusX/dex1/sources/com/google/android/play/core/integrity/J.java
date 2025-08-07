package com.google.android.play.core.integrity;

import H4.C0433f;
import H4.K;
import a4.C1574k;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.InterfaceC2320c;
import java.util.ArrayList;

final class J {

    private final H4.U f18797a;

    private final String f18798b;

    private final C1574k f18799c;

    private final r f18800d;

    private final Y f18801e;

    final C0433f f18802f;

    J(Context context, H4.U u7, r rVar, Y y7) {
        C1574k c1574k = new C1574k();
        this.f18799c = c1574k;
        this.f18798b = context.getPackageName();
        this.f18797a = u7;
        this.f18800d = rVar;
        this.f18801e = y7;
        C0433f c0433f = new C0433f(context, u7, "ExpressIntegrityService", K.f18803a, new H4.b0() {
            @Override
            public final Object a(IBinder iBinder) {
                return K.O0(iBinder);
            }
        }, null);
        this.f18802f = c0433f;
        c0433f.c().post(new B(this, c1574k, context));
    }

    static Bundle a(J j7, InterfaceC2320c.d dVar, long j8, long j9, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", j7.f18798b);
        bundle.putLong("cloud.prj", j8);
        bundle.putString("nonce", dVar.b());
        bundle.putLong("warm.up.sid", j9);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(dVar.c()));
        ArrayList arrayList = new ArrayList();
        H4.G.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(H4.G.a(arrayList)));
        return bundle;
    }

    static Bundle b(J j7, long j8, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", j7.f18798b);
        bundle.putLong("cloud.prj", j8);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        H4.G.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(H4.G.a(arrayList)));
        return bundle;
    }

    static boolean i(J j7, int i7) {
        return j7.f18799c.a().o() && ((Integer) j7.f18799c.a().k()).intValue() < 83420000;
    }

    static boolean j(J j7) {
        return j7.f18799c.a().o() && ((Integer) j7.f18799c.a().k()).intValue() == 0;
    }

    public final Task c(InterfaceC2320c.d dVar, long j7, long j8, int i7) {
        this.f18797a.c("requestExpressIntegrityToken(%s)", Long.valueOf(j8));
        C1574k c1574k = new C1574k();
        this.f18802f.t(new D(this, c1574k, 0, dVar, j7, j8, c1574k), c1574k);
        return c1574k.a();
    }

    public final Task d(long j7, int i7) {
        this.f18797a.c("warmUpIntegrityToken(%s)", Long.valueOf(j7));
        C1574k c1574k = new C1574k();
        this.f18802f.t(new C(this, c1574k, 0, j7, c1574k), c1574k);
        return c1574k.a();
    }
}
