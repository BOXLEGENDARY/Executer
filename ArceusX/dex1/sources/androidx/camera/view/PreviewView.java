package androidx.camera.view;

import C.I;
import C.J;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.C1709w;
import android.view.Display;
import android.view.LiveData;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.q;
import androidx.core.view.Z;
import b0.C1739a;
import c0.C1744a;
import e0.C2410b;
import java.util.concurrent.atomic.AtomicReference;
import z.AbstractC3051h0;
import z.C3043d0;
import z.F0;
import z.I0;
import z.T;
import z.o0;

public final class PreviewView extends FrameLayout {

    private static final c f9584I = c.PERFORMANCE;

    AbstractC1601c f9585A;

    r f9586B;

    private final C1739a f9587C;

    I f9588D;

    private MotionEvent f9589E;

    private final b f9590F;

    private final View.OnLayoutChangeListener f9591G;

    final o0.c f9592H;

    c f9593d;

    q f9594e;

    final a0.k f9595i;

    final m f9596v;

    boolean f9597w;

    final C1709w<e> f9598y;

    final AtomicReference<l> f9599z;

    class a implements o0.c {
        a() {
        }

        public void e(F0 f02) {
            PreviewView.this.f9592H.a(f02);
        }

        public void f(J j7, F0 f02, F0.h hVar) {
            PreviewView previewView;
            q qVar;
            C3043d0.a("PreviewView", "Preview transformation info updated. " + hVar);
            PreviewView.this.f9596v.r(hVar, f02.p(), j7.q().h() == 0);
            if (hVar.d() == -1 || ((qVar = (previewView = PreviewView.this).f9594e) != null && (qVar instanceof z))) {
                PreviewView.this.f9597w = true;
            } else {
                previewView.f9597w = false;
            }
            PreviewView.this.g();
        }

        public void g(l lVar, J j7) {
            if (a0.g.a(PreviewView.this.f9599z, lVar, null)) {
                lVar.l(e.IDLE);
            }
            lVar.f();
            j7.b().b(lVar);
        }

        @Override
        public void a(final F0 f02) {
            q zVar;
            if (!E.p.c()) {
                androidx.core.content.a.h(PreviewView.this.getContext()).execute(new Runnable() {
                    @Override
                    public final void run() {
                        this.f9691d.e(f02);
                    }
                });
                return;
            }
            C3043d0.a("PreviewView", "Surface requested by Preview.");
            final J jL = f02.l();
            PreviewView.this.f9588D = jL.q();
            PreviewView.this.f9586B.g(jL.h().h());
            f02.E(androidx.core.content.a.h(PreviewView.this.getContext()), new F0.i() {
                @Override
                public final void a(F0.h hVar) {
                    this.f9693a.f(jL, f02, hVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.h(previewView.f9594e, f02, previewView.f9593d)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.i(f02, previewView2.f9593d)) {
                    PreviewView previewView3 = PreviewView.this;
                    zVar = new F(previewView3, previewView3.f9596v);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    zVar = new z(previewView4, previewView4.f9596v);
                }
                previewView2.f9594e = zVar;
            }
            I iQ = jL.q();
            PreviewView previewView5 = PreviewView.this;
            final l lVar = new l(iQ, previewView5.f9598y, previewView5.f9594e);
            PreviewView.this.f9599z.set(lVar);
            jL.b().a(androidx.core.content.a.h(PreviewView.this.getContext()), lVar);
            PreviewView.this.f9594e.g(f02, new q.a() {
                @Override
                public final void a() {
                    this.f9696a.g(lVar, jL);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f9595i) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f9595i);
            }
            PreviewView.this.getClass();
        }
    }

    class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override
        public void onDisplayAdded(int i7) {
        }

        @Override
        public void onDisplayChanged(int i7) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i7) {
                return;
            }
            PreviewView.this.g();
        }

        @Override
        public void onDisplayRemoved(int i7) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        private final int f9605d;

        c(int i7) {
            this.f9605d = i7;
        }

        static c e(int i7) {
            for (c cVar : values()) {
                if (cVar.f9605d == i7) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i7);
        }

