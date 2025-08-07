package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class C1729m implements TypeEvaluator<Rect> {

    private Rect f12330a;

    C1729m() {
    }

    @Override
    public Rect evaluate(float f7, Rect rect, Rect rect2) {
        int i7 = rect.left + ((int) ((rect2.left - r0) * f7));
        int i8 = rect.top + ((int) ((rect2.top - r1) * f7));
        int i9 = rect.right + ((int) ((rect2.right - r2) * f7));
        int i10 = rect.bottom + ((int) ((rect2.bottom - r6) * f7));
        Rect rect3 = this.f12330a;
        if (rect3 == null) {
            return new Rect(i7, i8, i9, i10);
        }
        rect3.set(i7, i8, i9, i10);
        return this.f12330a;
    }

    C1729m(Rect rect) {
        this.f12330a = rect;
    }
}
