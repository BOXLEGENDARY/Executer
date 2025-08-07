package n5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c {

    private final Map f22308a = new HashMap();

    public static class a {

        private final Class f22309a;

        private final c5.b f22310b;

        public <RemoteT extends AbstractC2671b> a(Class<RemoteT> cls, c5.b<Object> bVar) {
            this.f22309a = cls;
            this.f22310b = bVar;
        }

        final c5.b a() {
            return this.f22310b;
        }

        final Class b() {
            return this.f22309a;
        }
    }

    public c(Set<a> set) {
        for (a aVar : set) {
            this.f22308a.put(aVar.b(), aVar.a());
        }
    }
}
