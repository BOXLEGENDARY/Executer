package r2;

import r2.k;

final class e extends k {

    private final k.b f22792a;

    private final r2.a f22793b;

    static final class b extends k.a {

        private k.b f22794a;

        private r2.a f22795b;

        b() {
        }

        @Override
        public k a() {
            return new e(this.f22794a, this.f22795b);
        }

        @Override
        public k.a b(r2.a aVar) {
            this.f22795b = aVar;
            return this;
        }

        @Override
        public k.a c(k.b bVar) {
            this.f22794a = bVar;
            return this;
        }
    }

    @Override
    public r2.a b() {
        return this.f22793b;
    }

    @Override
    public k.b c() {
        return this.f22792a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f22792a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            r2.a aVar = this.f22793b;
            if (aVar == null) {
                if (kVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f22792a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        r2.a aVar = this.f22793b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f22792a + ", androidClientInfo=" + this.f22793b + "}";
    }

    private e(k.b bVar, r2.a aVar) {
        this.f22792a = bVar;
        this.f22793b = aVar;
    }
}
