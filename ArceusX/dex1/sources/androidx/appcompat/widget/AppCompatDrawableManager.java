package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import g.C2447a;
import g.C2449c;
import g.C2450d;
import g.C2451e;
import h.C2473a;

public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    class a implements ResourceManagerInternal.ResourceManagerHooks {

        private final int[] f9142a = {C2451e.f20602R, C2451e.f20600P, C2451e.f20604a};

        private final int[] f9143b = {C2451e.f20618o, C2451e.f20586B, C2451e.f20623t, C2451e.f20619p, C2451e.f20620q, C2451e.f20622s, C2451e.f20621r};

        private final int[] f9144c = {C2451e.f20599O, C2451e.f20601Q, C2451e.f20614k, C2451e.f20595K, C2451e.f20596L, C2451e.f20597M, C2451e.f20598N};

        private final int[] f9145d = {C2451e.f20626w, C2451e.f20612i, C2451e.f20625v};

        private final int[] f9146e = {C2451e.f20594J, C2451e.f20603S};

        private final int[] f9147f = {C2451e.f20606c, C2451e.f20610g, C2451e.f20607d, C2451e.f20611h};

        a() {
        }

        private boolean a(int[] iArr, int i7) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList b(Context context) {
            return c(context, 0);
        }

        private ColorStateList c(Context context, int i7) {
            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, C2447a.f20563y);
            return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, C2447a.f20561w), androidx.core.graphics.a.h(themeAttrColor, i7), androidx.core.graphics.a.h(themeAttrColor, i7), i7});
        }

        private ColorStateList d(Context context) {
            return c(context, ThemeUtils.getThemeAttrColor(context, C2447a.f20560v));
        }

        private ColorStateList e(Context context) {
            return c(context, ThemeUtils.getThemeAttrColor(context, C2447a.f20561w));
        }

        private ColorStateList f(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i7 = C2447a.f20521B;
            ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i7);
            if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i7);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, C2447a.f20562x);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = ThemeUtils.getThemeAttrColor(context, i7);
            } else {
                int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                iArr[0] = iArr3;
                iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, C2447a.f20562x);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = themeAttrColorStateList.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable g(ResourceManagerInternal resourceManagerInternal, Context context, int i7) throws Resources.NotFoundException {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
            Drawable drawable = resourceManagerInternal.getDrawable(context, C2451e.f20590F);
            Drawable drawable2 = resourceManagerInternal.getDrawable(context, C2451e.f20591G);
            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawable;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawable2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void h(Drawable drawable, int i7, PorterDuff.Mode mode) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = AppCompatDrawableManager.DEFAULT_MODE;
            }
            drawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i7, mode));
        }

        @Override
        public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i7) {
            if (i7 == C2451e.f20613j) {
                return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, C2451e.f20612i), resourceManagerInternal.getDrawable(context, C2451e.f20614k)});
            }
            if (i7 == C2451e.f20628y) {
                return g(resourceManagerInternal, context, C2450d.f20582i);
            }
            if (i7 == C2451e.f20627x) {
                return g(resourceManagerInternal, context, C2450d.f20583j);
            }
            if (i7 == C2451e.f20629z) {
                return g(resourceManagerInternal, context, C2450d.f20584k);
            }
            return null;
        }

        @Override
        public ColorStateList getTintListForDrawableRes(Context context, int i7) {
            if (i7 == C2451e.f20616m) {
                return C2473a.a(context, C2449c.f20570e);
            }
            if (i7 == C2451e.f20593I) {
                return C2473a.a(context, C2449c.f20573h);
            }
            if (i7 == C2451e.f20592H) {
                return f(context);
            }
            if (i7 == C2451e.f20609f) {
                return e(context);
            }
            if (i7 == C2451e.f20605b) {
                return b(context);
            }
            if (i7 == C2451e.f20608e) {
                return d(context);
            }
            if (i7 == C2451e.f20588D || i7 == C2451e.f20589E) {
                return C2473a.a(context, C2449c.f20572g);
            }
            if (a(this.f9143b, i7)) {
                return ThemeUtils.getThemeAttrColorStateList(context, C2447a.f20564z);
            }
            if (a(this.f9146e, i7)) {
                return C2473a.a(context, C2449c.f20569d);
            }
            if (a(this.f9147f, i7)) {
                return C2473a.a(context, C2449c.f20568c);
            }
            if (i7 == C2451e.f20585A) {
                return C2473a.a(context, C2449c.f20571f);
            }
            return null;
        }

        @Override
        public PorterDuff.Mode getTintModeForDrawableRes(int i7) {
            if (i7 == C2451e.f20592H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override
        public boolean tintDrawable(Context context, int i7, Drawable drawable) {
            if (i7 == C2451e.f20587C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i8 = C2447a.f20564z;
                h(drawableFindDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i8), AppCompatDrawableManager.DEFAULT_MODE);
                h(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, i8), AppCompatDrawableManager.DEFAULT_MODE);
                h(layerDrawable.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, C2447a.f20562x), AppCompatDrawableManager.DEFAULT_MODE);
                return true;
            }
            if (i7 != C2451e.f20628y && i7 != C2451e.f20627x && i7 != C2451e.f20629z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            h(layerDrawable2.findDrawableByLayerId(R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, C2447a.f20564z), AppCompatDrawableManager.DEFAULT_MODE);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i9 = C2447a.f20562x;
            h(drawableFindDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i9), AppCompatDrawableManager.DEFAULT_MODE);
            h(layerDrawable2.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, i9), AppCompatDrawableManager.DEFAULT_MODE);
            return true;
        }

        @Override
        public boolean tintDrawableUsingColorFilter(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.a.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    public static synchronized AppCompatDrawableManager get() {
        try {
            if (INSTANCE == null) {
                preload();
            }
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i7, PorterDuff.Mode mode) {
        return ResourceManagerInternal.getPorterDuffColorFilter(i7, mode);
    }

    public static synchronized void preload() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
            INSTANCE.mResourceManager.setHooks(new a());
        }
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public synchronized Drawable getDrawable(Context context, int i7) {
        return this.mResourceManager.getDrawable(context, i7);
    }

    synchronized ColorStateList getTintList(Context context, int i7) {
        return this.mResourceManager.getTintList(context, i7);
    }

    public synchronized void onConfigurationChanged(Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i7) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i7);
    }

    boolean tintDrawableUsingColorFilter(Context context, int i7, Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i7, drawable);
    }

    synchronized Drawable getDrawable(Context context, int i7, boolean z7) {
        return this.mResourceManager.getDrawable(context, i7, z7);
    }
}
