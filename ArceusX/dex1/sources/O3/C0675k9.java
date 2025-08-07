package O3;

final class C0675k9 extends AbstractC0730p9 {

    private String f3491a;

    private boolean f3492b;

    private int f3493c;

    private byte f3494d;

    C0675k9() {
    }

    @Override
    public final AbstractC0730p9 a(boolean z7) {
        this.f3492b = true;
        this.f3494d = (byte) (1 | this.f3494d);
        return this;
    }

    @Override
    public final AbstractC0730p9 b(int i7) {
        this.f3493c = 1;
        this.f3494d = (byte) (this.f3494d | 2);
        return this;
    }

    @Override
    public final AbstractC0741q9 c() {
        String str;
        if (this.f3494d == 3 && (str = this.f3491a) != null) {
            return new C0697m9(str, this.f3492b, this.f3493c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3491a == null) {
            sb.append(" libraryName");
        }
        if ((this.f3494d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f3494d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC0730p9 d(String str) {
        this.f3491a = str;
        return this;
    }
}
