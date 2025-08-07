package O3;

import java.util.HashMap;
import java.util.Map;

public final class S0 implements V4.b {

    private static final U4.d f3275d = new U4.d() {
        @Override
        public final void a(Object obj, Object obj2) {
            int i7 = S0.f3276e;
            throw new U4.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    public static final int f3276e = 0;

    private final Map f3277a = new HashMap();

    private final Map f3278b = new HashMap();

    private final U4.d f3279c = f3275d;

    @Override
    public final V4.b a(Class cls, U4.d dVar) {
        this.f3277a.put(cls, dVar);
        this.f3278b.remove(cls);
        return this;
    }

    public final T0 b() {
        return new T0(new HashMap(this.f3277a), new HashMap(this.f3278b), this.f3279c);
    }
}
