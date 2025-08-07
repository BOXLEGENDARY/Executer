package W4;

import U4.f;
import U4.g;
import Za.qhkq.dHkZSUxHu;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

final class e implements U4.e, g {

    private e f7672a = null;

    private boolean f7673b = true;

    private final JsonWriter f7674c;

    private final Map<Class<?>, U4.d<?>> f7675d;

    private final Map<Class<?>, f<?>> f7676e;

    private final U4.d<Object> f7677f;

    private final boolean f7678g;

    e(Writer writer, Map<Class<?>, U4.d<?>> map, Map<Class<?>, f<?>> map2, U4.d<Object> dVar, boolean z7) {
        this.f7674c = new JsonWriter(writer);
        this.f7675d = map;
        this.f7676e = map2;
        this.f7677f = dVar;
        this.f7678g = z7;
    }

    private boolean l(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e o(String str, Object obj) throws U4.b, IOException {
        q();
        this.f7674c.name(str);
        if (obj != null) {
            return f(obj, false);
        }
        this.f7674c.nullValue();
        return this;
    }

    private e p(String str, Object obj) throws U4.b, IOException {
        if (obj == null) {
            return this;
        }
        q();
        this.f7674c.name(str);
        return f(obj, false);
    }

    private void q() throws IOException {
        if (!this.f7673b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f7672a;
        if (eVar != null) {
            eVar.q();
            this.f7672a.f7673b = false;
            this.f7672a = null;
            this.f7674c.endObject();
        }
    }

    @Override
    public U4.e a(U4.c cVar, long j7) throws IOException {
        return h(cVar.b(), j7);
    }

    @Override
    public U4.e b(U4.c cVar, Object obj) throws IOException {
        return i(cVar.b(), obj);
    }

    public e e(long j7) throws IOException {
        q();
        this.f7674c.value(j7);
        return this;
    }

    e f(Object obj, boolean z7) throws IOException {
        if (z7 && l(obj)) {
            throw new U4.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f7674c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f7674c.value((Number) obj);
            return this;
        }
        int i7 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f7674c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), false);
                }
                this.f7674c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f7674c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e7) {
                        throw new U4.b(String.format(dHkZSUxHu.DhC, key, key.getClass()), e7);
                    }
                }
                this.f7674c.endObject();
                return this;
            }
            U4.d<?> dVar = this.f7675d.get(obj.getClass());
            if (dVar != null) {
                return n(dVar, obj, z7);
            }
            f<?> fVar = this.f7676e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return n(this.f7677f, obj, z7);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        this.f7674c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i7 < length) {
                this.f7674c.value(r6[i7]);
                i7++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i7 < length2) {
                e(jArr[i7]);
                i7++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i7 < length3) {
                this.f7674c.value(dArr[i7]);
                i7++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i7 < length4) {
                this.f7674c.value(zArr[i7]);
                i7++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                f(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                f(obj2, false);
            }
        }
        this.f7674c.endArray();
        return this;
    }

    @Override
    public e c(String str) throws IOException {
        q();
        this.f7674c.value(str);
        return this;
    }

    public e h(String str, long j7) throws IOException {
        q();
        this.f7674c.name(str);
        return e(j7);
    }

    public e i(String str, Object obj) throws IOException {
        return this.f7678g ? p(str, obj) : o(str, obj);
    }

    @Override
    public e d(boolean z7) throws IOException {
        q();
        this.f7674c.value(z7);
        return this;
    }

    public e k(byte[] bArr) throws IOException {
        q();
        if (bArr == null) {
            this.f7674c.nullValue();
        } else {
            this.f7674c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void m() throws IOException {
        q();
        this.f7674c.flush();
    }

    e n(U4.d<Object> dVar, Object obj, boolean z7) throws IOException {
        if (!z7) {
            this.f7674c.beginObject();
        }
        dVar.a(obj, this);
        if (!z7) {
            this.f7674c.endObject();
        }
        return this;
    }
}
