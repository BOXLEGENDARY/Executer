package p0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import x0.C2985b;

public final class h {

    private static final ThreadLocal<TypedValue> f22647a = new ThreadLocal<>();

    private static final WeakHashMap<e, SparseArray<d>> f22648b = new WeakHashMap<>(0);

    private static final Object f22649c = new Object();

    static class a {
        static Drawable a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }

        static Drawable b(Resources resources, int i7, int i8, Resources.Theme theme) {
            return resources.getDrawableForDensity(i7, i8, theme);
        }
    }

    static class b {
        static ColorStateList a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColorStateList(i7, theme);
        }
    }

    static class c {
        static float a(Resources resources, int i7) {
            return resources.getFloat(i7);
        }
    }

    private static class d {

        final ColorStateList f22650a;

        final Configuration f22651b;

        final int f22652c;

        d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f22650a = colorStateList;
            this.f22651b = configuration;
            this.f22652c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class e {

        final Resources f22653a;

        final Resources.Theme f22654b;

        e(Resources resources, Resources.Theme theme) {
            this.f22653a = resources;
            this.f22654b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f22653a.equals(eVar.f22653a) && C2985b.a(this.f22654b, eVar.f22654b);
        }

        public int hashCode() {
            return C2985b.b(this.f22653a, this.f22654b);
        }
    }

    public static abstract class f {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i7, Handler handler) {
            e(handler).post(new Runnable() {
                @Override
                public final void run() {
                    this.f22660d.f(i7);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() {
                @Override
                public final void run() {
                    this.f22658d.g(typeface);
                }
            });
        }

        public abstract void f(int i7);

        public abstract void g(Typeface typeface);
    }

    public static final class g {

        static class a {

            private static final Object f22655a = new Object();

            private static Method f22656b;

            private static boolean f22657c;

            static void a(android.content.res.Resources.Theme r6) {
                throw new UnsupportedOperationException("Method not decompiled: p0.h.g.a.a(android.content.res.Resources$Theme):void");
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(e eVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f22649c) {
            try {
                WeakHashMap<e, SparseArray<d>> weakHashMap = f22648b;
                SparseArray<d> sparseArray = weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i7, new d(colorStateList, eVar.f22653a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static android.content.res.ColorStateList b(p0.h.e r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: p0.h.b(p0.h$e, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i7) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i7, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i7, Resources.Theme theme) throws Resources.NotFoundException {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListB = b(eVar, i7);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i7, theme);
        if (colorStateListL == null) {
            return b.a(resources, i7, theme);
        }
        a(eVar, i7, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable e(Resources resources, int i7, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i7, theme);
    }

    public static Drawable f(Resources resources, int i7, int i8, Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i7, i8, theme);
    }

    public static float g(Resources resources, int i7) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i7);
        }
        TypedValue typedValueK = k();
        resources.getValue(i7, typedValueK, true);
        if (typedValueK.type == 4) {
            return typedValueK.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i7) + " type #0x" + Integer.toHexString(typedValueK.type) + " is not valid");
    }

    public static Typeface h(Context context, int i7) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i7, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i7, TypedValue typedValue, int i8, f fVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i7, typedValue, i8, fVar, null, true, false);
    }

    public static void j(Context context, int i7, f fVar, Handler handler) throws Resources.NotFoundException {
        x0.g.g(fVar);
        if (context.isRestricted()) {
            fVar.c(-4, handler);
        } else {
            n(context, i7, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    private static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = f22647a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList l(Resources resources, int i7, Resources.Theme theme) {
        if (m(resources, i7)) {
            return null;
        }
        try {
            return p0.c.a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            return null;
        }
    }

    private static boolean m(Resources resources, int i7) throws Resources.NotFoundException {
        TypedValue typedValueK = k();
        resources.getValue(i7, typedValueK, true);
        int i8 = typedValueK.type;
        return i8 >= 28 && i8 <= 31;
    }

    private static Typeface n(Context context, int i7, TypedValue typedValue, int i8, f fVar, Handler handler, boolean z7, boolean z8) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i7, i8, fVar, handler, z7, z8);
        if (typefaceO != null || fVar != null || z8) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }

    private static android.graphics.Typeface o(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, p0.h.f r21, android.os.Handler r22, boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: p0.h.o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, p0.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
