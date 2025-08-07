package z;

import Y3.qE.KpBmp;
import w7.Jld.EZYiRMRTxKdo;

public final class C3070z {

    public static final C3070z f24772c = new C3070z(0, 0);

    public static final C3070z f24773d = new C3070z(1, 8);

    public static final C3070z f24774e = new C3070z(2, 10);

    public static final C3070z f24775f = new C3070z(3, 10);

    public static final C3070z f24776g = new C3070z(4, 10);

    public static final C3070z f24777h = new C3070z(5, 10);

    public static final C3070z f24778i = new C3070z(6, 10);

    public static final C3070z f24779j = new C3070z(6, 8);

    private final int f24780a;

    private final int f24781b;

    public C3070z(int i7, int i8) {
        this.f24780a = i7;
        this.f24781b = i8;
    }

    private static String c(int i7) {
        switch (i7) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return KpBmp.sBNnYZlasGhIZS;
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f24781b;
    }

    public int b() {
        return this.f24780a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3070z)) {
            return false;
        }
        C3070z c3070z = (C3070z) obj;
        return this.f24780a == c3070z.b() && this.f24781b == c3070z.a();
    }

    public int hashCode() {
        return ((this.f24780a ^ 1000003) * 1000003) ^ this.f24781b;
    }

    public String toString() {
        return EZYiRMRTxKdo.CGIx + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f24780a) + ", bitDepth=" + this.f24781b + "}";
    }
}
