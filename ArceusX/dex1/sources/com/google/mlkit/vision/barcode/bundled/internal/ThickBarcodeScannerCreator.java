package com.google.mlkit.vision.barcode.bundled.internal;

import P3.c;
import P3.e;
import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzs;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

public class ThickBarcodeScannerCreator extends e {
    @Override
    public c newBarcodeScanner(InterfaceC3023a interfaceC3023a, zzs zzsVar) {
        return new a((Context) BinderC3024b.V0(interfaceC3023a), zzsVar);
    }
}
