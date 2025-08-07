package z2;

import com.github.luben.zstd.BuildConfig;
import java.util.Set;
import z2.f;

final class c extends f.b {

    private final long f24786a;

    private final long f24787b;

    private final Set<f.c> f24788c;

    static final class b extends f.b.a {

        private Long f24789a;

        private Long f24790b;

        private Set<f.c> f24791c;

        b() {
        }

        @Override
        public f.b a() {
            Long l7 = this.f24789a;
            String str = BuildConfig.FLAVOR;
            if (l7 == null) {
                str = BuildConfig.FLAVOR + " delta";
            }
            if (this.f24790b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f24791c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f24789a.longValue(), this.f24790b.longValue(), this.f24791c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public f.b.a b(long j7) {
            this.f24789a = Long.valueOf(j7);
            return this;
        }

        @Override
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f24791c = set;
            return this;
        }

        @Override
        public f.b.a d(long j7) {
            this.f24790b = Long.valueOf(j7);
            return this;
        }
    }

    @Override
    long b() {
        return this.f24786a;
    }

    @Override
    Set<f.c> c() {
        return this.f24788c;
    }

    @Override
    long d() {
        return this.f24787b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f24786a == bVar.b() && this.f24787b == bVar.d() && this.f24788c.equals(bVar.c());
    }

    public int hashCode() {
        long j7 = this.f24786a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j8 = this.f24787b;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f24788c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f24786a + ", maxAllowedDelay=" + this.f24787b + ", flags=" + this.f24788c + "}";
    }

    private c(long j7, long j8, Set<f.c> set) {
        this.f24786a = j7;
        this.f24787b = j8;
        this.f24788c = set;
    }
}
