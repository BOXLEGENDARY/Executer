package u4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import c4.C1746b;
import java.util.BitSet;
import k4.C2517a;
import m4.C2582a;
import t4.C2911a;
import u4.k;
import u4.l;
import u4.m;
import x0.C2985b;

public class C2937g extends Drawable implements n {

    private static final String f23912Q = "g";

    private static final Paint f23913R;

    private final Path f23914A;

    private final RectF f23915B;

    private final RectF f23916C;

    private final Region f23917D;

    private final Region f23918E;

    private k f23919F;

    private final Paint f23920G;

    private final Paint f23921H;

    private final C2911a f23922I;

    private final l.b f23923J;

    private final l f23924K;

    private PorterDuffColorFilter f23925L;

    private PorterDuffColorFilter f23926M;

    private int f23927N;

    private final RectF f23928O;

    private boolean f23929P;

    private c f23930d;

    private final m.g[] f23931e;

    private final m.g[] f23932i;

    private final BitSet f23933v;

    private boolean f23934w;

    private final Matrix f23935y;

    private final Path f23936z;

    class a implements l.b {
        a() {
        }

        @Override
        public void a(m mVar, Matrix matrix, int i7) {
            C2937g.this.f23933v.set(i7 + 4, mVar.e());
            C2937g.this.f23932i[i7] = mVar.f(matrix);
        }

        @Override
        public void b(m mVar, Matrix matrix, int i7) {
            C2937g.this.f23933v.set(i7, mVar.e());
            C2937g.this.f23931e[i7] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        final float f23938a;

        b(float f7) {
            this.f23938a = f7;
        }

        @Override
        public InterfaceC2933c a(InterfaceC2933c interfaceC2933c) {
            return interfaceC2933c instanceof i ? interfaceC2933c : new C2932b(this.f23938a, interfaceC2933c);
        }
    }

    static {
        Paint paint = new Paint(1);
        f23913R = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2937g() {
        this(new k());
    }

    private float G() {
        if (P()) {
            return this.f23921H.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean N() {
        c cVar = this.f23930d;
        int i7 = cVar.f23956q;
        return i7 != 1 && cVar.f23957r > 0 && (i7 == 2 || X());
    }

    private boolean O() {
        Paint.Style style = this.f23930d.f23961v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean P() {
        Paint.Style style = this.f23930d.f23961v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f23921H.getStrokeWidth() > 0.0f;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f23929P) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f23928O.width() - getBounds().width());
            int iHeight = (int) (this.f23928O.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f23928O.width()) + (this.f23930d.f23957r * 2) + iWidth, ((int) this.f23928O.height()) + (this.f23930d.f23957r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f7 = (getBounds().left - this.f23930d.f23957r) - iWidth;
            float f8 = (getBounds().top - this.f23930d.f23957r) - iHeight;
            canvas2.translate(-f7, -f8);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f7, f8, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int V(int i7, int i8) {
        return (i7 * (i8 + (i8 >>> 7))) >>> 8;
    }

    private void W(Canvas canvas) {
        canvas.translate(B(), C());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z7) {
        if (!z7) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f23927N = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f23930d.f23949j != 1.0f) {
            this.f23935y.reset();
            Matrix matrix = this.f23935y;
            float f7 = this.f23930d.f23949j;
            matrix.setScale(f7, f7, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f23935y);
        }
        path.computeBounds(this.f23928O, true);
    }

    private void i() {
        k kVarY = E().y(new b(-G()));
        this.f23919F = kVarY;
        this.f23924K.d(kVarY, this.f23930d.f23950k, v(), this.f23914A);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z7) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z7) {
            colorForState = l(colorForState);
        }
        this.f23927N = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z7) {
        return (colorStateList == null || mode == null) ? f(paint, z7) : j(colorStateList, mode, z7);
    }

    private boolean k0(int[] iArr) {
        boolean z7;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f23930d.f23943d == null || color2 == (colorForState2 = this.f23930d.f23943d.getColorForState(iArr, (color2 = this.f23920G.getColor())))) {
            z7 = false;
        } else {
            this.f23920G.setColor(colorForState2);
            z7 = true;
        }
        if (this.f23930d.f23944e == null || color == (colorForState = this.f23930d.f23944e.getColorForState(iArr, (color = this.f23921H.getColor())))) {
            return z7;
        }
        this.f23921H.setColor(colorForState);
        return true;
    }

