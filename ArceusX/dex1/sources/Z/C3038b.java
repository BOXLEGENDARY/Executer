package z;

import z.AbstractC3062q;

final class C3038b extends AbstractC3062q {

    private final AbstractC3062q.b f24609a;

    private final AbstractC3062q.a f24610b;

    C3038b(AbstractC3062q.b bVar, AbstractC3062q.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f24609a = bVar;
        this.f24610b = aVar;
    }

    @Override
    public AbstractC3062q.a c() {
        return this.f24610b;
    }

    @Override
    public AbstractC3062q.b d() {
        return this.f24609a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3062q)) {
            return false;
        }
        AbstractC3062q abstractC3062q = (AbstractC3062q) obj;
        if (this.f24609a.equals(abstractC3062q.d())) {
            AbstractC3062q.a aVar = this.f24610b;
            if (aVar == null) {
                if (abstractC3062q.c() == null) {
                    return true;
                }
            } else if (aVar.equals(abstractC3062q.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f24609a.hashCode() ^ 1000003) * 1000003;
        AbstractC3062q.a aVar = this.f24610b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f24609a + ", error=" + this.f24610b + "}";
    }
}
