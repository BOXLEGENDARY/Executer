package I8;

import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.FallbackMode;
import ha.EnumC0342d;

public final class j implements C9.d<i> {
    private final C9.h<FallbackMode> a;
    private final C9.h<a> b;
    private final C9.h<EnumC0342d> c;
    private final C9.h<w> d;

    public j(C9.h<FallbackMode> hVar, C9.h<a> hVar2, C9.h<EnumC0342d> hVar3, C9.h<w> hVar4) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar3;
        this.d = hVar4;
    }

    public static j a(C9.h<FallbackMode> hVar, C9.h<a> hVar2, C9.h<EnumC0342d> hVar3, C9.h<w> hVar4) {
        return new j(hVar, hVar2, hVar3, hVar4);
    }

    public static i c(FallbackMode fallbackMode, a aVar, EnumC0342d enumC0342d, w wVar) {
        return new i(fallbackMode, aVar, enumC0342d, wVar);
    }

    public i get() {
        return c((FallbackMode) this.a.get(), (a) this.b.get(), (EnumC0342d) this.c.get(), (w) this.d.get());
    }
}
