package com.google.android.gms.internal.play_billing;

public final class EnumC2055d4 {

    public static final EnumC2055d4 f16005A;

    public static final EnumC2055d4 f16006B;

    public static final EnumC2055d4 f16007C;

    public static final EnumC2055d4 f16008D;

    public static final EnumC2055d4 f16009E;

    public static final EnumC2055d4 f16010F;

    public static final EnumC2055d4 f16011G;

    public static final EnumC2055d4 f16012H;

    public static final EnumC2055d4 f16013I;

    public static final EnumC2055d4 f16014J;

    public static final EnumC2055d4 f16015K;

    public static final EnumC2055d4 f16016L;

    private static final EnumC2055d4[] f16017M;

    public static final EnumC2055d4 f16018e;

    public static final EnumC2055d4 f16019i;

    public static final EnumC2055d4 f16020v;

    public static final EnumC2055d4 f16021w;

    public static final EnumC2055d4 f16022y;

    public static final EnumC2055d4 f16023z;

    private final EnumC2061e4 f16024d;

    static {
        EnumC2055d4 enumC2055d4 = new EnumC2055d4("DOUBLE", 0, EnumC2061e4.DOUBLE, 1);
        f16018e = enumC2055d4;
        EnumC2055d4 enumC2055d42 = new EnumC2055d4("FLOAT", 1, EnumC2061e4.FLOAT, 5);
        f16019i = enumC2055d42;
        EnumC2061e4 enumC2061e4 = EnumC2061e4.f16041e;
        EnumC2055d4 enumC2055d43 = new EnumC2055d4("INT64", 2, enumC2061e4, 0);
        f16020v = enumC2055d43;
        EnumC2055d4 enumC2055d44 = new EnumC2055d4("UINT64", 3, enumC2061e4, 0);
        f16021w = enumC2055d44;
        EnumC2061e4 enumC2061e42 = EnumC2061e4.INT;
        EnumC2055d4 enumC2055d45 = new EnumC2055d4("INT32", 4, enumC2061e42, 0);
        f16022y = enumC2055d45;
        EnumC2055d4 enumC2055d46 = new EnumC2055d4("FIXED64", 5, enumC2061e4, 1);
        f16023z = enumC2055d46;
        EnumC2055d4 enumC2055d47 = new EnumC2055d4("FIXED32", 6, enumC2061e42, 5);
        f16005A = enumC2055d47;
        EnumC2055d4 enumC2055d48 = new EnumC2055d4("BOOL", 7, EnumC2061e4.BOOLEAN, 0);
        f16006B = enumC2055d48;
        EnumC2055d4 enumC2055d49 = new EnumC2055d4("STRING", 8, EnumC2061e4.f16045y, 2);
        f16007C = enumC2055d49;
        EnumC2061e4 enumC2061e43 = EnumC2061e4.MESSAGE;
        EnumC2055d4 enumC2055d410 = new EnumC2055d4("GROUP", 9, enumC2061e43, 3);
        f16008D = enumC2055d410;
        EnumC2055d4 enumC2055d411 = new EnumC2055d4("MESSAGE", 10, enumC2061e43, 2);
        f16009E = enumC2055d411;
        EnumC2055d4 enumC2055d412 = new EnumC2055d4("BYTES", 11, EnumC2061e4.BYTE_STRING, 2);
        f16010F = enumC2055d412;
        EnumC2055d4 enumC2055d413 = new EnumC2055d4("UINT32", 12, enumC2061e42, 0);
        f16011G = enumC2055d413;
        EnumC2055d4 enumC2055d414 = new EnumC2055d4("ENUM", 13, EnumC2061e4.ENUM, 0);
        f16012H = enumC2055d414;
        EnumC2055d4 enumC2055d415 = new EnumC2055d4("SFIXED32", 14, enumC2061e42, 5);
        f16013I = enumC2055d415;
        EnumC2055d4 enumC2055d416 = new EnumC2055d4("SFIXED64", 15, enumC2061e4, 1);
        f16014J = enumC2055d416;
        EnumC2055d4 enumC2055d417 = new EnumC2055d4("SINT32", 16, enumC2061e42, 0);
        f16015K = enumC2055d417;
        EnumC2055d4 enumC2055d418 = new EnumC2055d4("SINT64", 17, enumC2061e4, 0);
        f16016L = enumC2055d418;
        f16017M = new EnumC2055d4[]{enumC2055d4, enumC2055d42, enumC2055d43, enumC2055d44, enumC2055d45, enumC2055d46, enumC2055d47, enumC2055d48, enumC2055d49, enumC2055d410, enumC2055d411, enumC2055d412, enumC2055d413, enumC2055d414, enumC2055d415, enumC2055d416, enumC2055d417, enumC2055d418};
    }

    private EnumC2055d4(String str, int i7, EnumC2061e4 enumC2061e4, int i8) {
        this.f16024d = enumC2061e4;
    }

    public static EnumC2055d4[] values() {
        return (EnumC2055d4[]) f16017M.clone();
    }

    public final EnumC2061e4 c() {
        return this.f16024d;
    }
}
