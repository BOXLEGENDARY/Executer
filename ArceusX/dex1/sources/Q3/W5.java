package Q3;

final class W5 extends N5 {

    private final transient Object[] f4248i;

    private final transient int f4249v;

    private final transient int f4250w;

    W5(Object[] objArr, int i7, int i8) {
        this.f4248i = objArr;
        this.f4249v = i7;
        this.f4250w = i8;
    }

    @Override
    public final Object get(int i7) {
        G1.a(i7, this.f4250w, "index");
        Object obj = this.f4248i[i7 + i7 + this.f4249v];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f4250w;
    }
}
