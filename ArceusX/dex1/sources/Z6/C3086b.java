package z6;

import K0.wJ.BtcVLuo;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import h7.l;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import z3.AdxZ.bpTQi;
import z6.InterfaceC3087c;

public class C3086b {

    private static C3086b f24879j;

    private EnumC0243b f24885f;

    private InterfaceC3087c f24886g;

    private Connection f24887h;

    private f f24880a = null;

    private f f24881b = null;

    private Locale f24882c = null;

    private f f24883d = null;

    private String f24884e = null;

    private InterfaceC3087c.a f24888i = new a();

    class a implements InterfaceC3087c.a {
        a() {
        }

        @Override
        public InterfaceC3087c a(Context context) {
            return new d(context);
        }
    }

    public enum EnumC0243b {
        LOCALE_MODE_LOGIN_SIGN_UP,
        LOCALE_MODE_GENERAL_EXPERIENCE
    }

    C3086b() {
    }

    public static Locale b(String str) {
        if (!str.contains("_")) {
            return new Locale(str);
        }
        String[] strArrSplit = str.split("_");
        return new Locale(strArrSplit[0], strArrSplit[1]);
    }

    private f c() {
        Locale localeE = e();
        if (localeE != null) {
            String country = localeE.getCountry();
            String language = localeE.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                if (!TextUtils.isEmpty(country)) {
                    language = language + BtcVLuo.mxPgJvoNqU + country;
                }
                f fVarA = f.a(language);
                return fVarA != null ? fVarA : f.f24895d;
            }
        }
        return f.f24895d;
    }

    public static C3086b f() {
        if (f24879j == null) {
            synchronized (C3086b.class) {
                try {
                    if (f24879j == null) {
                        f24879j = new C3086b();
                    }
                } finally {
                }
            }
        }
        return f24879j;
    }

    private InterfaceC3087c h(Context context) {
        if (this.f24886g == null) {
            this.f24886g = this.f24888i.a(context);
        }
        return this.f24886g;
    }

    public void l(Context context, JSONObject jSONObject) throws JSONException {
        f fVarB;
        try {
            String string = jSONObject.getString("localeId");
            if (string == null || string.isEmpty() || (fVarB = f.b(string)) == null || f().k(fVarB)) {
                return;
            }
            l.g("rbx.locale", bpTQi.kePGtNVHPEzYlpf + fVarB.d() + " " + fVarB.c());
            o(fVarB, context);
            r(fVarB);
            t(context, string);
            n(fVarB, context);
        } catch (JSONException unused) {
            l.d("MessageBus", "Failed to get QR code image userId");
        }
    }

    private Context v(Context context, String str, Resources resources, Configuration configuration) {
        Locale localeB = b(str);
        Locale.setDefault(localeB);
        configuration.setLocale(localeB);
        configuration.setLayoutDirection(localeB);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }

    private Context w(Context context, f fVar) {
        this.f24880a = fVar;
        String strC = fVar.c();
        Resources resources = context.getResources();
        return v(context, strC, resources, resources.getConfiguration());
    }

    public f d(Context context) {
        f fVar = this.f24881b;
        if (fVar != null) {
            return fVar;
        }
        f fVarC = h(context).c();
        return fVarC == null ? c() : fVarC;
    }

    public Locale e() {
        return this.f24882c;
    }

    public EnumC0243b g() {
        return this.f24885f;
    }

    public String i(Context context) {
        String strD = this.f24884e;
        if (strD == null && context != null) {
            l.i("rbx.locale", "mUGCLocaleCode is Empty");
            f fVarF = h(context).f();
            if (fVarF != null) {
                strD = fVarF.d();
            }
            if (strD == null) {
                l.g("rbx.locale", "No stored value for mUGCLocaleCode. Use English");
                strD = f.f24895d.d();
            }
        }
        l.i("rbx.locale", "mUGCLocaleCode value is: " + strD);
        return strD;
    }

    public f j() {
        return this.f24880a;
    }

    public boolean k(f fVar) {
        return this.f24880a.equals(fVar);
    }

    public void m(final Context context) {
        this.f24887h = MessageBus.f().u("Locale.RobloxLocaleIdChanged", new Callback() {
            public final void a(JSONObject jSONObject) throws JSONException {
                this.f24877a.l(context, jSONObject);
            }
        });
    }

    public boolean n(f fVar, Context context) {
        if (fVar == null) {
            return false;
        }
        boolean zK = k(fVar);
        boolean z7 = !zK;
        if (zK || context == null) {
            return z7;
        }
        h(context).b(fVar);
        w(context, fVar);
        return z7;
    }

    public void o(f fVar, Context context) {
        p(fVar);
        h(context).d(this.f24881b);
    }

    void p(f fVar) {
        this.f24881b = fVar;
    }

    public void q(Locale locale) {
        this.f24882c = locale;
    }

    public void r(f fVar) {
        this.f24883d = fVar;
    }

    public void s(EnumC0243b enumC0243b) {
        this.f24885f = enumC0243b;
    }

    public void t(Context context, String str) {
        this.f24884e = str;
        h(context).a(this.f24884e);
    }

    public void u(Context context) {
        f fVarE = this.f24880a;
        if (fVarE == null) {
            l.g("rbx.locale", "mUserLocale is empty");
            fVarE = h(context).e();
            if (fVarE == null) {
                l.g("rbx.locale", "No stored value for mUserLocale.");
                fVarE = c();
            }
        }
        l.g("rbx.locale", "Updating App configuration based on locale = " + fVarE);
        w(context, fVarE);
    }
}
