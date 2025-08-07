package r6;

public abstract class AbstractC2757a<T> implements d<T> {

    protected int f22924a;

    protected int f22925b;

    protected int f22926c;

    protected final float f22927d;

    public AbstractC2757a(int i7, int i8, float f7) {
        this.f22924a = i7;
        this.f22926c = i8;
        this.f22927d = f7;
    }

    @Override
    public void a() {
        this.f22925b++;
        this.f22924a = (int) (this.f22924a * this.f22927d);
    }

    @Override
    public boolean b() {
        return this.f22925b < this.f22926c;
    }

    @Override
    public int c() {
        return this.f22924a;
    }
}
