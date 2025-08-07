package u4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {

    private final m[] f23989a = new m[4];

    private final Matrix[] f23990b = new Matrix[4];

    private final Matrix[] f23991c = new Matrix[4];

    private final PointF f23992d = new PointF();

    private final Path f23993e = new Path();

    private final Path f23994f = new Path();

    private final m f23995g = new m();

    private final float[] f23996h = new float[2];

    private final float[] f23997i = new float[2];

    private final Path f23998j = new Path();

    private final Path f23999k = new Path();

    private boolean f24000l = true;

    private static class a {

        static final l f24001a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i7);

        void b(m mVar, Matrix matrix, int i7);
    }

    static final class c {

        public final k f24002a;

        public final Path f24003b;

        public final RectF f24004c;

        public final b f24005d;

        public final float f24006e;

        c(k kVar, float f7, RectF rectF, b bVar, Path path) {
            this.f24005d = bVar;
            this.f24002a = kVar;
            this.f24006e = f7;
            this.f24004c = rectF;
            this.f24003b = path;
        }
    }

    public l() {
        for (int i7 = 0; i7 < 4; i7++) {
            this.f23989a[i7] = new m();
            this.f23990b[i7] = new Matrix();
            this.f23991c[i7] = new Matrix();
        }
    }

    private float a(int i7) {
        return ((i7 + 1) % 4) * 90;
    }

    private void b(c cVar, int i7) {
        this.f23996h[0] = this.f23989a[i7].k();
        this.f23996h[1] = this.f23989a[i7].l();
        this.f23990b[i7].mapPoints(this.f23996h);
        if (i7 == 0) {
            Path path = cVar.f24003b;
            float[] fArr = this.f23996h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f24003b;
            float[] fArr2 = this.f23996h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f23989a[i7].d(this.f23990b[i7], cVar.f24003b);
        b bVar = cVar.f24005d;
        if (bVar != null) {
            bVar.b(this.f23989a[i7], this.f23990b[i7], i7);
        }
    }

    private void c(c cVar, int i7) {
        int i8 = (i7 + 1) % 4;
        this.f23996h[0] = this.f23989a[i7].i();
        this.f23996h[1] = this.f23989a[i7].j();
        this.f23990b[i7].mapPoints(this.f23996h);
        this.f23997i[0] = this.f23989a[i8].k();
        this.f23997i[1] = this.f23989a[i8].l();
        this.f23990b[i8].mapPoints(this.f23997i);
        float f7 = this.f23996h[0];
        float[] fArr = this.f23997i;
        float fMax = Math.max(((float) Math.hypot(f7 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f24004c, i7);
        this.f23995g.n(0.0f, 0.0f);
        C2936f c2936fJ = j(i7, cVar.f24002a);
        c2936fJ.b(fMax, fI, cVar.f24006e, this.f23995g);
        this.f23998j.reset();
        this.f23995g.d(this.f23991c[i7], this.f23998j);
        if (this.f24000l && (c2936fJ.a() || l(this.f23998j, i7) || l(this.f23998j, i8))) {
            Path path = this.f23998j;
            path.op(path, this.f23994f, Path.Op.DIFFERENCE);
            this.f23996h[0] = this.f23995g.k();
            this.f23996h[1] = this.f23995g.l();
            this.f23991c[i7].mapPoints(this.f23996h);
            Path path2 = this.f23993e;
            float[] fArr2 = this.f23996h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f23995g.d(this.f23991c[i7], this.f23993e);
        } else {
            this.f23995g.d(this.f23991c[i7], cVar.f24003b);
        }
        b bVar = cVar.f24005d;
        if (bVar != null) {
            bVar.a(this.f23995g, this.f23991c[i7], i7);
        }
    }

    private void f(int i7, RectF rectF, PointF pointF) {
        if (i7 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i7 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i7 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private InterfaceC2933c g(int i7, k kVar) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private C2934d h(int i7, k kVar) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i7) {
        float[] fArr = this.f23996h;
        m mVar = this.f23989a[i7];
        fArr[0] = mVar.f24009c;
        fArr[1] = mVar.f24010d;
        this.f23990b[i7].mapPoints(fArr);
        return (i7 == 1 || i7 == 3) ? Math.abs(rectF.centerX() - this.f23996h[0]) : Math.abs(rectF.centerY() - this.f23996h[1]);
    }

    private C2936f j(int i7, k kVar) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.f24001a;
    }

    private boolean l(Path path, int i7) {
        this.f23999k.reset();
        this.f23989a[i7].d(this.f23990b[i7], this.f23999k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f23999k.computeBounds(rectF, true);
        path.op(this.f23999k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i7) {
        h(i7, cVar.f24002a).b(this.f23989a[i7], 90.0f, cVar.f24006e, cVar.f24004c, g(i7, cVar.f24002a));
        float fA = a(i7);
        this.f23990b[i7].reset();
        f(i7, cVar.f24004c, this.f23992d);
        Matrix matrix = this.f23990b[i7];
        PointF pointF = this.f23992d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f23990b[i7].preRotate(fA);
    }

    private void n(int i7) {
        this.f23996h[0] = this.f23989a[i7].i();
        this.f23996h[1] = this.f23989a[i7].j();
        this.f23990b[i7].mapPoints(this.f23996h);
        float fA = a(i7);
        this.f23991c[i7].reset();
        Matrix matrix = this.f23991c[i7];
        float[] fArr = this.f23996h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f23991c[i7].preRotate(fA);
    }

    public void d(k kVar, float f7, RectF rectF, Path path) {
        e(kVar, f7, rectF, null, path);
    }

    public void e(k kVar, float f7, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f23993e.rewind();
        this.f23994f.rewind();
        this.f23994f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f7, rectF, bVar, path);
        for (int i7 = 0; i7 < 4; i7++) {
            m(cVar, i7);
            n(i7);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            b(cVar, i8);
            c(cVar, i8);
        }
        path.close();
        this.f23993e.close();
        if (this.f23993e.isEmpty()) {
            return;
        }
        path.op(this.f23993e, Path.Op.UNION);
    }
}
