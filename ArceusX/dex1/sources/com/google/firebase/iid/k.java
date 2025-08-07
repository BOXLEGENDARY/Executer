package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import g0.C2457a;
import g1.kQwt.YGBtcyQ;
import java.io.File;
import java.io.IOException;
import java.util.Map;

final class k {

    private final SharedPreferences f19052a;

    private final Context f19053b;

    private final F f19054c;

    private final Map<String, G> f19055d;

    public k(Context context) {
        this(context, new F());
    }

    static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private static String h(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private final synchronized boolean j() {
        return this.f19052a.getAll().isEmpty();
    }

    public final synchronized j a(String str, String str2, String str3) {
        return j.a(this.f19052a.getString(h(str, str2, str3), null));
    }

    public final synchronized String b() {
        return this.f19052a.getString("topic_operation_queue", BuildConfig.FLAVOR);
    }

    public final synchronized void d(String str) {
        this.f19052a.edit().putString(YGBtcyQ.HAd, str).apply();
    }

    public final synchronized void e(String str, String str2, String str3, String str4, String str5) {
        String strB = j.b(str4, str5, System.currentTimeMillis());
        if (strB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f19052a.edit();
        editorEdit.putString(h(str, str2, str3), strB);
        editorEdit.commit();
    }

    public final synchronized G f(String str) {
        G gM;
        G g7 = this.f19055d.get(str);
        if (g7 != null) {
            return g7;
        }
        try {
            gM = this.f19054c.a(this.f19053b, str);
        } catch (H unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.a().w();
            gM = this.f19054c.m(this.f19053b, str);
        }
        this.f19055d.put(str, gM);
        return gM;
    }

    public final synchronized void g() {
        this.f19055d.clear();
        F.g(this.f19053b);
        this.f19052a.edit().clear().commit();
    }

    public final synchronized void i(String str) {
        try {
            String strConcat = String.valueOf(str).concat("|T|");
            SharedPreferences.Editor editorEdit = this.f19052a.edit();
            for (String str2 : this.f19052a.getAll().keySet()) {
                if (str2.startsWith(strConcat)) {
                    editorEdit.remove(str2);
                }
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private k(Context context, F f7) {
        this.f19055d = new C2457a();
        this.f19053b = context;
        this.f19052a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f19054c = f7;
        File file = new File(androidx.core.content.a.i(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || j()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            g();
            FirebaseInstanceId.a().w();
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e7.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }
}
