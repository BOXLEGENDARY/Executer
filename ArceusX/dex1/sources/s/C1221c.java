package S;

import S.C1228j;

final class C1221c extends C1228j.b {

    private final C1230l f6270b;

    private final int f6271c;

    C1221c(C1230l c1230l, int i7) {
        if (c1230l == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f6270b = c1230l;
        this.f6271c = i7;
    }

    @Override
    C1230l b() {
        return this.f6270b;
    }

    @Override
    int c() {
        return this.f6271c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1228j.b)) {
            return false;
        }
        C1228j.b bVar = (C1228j.b) obj;
        return this.f6270b.equals(bVar.b()) && this.f6271c == bVar.c();
    }

    public int hashCode() {
        return ((this.f6270b.hashCode() ^ 1000003) * 1000003) ^ this.f6271c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f6270b + ", fallbackRule=" + this.f6271c + "}";
    }
}
