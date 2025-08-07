package J8;

import com.withpersona.sdk2.inquiry.network.JsonAdapterBinding;
import java.util.Set;

public final class h implements C9.d<Set<JsonAdapterBinding<?>>> {

    private static final class a {
        static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    public static Set<JsonAdapterBinding<?>> c() {
        return (Set) C9.g.d(com.withpersona.sdk2.inquiry.internal.network.b.f());
    }

    public Set<JsonAdapterBinding<?>> get() {
        return c();
    }
}
