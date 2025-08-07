package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

public final class L implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    private final View f10603d;

    private ViewTreeObserver f10604e;

    private final Runnable f10605i;

    private L(View view, Runnable runnable) {
        this.f10603d = view;
        this.f10604e = view.getViewTreeObserver();
        this.f10605i = runnable;
    }

    public static L a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        L l7 = new L(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(l7);
        view.addOnAttachStateChangeListener(l7);
        return l7;
    }

    public void b() {
        if (this.f10604e.isAlive()) {
            this.f10604e.removeOnPreDrawListener(this);
        } else {
            this.f10603d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f10603d.removeOnAttachStateChangeListener(this);
    }

    @Override
    public boolean onPreDraw() {
        b();
        this.f10605i.run();
        return true;
    }

    @Override
    public void onViewAttachedToWindow(View view) {
        this.f10604e = view.getViewTreeObserver();
    }

    @Override
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
