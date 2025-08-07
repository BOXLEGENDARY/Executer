package Q3;

import java.util.HashMap;
import java.util.Map;

public final class C0931n implements V4.b {

    private static final U4.d f4494d = new U4.d() {
        @Override
        public final void a(Object obj, Object obj2) {
            int i7 = C0931n.f4495e;
            throw new U4.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    public static final int f4495e = 0;

    private final Map f4496a = new HashMap();

    private final Map f4497b = new HashMap();

    private final U4.d f4498c = f4494d;

    @Override
    public final V4.b a(Class cls, U4.d dVar) {
        this.f4496a.put(cls, dVar);
        this.f4497b.remove(cls);
        return this;
    }

    public final C0938o b() {
        return new C0938o(new HashMap(this.f4496a), new HashMap(this.f4497b), this.f4498c);
    }
}
