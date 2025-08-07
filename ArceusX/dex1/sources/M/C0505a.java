package M;

import M.C0523t;
import androidx.concurrent.futures.c;

final class C0505a extends C0523t.b {

    private final int f2258a;

    private final int f2259b;

    private final c.a<Void> f2260c;

    C0505a(int i7, int i8, c.a<Void> aVar) {
        this.f2258a = i7;
        this.f2259b = i8;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f2260c = aVar;
    }

    @Override
    c.a<Void> a() {
        return this.f2260c;
    }

    @Override
    int b() {
        return this.f2258a;
    }

    @Override
    int c() {
        return this.f2259b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0523t.b)) {
            return false;
        }
        C0523t.b bVar = (C0523t.b) obj;
        return this.f2258a == bVar.b() && this.f2259b == bVar.c() && this.f2260c.equals(bVar.a());
    }

    public int hashCode() {
        return ((((this.f2258a ^ 1000003) * 1000003) ^ this.f2259b) * 1000003) ^ this.f2260c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f2258a + ", rotationDegrees=" + this.f2259b + ", completer=" + this.f2260c + "}";
    }
}
