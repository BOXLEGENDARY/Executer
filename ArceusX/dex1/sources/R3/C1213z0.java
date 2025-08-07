package R3;

import U4.c;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C1213z0 implements U4.e {

    private static final Charset f6036f = Charset.forName("UTF-8");

    private static final U4.c f6037g;

    private static final U4.c f6038h;

    private static final U4.d f6039i;

    private OutputStream f6040a;

    private final Map f6041b;

    private final Map f6042c;

    private final U4.d f6043d;

    private final D0 f6044e = new D0(this);

    static {
        c.b bVarA = U4.c.a("key");
        C1171t0 c1171t0 = new C1171t0();
        c1171t0.a(1);
        f6037g = bVarA.b(c1171t0.b()).a();
        c.b bVarA2 = U4.c.a("value");
        C1171t0 c1171t02 = new C1171t0();
        c1171t02.a(2);
        f6038h = bVarA2.b(c1171t02.b()).a();
        f6039i = new U4.d() {
            @Override
            public final void a(Object obj, Object obj2) throws IOException {
                C1213z0.i((Map.Entry) obj, (U4.e) obj2);
            }
        };
    }

    C1213z0(OutputStream outputStream, Map map, Map map2, U4.d dVar) {
        this.f6040a = outputStream;
        this.f6041b = map;
        this.f6042c = map2;
        this.f6043d = dVar;
    }

    static void i(Map.Entry entry, U4.e eVar) throws IOException {
        eVar.b(f6037g, entry.getKey());
        eVar.b(f6038h, entry.getValue());
    }

    private static int j(U4.c cVar) {
        InterfaceC1199x0 interfaceC1199x0 = (InterfaceC1199x0) cVar.c(InterfaceC1199x0.class);
        if (interfaceC1199x0 != null) {
            return interfaceC1199x0.zza();
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final long k(U4.d dVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C1178u0 c1178u0 = new C1178u0();
        try {
            OutputStream outputStream = this.f6040a;
            this.f6040a = c1178u0;
            try {
                dVar.a(obj, this);
                this.f6040a = outputStream;
                long jB = c1178u0.b();
                c1178u0.close();
                return jB;
            } catch (Throwable th) {
                this.f6040a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1178u0.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC1199x0 l(U4.c cVar) {
        InterfaceC1199x0 interfaceC1199x0 = (InterfaceC1199x0) cVar.c(InterfaceC1199x0.class);
        if (interfaceC1199x0 != null) {
            return interfaceC1199x0;
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final C1213z0 m(U4.d dVar, U4.c cVar, Object obj, boolean z7) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jK = k(dVar, obj);
        if (z7 && jK == 0) {
            return this;
        }
        p((j(cVar) << 3) | 2);
        q(jK);
        dVar.a(obj, this);
        return this;
    }

    private final C1213z0 n(U4.f fVar, U4.c cVar, Object obj, boolean z7) throws IOException {
        this.f6044e.a(cVar, z7);
        fVar.a(obj, this.f6044e);
        return this;
    }

    private static ByteBuffer o(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void p(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.f6040a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f6040a.write(i7 & 127);
    }

    private final void q(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            this.f6040a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f6040a.write(((int) j7) & 127);
    }

    @Override
    public final U4.e a(U4.c cVar, long j7) throws IOException {
        g(cVar, j7, true);
        return this;
    }

    @Override
    public final U4.e b(U4.c cVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        e(cVar, obj, true);
        return this;
    }

    final U4.e c(U4.c cVar, double d7, boolean z7) throws IOException {
        if (z7 && d7 == 0.0d) {
            return this;
        }
        p((j(cVar) << 3) | 1);
        this.f6040a.write(o(8).putDouble(d7).array());
        return this;
    }

    final U4.e d(U4.c cVar, float f7, boolean z7) throws IOException {
        if (z7 && f7 == 0.0f) {
            return this;
        }
        p((j(cVar) << 3) | 5);
        this.f6040a.write(o(4).putFloat(f7).array());
        return this;
    }

    final U4.e e(U4.c cVar, Object obj, boolean z7) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return this;
            }
            p((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6036f);
            p(bytes.length);
            this.f6040a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m(f6039i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            c(cVar, ((Double) obj).doubleValue(), z7);
            return this;
        }
        if (obj instanceof Float) {
            d(cVar, ((Float) obj).floatValue(), z7);
            return this;
        }
        if (obj instanceof Number) {
            g(cVar, ((Number) obj).longValue(), z7);
            return this;
        }
        if (obj instanceof Boolean) {
            f(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z7);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z7 && bArr.length == 0) {
                return this;
            }
            p((j(cVar) << 3) | 2);
            p(bArr.length);
            this.f6040a.write(bArr);
            return this;
        }
        U4.d dVar = (U4.d) this.f6041b.get(obj.getClass());
        if (dVar != null) {
            m(dVar, cVar, obj, z7);
            return this;
        }
        U4.f fVar = (U4.f) this.f6042c.get(obj.getClass());
        if (fVar != null) {
            n(fVar, cVar, obj, z7);
            return this;
        }
        if (obj instanceof InterfaceC1185v0) {
            f(cVar, ((InterfaceC1185v0) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            f(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        m(this.f6043d, cVar, obj, z7);
        return this;
    }

    final C1213z0 f(U4.c cVar, int i7, boolean z7) throws IOException {
        if (z7 && i7 == 0) {
            return this;
        }
        InterfaceC1199x0 interfaceC1199x0L = l(cVar);
        EnumC1192w0 enumC1192w0 = EnumC1192w0.DEFAULT;
        int iOrdinal = interfaceC1199x0L.zzb().ordinal();
        if (iOrdinal == 0) {
            p(interfaceC1199x0L.zza() << 3);
            p(i7);
        } else if (iOrdinal == 1) {
            p(interfaceC1199x0L.zza() << 3);
            p((i7 + i7) ^ (i7 >> 31));
        } else if (iOrdinal == 2) {
            p((interfaceC1199x0L.zza() << 3) | 5);
            this.f6040a.write(o(4).putInt(i7).array());
        }
        return this;
    }

    final C1213z0 g(U4.c cVar, long j7, boolean z7) throws IOException {
        if (z7 && j7 == 0) {
            return this;
        }
        InterfaceC1199x0 interfaceC1199x0L = l(cVar);
        EnumC1192w0 enumC1192w0 = EnumC1192w0.DEFAULT;
        int iOrdinal = interfaceC1199x0L.zzb().ordinal();
        if (iOrdinal == 0) {
            p(interfaceC1199x0L.zza() << 3);
            q(j7);
        } else if (iOrdinal == 1) {
            p(interfaceC1199x0L.zza() << 3);
            q((j7 >> 63) ^ (j7 + j7));
        } else if (iOrdinal == 2) {
            p((interfaceC1199x0L.zza() << 3) | 1);
            this.f6040a.write(o(8).putLong(j7).array());
        }
        return this;
    }

    final C1213z0 h(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        U4.d dVar = (U4.d) this.f6041b.get(obj.getClass());
        if (dVar == null) {
            throw new U4.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
