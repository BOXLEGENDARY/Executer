package X4;

import X4.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class h {

    private final Map<Class<?>, U4.d<?>> f7944a;

    private final Map<Class<?>, U4.f<?>> f7945b;

    private final U4.d<Object> f7946c;

    public static final class a implements V4.b<a> {

        private static final U4.d<Object> f7947d = new U4.d() {
            @Override
            public final void a(Object obj, Object obj2) throws IOException {
                h.a.e(obj, (U4.e) obj2);
            }
        };

        private final Map<Class<?>, U4.d<?>> f7948a = new HashMap();

        private final Map<Class<?>, U4.f<?>> f7949b = new HashMap();

        private U4.d<Object> f7950c = f7947d;

        public static void e(Object obj, U4.e eVar) throws IOException {
            throw new U4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f7948a), new HashMap(this.f7949b), this.f7950c);
        }

        public a d(V4.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override
        public <U> a a(Class<U> cls, U4.d<? super U> dVar) {
            this.f7948a.put(cls, dVar);
            this.f7949b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, U4.d<?>> map, Map<Class<?>, U4.f<?>> map2, U4.d<Object> dVar) {
        this.f7944a = map;
        this.f7945b = map2;
        this.f7946c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f7944a, this.f7945b, this.f7946c).p(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
