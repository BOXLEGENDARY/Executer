package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.p;
import com.google.android.material.progressindicator.b;
import java.util.Arrays;
import k4.C2517a;
import q4.C2733a;
import t4.gYZ.uCYQMIHsy;
import x4.C2990a;

public abstract class a<S extends com.google.android.material.progressindicator.b> extends ProgressBar {

    static final int f18200H = C1754j.f12973z;

    C2733a f18201A;

    private boolean f18202B;

    private int f18203C;

    private final Runnable f18204D;

    private final Runnable f18205E;

    private final androidx.vectordrawable.graphics.drawable.b f18206F;

    private final androidx.vectordrawable.graphics.drawable.b f18207G;

    S f18208d;

    private int f18209e;

    private boolean f18210i;

    private boolean f18211v;

    private final int f18212w;

    private final int f18213y;

    private long f18214z;

    class RunnableC0161a implements Runnable {
        RunnableC0161a() {
        }

        @Override
        public void run() {
            a.this.k();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            a.this.j();
            a.this.f18214z = -1L;
        }
    }

    class c extends androidx.vectordrawable.graphics.drawable.b {
        c() {
        }

        @Override
        public void b(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.o(aVar.f18209e, a.this.f18210i);
        }
    }

    class d extends androidx.vectordrawable.graphics.drawable.b {
        d() {
        }

        @Override
        public void b(Drawable drawable) {
            super.b(drawable);
            if (a.this.f18202B) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.f18203C);
        }
    }

    protected a(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(C2990a.c(context, attributeSet, i7, f18200H), attributeSet, i7);
        this.f18214z = -1L;
        this.f18202B = false;
        this.f18203C = 4;
        this.f18204D = new RunnableC0161a();
        this.f18205E = new b();
        this.f18206F = new c();
        this.f18207G = new d();
        Context context2 = getContext();
        this.f18208d = (S) i(context2, attributeSet);
        TypedArray typedArrayI = p.i(context2, attributeSet, C1755k.f13292x, i7, i8, new int[0]);
        this.f18212w = typedArrayI.getInt(C1755k.f12994D, -1);
        this.f18213y = Math.min(typedArrayI.getInt(C1755k.f12981B, -1), 1000);
        typedArrayI.recycle();
        this.f18201A = new C2733a();
        this.f18211v = true;
    }

    private h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().w();
    }

    public void j() {
        ((g) getCurrentDrawable()).q(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    public void k() {
        if (this.f18213y > 0) {
            this.f18214z = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u().d(this.f18206F);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m(this.f18207G);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m(this.f18207G);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().s(this.f18207G);
            getIndeterminateDrawable().u().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().s(this.f18207G);
        }
    }

    @Override
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f18208d.f18224f;
    }

    public int[] getIndicatorColor() {
        return this.f18208d.f18221c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f18208d.f18225g;
    }

    public int getShowAnimationBehavior() {
        return this.f18208d.f18223e;
    }

    public int getTrackColor() {
        return this.f18208d.f18222d;
    }

    public int getTrackCornerRadius() {
        return this.f18208d.f18220b;
    }

    public int getTrackThickness() {
        return this.f18208d.f18219a;
    }

    protected void h(boolean z7) {
        if (this.f18211v) {
            ((g) getCurrentDrawable()).q(q(), false, z7);
        }
    }

    abstract S i(Context context, AttributeSet attributeSet);

    @Override
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public void o(int i7, boolean z7) {
        if (!isIndeterminate()) {
            super.setProgress(i7);
            if (getProgressDrawable() == null || z7) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f18209e = i7;
            this.f18210i = z7;
            this.f18202B = true;
            if (!getIndeterminateDrawable().isVisible() || this.f18201A.a(getContext().getContentResolver()) == 0.0f) {
                this.f18206F.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().u().f();
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f18205E);
        removeCallbacks(this.f18204D);
        ((g) getCurrentDrawable()).i();
        p();
        super.onDetachedFromWindow();
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    protected synchronized void onMeasure(int i7, int i8) {
        try {
            h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i7) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i8) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    protected void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        h(i7 == 0);
    }

    @Override
    protected void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        h(false);
    }

    boolean q() {
        return Z.Q(this) && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(C2733a c2733a) {
        this.f18201A = c2733a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f18265i = c2733a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f18265i = c2733a;
        }
    }

    public void setHideAnimationBehavior(int i7) {
        this.f18208d.f18224f = i7;
        invalidate();
    }

    @Override
    public synchronized void setIndeterminate(boolean z7) {
        try {
            if (z7 == isIndeterminate()) {
                return;
            }
            g gVar = (g) getCurrentDrawable();
            if (gVar != null) {
                gVar.i();
            }
            super.setIndeterminate(z7);
            g gVar2 = (g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.q(q(), false, false);
            }
            if ((gVar2 instanceof j) && q()) {
                ((j) gVar2).u().g();
            }
            this.f18202B = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof j)) {
                throw new IllegalArgumentException(uCYQMIHsy.criDIoMU);
            }
            ((g) drawable).i();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C2517a.b(getContext(), C1746b.f12748k, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f18208d.f18221c = iArr;
        getIndeterminateDrawable().u().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i7) {
        S s7 = this.f18208d;
        if (s7.f18225g != i7) {
            s7.f18225g = i7;
            s7.e();
            invalidate();
        }
    }

    @Override
    public synchronized void setProgress(int i7) {
        if (isIndeterminate()) {
            return;
        }
        o(i7, false);
    }

    @Override
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof f)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            f fVar = (f) drawable;
            fVar.i();
            super.setProgressDrawable(fVar);
            fVar.A(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i7) {
        this.f18208d.f18223e = i7;
        invalidate();
    }

    public void setTrackColor(int i7) {
        S s7 = this.f18208d;
        if (s7.f18222d != i7) {
            s7.f18222d = i7;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i7) {
        S s7 = this.f18208d;
        if (s7.f18220b != i7) {
            s7.f18220b = Math.min(i7, s7.f18219a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i7) {
        S s7 = this.f18208d;
        if (s7.f18219a != i7) {
            s7.f18219a = i7;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i7) {
        if (i7 != 0 && i7 != 4 && i7 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f18203C = i7;
    }

    @Override
    public j<S> getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @Override
    public f<S> getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}
