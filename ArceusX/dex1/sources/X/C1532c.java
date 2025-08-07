package X;

import C.h1;
import X.i0;
import android.util.Size;
import com.github.luben.zstd.BuildConfig;

final class C1532c extends i0 {

    private final String f7816a;

    private final int f7817b;

    private final h1 f7818c;

    private final Size f7819d;

    private final int f7820e;

    private final j0 f7821f;

    private final int f7822g;

    private final int f7823h;

    private final int f7824i;

    static final class b extends i0.a {

        private String f7825a;

        private Integer f7826b;

        private h1 f7827c;

        private Size f7828d;

        private Integer f7829e;

        private j0 f7830f;

        private Integer f7831g;

        private Integer f7832h;

        private Integer f7833i;

        b() {
        }

        @Override
        public i0 a() {
            String str = this.f7825a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " mimeType";
            }
            if (this.f7826b == null) {
                str2 = str2 + " profile";
            }
            if (this.f7827c == null) {
                str2 = str2 + " inputTimebase";
            }
            if (this.f7828d == null) {
                str2 = str2 + " resolution";
            }
            if (this.f7829e == null) {
                str2 = str2 + " colorFormat";
            }
            if (this.f7830f == null) {
                str2 = str2 + " dataSpace";
            }
            if (this.f7831g == null) {
                str2 = str2 + " frameRate";
            }
            if (this.f7832h == null) {
                str2 = str2 + " IFrameInterval";
            }
            if (this.f7833i == null) {
                str2 = str2 + " bitrate";
            }
            if (str2.isEmpty()) {
                return new C1532c(this.f7825a, this.f7826b.intValue(), this.f7827c, this.f7828d, this.f7829e.intValue(), this.f7830f, this.f7831g.intValue(), this.f7832h.intValue(), this.f7833i.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override
        public i0.a b(int i7) {
            this.f7833i = Integer.valueOf(i7);
            return this;
        }

        @Override
        public i0.a c(int i7) {
            this.f7829e = Integer.valueOf(i7);
            return this;
        }

        @Override
        public i0.a d(j0 j0Var) {
            if (j0Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f7830f = j0Var;
            return this;
        }

        @Override
        public i0.a e(int i7) {
            this.f7831g = Integer.valueOf(i7);
            return this;
        }

        @Override
        public i0.a f(int i7) {
            this.f7832h = Integer.valueOf(i7);
            return this;
        }

        @Override
        public i0.a g(h1 h1Var) {
            if (h1Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f7827c = h1Var;
            return this;
        }

        @Override
        public i0.a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f7825a = str;
            return this;
        }

        @Override
        public i0.a i(int i7) {
            this.f7826b = Integer.valueOf(i7);
            return this;
        }

        @Override
        public i0.a j(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f7828d = size;
            return this;
        }
    }

    @Override
    public h1 b() {
        return this.f7818c;
    }

    @Override
    public String c() {
        return this.f7816a;
    }

    @Override
    public int e() {
        return this.f7824i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f7816a.equals(i0Var.c()) && this.f7817b == i0Var.j() && this.f7818c.equals(i0Var.b()) && this.f7819d.equals(i0Var.k()) && this.f7820e == i0Var.f() && this.f7821f.equals(i0Var.g()) && this.f7822g == i0Var.h() && this.f7823h == i0Var.i() && this.f7824i == i0Var.e();
    }

    @Override
    public int f() {
        return this.f7820e;
    }

    @Override
    public j0 g() {
        return this.f7821f;
    }

    @Override
    public int h() {
        return this.f7822g;
    }

    public int hashCode() {
        return ((((((((((((((((this.f7816a.hashCode() ^ 1000003) * 1000003) ^ this.f7817b) * 1000003) ^ this.f7818c.hashCode()) * 1000003) ^ this.f7819d.hashCode()) * 1000003) ^ this.f7820e) * 1000003) ^ this.f7821f.hashCode()) * 1000003) ^ this.f7822g) * 1000003) ^ this.f7823h) * 1000003) ^ this.f7824i;
    }

    @Override
    public int i() {
        return this.f7823h;
    }

    @Override
    public int j() {
        return this.f7817b;
    }

    @Override
    public Size k() {
        return this.f7819d;
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f7816a + ", profile=" + this.f7817b + ", inputTimebase=" + this.f7818c + ", resolution=" + this.f7819d + ", colorFormat=" + this.f7820e + ", dataSpace=" + this.f7821f + ", frameRate=" + this.f7822g + ", IFrameInterval=" + this.f7823h + ", bitrate=" + this.f7824i + "}";
    }

    private C1532c(String str, int i7, h1 h1Var, Size size, int i8, j0 j0Var, int i9, int i10, int i11) {
        this.f7816a = str;
        this.f7817b = i7;
        this.f7818c = h1Var;
        this.f7819d = size;
        this.f7820e = i8;
        this.f7821f = j0Var;
        this.f7822g = i9;
        this.f7823h = i10;
        this.f7824i = i11;
    }
}
