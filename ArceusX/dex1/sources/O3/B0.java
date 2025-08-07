package O3;

import java.util.Objects;

final class B0 extends AbstractC0655j0 {

    final transient Object[] f2721v;

    private B0(Object obj, Object[] objArr, int i7) {
        this.f2721v = objArr;
    }

    static B0 h(int i7, Object[] objArr, C0644i0 c0644i0) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        L.b(obj, obj2);
        return new B0(null, objArr, 1);
    }

    @Override
    final AbstractC0578c0 a() {
        return new A0(this.f2721v, 1, 1);
    }

    @Override
    final AbstractC0666k0 d() {
        return new C0819y0(this, this.f2721v, 0, 1);
    }

    @Override
    final AbstractC0666k0 f() {
        return new C0830z0(this, new A0(this.f2721v, 0, 1));
    }

    @Override
    public final java.lang.Object get(java.lang.Object r4) {
        throw new UnsupportedOperationException("Method not decompiled: O3.B0.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return 1;
    }
}
