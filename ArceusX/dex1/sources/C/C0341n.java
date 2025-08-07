package C;

import C.e1;

final class C0341n extends e1 {

    private final e1.b f643a;

    private final e1.a f644b;

    private final long f645c;

    C0341n(e1.b bVar, e1.a aVar, long j7) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f643a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f644b = aVar;
        this.f645c = j7;
    }

    @Override
    public e1.a c() {
        return this.f644b;
    }

    @Override
    public e1.b d() {
        return this.f643a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f643a.equals(e1Var.d()) && this.f644b.equals(e1Var.c()) && this.f645c == e1Var.f();
    }

    @Override
    public long f() {
        return this.f645c;
    }

    public int hashCode() {
        int iHashCode = (((this.f643a.hashCode() ^ 1000003) * 1000003) ^ this.f644b.hashCode()) * 1000003;
        long j7 = this.f645c;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f643a + ", configSize=" + this.f644b + ", streamUseCase=" + this.f645c + "}";
    }
}
