package N3;

import java.util.Arrays;

public final class C0537h {

    Object[] f2612a = new Object[8];

    int f2613b = 0;

    C0536g f2614c;

    public final C0537h a(Object obj, Object obj2) {
        int i7 = this.f2613b + 1;
        Object[] objArr = this.f2612a;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            this.f2612a = Arrays.copyOf(objArr, C0531b.a(length, i8));
        }
        b0.a(obj, obj2);
        Object[] objArr2 = this.f2612a;
        int i9 = this.f2613b;
        int i10 = i9 + i9;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f2613b = i9 + 1;
        return this;
    }

    public final AbstractC0538i b() {
        C0536g c0536g = this.f2614c;
        if (c0536g != null) {
            throw c0536g.a();
        }
        C0546q c0546qH = C0546q.h(this.f2613b, this.f2612a, this);
        C0536g c0536g2 = this.f2614c;
        if (c0536g2 == null) {
            return c0546qH;
        }
        throw c0536g2.a();
    }
}
