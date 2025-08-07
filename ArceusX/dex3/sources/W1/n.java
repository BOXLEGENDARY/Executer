package W1;

import android.graphics.Path;

public class n implements c {
    private final boolean a;
    private final Path.FillType b;
    private final String c;
    private final V1.a d;
    private final V1.d e;
    private final boolean f;

    public n(String str, boolean z, Path.FillType fillType, V1.a aVar, V1.d dVar, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = aVar;
        this.e = dVar;
        this.f = z2;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.g(aVar, bVar, this);
    }

    public V1.a b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public V1.d e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
