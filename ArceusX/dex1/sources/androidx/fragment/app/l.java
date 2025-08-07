package androidx.fragment.app;

import androidx.fragment.app.Fragment;

public class l {

    private static final g0.k<ClassLoader, g0.k<String, Class<?>>> f11208a = new g0.k<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        g0.k<ClassLoader, g0.k<String, Class<?>>> kVar = f11208a;
        g0.k<String, Class<?>> kVar2 = kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new g0.k<>();
            kVar.put(classLoader, kVar2);
        }
        Class<?> cls = kVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e7) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e7);
        } catch (ClassNotFoundException e8) {
            throw new Fragment.l("Unable to instantiate fragment " + str + ": make sure class name exists", e8);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
