package R3;

final class C1026a6 extends AbstractC1050d6 {

    private final String f5467a;

    private final boolean f5468b;

    private final int f5469c;

    C1026a6(String str, boolean z7, int i7, Z5 z52) {
        this.f5467a = str;
        this.f5468b = z7;
        this.f5469c = i7;
    }

    @Override
    public final int a() {
        return this.f5469c;
    }

    @Override
    public final String b() {
        return this.f5467a;
    }

    @Override
    public final boolean c() {
        return this.f5468b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1050d6) {
            AbstractC1050d6 abstractC1050d6 = (AbstractC1050d6) obj;
            if (this.f5467a.equals(abstractC1050d6.b()) && this.f5468b == abstractC1050d6.c() && this.f5469c == abstractC1050d6.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5467a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f5468b ? 1237 : 1231)) * 1000003) ^ this.f5469c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f5467a + ", enableFirelog=" + this.f5468b + ", firelogEventType=" + this.f5469c + "}";
    }
}
