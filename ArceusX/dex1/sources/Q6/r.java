package Q6;

import java.util.UUID;

public class r {
    public static boolean a(String str) {
        try {
            return str.equals(UUID.fromString(str).toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return false;
        }
    }
}
