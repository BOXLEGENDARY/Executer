package w5;

import R3.O6;
import R3.P6;
import java.util.concurrent.Executor;
import n3.C2649g;

public class C2976e {

    private final int f24287a;

    private final int f24288b;

    private final int f24289c;

    private final int f24290d;

    private final boolean f24291e;

    private final float f24292f;

    private final Executor f24293g;

    public static class a {

        private int f24294a = 1;

        private int f24295b = 1;

        private int f24296c = 1;

        private int f24297d = 1;

        private boolean f24298e = false;

        private float f24299f = 0.1f;

        private Executor f24300g;

        public C2976e a() {
            return new C2976e(this.f24294a, this.f24295b, this.f24296c, this.f24297d, this.f24298e, this.f24299f, this.f24300g, null);
        }

        public a b(int i7) {
            this.f24294a = i7;
            return this;
        }

        public a c(float f7) {
            this.f24299f = f7;
            return this;
        }
    }

    C2976e(int i7, int i8, int i9, int i10, boolean z7, float f7, Executor executor, C2978g c2978g) {
        this.f24287a = i7;
        this.f24288b = i8;
        this.f24289c = i9;
        this.f24290d = i10;
        this.f24291e = z7;
        this.f24292f = f7;
        this.f24293g = executor;
    }

    public final float a() {
        return this.f24292f;
    }

    public final int b() {
        return this.f24289c;
    }

    public final int c() {
        return this.f24288b;
    }

    public final int d() {
        return this.f24287a;
    }

    public final int e() {
        return this.f24290d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2976e)) {
            return false;
        }
        C2976e c2976e = (C2976e) obj;
        return Float.floatToIntBits(this.f24292f) == Float.floatToIntBits(c2976e.f24292f) && C2649g.b(Integer.valueOf(this.f24287a), Integer.valueOf(c2976e.f24287a)) && C2649g.b(Integer.valueOf(this.f24288b), Integer.valueOf(c2976e.f24288b)) && C2649g.b(Integer.valueOf(this.f24290d), Integer.valueOf(c2976e.f24290d)) && C2649g.b(Boolean.valueOf(this.f24291e), Boolean.valueOf(c2976e.f24291e)) && C2649g.b(Integer.valueOf(this.f24289c), Integer.valueOf(c2976e.f24289c)) && C2649g.b(this.f24293g, c2976e.f24293g);
    }

    public final Executor f() {
        return this.f24293g;
    }

    public final boolean g() {
        return this.f24291e;
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(Float.floatToIntBits(this.f24292f)), Integer.valueOf(this.f24287a), Integer.valueOf(this.f24288b), Integer.valueOf(this.f24290d), Boolean.valueOf(this.f24291e), Integer.valueOf(this.f24289c), this.f24293g);
    }

    public String toString() {
        O6 o6A = P6.a("FaceDetectorOptions");
        o6A.b("landmarkMode", this.f24287a);
        o6A.b("contourMode", this.f24288b);
        o6A.b("classificationMode", this.f24289c);
        o6A.b("performanceMode", this.f24290d);
        o6A.d("trackingEnabled", this.f24291e);
        o6A.a("minFaceSize", this.f24292f);
        return o6A.toString();
    }
}
