package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "()V", "", "w", "h", "orientationDegrees", "b", "(III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "d", "I", "previewW", "e", "previewH", "Landroid/view/SurfaceView;", "i", "Landroid/view/SurfaceView;", "getSurfaceView", "()Landroid/view/SurfaceView;", "setSurfaceView", "(Landroid/view/SurfaceView;)V", "surfaceView", "Landroid/view/SurfaceHolder;", "getHolder", "()Landroid/view/SurfaceHolder;", "holder", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Camera2PreviewView extends ViewGroup {

    private int previewW;

    private int previewH;

    @NotNull
    private SurfaceView surfaceView;

    public Camera2PreviewView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }

    public final void a() {
        removeAllViews();
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
        requestLayout();
    }

    public final void b(int w, int h, int orientationDegrees) {
        if (orientationDegrees == 90 || orientationDegrees == 270) {
            this.previewW = h;
            this.previewH = w;
        } else {
            this.previewW = w;
            this.previewH = h;
        }
        getHolder().setFixedSize(w, h);
        requestLayout();
    }

    @NotNull
    public final SurfaceHolder getHolder() {
        SurfaceHolder holder = this.surfaceView.getHolder();
        Intrinsics.checkNotNullExpressionValue(holder, "getHolder(...)");
        return holder;
    }

    @NotNull
    public final SurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.previewW == 0 || this.previewH == 0) {
            this.surfaceView.layout(left, top, right, bottom);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        double dMax = Double.max(measuredWidth / this.previewW, measuredHeight / this.previewH);
        int iCeil = (int) Math.ceil(this.previewW * dMax);
        int iCeil2 = (int) Math.ceil(dMax * this.previewH);
        int iC = (b.c(iCeil - measuredWidth, 0) / 2) * (-1);
        int iC2 = (b.c(iCeil2 - measuredHeight, 0) / 2) * (-1);
        this.surfaceView.layout(iC, iC2, iCeil + iC, iCeil2 + iC2);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(Integer.MAX_VALUE, widthMeasureSpec), View.resolveSize(Integer.MAX_VALUE, heightMeasureSpec));
        this.surfaceView.measure(View.MeasureSpec.makeMeasureSpec(this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(this.previewH, 1073741824));
    }

    public final void setSurfaceView(@NotNull SurfaceView surfaceView) {
        Intrinsics.checkNotNullParameter(surfaceView, "<set-?>");
        this.surfaceView = surfaceView;
    }
}
