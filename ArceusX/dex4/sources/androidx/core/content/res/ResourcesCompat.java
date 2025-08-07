package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    @Nullable
    public static Drawable getDrawable(@NonNull Resources res, @DrawableRes int id, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawable(id, theme);
        }
        return res.getDrawable(id);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources res, @DrawableRes int id, int density, @Nullable Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            return res.getDrawableForDensity(id, density, theme);
        }
        if (i >= 15) {
            return res.getDrawableForDensity(id, density);
        }
        return res.getDrawable(id);
    }

    @ColorInt
    public static int getColor(@NonNull Resources res, @ColorRes int id, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return res.getColor(id, theme);
        }
        return res.getColor(id);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources res, @ColorRes int id, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return res.getColorStateList(id, theme);
        }
        return res.getColorStateList(id);
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int id) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, id, new TypedValue(), 0, null, null, false);
    }

    public static abstract class FontCallback {
        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackSuccessAsync(final Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                @Override
                public void run() {
                    FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackFailAsync(final int reason, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                @Override
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(reason);
                }
            });
        }
    }

    public static void getFont(@NonNull Context context, @FontRes int id, @NonNull FontCallback fontCallback, @Nullable Handler handler) throws Throwable {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, id, new TypedValue(), 0, fontCallback, handler, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Typeface getFont(@NonNull Context context, @FontRes int id, TypedValue value, int style, @Nullable FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, id, value, style, fontCallback, null, true);
    }

    private static Typeface loadFont(@NonNull Context context, int id, TypedValue value, int style, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean isRequestFromLayoutInflator) throws Throwable {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = loadFont(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface == null && fontCallback == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
        }
        return typeface;
    }

    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r19, android.content.res.Resources r20, android.util.TypedValue r21, int r22, int r23, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r24, @androidx.annotation.Nullable android.os.Handler r25, boolean r26) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean):android.graphics.Typeface");
    }

    private ResourcesCompat() {
    }
}
