package z6;

import android.content.Context;
import android.content.SharedPreferences;
import h7.s;

public class d implements InterfaceC3087c {

    private final Context f24893a;

    public d(Context context) {
        this.f24893a = context.getApplicationContext();
    }

    private SharedPreferences g() {
        return s.a(this.f24893a, "LocaleSettingsPreferences");
    }

    private void i(String str, String str2) {
        if (str2 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = g().edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    @Override
    public void a(String str) {
        i("PREF_NAME_UGC_LOCALE", str);
    }

    @Override
    public void b(f fVar) {
        if (fVar == null) {
            return;
        }
        j(fVar.d());
    }

    @Override
    public f c() {
        return f.b(g().getString("DEFAULT_LOCALE_VALUE", null));
    }

    @Override
    public void d(f fVar) {
        if (fVar == null) {
            return;
        }
        h(fVar.d());
    }

    @Override
    public f e() {
        return f.b(g().getString("PREF_NAME_SELECTED_LOCALE", null));
    }

    @Override
    public f f() {
        return f.b(g().getString("PREF_NAME_UGC_LOCALE", null));
    }

    public void h(String str) {
        i("DEFAULT_LOCALE_VALUE", str);
    }

    public void j(String str) {
        i("PREF_NAME_SELECTED_LOCALE", str);
    }
}
