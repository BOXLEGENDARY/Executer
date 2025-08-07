package B;

import B.O;

final class C0270f extends O.b {

    private final P f227a;

    private final androidx.camera.core.n f228b;

    C0270f(P p7, androidx.camera.core.n nVar) {
        if (p7 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f227a = p7;
        if (nVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f228b = nVar;
    }

    @Override
    androidx.camera.core.n a() {
        return this.f228b;
    }

    @Override
    P b() {
        return this.f227a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.b)) {
            return false;
        }
        O.b bVar = (O.b) obj;
        return this.f227a.equals(bVar.b()) && this.f228b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f227a.hashCode() ^ 1000003) * 1000003) ^ this.f228b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f227a + ", imageProxy=" + this.f228b + "}";
    }
}
