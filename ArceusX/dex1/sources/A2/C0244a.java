package A2;

import A2.AbstractC0248e;
import com.github.luben.zstd.BuildConfig;

final class C0244a extends AbstractC0248e {

    private final long f46b;

    private final int f47c;

    private final int f48d;

    private final long f49e;

    private final int f50f;

    static final class b extends AbstractC0248e.a {

        private Long f51a;

        private Integer f52b;

        private Integer f53c;

        private Long f54d;

        private Integer f55e;

        b() {
        }

        @Override
        AbstractC0248e a() {
            Long l7 = this.f51a;
            String str = BuildConfig.FLAVOR;
            if (l7 == null) {
                str = BuildConfig.FLAVOR + " maxStorageSizeInBytes";
            }
            if (this.f52b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f53c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f54d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f55e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0244a(this.f51a.longValue(), this.f52b.intValue(), this.f53c.intValue(), this.f54d.longValue(), this.f55e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        AbstractC0248e.a b(int i7) {
            this.f53c = Integer.valueOf(i7);
            return this;
        }

        @Override
        AbstractC0248e.a c(long j7) {
            this.f54d = Long.valueOf(j7);
            return this;
        }

        @Override
        AbstractC0248e.a d(int i7) {
            this.f52b = Integer.valueOf(i7);
            return this;
        }

        @Override
        AbstractC0248e.a e(int i7) {
            this.f55e = Integer.valueOf(i7);
            return this;
        }

        @Override
        AbstractC0248e.a f(long j7) {
            this.f51a = Long.valueOf(j7);
            return this;
        }
    }

    @Override
    int b() {
        return this.f48d;
    }

    @Override
    long c() {
        return this.f49e;
    }

    @Override
    int d() {
        return this.f47c;
    }

    @Override
    int e() {
        return this.f50f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0248e)) {
            return false;
        }
        AbstractC0248e abstractC0248e = (AbstractC0248e) obj;
        return this.f46b == abstractC0248e.f() && this.f47c == abstractC0248e.d() && this.f48d == abstractC0248e.b() && this.f49e == abstractC0248e.c() && this.f50f == abstractC0248e.e();
    }

    @Override
    long f() {
        return this.f46b;
    }

    public int hashCode() {
        long j7 = this.f46b;
        int i7 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f47c) * 1000003) ^ this.f48d) * 1000003;
        long j8 = this.f49e;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f50f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f46b + ", loadBatchSize=" + this.f47c + ", criticalSectionEnterTimeoutMs=" + this.f48d + ", eventCleanUpAge=" + this.f49e + ", maxBlobByteSizePerRow=" + this.f50f + "}";
    }

    private C0244a(long j7, int i7, int i8, long j8, int i9) {
        this.f46b = j7;
        this.f47c = i7;
        this.f48d = i8;
        this.f49e = j8;
        this.f50f = i9;
    }
}
