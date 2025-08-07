package com.google.mlkit.vision.text.internal;

import S3.F2;
import S3.H3;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import k5.C2518a;
import n3.C2651i;
import u5.C2938a;
import v5.C2947b;
import v5.C2948c;
import y3.BinderC3024b;
import z5.C3082a;

final class f implements k {

    private final Context f19352a;

    private final zzp f19353b = new zzp(null);

    private boolean f19354c;

    private F2 f19355d;

    f(Context context) {
        this.f19352a = context;
    }

    @Override
    public final void a() {
        F2 f22 = this.f19355d;
        if (f22 != null) {
            try {
                f22.d();
            } catch (RemoteException e7) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e7);
            }
            this.f19355d = null;
        }
    }

    @Override
    public final C3082a b(C2938a c2938a) throws C2518a {
        Bitmap bitmapE;
        int iA;
        if (this.f19355d == null) {
            zzb();
        }
        if (this.f19355d == null) {
            throw new C2518a("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        if (c2938a.h() == -1) {
            bitmapE = c2938a.e();
            iA = C2947b.a(c2938a.l());
        } else {
            bitmapE = C2948c.f().e(c2938a);
            iA = 0;
        }
        int i7 = iA;
        try {
            return j.a(((F2) C2651i.l(this.f19355d)).h3(BinderC3024b.h3(bitmapE), new zzd(c2938a.m(), c2938a.i(), 0, 0L, i7)), c2938a.g());
        } catch (RemoteException e7) {
            throw new C2518a("Failed to run legacy text recognizer.", 13, e7);
        }
    }

    @Override
    public final void zzb() throws C2518a {
        if (this.f19355d != null) {
            return;
        }
        try {
            F2 f22 = H3.E0(DynamiteModule.e(this.f19352a, DynamiteModule.f14419b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).f2(BinderC3024b.h3(this.f19352a), this.f19353b);
            this.f19355d = f22;
            if (f22 != null || this.f19354c) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            o5.m.c(this.f19352a, "ocr");
            this.f19354c = true;
        } catch (RemoteException e7) {
            throw new C2518a("Failed to create legacy text recognizer.", 13, e7);
        } catch (DynamiteModule.a e8) {
            throw new C2518a("Failed to load deprecated vision dynamite module.", 13, e8);
        }
    }
}
