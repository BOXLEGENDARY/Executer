package S3;

import java.util.HashMap;
import java.util.Map;

public final class E0 implements V4.b {

    private static final U4.d f6432d = new U4.d() {
        @Override
        public final void a(Object obj, Object obj2) {
            int i7 = E0.f6433e;
            throw new U4.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    public static final int f6433e = 0;

    private final Map f6434a = new HashMap();

    private final Map f6435b = new HashMap();

    private final U4.d f6436c = f6432d;

    @Override
    public final V4.b a(Class cls, U4.d dVar) {
        this.f6434a.put(cls, dVar);
        this.f6435b.remove(cls);
        return this;
    }

    public final F0 b() {
        return new F0(new HashMap(this.f6434a), new HashMap(this.f6435b), this.f6436c);
    }
}
