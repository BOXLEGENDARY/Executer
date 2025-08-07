package X1;

import S1.a;
import S1.p;
import W1.h;
import W1.m;
import X1.e;
import Z1.C0438j;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class b implements R1.e, a.b, U1.f {
    BlurMaskFilter A;
    private final Path a = new Path();
    private final Matrix b = new Matrix();
    private final Paint c = new Q1.a(1);
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final RectF h;
    private final RectF i;
    private final RectF j;
    private final RectF k;
    private final String l;
    final Matrix m;
    final com.airbnb.lottie.a n;
    final e o;
    private S1.h p;
    private S1.d q;
    private b r;
    private b s;
    private List<b> t;
    private final List<S1.a<?, ?>> u;
    final p v;
    private boolean w;
    private boolean x;
    private Paint y;
    float z;

    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] iArr = new int[h.a.values().length];
            b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(com.airbnb.lottie.a aVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.d = new Q1.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.e = new Q1.a(1, mode2);
        Q1.a aVar2 = new Q1.a(1);
        this.f = aVar2;
        this.g = new Q1.a(PorterDuff.Mode.CLEAR);
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.m = new Matrix();
        this.u = new ArrayList();
        this.w = true;
        this.z = 0.0f;
        this.n = aVar;
        this.o = eVar;
        this.l = eVar.i() + "#draw";
        if (eVar.h() == e.b.INVERT) {
            aVar2.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar2.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.w().b();
        this.v = pVarB;
        pVarB.b(this);
        if (eVar.g() != null && !eVar.g().isEmpty()) {
            S1.h hVar = new S1.h(eVar.g());
            this.p = hVar;
            Iterator<S1.a<m, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (S1.a<Integer, Integer> aVar3 : this.p.c()) {
                h(aVar3);
                aVar3.a(this);
            }
        }
        M();
    }

    private void A(RectF rectF, Matrix matrix) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (y()) {
            int size = this.p.b().size();
            for (int i = 0; i < size; i++) {
                W1.h hVar = this.p.b().get(i);
                Path pathH = this.p.a().get(i).h();
                if (pathH != null) {
                    this.a.set(pathH);
                    this.a.transform(matrix);
                    int i2 = a.b[hVar.a().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && hVar.d()) {
                        return;
                    }
                    this.a.computeBounds(this.k, false);
                    if (i == 0) {
                        this.i.set(this.k);
                    } else {
                        RectF rectF2 = this.i;
                        rectF2.set(Math.min(rectF2.left, this.k.left), Math.min(this.i.top, this.k.top), Math.max(this.i.right, this.k.right), Math.max(this.i.bottom, this.k.bottom));
                    }
                }
            }
            if (rectF.intersect(this.i)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void B(RectF rectF, Matrix matrix) {
        if (z() && this.o.h() != e.b.INVERT) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.r.c(this.j, matrix, true);
            if (rectF.intersect(this.j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C() {
        this.n.invalidateSelf();
    }

    public void D() {
        L(this.q.p() == 1.0f);
    }

    private void E(float f) {
        this.n.q().n().a(this.o.i(), f);
    }

    private void L(boolean z) {
        if (z != this.w) {
            this.w = z;
            C();
        }
    }

    private void M() {
        if (this.o.e().isEmpty()) {
            L(true);
            return;
        }
        S1.d dVar = new S1.d(this.o.e());
        this.q = dVar;
        dVar.l();
        this.q.a(new a.b() {
            @Override
            public final void a() {
                this.a.D();
            }
        });
        L(this.q.h().floatValue() == 1.0f);
        h(this.q);
    }

    private void i(Canvas canvas, Matrix matrix, S1.a<m, Path> aVar, S1.a<Integer, Integer> aVar2) {
        this.a.set(aVar.h());
        this.a.transform(matrix);
        this.c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.c);
    }

    private void j(Canvas canvas, Matrix matrix, S1.a<m, Path> aVar, S1.a<Integer, Integer> aVar2) {
        b2.h.m(canvas, this.h, this.d);
        this.a.set(aVar.h());
        this.a.transform(matrix);
        this.c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.c);
        canvas.restore();
    }

    private void k(Canvas canvas, Matrix matrix, S1.a<m, Path> aVar, S1.a<Integer, Integer> aVar2) {
        b2.h.m(canvas, this.h, this.c);
        canvas.drawRect(this.h, this.c);
        this.a.set(aVar.h());
        this.a.transform(matrix);
        this.c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, S1.a<m, Path> aVar, S1.a<Integer, Integer> aVar2) {
        b2.h.m(canvas, this.h, this.d);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.a.set(aVar.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, S1.a<m, Path> aVar, S1.a<Integer, Integer> aVar2) {
        b2.h.m(canvas, this.h, this.e);
        canvas.drawRect(this.h, this.c);
        this.e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.a.set(aVar.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix) {
        P1.c.a("Layer#saveLayer");
        b2.h.n(canvas, this.h, this.d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            r(canvas);
        }
        P1.c.b("Layer#saveLayer");
        for (int i = 0; i < this.p.b().size(); i++) {
            W1.h hVar = this.p.b().get(i);
            S1.a<m, Path> aVar = this.p.a().get(i);
            S1.a<Integer, Integer> aVar2 = this.p.c().get(i);
            int i2 = a.b[hVar.a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.c.setColor(-16777216);
                        this.c.setAlpha(255);
                        canvas.drawRect(this.h, this.c);
                    }
                    if (hVar.d()) {
                        m(canvas, matrix, aVar, aVar2);
                    } else {
                        o(canvas, matrix, aVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (hVar.d()) {
                            k(canvas, matrix, aVar, aVar2);
                        } else {
                            i(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.d()) {
                    l(canvas, matrix, aVar, aVar2);
                } else {
                    j(canvas, matrix, aVar, aVar2);
                }
            } else if (p()) {
                this.c.setAlpha(255);
                canvas.drawRect(this.h, this.c);
            }
        }
        P1.c.a("Layer#restoreLayer");
        canvas.restore();
        P1.c.b("Layer#restoreLayer");
    }

    private void o(Canvas canvas, Matrix matrix, S1.a<m, Path> aVar) {
        this.a.set(aVar.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.e);
    }

    private boolean p() {
        if (this.p.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.p.b().size(); i++) {
            if (this.p.b().get(i).a() != h.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void q() {
        if (this.t != null) {
            return;
        }
        if (this.s == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList();
        for (b bVar = this.s; bVar != null; bVar = bVar.s) {
            this.t.add(bVar);
        }
    }

    private void r(Canvas canvas) {
        P1.c.a("Layer#clearLayer");
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.g);
        P1.c.b("Layer#clearLayer");
    }

    static b t(c cVar, e eVar, com.airbnb.lottie.a aVar, P1.d dVar) {
        switch (a.a[eVar.f().ordinal()]) {
            case 1:
                return new g(aVar, eVar, cVar);
            case 2:
                return new c(aVar, eVar, dVar.o(eVar.m()), dVar);
            case 3:
                return new h(aVar, eVar);
            case 4:
                return new d(aVar, eVar);
            case 5:
                return new f(aVar, eVar);
            case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                return new i(aVar, eVar);
            default:
                b2.d.c("Unknown layer type " + eVar.f());
                return null;
        }
    }

    public void F(S1.a<?, ?> aVar) {
        this.u.remove(aVar);
    }

    void G(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
    }

    void H(b bVar) {
        this.r = bVar;
    }

    void I(boolean z) {
        if (z && this.y == null) {
            this.y = new Q1.a();
        }
        this.x = z;
    }

    void J(b bVar) {
        this.s = bVar;
    }

    void K(float f) {
        this.v.j(f);
        if (this.p != null) {
            for (int i = 0; i < this.p.a().size(); i++) {
                this.p.a().get(i).m(f);
            }
        }
        S1.d dVar = this.q;
        if (dVar != null) {
            dVar.m(f);
        }
        b bVar = this.r;
        if (bVar != null) {
            bVar.K(f);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            this.u.get(i2).m(f);
        }
    }

    @Override
    public void a() {
        C();
    }

    @Override
    public void b(List<R1.c> list, List<R1.c> list2) {
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        q();
        this.m.set(matrix);
        if (z) {
            List<b> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.m.preConcat(this.t.get(size).v.f());
                }
            } else {
                b bVar = this.s;
                if (bVar != null) {
                    this.m.preConcat(bVar.v.f());
                }
            }
        }
        this.m.preConcat(this.v.f());
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        b bVar = this.r;
        if (bVar != null) {
            U1.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.r.getName(), i)) {
                list.add(eVarA.i(this.r));
            }
            if (eVar.h(getName(), i)) {
                this.r.G(eVar, eVar.e(this.r.getName(), i) + i, list, eVarA);
            }
        }
        if (eVar.g(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i)) {
                G(eVar, i + eVar.e(getName(), i), list, eVar2);
            }
        }
    }

    @Override
    public void f(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        P1.c.a(this.l);
        if (!this.w || this.o.x()) {
            P1.c.b(this.l);
            return;
        }
        q();
        P1.c.a("Layer#parentMatrix");
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.b.preConcat(this.t.get(size).v.f());
        }
        P1.c.b("Layer#parentMatrix");
        int iIntValue = (int) ((((i / 255.0f) * (this.v.h() == null ? 100 : this.v.h().h().intValue())) / 100.0f) * 255.0f);
        if (!z() && !y()) {
            this.b.preConcat(this.v.f());
            P1.c.a("Layer#drawLayer");
            s(canvas, this.b, iIntValue);
            P1.c.b("Layer#drawLayer");
            E(P1.c.b(this.l));
            return;
        }
        P1.c.a("Layer#computeBounds");
        c(this.h, this.b, false);
        B(this.h, matrix);
        this.b.preConcat(this.v.f());
        A(this.h, this.b);
        if (!this.h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        P1.c.b("Layer#computeBounds");
        if (this.h.width() >= 1.0f && this.h.height() >= 1.0f) {
            P1.c.a("Layer#saveLayer");
            this.c.setAlpha(255);
            b2.h.m(canvas, this.h, this.c);
            P1.c.b("Layer#saveLayer");
            r(canvas);
            P1.c.a("Layer#drawLayer");
            s(canvas, this.b, iIntValue);
            P1.c.b("Layer#drawLayer");
            if (y()) {
                n(canvas, this.b);
            }
            if (z()) {
                P1.c.a("Layer#drawMatte");
                P1.c.a("Layer#saveLayer");
                b2.h.n(canvas, this.h, this.f, 19);
                P1.c.b("Layer#saveLayer");
                r(canvas);
                this.r.f(canvas, matrix, iIntValue);
                P1.c.a("Layer#restoreLayer");
                canvas.restore();
                P1.c.b("Layer#restoreLayer");
                P1.c.b("Layer#drawMatte");
            }
            P1.c.a("Layer#restoreLayer");
            canvas.restore();
            P1.c.b("Layer#restoreLayer");
        }
        if (this.x && (paint = this.y) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.y.setColor(-251901);
            this.y.setStrokeWidth(4.0f);
            canvas.drawRect(this.h, this.y);
            this.y.setStyle(Paint.Style.FILL);
            this.y.setColor(1357638635);
            canvas.drawRect(this.h, this.y);
        }
        E(P1.c.b(this.l));
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        this.v.c(t, cVar);
    }

    @Override
    public String getName() {
        return this.o.i();
    }

    public void h(S1.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.u.add(aVar);
    }

    abstract void s(Canvas canvas, Matrix matrix, int i);

    public W1.a u() {
        return this.o.a();
    }

    public BlurMaskFilter v(float f) {
        if (this.z == f) {
            return this.A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.A = blurMaskFilter;
        this.z = f;
        return blurMaskFilter;
    }

    public C0438j w() {
        return this.o.c();
    }

    e x() {
        return this.o;
    }

    boolean y() {
        S1.h hVar = this.p;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean z() {
        return this.r != null;
    }
}
