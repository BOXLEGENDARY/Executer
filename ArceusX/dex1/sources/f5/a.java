package f5;

import com.github.luben.zstd.BuildConfig;
import f5.c;
import f5.d;

final class a extends d {

    private final String f20492b;

    private final c.a f20493c;

    private final String f20494d;

    private final String f20495e;

    private final long f20496f;

    private final long f20497g;

    private final String f20498h;

    static final class b extends d.a {

        private String f20499a;

        private c.a f20500b;

        private String f20501c;

        private String f20502d;

        private Long f20503e;

        private Long f20504f;

        private String f20505g;

        @Override
        public d a() {
            c.a aVar = this.f20500b;
            String str = BuildConfig.FLAVOR;
            if (aVar == null) {
                str = BuildConfig.FLAVOR + " registrationStatus";
            }
            if (this.f20503e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f20504f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f20499a, this.f20500b, this.f20501c, this.f20502d, this.f20503e.longValue(), this.f20504f.longValue(), this.f20505g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public d.a b(String str) {
            this.f20501c = str;
            return this;
        }

        @Override
        public d.a c(long j7) {
            this.f20503e = Long.valueOf(j7);
            return this;
        }

        @Override
        public d.a d(String str) {
            this.f20499a = str;
            return this;
        }

        @Override
        public d.a e(String str) {
            this.f20505g = str;
            return this;
        }

        @Override
        public d.a f(String str) {
            this.f20502d = str;
            return this;
        }

        @Override
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f20500b = aVar;
            return this;
        }

        @Override
        public d.a h(long j7) {
            this.f20504f = Long.valueOf(j7);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f20499a = dVar.d();
            this.f20500b = dVar.g();
            this.f20501c = dVar.b();
            this.f20502d = dVar.f();
            this.f20503e = Long.valueOf(dVar.c());
            this.f20504f = Long.valueOf(dVar.h());
            this.f20505g = dVar.e();
        }
    }

    @Override
    public String b() {
        return this.f20494d;
    }

    @Override
    public long c() {
        return this.f20496f;
    }

    @Override
    public String d() {
        return this.f20492b;
    }

    @Override
    public String e() {
        return this.f20498h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f20492b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f20493c.equals(dVar.g()) && ((str = this.f20494d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f20495e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f20496f == dVar.c() && this.f20497g == dVar.h()) {
                String str4 = this.f20498h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String f() {
        return this.f20495e;
    }

    @Override
    public c.a g() {
        return this.f20493c;
    }

    @Override
    public long h() {
        return this.f20497g;
    }

    public int hashCode() {
        String str = this.f20492b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f20493c.hashCode()) * 1000003;
        String str2 = this.f20494d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20495e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j7 = this.f20496f;
        int i7 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f20497g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f20498h;
        return i8 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f20492b + ", registrationStatus=" + this.f20493c + ", authToken=" + this.f20494d + ", refreshToken=" + this.f20495e + ", expiresInSecs=" + this.f20496f + ", tokenCreationEpochInSecs=" + this.f20497g + ", fisError=" + this.f20498h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j7, long j8, String str4) {
        this.f20492b = str;
        this.f20493c = aVar;
        this.f20494d = str2;
        this.f20495e = str3;
        this.f20496f = j7;
        this.f20497g = j8;
        this.f20498h = str4;
    }
}
