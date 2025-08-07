package g5;

import K0.wJ.BtcVLuo;
import g5.d;

final class a extends d {

    private final String f20962a;

    private final String f20963b;

    private final String f20964c;

    private final f f20965d;

    private final d.b f20966e;

    static final class b extends d.a {

        private String f20967a;

        private String f20968b;

        private String f20969c;

        private f f20970d;

        private d.b f20971e;

        b() {
        }

        @Override
        public d a() {
            return new a(this.f20967a, this.f20968b, this.f20969c, this.f20970d, this.f20971e);
        }

        @Override
        public d.a b(f fVar) {
            this.f20970d = fVar;
            return this;
        }

        @Override
        public d.a c(String str) {
            this.f20968b = str;
            return this;
        }

        @Override
        public d.a d(String str) {
            this.f20969c = str;
            return this;
        }

        @Override
        public d.a e(d.b bVar) {
            this.f20971e = bVar;
            return this;
        }

        @Override
        public d.a f(String str) {
            this.f20967a = str;
            return this;
        }
    }

    @Override
    public f b() {
        return this.f20965d;
    }

    @Override
    public String c() {
        return this.f20963b;
    }

    @Override
    public String d() {
        return this.f20964c;
    }

    @Override
    public d.b e() {
        return this.f20966e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f20962a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f20963b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f20964c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f20965d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f20966e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String f() {
        return this.f20962a;
    }

    public int hashCode() {
        String str = this.f20962a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20963b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20964c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f20965d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f20966e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f20962a + ", fid=" + this.f20963b + ", refreshToken=" + this.f20964c + BtcVLuo.LtkoOkr + this.f20965d + ", responseCode=" + this.f20966e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f20962a = str;
        this.f20963b = str2;
        this.f20964c = str3;
        this.f20965d = fVar;
        this.f20966e = bVar;
    }
}
