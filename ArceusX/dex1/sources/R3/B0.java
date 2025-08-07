package R3;

import java.util.HashMap;
import java.util.Map;

public final class B0 implements V4.b {

    private static final U4.d f4991d = new U4.d() {
        @Override
        public final void a(Object obj, Object obj2) {
            int i7 = B0.f4992e;
            throw new U4.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    public static final int f4992e = 0;

    private final Map f4993a = new HashMap();

    private final Map f4994b = new HashMap();

    private final U4.d f4995c = f4991d;

    @Override
    public final V4.b a(Class cls, U4.d dVar) {
        this.f4993a.put(cls, dVar);
        this.f4994b.remove(cls);
        return this;
    }

    public final C0 b() {
        return new C0(new HashMap(this.f4993a), new HashMap(this.f4994b), this.f4995c);
    }
}
