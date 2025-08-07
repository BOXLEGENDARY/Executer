package Z1;

import java.io.IOException;
import java.util.List;

public class C0432d {
    private static <T> List<c2.a<T>> a(a2.c cVar, float f, P1.d dVar, M<T> m) throws IOException {
        return u.a(cVar, dVar, f, m, false);
    }

    private static <T> List<c2.a<T>> b(a2.c cVar, P1.d dVar, M<T> m) throws IOException {
        return u.a(cVar, dVar, 1.0f, m, false);
    }

    static V1.a c(a2.c cVar, P1.d dVar) throws IOException {
        return new V1.a(b(cVar, dVar, C0435g.a));
    }

    static V1.j d(a2.c cVar, P1.d dVar) throws IOException {
        return new V1.j(b(cVar, dVar, C0437i.a));
    }

    public static V1.b e(a2.c cVar, P1.d dVar) throws IOException {
        return f(cVar, dVar, true);
    }

    public static V1.b f(a2.c cVar, P1.d dVar, boolean z) throws IOException {
        return new V1.b(a(cVar, z ? b2.h.e() : 1.0f, dVar, C0440l.a));
    }

    static V1.c g(a2.c cVar, P1.d dVar, int i) throws IOException {
        return new V1.c(b(cVar, dVar, new o(i)));
    }

    static V1.d h(a2.c cVar, P1.d dVar) throws IOException {
        return new V1.d(b(cVar, dVar, r.a));
    }

    static V1.f i(a2.c cVar, P1.d dVar) throws IOException {
        return new V1.f(u.a(cVar, dVar, b2.h.e(), B.a, true));
    }

    static V1.g j(a2.c cVar, P1.d dVar) throws IOException {
        return new V1.g(b(cVar, dVar, F.a));
    }

    static V1.h k(a2.c cVar, P1.d dVar) throws IOException {
        return new V1.h(a(cVar, b2.h.e(), dVar, G.a));
    }
}
