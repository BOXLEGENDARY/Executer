package com.google.mlkit.vision.face.internal;

import R3.A4;
import R3.C1130n6;
import R3.E6;
import R3.G6;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k5.C2518a;
import o5.m;
import u5.C2938a;
import v5.C2947b;
import v5.C2948c;
import v5.C2949d;
import w5.C2972a;
import w5.C2976e;
import y3.BinderC3024b;

final class a implements b {

    private final Context f19304a;

    private final C2976e f19305b;

    private boolean f19306c;

    private boolean f19307d;

    private boolean f19308e;

    private final C1130n6 f19309f;

    private E6 f19310g;

    private E6 f19311h;

    a(Context context, C2976e c2976e, C1130n6 c1130n6) {
        this.f19304a = context;
        this.f19305b = c2976e;
        this.f19309f = c1130n6;
    }

    static boolean a(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.face") > 0;
    }

    private final void e() throws DynamiteModule.a, RemoteException {
        if (this.f19305b.c() != 2) {
            if (this.f19311h == null) {
                this.f19311h = f(new zzou(this.f19305b.e(), this.f19305b.d(), this.f19305b.b(), 1, this.f19305b.g(), this.f19305b.a()));
                return;
            }
            return;
        }
        if (this.f19310g == null) {
            this.f19310g = f(new zzou(this.f19305b.e(), 1, 1, 2, false, this.f19305b.a()));
        }
        if ((this.f19305b.d() == 2 || this.f19305b.b() == 2 || this.f19305b.e() == 2) && this.f19311h == null) {
            this.f19311h = f(new zzou(this.f19305b.e(), this.f19305b.d(), this.f19305b.b(), 1, this.f19305b.g(), this.f19305b.a()));
        }
    }

    private final E6 f(zzou zzouVar) throws DynamiteModule.a, RemoteException {
        return this.f19307d ? c(DynamiteModule.f14420c, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zzouVar) : c(DynamiteModule.f14419b, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zzouVar);
    }

    private static List g(E6 e62, C2938a c2938a) throws C2518a {
        if (c2938a.h() == -1) {
            c2938a = C2938a.b(C2948c.f().d(c2938a, false), c2938a.m(), c2938a.i(), c2938a.l(), 17);
        }
        try {
            List listH3 = e62.h3(C2949d.b().a(c2938a), new zzoq(c2938a.h(), c2938a.m(), c2938a.i(), C2947b.a(c2938a.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listH3.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2972a((zzow) it.next(), c2938a.g()));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new C2518a("Failed to run face detector.", 13, e7);
        }
    }

    @Override
    public final Pair b(C2938a c2938a) throws C2518a {
        List listG;
        if (this.f19311h == null && this.f19310g == null) {
            d();
        }
        if (!this.f19306c) {
            try {
                E6 e62 = this.f19311h;
                if (e62 != null) {
                    e62.b();
                }
                E6 e63 = this.f19310g;
                if (e63 != null) {
                    e63.b();
                }
                this.f19306c = true;
            } catch (RemoteException e7) {
                throw new C2518a("Failed to init face detector.", 13, e7);
            }
        }
        E6 e64 = this.f19311h;
        List listG2 = null;
        if (e64 != null) {
            listG = g(e64, c2938a);
            if (!this.f19305b.g()) {
                g.m(listG);
            }
        } else {
            listG = null;
        }
        E6 e65 = this.f19310g;
        if (e65 != null) {
            listG2 = g(e65, c2938a);
            g.m(listG2);
        }
        return new Pair(listG, listG2);
    }

    final E6 c(DynamiteModule.b bVar, String str, String str2, zzou zzouVar) throws DynamiteModule.a, RemoteException {
        return G6.E0(DynamiteModule.e(this.f19304a, bVar, str).d(str2)).n4(BinderC3024b.h3(this.f19304a), zzouVar);
    }

    @Override
    public final boolean d() throws C2518a {
        if (this.f19311h != null || this.f19310g != null) {
            return this.f19307d;
        }
        if (DynamiteModule.a(this.f19304a, "com.google.mlkit.dynamite.face") > 0) {
            this.f19307d = true;
            try {
                e();
            } catch (RemoteException e7) {
                throw new C2518a("Failed to create thick face detector.", 13, e7);
            } catch (DynamiteModule.a e8) {
                throw new C2518a("Failed to load the bundled face module.", 13, e8);
            }
        } else {
            this.f19307d = false;
            try {
                e();
            } catch (RemoteException e9) {
                h.c(this.f19309f, this.f19307d, A4.OPTIONAL_MODULE_INIT_ERROR);
                throw new C2518a("Failed to create thin face detector.", 13, e9);
            } catch (DynamiteModule.a e10) {
                if (!this.f19308e) {
                    m.c(this.f19304a, "face");
                    this.f19308e = true;
                }
                h.c(this.f19309f, this.f19307d, A4.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C2518a("Waiting for the face module to be downloaded. Please wait.", 14, e10);
            }
        }
        h.c(this.f19309f, this.f19307d, A4.NO_ERROR);
        return this.f19307d;
    }

    @Override
    public final void zzb() {
        try {
            E6 e62 = this.f19311h;
            if (e62 != null) {
                e62.c();
                this.f19311h = null;
            }
            E6 e63 = this.f19310g;
            if (e63 != null) {
                e63.c();
                this.f19310g = null;
            }
        } catch (RemoteException e7) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e7);
        }
        this.f19306c = false;
    }
}
