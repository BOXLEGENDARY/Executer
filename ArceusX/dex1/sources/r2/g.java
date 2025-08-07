package r2;

import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.github.luben.zstd.BuildConfig;
import java.util.List;
import r2.m;

final class g extends m {

    private final long f22810a;

    private final long f22811b;

    private final k f22812c;

    private final Integer f22813d;

    private final String f22814e;

    private final List<l> f22815f;

    private final p f22816g;

    static final class b extends m.a {

        private Long f22817a;

        private Long f22818b;

        private k f22819c;

        private Integer f22820d;

        private String f22821e;

        private List<l> f22822f;

        private p f22823g;

        b() {
        }

        @Override
        public m a() {
            Long l7 = this.f22817a;
            String str = BuildConfig.FLAVOR;
            if (l7 == null) {
                str = BuildConfig.FLAVOR + " requestTimeMs";
            }
            if (this.f22818b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f22817a.longValue(), this.f22818b.longValue(), this.f22819c, this.f22820d, this.f22821e, this.f22822f, this.f22823g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public m.a b(k kVar) {
            this.f22819c = kVar;
            return this;
        }

        @Override
        public m.a c(List<l> list) {
            this.f22822f = list;
            return this;
        }

        @Override
        m.a d(Integer num) {
            this.f22820d = num;
            return this;
        }

        @Override
        m.a e(String str) {
            this.f22821e = str;
            return this;
        }

        @Override
        public m.a f(p pVar) {
            this.f22823g = pVar;
            return this;
        }

        @Override
        public m.a g(long j7) {
            this.f22817a = Long.valueOf(j7);
            return this;
        }

        @Override
        public m.a h(long j7) {
            this.f22818b = Long.valueOf(j7);
            return this;
        }
    }

    @Override
    public k b() {
        return this.f22812c;
    }

    @Override
    public List<l> c() {
        return this.f22815f;
    }

    @Override
    public Integer d() {
        return this.f22813d;
    }

    @Override
    public String e() {
        return this.f22814e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f22810a == mVar.g() && this.f22811b == mVar.h() && ((kVar = this.f22812c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f22813d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f22814e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f22815f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f22816g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public p f() {
        return this.f22816g;
    }

    @Override
    public long g() {
        return this.f22810a;
    }

    @Override
    public long h() {
        return this.f22811b;
    }

    public int hashCode() {
        long j7 = this.f22810a;
        long j8 = this.f22811b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        k kVar = this.f22812c;
        int iHashCode = (i7 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f22813d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f22814e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f22815f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f22816g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return KwdswzaUHE.huoZdTfpGFEk + this.f22810a + ", requestUptimeMs=" + this.f22811b + ", clientInfo=" + this.f22812c + ", logSource=" + this.f22813d + ", logSourceName=" + this.f22814e + ", logEvents=" + this.f22815f + ", qosTier=" + this.f22816g + "}";
    }

    private g(long j7, long j8, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f22810a = j7;
        this.f22811b = j8;
        this.f22812c = kVar;
        this.f22813d = num;
        this.f22814e = str;
        this.f22815f = list;
        this.f22816g = pVar;
    }
}
