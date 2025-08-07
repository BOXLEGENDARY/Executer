package M8;

import com.squareup.workflow1.ui.A;
import java.util.Set;

public final class l implements C9.d<Set<A<?>>> {

    private static final class a {
        static final l a = new l();
    }

    public static l a() {
        return a.a;
    }

    public static Set<A<?>> c() {
        return (Set) C9.g.d(k.a());
    }

    public Set<A<?>> get() {
        return c();
    }
}
