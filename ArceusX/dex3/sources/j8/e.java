package J8;

import bb.u;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;

public final class e implements C9.d<FallbackModeService> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;
    private final C9.h<u> b;

    public e(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    public static e a(com.withpersona.sdk2.inquiry.internal.network.b bVar, C9.h<u> hVar) {
        return new e(bVar, hVar);
    }

    public static FallbackModeService b(com.withpersona.sdk2.inquiry.internal.network.b bVar, u uVar) {
        return (FallbackModeService) C9.g.d(bVar.b(uVar));
    }

    public FallbackModeService get() {
        return b(this.a, (u) this.b.get());
    }
}
