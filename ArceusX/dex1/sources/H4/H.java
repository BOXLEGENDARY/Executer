package H4;

final class H extends I {

    private final int f1580a;

    private final long f1581b;

    H(int i7, long j7) {
        this.f1580a = i7;
        this.f1581b = j7;
    }

    @Override
    public final int a() {
        return this.f1580a;
    }

    @Override
    public final long b() {
        return this.f1581b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i7 = (I) obj;
            if (this.f1580a == i7.a() && this.f1581b == i7.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f1581b;
        return ((int) (j7 ^ (j7 >>> 32))) ^ ((this.f1580a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f1580a + ", eventTimestamp=" + this.f1581b + "}";
    }
}
