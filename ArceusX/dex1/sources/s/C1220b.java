package S;

import S.AbstractC1219a;
import android.util.Range;
import com.github.luben.zstd.BuildConfig;

final class C1220b extends AbstractC1219a {

    private final Range<Integer> f6259d;

    private final int f6260e;

    private final int f6261f;

    private final Range<Integer> f6262g;

    private final int f6263h;

    static final class C0049b extends AbstractC1219a.AbstractC0048a {

        private Range<Integer> f6264a;

        private Integer f6265b;

        private Integer f6266c;

        private Range<Integer> f6267d;

        private Integer f6268e;

        C0049b() {
        }

        @Override
        public AbstractC1219a a() {
            Range<Integer> range = this.f6264a;
            String str = BuildConfig.FLAVOR;
            if (range == null) {
                str = BuildConfig.FLAVOR + " bitrate";
            }
            if (this.f6265b == null) {
                str = str + " sourceFormat";
            }
            if (this.f6266c == null) {
                str = str + " source";
            }
            if (this.f6267d == null) {
                str = str + " sampleRate";
            }
            if (this.f6268e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C1220b(this.f6264a, this.f6265b.intValue(), this.f6266c.intValue(), this.f6267d, this.f6268e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public AbstractC1219a.AbstractC0048a b(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f6264a = range;
            return this;
        }

        @Override
        public AbstractC1219a.AbstractC0048a c(int i7) {
            this.f6268e = Integer.valueOf(i7);
            return this;
        }

        @Override
        public AbstractC1219a.AbstractC0048a d(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.f6267d = range;
            return this;
        }

        @Override
        public AbstractC1219a.AbstractC0048a e(int i7) {
            this.f6266c = Integer.valueOf(i7);
            return this;
        }

        public AbstractC1219a.AbstractC0048a f(int i7) {
            this.f6265b = Integer.valueOf(i7);
            return this;
        }
    }

    @Override
    public Range<Integer> b() {
        return this.f6259d;
    }

    @Override
    public int c() {
        return this.f6263h;
    }

    @Override
    public Range<Integer> d() {
        return this.f6262g;
    }

    @Override
    public int e() {
        return this.f6261f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1219a)) {
            return false;
        }
        AbstractC1219a abstractC1219a = (AbstractC1219a) obj;
        return this.f6259d.equals(abstractC1219a.b()) && this.f6260e == abstractC1219a.f() && this.f6261f == abstractC1219a.e() && this.f6262g.equals(abstractC1219a.d()) && this.f6263h == abstractC1219a.c();
    }

    @Override
    public int f() {
        return this.f6260e;
    }

    public int hashCode() {
        return ((((((((this.f6259d.hashCode() ^ 1000003) * 1000003) ^ this.f6260e) * 1000003) ^ this.f6261f) * 1000003) ^ this.f6262g.hashCode()) * 1000003) ^ this.f6263h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f6259d + ", sourceFormat=" + this.f6260e + ", source=" + this.f6261f + ", sampleRate=" + this.f6262g + ", channelCount=" + this.f6263h + "}";
    }

    private C1220b(Range<Integer> range, int i7, int i8, Range<Integer> range2, int i9) {
        this.f6259d = range;
        this.f6260e = i7;
        this.f6261f = i8;
        this.f6262g = range2;
        this.f6263h = i9;
    }
}
