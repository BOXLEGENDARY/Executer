package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.room.kU.HguUe;
import g0.C2457a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    protected final C2457a<String, Method> f12517a;

    protected final C2457a<String, Method> f12518b;

    protected final C2457a<String, Class> f12519c;

    public a(C2457a<String, Method> c2457a, C2457a<String, Method> c2457a2, C2457a<String, Class> c2457a3) {
        this.f12517a = c2457a;
        this.f12518b = c2457a2;
        this.f12519c = c2457a3;
    }

    private void N(i1.a aVar) {
        try {
            I(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e7);
        }
    }

    private Class c(Class<? extends i1.a> cls) throws ClassNotFoundException {
        Class cls2 = this.f12519c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f12519c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = this.f12517a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f12517a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.f12518b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, a.class);
        this.f12518b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i7) {
        w(i7);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i7) {
        w(i7);
        C(charSequence);
    }

    protected abstract void E(int i7);

    public void F(int i7, int i8) {
        w(i8);
        E(i7);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i7) {
        w(i7);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i7) {
        w(i7);
        I(str);
    }

    protected <T extends i1.a> void K(T t7, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            e(t7.getClass()).invoke(null, t7, aVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (!(e10.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
            throw ((RuntimeException) e10.getCause());
        }
    }

    protected void L(i1.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (aVar == null) {
            I(null);
            return;
        }
        N(aVar);
        a aVarB = b();
        K(aVar, aVarB);
        aVarB.a();
    }

    public void M(i1.a aVar, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        w(i7);
        L(aVar);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z7, int i7) {
        return !m(i7) ? z7 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i7) {
        return !m(i7) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i7) {
        return !m(i7) ? charSequence : k();
    }

    protected abstract boolean m(int i7);

    protected <T extends i1.a> T n(String str, a aVar) {
        try {
            return (T) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(HguUe.BTMtIQjkMnx, e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    protected abstract int o();

    public int p(int i7, int i8) {
        return !m(i8) ? i7 : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t7, int i7) {
        return !m(i7) ? t7 : (T) q();
    }

    protected abstract String s();

    public String t(String str, int i7) {
        return !m(i7) ? str : s();
    }

    protected <T extends i1.a> T u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return (T) n(strS, b());
    }

    public <T extends i1.a> T v(T t7, int i7) {
        return !m(i7) ? t7 : (T) u();
    }

    protected abstract void w(int i7);

    public void x(boolean z7, boolean z8) {
    }

    protected abstract void y(boolean z7);

    public void z(boolean z7, int i7) {
        w(i7);
        y(z7);
    }
}
