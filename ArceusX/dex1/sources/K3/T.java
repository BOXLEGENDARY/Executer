package K3;

final class T extends A {

    static final A f1807y = new T(new Object[0], 0);

    final transient Object[] f1808v;

    private final transient int f1809w;

    T(Object[] objArr, int i7) {
        this.f1808v = objArr;
        this.f1809w = i7;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f1808v, 0, objArr, 0, this.f1809w);
        return this.f1809w;
    }

    @Override
    final int e() {
        return this.f1809w;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        C0485q.a(i7, this.f1809w, "index");
        Object obj = this.f1808v[i7];
        obj.getClass();
        return obj;
    }

    @Override
    final Object[] k() {
        return this.f1808v;
    }

    @Override
    public final int size() {
        return this.f1809w;
    }
}
