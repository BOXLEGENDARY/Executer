package W;

import C.InterfaceC0336k0;
import W.f;
import com.github.luben.zstd.BuildConfig;

final class a extends f {

    private final String f7612a;

    private final int f7613b;

    private final InterfaceC0336k0.c f7614c;

    static final class b extends f.a {

        private String f7615a;

        private Integer f7616b;

        private InterfaceC0336k0.c f7617c;

        b() {
        }

        @Override
        public f b() {
            String str = this.f7615a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.f7616b == null) {
                str2 = str2 + " profile";
            }
            if (str2.isEmpty()) {
                return new a(this.f7615a, this.f7616b.intValue(), this.f7617c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override
        public f.a c(InterfaceC0336k0.c cVar) {
            this.f7617c = cVar;
            return this;
        }

        protected f.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f7615a = str;
            return this;
        }

        @Override
        public f.a a(int i7) {
            this.f7616b = Integer.valueOf(i7);
            return this;
        }
    }

    @Override
    public String a() {
        return this.f7612a;
    }

    @Override
    public int b() {
        return this.f7613b;
    }

    @Override
    public InterfaceC0336k0.c d() {
        return this.f7614c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f7612a.equals(fVar.a()) && this.f7613b == fVar.b()) {
            InterfaceC0336k0.c cVar = this.f7614c;
            if (cVar == null) {
                if (fVar.d() == null) {
                    return true;
                }
            } else if (cVar.equals(fVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f7612a.hashCode() ^ 1000003) * 1000003) ^ this.f7613b) * 1000003;
        InterfaceC0336k0.c cVar = this.f7614c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f7612a + ", profile=" + this.f7613b + ", compatibleVideoProfile=" + this.f7614c + "}";
    }

    private a(String str, int i7, InterfaceC0336k0.c cVar) {
        this.f7612a = str;
        this.f7613b = i7;
        this.f7614c = cVar;
    }
}
