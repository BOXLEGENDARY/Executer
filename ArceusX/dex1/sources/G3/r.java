package G3;

import android.util.Base64;
import java.security.SecureRandom;

public final class r {

    private static final SecureRandom f1364a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f1364a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
