package C;

import C.c1;
import android.util.Range;
import android.util.Size;
import com.github.luben.zstd.BuildConfig;
import j0.tkB.pkcpMQSgx;
import z.C3070z;

final class C0339m extends c1 {

    private final Size f632b;

    private final C3070z f633c;

    private final Range<Integer> f634d;

    private final X f635e;

    private final boolean f636f;

    static final class b extends c1.a {

        private Size f637a;

        private C3070z f638b;

        private Range<Integer> f639c;

        private X f640d;

        private Boolean f641e;

        @Override
        public c1 a() {
            Size size = this.f637a;
            String str = BuildConfig.FLAVOR;
            if (size == null) {
                str = BuildConfig.FLAVOR + " resolution";
            }
            if (this.f638b == null) {
                str = str + " dynamicRange";
            }
            if (this.f639c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f641e == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C0339m(this.f637a, this.f638b, this.f639c, this.f640d, this.f641e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public c1.a b(C3070z c3070z) {
            if (c3070z == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f638b = c3070z;
            return this;
        }

        @Override
        public c1.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f639c = range;
            return this;
        }

        @Override
        public c1.a d(X x7) {
            this.f640d = x7;
            return this;
        }

        @Override
        public c1.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f637a = size;
            return this;
        }

        @Override
        public c1.a f(boolean z7) {
            this.f641e = Boolean.valueOf(z7);
            return this;
        }

        b() {
        }

        private b(c1 c1Var) {
            this.f637a = c1Var.e();
            this.f638b = c1Var.b();
            this.f639c = c1Var.c();
            this.f640d = c1Var.d();
            this.f641e = Boolean.valueOf(c1Var.f());
        }
    }

    @Override
    public C3070z b() {
        return this.f633c;
    }

    @Override
    public Range<Integer> c() {
        return this.f634d;
    }

    @Override
    public X d() {
        return this.f635e;
    }

    @Override
    public Size e() {
        return this.f632b;
    }

    public boolean equals(Object obj) {
        X x7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f632b.equals(c1Var.e()) && this.f633c.equals(c1Var.b()) && this.f634d.equals(c1Var.c()) && ((x7 = this.f635e) != null ? x7.equals(c1Var.d()) : c1Var.d() == null) && this.f636f == c1Var.f();
    }

    @Override
    public boolean f() {
        return this.f636f;
    }

    @Override
    public c1.a g() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (((((this.f632b.hashCode() ^ 1000003) * 1000003) ^ this.f633c.hashCode()) * 1000003) ^ this.f634d.hashCode()) * 1000003;
        X x7 = this.f635e;
        return ((iHashCode ^ (x7 == null ? 0 : x7.hashCode())) * 1000003) ^ (this.f636f ? 1231 : 1237);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f632b + pkcpMQSgx.VlpMCae + this.f633c + ", expectedFrameRateRange=" + this.f634d + ", implementationOptions=" + this.f635e + ", zslDisabled=" + this.f636f + "}";
    }

    private C0339m(Size size, C3070z c3070z, Range<Integer> range, X x7, boolean z7) {
        this.f632b = size;
        this.f633c = c3070z;
        this.f634d = range;
        this.f635e = x7;
        this.f636f = z7;
    }
}
