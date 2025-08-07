package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q0.C2731a;

public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private g0.k<String, b> mDelegates;
    private final WeakHashMap<Context, g0.h<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private g0.l<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, g0.l<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final a COLOR_FILTER_CACHE = new a(6);

    public interface ResourceManagerHooks {
        Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i7);

        ColorStateList getTintListForDrawableRes(Context context, int i7);

        PorterDuff.Mode getTintModeForDrawableRes(int i7);

        boolean tintDrawable(Context context, int i7, Drawable drawable);

        boolean tintDrawableUsingColorFilter(Context context, int i7, Drawable drawable);
    }

    private static class a extends g0.j<Integer, PorterDuffColorFilter> {
        public a(int i7) {
            super(i7);
        }

        private static int m(int i7, PorterDuff.Mode mode) {
            return ((i7 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter n(int i7, PorterDuff.Mode mode) {
            return d(Integer.valueOf(m(i7, mode)));
        }

        PorterDuffColorFilter o(int i7, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return f(Integer.valueOf(m(i7, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    private void addDelegate(String str, b bVar) {
        if (this.mDelegates == null) {
            this.mDelegates = new g0.k<>();
        }
        this.mDelegates.put(str, bVar);
    }

    private synchronized boolean addDrawableToCache(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            g0.h<WeakReference<Drawable.ConstantState>> hVar = this.mDrawableCaches.get(context);
            if (hVar == null) {
                hVar = new g0.h<>();
                this.mDrawableCaches.put(context, hVar);
            }
            hVar.h(j7, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void addTintListToCache(Context context, int i7, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        g0.l<ColorStateList> lVar = this.mTintLists.get(context);
        if (lVar == null) {
            lVar = new g0.l<>();
            this.mTintLists.put(context, lVar);
        }
        lVar.a(i7, colorStateList);
    }

    private void checkVectorDrawableSetup(Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, j.b.f21124a);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable createDrawableIfNeeded(Context context, int i7) throws Resources.NotFoundException {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i7, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        Drawable drawableCreateDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i7);
        if (drawableCreateDrawableFor != null) {
            drawableCreateDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, jCreateCacheKey, drawableCreateDrawableFor);
        }
        return drawableCreateDrawableFor;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized ResourceManagerInternal get() {
        try {
            if (INSTANCE == null) {
                ResourceManagerInternal resourceManagerInternal = new ResourceManagerInternal();
                INSTANCE = resourceManagerInternal;
                installDefaultInflateDelegates(resourceManagerInternal);
            }
        } catch (Throwable th) {
            throw th;
        }
        return INSTANCE;
    }

    private synchronized Drawable getCachedDrawable(Context context, long j7) {
        g0.h<WeakReference<Drawable.ConstantState>> hVar = this.mDrawableCaches.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceD = hVar.d(j7);
        if (weakReferenceD != null) {
            Drawable.ConstantState constantState = weakReferenceD.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.i(j7);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterN;
        a aVar = COLOR_FILTER_CACHE;
        porterDuffColorFilterN = aVar.n(i7, mode);
        if (porterDuffColorFilterN == null) {
            porterDuffColorFilterN = new PorterDuffColorFilter(i7, mode);
            aVar.o(i7, mode, porterDuffColorFilterN);
        }
        return porterDuffColorFilterN;
    }

    private ColorStateList getTintListFromCache(Context context, int i7) {
        g0.l<ColorStateList> lVar;
        WeakHashMap<Context, g0.l<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (lVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return lVar.d(i7);
    }

    private static void installDefaultInflateDelegates(ResourceManagerInternal resourceManagerInternal) {
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private Drawable loadDrawableFromDelegates(Context context, int i7) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        g0.k<String, b> kVar = this.mDelegates;
        if (kVar == null || kVar.isEmpty()) {
            return null;
        }
        g0.l<String> lVar = this.mKnownDrawableIdTags;
        if (lVar != null) {
            String strD = lVar.d(i7);
            if (SKIP_DRAWABLE_TAG.equals(strD) || (strD != null && this.mDelegates.get(strD) == null)) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new g0.l<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.mKnownDrawableIdTags.a(i7, name);
                b bVar = this.mDelegates.get(name);
                if (bVar != null) {
                    cachedDrawable = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (cachedDrawable != null) {
                    cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                    addDrawableToCache(context, jCreateCacheKey, cachedDrawable);
                }
            } catch (Exception e7) {
                Log.e(TAG, "Exception while inflating drawable", e7);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.a(i7, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(Context context, int i7, boolean z7, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i7);
        if (tintList == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i7, drawable)) && !tintDrawableUsingColorFilter(context, i7, drawable) && z7) {
                return null;
            }
            return drawable;
        }
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = C2731a.r(drawable);
        C2731a.o(drawableR, tintList);
        PorterDuff.Mode tintMode = getTintMode(i7);
        if (tintMode == null) {
            return drawableR;
        }
        C2731a.p(drawableR, tintMode);
        return drawableR;
    }

    public synchronized Drawable getDrawable(Context context, int i7) {
        return getDrawable(context, i7, false);
    }

    synchronized ColorStateList getTintList(Context context, int i7) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i7);
        if (tintListFromCache == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            tintListFromCache = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i7);
            if (tintListFromCache != null) {
                addTintListToCache(context, i7, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    PorterDuff.Mode getTintMode(int i7) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i7);
    }

    public synchronized void onConfigurationChanged(Context context) {
        g0.h<WeakReference<Drawable.ConstantState>> hVar = this.mDrawableCaches.get(context);
        if (hVar != null) {
            hVar.a();
        }
    }

    synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i7) {
        try {
            Drawable drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i7);
            if (drawableLoadDrawableFromDelegates == null) {
                drawableLoadDrawableFromDelegates = vectorEnabledTintResources.getDrawableCanonical(i7);
            }
            if (drawableLoadDrawableFromDelegates == null) {
                return null;
            }
            return tintDrawable(context, i7, false, drawableLoadDrawableFromDelegates);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.mHooks = resourceManagerHooks;
    }

    boolean tintDrawableUsingColorFilter(Context context, int i7, Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i7, drawable);
    }

    synchronized Drawable getDrawable(Context context, int i7, boolean z7) {
        Drawable drawableLoadDrawableFromDelegates;
        try {
            checkVectorDrawableSetup(context);
            drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i7);
            if (drawableLoadDrawableFromDelegates == null) {
                drawableLoadDrawableFromDelegates = createDrawableIfNeeded(context, i7);
            }
            if (drawableLoadDrawableFromDelegates == null) {
                drawableLoadDrawableFromDelegates = androidx.core.content.a.e(context, i7);
            }
            if (drawableLoadDrawableFromDelegates != null) {
                drawableLoadDrawableFromDelegates = tintDrawable(context, i7, z7, drawableLoadDrawableFromDelegates);
            }
            if (drawableLoadDrawableFromDelegates != null) {
                DrawableUtils.fixDrawable(drawableLoadDrawableFromDelegates);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableLoadDrawableFromDelegates;
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        int[] state = drawable.getState();
        if (DrawableUtils.canSafelyMutateDrawable(drawable) && drawable.mutate() != drawable) {
            Log.d(TAG, "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z7 = tintInfo.mHasTintList;
        if (!z7 && !tintInfo.mHasTintMode) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(createTintFilter(z7 ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
        }
    }
}
