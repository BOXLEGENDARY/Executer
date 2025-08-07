package y2;

public final class g implements u2.b<z2.f> {

    private final O9.a<C2.a> f24441a;

    public g(O9.a<C2.a> aVar) {
        this.f24441a = aVar;
    }

    public static z2.f a(C2.a aVar) {
        return (z2.f) u2.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(O9.a<C2.a> aVar) {
        return new g(aVar);
    }

    public z2.f get() {
        return a((C2.a) this.f24441a.get());
    }
}
