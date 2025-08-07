package g5;

import com.github.luben.zstd.BuildConfig;
import g5.f;

final class b extends f {

    private final String f20972a;

    private final long f20973b;

    private final f.b f20974c;

    static final class C0192b extends f.a {

        private String f20975a;

        private Long f20976b;

        private f.b f20977c;

        C0192b() {
        }

        @Override
        public f a() {
            Long l7 = this.f20976b;
            String str = BuildConfig.FLAVOR;
            if (l7 == null) {
                str = BuildConfig.FLAVOR + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f20975a, this.f20976b.longValue(), this.f20977c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public f.a b(f.b bVar) {
            this.f20977c = bVar;
            return this;
        }

        @Override
        public f.a c(String str) {
            this.f20975a = str;
            return this;
        }

        @Override
        public f.a d(long j7) {
            this.f20976b = Long.valueOf(j7);
            return this;
        }
    }

    @Override
    public f.b b() {
        return this.f20974c;
    }

    @Override
    public String c() {
        return this.f20972a;
    }

    @Override
    public long d() {
        return this.f20973b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f20972a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f20973b == fVar.d()) {
                f.b bVar = this.f20974c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20972a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j7 = this.f20973b;
        int i7 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        f.b bVar = this.f20974c;
        return i7 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f20972a + ", tokenExpirationTimestamp=" + this.f20973b + ", responseCode=" + this.f20974c + "}";
    }

    private b(String str, long j7, f.b bVar) {
        this.f20972a = str;
        this.f20973b = j7;
        this.f20974c = bVar;
    }
}
