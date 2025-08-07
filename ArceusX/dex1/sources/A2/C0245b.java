package A2;

final class C0245b extends AbstractC0254k {

    private final long f56a;

    private final s2.o f57b;

    private final s2.i f58c;

    C0245b(long j7, s2.o oVar, s2.i iVar) {
        this.f56a = j7;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f57b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f58c = iVar;
    }

    @Override
    public s2.i b() {
        return this.f58c;
    }

    @Override
    public long c() {
        return this.f56a;
    }

    @Override
    public s2.o d() {
        return this.f57b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0254k)) {
            return false;
        }
        AbstractC0254k abstractC0254k = (AbstractC0254k) obj;
        return this.f56a == abstractC0254k.c() && this.f57b.equals(abstractC0254k.d()) && this.f58c.equals(abstractC0254k.b());
    }

    public int hashCode() {
        long j7 = this.f56a;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f57b.hashCode()) * 1000003) ^ this.f58c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f56a + ", transportContext=" + this.f57b + ", event=" + this.f58c + "}";
    }
}
