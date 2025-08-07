package l2;

public class e extends k2.b {

    private int f21767d;

    private Runnable f21768e;

    public e() {
        super(k2.g.COMMAND);
    }

    @Override
    protected void a() {
        this.f21767d = -1;
        this.f21768e = null;
    }

    public Runnable c() {
        return this.f21768e;
    }

    public int d() {
        return this.f21767d;
    }

    public void e(int i7) {
        this.f21767d = i7;
    }

    public String toString() {
        return "Command[" + this.f21767d + "]";
    }
}
