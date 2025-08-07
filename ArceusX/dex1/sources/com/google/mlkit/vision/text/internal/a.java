package com.google.mlkit.vision.text.internal;

import S3.C1319g8;
import S3.C1440r9;
import S3.C1473u9;
import S3.E6;
import S3.EnumC1407o8;
import S3.F6;
import S3.G6;
import S3.H6;
import S3.InterfaceC1309f9;
import S3.InterfaceC1430q9;

public final class a {
    static EnumC1407o8 a(int i7) {
        switch (i7) {
            case 1:
                return EnumC1407o8.LATIN;
            case 2:
                return EnumC1407o8.LATIN_AND_CHINESE;
            case 3:
                return EnumC1407o8.LATIN_AND_DEVANAGARI;
            case 4:
                return EnumC1407o8.LATIN_AND_JAPANESE;
            case 5:
                return EnumC1407o8.LATIN_AND_KOREAN;
            case 6:
                return EnumC1407o8.CREDIT_CARD;
            case 7:
                return EnumC1407o8.f7057B;
            case 8:
                return EnumC1407o8.PIXEL_AI;
            default:
                return EnumC1407o8.TYPE_UNKNOWN;
        }
    }

    static void b(C1440r9 c1440r9, final boolean z7, final F6 f62) {
        c1440r9.f(new InterfaceC1430q9() {
            @Override
            public final InterfaceC1309f9 zza() {
                H6 h62 = new H6();
                E6 e62 = z7 ? E6.TYPE_THICK : E6.TYPE_THIN;
                F6 f63 = f62;
                h62.e(e62);
                C1319g8 c1319g8 = new C1319g8();
                c1319g8.b(f63);
                h62.g(c1319g8.c());
                return C1473u9.e(h62);
            }
        }, G6.ON_DEVICE_TEXT_LOAD);
    }
}
