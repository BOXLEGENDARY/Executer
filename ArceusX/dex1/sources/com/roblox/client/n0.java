package com.roblox.client;

import com.github.luben.zstd.BuildConfig;
import ha.C2704j;
import ha.InterfaceC2706l;
import org.json.JSONException;

public class n0 {

    private static n0 f20128g;

    private long f20130b;

    private final h7.u f20131c;

    d f20129a = new d();

    private e f20132d = e.UnKnown;

    private String f20133e = BuildConfig.FLAVOR;

    private String f20134f = BuildConfig.FLAVOR;

    class a implements InterfaceC2706l {

        final c f20135a;

        a(c cVar) {
            this.f20135a = cVar;
        }

        @Override
        public void a(C2704j c2704j) throws JSONException {
            n0.this.c(c2704j);
            c cVar = this.f20135a;
            if (cVar != null) {
                cVar.a(n0.this.f20129a);
            }
        }

        @Override
        public void b(C2704j c2704j) {
        }
    }

    public static abstract class b implements c {
        @Override
        public void b(d dVar) {
        }
    }

    public interface c {
        void a(d dVar);

        void b(d dVar);
    }

    public static class d {

        public e f20137a = e.UnKnown;

        public String f20138b;

        public String f20139c;

        public boolean a() {
            return this.f20137a == e.NewAppRequired;
        }

        public boolean b() {
            return this.f20137a == e.Recommended;
        }

        public boolean c() {
            return this.f20137a == e.Required;
        }

        public void d() {
            this.f20137a = e.Recommended;
        }

        public void e() {
            this.f20137a = e.Required;
        }

        public void f() {
            this.f20137a = e.NotRequired;
        }
    }

    public enum e {
        UnKnown,
        Recommended,
        Required,
        NotRequired,
        NewAppRequired
    }

    n0(h7.u uVar) {
        this.f20131c = uVar;
    }

    public void c(ha.C2704j r7) throws org.json.JSONException {
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.n0.c(o6.j):void");
    }

    public static n0 e() {
        if (f20128g == null) {
            synchronized (n0.class) {
                try {
                    if (f20128g == null) {
                        f20128g = new n0(new h7.v());
                    }
                } finally {
                }
            }
        }
        return f20128g;
    }

    public void b(com.roblox.client.n0.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.n0.b(com.roblox.client.n0$c):void");
    }

    public d d() {
        return this.f20129a;
    }

    public boolean f() {
        e eVar = this.f20132d;
        e eVar2 = e.Required;
        boolean z7 = eVar == eVar2;
        boolean z8 = this.f20129a.f20137a == eVar2;
        h7.l.i("UpgradeCheckHelper", "isUpgradeRequired: [" + z7 + ", " + z8 + "]");
        return z7 || z8;
    }

    public void g(d dVar) {
        h7.l.g("UpgradeCheckHelper", "Set upgrade-status (from Init) = " + dVar.f20137a);
        this.f20132d = dVar.f20137a;
        this.f20133e = dVar.f20138b;
        this.f20134f = dVar.f20139c;
    }
}
