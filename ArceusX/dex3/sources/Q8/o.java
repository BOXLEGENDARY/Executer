package Q8;

import com.squareup.workflow1.ui.A;
import java.util.Set;

public final class o implements C9.d<Set<A<?>>> {

    private static final class a {
        static final o a = new o();
    }

    public static o a() {
        return a.a;
    }

    public static Set<A<?>> c() {
        return (Set) C9.g.d(n.a());
    }

    public Set<A<?>> get() {
        return c();
    }
}
