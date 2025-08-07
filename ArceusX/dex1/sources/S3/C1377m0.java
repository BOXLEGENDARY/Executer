package S3;

import java.util.Objects;

final class C1377m0 extends O {

    final transient Object[] f7019v;

    private C1377m0(Object obj, Object[] objArr, int i7) {
        this.f7019v = objArr;
    }

    static C1377m0 h(int i7, Object[] objArr, N n7) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        r.b(obj, obj2);
        return new C1377m0(null, objArr, 1);
    }

    @Override
    final H a() {
        return new C1366l0(this.f7019v, 1, 1);
    }

    @Override
    final P d() {
        return new C1344j0(this, this.f7019v, 0, 1);
    }

    @Override
    final P f() {
        return new C1355k0(this, new C1366l0(this.f7019v, 0, 1));
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: S3.C1377m0.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return 1;
    }
}
