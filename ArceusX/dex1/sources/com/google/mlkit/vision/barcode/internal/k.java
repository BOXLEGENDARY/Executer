package com.google.mlkit.vision.barcode.internal;

import O3.AbstractC0633h0;
import O3.C0828y9;
import O3.M6;
import O3.Z9;
import O3.ba;
import O3.ca;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k5.C2518a;
import n3.C2651i;
import o5.m;
import q5.C2735b;
import r5.C2756a;
import t4.gYZ.uCYQMIHsy;
import u5.C2938a;
import v5.C2947b;
import v5.C2949d;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

final class k implements j {

    private static final AbstractC0633h0 f19268h = AbstractC0633h0.n("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    private boolean f19269a;

    private boolean f19270b;

    private boolean f19271c;

    private final Context f19272d;

    private final C2735b f19273e;

    private final C0828y9 f19274f;

    private Z9 f19275g;

    k(Context context, C2735b c2735b, C0828y9 c0828y9) {
        this.f19272d = context;
        this.f19273e = c2735b;
        this.f19274f = c0828y9;
    }

    static boolean c(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override
    public final boolean a() throws C2518a {
        if (this.f19275g != null) {
            return this.f19270b;
        }
        if (c(this.f19272d)) {
            this.f19270b = true;
            try {
                this.f19275g = d(DynamiteModule.f14420c, uCYQMIHsy.NQTk, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e7) {
                throw new C2518a("Failed to create thick barcode scanner.", 13, e7);
            } catch (DynamiteModule.a e8) {
                throw new C2518a("Failed to load the bundled barcode module.", 13, e8);
            }
        } else {
            this.f19270b = false;
            if (!m.a(this.f19272d, f19268h)) {
                if (!this.f19271c) {
                    m.d(this.f19272d, AbstractC0633h0.n("barcode", "tflite_dynamite"));
                    this.f19271c = true;
                }
                b.e(this.f19274f, M6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C2518a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f19275g = d(DynamiteModule.f14419b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.a e9) {
                b.e(this.f19274f, M6.OPTIONAL_MODULE_INIT_ERROR);
                throw new C2518a("Failed to create thin barcode scanner.", 13, e9);
            }
        }
        b.e(this.f19274f, M6.NO_ERROR);
        return this.f19270b;
    }

    @Override
    public final List b(C2938a c2938a) throws C2518a {
        if (this.f19275g == null) {
            a();
        }
        Z9 z9 = (Z9) C2651i.l(this.f19275g);
        if (!this.f19269a) {
            try {
                z9.b();
                this.f19269a = true;
            } catch (RemoteException e7) {
                throw new C2518a("Failed to init barcode scanner.", 13, e7);
            }
        }
        int iM = c2938a.m();
        if (c2938a.h() == 35) {
            iM = ((Image.Plane[]) C2651i.l(c2938a.k()))[0].getRowStride();
        }
        try {
            List listH3 = z9.h3(C2949d.b().a(c2938a), new zzyu(c2938a.h(), iM, c2938a.i(), C2947b.a(c2938a.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listH3.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2756a(new t5.b((zzyb) it.next()), c2938a.g()));
            }
            return arrayList;
        } catch (RemoteException e8) {
            throw new C2518a("Failed to run barcode scanner.", 13, e8);
        }
    }

    final Z9 d(DynamiteModule.b bVar, String str, String str2) throws DynamiteModule.a, RemoteException {
        boolean z7;
        ca caVarE0 = ba.E0(DynamiteModule.e(this.f19272d, bVar, str).d(str2));
        C2735b c2735b = this.f19273e;
        InterfaceC3023a interfaceC3023aH3 = BinderC3024b.h3(this.f19272d);
        int iA = c2735b.a();
        if (c2735b.d()) {
            z7 = true;
        } else {
            this.f19273e.b();
            z7 = false;
        }
        return caVarE0.u2(interfaceC3023aH3, new zzyd(iA, z7));
    }

    @Override
    public final void zzb() {
        Z9 z9 = this.f19275g;
        if (z9 != null) {
            try {
                z9.c();
            } catch (RemoteException e7) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e7);
            }
            this.f19275g = null;
            this.f19269a = false;
        }
    }
}
