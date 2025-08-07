package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Q3;
import com.google.android.gms.internal.measurement.T3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class T3<MessageType extends T3<MessageType, BuilderType>, BuilderType extends Q3<MessageType, BuilderType>> extends AbstractC1853d3<MessageType, BuilderType> {
    private static final Map<Object, T3<?, ?>> zza = new ConcurrentHashMap();
    protected Z4 zzc = Z4.c();
    protected int zzd = -1;

    protected static <E> InterfaceC1830a4<E> k() {
        return H4.e();
    }

    protected static <E> InterfaceC1830a4<E> l(InterfaceC1830a4<E> interfaceC1830a4) {
        int size = interfaceC1830a4.size();
        return interfaceC1830a4.h(size == 0 ? 10 : size + size);
    }

    static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object n(InterfaceC2021y4 interfaceC2021y4, String str, Object[] objArr) {
        return new I4(interfaceC2021y4, str, objArr);
    }

    protected static <T extends T3> void o(Class<T> cls, T t7) {
        zza.put(cls, t7);
    }

    static <T extends T3> T r(Class<T> cls) throws ClassNotFoundException {
        Map<Object, T3<?, ?>> map = zza;
        T3<?, ?> t32 = map.get(cls);
        if (t32 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t32 = map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (t32 == null) {
            t32 = (T3) ((T3) C1895i5.j(cls)).v(6, null, null);
            if (t32 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, t32);
        }
        return t32;
    }

    protected static Y3 s() {
        return U3.g();
    }

    protected static Z3 t() {
        return C1926m4.e();
    }

    protected static Z3 u(Z3 z32) {
        int size = z32.size();
        return z32.h(size == 0 ? 10 : size + size);
    }

    @Override
    public final int a() {
        int i7 = this.zzd;
        if (i7 != -1) {
            return i7;
        }
        int iA = G4.a().b(getClass()).a(this);
        this.zzd = iA;
        return iA;
    }

    @Override
    public final void b(B3 b3) throws IOException {
        G4.a().b(getClass()).i(this, C3.l(b3));
    }

    @Override
    public final InterfaceC2013x4 c() {
        Q3 q32 = (Q3) v(5, null, null);
        q32.q(this);
        return q32;
    }

    @Override
    public final InterfaceC2021y4 e() {
        return (T3) v(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return G4.a().b(getClass()).h(this, (T3) obj);
        }
        return false;
    }

    @Override
    final int f() {
        return this.zzd;
    }

    @Override
    public final InterfaceC2013x4 g() {
        return (Q3) v(5, null, null);
    }

    public final int hashCode() {
        int i7 = this.zzb;
        if (i7 != 0) {
            return i7;
        }
        int iC = G4.a().b(getClass()).c(this);
        this.zzb = iC;
        return iC;
    }

    @Override
    final void i(int i7) {
        this.zzd = i7;
    }

    protected final <MessageType extends T3<MessageType, BuilderType>, BuilderType extends Q3<MessageType, BuilderType>> BuilderType p() {
        return (BuilderType) v(5, null, null);
    }

    public final BuilderType q() {
        BuilderType buildertype = (BuilderType) v(5, null, null);
        buildertype.q(this);
        return buildertype;
    }

    public final String toString() {
        return A4.a(this, super.toString());
    }

    protected abstract Object v(int i7, Object obj, Object obj2);
}
