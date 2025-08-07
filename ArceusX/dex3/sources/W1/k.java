package W1;

import android.graphics.PointF;

public class k implements c {
    private final String a;
    private final V1.m<PointF, PointF> b;
    private final V1.m<PointF, PointF> c;
    private final V1.b d;
    private final boolean e;

    public k(String str, V1.m<PointF, PointF> mVar, V1.m<PointF, PointF> mVar2, V1.b bVar, boolean z) {
        this.a = str;
        this.b = mVar;
        this.c = mVar2;
        this.d = bVar;
        this.e = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.o(aVar, bVar, this);
    }

    public V1.b b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public V1.m<PointF, PointF> d() {
        return this.b;
    }

    public V1.m<PointF, PointF> e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
