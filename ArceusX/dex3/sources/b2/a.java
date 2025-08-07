package b2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> d = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> e = new CopyOnWriteArraySet();

    void a() {
        Iterator<Animator.AnimatorListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.e.add(animatorListener);
    }

    @Override
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.d.add(animatorUpdateListener);
    }

    void b(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    void c() {
        Iterator<Animator.AnimatorListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void d(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z);
        }
    }

    void e() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override
    public void removeAllListeners() {
        this.e.clear();
    }

    @Override
    public void removeAllUpdateListeners() {
        this.d.clear();
    }

    @Override
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.e.remove(animatorListener);
    }

    @Override
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.d.remove(animatorUpdateListener);
    }

    @Override
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
