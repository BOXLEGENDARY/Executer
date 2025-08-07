package r2;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import r2.l;

final class f extends l {

    private final long f22796a;

    private final Integer f22797b;

    private final long f22798c;

    private final byte[] f22799d;

    private final String f22800e;

    private final long f22801f;

    private final o f22802g;

    static final class b extends l.a {

        private Long f22803a;

        private Integer f22804b;

        private Long f22805c;

        private byte[] f22806d;

        private String f22807e;

        private Long f22808f;

        private o f22809g;

        b() {
        }

        @Override
        public l a() {
            Long l7 = this.f22803a;
            String str = BuildConfig.FLAVOR;
            if (l7 == null) {
                str = BuildConfig.FLAVOR + " eventTimeMs";
            }
            if (this.f22805c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f22808f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f22803a.longValue(), this.f22804b, this.f22805c.longValue(), this.f22806d, this.f22807e, this.f22808f.longValue(), this.f22809g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public l.a b(Integer num) {
            this.f22804b = num;
            return this;
        }

        @Override
        public l.a c(long j7) {
            this.f22803a = Long.valueOf(j7);
            return this;
        }

        @Override
        public l.a d(long j7) {
            this.f22805c = Long.valueOf(j7);
            return this;
        }

        @Override
        public l.a e(o oVar) {
            this.f22809g = oVar;
            return this;
        }

        @Override
        l.a f(byte[] bArr) {
            this.f22806d = bArr;
            return this;
        }

        @Override
        l.a g(String str) {
            this.f22807e = str;
            return this;
        }

        @Override
        public l.a h(long j7) {
            this.f22808f = Long.valueOf(j7);
            return this;
        }
    }

    @Override
    public Integer b() {
        return this.f22797b;
    }

    @Override
    public long c() {
        return this.f22796a;
    }

    @Override
    public long d() {
        return this.f22798c;
    }

    @Override
    public o e() {
        return this.f22802g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f22796a == lVar.c() && ((num = this.f22797b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f22798c == lVar.d()) {
            if (Arrays.equals(this.f22799d, lVar instanceof f ? ((f) lVar).f22799d : lVar.f()) && ((str = this.f22800e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f22801f == lVar.h()) {
                o oVar = this.f22802g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public byte[] f() {
        return this.f22799d;
    }

    @Override
    public String g() {
        return this.f22800e;
    }

    @Override
    public long h() {
        return this.f22801f;
    }

    public int hashCode() {
        long j7 = this.f22796a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f22797b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j8 = this.f22798c;
        int iHashCode2 = (((((i7 ^ iHashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f22799d)) * 1000003;
        String str = this.f22800e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j9 = this.f22801f;
        int i8 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        o oVar = this.f22802g;
        return i8 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f22796a + ", eventCode=" + this.f22797b + ", eventUptimeMs=" + this.f22798c + ", sourceExtension=" + Arrays.toString(this.f22799d) + ", sourceExtensionJsonProto3=" + this.f22800e + ", timezoneOffsetSeconds=" + this.f22801f + ", networkConnectionInfo=" + this.f22802g + "}";
    }

    private f(long j7, Integer num, long j8, byte[] bArr, String str, long j9, o oVar) {
        this.f22796a = j7;
        this.f22797b = num;
        this.f22798c = j8;
        this.f22799d = bArr;
        this.f22800e = str;
        this.f22801f = j9;
        this.f22802g = oVar;
    }
}