        int f() {
            return this.f9605d;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        private final int f9613d;

        d(int i7) {
            this.f9613d = i7;
        }

        static d e(int i7) {
            for (d dVar : values()) {
                if (dVar.f9613d == i7) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i7);
        }

        int f() {
            return this.f9613d;
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c(boolean z7) {
        E.p.a();
        I0 viewPort = getViewPort();
        if (this.f9585A == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.f9585A.c(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e7) {
            if (!z7) {
                throw e7;
            }
            C3043d0.d("PreviewView", e7.toString(), e7);
        }
    }

    public void e(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (i9 - i7 == i13 - i11 && i10 - i8 == i14 - i12) {
            return;
        }
        g();
        c(true);
    }

    public boolean f(C1739a.c cVar) {
        AbstractC1601c abstractC1601c;
        if (!(cVar instanceof C1739a.c.C0130c) || (abstractC1601c = this.f9585A) == null) {
            return true;
        }
        abstractC1601c.A(((C1739a.c.C0130c) cVar).getIncrementalScaleFactor());
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private T.i getScreenFlashInternal() {
        return this.f9595i.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                i7 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i7;
    }

    static boolean h(q qVar, F0 f02, c cVar) {
        return (qVar instanceof z) && !i(f02, cVar);
    }

    static boolean i(F0 f02, c cVar) {
        boolean zEquals = f02.l().q().j().equals("androidx.camera.camera2.legacy");
        boolean z7 = (androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z7) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private void j() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f9590F, new Handler(Looper.getMainLooper()));
    }

    private void k() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f9590F);
    }

    private void setScreenFlashUiInfo(T.i iVar) {
        AbstractC1601c abstractC1601c = this.f9585A;
        if (abstractC1601c == null) {
            C3043d0.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            abstractC1601c.H(new C1744a(C1744a.EnumC0141a.PREVIEW_VIEW, iVar));
        }
    }

    public I0 d(int i7) {
        E.p.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new I0.a(new Rational(getWidth(), getHeight()), i7).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    void g() {
        E.p.a();
        if (this.f9594e != null) {
            l();
            this.f9594e.h();
        }
        this.f9586B.f(new Size(getWidth(), getHeight()), getLayoutDirection());
        AbstractC1601c abstractC1601c = this.f9585A;
        if (abstractC1601c != null) {
            abstractC1601c.U(getSensorToViewTransform());
        }
    }

    public Bitmap getBitmap() {
        E.p.a();
        q qVar = this.f9594e;
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    public AbstractC1601c getController() {
        E.p.a();
        return this.f9585A;
    }

    public c getImplementationMode() {
        E.p.a();
        return this.f9593d;
    }

    public AbstractC3051h0 getMeteringPointFactory() {
        E.p.a();
        return this.f9586B;
    }

    public C2410b getOutputTransform() {
        Matrix matrixJ;
        E.p.a();
        try {
            matrixJ = this.f9596v.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixJ = null;
        }
        Rect rectI = this.f9596v.i();
        if (matrixJ == null || rectI == null) {
            C3043d0.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixJ.preConcat(E.q.b(rectI));
        if (this.f9594e instanceof F) {
            matrixJ.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            C3043d0.l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C2410b(matrixJ, new Size(rectI.width(), rectI.height()));
    }

    public LiveData<e> getPreviewStreamState() {
        return this.f9598y;
    }

    public d getScaleType() {
        E.p.a();
        return this.f9596v.g();
    }

    public T.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        E.p.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f9596v.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public o0.c getSurfaceProvider() {
        E.p.a();
        return this.f9592H;
    }

    public I0 getViewPort() {
        E.p.a();
        if (getDisplay() == null) {
            return null;
        }
        return d(getDisplay().getRotation());
    }

    void l() {
        Display display;
        I i7;
        if (!this.f9597w || (display = getDisplay()) == null || (i7 = this.f9588D) == null) {
            return;
        }
        this.f9596v.o(i7.l(display.getRotation()), display.getRotation());
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        j();
        addOnLayoutChangeListener(this.f9591G);
        q qVar = this.f9594e;
        if (qVar != null) {
            qVar.d();
        }
        c(true);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f9591G);
        q qVar = this.f9594e;
        if (qVar != null) {
            qVar.e();
        }
        AbstractC1601c abstractC1601c = this.f9585A;
        if (abstractC1601c != null) {
            abstractC1601c.d();
        }
        k();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f9585A == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z7 = motionEvent.getPointerCount() == 1;
        boolean z8 = motionEvent.getAction() == 1;
        boolean z9 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z7 || !z8 || !z9) {
            return this.f9587C.f(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.f9589E = motionEvent;
        performClick();
        return true;
    }

    @Override
    public boolean performClick() {
        if (this.f9585A != null) {
            MotionEvent motionEvent = this.f9589E;
            float x7 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.f9589E;
            this.f9585A.B(this.f9586B, x7, motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f);
        }
        this.f9589E = null;
        return super.performClick();
    }

    public void setController(AbstractC1601c abstractC1601c) {
        E.p.a();
        AbstractC1601c abstractC1601c2 = this.f9585A;
        if (abstractC1601c2 != null && abstractC1601c2 != abstractC1601c) {
            abstractC1601c2.d();
            setScreenFlashUiInfo(null);
        }
        this.f9585A = abstractC1601c;
        c(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        E.p.a();
        this.f9593d = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        E.p.a();
        this.f9596v.q(dVar);
        g();
        c(false);
    }

    public void setScreenFlashOverlayColor(int i7) {
        this.f9595i.setBackgroundColor(i7);
    }

    public void setScreenFlashWindow(Window window) {
        E.p.a();
        this.f9595i.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        c cVar = f9584I;
        this.f9593d = cVar;
        m mVar = new m();
        this.f9596v = mVar;
        this.f9597w = true;
        this.f9598y = new C1709w<>(e.IDLE);
        this.f9599z = new AtomicReference<>();
        this.f9586B = new r(mVar);
        this.f9590F = new b();
        this.f9591G = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                this.f8240a.e(view, i9, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        this.f9592H = new a();
        E.p.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = a0.h.f8242a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i7, i8);
        Z.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i7, i8);
        try {
            setScaleType(d.e(typedArrayObtainStyledAttributes.getInteger(a0.h.f8244c, mVar.g().f())));
            setImplementationMode(c.e(typedArrayObtainStyledAttributes.getInteger(a0.h.f8243b, cVar.f())));
            typedArrayObtainStyledAttributes.recycle();
            this.f9587C = new C1739a(context, new C1739a.b() {
                @Override
                public final boolean a(C1739a.c cVar2) {
                    return this.f8241a.f(cVar2);
                }
            });
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.black));
            }
            a0.k kVar = new a0.k(context);
            this.f9595i = kVar;
            kVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
