package B6;

import bb.b;
import bb.d;
import bb.t;
import h7.l;
import h7.r;
import ha.C2705k;
import java.util.Locale;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import z6.f;
import z6.g;

public class a {

    class C0005a implements d<ResponseBody> {

        final g f363a;

        C0005a(g gVar) {
            this.f363a = gVar;
        }

        public void a(b<ResponseBody> bVar, Throwable th) {
            a.this.b(this.f363a);
        }

        public void b(b<ResponseBody> bVar, t<ResponseBody> tVar) {
            a.this.c(r.a(tVar), tVar.b(), this.f363a);
        }
    }

    void a(String str, String str2, String str3, g gVar) {
        if (gVar != null) {
            gVar.a(f.b(str), f.b(str2), str3);
        }
    }

    void b(g gVar) {
        l.g("rbx.locale", " api failure");
        a(null, null, null, gVar);
    }

    void c(String str, int i7, g gVar) {
        String strA;
        String strC;
        l.g("rbx.locale", "response: " + str + " ,response code:" + i7);
        String str2 = null;
        if (i7 == 200) {
            try {
                C6.a aVar = new C6.a(new JSONObject(str));
                String strB = aVar.b();
                strA = aVar.a();
                str2 = strB;
                strC = aVar.c();
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
            l.g("rbx.locale", "loginSignUpLocale = " + str2);
            l.g("rbx.locale", "generalExperienceLocale = " + strA);
            l.g("rbx.locale", "ugcLocale = " + strC);
            a(str2, strA, strC, gVar);
        }
        l.g("rbx.locale", "response code != 200, response code = " + i7);
        strC = null;
        strA = null;
        l.g("rbx.locale", "loginSignUpLocale = " + str2);
        l.g("rbx.locale", "generalExperienceLocale = " + strA);
        l.g("rbx.locale", "ugcLocale = " + strC);
        a(str2, strA, strC, gVar);
    }

    public void d(Locale locale, g gVar) {
        if (locale == null) {
            l.g("rbx.locale", "device locale null");
            a(null, null, null, gVar);
            return;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        l.g("rbx.locale", "deviceLocale: " + language + "-" + country);
        s7.g.d().e(C2705k.a().b()).a(language + "-" + country).u(new C0005a(gVar));
    }
}
