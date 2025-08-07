package Q3;

final class X5 extends P5 {

    static final P5 f4262y = new X5(null, new Object[0], 0);

    final transient Object[] f4263v;

    private final transient int f4264w;

    private X5(Object obj, Object[] objArr, int i7) {
        this.f4263v = objArr;
        this.f4264w = i7;
    }

    static X5 h(int i7, Object[] objArr, O5 o52) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C0907j3.a(obj, obj2);
        return new X5(null, objArr, 1);
    }

    @Override
    final M4 a() {
        return new W5(this.f4263v, 1, this.f4264w);
    }

    @Override
    final Q5 d() {
        return new U5(this, this.f4263v, 0, this.f4264w);
    }

    @Override
    final Q5 f() {
        return new V5(this, new W5(this.f4263v, 0, this.f4264w));
    }

    @Override
    public final java.lang.Object get(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: Q3.X5.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.f4264w;
    }
}
