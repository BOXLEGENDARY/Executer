package W4;

import U4.f;
import U4.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class d implements V4.b<d> {

    private static final U4.d<Object> f7662e = new U4.d() {
        @Override
        public final void a(Object obj, Object obj2) throws IOException {
            d.l(obj, (U4.e) obj2);
        }
    };

    private static final f<String> f7663f = new f() {
        @Override
        public final void a(Object obj, Object obj2) throws IOException {
            ((g) obj2).c((String) obj);
        }
    };

    private static final f<Boolean> f7664g = new f() {
        @Override
        public final void a(Object obj, Object obj2) throws IOException {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    private static final b f7665h = new b(null);

    private final Map<Class<?>, U4.d<?>> f7666a = new HashMap();

    private final Map<Class<?>, f<?>> f7667b = new HashMap();

    private U4.d<Object> f7668c = f7662e;

    private boolean f7669d = false;

    class a implements U4.a {
        a() {
        }

        @Override
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f7666a, d.this.f7667b, d.this.f7668c, d.this.f7669d);
            eVar.f(obj, false);
            eVar.m();
        }

        @Override
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements f<Date> {

        private static final DateFormat f7671a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f7671a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override
        public void a(Date date, g gVar) throws IOException {
            gVar.c(f7671a.format(date));
        }

        b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f7663f);
        p(Boolean.class, f7664g);
        p(Date.class, f7665h);
    }

    public static void l(Object obj, U4.e eVar) throws IOException {
        throw new U4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static void n(Boolean bool, g gVar) throws IOException {
        gVar.d(bool.booleanValue());
    }

    public U4.a i() {
        return new a();
    }

    public d j(V4.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z7) {
        this.f7669d = z7;
        return this;
    }

    @Override
    public <T> d a(Class<T> cls, U4.d<? super T> dVar) {
        this.f7666a.put(cls, dVar);
        this.f7667b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f7667b.put(cls, fVar);
        this.f7666a.remove(cls);
        return this;
    }
}
