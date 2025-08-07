package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1804d;
import java.util.HashMap;
import java.util.Map;

public final class i {

    private final M3.g<M3.d> f14610a;

    private final Context f14611b;

    private boolean f14612c = false;

    private final Map<C1804d.a<U3.d>, h> f14613d = new HashMap();

    private final Map<C1804d.a, f> f14614e = new HashMap();

    private final Map<C1804d.a<U3.c>, e> f14615f = new HashMap();

    public i(Context context, M3.g<M3.d> gVar) {
        this.f14611b = context;
        this.f14610a = gVar;
    }

    public final void a(boolean z7) throws RemoteException {
        ((l) this.f14610a).f14616a.r();
        ((l) this.f14610a).a().U0(z7);
        this.f14612c = z7;
    }

    public final void b() throws RemoteException {
        synchronized (this.f14613d) {
            try {
                for (h hVar : this.f14613d.values()) {
                    if (hVar != null) {
                        ((l) this.f14610a).a().A1(zzbc.l(hVar, null));
                    }
                }
                this.f14613d.clear();
            } finally {
            }
        }
        synchronized (this.f14615f) {
            try {
                for (e eVar : this.f14615f.values()) {
                    if (eVar != null) {
                        ((l) this.f14610a).a().A1(zzbc.n(eVar, null));
                    }
                }
                this.f14615f.clear();
            } finally {
            }
        }
        synchronized (this.f14614e) {
            try {
                for (f fVar : this.f14614e.values()) {
                    if (fVar != null) {
                        ((l) this.f14610a).a().E3(new zzl(2, null, fVar, null));
                    }
                }
                this.f14614e.clear();
            } finally {
            }
        }
    }

    public final void c() throws RemoteException {
        if (this.f14612c) {
            a(false);
        }
    }
}
