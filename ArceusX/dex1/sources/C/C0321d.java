package C;

import C.X;
import U.Gw.oeVkjmfPcLbWm;

final class C0321d<T> extends X.a<T> {

    private final String f535a;

    private final Class<T> f536b;

    private final Object f537c;

    C0321d(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f535a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f536b = cls;
        this.f537c = obj;
    }

    @Override
    public String c() {
        return this.f535a;
    }

    @Override
    public Object d() {
        return this.f537c;
    }

    @Override
    public Class<T> e() {
        return this.f536b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X.a)) {
            return false;
        }
        X.a aVar = (X.a) obj;
        if (this.f535a.equals(aVar.c()) && this.f536b.equals(aVar.e())) {
            Object obj2 = this.f537c;
            if (obj2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f535a.hashCode() ^ 1000003) * 1000003) ^ this.f536b.hashCode()) * 1000003;
        Object obj = this.f537c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f535a + ", valueClass=" + this.f536b + oeVkjmfPcLbWm.shZR + this.f537c + "}";
    }
}
