package O3;

import U4.c;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class Q0 implements U4.e {

    private static final Charset f3245f = Charset.forName("UTF-8");

    private static final U4.c f3246g;

    private static final U4.c f3247h;

    private static final U4.d f3248i;

    private OutputStream f3249a;

    private final Map f3250b;

    private final Map f3251c;

    private final U4.d f3252d;

    private final U0 f3253e = new U0(this);

    static {
        c.b bVarA = U4.c.a("key");
        K0 k02 = new K0();
        k02.a(1);
        f3246g = bVarA.b(k02.b()).a();
        c.b bVarA2 = U4.c.a("value");
        K0 k03 = new K0();
        k03.a(2);
        f3247h = bVarA2.b(k03.b()).a();
        f3248i = new U4.d() {
            @Override
            public final void a(Object obj, Object obj2) throws IOException {
                Q0.i((Map.Entry) obj, (U4.e) obj2);
            }
        };
    }

    Q0(OutputStream outputStream, Map map, Map map2, U4.d dVar) {
        this.f3249a = outputStream;
        this.f3250b = map;
        this.f3251c = map2;
        this.f3252d = dVar;
    }

    static void i(Map.Entry entry, U4.e eVar) throws IOException {
        eVar.b(f3246g, entry.getKey());
        eVar.b(f3247h, entry.getValue());
    }

    private static int j(U4.c cVar) {
        O0 o02 = (O0) cVar.c(O0.class);
        if (o02 != null) {
            return o02.zza();
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final long k(U4.d dVar, Object obj) throws IOException {
        L0 l02 = new L0();
        try {
            OutputStream outputStream = this.f3249a;
            this.f3249a = l02;
            try {
                dVar.a(obj, this);
                this.f3249a = outputStream;
                long jB = l02.b();
                l02.close();
                return jB;
            } catch (Throwable th) {
                this.f3249a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                l02.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static O0 l(U4.c cVar) {
        O0 o02 = (O0) cVar.c(O0.class);
        if (o02 != null) {
            return o02;
        }
        throw new U4.b("Field has no @Protobuf config");
    }

    private final Q0 m(U4.d dVar, U4.c cVar, Object obj, boolean z7) throws IOException {
        long jK = k(dVar, obj);
        if (z7 && jK == 0) {
            return this;
        }
        p((j(cVar) << 3) | 2);
        q(jK);
        dVar.a(obj, this);
        return this;
    }

    private final Q0 n(U4.f fVar, U4.c cVar, Object obj, boolean z7) throws IOException {
        this.f3253e.a(cVar, z7);
        fVar.a(obj, this.f3253e);
        return this;
    }

    private static ByteBuffer o(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void p(int i7) throws IOException {
        while (true) {
            int i8 = i7 & 127;
            if ((i7 & (-128)) == 0) {
                this.f3249a.write(i8);
                return;
            } else {
                this.f3249a.write(i8 | 128);
                i7 >>>= 7;
            }
        }
    }

    private final void q(long j7) throws IOException {
        while (true) {
            int i7 = ((int) j7) & 127;
            if (((-128) & j7) == 0) {
                this.f3249a.write(i7);
                return;
            } else {
                this.f3249a.write(i7 | 128);
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
        this.f3249a.write(o(8).putDouble(d7).array());
        return this;
    }

    final U4.e d(U4.c cVar, float f7, boolean z7) throws IOException {
        if (z7 && f7 == 0.0f) {
            return this;
        }
        p((j(cVar) << 3) | 5);
        this.f3249a.write(o(4).putFloat(f7).array());
        return this;
    }

    final U4.e e(U4.c cVar, Object obj, boolean z7) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z7 || charSequence.length() != 0) {
                    p((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f3245f);
                    p(bytes.length);
                    this.f3249a.write(bytes);
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
                    m(f3248i, cVar, (Map.Entry) it2.next(), false);
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
                    U4.d dVar = (U4.d) this.f3250b.get(obj.getClass());
                    if (dVar != null) {
                        m(dVar, cVar, obj, z7);
                        return this;
                    }
                    U4.f fVar = (U4.f) this.f3251c.get(obj.getClass());
                    if (fVar != null) {
                        n(fVar, cVar, obj, z7);
                        return this;
                    }
                    if (obj instanceof M0) {
                        f(cVar, ((M0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        f(cVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m(this.f3252d, cVar, obj, z7);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z7 || bArr.length != 0) {
                    p((j(cVar) << 3) | 2);
                    p(bArr.length);
                    this.f3249a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final Q0 f(U4.c cVar, int i7, boolean z7) throws IOException {
        if (!z7 || i7 != 0) {
            O0 o0L = l(cVar);
            int iOrdinal = o0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(o0L.zza() << 3);
                p(i7);
            } else if (iOrdinal == 1) {
                p(o0L.zza() << 3);
                p((i7 + i7) ^ (i7 >> 31));
            } else if (iOrdinal == 2) {
                p((o0L.zza() << 3) | 5);
                this.f3249a.write(o(4).putInt(i7).array());
            }
        }
        return this;
    }

    final Q0 g(U4.c cVar, long j7, boolean z7) throws IOException {
        if (!z7 || j7 != 0) {
            O0 o0L = l(cVar);
            int iOrdinal = o0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(o0L.zza() << 3);
                q(j7);
            } else if (iOrdinal == 1) {
                p(o0L.zza() << 3);
                q((j7 >> 63) ^ (j7 + j7));
            } else if (iOrdinal == 2) {
                p((o0L.zza() << 3) | 1);
                this.f3249a.write(o(8).putLong(j7).array());
            }
        }
        return this;
    }

    final Q0 h(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        U4.d dVar = (U4.d) this.f3250b.get(obj.getClass());
        if (dVar == null) {
            throw new U4.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
