package a0;

import E.p;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.AbstractC1601c;
import androidx.room.kU.HguUe;
import c0.C1744a;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import e2.vb.oyfFwvPUKctyaG;
import java.util.Objects;
import z.C3043d0;
import z.T;

public final class k extends View {

    private AbstractC1601c f8247d;

    private Window f8248e;

    private T.i f8249i;

    class a implements T.i {

        private float f8250a;

        private ValueAnimator f8251b;

        a() {
        }

        @Override
        public void a(long j7, final T.j jVar) {
            C3043d0.a("ScreenFlashView", HguUe.DOX);
            this.f8250a = k.this.getBrightness();
            k.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f8251b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            k kVar = k.this;
            Objects.requireNonNull(jVar);
            this.f8251b = kVar.e(new Runnable() {
                @Override
                public final void run() {
                    jVar.a();
                }
            });
        }

        @Override
        public void clear() {
            C3043d0.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
            ValueAnimator valueAnimator = this.f8251b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f8251b = null;
            }
            k.this.setAlpha(0.0f);
            k.this.setBrightness(this.f8250a);
        }
    }

    class b implements Animator.AnimatorListener {

        final Runnable f8253a;

        b(Runnable runnable) {
            this.f8253a = runnable;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C3043d0.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f8253a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
        }

        @Override
        public void onAnimationStart(Animator animator) {
        }
    }

    public k(Context context) {
        this(context, null);
    }

    public ValueAnimator e(Runnable runnable) {
        C3043d0.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8245a.f(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    public void f(ValueAnimator valueAnimator) {
        C3043d0.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void g(Window window) {
        if (this.f8248e != window) {
            this.f8249i = window == null ? null : new a();
        }
    }

    public float getBrightness() {
        Window window = this.f8248e;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        C3043d0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    public void setBrightness(float f7) {
        Window window = this.f8248e;
        String str = oyfFwvPUKctyaG.DjPCqkh;
        if (window == null) {
            C3043d0.c(str, "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f7)) {
            C3043d0.c(str, jUbDmI.KtbRys);
            return;
        }
        WindowManager.LayoutParams attributes = this.f8248e.getAttributes();
        attributes.screenBrightness = f7;
        this.f8248e.setAttributes(attributes);
        C3043d0.a(str, "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(T.i iVar) {
        AbstractC1601c abstractC1601c = this.f8247d;
        if (abstractC1601c == null) {
            C3043d0.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            abstractC1601c.H(new C1744a(C1744a.EnumC0141a.SCREEN_FLASH_VIEW, iVar));
        }
    }

    public T.i getScreenFlash() {
        return this.f8249i;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC1601c abstractC1601c) {
        p.a();
        AbstractC1601c abstractC1601c2 = this.f8247d;
        if (abstractC1601c2 != null && abstractC1601c2 != abstractC1601c) {
            setScreenFlashUiInfo(null);
        }
        this.f8247d = abstractC1601c;
        if (abstractC1601c == null) {
            return;
        }
        if (abstractC1601c.l() == 3 && this.f8248e == null) {
            throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        }
        setScreenFlashUiInfo(getScreenFlash());
    }

    public void setScreenFlashWindow(Window window) {
        p.a();
        g(window);
        this.f8248e = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public k(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
