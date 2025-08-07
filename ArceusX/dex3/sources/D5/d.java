package D5;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d {
    private static final List<CharsetEncoder> c = new ArrayList();
    private final CharsetEncoder[] a;
    private final int b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            String str = strArr[i];
            if (c.e(str) != null) {
                try {
                    c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public d(String str, Charset charset, int i) {
        boolean z;
        ArrayList<CharsetEncoder> arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        boolean z2 = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            for (CharsetEncoder charsetEncoder : arrayList) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == i || charsetEncoder.canEncode(cCharAt)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                Iterator<CharsetEncoder> it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CharsetEncoder next = it.next();
                    if (next.canEncode(str.charAt(i3))) {
                        arrayList.add(next);
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                z2 = true;
            }
        }
        if (arrayList.size() != 1 || z2) {
            this.a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                this.a[i4] = (CharsetEncoder) it2.next();
                i4++;
            }
            this.a[i4] = StandardCharsets.UTF_8.newEncoder();
            this.a[i4 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.a;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i2] != null && charset.name().equals(this.a[i2].charset().name())) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = -1;
        }
        this.b = i2;
    }

    public boolean a(char c3, int i) {
        return this.a[i].canEncode("" + c3);
    }

    public byte[] b(String str, int i) {
        return str.getBytes(this.a[i].charset());
    }

    public Charset c(int i) {
        return this.a[i].charset();
    }

    public int d(int i) {
        return c.c(this.a[i].charset()).f();
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.a.length;
    }
}
