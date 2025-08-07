package com.withpersona.sdk2.inquiry.governmentid.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import ha.C0458f;
import ha.C0476u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 P2\u00020\u0001:\u0001QB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0010R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R$\u00105\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010:\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u00108\"\u0004\b9\u00104R*\u0010>\u001a\u00020;2\u0006\u00100\u001a\u00020;8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010H\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010L\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR$\u0010O\u001a\u00020/2\u0006\u00100\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u00108\"\u0004\bN\u00104¨\u0006R"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/ScanningView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Path;", "c", "()Landroid/graphics/Path;", "Landroid/graphics/SweepGradient;", "b", "()Landroid/graphics/SweepGradient;", "", "e", "()V", "g", "f", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/graphics/Matrix;", "d", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "animator", "i", "Landroid/graphics/SweepGradient;", "gradient", "Landroid/graphics/Paint;", "v", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "path", "", "value", "y", "F", "setAnimationRotation", "(F)V", "animationRotation", "z", "getCornerRadius", "()F", "setCornerRadius", "cornerRadius", "", "A", "Z", "isScanningAnimationEnabled", "()Z", "setScanningAnimationEnabled", "(Z)V", "B", "I", "getHighlightColor", "()I", "setHighlightColor", "(I)V", "highlightColor", "C", "getBorderColor", "setBorderColor", "borderColor", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "D", "a", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ScanningView extends View {

    private boolean isScanningAnimationEnabled;

    private int highlightColor;

    private int borderColor;

    @NotNull
    private final Matrix gradientMatrix;

    @NotNull
    private final ValueAnimator animator;

    @NotNull
    private SweepGradient gradient;

    @NotNull
    private final Paint paint;

    @NotNull
    private Path path;

    private float animationRotation;

    private float cornerRadius;

    public ScanningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) C0458f.a(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.highlightColor = C0476u.d(context2, g.a.A, null, false, 6, null);
        this.borderColor = -1;
        this.gradient = b();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) C0458f.a(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanningView.d(this.a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.animator = valueAnimatorOfFloat;
    }

    private final SweepGradient b() {
        int[] iArr;
        if (this.isScanningAnimationEnabled) {
            int i = this.borderColor;
            iArr = new int[]{i, i, this.highlightColor};
        } else {
            int i2 = this.borderColor;
            iArr = new int[]{i2, i2, i2};
        }
        return new SweepGradient(0.5f, 0.5f, iArr, new float[]{0.0f, 0.5f, 1.0f});
    }

    private final Path c() {
        Path path = new Path();
        float strokeWidth = this.paint.getStrokeWidth();
        float f = strokeWidth / 2.0f;
        if (getWidth() > strokeWidth && getHeight() > strokeWidth) {
            float f2 = this.cornerRadius;
            path.addRoundRect(f, f, getWidth() - f, getHeight() - f, new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, Path.Direction.CW);
        }
        return path;
    }

    public static final void d(ScanningView scanningView, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(scanningView, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator, "it");
        scanningView.setAnimationRotation(valueAnimator.getAnimatedFraction() * 360.0f);
    }

    private final void e() {
        SweepGradient sweepGradientB = b();
        this.gradient = sweepGradientB;
        this.paint.setShader(sweepGradientB);
        f();
        invalidate();
    }

    private final void f() {
        int iMax = Integer.max(getWidth(), getHeight());
        this.gradientMatrix.setRotate(this.animationRotation, 0.5f, 0.5f);
        float f = iMax;
        this.gradientMatrix.postScale(f, f);
        this.gradient.setLocalMatrix(this.gradientMatrix);
        invalidate();
    }

    private final void g() {
        this.path = c();
        invalidate();
    }

    private final void setAnimationRotation(float f) {
        if (this.animationRotation == f) {
            return;
        }
        this.animationRotation = f;
        f();
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getHighlightColor() {
        return this.highlightColor;
    }

    public final float getStrokeWidth() {
        return this.paint.getStrokeWidth();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.cancel();
    }

    @Override
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.paint);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        g();
        f();
    }

    public final void setBorderColor(int i) {
        if (this.borderColor == i) {
            return;
        }
        this.borderColor = i;
        e();
    }

    public final void setCornerRadius(float f) {
        if (this.cornerRadius == f) {
            return;
        }
        this.cornerRadius = f;
        g();
    }

    public final void setHighlightColor(int i) {
        if (this.highlightColor == i) {
            return;
        }
        this.highlightColor = i;
        e();
    }

    public final void setScanningAnimationEnabled(boolean z) {
        if (this.isScanningAnimationEnabled == z) {
            return;
        }
        this.isScanningAnimationEnabled = z;
        e();
    }

    public final void setStrokeWidth(float f) {
        if (this.paint.getStrokeWidth() == f) {
            return;
        }
        this.paint.setStrokeWidth(f);
        invalidate();
    }
}
