package O3;

final class C0697m9 extends AbstractC0741q9 {

    private final String f3515a;

    private final boolean f3516b;

    private final int f3517c;

    C0697m9(String str, boolean z7, int i7, C0686l9 c0686l9) {
        this.f3515a = str;
        this.f3516b = z7;
        this.f3517c = i7;
    }

    @Override
    public final int a() {
        return this.f3517c;
    }

    @Override
    public final String b() {
        return this.f3515a;
    }

    @Override
    public final boolean c() {
        return this.f3516b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0741q9) {
            AbstractC0741q9 abstractC0741q9 = (AbstractC0741q9) obj;
            if (this.f3515a.equals(abstractC0741q9.b()) && this.f3516b == abstractC0741q9.c() && this.f3517c == abstractC0741q9.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3515a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f3516b ? 1237 : 1231)) * 1000003) ^ this.f3517c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f3515a + ", enableFirelog=" + this.f3516b + ", firelogEventType=" + this.f3517c + "}";
    }
}
