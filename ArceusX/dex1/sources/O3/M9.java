package O3;

final class M9 extends O9 {

    private final float f2998a;

    private final float f2999b;

    private final float f3000c;

    private final float f3001d;

    M9(float f7, float f8, float f9, float f10, float f11) {
        this.f2998a = f7;
        this.f2999b = f8;
        this.f3000c = f9;
        this.f3001d = f10;
    }

    @Override
    final float a() {
        return 0.0f;
    }

    @Override
    final float b() {
        return this.f3000c;
    }

    @Override
    final float c() {
        return this.f2998a;
    }

    @Override
    final float d() {
        return this.f3001d;
    }

    @Override
    final float e() {
        return this.f2999b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O9) {
            O9 o9 = (O9) obj;
            if (Float.floatToIntBits(this.f2998a) == Float.floatToIntBits(o9.c()) && Float.floatToIntBits(this.f2999b) == Float.floatToIntBits(o9.e()) && Float.floatToIntBits(this.f3000c) == Float.floatToIntBits(o9.b()) && Float.floatToIntBits(this.f3001d) == Float.floatToIntBits(o9.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                o9.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f2998a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f2999b)) * 1000003) ^ Float.floatToIntBits(this.f3000c)) * 1000003) ^ Float.floatToIntBits(this.f3001d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f2998a + ", yMin=" + this.f2999b + ", xMax=" + this.f3000c + ", yMax=" + this.f3001d + ", confidenceScore=0.0}";
    }
}
