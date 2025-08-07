package N;

final class a extends d {

    private final O.f f2494a;

    private final O.f f2495b;

    a(O.f fVar, O.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f2494a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f2495b = fVar2;
    }

    @Override
    public O.f a() {
        return this.f2494a;
    }

    @Override
    public O.f b() {
        return this.f2495b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2494a.equals(dVar.a()) && this.f2495b.equals(dVar.b());
    }

    public int hashCode() {
        return ((this.f2494a.hashCode() ^ 1000003) * 1000003) ^ this.f2495b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f2494a + ", secondaryOutConfig=" + this.f2495b + "}";
    }
}
