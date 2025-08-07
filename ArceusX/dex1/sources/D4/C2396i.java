package d4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class C2396i {

    private long f20327a;

    private long f20328b;

    private TimeInterpolator f20329c;

    private int f20330d;

    private int f20331e;

    public C2396i(long j7, long j8) {
        this.f20329c = null;
        this.f20330d = 0;
        this.f20331e = 1;
        this.f20327a = j7;
        this.f20328b = j8;
    }

    static C2396i b(ValueAnimator valueAnimator) {
        C2396i c2396i = new C2396i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        c2396i.f20330d = valueAnimator.getRepeatCount();
        c2396i.f20331e = valueAnimator.getRepeatMode();
        return c2396i;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C2388a.f20313b : interpolator instanceof AccelerateInterpolator ? C2388a.f20314c : interpolator instanceof DecelerateInterpolator ? C2388a.f20315d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f20327a;
    }

    public long d() {
        return this.f20328b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f20329c;
        return timeInterpolator != null ? timeInterpolator : C2388a.f20313b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2396i)) {
            return false;
        }
        C2396i c2396i = (C2396i) obj;
        if (c() == c2396i.c() && d() == c2396i.d() && g() == c2396i.g() && h() == c2396i.h()) {
            return e().getClass().equals(c2396i.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f20330d;
    }

    public int h() {
        return this.f20331e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public C2396i(long j7, long j8, TimeInterpolator timeInterpolator) {
        this.f20330d = 0;
        this.f20331e = 1;
        this.f20327a = j7;
        this.f20328b = j8;
        this.f20329c = timeInterpolator;
    }
}
