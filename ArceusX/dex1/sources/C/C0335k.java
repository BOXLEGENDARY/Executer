package C;

import C.X0;
import Q6.QtA.QXojhh;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import z.C3070z;

final class C0335k extends X0.f {

    private final AbstractC0324e0 f617a;

    private final List<AbstractC0324e0> f618b;

    private final String f619c;

    private final int f620d;

    private final int f621e;

    private final C3070z f622f;

    static final class b extends X0.f.a {

        private AbstractC0324e0 f623a;

        private List<AbstractC0324e0> f624b;

        private String f625c;

        private Integer f626d;

        private Integer f627e;

        private C3070z f628f;

        b() {
        }

        @Override
        public X0.f a() {
            AbstractC0324e0 abstractC0324e0 = this.f623a;
            String str = BuildConfig.FLAVOR;
            if (abstractC0324e0 == null) {
                str = BuildConfig.FLAVOR + " surface";
            }
            if (this.f624b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f626d == null) {
                str = str + " mirrorMode";
            }
            if (this.f627e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f628f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C0335k(this.f623a, this.f624b, this.f625c, this.f626d.intValue(), this.f627e.intValue(), this.f628f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public X0.f.a b(C3070z c3070z) {
            if (c3070z == null) {
                throw new NullPointerException(QXojhh.EYm);
            }
            this.f628f = c3070z;
            return this;
        }

        @Override
        public X0.f.a c(int i7) {
            this.f626d = Integer.valueOf(i7);
            return this;
        }

        @Override
        public X0.f.a d(String str) {
            this.f625c = str;
            return this;
        }

        @Override
        public X0.f.a e(List<AbstractC0324e0> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f624b = list;
            return this;
        }

        @Override
        public X0.f.a f(int i7) {
            this.f627e = Integer.valueOf(i7);
            return this;
        }

        public X0.f.a g(AbstractC0324e0 abstractC0324e0) {
            if (abstractC0324e0 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f623a = abstractC0324e0;
            return this;
        }
    }

    @Override
    public C3070z b() {
        return this.f622f;
    }

    @Override
    public int c() {
        return this.f620d;
    }

    @Override
    public String d() {
        return this.f619c;
    }

    @Override
    public List<AbstractC0324e0> e() {
        return this.f618b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X0.f)) {
            return false;
        }
        X0.f fVar = (X0.f) obj;
        return this.f617a.equals(fVar.f()) && this.f618b.equals(fVar.e()) && ((str = this.f619c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f620d == fVar.c() && this.f621e == fVar.g() && this.f622f.equals(fVar.b());
    }

    @Override
    public AbstractC0324e0 f() {
        return this.f617a;
    }

    @Override
    public int g() {
        return this.f621e;
    }

    public int hashCode() {
        int iHashCode = (((this.f617a.hashCode() ^ 1000003) * 1000003) ^ this.f618b.hashCode()) * 1000003;
        String str = this.f619c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f620d) * 1000003) ^ this.f621e) * 1000003) ^ this.f622f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f617a + ", sharedSurfaces=" + this.f618b + ", physicalCameraId=" + this.f619c + ", mirrorMode=" + this.f620d + ", surfaceGroupId=" + this.f621e + ", dynamicRange=" + this.f622f + "}";
    }

    private C0335k(AbstractC0324e0 abstractC0324e0, List<AbstractC0324e0> list, String str, int i7, int i8, C3070z c3070z) {
        this.f617a = abstractC0324e0;
        this.f618b = list;
        this.f619c = str;
        this.f620d = i7;
        this.f621e = i8;
        this.f622f = c3070z;
    }
}
