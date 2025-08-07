package com.google.mlkit.vision.barcode.internal;

import O3.B9;
import O3.C0596d7;
import O3.C0600e0;
import O3.C0620f9;
import O3.C0642h9;
import O3.C0828y9;
import O3.EnumC0609e9;
import O3.InterfaceC0708n9;
import O3.InterfaceC0817x9;
import O3.L6;
import O3.M6;
import O3.N6;
import O3.O6;
import O3.Y6;
import O3.Z6;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o5.C2692i;
import q5.C2735b;

public final class b {

    private static final SparseArray f19242a;

    private static final SparseArray f19243b;

    static final AtomicReference f19244c;

    private static final Map f19245d;

    static {
        SparseArray sparseArray = new SparseArray();
        f19242a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f19243b = sparseArray2;
        f19244c = new AtomicReference();
        sparseArray.put(-1, Y6.FORMAT_UNKNOWN);
        sparseArray.put(1, Y6.FORMAT_CODE_128);
        sparseArray.put(2, Y6.f3355v);
        sparseArray.put(4, Y6.FORMAT_CODE_93);
        sparseArray.put(8, Y6.FORMAT_CODABAR);
        sparseArray.put(16, Y6.FORMAT_DATA_MATRIX);
        sparseArray.put(32, Y6.FORMAT_EAN_13);
        sparseArray.put(64, Y6.FORMAT_EAN_8);
        sparseArray.put(128, Y6.FORMAT_ITF);
        sparseArray.put(256, Y6.FORMAT_QR_CODE);
        sparseArray.put(512, Y6.FORMAT_UPC_A);
        sparseArray.put(1024, Y6.f3349F);
        sparseArray.put(2048, Y6.FORMAT_PDF417);
        sparseArray.put(4096, Y6.FORMAT_AZTEC);
        sparseArray2.put(0, Z6.TYPE_UNKNOWN);
        sparseArray2.put(1, Z6.TYPE_CONTACT_INFO);
        sparseArray2.put(2, Z6.TYPE_EMAIL);
        sparseArray2.put(3, Z6.TYPE_ISBN);
        sparseArray2.put(4, Z6.TYPE_PHONE);
        sparseArray2.put(5, Z6.TYPE_PRODUCT);
        sparseArray2.put(6, Z6.TYPE_SMS);
        sparseArray2.put(7, Z6.TYPE_TEXT);
        sparseArray2.put(8, Z6.TYPE_URL);
        sparseArray2.put(9, Z6.TYPE_WIFI);
        sparseArray2.put(10, Z6.TYPE_GEO);
        sparseArray2.put(11, Z6.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, Z6.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f19245d = map;
        map.put(1, EnumC0609e9.CODE_128);
        map.put(2, EnumC0609e9.CODE_39);
        map.put(4, EnumC0609e9.f3447w);
        map.put(8, EnumC0609e9.CODABAR);
        map.put(16, EnumC0609e9.DATA_MATRIX);
        map.put(32, EnumC0609e9.EAN_13);
        map.put(64, EnumC0609e9.EAN_8);
        map.put(128, EnumC0609e9.ITF);
        map.put(256, EnumC0609e9.QR_CODE);
        map.put(512, EnumC0609e9.UPC_A);
        map.put(1024, EnumC0609e9.UPC_E);
        map.put(2048, EnumC0609e9.PDF417);
        map.put(4096, EnumC0609e9.AZTEC);
    }

    public static Y6 a(int i7) {
        Y6 y62 = (Y6) f19242a.get(i7);
        return y62 == null ? Y6.FORMAT_UNKNOWN : y62;
    }

    public static Z6 b(int i7) {
        Z6 z62 = (Z6) f19243b.get(i7);
        return z62 == null ? Z6.TYPE_UNKNOWN : z62;
    }

    public static C0642h9 c(C2735b c2735b) {
        int iA = c2735b.a();
        C0600e0 c0600e0 = new C0600e0();
        if (iA == 0) {
            c0600e0.f(f19245d.values());
        } else {
            for (Map.Entry entry : f19245d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    c0600e0.e((EnumC0609e9) entry.getValue());
                }
            }
        }
        C0620f9 c0620f9 = new C0620f9();
        c0620f9.b(c0600e0.g());
        return c0620f9.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static void e(C0828y9 c0828y9, final M6 m62) {
        c0828y9.f(new InterfaceC0817x9() {
            @Override
            public final InterfaceC0708n9 zza() {
                O6 o62 = new O6();
                L6 l62 = b.f() ? L6.TYPE_THICK : L6.TYPE_THIN;
                M6 m63 = m62;
                o62.e(l62);
                C0596d7 c0596d7 = new C0596d7();
                c0596d7.b(m63);
                o62.h(c0596d7.c());
                return B9.e(o62);
            }
        }, N6.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f19244c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zC = k.c(C2692i.c().b());
        atomicReference.set(Boolean.valueOf(zC));
        return zC;
    }
}
