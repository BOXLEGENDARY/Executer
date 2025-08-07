package S3;

import U4.c;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class C0 implements U4.e {

    private static final Charset f6413f = Charset.forName("UTF-8");

    private static final U4.c f6414g;

    private static final U4.c f6415h;

    private static final U4.d f6416i;

    private OutputStream f6417a;

    private final Map f6418b;

    private final Map f6419c;

    private final U4.d f6420d;

    private final G0 f6421e = new G0(this);

    static {
        c.b bVarA = U4.c.a("key");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(1);
        f6414g = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("value");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(2);
        f6415h = bVarA2.b(c1486w02.b()).a();
        f6416i = new U4.d() {
            @Override
            public final void a(Object obj, Object obj2) throws IOException {
                C0.i((Map.Entry) obj, (U4.e) obj2);
            }
        };
    }

    C0(OutputStream outputStream, Map map, Map map2, U4.d dVar) {
        this.f6417a = outputStream;
        this.f6418b = map;
        this.f6419c = map2;
        this.f6420d = dVar;
    }

    static void i(Map.Entry entry, U4.e eVar) throws IOException {
        eVar.b(f6414g, entry.getKey());
        eVar.b(f6415h, entry.getValue());
    }

    private static int j(U4.c cVar) {
        A0 a02 = (A0) cVar.c(A0.class);
        if (a02 != null) {
            return a02.zza();
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final long k(U4.d dVar, Object obj) throws IOException {
        C1497x0 c1497x0 = new C1497x0();
        try {
            OutputStream outputStream = this.f6417a;
            this.f6417a = c1497x0;
            try {
                dVar.a(obj, this);
                this.f6417a = outputStream;
                long jB = c1497x0.b();
                c1497x0.close();
                return jB;
            } catch (Throwable th) {
                this.f6417a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1497x0.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static A0 l(U4.c cVar) {
        A0 a02 = (A0) cVar.c(A0.class);
        if (a02 != null) {
            return a02;
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final C0 m(U4.d dVar, U4.c cVar, Object obj, boolean z7) throws IOException {
        long jK = k(dVar, obj);
        if (z7 && jK == 0) {
            return this;
        }
        p((j(cVar) << 3) | 2);
        q(jK);
        dVar.a(obj, this);
        return this;
    }

    private final C0 n(U4.f fVar, U4.c cVar, Object obj, boolean z7) throws IOException {
        this.f6421e.a(cVar, z7);
        fVar.a(obj, this.f6421e);
        return this;
    }

    private static ByteBuffer o(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void p(int i7) throws IOException {
        while (true) {
            int i8 = i7 & 127;
            if ((i7 & (-128)) == 0) {
                this.f6417a.write(i8);
                return;
            } else {
                this.f6417a.write(i8 | 128);
                i7 >>>= 7;
            }
        }
    }

    private final void q(long j7) throws IOException {
        while (true) {
            int i7 = ((int) j7) & 127;
            if (((-128) & j7) == 0) {
                this.f6417a.write(i7);
                return;
            } else {
                this.f6417a.write(i7 | 128);
                j7 >>>= 7;
            }
        }
    }

    @Override
    public final U4.e a(U4.c cVar, long j7) throws IOException {
        g(cVar, j7, true);
        return this;
    }

    @Override
    public final U4.e b(U4.c cVar, Object obj) throws IOException {
        e(cVar, obj, true);
        return this;
    }

    final U4.e c(U4.c cVar, double d7, boolean z7) throws IOException {
        if (z7 && d7 == 0.0d) {
            return this;
        }
        p((j(cVar) << 3) | 1);
        this.f6417a.write(o(8).putDouble(d7).array());
        return this;
    }

    final U4.e d(U4.c cVar, float f7, boolean z7) throws IOException {
        if (z7 && f7 == 0.0f) {
            return this;
        }
        p((j(cVar) << 3) | 5);
        this.f6417a.write(o(4).putFloat(f7).array());
        return this;
    }

    final U4.e e(U4.c cVar, Object obj, boolean z7) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z7 || charSequence.length() != 0) {
                    p((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f6413f);
                    p(bytes.length);
                    this.f6417a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m(f6416i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
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
                if (!(obj instanceof byte[])) {
                    U4.d dVar = (U4.d) this.f6418b.get(obj.getClass());
                    if (dVar != null) {
                        m(dVar, cVar, obj, z7);
                        return this;
                    }
                    U4.f fVar = (U4.f) this.f6419c.get(obj.getClass());
                    if (fVar != null) {
                        n(fVar, cVar, obj, z7);
                        return this;
                    }
                    if (obj instanceof InterfaceC1507y0) {
                        f(cVar, ((InterfaceC1507y0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        f(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m(this.f6420d, cVar, obj, z7);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z7 || bArr.length != 0) {
                    p((j(cVar) << 3) | 2);
                    p(bArr.length);
                    this.f6417a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final C0 f(U4.c cVar, int i7, boolean z7) throws IOException {
        if (!z7 || i7 != 0) {
            A0 a0L = l(cVar);
            int iOrdinal = a0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(a0L.zza() << 3);
                p(i7);
            } else if (iOrdinal == 1) {
                p(a0L.zza() << 3);
                p((i7 + i7) ^ (i7 >> 31));
            } else if (iOrdinal == 2) {
                p((a0L.zza() << 3) | 5);
                this.f6417a.write(o(4).putInt(i7).array());
            }
        }
        return this;
    }

    final C0 g(U4.c cVar, long j7, boolean z7) throws IOException {
        if (!z7 || j7 != 0) {
            A0 a0L = l(cVar);
            int iOrdinal = a0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(a0L.zza() << 3);
                q(j7);
            } else if (iOrdinal == 1) {
                p(a0L.zza() << 3);
                q((j7 >> 63) ^ (j7 + j7));
            } else if (iOrdinal == 2) {
                p((a0L.zza() << 3) | 1);
                this.f6417a.write(o(8).putLong(j7).array());
            }
        }
        return this;
    }

    final C0 h(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        U4.d dVar = (U4.d) this.f6418b.get(obj.getClass());
        if (dVar == null) {
            throw new U4.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
