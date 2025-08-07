package X;

final class C1533d extends j0 {

    private final int f7842e;

    private final int f7843f;

    private final int f7844g;

    C1533d(int i7, int i8, int i9) {
        this.f7842e = i7;
        this.f7843f = i8;
        this.f7844g = i9;
    }

    @Override
    public int b() {
        return this.f7844g;
    }

    @Override
    public int c() {
        return this.f7842e;
    }

    @Override
    public int d() {
        return this.f7843f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f7842e == j0Var.c() && this.f7843f == j0Var.d() && this.f7844g == j0Var.b();
    }

    public int hashCode() {
        return ((((this.f7842e ^ 1000003) * 1000003) ^ this.f7843f) * 1000003) ^ this.f7844g;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f7842e + ", transfer=" + this.f7843f + ", range=" + this.f7844g + "}";
    }
}
