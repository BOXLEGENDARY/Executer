package W1;

import android.graphics.PointF;

public class b implements c {
    private final String a;
    private final V1.m<PointF, PointF> b;
    private final V1.f c;
    private final boolean d;
    private final boolean e;

    public b(String str, V1.m<PointF, PointF> mVar, V1.f fVar, boolean z, boolean z2) {
        this.a = str;
        this.b = mVar;
        this.c = fVar;
        this.d = z;
        this.e = z2;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.f(aVar, bVar, this);
    }

    public String b() {
        return this.a;
    }

    public V1.m<PointF, PointF> c() {
        return this.b;
    }

    public V1.f d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
