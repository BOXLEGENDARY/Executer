package V5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.roblox.client.O;

public class f {

    private View f7563a;

    private float f7564b;

    private float f7565c;

    private float f7566d;

    private float f7567e;

    private int f7568f;

    private int f7569g;

    private int f7570h;

    private int f7571i;

    private int f7572j;

    private int f7573k;

    private int f7574l;

    private int f7575m;

    private boolean f7576n = false;

    private ValueAnimator f7577o = null;

    private ValueAnimator f7578p = null;

    private ValueAnimator f7579q = null;

    private Rect f7580r = null;

    private final int f7581s = 60;

    private final int f7582t = 10;

    private final int f7583u = 12105912;

    private final int f7584v = 3500;

    private final int f7585w = 300;

    private final float f7586x = 50.0f;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f7566d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f.this.f7563a.invalidate();
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f7570h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f7570h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            f.this.f7563a.invalidate();
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.this.f7576n = false;
            f.this.h();
        }
    }

    public f(View view, AttributeSet attributeSet) {
        this.f7563a = null;
        if (view != null) {
            this.f7563a = view;
            if (attributeSet == null) {
                this.f7566d = 50.0f;
                this.f7567e = 50.0f;
                this.f7571i = 3500;
                this.f7572j = 300;
                this.f7568f = 60;
                this.f7569g = 10;
                this.f7573k = 12105912;
                this.f7575m = 12105912;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, O.t1);
            float f7 = typedArrayObtainStyledAttributes.getFloat(O.A1, 50.0f);
            this.f7566d = f7;
            this.f7567e = f7;
            this.f7571i = typedArrayObtainStyledAttributes.getInt(O.w1, 3500);
            this.f7572j = typedArrayObtainStyledAttributes.getInt(O.x1, 300);
            this.f7568f = typedArrayObtainStyledAttributes.getInt(O.f19815y1, 60);
            this.f7569g = typedArrayObtainStyledAttributes.getInt(O.u1, 10);
            this.f7573k = typedArrayObtainStyledAttributes.getColor(O.z1, 12105912);
            this.f7575m = typedArrayObtainStyledAttributes.getColor(O.v1, 12105912);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f7577o;
        return valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f7578p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f7579q) != null && valueAnimator2.isRunning();
    }

    private float g(int i7, int i8) {
        int i9;
        int i10;
        Rect rect = this.f7580r;
        if (rect != null) {
            int i11 = rect.left;
            int i12 = i7 - i11;
            int i13 = rect.right;
            i9 = i12 > i13 - i7 ? i7 - i11 : i13 - i7;
            int i14 = rect.top;
            int i15 = i8 - i14;
            int i16 = rect.bottom;
            i10 = i15 > i16 - i8 ? i8 - i14 : i16 - i8;
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (i10 > i9) {
            i9 = i10;
        }
        return i9 + 300.0f;
    }

    public void h() {
        ValueAnimator valueAnimator = this.f7577o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7577o.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f7578p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f7578p.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f7579q;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f7579q.removeAllListeners();
        }
    }

    private void j() {
        if (f()) {
            h();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f7570h, 0);
        this.f7578p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new c());
        this.f7578p.addListener(new d());
        this.f7578p.setDuration(this.f7572j);
        this.f7578p.setInterpolator(new DecelerateInterpolator());
        this.f7578p.start();
    }

    private boolean k(int i7, int i8) {
        int[] iArr = new int[2];
        this.f7563a.getLocationInWindow(iArr);
        int i9 = iArr[0];
        int i10 = iArr[1];
        return i7 >= i9 && i7 <= i9 + this.f7563a.getWidth() && i8 >= i10 && i8 <= i10 + this.f7563a.getHeight();
    }

    private void m() {
        if (f()) {
            h();
        }
        float f7 = this.f7567e;
        this.f7566d = f7;
        this.f7570h = this.f7568f;
        this.f7574l = this.f7573k;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, g((int) this.f7564b, (int) this.f7565c));
        this.f7577o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.f7577o.setDuration(this.f7571i);
        this.f7577o.setInterpolator(new O0.c());
        this.f7577o.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f7570h, this.f7569g);
        this.f7578p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new b());
        this.f7578p.setDuration(this.f7571i);
        this.f7578p.setInterpolator(new O0.a());
        this.f7578p.start();
    }

    public void i(Canvas canvas) {
        if (this.f7576n) {
            Paint paint = new Paint(1);
            paint.setColor(this.f7574l);
            paint.setAlpha(this.f7570h);
            canvas.drawCircle(this.f7564b, this.f7565c, this.f7566d, paint);
        }
    }

    public void l(MotionEvent motionEvent) {
        if (this.f7580r == null) {
            Rect rect = new Rect();
            this.f7580r = rect;
            this.f7563a.getDrawingRect(rect);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7576n = true;
            this.f7564b = motionEvent.getX();
            this.f7565c = motionEvent.getY();
            m();
            return;
        }
        if (action == 1) {
            j();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            j();
        } else {
            if (k((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return;
            }
            j();
        }
    }
}
