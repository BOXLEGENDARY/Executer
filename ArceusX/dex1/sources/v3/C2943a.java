package v3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import x3.C2989c;

public class C2943a {
    @Deprecated
    public static byte[] a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigestB;
        PackageInfo packageInfoF = C2989c.a(context).f(str, 64);
        Signature[] signatureArr = packageInfoF.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestB = b("SHA1")) == null) {
            return null;
        }
        return messageDigestB.digest(packageInfoF.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
