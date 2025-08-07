package S3;

import U4.c;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import java.io.IOException;

final class X4 implements U4.d {

    static final X4 f6866a = new X4();

    private static final U4.c f6867b;

    private static final U4.c f6868c;

    private static final U4.c f6869d;

    static {
        c.b bVarA = U4.c.a("languageOption");
        C1486w0 c1486w0 = new C1486w0();
        c1486w0.a(3);
        f6867b = bVarA.b(c1486w0.b()).a();
        c.b bVarA2 = U4.c.a("isUsingLegacyApi");
        C1486w0 c1486w02 = new C1486w0();
        c1486w02.a(4);
        f6868c = bVarA2.b(c1486w02.b()).a();
        c.b bVarA3 = U4.c.a(jUbDmI.TvZ);
        C1486w0 c1486w03 = new C1486w0();
        c1486w03.a(5);
        f6869d = bVarA3.b(c1486w03.b()).a();
    }

    private X4() {
    }

    @Override
    public final void a(Object obj, Object obj2) throws IOException {
        U4.e eVar = (U4.e) obj2;
        eVar.b(f6867b, ((C1429q8) obj).a());
        eVar.b(f6868c, null);
        eVar.b(f6869d, null);
    }
}
