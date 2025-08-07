package Q3;

final class C0944o5 extends AbstractC0971s5 {

    private final String f4535a;

    private final boolean f4536b;

    private final int f4537c;

    C0944o5(String str, boolean z7, int i7, C0930m5 c0930m5) {
        this.f4535a = str;
        this.f4536b = z7;
        this.f4537c = i7;
    }

    @Override
    public final int a() {
        return this.f4537c;
    }

    @Override
    public final String b() {
        return this.f4535a;
    }

    @Override
    public final boolean c() {
        return this.f4536b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0971s5) {
            AbstractC0971s5 abstractC0971s5 = (AbstractC0971s5) obj;
            if (this.f4535a.equals(abstractC0971s5.b()) && this.f4536b == abstractC0971s5.c() && this.f4537c == abstractC0971s5.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4535a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f4536b ? 1237 : 1231)) * 1000003) ^ this.f4537c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f4535a + ", enableFirelog=" + this.f4536b + ", firelogEventType=" + this.f4537c + "}";
    }
}
