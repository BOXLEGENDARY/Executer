package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;

public final class C2473a {
    public static ColorStateList a(Context context, int i7) {
        return androidx.core.content.a.d(context, i7);
    }

    public static Drawable b(Context context, int i7) {
        return ResourceManagerInternal.get().getDrawable(context, i7);
    }
}
