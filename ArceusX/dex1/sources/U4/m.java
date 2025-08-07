package u4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t4.C2911a;

public class m {

    @Deprecated
    public float f24007a;

    @Deprecated
    public float f24008b;

    @Deprecated
    public float f24009c;

    @Deprecated
    public float f24010d;

    @Deprecated
    public float f24011e;

    @Deprecated
    public float f24012f;

    private final List<f> f24013g = new ArrayList();

    private final List<g> f24014h = new ArrayList();

    private boolean f24015i;

    class a extends g {

        final List f24016c;

        final Matrix f24017d;

        a(List list, Matrix matrix) {
            this.f24016c = list;
            this.f24017d = matrix;
        }

        @Override
        public void a(Matrix matrix, C2911a c2911a, int i7, Canvas canvas) {
            Iterator it = this.f24016c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f24017d, c2911a, i7, canvas);
            }
        }
    }

    static class b extends g {

        private final d f24019c;

        public b(d dVar) {
            this.f24019c = dVar;
        }

        @Override
        public void a(Matrix matrix, C2911a c2911a, int i7, Canvas canvas) {
            c2911a.a(canvas, matrix, new RectF(this.f24019c.k(), this.f24019c.o(), this.f24019c.l(), this.f24019c.j()), i7, this.f24019c.m(), this.f24019c.n());
        }
    }

    static class c extends g {

        private final e f24020c;

        private final float f24021d;

        private final float f24022e;

        public c(e eVar, float f7, float f8) {
            this.f24020c = eVar;
            this.f24021d = f7;
            this.f24022e = f8;
        }

        @Override
        public void a(Matrix matrix, C2911a c2911a, int i7, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f24020c.f24031c - this.f24022e, this.f24020c.f24030b - this.f24021d), 0.0f);
            this.f24034a.set(matrix);
            this.f24034a.preTranslate(this.f24021d, this.f24022e);
            this.f24034a.preRotate(c());
            c2911a.b(canvas, this.f24034a, rectF, i7);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f24020c.f24031c - this.f24022e) / (this.f24020c.f24030b - this.f24021d)));
        }
    }

    public static class d extends f {

        private static final RectF f24023h = new RectF();

        @Deprecated
        public float f24024b;

        @Deprecated
        public float f24025c;

        @Deprecated
        public float f24026d;

        @Deprecated
        public float f24027e;

        @Deprecated
        public float f24028f;

        @Deprecated
        public float f24029g;

        public d(float f7, float f8, float f9, float f10) {
            q(f7);
            u(f8);
            r(f9);
            p(f10);
        }

        public float j() {
            return this.f24027e;
        }

        public float k() {
            return this.f24024b;
        }

        public float l() {
            return this.f24026d;
        }

        public float m() {
            return this.f24028f;
        }

        public float n() {
            return this.f24029g;
        }

        public float o() {
            return this.f24025c;
        }

        private void p(float f7) {
            this.f24027e = f7;
        }

        private void q(float f7) {
            this.f24024b = f7;
        }

        private void r(float f7) {
            this.f24026d = f7;
        }

        public void s(float f7) {
            this.f24028f = f7;
        }

        public void t(float f7) {
            this.f24029g = f7;
        }

        private void u(float f7) {
            this.f24025c = f7;
        }

        @Override
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f24032a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f24023h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        private float f24030b;

        private float f24031c;

        @Override
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f24032a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f24030b, this.f24031c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        protected final Matrix f24032a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        static final Matrix f24033b = new Matrix();

        final Matrix f24034a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, C2911a c2911a, int i7, Canvas canvas);

        public final void b(C2911a c2911a, int i7, Canvas canvas) {
            a(f24033b, c2911a, i7, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f7) {
        if (g() == f7) {
            return;
        }
        float fG = ((f7 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f24014h.add(new b(dVar));
        p(f7);
    }

    private void c(g gVar, float f7, float f8) {
        b(f7);
        this.f24014h.add(gVar);
        p(f8);
    }

    private float g() {
        return this.f24011e;
    }

    private float h() {
        return this.f24012f;
    }

    private void p(float f7) {
        this.f24011e = f7;
    }

    private void q(float f7) {
        this.f24012f = f7;
    }

    private void r(float f7) {
        this.f24009c = f7;
    }

    private void s(float f7) {
        this.f24010d = f7;
    }

    private void t(float f7) {
        this.f24007a = f7;
    }

    private void u(float f7) {
        this.f24008b = f7;
    }

    public void a(float f7, float f8, float f9, float f10, float f11, float f12) {
        d dVar = new d(f7, f8, f9, f10);
        dVar.s(f11);
        dVar.t(f12);
        this.f24013g.add(dVar);
        b bVar = new b(dVar);
        float f13 = f11 + f12;
        boolean z7 = f12 < 0.0f;
        if (z7) {
            f11 = (f11 + 180.0f) % 360.0f;
        }
        c(bVar, f11, z7 ? (180.0f + f13) % 360.0f : f13);
        double d7 = f13;
        r(((f7 + f9) * 0.5f) + (((f9 - f7) / 2.0f) * ((float) Math.cos(Math.toRadians(d7)))));
        s(((f8 + f10) * 0.5f) + (((f10 - f8) / 2.0f) * ((float) Math.sin(Math.toRadians(d7)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f24013g.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f24013g.get(i7).a(matrix, path);
        }
    }

    boolean e() {
        return this.f24015i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f24014h), new Matrix(matrix));
    }

    float i() {
        return this.f24009c;
    }

    float j() {
        return this.f24010d;
    }

    float k() {
        return this.f24007a;
    }

    float l() {
        return this.f24008b;
    }

    public void m(float f7, float f8) {
        e eVar = new e();
        eVar.f24030b = f7;
        eVar.f24031c = f8;
        this.f24013g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f7);
        s(f8);
    }

    public void n(float f7, float f8) {
        o(f7, f8, 270.0f, 0.0f);
    }

    public void o(float f7, float f8, float f9, float f10) {
        t(f7);
        u(f8);
        r(f7);
        s(f8);
        p(f9);
        q((f9 + f10) % 360.0f);
        this.f24013g.clear();
        this.f24014h.clear();
        this.f24015i = false;
    }
}
