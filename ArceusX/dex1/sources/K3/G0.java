package K3;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class G0 {

    static final Charset f1779a = Charset.forName("US-ASCII");

    static final Charset f1780b = Charset.forName("UTF-8");

    static final Charset f1781c = Charset.forName("ISO-8859-1");

    public static final byte[] f1782d;

    public static final ByteBuffer f1783e;

    public static final F0 f1784f;

    static {
        byte[] bArr = new byte[0];
        f1782d = bArr;
        f1783e = ByteBuffer.wrap(bArr);
        int i7 = F0.f1777a;
        D0 d02 = new D0(bArr, 0, 0, false, null);
        d02.a(0);
        f1784f = d02;
    }
}
