package B;

import B.A;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import z.T;

final class C0268d extends A.a {

    private final M.B<byte[]> f217a;

    private final T.g f218b;

    C0268d(M.B<byte[]> b2, T.g gVar) {
        if (b2 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f217a = b2;
        if (gVar == null) {
            throw new NullPointerException(KwdswzaUHE.rzKXfq);
        }
        this.f218b = gVar;
    }

    @Override
    T.g a() {
        return this.f218b;
    }

    @Override
    M.B<byte[]> b() {
        return this.f217a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A.a)) {
            return false;
        }
        A.a aVar = (A.a) obj;
        return this.f217a.equals(aVar.b()) && this.f218b.equals(aVar.a());
    }

    public int hashCode() {
        return ((this.f217a.hashCode() ^ 1000003) * 1000003) ^ this.f218b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f217a + ", outputFileOptions=" + this.f218b + "}";
    }
}
