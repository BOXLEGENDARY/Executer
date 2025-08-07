package s;

import s.O1;

final class C2804e extends O1.b {

    private final int f23319a;

    private final int f23320b;

    private final boolean f23321c;

    private final boolean f23322d;

    C2804e(int i7, int i8, boolean z7, boolean z8) {
        this.f23319a = i7;
        this.f23320b = i8;
        this.f23321c = z7;
        this.f23322d = z8;
    }

    @Override
    int a() {
        return this.f23319a;
    }

    @Override
    int b() {
        return this.f23320b;
    }

    @Override
    boolean c() {
        return this.f23321c;
    }

    @Override
    boolean d() {
        return this.f23322d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O1.b)) {
            return false;
        }
        O1.b bVar = (O1.b) obj;
        return this.f23319a == bVar.a() && this.f23320b == bVar.b() && this.f23321c == bVar.c() && this.f23322d == bVar.d();
    }

    public int hashCode() {
        return ((((((this.f23319a ^ 1000003) * 1000003) ^ this.f23320b) * 1000003) ^ (this.f23321c ? 1231 : 1237)) * 1000003) ^ (this.f23322d ? 1231 : 1237);
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f23319a + ", requiredMaxBitDepth=" + this.f23320b + ", previewStabilizationOn=" + this.f23321c + ", ultraHdrOn=" + this.f23322d + "}";
    }
}
