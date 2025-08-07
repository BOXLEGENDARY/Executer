package Q3;

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

final class C0917l implements U4.e {

    private static final Charset f4455f = Charset.forName("UTF-8");

    private static final U4.c f4456g;

    private static final U4.c f4457h;

    private static final U4.d f4458i;

    private OutputStream f4459a;

    private final Map f4460b;

    private final Map f4461c;

    private final U4.d f4462d;

    private final C0945p f4463e = new C0945p(this);

    static {
        c.b bVarA = U4.c.a("key");
        C0875f c0875f = new C0875f();
        c0875f.a(1);
        f4456g = bVarA.b(c0875f.b()).a();
        c.b bVarA2 = U4.c.a("value");
        C0875f c0875f2 = new C0875f();
        c0875f2.a(2);
        f4457h = bVarA2.b(c0875f2.b()).a();
        f4458i = new U4.d() {
            @Override
            public final void a(Object obj, Object obj2) throws IOException {
                C0917l.i((Map.Entry) obj, (U4.e) obj2);
            }
        };
    }

    C0917l(OutputStream outputStream, Map map, Map map2, U4.d dVar) {
        this.f4459a = outputStream;
        this.f4460b = map;
        this.f4461c = map2;
        this.f4462d = dVar;
    }

    static void i(Map.Entry entry, U4.e eVar) throws IOException {
        eVar.b(f4456g, entry.getKey());
        eVar.b(f4457h, entry.getValue());
    }

    private static int j(U4.c cVar) {
        InterfaceC0903j interfaceC0903j = (InterfaceC0903j) cVar.c(InterfaceC0903j.class);
        if (interfaceC0903j != null) {
            return interfaceC0903j.zza();
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final long k(U4.d dVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C0882g c0882g = new C0882g();
        try {
            OutputStream outputStream = this.f4459a;
            this.f4459a = c0882g;
            try {
                dVar.a(obj, this);
                this.f4459a = outputStream;
                long jB = c0882g.b();
                c0882g.close();
                return jB;
            } catch (Throwable th) {
                this.f4459a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0882g.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC0903j l(U4.c cVar) {
        InterfaceC0903j interfaceC0903j = (InterfaceC0903j) cVar.c(InterfaceC0903j.class);
        if (interfaceC0903j != null) {
            return interfaceC0903j;
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final C0917l m(U4.d dVar, U4.c cVar, Object obj, boolean z7) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long jK = k(dVar, obj);
        if (z7 && jK == 0) {
            return this;
        }
        p((j(cVar) << 3) | 2);
        q(jK);
        dVar.a(obj, this);
        return this;
    }

    private final C0917l n(U4.f fVar, U4.c cVar, Object obj, boolean z7) throws IOException {
        this.f4463e.a(cVar, z7);
        fVar.a(obj, this.f4463e);
        return this;
    }

    private static ByteBuffer o(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void p(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.f4459a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f4459a.write(i7 & 127);
    }

    private final void q(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            this.f4459a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f4459a.write(((int) j7) & 127);
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
        this.f4459a.write(o(8).putDouble(d7).array());
        return this;
    }

    final U4.e d(U4.c cVar, float f7, boolean z7) throws IOException {
        if (z7 && f7 == 0.0f) {
            return this;
        }
        p((j(cVar) << 3) | 5);
        this.f4459a.write(o(4).putFloat(f7).array());
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
            byte[] bytes = charSequence.toString().getBytes(f4455f);
            p(bytes.length);
            this.f4459a.write(bytes);
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
                m(f4458i, cVar, (Map.Entry) it2.next(), false);
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
            this.f4459a.write(bArr);
            return this;
        }
        U4.d dVar = (U4.d) this.f4460b.get(obj.getClass());
        if (dVar != null) {
            m(dVar, cVar, obj, z7);
            return this;
        }
        U4.f fVar = (U4.f) this.f4461c.get(obj.getClass());
        if (fVar != null) {
            n(fVar, cVar, obj, z7);
            return this;
        }
        if (obj instanceof InterfaceC0889h) {
            f(cVar, ((InterfaceC0889h) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            f(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        m(this.f4462d, cVar, obj, z7);
        return this;
    }

    final C0917l f(U4.c cVar, int i7, boolean z7) throws IOException {
        if (z7 && i7 == 0) {
            return this;
        }
        InterfaceC0903j interfaceC0903jL = l(cVar);
        EnumC0896i enumC0896i = EnumC0896i.DEFAULT;
        int iOrdinal = interfaceC0903jL.zzb().ordinal();
        if (iOrdinal == 0) {
            p(interfaceC0903jL.zza() << 3);
            p(i7);
        } else if (iOrdinal == 1) {
            p(interfaceC0903jL.zza() << 3);
            p((i7 + i7) ^ (i7 >> 31));
        } else if (iOrdinal == 2) {
            p((interfaceC0903jL.zza() << 3) | 5);
            this.f4459a.write(o(4).putInt(i7).array());
        }
        return this;
    }

    final C0917l g(U4.c cVar, long j7, boolean z7) throws IOException {
        if (z7 && j7 == 0) {
            return this;
        }
        InterfaceC0903j interfaceC0903jL = l(cVar);
        EnumC0896i enumC0896i = EnumC0896i.DEFAULT;
        int iOrdinal = interfaceC0903jL.zzb().ordinal();
        if (iOrdinal == 0) {
            p(interfaceC0903jL.zza() << 3);
            q(j7);
        } else if (iOrdinal == 1) {
            p(interfaceC0903jL.zza() << 3);
            q((j7 >> 63) ^ (j7 + j7));
        } else if (iOrdinal == 2) {
            p((interfaceC0903jL.zza() << 3) | 1);
            this.f4459a.write(o(8).putLong(j7).array());
        }
        return this;
    }

    final C0917l h(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        U4.d dVar = (U4.d) this.f4460b.get(obj.getClass());
        if (dVar == null) {
            throw new U4.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
