package W1;

import android.graphics.Path;

public class e implements c {
    private final g a;
    private final Path.FillType b;
    private final V1.c c;
    private final V1.d d;
    private final V1.f e;
    private final V1.f f;
    private final String g;
    private final V1.b h;
    private final V1.b i;
    private final boolean j;

    public e(String str, g gVar, Path.FillType fillType, V1.c cVar, V1.d dVar, V1.f fVar, V1.f fVar2, V1.b bVar, V1.b bVar2, boolean z) {
        this.a = gVar;
        this.b = fillType;
        this.c = cVar;
        this.d = dVar;
        this.e = fVar;
        this.f = fVar2;
        this.g = str;
        this.h = bVar;
        this.i = bVar2;
        this.j = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.h(aVar, bVar, this);
    }

    public V1.f b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public V1.c d() {
        return this.c;
    }

    public g e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public V1.d g() {
        return this.d;
    }

    public V1.f h() {
        return this.e;
    }

    public boolean i() {
        return this.j;
    }
}
