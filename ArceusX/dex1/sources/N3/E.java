package N3;

final class E extends I {

    private final String f2577a;

    private final boolean f2578b;

    private final int f2579c;

    E(String str, boolean z7, int i7, D d7) {
        this.f2577a = str;
        this.f2578b = z7;
        this.f2579c = i7;
    }

    @Override
    public final int a() {
        return this.f2579c;
    }

    @Override
    public final String b() {
        return this.f2577a;
    }

    @Override
    public final boolean c() {
        return this.f2578b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i7 = (I) obj;
            if (this.f2577a.equals(i7.b()) && this.f2578b == i7.c() && this.f2579c == i7.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2577a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f2578b ? 1237 : 1231)) * 1000003) ^ this.f2579c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f2577a + ", enableFirelog=" + this.f2578b + ", firelogEventType=" + this.f2579c + "}";
    }
}
