package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.N2;
import com.google.android.gms.internal.play_billing.R2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class R2<MessageType extends R2<MessageType, BuilderType>, BuilderType extends N2<MessageType, BuilderType>> extends AbstractC2035a2<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected T3 zzc = T3.c();

    protected static final boolean B(R2 r22, boolean z7) {
        byte bByteValue = ((Byte) r22.m(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = C3.a().b(r22.getClass()).g(r22);
        if (z7) {
            r22.m(2, true != zG ? null : r22, null);
        }
        return zG;
    }

    private static R2 k(R2 r22, byte[] bArr, int i7, int i8, C2 c2) throws Y2 {
        if (i8 == 0) {
            return r22;
        }
        R2 r2R = r22.r();
        try {
            F3 f3B = C3.a().b(r2R.getClass());
            f3B.f(r2R, bArr, 0, i8, new C2059e2(c2));
            f3B.d(r2R);
            return r2R;
        } catch (R3 e7) {
            throw e7.a();
        } catch (Y2 e8) {
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof Y2) {
                throw ((Y2) e9.getCause());
            }
            throw new Y2(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new Y2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final int l(F3 f32) {
        return C3.a().b(getClass()).a(this);
    }

    static R2 q(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        R2 r22 = (R2) map.get(cls);
        if (r22 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                r22 = (R2) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (r22 == null) {
            r22 = (R2) ((R2) Z3.j(cls)).m(6, null, null);
            if (r22 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, r22);
        }
        return r22;
    }

    protected static R2 s(R2 r22, byte[] bArr, C2 c2) throws Y2 {
        R2 r2K = k(r22, bArr, 0, bArr.length, c2);
        if (r2K == null || B(r2K, true)) {
            return r2K;
        }
        throw new R3(r2K).a();
    }

    protected static U2 t() {
        return S2.g();
    }

    protected static V2 u() {
        return D3.e();
    }

    static Object v(Method method, Object obj, Object... objArr) {
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

    protected static Object w(InterfaceC2155u3 interfaceC2155u3, String str, Object[] objArr) {
        return new E3(interfaceC2155u3, str, objArr);
    }

    protected static void z(Class cls, R2 r22) {
        r22.y();
        zzb.put(cls, r22);
    }

    final void A(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override
    public final InterfaceC2149t3 F() {
        return (N2) m(5, null, null);
    }

    @Override
    public final void a(AbstractC2172x2 abstractC2172x2) throws IOException {
        C3.a().b(getClass()).h(this, C2178y2.L(abstractC2172x2));
    }

    @Override
    final int b(F3 f32) {
        if (i()) {
            int iA = f32.a(this);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
        }
        int i7 = this.zzd & Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iA2 = f32.a(this);
        if (iA2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iA2);
    }

    @Override
    public final InterfaceC2155u3 e() {
        return (R2) m(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C3.a().b(getClass()).i(this, (R2) obj);
    }

    @Override
    public final int h() {
        int iL;
        if (i()) {
            iL = l(null);
            if (iL < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iL);
            }
        } else {
            iL = this.zzd & Integer.MAX_VALUE;
            if (iL == Integer.MAX_VALUE) {
                iL = l(null);
                if (iL < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iL);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iL;
            }
        }
        return iL;
    }

    public final int hashCode() {
        if (i()) {
            return n();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int iN = n();
        this.zza = iN;
        return iN;
    }

    final boolean i() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override
    public final boolean j() {
        return B(this, true);
    }

    protected abstract Object m(int i7, Object obj, Object obj2);

    final int n() {
        return C3.a().b(getClass()).c(this);
    }

    protected final N2 o() {
        return (N2) m(5, null, null);
    }

    public final N2 p() {
        N2 n22 = (N2) m(5, null, null);
        n22.k(this);
        return n22;
    }

    final R2 r() {
        return (R2) m(4, null, null);
    }

    public final String toString() {
        return C2167w3.a(this, super.toString());
    }

    protected final void x() {
        C3.a().b(getClass()).d(this);
        y();
    }

    final void y() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
