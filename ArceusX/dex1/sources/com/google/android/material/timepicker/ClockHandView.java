package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1748d;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.internal.s;
import d4.C2388a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.C2681a;

class ClockHandView extends View {

    private final int f18699A;

    private boolean f18700B;

    private final List<b> f18701C;

    private final int f18702D;

    private final float f18703E;

    private final Paint f18704F;

    private final RectF f18705G;

    private final int f18706H;

    private float f18707I;

    private boolean f18708J;

    private double f18709K;

    private int f18710L;

    private int f18711M;

    private final int f18712d;

    private final TimeInterpolator f18713e;

    private final ValueAnimator f18714i;

    private boolean f18715v;

    private float f18716w;

    private float f18717y;

    private boolean f18718z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f7, boolean z7);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12763z);
    }

    private void c(float f7, float f8) {
        this.f18711M = C2681a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f7, f8) > ((float) h(2)) + s.d(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f7 = width;
        float fH = h(this.f18711M);
        float fCos = (((float) Math.cos(this.f18709K)) * fH) + f7;
        float f8 = height;
        float fSin = (fH * ((float) Math.sin(this.f18709K))) + f8;
        this.f18704F.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f18702D, this.f18704F);
        double dSin = Math.sin(this.f18709K);
        double dCos = Math.cos(this.f18709K);
        this.f18704F.setStrokeWidth(this.f18706H);
        canvas.drawLine(f7, f8, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f18704F);
        canvas.drawCircle(f7, f8, this.f18703E, this.f18704F);
    }

    private int f(float f7, float f8) {
        int degrees = (int) Math.toDegrees(Math.atan2(f8 - (getHeight() / 2), f7 - (getWidth() / 2)));
        int i7 = degrees + 90;
        return i7 < 0 ? degrees + 450 : i7;
    }

    private int h(int i7) {
        return i7 == 2 ? Math.round(this.f18710L * 0.66f) : this.f18710L;
    }

    private Pair<Float, Float> j(float f7) {
        float fG = g();
        if (Math.abs(fG - f7) > 180.0f) {
            if (fG > 180.0f && f7 < 180.0f) {
                f7 += 360.0f;
            }
            if (fG < 180.0f && f7 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fG), Float.valueOf(f7));
    }

    private boolean k(float f7, float f8, boolean z7, boolean z8, boolean z9) {
        float f9 = f(f7, f8);
        boolean z10 = false;
        boolean z11 = g() != f9;
        if (z8 && z11) {
            return true;
        }
        if (!z11 && !z7) {
            return false;
        }
        if (z9 && this.f18715v) {
            z10 = true;
        }
        o(f9, z10);
        return true;
    }

    public void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f7, boolean z7) {
        float f8 = f7 % 360.0f;
        this.f18707I = f8;
        this.f18709K = Math.toRadians(f8 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f18711M);
        float fCos = width + (((float) Math.cos(this.f18709K)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f18709K)));
        RectF rectF = this.f18705G;
        int i7 = this.f18702D;
        rectF.set(fCos - i7, fSin - i7, fCos + i7, fSin + i7);
        Iterator<b> it = this.f18701C.iterator();
        while (it.hasNext()) {
            it.next().a(f8, z7);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f18701C.add(bVar);
    }

    public RectF e() {
        return this.f18705G;
    }

    public float g() {
        return this.f18707I;
    }

    public int i() {
        return this.f18702D;
    }

    public void m(int i7) {
        this.f18710L = i7;
        invalidate();
    }

    public void n(float f7) {
        o(f7, false);
    }

    public void o(float f7, boolean z7) {
        ValueAnimator valueAnimator = this.f18714i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z7) {
            p(f7, false);
            return;
        }
        Pair<Float, Float> pairJ = j(f7);
        this.f18714i.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f18714i.setDuration(this.f18712d);
        this.f18714i.setInterpolator(this.f18713e);
        this.f18714i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f18737a.l(valueAnimator2);
            }
        });
        this.f18714i.addListener(new a());
        this.f18714i.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (this.f18714i.isRunning()) {
            return;
        }
        n(g());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f18716w = x7;
            this.f18717y = y7;
            this.f18718z = true;
            this.f18708J = false;
            z7 = true;
            z8 = false;
            z9 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i7 = (int) (x7 - this.f18716w);
            int i8 = (int) (y7 - this.f18717y);
            this.f18718z = (i7 * i7) + (i8 * i8) > this.f18699A;
            z8 = this.f18708J;
            boolean z10 = actionMasked == 1;
            if (this.f18700B) {
                c(x7, y7);
            }
            z9 = z10;
            z7 = false;
        } else {
            z8 = false;
            z7 = false;
            z9 = false;
        }
        this.f18708J |= k(x7, y7, z8, z7, z9);
        return true;
    }

    void q(boolean z7) {
        if (this.f18700B && !z7) {
            this.f18711M = 1;
        }
        this.f18700B = z7;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18714i = new ValueAnimator();
        this.f18701C = new ArrayList();
        Paint paint = new Paint();
        this.f18704F = paint;
        this.f18705G = new RectF();
        this.f18711M = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.l1, i7, C1754j.f12946B);
        this.f18712d = p4.e.f(context, C1746b.f12708D, 200);
        this.f18713e = p4.e.g(context, C1746b.f12718N, C2388a.f20313b);
        this.f18710L = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.n1, 0);
        this.f18702D = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1755k.o1, 0);
        this.f18706H = getResources().getDimensionPixelSize(C1748d.f12835x);
        this.f18703E = r7.getDimensionPixelSize(C1748d.f12833v);
        int color = typedArrayObtainStyledAttributes.getColor(C1755k.m1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f18699A = ViewConfiguration.get(context).getScaledTouchSlop();
        Z.x0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
