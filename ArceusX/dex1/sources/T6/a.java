package T6;

import Q6.m;
import Q6.o;
import Q6.s;
import android.content.Context;
import com.roblox.client.P;
import h7.p;
import ha.C2697c;
import java.util.Map;

public class a {
    private String b(Context context) {
        return p.a(context);
    }

    private s c() {
        return new s();
    }

    String a(Context context, String str, s sVar) {
        return sVar.a(context, str);
    }

    public void d(Context context, Map<String, String> map) {
        if (context == null || map == null || o.f().h(context)) {
            return;
        }
        E6.c.e().k(context);
        C2697c.e(context);
        String strA = a(context, m.c().e(context), c());
        String strB = b(context);
        U6.c cVarA = new f().a(map);
        if (j6.d.a().Q1() && cVarA.p() && strB.equals("foreground")) {
            return;
        }
        P.q("v" + cVarA.s(), strA, cVarA.b(), cVarA.Z(), strB, cVarA.s(), cVarA.a());
        b bVarA = new g().a(cVarA);
        if (bVarA != null) {
            bVarA.a(context, cVarA);
        }
    }
}
