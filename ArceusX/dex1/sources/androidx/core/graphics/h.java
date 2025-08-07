package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p0.e;
import v0.k;

public class h extends g {

    protected final Class<?> f10587g;

    protected final Constructor<?> f10588h;

    protected final Method f10589i;

    protected final Method f10590j;

    protected final Method f10591k;

    protected final Method f10592l;

    protected final Method f10593m;

    public h() {
        Class<?> clsU;
        Constructor<?> constructorV;
        Method methodR;
        Method methodS;
        Method methodW;
        Method methodQ;
        Method methodT;
        try {
            clsU = u();
            constructorV = v(clsU);
            methodR = r(clsU);
            methodS = s(clsU);
            methodW = w(clsU);
            methodQ = q(clsU);
            methodT = t(clsU);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e7.getClass().getName(), e7);
            clsU = null;
            constructorV = null;
            methodR = null;
            methodS = null;
            methodW = null;
            methodQ = null;
            methodT = null;
        }
        this.f10587g = clsU;
        this.f10588h = constructorV;
        this.f10589i = methodR;
        this.f10590j = methodS;
        this.f10591k = methodW;
        this.f10592l = methodQ;
        this.f10593m = methodT;
    }

    private Object k() {
        try {
            return this.f10588h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f10592l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10589i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i7, int i8, int i9) {
        try {
            return ((Boolean) this.f10590j.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Integer.valueOf(i9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.f10591k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        if (this.f10589i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f10589i != null;
    }

    @Override
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!p()) {
            return super.a(context, cVar, resources, i7);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!m(context, objK, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(objK);
                return null;
            }
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i7) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceI;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            k.b bVarG = g(bVarArr, i7);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapF = l.f(context, bVarArr, cancellationSignal);
        Object objK = k();
        if (objK == null) {
            return null;
        }
        boolean z7 = false;
        for (k.b bVar : bVarArr) {
            ByteBuffer byteBuffer = mapF.get(bVar.d());
            if (byteBuffer != null) {
                if (!n(objK, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    l(objK);
                    return null;
                }
                z7 = true;
            }
        }
        if (!z7) {
            l(objK);
            return null;
        }
        if (o(objK) && (typefaceI = i(objK)) != null) {
            return Typeface.create(typefaceI, i7);
        }
        return null;
    }

    @Override
    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        return super.c(context, cancellationSignal, list, i7);
    }

    @Override
    public Typeface d(Context context, Resources resources, int i7, String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!p()) {
            return super.d(context, resources, i7, str, i8);
        }
        Object objK = k();
        if (objK == null) {
            return null;
        }
        if (!m(context, objK, str, 0, -1, -1, null)) {
            l(objK);
            return null;
        }
        if (o(objK)) {
            return i(objK);
        }
        return null;
    }

    protected Typeface i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f10587g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10593m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method q(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }

    protected Method r(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method s(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> u() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> v(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    protected Method w(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }
}
