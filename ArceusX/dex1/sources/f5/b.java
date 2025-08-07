package f5;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    private static final String[] f20506c = {"*", "FCM", "GCM", BuildConfig.FLAVOR};

    private final SharedPreferences f20507a;

    private final String f20508b;

    public b(Q4.c cVar) {
        this.f20507a = cVar.h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f20508b = b(cVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(Q4.c cVar) {
        String strD = cVar.k().d();
        if (strD != null) {
            return strD;
        }
        String strC = cVar.k().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e7) {
            Log.w("ContentValues", "Invalid key stored " + e7);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f20507a) {
            string = this.f20507a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f20507a) {
            try {
                String string = this.f20507a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f() {
        synchronized (this.f20507a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f20507a) {
            try {
                for (String str : f20506c) {
                    String string = this.f20507a.getString(a(this.f20508b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith(jUbDmI.PyteiZG)) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
