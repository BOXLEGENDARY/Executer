package z;

import z.u0;

final class C3046f extends u0.b {

    private final int f24635a;

    private final u0 f24636b;

    C3046f(int i7, u0 u0Var) {
        this.f24635a = i7;
        if (u0Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f24636b = u0Var;
    }

    @Override
    public int a() {
        return this.f24635a;
    }

    @Override
    public u0 b() {
        return this.f24636b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0.b)) {
            return false;
        }
        u0.b bVar = (u0.b) obj;
        return this.f24635a == bVar.a() && this.f24636b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f24635a ^ 1000003) * 1000003) ^ this.f24636b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f24635a + ", surfaceOutput=" + this.f24636b + "}";
    }
}
