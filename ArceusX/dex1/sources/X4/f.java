package X4;

import X4.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class f implements U4.e {

    private static final Charset f7934f = Charset.forName("UTF-8");

    private static final U4.c f7935g = U4.c.a("key").b(X4.a.b().c(1).a()).a();

    private static final U4.c f7936h = U4.c.a("value").b(X4.a.b().c(2).a()).a();

    private static final U4.d<Map.Entry<Object, Object>> f7937i = new U4.d() {
        @Override
        public final void a(Object obj, Object obj2) throws IOException {
            f.s((Map.Entry) obj, (U4.e) obj2);
        }
    };

    private OutputStream f7938a;

    private final Map<Class<?>, U4.d<?>> f7939b;

    private final Map<Class<?>, U4.f<?>> f7940c;

    private final U4.d<Object> f7941d;

    private final i f7942e = new i(this);

    static class a {

        static final int[] f7943a;

        static {
            int[] iArr = new int[d.a.values().length];
            f7943a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7943a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7943a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, U4.d<?>> map, Map<Class<?>, U4.f<?>> map2, U4.d<Object> dVar) {
        this.f7938a = outputStream;
        this.f7939b = map;
        this.f7940c = map2;
        this.f7941d = dVar;
    }

    private static ByteBuffer l(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long m(U4.d<T> dVar, T t7) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f7938a;
            this.f7938a = bVar;
            try {
                dVar.a(t7, this);
                this.f7938a = outputStream;
                long jB = bVar.b();
                bVar.close();
                return jB;
            } catch (Throwable th) {
                this.f7938a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f n(U4.d<T> dVar, U4.c cVar, T t7, boolean z7) throws IOException {
        long jM = m(dVar, t7);
        if (z7 && jM == 0) {
            return this;
        }
        t((r(cVar) << 3) | 2);
        u(jM);
        dVar.a(t7, this);
        return this;
    }

    private <T> f o(U4.f<T> fVar, U4.c cVar, T t7, boolean z7) throws IOException {
        this.f7942e.b(cVar, z7);
        fVar.a(t7, this.f7942e);
        return this;
    }

    private static d q(U4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private static int r(U4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    public static void s(Map.Entry entry, U4.e eVar) throws IOException {
        eVar.b(f7935g, entry.getKey());
        eVar.b(f7936h, entry.getValue());
    }

    private void t(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.f7938a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f7938a.write(i7 & 127);
    }

    private void u(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            this.f7938a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f7938a.write(((int) j7) & 127);
    }

    @Override
    public U4.e b(U4.c cVar, Object obj) throws IOException {
        return f(cVar, obj, true);
    }

    U4.e d(U4.c cVar, double d7, boolean z7) throws IOException {
        if (z7 && d7 == 0.0d) {
            return this;
        }
        t((r(cVar) << 3) | 1);
        this.f7938a.write(l(8).putDouble(d7).array());
        return this;
    }

    U4.e e(U4.c cVar, float f7, boolean z7) throws IOException {
        if (z7 && f7 == 0.0f) {
            return this;
        }
        t((r(cVar) << 3) | 5);
        this.f7938a.write(l(4).putFloat(f7).array());
        return this;
    }

    U4.e f(U4.c cVar, Object obj, boolean z7) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return this;
            }
            t((r(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f7934f);
            t(bytes.length);
            this.f7938a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                n(f7937i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return d(cVar, ((Double) obj).doubleValue(), z7);
        }
        if (obj instanceof Float) {
            return e(cVar, ((Float) obj).floatValue(), z7);
        }
        if (obj instanceof Number) {
            return j(cVar, ((Number) obj).longValue(), z7);
        }
        if (obj instanceof Boolean) {
            return k(cVar, ((Boolean) obj).booleanValue(), z7);
        }
        if (!(obj instanceof byte[])) {
            U4.d<?> dVar = this.f7939b.get(obj.getClass());
            if (dVar != null) {
                return n(dVar, cVar, obj, z7);
            }
            U4.f<?> fVar = this.f7940c.get(obj.getClass());
            return fVar != null ? o(fVar, cVar, obj, z7) : obj instanceof c ? g(cVar, ((c) obj).c()) : obj instanceof Enum ? g(cVar, ((Enum) obj).ordinal()) : n(this.f7941d, cVar, obj, z7);
        }
        byte[] bArr = (byte[]) obj;
        if (z7 && bArr.length == 0) {
            return this;
        }
        t((r(cVar) << 3) | 2);
        t(bArr.length);
        this.f7938a.write(bArr);
        return this;
    }

    public f g(U4.c cVar, int i7) throws IOException {
        return h(cVar, i7, true);
    }

    f h(U4.c cVar, int i7, boolean z7) throws IOException {
        if (z7 && i7 == 0) {
            return this;
        }
        d dVarQ = q(cVar);
        int i8 = a.f7943a[dVarQ.intEncoding().ordinal()];
        if (i8 == 1) {
            t(dVarQ.tag() << 3);
            t(i7);
        } else if (i8 == 2) {
            t(dVarQ.tag() << 3);
            t((i7 << 1) ^ (i7 >> 31));
        } else if (i8 == 3) {
            t((dVarQ.tag() << 3) | 5);
            this.f7938a.write(l(4).putInt(i7).array());
        }
        return this;
    }

    @Override
    public f a(U4.c cVar, long j7) throws IOException {
        return j(cVar, j7, true);
    }

    f j(U4.c cVar, long j7, boolean z7) throws IOException {
        if (z7 && j7 == 0) {
            return this;
        }
        d dVarQ = q(cVar);
        int i7 = a.f7943a[dVarQ.intEncoding().ordinal()];
        if (i7 == 1) {
            t(dVarQ.tag() << 3);
            u(j7);
        } else if (i7 == 2) {
            t(dVarQ.tag() << 3);
            u((j7 >> 63) ^ (j7 << 1));
        } else if (i7 == 3) {
            t((dVarQ.tag() << 3) | 1);
            this.f7938a.write(l(8).putLong(j7).array());
        }
        return this;
    }

    f k(U4.c cVar, boolean z7, boolean z8) throws IOException {
        return h(cVar, z7 ? 1 : 0, z8);
    }

    f p(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        U4.d<?> dVar = this.f7939b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new U4.b("No encoder for " + obj.getClass());
    }
}
