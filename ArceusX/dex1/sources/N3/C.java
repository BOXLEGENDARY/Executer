package N3;

final class C extends H {

    private String f2573a;

    private boolean f2574b;

    private int f2575c;

    private byte f2576d;

    C() {
    }

    @Override
    public final H a(boolean z7) {
        this.f2574b = true;
        this.f2576d = (byte) (1 | this.f2576d);
        return this;
    }

    @Override
    public final H b(int i7) {
        this.f2575c = 1;
        this.f2576d = (byte) (this.f2576d | 2);
        return this;
    }

    @Override
    public final I c() {
        String str;
        if (this.f2576d == 3 && (str = this.f2573a) != null) {
            return new E(str, this.f2574b, this.f2575c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2573a == null) {
            sb.append(" libraryName");
        }
        if ((this.f2576d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f2576d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final H d(String str) {
        this.f2573a = "common";
        return this;
    }
}
