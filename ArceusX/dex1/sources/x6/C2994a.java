package x6;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import h7.l;
import z6.C3086b;

public class C2994a extends n7.a {
    private static Context d() {
        return RobloxApplication.a();
    }

    public String a() {
        String strI = C3086b.f().i(d());
        if (strI == null) {
            return c();
        }
        l.i("rbx.locale", "ugcLocaleCode : " + strI);
        return strI;
    }

    public String b() {
        return d().getResources().getConfiguration().getLocales().get(0).toString();
    }

    public String c() {
        return C3086b.f().j().d();
    }
}
