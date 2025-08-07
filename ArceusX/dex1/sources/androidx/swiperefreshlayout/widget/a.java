package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.Z;

class a extends ImageView {

    private Animation.AnimationListener f12165d;

    private int f12166e;

    private int f12167i;

    private static class C0119a extends OvalShape {

        private Paint f12168d = new Paint();

        private int f12169e;

        private a f12170i;

        C0119a(a aVar, int i7) {
            this.f12170i = aVar;
            this.f12169e = i7;
            a((int) rect().width());
        }

        private void a(int i7) {
            float f7 = i7 / 2;
            this.f12168d.setShader(new RadialGradient(f7, f7, this.f12169e, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f12170i.getWidth() / 2;
            float height = this.f12170i.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f12168d);
            canvas.drawCircle(width, height, r0 - this.f12169e, paint);
        }

        @Override
        protected void onResize(float f7, float f8) {
            super.onResize(f7, f8);
            a((int) f7);
        }
    }

    a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f7 = getContext().getResources().getDisplayMetrics().density;
        int i7 = (int) (1.75f * f7);
        int i8 = (int) (0.0f * f7);
        this.f12166e = (int) (3.5f * f7);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(g1.a.f20953f);
        this.f12167i = typedArrayObtainStyledAttributes.getColor(g1.a.f20954g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            Z.v0(this, f7 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0119a(this, this.f12166e));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f12166e, i8, i7, 503316480);
            int i9 = this.f12166e;
            setPadding(i9, i9, i9, i9);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f12167i);
        Z.r0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f12165d = animationListener;
    }

    @Override
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f12165d;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f12165d;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f12166e * 2), getMeasuredHeight() + (this.f12166e * 2));
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i7);
            this.f12167i = i7;
        }
    }
}
