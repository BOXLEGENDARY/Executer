package com.google.android.gms.internal.measurement;

public final class EnumC1943o5 {

    public static final EnumC1943o5 f15222A;

    public static final EnumC1943o5 f15223B;

    public static final EnumC1943o5 f15224C;

    public static final EnumC1943o5 f15225D;

    public static final EnumC1943o5 f15226E;

    public static final EnumC1943o5 f15227F;

    public static final EnumC1943o5 f15228G;

    public static final EnumC1943o5 f15229H;

    public static final EnumC1943o5 f15230I;

    public static final EnumC1943o5 f15231J;

    public static final EnumC1943o5 f15232K;

    public static final EnumC1943o5 f15233L;

    private static final EnumC1943o5[] f15234M;

    public static final EnumC1943o5 f15235e;

    public static final EnumC1943o5 f15236i;

    public static final EnumC1943o5 f15237v;

    public static final EnumC1943o5 f15238w;

    public static final EnumC1943o5 f15239y;

    public static final EnumC1943o5 f15240z;

    private final EnumC1951p5 f15241d;

    static {
        EnumC1943o5 enumC1943o5 = new EnumC1943o5("DOUBLE", 0, EnumC1951p5.DOUBLE, 1);
        f15235e = enumC1943o5;
        EnumC1943o5 enumC1943o52 = new EnumC1943o5("FLOAT", 1, EnumC1951p5.FLOAT, 5);
        f15236i = enumC1943o52;
        EnumC1951p5 enumC1951p5 = EnumC1951p5.LONG;
        EnumC1943o5 enumC1943o53 = new EnumC1943o5("INT64", 2, enumC1951p5, 0);
        f15237v = enumC1943o53;
        EnumC1943o5 enumC1943o54 = new EnumC1943o5("UINT64", 3, enumC1951p5, 0);
        f15238w = enumC1943o54;
        EnumC1951p5 enumC1951p52 = EnumC1951p5.INT;
        EnumC1943o5 enumC1943o55 = new EnumC1943o5("INT32", 4, enumC1951p52, 0);
        f15239y = enumC1943o55;
        EnumC1943o5 enumC1943o56 = new EnumC1943o5("FIXED64", 5, enumC1951p5, 1);
        f15240z = enumC1943o56;
        EnumC1943o5 enumC1943o57 = new EnumC1943o5("FIXED32", 6, enumC1951p52, 5);
        f15222A = enumC1943o57;
        EnumC1943o5 enumC1943o58 = new EnumC1943o5("BOOL", 7, EnumC1951p5.BOOLEAN, 0);
        f15223B = enumC1943o58;
        EnumC1943o5 enumC1943o59 = new EnumC1943o5("STRING", 8, EnumC1951p5.STRING, 2);
        f15224C = enumC1943o59;
        EnumC1951p5 enumC1951p53 = EnumC1951p5.MESSAGE;
        EnumC1943o5 enumC1943o510 = new EnumC1943o5("GROUP", 9, enumC1951p53, 3);
        f15225D = enumC1943o510;
        EnumC1943o5 enumC1943o511 = new EnumC1943o5("MESSAGE", 10, enumC1951p53, 2);
        f15226E = enumC1943o511;
        EnumC1943o5 enumC1943o512 = new EnumC1943o5("BYTES", 11, EnumC1951p5.BYTE_STRING, 2);
        f15227F = enumC1943o512;
        EnumC1943o5 enumC1943o513 = new EnumC1943o5("UINT32", 12, enumC1951p52, 0);
        f15228G = enumC1943o513;
        EnumC1943o5 enumC1943o514 = new EnumC1943o5("ENUM", 13, EnumC1951p5.ENUM, 0);
        f15229H = enumC1943o514;
        EnumC1943o5 enumC1943o515 = new EnumC1943o5("SFIXED32", 14, enumC1951p52, 5);
        f15230I = enumC1943o515;
        EnumC1943o5 enumC1943o516 = new EnumC1943o5("SFIXED64", 15, enumC1951p5, 1);
        f15231J = enumC1943o516;
        EnumC1943o5 enumC1943o517 = new EnumC1943o5("SINT32", 16, enumC1951p52, 0);
        f15232K = enumC1943o517;
        EnumC1943o5 enumC1943o518 = new EnumC1943o5("SINT64", 17, enumC1951p5, 0);
        f15233L = enumC1943o518;
        f15234M = new EnumC1943o5[]{enumC1943o5, enumC1943o52, enumC1943o53, enumC1943o54, enumC1943o55, enumC1943o56, enumC1943o57, enumC1943o58, enumC1943o59, enumC1943o510, enumC1943o511, enumC1943o512, enumC1943o513, enumC1943o514, enumC1943o515, enumC1943o516, enumC1943o517, enumC1943o518};
    }

    private EnumC1943o5(String str, int i7, EnumC1951p5 enumC1951p5, int i8) {
        this.f15241d = enumC1951p5;
    }

    public static EnumC1943o5[] values() {
        return (EnumC1943o5[]) f15234M.clone();
    }

    public final EnumC1951p5 c() {
        return this.f15241d;
    }
}
