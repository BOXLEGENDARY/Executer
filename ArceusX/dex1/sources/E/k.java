package E;

final class k {

    private final long f1062a;

    private final long f1063b;

    k(long j7, long j8) {
        this.f1062a = j7;
        this.f1063b = j8;
    }

    long a() {
        return this.f1063b;
    }

    long b() {
        return this.f1062a;
    }

    public String toString() {
        return this.f1062a + "/" + this.f1063b;
    }

    k(double d7) {
        this((long) (d7 * 10000.0d), 10000L);
    }
}
