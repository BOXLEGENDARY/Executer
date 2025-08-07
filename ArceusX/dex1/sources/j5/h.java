package j5;

import S4.C1529d;
import S4.q;
import android.content.Context;

public class h {

    public interface a<T> {
        String a(T t7);
    }

    public static C1529d<?> b(String str, String str2) {
        return C1529d.i(f.a(str, str2), f.class);
    }

    public static C1529d<?> c(final String str, final a<Context> aVar) {
        return C1529d.j(f.class).b(q.h(Context.class)).f(new S4.h() {
            @Override
            public final Object a(S4.e eVar) {
                return h.d(str, aVar, eVar);
            }
        }).d();
    }

    public static f d(String str, a aVar, S4.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
