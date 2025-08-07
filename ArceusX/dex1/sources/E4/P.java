package E4;

import android.util.Base64;
import com.github.luben.zstd.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class P {
    public static String a(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
