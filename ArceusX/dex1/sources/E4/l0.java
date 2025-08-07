package E4;

final class l0 extends m0 {

    private final int f1147a;

    private final long f1148b;

    l0(int i7, long j7) {
        this.f1147a = i7;
        this.f1148b = j7;
    }

    @Override
    public final int a() {
        return this.f1147a;
    }

    @Override
    public final long b() {
        return this.f1148b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (this.f1147a == m0Var.a() && this.f1148b == m0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f1147a ^ 1000003;
        long j7 = this.f1148b;
        return (i7 * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f1147a + ", eventTimestamp=" + this.f1148b + "}";
    }
}
