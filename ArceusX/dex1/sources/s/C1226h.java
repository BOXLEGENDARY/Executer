package S;

import S.i0;
import android.util.Range;
import com.github.luben.zstd.BuildConfig;

final class C1226h extends i0 {

    private final C1233o f6316d;

    private final Range<Integer> f6317e;

    private final Range<Integer> f6318f;

    private final int f6319g;

    static final class b extends i0.a {

        private C1233o f6320a;

        private Range<Integer> f6321b;

        private Range<Integer> f6322c;

        private Integer f6323d;

        @Override
        public i0 a() {
            C1233o c1233o = this.f6320a;
            String str = BuildConfig.FLAVOR;
            if (c1233o == null) {
                str = BuildConfig.FLAVOR + " qualitySelector";
            }
            if (this.f6321b == null) {
                str = str + " frameRate";
            }
            if (this.f6322c == null) {
                str = str + " bitrate";
            }
            if (this.f6323d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C1226h(this.f6320a, this.f6321b, this.f6322c, this.f6323d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        i0.a b(int i7) {
            this.f6323d = Integer.valueOf(i7);
            return this;
        }

        @Override
        public i0.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f6322c = range;
            return this;
        }

        @Override
        public i0.a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null frameRate");
            }
            this.f6321b = range;
            return this;
        }

        @Override
        public i0.a e(C1233o c1233o) {
            if (c1233o == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f6320a = c1233o;
            return this;
        }

        b() {
        }

        private b(i0 i0Var) {
            this.f6320a = i0Var.e();
            this.f6321b = i0Var.d();
            this.f6322c = i0Var.c();
            this.f6323d = Integer.valueOf(i0Var.b());
        }
    }

    @Override
    int b() {
        return this.f6319g;
    }

    @Override
    public Range<Integer> c() {
        return this.f6318f;
    }

    @Override
    public Range<Integer> d() {
        return this.f6317e;
    }

    @Override
    public C1233o e() {
        return this.f6316d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f6316d.equals(i0Var.e()) && this.f6317e.equals(i0Var.d()) && this.f6318f.equals(i0Var.c()) && this.f6319g == i0Var.b();
    }

    @Override
    public i0.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f6316d.hashCode() ^ 1000003) * 1000003) ^ this.f6317e.hashCode()) * 1000003) ^ this.f6318f.hashCode()) * 1000003) ^ this.f6319g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f6316d + ", frameRate=" + this.f6317e + ", bitrate=" + this.f6318f + ", aspectRatio=" + this.f6319g + "}";
    }

    private C1226h(C1233o c1233o, Range<Integer> range, Range<Integer> range2, int i7) {
        this.f6316d = c1233o;
        this.f6317e = range;
        this.f6318f = range2;
        this.f6319g = i7;
    }
}
