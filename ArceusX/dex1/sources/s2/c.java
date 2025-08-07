package s2;

import com.github.luben.zstd.BuildConfig;
import s2.n;

final class c extends n {

    private final o f23606a;

    private final String f23607b;

    private final q2.c<?> f23608c;

    private final q2.e<?, byte[]> f23609d;

    private final q2.b f23610e;

    static final class b extends n.a {

        private o f23611a;

        private String f23612b;

        private q2.c<?> f23613c;

        private q2.e<?, byte[]> f23614d;

        private q2.b f23615e;

        b() {
        }

        @Override
        public n a() {
            o oVar = this.f23611a;
            String str = BuildConfig.FLAVOR;
            if (oVar == null) {
                str = BuildConfig.FLAVOR + " transportContext";
            }
            if (this.f23612b == null) {
                str = str + " transportName";
            }
            if (this.f23613c == null) {
                str = str + " event";
            }
            if (this.f23614d == null) {
                str = str + " transformer";
            }
            if (this.f23615e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f23611a, this.f23612b, this.f23613c, this.f23614d, this.f23615e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        n.a b(q2.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f23615e = bVar;
            return this;
        }

        @Override
        n.a c(q2.c<?> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f23613c = cVar;
            return this;
        }

        @Override
        n.a d(q2.e<?, byte[]> eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f23614d = eVar;
            return this;
        }

        @Override
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f23611a = oVar;
            return this;
        }

        @Override
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f23612b = str;
            return this;
        }
    }

    @Override
    public q2.b b() {
        return this.f23610e;
    }

    @Override
    q2.c<?> c() {
        return this.f23608c;
    }

    @Override
    q2.e<?, byte[]> e() {
        return this.f23609d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f23606a.equals(nVar.f()) && this.f23607b.equals(nVar.g()) && this.f23608c.equals(nVar.c()) && this.f23609d.equals(nVar.e()) && this.f23610e.equals(nVar.b());
    }

    @Override
    public o f() {
        return this.f23606a;
    }

    @Override
    public String g() {
        return this.f23607b;
    }

    public int hashCode() {
        return ((((((((this.f23606a.hashCode() ^ 1000003) * 1000003) ^ this.f23607b.hashCode()) * 1000003) ^ this.f23608c.hashCode()) * 1000003) ^ this.f23609d.hashCode()) * 1000003) ^ this.f23610e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f23606a + ", transportName=" + this.f23607b + ", event=" + this.f23608c + ", transformer=" + this.f23609d + ", encoding=" + this.f23610e + "}";
    }

    private c(o oVar, String str, q2.c<?> cVar, q2.e<?, byte[]> eVar, q2.b bVar) {
        this.f23606a = oVar;
        this.f23607b = str;
        this.f23608c = cVar;
        this.f23609d = eVar;
        this.f23610e = bVar;
    }
}
