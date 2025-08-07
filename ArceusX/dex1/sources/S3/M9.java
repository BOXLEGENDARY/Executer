package S3;

import j0.tkB.pkcpMQSgx;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public final class M9 {

    private final String f6806a = pkcpMQSgx.Btop;

    private M9(String str) {
    }

    public static M9 a(String str) {
        return new M9("\n");
    }

    static final CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String b(Iterable iterable) throws IOException {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f6806a);
                    sb.append(c(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
