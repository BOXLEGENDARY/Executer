package W1;

public class h {
    private final a a;
    private final V1.h b;
    private final V1.d c;
    private final boolean d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public h(a aVar, V1.h hVar, V1.d dVar, boolean z) {
        this.a = aVar;
        this.b = hVar;
        this.c = dVar;
        this.d = z;
    }

    public a a() {
        return this.a;
    }

    public V1.h b() {
        return this.b;
    }

    public V1.d c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
