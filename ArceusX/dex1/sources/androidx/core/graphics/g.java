package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p0.e;

class g extends k {

    private static Class<?> f10582b;

    private static Constructor<?> f10583c;

    private static Method f10584d;

    private static Method f10585e;

    private static boolean f10586f;

    g() {
    }

    private static boolean h(Object obj, String str, int i7, boolean z7) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        j();
        try {
            return ((Boolean) f10584d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        j();
        try {
            Object objNewInstance = Array.newInstance(f10582b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f10585e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static void j() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f10586f) {
            return;
        }
        f10586f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f10583c = constructor;
        f10582b = cls;
        f10584d = method2;
        f10585e = method;
    }

    private static Object k() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        j();
        try {
            return f10583c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objK = k();
        for (e.d dVar : cVar.a()) {
            File fileD = l.d(context);
            if (fileD == null) {
                return null;
            }
            try {
                if (!l.b(fileD, resources, dVar.b())) {
                    return null;
                }
                if (!h(objK, fileD.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileD.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileD.delete();
            }
        }
        return i(objK);
    }
}
