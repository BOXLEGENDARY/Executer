package com.google.android.play.core.integrity;

import H4.C0433f;
import H4.C0437j;
import H4.P;
import a4.C1574k;
import a4.C1576m;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;

final class C2328k {

    private final H4.U f18858a;

    private final String f18859b;

    private final Context f18860c;

    private final r f18861d;

    private final Y f18862e;

    final C0433f f18863f;

    C2328k(Context context, H4.U u7, r rVar, Y y7) {
        this.f18859b = context.getPackageName();
        this.f18858a = u7;
        this.f18861d = rVar;
        this.f18862e = y7;
        this.f18860c = context;
        if (C0437j.b(context)) {
            this.f18863f = new C0433f(context, u7, "IntegrityService", C2329l.f18864a, new H4.b0() {
                @Override
                public final Object a(IBinder iBinder) {
                    return P.O0(iBinder);
                }
            }, null);
        } else {
            u7.a("Phonesky is not installed.", new Object[0]);
            this.f18863f = null;
        }
    }

    static Bundle a(C2328k c2328k, byte[] bArr, Long l7, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c2328k.f18859b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt(jUbDmI.LMmDnjoI, 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l7 != null) {
            bundle.putLong("cloud.prj", l7.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        H4.G.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(H4.G.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f18863f == null) {
            return C1576m.e(new C2318a(-2, null));
        }
        if (C0437j.a(this.f18860c) < 82380000) {
            return C1576m.e(new C2318a(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof C2332o) {
            }
            this.f18858a.c("requestIntegrityToken(%s)", integrityTokenRequest);
            C1574k c1574k = new C1574k();
            this.f18863f.t(new C2325h(this, c1574k, bArrDecode, lA, null, c1574k, integrityTokenRequest), c1574k);
            return c1574k.a();
        } catch (IllegalArgumentException e7) {
            return C1576m.e(new C2318a(-13, e7));
        }
    }
}
