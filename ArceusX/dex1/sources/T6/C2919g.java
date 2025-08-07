package t6;

import android.text.TextUtils;
import g6.C2465a;
import org.json.JSONObject;
import q7.b;

public class C2919g extends q7.b {

    class a implements b.b {
        a() {
        }

        public void a(q7.a aVar) {
            b(aVar, Wa.c.d());
        }

        void b(q7.a aVar, Wa.c cVar) {
            h7.l.i("rbx.locale", "RBHybridModuleLocalization LanguageChangeTrigger.execute() " + aVar.f());
            String strOptString = aVar.f().optString("newRobloxLanguageValue");
            if (TextUtils.isEmpty(strOptString)) {
                aVar.a(false, (JSONObject) null);
                return;
            }
            h7.l.i("rbx.locale", "newRobloxLocaleValue " + strOptString);
            z6.f fVarB = z6.f.b(strOptString);
            if (fVarB != null) {
                cVar.j(new C2465a(fVarB));
            }
            aVar.a(true, (JSONObject) null);
        }
    }

    public C2919g() {
        super("Localization");
        d("languageChangeTrigger", new a());
    }
}
