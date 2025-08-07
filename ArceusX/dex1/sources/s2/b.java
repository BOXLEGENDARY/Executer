package s2;

import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import s2.i;

final class b extends i {

    private final String f23594a;

    private final Integer f23595b;

    private final h f23596c;

    private final long f23597d;

    private final long f23598e;

    private final Map<String, String> f23599f;

    static final class C0223b extends i.a {

        private String f23600a;

        private Integer f23601b;

        private h f23602c;

        private Long f23603d;

        private Long f23604e;

        private Map<String, String> f23605f;

        C0223b() {
        }

        @Override
        public i d() {
            String str = this.f23600a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " transportName";
            }
            if (this.f23602c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f23603d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f23604e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f23605f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new b(this.f23600a, this.f23601b, this.f23602c, this.f23603d.longValue(), this.f23604e.longValue(), this.f23605f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override
        protected Map<String, String> e() {
            Map<String, String> map = this.f23605f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f23605f = map;
            return this;
        }

        @Override
        public i.a g(Integer num) {
            this.f23601b = num;
            return this;
        }

        @Override
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f23602c = hVar;
            return this;
        }

        @Override
        public i.a i(long j7) {
            this.f23603d = Long.valueOf(j7);
            return this;
        }

        @Override
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f23600a = str;
            return this;
        }

        @Override
        public i.a k(long j7) {
            this.f23604e = Long.valueOf(j7);
            return this;
        }
    }

    @Override
    protected Map<String, String> c() {
        return this.f23599f;
    }

    @Override
    public Integer d() {
        return this.f23595b;
    }

    @Override
    public h e() {
        return this.f23596c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f23594a.equals(iVar.j()) && ((num = this.f23595b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f23596c.equals(iVar.e()) && this.f23597d == iVar.f() && this.f23598e == iVar.k() && this.f23599f.equals(iVar.c());
    }

    @Override
    public long f() {
        return this.f23597d;
    }

    public int hashCode() {
        int iHashCode = (this.f23594a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f23595b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f23596c.hashCode()) * 1000003;
        long j7 = this.f23597d;
        int i7 = (iHashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f23598e;
        return ((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f23599f.hashCode();
    }

    @Override
    public String j() {
        return this.f23594a;
    }

    @Override
    public long k() {
        return this.f23598e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f23594a + ", code=" + this.f23595b + ", encodedPayload=" + this.f23596c + ", eventMillis=" + this.f23597d + ", uptimeMillis=" + this.f23598e + ", autoMetadata=" + this.f23599f + "}";
    }

    private b(String str, Integer num, h hVar, long j7, long j8, Map<String, String> map) {
        this.f23594a = str;
        this.f23595b = num;
        this.f23596c = hVar;
        this.f23597d = j7;
        this.f23598e = j8;
        this.f23599f = map;
    }
}
