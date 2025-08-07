package com.withpersona.sdk2.inquiry.governmentid.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import j9.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import v8.C0827H;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/SpotlightView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "c", "", "left", "top", "right", "bottom", "d", "(IIII)V", "onFinishInflate", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "I", "targetViewId", "", "e", "F", "getRadius", "()F", "setRadius", "(F)V", "radius", "Landroid/graphics/Path;", "i", "Landroid/graphics/Path;", "clipPath", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class SpotlightView extends View {

    private int targetViewId;

    private float radius;

    private Path clipPath;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends l implements Function0<Unit> {
        a() {
            super(0);
        }

        public static final void b(SpotlightView spotlightView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
            Intrinsics.checkNotNullParameter(spotlightView, "this$0");
            spotlightView.d(i, i2, i3, i4);
        }

        public Object invoke() {
            m81invoke();
            return Unit.a;
        }

        public final void m81invoke() {
            View viewFindViewById;
            Object parent = SpotlightView.this.getParent();
            if (!(parent instanceof View) || (viewFindViewById = ((View) parent).findViewById(SpotlightView.this.targetViewId)) == null) {
                return;
            }
            final SpotlightView spotlightView = SpotlightView.this;
            viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i10) {
                    SpotlightView.a.b(spotlightView, view, i, i2, i3, i4, i5, i6, i7, i10);
                }
            });
            SpotlightView.this.d(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        }
    }

    public SpotlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    private final void c(Context context, AttributeSet attrs) {
        Resources.Theme theme;
        TypedArray typedArrayObtainStyledAttributes;
        if (context == null || (theme = context.getTheme()) == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attrs, C0827H.a, 0, 0)) == null) {
            return;
        }
        try {
            this.targetViewId = typedArrayObtainStyledAttributes.getResourceId(C0827H.c, 0);
            this.radius = typedArrayObtainStyledAttributes.getDimension(C0827H.b, 0.0f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void d(int left, int top, int right, int bottom) {
        Path path = new Path();
        float f = this.radius;
        path.addRoundRect(left, top, right, bottom, f, f, Path.Direction.CW);
        this.clipPath = path;
        invalidate();
    }

    @Override
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path path = this.clipPath;
        if (path == null) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutPath(path);
        super.draw(canvas);
        canvas.restore();
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        o.b(this, new a());
    }

    public final void setRadius(float f) {
        this.radius = f;
    }
}
