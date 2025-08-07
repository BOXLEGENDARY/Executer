package Q3;

final class C0923l5 extends AbstractC0964r5 {

    private String f4478a;

    private boolean f4479b;

    private int f4480c;

    private byte f4481d;

    C0923l5() {
    }

    @Override
    public final AbstractC0964r5 a(boolean z7) {
        this.f4479b = true;
        this.f4481d = (byte) (1 | this.f4481d);
        return this;
    }

    @Override
    public final AbstractC0964r5 b(int i7) {
        this.f4480c = 1;
        this.f4481d = (byte) (this.f4481d | 2);
        return this;
    }

    @Override
    public final AbstractC0971s5 c() {
        String str;
        if (this.f4481d == 3 && (str = this.f4478a) != null) {
            return new C0944o5(str, this.f4479b, this.f4480c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4478a == null) {
            sb.append(" libraryName");
        }
        if ((this.f4481d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f4481d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC0964r5 d(String str) {
        this.f4478a = "vision-common";
        return this;
    }
}
