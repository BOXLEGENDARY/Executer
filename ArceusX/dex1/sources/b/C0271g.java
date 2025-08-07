package B;

import B.Z;

final class C0271g extends Z.b {

    private final int f230a;

    private final z.U f231b;

    C0271g(int i7, z.U u7) {
        this.f230a = i7;
        if (u7 == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f231b = u7;
    }

    @Override
    z.U a() {
        return this.f231b;
    }

    @Override
    int b() {
        return this.f230a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z.b)) {
            return false;
        }
        Z.b bVar = (Z.b) obj;
        return this.f230a == bVar.b() && this.f231b.equals(bVar.a());
    }

    public int hashCode() {
        return ((this.f230a ^ 1000003) * 1000003) ^ this.f231b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f230a + ", imageCaptureException=" + this.f231b + "}";
    }
}
