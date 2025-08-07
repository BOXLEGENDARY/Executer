package R3;

final class C1100k0 extends S {

    static final S f5627y = new C1100k0(null, new Object[0], 0);

    final transient Object[] f5628v;

    private final transient int f5629w;

    private C1100k0(Object obj, Object[] objArr, int i7) {
        this.f5628v = objArr;
        this.f5629w = i7;
    }

    static C1100k0 h(int i7, Object[] objArr, Q q7) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C1184v.b(obj, obj2);
        return new C1100k0(null, objArr, 1);
    }

    @Override
    final K a() {
        return new C1092j0(this.f5628v, 1, this.f5629w);
    }

    @Override
    final T d() {
        return new C1076h0(this, this.f5628v, 0, this.f5629w);
    }

    @Override
    final T f() {
        return new C1084i0(this, new C1092j0(this.f5628v, 0, this.f5629w));
    }

    @Override
    public final java.lang.Object get(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: R3.C1100k0.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.f5629w;
    }
}
