package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import n3.C2651i;
import org.json.JSONException;

public class C2493b {

    private static final Lock f21127c = new ReentrantLock();

    private static C2493b f21128d;

    private final Lock f21129a = new ReentrantLock();

    private final SharedPreferences f21130b;

    C2493b(Context context) {
        this.f21130b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C2493b b(Context context) {
        C2651i.l(context);
        Lock lock = f21127c;
        lock.lock();
        try {
            if (f21128d == null) {
                f21128d = new C2493b(context.getApplicationContext());
            }
            C2493b c2493b = f21128d;
            lock.unlock();
            return c2493b;
        } catch (Throwable th) {
            f21127c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f21129a.lock();
        try {
            this.f21130b.edit().clear().apply();
        } finally {
            this.f21129a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG2) || (strG = g(i("googleSignInAccount", strG2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.x(strG);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG2) || (strG = g(i("googleSignInOptions", strG2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.v(strG);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C2651i.l(googleSignInAccount);
        C2651i.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.C());
        C2651i.l(googleSignInAccount);
        C2651i.l(googleSignInOptions);
        String strC = googleSignInAccount.C();
        h(i("googleSignInAccount", strC), googleSignInAccount.D());
        h(i("googleSignInOptions", strC), googleSignInOptions.D());
    }

    protected final String g(String str) {
        this.f21129a.lock();
        try {
            return this.f21130b.getString(str, null);
        } finally {
            this.f21129a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f21129a.lock();
        try {
            this.f21130b.edit().putString(str, str2).apply();
        } finally {
            this.f21129a.unlock();
        }
    }
}
