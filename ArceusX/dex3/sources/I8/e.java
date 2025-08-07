package I8;

import com.withpersona.sdk2.inquiry.FallbackMode;

public final class e implements C9.d<FallbackMode> {
    private final c a;

    public e(c cVar) {
        this.a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static FallbackMode b(c cVar) {
        return (FallbackMode) C9.g.d(cVar.getFallbackMode());
    }

    public FallbackMode get() {
        return b(this.a);
    }
}
