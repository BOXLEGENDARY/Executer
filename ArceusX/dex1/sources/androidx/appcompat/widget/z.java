package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class z extends w {

    private final WeakReference<Context> f9372a;

    public z(Context context, Resources resources) {
        super(resources);
        this.f9372a = new WeakReference<>(context);
    }

    @Override
    public Drawable getDrawable(int i7) throws Resources.NotFoundException {
        Drawable drawableCanonical = getDrawableCanonical(i7);
        Context context = this.f9372a.get();
        if (drawableCanonical != null && context != null) {
            ResourceManagerInternal.get().tintDrawableUsingColorFilter(context, i7, drawableCanonical);
        }
        return drawableCanonical;
    }
}
