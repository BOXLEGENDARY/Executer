package com.google.mlkit.vision.face.internal;

import R3.A4;
import R3.C1130n6;
import R3.G3;
import R3.I4;
import R3.InterfaceC1097j5;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.C1819d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import java.util.List;
import k5.C2518a;
import o5.m;
import u5.C2938a;
import w5.C2976e;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

final class j implements b {

    private boolean f19332a;

    private final Context f19333b;

    private final C2976e f19334c;

    private final int f19335d;

    private final C1130n6 f19336e;

    private G3 f19337f;

    private G3 f19338g;

    j(Context context, C2976e c2976e, C1130n6 c1130n6) {
        this.f19333b = context;
        this.f19334c = c2976e;
        this.f19335d = C1819d.f().a(context);
        this.f19336e = c1130n6;
    }

    static int a(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid classification type: " + i7);
    }

    static int c(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid landmark type: " + i7);
    }

    private static int e(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid mode type: " + i7);
    }

    private final java.util.List f(R3.G3 r15, u5.C2938a r16) throws k5.C2518a {
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.j.f(R3.G3, u5.a):java.util.List");
    }

    @Override
    public final Pair b(C2938a c2938a) throws C2518a {
        List listF;
        if (this.f19337f == null && this.f19338g == null) {
            d();
        }
        G3 g32 = this.f19337f;
        if (g32 == null && this.f19338g == null) {
            throw new C2518a("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List listF2 = null;
        if (g32 != null) {
            listF = f(g32, c2938a);
            if (!this.f19334c.g()) {
                g.m(listF);
            }
        } else {
            listF = null;
        }
        G3 g33 = this.f19338g;
        if (g33 != null) {
            listF2 = f(g33, c2938a);
            g.m(listF2);
        }
        return new Pair(listF, listF2);
    }

    @Override
    public final boolean d() throws C2518a {
        if (this.f19337f != null || this.f19338g != null) {
            return false;
        }
        try {
            InterfaceC1097j5 interfaceC1097j5E0 = I4.E0(DynamiteModule.e(this.f19333b, DynamiteModule.f14419b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            InterfaceC3023a interfaceC3023aH3 = BinderC3024b.h3(this.f19333b);
            if (this.f19334c.c() == 2) {
                if (this.f19338g == null) {
                    this.f19338g = interfaceC1097j5E0.o5(interfaceC3023aH3, new zzh(2, 2, 0, true, false, this.f19334c.a()));
                }
                if ((this.f19334c.d() == 2 || this.f19334c.b() == 2 || this.f19334c.e() == 2) && this.f19337f == null) {
                    this.f19337f = interfaceC1097j5E0.o5(interfaceC3023aH3, new zzh(e(this.f19334c.e()), c(this.f19334c.d()), a(this.f19334c.b()), false, this.f19334c.g(), this.f19334c.a()));
                }
            } else if (this.f19337f == null) {
                this.f19337f = interfaceC1097j5E0.o5(interfaceC3023aH3, new zzh(e(this.f19334c.e()), c(this.f19334c.d()), a(this.f19334c.b()), false, this.f19334c.g(), this.f19334c.a()));
            }
            if (this.f19337f == null && this.f19338g == null && !this.f19332a) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                m.c(this.f19333b, "barcode");
                this.f19332a = true;
            }
            h.c(this.f19336e, false, A4.NO_ERROR);
            return false;
        } catch (RemoteException e7) {
            throw new C2518a("Failed to create legacy face detector.", 13, e7);
        } catch (DynamiteModule.a e8) {
            throw new C2518a("Failed to load deprecated vision dynamite module.", 13, e8);
        }
    }

    @Override
    public final void zzb() {
        G3 g32 = this.f19337f;
        if (g32 != null) {
            try {
                g32.d();
            } catch (RemoteException e7) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e7);
            }
            this.f19337f = null;
        }
        G3 g33 = this.f19338g;
        if (g33 != null) {
            try {
                g33.d();
            } catch (RemoteException e8) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e8);
            }
            this.f19338g = null;
        }
    }
}
