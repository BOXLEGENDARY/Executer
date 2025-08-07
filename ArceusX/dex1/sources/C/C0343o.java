package C;

import android.util.Size;
import java.util.Map;

final class C0343o extends f1 {

    private final Size f655a;

    private final Map<Integer, Size> f656b;

    private final Size f657c;

    private final Map<Integer, Size> f658d;

    private final Size f659e;

    private final Map<Integer, Size> f660f;

    private final Map<Integer, Size> f661g;

    C0343o(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f655a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f656b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f657c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f658d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f659e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f660f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f661g = map4;
    }

    @Override
    public Size b() {
        return this.f655a;
    }

    @Override
    public Map<Integer, Size> d() {
        return this.f660f;
    }

    @Override
    public Size e() {
        return this.f657c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f655a.equals(f1Var.b()) && this.f656b.equals(f1Var.j()) && this.f657c.equals(f1Var.e()) && this.f658d.equals(f1Var.h()) && this.f659e.equals(f1Var.f()) && this.f660f.equals(f1Var.d()) && this.f661g.equals(f1Var.l());
    }

    @Override
    public Size f() {
        return this.f659e;
    }

    @Override
    public Map<Integer, Size> h() {
        return this.f658d;
    }

    public int hashCode() {
        return ((((((((((((this.f655a.hashCode() ^ 1000003) * 1000003) ^ this.f656b.hashCode()) * 1000003) ^ this.f657c.hashCode()) * 1000003) ^ this.f658d.hashCode()) * 1000003) ^ this.f659e.hashCode()) * 1000003) ^ this.f660f.hashCode()) * 1000003) ^ this.f661g.hashCode();
    }

    @Override
    public Map<Integer, Size> j() {
        return this.f656b;
    }

    @Override
    public Map<Integer, Size> l() {
        return this.f661g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f655a + ", s720pSizeMap=" + this.f656b + ", previewSize=" + this.f657c + ", s1440pSizeMap=" + this.f658d + ", recordSize=" + this.f659e + ", maximumSizeMap=" + this.f660f + ", ultraMaximumSizeMap=" + this.f661g + "}";
    }
}
