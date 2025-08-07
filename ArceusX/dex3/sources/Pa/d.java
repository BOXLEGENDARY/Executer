package Pa;

public class d extends Ua.f {
    private final Ua.d[] a;
    private int b = -1;
    private int c = -1;
    private boolean d = false;

    public d(Ua.d... dVarArr) {
        this.a = dVarArr;
    }

    @Override
    public Ua.f a(int i) {
        this.c = i;
        return this;
    }

    @Override
    public Ua.f b(int i) {
        this.b = i;
        return this;
    }

    @Override
    public Ua.f e() {
        this.d = true;
        return this;
    }

    public Ua.d[] f() {
        return this.a;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.b;
    }

    public boolean i() {
        return this.d;
    }
}
