package T8;

import com.squareup.workflow1.ui.A;
import java.util.Set;

public final class h implements C9.d<Set<A<?>>> {

    private static final class a {
        static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    public static Set<A<?>> c() {
        return (Set) C9.g.d(f.d());
    }

    public Set<A<?>> get() {
        return c();
    }
}
