package com.roblox.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.game.c;
import com.roblox.client.implementation.AppImplementations;
import l6.C2546b;
import m6.C2593J;
import okhttp3.ResponseBody;
import u6.InterfaceC2940a;

public class C2374w {

    private static C2374w f20261c;

    private final String f20262a = "com.roblox.client.implementation.AppImplementations";

    private Object f20263b;

    private static class a {

        private static final C2593J f20264a = new C2593J();
    }

    private C2374w() {
        try {
            this.f20263b = AppImplementations.class.newInstance();
        } catch (ClassNotFoundException unused) {
            h7.l.k("rbx.main", "Failed to find implementation class");
        } catch (IllegalAccessException | InstantiationException unused2) {
            h7.l.k("rbx.main", "Failed to instantiate implementation");
        }
    }

    public static C2374w h() {
        if (f20261c == null) {
            synchronized (C2374w.class) {
                try {
                    if (f20261c == null) {
                        f20261c = new C2374w();
                    }
                } finally {
                }
            }
        }
        return f20261c;
    }

    public com.roblox.client.game.c a(c.a aVar, c.b bVar) {
        Object obj = this.f20263b;
        if (obj instanceof a7.b) {
            return ((a7.b) obj).a(aVar, bVar);
        }
        h7.l.i("rbx.main", "Using default DataModelNotifications");
        return new com.roblox.client.game.c(aVar, bVar);
    }

    public C2546b b() {
        Object obj = this.f20263b;
        if (obj instanceof a7.d) {
            return ((a7.d) obj).a();
        }
        h7.l.a("rbx.main", "Using default GenericWebFragment");
        return new C2546b();
    }

    public P5.a c(Context context) {
        Object obj = this.f20263b;
        if (obj instanceof P5.b) {
            return ((P5.b) obj).getRtcAudioManager(context);
        }
        h7.l.a("rbx.main", "No AudioRtcManager");
        return null;
    }

    public E6.e d() {
        Object obj = this.f20263b;
        if (obj instanceof a7.a) {
            return ((a7.a) obj).getAppsFlyerManager();
        }
        h7.l.a("rbx.main", "No AppsFlyer");
        return new E6.e();
    }

    public N7.d e() {
        Object obj = this.f20263b;
        return obj instanceof Y5.a ? ((Y5.a) obj).a() : N7.d.t();
    }

    public C2593J f() {
        Object obj = this.f20263b;
        return obj instanceof a7.c ? ((a7.c) obj).a() : a.f20264a;
    }

    public S7.f g() {
        Object obj = this.f20263b;
        return obj instanceof InterfaceC2940a ? ((InterfaceC2940a) obj).getIdentityProtocol() : S7.f.z();
    }

    public Intent i(Context context) {
        Object obj = this.f20263b;
        if (obj instanceof a7.e) {
            return ((a7.e) obj).a(context);
        }
        h7.l.i("rbx.main", "Using default Main class");
        return new Intent(context, (Class<?>) ActivityNativeMain.class);
    }

    public N6.a j(Activity activity) {
        Object obj = this.f20263b;
        if (obj instanceof a7.f) {
            return ((a7.f) obj).a(activity);
        }
        h7.l.a("rbx.main", "Using empty Midas");
        return new N6.a();
    }

    public W7.k k() {
        Object obj = this.f20263b;
        return obj instanceof H6.a ? ((H6.a) obj).getPermissionsProtocol() : W7.l.d0();
    }

    public s7.f l() throws RuntimeException {
        Object obj = this.f20263b;
        if (obj instanceof a7.h) {
            return ((a7.h) obj).a();
        }
        h7.l.i("rbx.main", "Using default Provider");
        return new s7.a();
    }

    public Q6.n m() {
        Object obj = this.f20263b;
        if (obj instanceof a7.i) {
            return ((a7.i) obj).a();
        }
        h7.l.a("rbx.main", "No default push registrar");
        return null;
    }

    public bb.b<ResponseBody> n(x7.c cVar) {
        Object obj = this.f20263b;
        if (obj instanceof a7.g) {
            return ((a7.g) obj).a(cVar);
        }
        h7.l.a("rbx.main", "No default push registration call");
        return null;
    }

    public Intent o(Context context) {
        Object obj = this.f20263b;
        if (obj instanceof a7.j) {
            return ((a7.j) obj).a(context);
        }
        throw new RuntimeException("No StartActivityIntentFactory interface implemented");
    }

    public Y6.a p() {
        Object obj = this.f20263b;
        if (obj instanceof a7.k) {
            return ((a7.k) obj).a();
        }
        h7.l.a("rbx.main", "Using empty TSS");
        return new Y6.a();
    }
}
