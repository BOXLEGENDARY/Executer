package r5;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import n3.C2651i;
import s5.InterfaceC2885a;
import v5.C2947b;

public class C2756a {

    private final InterfaceC2885a f22921a;

    private final Rect f22922b;

    private final Point[] f22923c;

    public C2756a(InterfaceC2885a interfaceC2885a, Matrix matrix) {
        this.f22921a = (InterfaceC2885a) C2651i.l(interfaceC2885a);
        Rect rectA = interfaceC2885a.a();
        if (rectA != null && matrix != null) {
            C2947b.e(rectA, matrix);
        }
        this.f22922b = rectA;
        Point[] pointArrD = interfaceC2885a.d();
        if (pointArrD != null && matrix != null) {
            C2947b.b(pointArrD, matrix);
        }
        this.f22923c = pointArrD;
    }

    public Rect a() {
        return this.f22922b;
    }

    public Point[] b() {
        return this.f22923c;
    }

    public int c() {
        int i7 = this.f22921a.i();
        if (i7 > 4096 || i7 == 0) {
            return -1;
        }
        return i7;
    }

    public String d() {
        return this.f22921a.b();
    }

    public int e() {
        return this.f22921a.c();
    }
}
