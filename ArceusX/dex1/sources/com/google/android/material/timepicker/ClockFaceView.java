package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C1605a;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1747c;
import c4.C1748d;
import c4.C1750f;
import c4.C1752h;
import c4.C1754j;
import c4.C1755k;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.timepicker.ClockHandView;
import h.C2473a;
import java.util.Arrays;
import r4.C2754c;
import y0.C3019t;

class ClockFaceView extends d implements ClockHandView.b {

    private final SparseArray<TextView> f18682A;

    private final C1605a f18683B;

    private final int[] f18684C;

    private final float[] f18685D;

    private final int f18686E;

    private final int f18687F;

    private final int f18688G;

    private final int f18689H;

    private String[] f18690I;

    private float f18691J;

    private final ColorStateList f18692K;

    private final ClockHandView f18693v;

    private final Rect f18694w;

    private final RectF f18695y;

    private final Rect f18696z;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.f(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f18693v.i()) - ClockFaceView.this.f18686E);
            return true;
        }
    }

    class b extends C1605a {
        b() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            int iIntValue = ((Integer) view.getTag(C1750f.f12886p)).intValue();
            if (iIntValue > 0) {
                c3019t.C0((View) ClockFaceView.this.f18682A.get(iIntValue - 1));
            }
            c3019t.h0(C3019t.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            c3019t.f0(true);
            c3019t.b(C3019t.a.f24389i);
        }

        @Override
        public boolean j(View view, int i7, Bundle bundle) {
            if (i7 != 16) {
                return super.j(view, i7, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f18694w);
            float fCenterX = ClockFaceView.this.f18694w.centerX();
            float fCenterY = ClockFaceView.this.f18694w.centerY();
            ClockFaceView.this.f18693v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f18693v.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12763z);
    }

    private void n() {
        RectF rectFE = this.f18693v.e();
        TextView textViewP = p(rectFE);
        for (int i7 = 0; i7 < this.f18682A.size(); i7++) {
            TextView textView = this.f18682A.get(i7);
            if (textView != null) {
                textView.setSelected(textView == textViewP);
                textView.getPaint().setShader(o(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient o(RectF rectF, TextView textView) {
        textView.getHitRect(this.f18694w);
        this.f18695y.set(this.f18694w);
        textView.getLineBounds(0, this.f18696z);
        RectF rectF2 = this.f18695y;
        Rect rect = this.f18696z;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f18695y)) {
            return new RadialGradient(rectF.centerX() - this.f18695y.left, rectF.centerY() - this.f18695y.top, rectF.width() * 0.5f, this.f18684C, this.f18685D, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView p(RectF rectF) {
        float f7 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i7 = 0; i7 < this.f18682A.size(); i7++) {
            TextView textView2 = this.f18682A.get(i7);
            if (textView2 != null) {
                textView2.getHitRect(this.f18694w);
                this.f18695y.set(this.f18694w);
                this.f18695y.union(rectF);
                float fWidth = this.f18695y.width() * this.f18695y.height();
                if (fWidth < f7) {
                    textView = textView2;
                    f7 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float q(float f7, float f8, float f9) {
        return Math.max(Math.max(f7, f8), f9);
    }

    private void s(int i7) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f18682A.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < Math.max(this.f18690I.length, size); i8++) {
            TextView textView = this.f18682A.get(i8);
            if (i8 >= this.f18690I.length) {
                removeView(textView);
                this.f18682A.remove(i8);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C1752h.f12905f, (ViewGroup) this, false);
                    this.f18682A.put(i8, textView);
                    addView(textView);
                }
                textView.setText(this.f18690I[i8]);
                textView.setTag(C1750f.f12886p, Integer.valueOf(i8));
                int i9 = (i8 / 12) + 1;
                textView.setTag(C1750f.f12881k, Integer.valueOf(i9));
                if (i9 > 1) {
                    z7 = true;
                }
                Z.n0(textView, this.f18683B);
                textView.setTextColor(this.f18692K);
                if (i7 != 0) {
                    textView.setContentDescription(getResources().getString(i7, this.f18690I[i8]));
                }
            }
        }
        this.f18693v.q(z7);
    }

    @Override
    public void a(float f7, boolean z7) {
        if (Math.abs(this.f18691J - f7) > 0.001f) {
            this.f18691J = f7;
            n();
        }
    }

    @Override
    public void f(int i7) {
        if (i7 != e()) {
            super.f(i7);
            this.f18693v.m(e());
        }
    }

    @Override
    protected void h() {
        super.h();
        for (int i7 = 0; i7 < this.f18682A.size(); i7++) {
            this.f18682A.get(i7).setVisibility(0);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3019t.F0(accessibilityNodeInfo).g0(C3019t.e.a(1, this.f18690I.length, false, 1));
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        n();
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iQ = (int) (this.f18689H / q(this.f18687F / displayMetrics.heightPixels, this.f18688G / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
        setMeasuredDimension(iQ, iQ);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void r(String[] strArr, int i7) {
        this.f18690I = strArr;
        s(i7);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18694w = new Rect();
        this.f18695y = new RectF();
        this.f18696z = new Rect();
        this.f18682A = new SparseArray<>();
        this.f18685D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1755k.f13187i1, i7, C1754j.f12946B);
        Resources resources = getResources();
        ColorStateList colorStateListA = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.k1);
        this.f18692K = colorStateListA;
        LayoutInflater.from(context).inflate(C1752h.f12906g, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C1750f.f12880j);
        this.f18693v = clockHandView;
        this.f18686E = resources.getDimensionPixelSize(C1748d.f12834w);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f18684C = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C2473a.a(context, C1747c.f12769f).getDefaultColor();
        ColorStateList colorStateListA2 = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13195j1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f18683B = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        r(strArr, 0);
        this.f18687F = resources.getDimensionPixelSize(C1748d.f12785L);
        this.f18688G = resources.getDimensionPixelSize(C1748d.f12786M);
        this.f18689H = resources.getDimensionPixelSize(C1748d.f12836y);
    }
}
