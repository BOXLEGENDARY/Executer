package r2;

import r2.o;

final class i extends o {

    private final o.c f22825a;

    private final o.b f22826b;

    static final class b extends o.a {

        private o.c f22827a;

        private o.b f22828b;

        b() {
        }

        @Override
        public o a() {
            return new i(this.f22827a, this.f22828b);
        }

        @Override
        public o.a b(o.b bVar) {
            this.f22828b = bVar;
            return this;
        }

        @Override
        public o.a c(o.c cVar) {
            this.f22827a = cVar;
            return this;
        }
    }

    @Override
    public o.b b() {
        return this.f22826b;
    }

    @Override
    public o.c c() {
        return this.f22825a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f22825a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f22826b;
            if (bVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f22825a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f22826b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f22825a + ", mobileSubtype=" + this.f22826b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f22825a = cVar;
        this.f22826b = bVar;
    }
}
