package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;

public final class EnumC1862e4 {

    public static final EnumC1862e4 f15132A;

    public static final EnumC1862e4 f15133B;

    public static final EnumC1862e4 f15134C;

    public static final EnumC1862e4 f15135D;

    public static final EnumC1862e4 f15136E;

    public static final EnumC1862e4 f15137F;

    private static final EnumC1862e4[] f15138G;

    public static final EnumC1862e4 f15139v;

    public static final EnumC1862e4 f15140w;

    public static final EnumC1862e4 f15141y;

    public static final EnumC1862e4 f15142z;

    private final Class<?> f15143d;

    private final Class<?> f15144e;

    private final Object f15145i;

    static {
        EnumC1862e4 enumC1862e4 = new EnumC1862e4("VOID", 0, Void.class, Void.class, null);
        f15139v = enumC1862e4;
        Class cls = Integer.TYPE;
        EnumC1862e4 enumC1862e42 = new EnumC1862e4("INT", 1, cls, Integer.class, 0);
        f15140w = enumC1862e42;
        EnumC1862e4 enumC1862e43 = new EnumC1862e4("LONG", 2, Long.TYPE, Long.class, 0L);
        f15141y = enumC1862e43;
        EnumC1862e4 enumC1862e44 = new EnumC1862e4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f15142z = enumC1862e44;
        EnumC1862e4 enumC1862e45 = new EnumC1862e4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f15132A = enumC1862e45;
        EnumC1862e4 enumC1862e46 = new EnumC1862e4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f15133B = enumC1862e46;
        EnumC1862e4 enumC1862e47 = new EnumC1862e4("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        f15134C = enumC1862e47;
        EnumC1862e4 enumC1862e48 = new EnumC1862e4("BYTE_STRING", 7, AbstractC1980t3.class, AbstractC1980t3.class, AbstractC1980t3.f15325e);
        f15135D = enumC1862e48;
        EnumC1862e4 enumC1862e49 = new EnumC1862e4("ENUM", 8, cls, Integer.class, null);
        f15136E = enumC1862e49;
        EnumC1862e4 enumC1862e410 = new EnumC1862e4(jUbDmI.zHzNNFYiZM, 9, Object.class, Object.class, null);
        f15137F = enumC1862e410;
        f15138G = new EnumC1862e4[]{enumC1862e4, enumC1862e42, enumC1862e43, enumC1862e44, enumC1862e45, enumC1862e46, enumC1862e47, enumC1862e48, enumC1862e49, enumC1862e410};
    }

    private EnumC1862e4(String str, int i7, Class cls, Class cls2, Object obj) {
        this.f15143d = cls;
        this.f15144e = cls2;
        this.f15145i = obj;
    }

    public static EnumC1862e4[] values() {
        return (EnumC1862e4[]) f15138G.clone();
    }

    public final Class<?> c() {
        return this.f15144e;
    }
}
