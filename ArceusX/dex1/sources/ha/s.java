package ha;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.roblox.client.RobloxApplication;
import com.roblox.client.a0;
import d6.d;
import e6.C2430a;
import h7.l;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import t7.g;
import t7.i;

public class s extends i {

    private SharedPreferences f22559b;

    private final Executor f22560c;

    private AtomicBoolean f22561d;

    private AtomicBoolean f22562e;

    class a implements Runnable {

        final String f22563d;

        final String f22564e;

        a(String str, String str2) {
            this.f22563d = str;
            this.f22564e = str2;
        }

        @Override
        public void run() throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
            C2430a.C0185a c0185aB = C2430a.b(this.f22563d);
            if (c0185aB != null) {
                s.this.f22559b.edit().putString(this.f22564e, c0185aB.a()).apply();
                s.this.f22559b.edit().putString(this.f22564e + "-2", c0185aB.b()).commit();
            }
        }
    }

    s(CookiePolicy cookiePolicy) {
        super(cookiePolicy);
        this.f22560c = Executors.newSingleThreadExecutor();
        this.f22561d = new AtomicBoolean(true);
        this.f22562e = new AtomicBoolean(false);
        Context contextA = RobloxApplication.a();
        if (contextA != null) {
            this.f22559b = contextA.getSharedPreferences("webView_backup", 0);
        }
    }

    private void j(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("auth." + a0.K())) {
            n(a0.K(), str2);
        }
    }

    private String k(String str) {
        URL url;
        SharedPreferences sharedPreferences;
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
        }
        if (TextUtils.isEmpty(url.getHost()) || !url.getHost().endsWith(a0.K()) || (sharedPreferences = this.f22559b) == null) {
            return null;
        }
        String string = sharedPreferences.getString(a0.K(), null);
        String string2 = this.f22559b.getString(a0.K() + "-2", null);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            return C2430a.a(string, string2);
        }
        return null;
    }

    private boolean l() {
        SharedPreferences sharedPreferences = this.f22559b;
        return (sharedPreferences == null || sharedPreferences.getString(a0.K(), null) == null) ? false : true;
    }

    public static String m(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.equals("auth." + a0.K()) || !str2.startsWith(".ROBLOSECURITY")) {
            return str;
        }
        boolean z7 = false;
        boolean z8 = false;
        for (String str3 : str2.split(";")) {
            String strTrim = str3.trim();
            if (!z7 && strTrim.startsWith("domain")) {
                String[] strArrSplit = strTrim.split("=");
                if (strArrSplit.length == 2 && strArrSplit[1].equals(a0.K())) {
                    z7 = true;
                }
            }
            if (z8 || !strTrim.equals("secure")) {
                if (z7 && z8) {
                    break;
                }
            } else {
                z8 = true;
            }
        }
        if (!z7 || !z8) {
            return str;
        }
        return "https://" + str;
    }

    private void n(String str, String str2) {
        if (this.f22559b == null) {
            return;
        }
        this.f22560c.execute(new a(str2, str));
    }

    public String b(String str) {
        URL url;
        String strB = super.b(str);
        if (this.f22561d.getAndSet(false) && ((strB == null || d.a(strB)) && l())) {
            l.a("ShellCookieHandler", "Cookie is invalid at first check.");
            this.f22562e.set(true);
        }
        if (this.f22562e.get()) {
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url != null) {
                l.a("ShellCookieHandler", "no cookie for " + url.getHost());
                String strK = k(str);
                if (!TextUtils.isEmpty(url.getHost()) && !TextUtils.isEmpty(strK) && ((strB == null || !strB.contains(".ROBLOSECURITY")) && strK.contains(".ROBLOSECURITY"))) {
                    l.a("ShellCookieHandler", "Use back up.");
                    super.f(a0.K(), strK);
                    return strK;
                }
                l.a("ShellCookieHandler", "No backup found.");
            }
        }
        return strB;
    }

    public void f(String str, String str2) {
        j(str, str2);
        super.f(m(str, str2), str2);
    }

    public void g(String str, String str2, ValueCallback<Boolean> valueCallback) {
        super.g(m(str, str2), str2, valueCallback);
    }

    public void i() {
        String str;
        String strB = super.b(a0.K());
        if (strB == null || !strB.contains(".ROBLOSECURITY")) {
            return;
        }
        String[] strArrSplit = strB.split(";");
        if (strArrSplit.length == 0) {
            return;
        }
        int length = strArrSplit.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                str = null;
                break;
            }
            str = strArrSplit[i7];
            if (str.contains(".ROBLOSECURITY")) {
                break;
            } else {
                i7++;
            }
        }
        if (str == null) {
            return;
        }
        n(a0.K(), String.format("%s; domain=%s; path=/", str, a0.K()));
    }

    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        super.saveFromResponse(httpUrl, list);
        g.h().k(httpUrl.uri().toString());
    }
}
