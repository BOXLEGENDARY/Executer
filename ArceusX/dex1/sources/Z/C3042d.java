package z;

import C.g1;
import android.graphics.Matrix;

final class C3042d extends AbstractC3037a0 {

    private final g1 f24624a;

    private final long f24625b;

    private final int f24626c;

    private final Matrix f24627d;

    C3042d(g1 g1Var, long j7, int i7, Matrix matrix) {
        if (g1Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f24624a = g1Var;
        this.f24625b = j7;
        this.f24626c = i7;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f24627d = matrix;
    }

    @Override
    public g1 b() {
        return this.f24624a;
    }

    @Override
    public int c() {
        return this.f24626c;
    }

    @Override
    public long d() {
        return this.f24625b;
    }

    @Override
    public Matrix e() {
        return this.f24627d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3037a0)) {
            return false;
        }
        AbstractC3037a0 abstractC3037a0 = (AbstractC3037a0) obj;
        return this.f24624a.equals(abstractC3037a0.b()) && this.f24625b == abstractC3037a0.d() && this.f24626c == abstractC3037a0.c() && this.f24627d.equals(abstractC3037a0.e());
    }

    public int hashCode() {
        int iHashCode = (this.f24624a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f24625b;
        return ((((iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ this.f24626c) * 1000003) ^ this.f24627d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f24624a + ", timestamp=" + this.f24625b + ", rotationDegrees=" + this.f24626c + ", sensorToBufferTransformMatrix=" + this.f24627d + "}";
    }
}
