package C;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import z.C3039b0;
import z.C3043d0;

public final class N {

    private final Object f411a = new Object();

    private final Map<String, J> f412b = new LinkedHashMap();

    private final Set<J> f413c = new HashSet();

    public LinkedHashSet<J> a() {
        LinkedHashSet<J> linkedHashSet;
        synchronized (this.f411a) {
            linkedHashSet = new LinkedHashSet<>(this.f412b.values());
        }
        return linkedHashSet;
    }

    public void b(H h7) throws C3039b0 {
        synchronized (this.f411a) {
            try {
                for (String str : h7.a()) {
                    C3043d0.a("CameraRepository", "Added camera: " + str);
                    this.f412b.put(str, h7.b(str));
                }
            } catch (z.r e7) {
                throw new C3039b0(e7);
            }
        }
    }
}
