package Q3;

final class S5 extends N5 {

    static final N5 f4194w = new S5(new Object[0], 0);

    final transient Object[] f4195i;

    private final transient int f4196v;

    S5(Object[] objArr, int i7) {
        this.f4195i = objArr;
        this.f4196v = i7;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f4195i, 0, objArr, 0, this.f4196v);
        return this.f4196v;
    }

    @Override
    final int e() {
        return this.f4196v;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        G1.a(i7, this.f4196v, "index");
        Object obj = this.f4195i[i7];
        obj.getClass();
        return obj;
    }

    @Override
    final Object[] j() {
        return this.f4195i;
    }

    @Override
    public final int size() {
        return this.f4196v;
    }
}