    private boolean l0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f23925L;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f23926M;
        c cVar = this.f23930d;
        this.f23925L = k(cVar.f23946g, cVar.f23947h, this.f23920G, true);
        c cVar2 = this.f23930d;
        this.f23926M = k(cVar2.f23945f, cVar2.f23947h, this.f23921H, false);
        c cVar3 = this.f23930d;
        if (cVar3.f23960u) {
            this.f23922I.d(cVar3.f23946g.getColorForState(getState(), 0));
        }
        return (C2985b.a(porterDuffColorFilter, this.f23925L) && C2985b.a(porterDuffColorFilter2, this.f23926M)) ? false : true;
    }

    public static C2937g m(Context context, float f7, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C2517a.c(context, C1746b.f12751n, C2937g.class.getSimpleName()));
        }
        C2937g c2937g = new C2937g();
        c2937g.Q(context);
        c2937g.a0(colorStateList);
        c2937g.Z(f7);
        return c2937g;
    }

    private void m0() {
        float fM = M();
        this.f23930d.f23957r = (int) Math.ceil(0.75f * fM);
        this.f23930d.f23958s = (int) Math.ceil(fM * 0.25f);
        l0();
        R();
    }

    private void n(Canvas canvas) {
        if (this.f23933v.cardinality() > 0) {
            Log.w(f23912Q, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f23930d.f23958s != 0) {
            canvas.drawPath(this.f23936z, this.f23922I.c());
        }
        for (int i7 = 0; i7 < 4; i7++) {
            this.f23931e[i7].b(this.f23922I, this.f23930d.f23957r, canvas);
            this.f23932i[i7].b(this.f23922I, this.f23930d.f23957r, canvas);
        }
        if (this.f23929P) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f23936z, f23913R);
            canvas.translate(iB, iC);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f23920G, this.f23936z, this.f23930d.f23940a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f23930d.f23950k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF v() {
        this.f23916C.set(u());
        float fG = G();
        this.f23916C.inset(fG, fG);
        return this.f23916C;
    }

    public int A() {
        return this.f23927N;
    }

    public int B() {
        c cVar = this.f23930d;
        return (int) (cVar.f23958s * Math.sin(Math.toRadians(cVar.f23959t)));
    }

    public int C() {
        c cVar = this.f23930d;
        return (int) (cVar.f23958s * Math.cos(Math.toRadians(cVar.f23959t)));
    }

    public int D() {
        return this.f23930d.f23957r;
    }

    public k E() {
        return this.f23930d.f23940a;
    }

    public ColorStateList F() {
        return this.f23930d.f23944e;
    }

    public float H() {
        return this.f23930d.f23951l;
    }

    public ColorStateList I() {
        return this.f23930d.f23946g;
    }

    public float J() {
        return this.f23930d.f23940a.r().a(u());
    }

    public float K() {
        return this.f23930d.f23940a.t().a(u());
    }

    public float L() {
        return this.f23930d.f23955p;
    }

    public float M() {
        return w() + L();
    }

    public void Q(Context context) {
        this.f23930d.f23941b = new C2582a(context);
        m0();
    }

    public boolean S() {
        C2582a c2582a = this.f23930d.f23941b;
        return c2582a != null && c2582a.d();
    }

    public boolean T() {
        return this.f23930d.f23940a.u(u());
    }

    public boolean X() {
        return (T() || this.f23936z.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(InterfaceC2933c interfaceC2933c) {
        setShapeAppearanceModel(this.f23930d.f23940a.x(interfaceC2933c));
    }

    public void Z(float f7) {
        c cVar = this.f23930d;
        if (cVar.f23954o != f7) {
            cVar.f23954o = f7;
            m0();
        }
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f23930d;
        if (cVar.f23943d != colorStateList) {
            cVar.f23943d = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f7) {
        c cVar = this.f23930d;
        if (cVar.f23950k != f7) {
            cVar.f23950k = f7;
            this.f23934w = true;
            invalidateSelf();
        }
    }

    public void c0(int i7, int i8, int i9, int i10) {
        c cVar = this.f23930d;
        if (cVar.f23948i == null) {
            cVar.f23948i = new Rect();
        }
        this.f23930d.f23948i.set(i7, i8, i9, i10);
        invalidateSelf();
    }

    public void d0(float f7) {
        c cVar = this.f23930d;
        if (cVar.f23953n != f7) {
            cVar.f23953n = f7;
            m0();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        this.f23920G.setColorFilter(this.f23925L);
        int alpha = this.f23920G.getAlpha();
        this.f23920G.setAlpha(V(alpha, this.f23930d.f23952m));
        this.f23921H.setColorFilter(this.f23926M);
        this.f23921H.setStrokeWidth(this.f23930d.f23951l);
        int alpha2 = this.f23921H.getAlpha();
        this.f23921H.setAlpha(V(alpha2, this.f23930d.f23952m));
        if (this.f23934w) {
            i();
            g(u(), this.f23936z);
            this.f23934w = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f23920G.setAlpha(alpha);
        this.f23921H.setAlpha(alpha2);
    }

    public void e0(boolean z7) {
        this.f23929P = z7;
    }

    public void f0(int i7) {
        this.f23922I.d(i7);
        this.f23930d.f23960u = false;
        R();
    }

    public void g0(float f7, int i7) {
        j0(f7);
        i0(ColorStateList.valueOf(i7));
    }

    @Override
    public int getAlpha() {
        return this.f23930d.f23952m;
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        return this.f23930d;
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void getOutline(Outline outline) {
        if (this.f23930d.f23956q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f23930d.f23950k);
        } else {
            g(u(), this.f23936z);
            com.google.android.material.drawable.d.k(outline, this.f23936z);
        }
    }

    @Override
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f23930d.f23948i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override
    public Region getTransparentRegion() {
        this.f23917D.set(getBounds());
        g(u(), this.f23936z);
        this.f23918E.setPath(this.f23936z, this.f23917D);
        this.f23917D.op(this.f23918E, Region.Op.DIFFERENCE);
        return this.f23917D;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.f23924K;
        c cVar = this.f23930d;
        lVar.e(cVar.f23940a, cVar.f23950k, rectF, this.f23923J, path);
    }

    public void h0(float f7, ColorStateList colorStateList) {
        j0(f7);
        i0(colorStateList);
    }

    public void i0(ColorStateList colorStateList) {
        c cVar = this.f23930d;
        if (cVar.f23944e != colorStateList) {
            cVar.f23944e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override
    public void invalidateSelf() {
        this.f23934w = true;
        super.invalidateSelf();
    }

    @Override
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f23930d.f23946g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f23930d.f23945f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f23930d.f23944e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f23930d.f23943d) != null && colorStateList4.isStateful())));
    }

    public void j0(float f7) {
        this.f23930d.f23951l = f7;
        invalidateSelf();
    }

    protected int l(int i7) {
        float fM = M() + z();
        C2582a c2582a = this.f23930d.f23941b;
        return c2582a != null ? c2582a.c(i7, fM) : i7;
    }

    @Override
    public Drawable mutate() {
        this.f23930d = new c(this.f23930d);
        return this;
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        this.f23934w = true;
        super.onBoundsChange(rect);
    }

    @Override
    protected boolean onStateChange(int[] iArr) {
        boolean z7 = k0(iArr) || l0();
        if (z7) {
            invalidateSelf();
        }
        return z7;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f23930d.f23940a, rectF);
    }

    protected void r(Canvas canvas) {
        q(canvas, this.f23921H, this.f23914A, this.f23919F, v());
    }

    public float s() {
        return this.f23930d.f23940a.j().a(u());
    }

    @Override
    public void setAlpha(int i7) {
        c cVar = this.f23930d;
        if (cVar.f23952m != i7) {
            cVar.f23952m = i7;
            R();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23930d.f23942c = colorFilter;
        R();
    }

    @Override
    public void setShapeAppearanceModel(k kVar) {
        this.f23930d.f23940a = kVar;
        invalidateSelf();
    }

    @Override
    public void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        this.f23930d.f23946g = colorStateList;
        l0();
        R();
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f23930d;
        if (cVar.f23947h != mode) {
            cVar.f23947h = mode;
            l0();
            R();
        }
    }

    public float t() {
        return this.f23930d.f23940a.l().a(u());
    }

    protected RectF u() {
        this.f23915B.set(getBounds());
        return this.f23915B;
    }

    public float w() {
        return this.f23930d.f23954o;
    }

    public ColorStateList x() {
        return this.f23930d.f23943d;
    }

    public float y() {
        return this.f23930d.f23950k;
    }

    public float z() {
        return this.f23930d.f23953n;
    }

    public C2937g(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(k.e(context, attributeSet, i7, i8).m());
    }

    public C2937g(k kVar) {
        this(new c(kVar, null));
    }

    protected C2937g(c cVar) {
        l lVar;
        this.f23931e = new m.g[4];
        this.f23932i = new m.g[4];
        this.f23933v = new BitSet(8);
        this.f23935y = new Matrix();
        this.f23936z = new Path();
        this.f23914A = new Path();
        this.f23915B = new RectF();
        this.f23916C = new RectF();
        this.f23917D = new Region();
        this.f23918E = new Region();
        Paint paint = new Paint(1);
        this.f23920G = paint;
        Paint paint2 = new Paint(1);
        this.f23921H = paint2;
        this.f23922I = new C2911a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f23924K = lVar;
        this.f23928O = new RectF();
        this.f23929P = true;
        this.f23930d = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l0();
        k0(getState());
        this.f23923J = new a();
    }

    public static class c extends Drawable.ConstantState {

        k f23940a;

        C2582a f23941b;

        ColorFilter f23942c;

        ColorStateList f23943d;

        ColorStateList f23944e;

        ColorStateList f23945f;

        ColorStateList f23946g;

        PorterDuff.Mode f23947h;

        Rect f23948i;

        float f23949j;

        float f23950k;

        float f23951l;

        int f23952m;

        float f23953n;

        float f23954o;

        float f23955p;

        int f23956q;

        int f23957r;

        int f23958s;

        int f23959t;

        boolean f23960u;

        Paint.Style f23961v;

        public c(k kVar, C2582a c2582a) {
            this.f23943d = null;
            this.f23944e = null;
            this.f23945f = null;
            this.f23946g = null;
            this.f23947h = PorterDuff.Mode.SRC_IN;
            this.f23948i = null;
            this.f23949j = 1.0f;
            this.f23950k = 1.0f;
            this.f23952m = 255;
            this.f23953n = 0.0f;
            this.f23954o = 0.0f;
            this.f23955p = 0.0f;
            this.f23956q = 0;
            this.f23957r = 0;
            this.f23958s = 0;
            this.f23959t = 0;
            this.f23960u = false;
            this.f23961v = Paint.Style.FILL_AND_STROKE;
            this.f23940a = kVar;
            this.f23941b = c2582a;
        }

        @Override
        public int getChangingConfigurations() {
            return 0;
        }

        @Override
        public Drawable newDrawable() {
            C2937g c2937g = new C2937g(this);
            c2937g.f23934w = true;
            return c2937g;
        }

        public c(c cVar) {
            this.f23943d = null;
            this.f23944e = null;
            this.f23945f = null;
            this.f23946g = null;
            this.f23947h = PorterDuff.Mode.SRC_IN;
            this.f23948i = null;
            this.f23949j = 1.0f;
            this.f23950k = 1.0f;
            this.f23952m = 255;
            this.f23953n = 0.0f;
            this.f23954o = 0.0f;
            this.f23955p = 0.0f;
            this.f23956q = 0;
            this.f23957r = 0;
            this.f23958s = 0;
            this.f23959t = 0;
            this.f23960u = false;
            this.f23961v = Paint.Style.FILL_AND_STROKE;
            this.f23940a = cVar.f23940a;
            this.f23941b = cVar.f23941b;
            this.f23951l = cVar.f23951l;
            this.f23942c = cVar.f23942c;
            this.f23943d = cVar.f23943d;
            this.f23944e = cVar.f23944e;
            this.f23947h = cVar.f23947h;
            this.f23946g = cVar.f23946g;
            this.f23952m = cVar.f23952m;
            this.f23949j = cVar.f23949j;
            this.f23958s = cVar.f23958s;
            this.f23956q = cVar.f23956q;
            this.f23960u = cVar.f23960u;
            this.f23950k = cVar.f23950k;
            this.f23953n = cVar.f23953n;
            this.f23954o = cVar.f23954o;
            this.f23955p = cVar.f23955p;
            this.f23957r = cVar.f23957r;
            this.f23959t = cVar.f23959t;
            this.f23945f = cVar.f23945f;
            this.f23961v = cVar.f23961v;
            if (cVar.f23948i != null) {
                this.f23948i = new Rect(cVar.f23948i);
            }
        }
    }
}
