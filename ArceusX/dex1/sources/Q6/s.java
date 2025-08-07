package Q6;

import android.content.Context;
import android.content.SharedPreferences;

public class s {
    private SharedPreferences c(Context context) {
        return h7.s.a(context, "NotificationPreferences");
    }

    private SharedPreferences.Editor d(Context context) {
        return c(context).edit();
    }

    public String a(Context context, String str) {
        return c(context).getString(str, null);
    }

    public boolean b(Context context, String str) {
        return c(context).getBoolean(str, false);
    }

    public boolean e(Context context, String str) {
        return c(context).contains(str);
    }

    public void f(Context context, String str, boolean z7) {
        SharedPreferences.Editor editorD = d(context);
        editorD.putBoolean(str, z7);
        editorD.commit();
    }

    public void g(Context context, String str, String str2) {
        SharedPreferences.Editor editorD = d(context);
        editorD.putString(str, str2);
        editorD.commit();
    }
}
