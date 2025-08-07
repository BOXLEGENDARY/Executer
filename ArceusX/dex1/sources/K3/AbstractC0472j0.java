package K3;

import java.io.IOException;

public abstract class AbstractC0472j0 {

    private static final AbstractC0472j0 f1876a = new C0468h0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    private static final AbstractC0472j0 f1877b = new C0468h0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    private static final AbstractC0472j0 f1878c = new C0470i0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    private static final AbstractC0472j0 f1879d = new C0470i0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    private static final AbstractC0472j0 f1880e = new C0466g0("base16()", "0123456789ABCDEF");

    AbstractC0472j0() {
    }

    public static AbstractC0472j0 d() {
        return f1880e;
    }

    abstract void a(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException;

    abstract int b(int i7);

    public abstract AbstractC0472j0 c();

    public final String e(byte[] bArr, int i7, int i8) {
        C0485q.e(0, i8, bArr.length);
        StringBuilder sb = new StringBuilder(b(i8));
        try {
            a(sb, bArr, 0, i8);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
