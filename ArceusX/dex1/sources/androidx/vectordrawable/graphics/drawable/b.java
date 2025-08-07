package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public abstract class b {

    Animatable2.AnimationCallback f12429a;

    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override
        public void onAnimationEnd(Drawable drawable) {
            b.this.b(drawable);
        }

        @Override
        public void onAnimationStart(Drawable drawable) {
            b.this.c(drawable);
        }
    }

    Animatable2.AnimationCallback a() {
        if (this.f12429a == null) {
            this.f12429a = new a();
        }
        return this.f12429a;
    }

    public void b(Drawable drawable) {
    }

    public void c(Drawable drawable) {
    }
}
