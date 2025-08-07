package W1;

import R1.s;

public class r implements c {
    private final String a;
    private final a b;
    private final V1.b c;
    private final V1.b d;
    private final V1.b e;
    private final boolean f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a c(int i2) {
            if (i2 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i2 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i2);
        }
    }

    public r(String str, a aVar, V1.b bVar, V1.b bVar2, V1.b bVar3, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = bVar3;
        this.f = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new s(bVar, this);
    }

    public V1.b b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public V1.b d() {
        return this.e;
    }

    public V1.b e() {
        return this.c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
