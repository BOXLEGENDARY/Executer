package d4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class C2395h {

    private final g0.k<String, C2396i> f20325a = new g0.k<>();

    private final g0.k<String, PropertyValuesHolder[]> f20326b = new g0.k<>();

    private static void a(C2395h c2395h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c2395h.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c2395h.i(objectAnimator.getPropertyName(), C2396i.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static C2395h b(Context context, TypedArray typedArray, int i7) {
        int resourceId;
        if (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static C2395h c(Context context, int i7) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i7);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e7) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i7), e7);
            return null;
        }
    }

    private static C2395h d(List<Animator> list) {
        C2395h c2395h = new C2395h();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            a(c2395h, list.get(i7));
        }
        return c2395h;
    }

    public C2396i e(String str) {
        if (g(str)) {
            return this.f20325a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2395h) {
            return this.f20325a.equals(((C2395h) obj).f20325a);
        }
        return false;
    }

    public long f() {
        int size = this.f20325a.getSize();
        long jMax = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C2396i c2396iK = this.f20325a.k(i7);
            jMax = Math.max(jMax, c2396iK.c() + c2396iK.d());
        }
        return jMax;
    }

    public boolean g(String str) {
        return this.f20325a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f20326b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f20325a.hashCode();
    }

    public void i(String str, C2396i c2396i) {
        this.f20325a.put(str, c2396i);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f20325a + "}\n";
    }
}
