package R3;

final class Y5 extends AbstractC1042c6 {

    private String f5436a;

    private boolean f5437b;

    private int f5438c;

    private byte f5439d;

    Y5() {
    }

    @Override
    public final AbstractC1042c6 a(boolean z7) {
        this.f5437b = true;
        this.f5439d = (byte) (1 | this.f5439d);
        return this;
    }

    @Override
    public final AbstractC1042c6 b(int i7) {
        this.f5438c = 1;
        this.f5439d = (byte) (this.f5439d | 2);
        return this;
    }

    @Override
    public final AbstractC1050d6 c() {
        String str;
        if (this.f5439d == 3 && (str = this.f5436a) != null) {
            return new C1026a6(str, this.f5437b, this.f5438c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5436a == null) {
            sb.append(" libraryName");
        }
        if ((this.f5439d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f5439d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC1042c6 d(String str) {
        this.f5436a = str;
        return this;
    }
}
