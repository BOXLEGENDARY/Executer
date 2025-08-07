package H;

final class b extends g {

    private final float f1477a;

    private final float f1478b;

    private final float f1479c;

    private final float f1480d;

    b(float f7, float f8, float f9, float f10) {
        this.f1477a = f7;
        this.f1478b = f8;
        this.f1479c = f9;
        this.f1480d = f10;
    }

    @Override
    public float a() {
        return this.f1478b;
    }

    @Override
    public float b() {
        return this.f1479c;
    }

    @Override
    public float c() {
        return this.f1477a;
    }

    @Override
    public float d() {
        return this.f1480d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.floatToIntBits(this.f1477a) == Float.floatToIntBits(gVar.c()) && Float.floatToIntBits(this.f1478b) == Float.floatToIntBits(gVar.a()) && Float.floatToIntBits(this.f1479c) == Float.floatToIntBits(gVar.b()) && Float.floatToIntBits(this.f1480d) == Float.floatToIntBits(gVar.d());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f1477a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f1478b)) * 1000003) ^ Float.floatToIntBits(this.f1479c)) * 1000003) ^ Float.floatToIntBits(this.f1480d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f1477a + ", maxZoomRatio=" + this.f1478b + ", minZoomRatio=" + this.f1479c + ", linearZoom=" + this.f1480d + "}";
    }
}
