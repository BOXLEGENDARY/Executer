package W1;

public class p implements c {
    private final String a;
    private final int b;
    private final V1.h c;
    private final boolean d;

    public p(String str, int i, V1.h hVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = hVar;
        this.d = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.q(aVar, bVar, this);
    }

    public String b() {
        return this.a;
    }

    public V1.h c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.b + '}';
    }
}
