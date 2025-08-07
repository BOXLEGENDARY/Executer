package R3;

final class C1092j0 extends P {

    private final transient Object[] f5598i;

    private final transient int f5599v;

    private final transient int f5600w;

    C1092j0(Object[] objArr, int i7, int i8) {
        this.f5598i = objArr;
        this.f5599v = i7;
        this.f5600w = i8;
    }

    @Override
    public final Object get(int i7) {
        C1035c.a(i7, this.f5600w, "index");
        Object obj = this.f5598i[i7 + i7 + this.f5599v];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f5600w;
    }
}
