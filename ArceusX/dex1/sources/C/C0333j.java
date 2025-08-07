package C;

final class C0333j extends L0 {

    private final K0 f611a;

    private final K0 f612b;

    private final K0 f613c;

    private final K0 f614d;

    C0333j(K0 k02, K0 k03, K0 k04, K0 k05) {
        if (k02 == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f611a = k02;
        if (k03 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f612b = k03;
        this.f613c = k04;
        this.f614d = k05;
    }

    @Override
    public K0 b() {
        return this.f613c;
    }

    @Override
    public K0 c() {
        return this.f612b;
    }

    @Override
    public K0 d() {
        return this.f614d;
    }

    @Override
    public K0 e() {
        return this.f611a;
    }

    public boolean equals(Object obj) {
        K0 k02;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (this.f611a.equals(l02.e()) && this.f612b.equals(l02.c()) && ((k02 = this.f613c) != null ? k02.equals(l02.b()) : l02.b() == null)) {
            K0 k03 = this.f614d;
            if (k03 == null) {
                if (l02.d() == null) {
                    return true;
                }
            } else if (k03.equals(l02.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f611a.hashCode() ^ 1000003) * 1000003) ^ this.f612b.hashCode()) * 1000003;
        K0 k02 = this.f613c;
        int iHashCode2 = (iHashCode ^ (k02 == null ? 0 : k02.hashCode())) * 1000003;
        K0 k03 = this.f614d;
        return iHashCode2 ^ (k03 != null ? k03.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f611a + ", imageCaptureOutputSurface=" + this.f612b + ", imageAnalysisOutputSurface=" + this.f613c + ", postviewOutputSurface=" + this.f614d + "}";
    }
}
