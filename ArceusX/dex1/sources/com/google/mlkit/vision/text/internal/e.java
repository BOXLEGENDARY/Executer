package com.google.mlkit.vision.text.internal;

import S3.C1440r9;
import S3.F6;
import S3.G9;
import S3.I9;
import S3.K9;
import S3.L9;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import f6.ck.ZJZXBWla;
import k5.C2518a;
import n3.C2651i;
import u5.C2938a;
import v5.C2947b;
import v5.C2949d;
import y3.BinderC3024b;
import z5.C3082a;

final class e implements k {

    private final Context f19346a;

    private final z5.d f19347b;

    private boolean f19348c;

    private boolean f19349d;

    private final C1440r9 f19350e;

    private I9 f19351f;

    e(Context context, z5.d dVar, C1440r9 c1440r9) {
        this.f19346a = context;
        this.f19347b = dVar;
        this.f19350e = c1440r9;
    }

    private static zzvh c(z5.d dVar, String str) {
        int i7 = 1;
        boolean z7 = (dVar instanceof A5.c) && ((A5.c) dVar).zza();
        String strE = dVar.e();
        String strF = dVar.f();
        switch (dVar.d()) {
            case 1:
                i7 = 2;
                break;
            case 2:
                i7 = 3;
                break;
            case 3:
                i7 = 4;
                break;
            case 4:
                i7 = 5;
                break;
            case 5:
                i7 = 6;
                break;
            case 6:
                i7 = 7;
                break;
            case 7:
                i7 = 8;
                break;
            case 8:
                i7 = 9;
                break;
        }
        return new zzvh(strE, strF, str, true, i7 - 1, dVar.b(), z7);
    }

    @Override
    public final void a() {
        I9 i9 = this.f19351f;
        if (i9 != null) {
            try {
                i9.c();
            } catch (RemoteException e7) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.f19347b.c())), e7);
            }
            this.f19351f = null;
        }
        this.f19348c = false;
    }

    @Override
    public final C3082a b(C2938a c2938a) throws C2518a {
        if (this.f19351f == null) {
            zzb();
        }
        I9 i9 = (I9) C2651i.l(this.f19351f);
        if (!this.f19348c) {
            try {
                i9.b();
                this.f19348c = true;
            } catch (RemoteException e7) {
                throw new C2518a("Failed to init text recognizer ".concat(String.valueOf(this.f19347b.c())), 13, e7);
            }
        }
        try {
            return new C3082a(i9.h3(C2949d.b().a(c2938a), new zzuq(c2938a.h(), c2938a.m(), c2938a.i(), C2947b.a(c2938a.l()), SystemClock.elapsedRealtime())), c2938a.g());
        } catch (RemoteException e8) {
            throw new C2518a("Failed to run text recognizer ".concat(String.valueOf(this.f19347b.c())), 13, e8);
        }
    }

    @Override
    public final void zzb() throws C2518a {
        I9 i9B0;
        if (this.f19351f != null) {
            return;
        }
        try {
            z5.d dVar = this.f19347b;
            boolean z7 = dVar instanceof A5.b;
            String strZza = z7 ? ((A5.b) dVar).zza() : null;
            if (this.f19347b.g()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                i9B0 = K9.E0(DynamiteModule.e(this.f19346a, DynamiteModule.f14420c, this.f19347b.i()).d("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).J3(BinderC3024b.h3(this.f19346a), c(this.f19347b, strZza));
            } else if (z7) {
                Log.d("DecoupledTextDelegate", "Start loading custom OCR module.");
                i9B0 = G9.E0(DynamiteModule.e(this.f19346a, DynamiteModule.f14419b, this.f19347b.i()).d("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).F3(BinderC3024b.h3(this.f19346a), null, c(this.f19347b, strZza));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                L9 l9E0 = K9.E0(DynamiteModule.e(this.f19346a, DynamiteModule.f14419b, this.f19347b.i()).d("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                i9B0 = this.f19347b.d() == 1 ? l9E0.b0(BinderC3024b.h3(this.f19346a)) : l9E0.J3(BinderC3024b.h3(this.f19346a), c(this.f19347b, strZza));
            }
            this.f19351f = i9B0;
            a.b(this.f19350e, this.f19347b.g(), F6.NO_ERROR);
        } catch (RemoteException e7) {
            a.b(this.f19350e, this.f19347b.g(), F6.OPTIONAL_MODULE_INIT_ERROR);
            throw new C2518a("Failed to create text recognizer ".concat(String.valueOf(this.f19347b.c())), 13, e7);
        } catch (DynamiteModule.a e8) {
            a.b(this.f19350e, this.f19347b.g(), F6.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (this.f19347b.g()) {
                throw new C2518a(String.format(ZJZXBWla.bCW, this.f19347b.c(), e8.getMessage()), 13, e8);
            }
            if (!this.f19349d) {
                o5.m.e(this.f19346a, b.a(this.f19347b));
                this.f19349d = true;
            }
            throw new C2518a("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }
}
