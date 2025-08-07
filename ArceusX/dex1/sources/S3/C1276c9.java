package S3;

final class C1276c9 extends AbstractC1331h9 {

    private String f6901a;

    private boolean f6902b;

    private int f6903c;

    private byte f6904d;

    C1276c9() {
    }

    @Override
    public final AbstractC1331h9 a(boolean z7) {
        this.f6902b = true;
        this.f6904d = (byte) (1 | this.f6904d);
        return this;
    }

    @Override
    public final AbstractC1331h9 b(int i7) {
        this.f6903c = 1;
        this.f6904d = (byte) (this.f6904d | 2);
        return this;
    }

    @Override
    public final AbstractC1342i9 c() {
        String str;
        if (this.f6904d == 3 && (str = this.f6901a) != null) {
            return new C1298e9(str, this.f6902b, this.f6903c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6901a == null) {
            sb.append(" libraryName");
        }
        if ((this.f6904d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f6904d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final AbstractC1331h9 d(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f6901a = str;
        return this;
    }
}
