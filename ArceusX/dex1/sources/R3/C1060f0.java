package R3;

final class C1060f0 extends P {

    static final P f5518w = new C1060f0(new Object[0], 0);

    final transient Object[] f5519i;

    private final transient int f5520v;

    C1060f0(Object[] objArr, int i7) {
        this.f5519i = objArr;
        this.f5520v = i7;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f5519i, 0, objArr, 0, this.f5520v);
        return this.f5520v;
    }

    @Override
    final int e() {
        return this.f5520v;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        C1035c.a(i7, this.f5520v, "index");
        Object obj = this.f5519i[i7];
        obj.getClass();
        return obj;
    }

    @Override
    final Object[] j() {
        return this.f5519i;
    }

    @Override
    public final int size() {
        return this.f5520v;
    }
}
