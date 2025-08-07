package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class C1620h0 {

    private final WeakReference<View> f10669a;

    class a extends AnimatorListenerAdapter {

        final InterfaceC1622i0 f10670a;

        final View f10671b;

        a(InterfaceC1622i0 interfaceC1622i0, View view) {
            this.f10670a = interfaceC1622i0;
            this.f10671b = view;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            this.f10670a.onAnimationCancel(this.f10671b);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f10670a.onAnimationEnd(this.f10671b);
        }

        @Override
        public void onAnimationStart(Animator animator) {
            this.f10670a.onAnimationStart(this.f10671b);
        }
    }

    C1620h0(View view) {
        this.f10669a = new WeakReference<>(view);
    }

    private void i(View view, InterfaceC1622i0 interfaceC1622i0) {
        if (interfaceC1622i0 != null) {
            view.animate().setListener(new a(interfaceC1622i0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1620h0 b(float f7) {
        View view = this.f10669a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
        return this;
    }

    public void c() {
        View view = this.f10669a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f10669a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1620h0 f(long j7) {
        View view = this.f10669a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
        return this;
    }

    public C1620h0 g(Interpolator interpolator) {
        View view = this.f10669a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1620h0 h(InterfaceC1622i0 interfaceC1622i0) {
        View view = this.f10669a.get();
        if (view != null) {
            i(view, interfaceC1622i0);
        }
        return this;
    }

    public C1620h0 j(long j7) {
        View view = this.f10669a.get();
        if (view != null) {
            view.animate().setStartDelay(j7);
        }
        return this;
    }

    public C1620h0 k(final InterfaceC1626k0 interfaceC1626k0) {
        final View view = this.f10669a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1626k0 != null ? new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC1626k0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f10669a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1620h0 m(float f7) {
        View view = this.f10669a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
        return this;
    }
}
