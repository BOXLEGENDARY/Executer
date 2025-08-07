package S3;

final class C1298e9 extends AbstractC1342i9 {

    private final String f6925a;

    private final boolean f6926b;

    private final int f6927c;

    C1298e9(String str, boolean z7, int i7, C1287d9 c1287d9) {
        this.f6925a = str;
        this.f6926b = z7;
        this.f6927c = i7;
    }

    @Override
    public final int a() {
        return this.f6927c;
    }

    @Override
    public final String b() {
        return this.f6925a;
    }

    @Override
    public final boolean c() {
        return this.f6926b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1342i9) {
            AbstractC1342i9 abstractC1342i9 = (AbstractC1342i9) obj;
            if (this.f6925a.equals(abstractC1342i9.b()) && this.f6926b == abstractC1342i9.c() && this.f6927c == abstractC1342i9.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6925a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f6926b ? 1237 : 1231)) * 1000003) ^ this.f6927c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f6925a + ", enableFirelog=" + this.f6926b + ", firelogEventType=" + this.f6927c + "}";
    }
}
