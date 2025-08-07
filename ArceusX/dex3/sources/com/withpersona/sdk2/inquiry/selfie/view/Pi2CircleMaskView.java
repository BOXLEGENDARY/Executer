package com.withpersona.sdk2.inquiry.selfie.view;

import V8.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "targetScaleX", "", "b", "(F)J", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "h", "()V", "", "animated", "Lkotlin/Function0;", "onComplete", "d", "(ZLkotlin/jvm/functions/Function0;)V", "g", "()Z", "F", "size", "e", "I", "maskColor", "i", "Landroid/graphics/Bitmap;", "mask", "Landroid/graphics/Paint;", "v", "Landroid/graphics/Paint;", "paint", "w", "clearPaint", "y", "a", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Pi2CircleMaskView extends View {

    private final float size;

    private final int maskColor;

    private Bitmap mask;

    @NotNull
    private Paint paint;

    @NotNull
    private Paint clearPaint;

    public Pi2CircleMaskView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final long b(float targetScaleX) {
        return ca.a.d((Math.abs(getScaleX() - targetScaleX) / 4.0f) * 500);
    }

    private final Bitmap c() {
        Bitmap bitmap = this.mask;
        if (bitmap != null) {
            if (bitmap.getWidth() != getWidth() || bitmap.getHeight() != getHeight()) {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(this.maskColor);
        canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, this.size * Math.min(canvas.getWidth(), canvas.getHeight()), this.clearPaint);
        this.mask = bitmapCreateBitmap;
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "apply(...)");
        return bitmapCreateBitmap;
    }

    public static void e(Pi2CircleMaskView pi2CircleMaskView, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        pi2CircleMaskView.d(z, function0);
    }

    public static final void f(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void d(boolean animated, final Function0<Unit> onComplete) {
        if (animated) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            viewPropertyAnimatorAnimate.setDuration(b(1.0f));
            viewPropertyAnimatorAnimate.scaleX(1.0f);
            viewPropertyAnimatorAnimate.scaleY(1.0f);
            viewPropertyAnimatorAnimate.withEndAction(new Runnable() {
                @Override
                public final void run() {
                    Pi2CircleMaskView.f(onComplete);
                }
            });
            viewPropertyAnimatorAnimate.start();
            return;
        }
        getAnimation().cancel();
        setScaleX(1.0f);
        setScaleY(1.0f);
        if (onComplete != null) {
            onComplete.invoke();
        }
    }

    public final boolean g() {
        return (getScaleX() == 5.0f && getScaleY() == 5.0f) ? false : true;
    }

    public final void h() {
        if (getScaleX() == 5.0f && getScaleY() == 5.0f) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.setDuration(b(5.0f));
        viewPropertyAnimatorAnimate.scaleX(5.0f);
        viewPropertyAnimatorAnimate.scaleY(5.0f);
        viewPropertyAnimatorAnimate.start();
    }

    @Override
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(c(), 0.0f, 0.0f, this.paint);
    }

    public Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public Pi2CircleMaskView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(7);
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(j.b, 0.4f);
            this.maskColor = typedArrayObtainStyledAttributes.getColor(j.c, -16777216);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
