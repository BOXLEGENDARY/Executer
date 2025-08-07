package com.withpersona.sdk2.inquiry.selfie.view;

import V8.j;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 12\u00020\u0001:\u00012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\"¨\u00063"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "progress", "Lkotlin/Function0;", "", "onAnimationEnd", "h", "(FLkotlin/jvm/functions/Function0;)V", "d", "()V", "newColor", "setStrokeColor", "(I)V", "newWidth", "setStrokeWidth", "(F)V", "f", "e", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "F", "size", "i", "startAngle", "v", "Landroid/animation/ValueAnimator;", "w", "Landroid/animation/ValueAnimator;", "animator", "y", "indeterminateAnimator", "z", "rotateToZeroAnimator", "A", "_rotation", "B", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Pi2ProgressArcView extends View {

    private float _rotation;

    @NotNull
    private final Paint paint;

    private final float size;

    private final float startAngle;

    private float progress;

    private ValueAnimator animator;

    private ValueAnimator indeterminateAnimator;

    private ValueAnimator rotateToZeroAnimator;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "F", "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        private float lastProgress;
        final ValueAnimator b;
        final Pi2ProgressArcView c;

        b(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.b = valueAnimator;
            this.c = pi2ProgressArcView;
        }

        @Override
        public void onAnimationUpdate(@NotNull ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = this.b.getAnimatedValue();
            Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            float f = this.c._rotation;
            Pi2ProgressArcView pi2ProgressArcView = this.c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            if (f > this.c._rotation) {
                this.c._rotation = 0.0f;
                animator.cancel();
            }
            this.lastProgress = fFloatValue;
            this.c.invalidate();
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c implements Runnable {
        private final Function0 d;

        c(Function0 function0) {
            Intrinsics.checkNotNullParameter(function0, "function");
            this.d = function0;
        }

        @Override
        public final void run() {
            this.d.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animator", "", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "", "a", "F", "getLastProgress", "()F", "setLastProgress", "(F)V", "lastProgress", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class d implements ValueAnimator.AnimatorUpdateListener {

        private float lastProgress;
        final ValueAnimator b;
        final Pi2ProgressArcView c;

        d(ValueAnimator valueAnimator, Pi2ProgressArcView pi2ProgressArcView) {
            this.b = valueAnimator;
            this.c = pi2ProgressArcView;
        }

        @Override
        public void onAnimationUpdate(@NotNull ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Object animatedValue = this.b.getAnimatedValue();
            Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            float fAbs = Math.abs(fFloatValue - this.lastProgress);
            Pi2ProgressArcView pi2ProgressArcView = this.c;
            pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
            this.lastProgress = fFloatValue;
            this.c.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class e implements Animator.AnimatorListener {
        final Function0 a;
        final Pi2ProgressArcView b;

        public e(Function0 function0, Pi2ProgressArcView pi2ProgressArcView) {
            this.a = function0;
            this.b = pi2ProgressArcView;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            Function0 function0 = this.a;
            if (function0 != null) {
                this.b.postDelayed(new c(function0), 100L);
            }
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
        }

        @Override
        public void onAnimationStart(Animator animator) {
        }
    }

    public Pi2ProgressArcView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void d() {
        if (this._rotation == 0.0f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new b(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.rotateToZeroAnimator = valueAnimatorOfFloat;
    }

    public static void g(Pi2ProgressArcView pi2ProgressArcView, float f, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        pi2ProgressArcView.f(f, function0);
    }

    private final void h(float progress, Function0<Unit> onAnimationEnd) {
        if (this.progress == progress) {
            if (onAnimationEnd != null) {
                onAnimationEnd.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.progress;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, progress);
        valueAnimatorOfFloat.setDuration((long) (1000 * (Math.abs(progress - f) / 100.0f)));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Pi2ProgressArcView.i(this.a, valueAnimatorOfFloat, valueAnimator2);
            }
        });
        Intrinsics.d(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new e(onAnimationEnd, this));
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    public static final void i(Pi2ProgressArcView pi2ProgressArcView, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(pi2ProgressArcView, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator2, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        pi2ProgressArcView.progress = ((Float) animatedValue).floatValue();
        pi2ProgressArcView.invalidate();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.rotateToZeroAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.indeterminateAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        h(25.0f, null);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new d(valueAnimatorOfFloat, this));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.indeterminateAnimator = valueAnimatorOfFloat;
    }

    public final void f(float progress, Function0<Unit> onAnimationEnd) {
        ValueAnimator valueAnimator = this.indeterminateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        d();
        h(progress, onAnimationEnd);
    }

    @Override
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float fMin = (this.size * Math.min(getWidth(), getHeight())) - (this.paint.getStrokeWidth() / 2);
        float f = width;
        float f2 = height;
        canvas.drawArc(f - fMin, f2 - fMin, f + fMin, f2 + fMin, this.startAngle + this._rotation, (this.progress * 360) / 100.0f, false, this.paint);
    }

    public final void setStrokeColor(int newColor) {
        this.paint.setColor(newColor);
    }

    public final void setStrokeWidth(float newWidth) {
        this.paint.setStrokeWidth(newWidth);
    }

    public Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public Pi2ProgressArcView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.d, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(j.e, 0.4f);
            this.startAngle = typedArrayObtainStyledAttributes.getFloat(j.g, 270.0f);
            this.progress = typedArrayObtainStyledAttributes.getFloat(j.f, 0.0f);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(j.h, -1));
            paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.i, 4));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
