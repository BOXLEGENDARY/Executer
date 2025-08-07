package D5;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public final class e {
    private static final Charset a = Charset.defaultCharset();
    public static final Charset b;
    public static final Charset c;
    private static final Charset d;
    private static final boolean e;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        b = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        d = charsetForName3;
        Charset charset = b;
        e = (charset != null && charset.equals(a)) || (charsetForName3 != null && charsetForName3.equals(a));
    }
}
