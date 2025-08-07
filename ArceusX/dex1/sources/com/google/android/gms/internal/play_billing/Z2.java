package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;

public final class Z2 {

    public static final Z2 f15967A;

    public static final Z2 f15968B;

    public static final Z2 f15969C;

    public static final Z2 f15970D;

    private static final Z2[] f15971E;

    public static final Z2 f15972e;

    public static final Z2 f15973i;

    public static final Z2 f15974v;

    public static final Z2 f15975w;

    public static final Z2 f15976y;

    public static final Z2 f15977z;

    private final Class f15978d;

    static {
        Z2 z22 = new Z2("VOID", 0, Void.class, Void.class, null);
        f15972e = z22;
        Class cls = Integer.TYPE;
        Z2 z23 = new Z2("INT", 1, cls, Integer.class, 0);
        f15973i = z23;
        Z2 z24 = new Z2("LONG", 2, Long.TYPE, Long.class, 0L);
        f15974v = z24;
        Z2 z25 = new Z2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f15975w = z25;
        Z2 z26 = new Z2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f15976y = z26;
        Z2 z27 = new Z2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f15977z = z27;
        Z2 z28 = new Z2("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        f15967A = z28;
        Z2 z29 = new Z2("BYTE_STRING", 7, AbstractC2131q2.class, AbstractC2131q2.class, AbstractC2131q2.f16138e);
        f15968B = z29;
        Z2 z210 = new Z2("ENUM", 8, cls, Integer.class, null);
        f15969C = z210;
        Z2 z211 = new Z2("MESSAGE", 9, Object.class, Object.class, null);
        f15970D = z211;
        f15971E = new Z2[]{z22, z23, z24, z25, z26, z27, z28, z29, z210, z211};
    }

    private Z2(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f15978d = cls2;
    }

    public static Z2[] values() {
        return (Z2[]) f15971E.clone();
    }

    public final Class c() {
        return this.f15978d;
    }
}
