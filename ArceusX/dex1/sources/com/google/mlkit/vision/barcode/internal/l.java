package com.google.mlkit.vision.barcode.internal;

import O3.AbstractBinderC0676l;
import O3.C0654j;
import O3.C0828y9;
import O3.M6;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import java.util.ArrayList;
import java.util.List;
import k5.C2518a;
import n3.C2651i;
import o5.m;
import q5.C2735b;
import r5.C2756a;
import t2.Dbl.hgESaf;
import u5.C2938a;
import v5.C2947b;
import v5.C2948c;
import y3.BinderC3024b;

final class l implements j {

    private boolean f19276a;

    private final Context f19277b;

    private final zzah f19278c;

    private final C0828y9 f19279d;

    private C0654j f19280e;

    l(Context context, C2735b c2735b, C0828y9 c0828y9) {
        zzah zzahVar = new zzah();
        this.f19278c = zzahVar;
        this.f19277b = context;
        zzahVar.f15396d = c2735b.a();
        this.f19279d = c0828y9;
    }

    @Override
    public final boolean a() throws C2518a {
        if (this.f19280e != null) {
            return false;
        }
        try {
            C0654j c0654jS3 = AbstractBinderC0676l.E0(DynamiteModule.e(this.f19277b, DynamiteModule.f14419b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).s3(BinderC3024b.h3(this.f19277b), this.f19278c);
            this.f19280e = c0654jS3;
            if (c0654jS3 == null && !this.f19276a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                m.c(this.f19277b, "barcode");
                this.f19276a = true;
                b.e(this.f19279d, M6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C2518a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f19279d, M6.NO_ERROR);
            return false;
        } catch (RemoteException e7) {
            throw new C2518a("Failed to create legacy barcode detector.", 13, e7);
        } catch (DynamiteModule.a e8) {
            throw new C2518a("Failed to load deprecated vision dynamite module.", 13, e8);
        }
    }

    @Override
    public final List b(C2938a c2938a) throws C2518a {
        zzu[] zzuVarArrN3;
        if (this.f19280e == null) {
            a();
        }
        C0654j c0654j = this.f19280e;
        if (c0654j == null) {
            throw new C2518a(hgESaf.OsvtZpHv, 14);
        }
        C0654j c0654j2 = (C0654j) C2651i.l(c0654j);
        zzan zzanVar = new zzan(c2938a.m(), c2938a.i(), 0, 0L, C2947b.a(c2938a.l()));
        try {
            int iH = c2938a.h();
            if (iH == -1) {
                zzuVarArrN3 = c0654j2.n3(BinderC3024b.h3(c2938a.e()), zzanVar);
            } else if (iH == 17) {
                zzuVarArrN3 = c0654j2.h3(BinderC3024b.h3(c2938a.f()), zzanVar);
            } else if (iH == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) C2651i.l(c2938a.k());
                zzanVar.f15398d = planeArr[0].getRowStride();
                zzuVarArrN3 = c0654j2.h3(BinderC3024b.h3(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (iH != 842094169) {
                    throw new C2518a("Unsupported image format: " + c2938a.h(), 3);
                }
                zzuVarArrN3 = c0654j2.h3(BinderC3024b.h3(C2948c.f().d(c2938a, false)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrN3) {
                arrayList.add(new C2756a(new t5.c(zzuVar), c2938a.g()));
            }
            return arrayList;
        } catch (RemoteException e7) {
            throw new C2518a("Failed to detect with legacy barcode detector", 13, e7);
        }
    }

    @Override
    public final void zzb() {
        C0654j c0654j = this.f19280e;
        if (c0654j != null) {
            try {
                c0654j.d();
            } catch (RemoteException e7) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e7);
            }
            this.f19280e = null;
        }
    }
}
