package W1;

import android.graphics.PointF;

public class j implements c {
    private final String a;
    private final a b;
    private final V1.b c;
    private final V1.m<PointF, PointF> d;
    private final V1.b e;
    private final V1.b f;
    private final V1.b g;
    private final V1.b h;
    private final V1.b i;
    private final boolean j;

    public enum a {
        STAR(1),
        POLYGON(2);

        private final int d;

        a(int i) {
            this.d = i;
        }

        public static a c(int i) {
            for (a aVar : values()) {
                if (aVar.d == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, V1.b bVar, V1.m<PointF, PointF> mVar, V1.b bVar2, V1.b bVar3, V1.b bVar4, V1.b bVar5, V1.b bVar6, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = bVar;
        this.d = mVar;
        this.e = bVar2;
        this.f = bVar3;
        this.g = bVar4;
        this.h = bVar5;
        this.i = bVar6;
        this.j = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.n(aVar, bVar, this);
    }

    public V1.b b() {
        return this.f;
    }

    public V1.b c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public V1.b e() {
        return this.g;
    }

    public V1.b f() {
        return this.i;
    }

    public V1.b g() {
        return this.c;
    }

    public V1.m<PointF, PointF> h() {
        return this.d;
    }

    public V1.b i() {
        return this.e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }
}
