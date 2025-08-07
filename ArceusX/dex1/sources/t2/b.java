package t2;

import t2.g;

final class b extends g {

    private final g.a f23794a;

    private final long f23795b;

    b(g.a aVar, long j7) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f23794a = aVar;
        this.f23795b = j7;
    }

    @Override
    public long b() {
        return this.f23795b;
    }

    @Override
    public g.a c() {
        return this.f23794a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f23794a.equals(gVar.c()) && this.f23795b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f23794a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f23795b;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f23794a + ", nextRequestWaitMillis=" + this.f23795b + "}";
    }
}
