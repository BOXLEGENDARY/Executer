package D5;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public enum c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");

    private static final Map<Integer, c> W = new HashMap();
    private static final Map<String, c> X = new HashMap();
    private final int[] d;
    private final String[] e;

    static {
        for (c cVar : values()) {
            if (Charset.isSupported(cVar.name())) {
                for (int i : cVar.d) {
                    W.put(Integer.valueOf(i), cVar);
                }
                X.put(cVar.name(), cVar);
                for (String str : cVar.e) {
                    X.put(str, cVar);
                }
            }
        }
    }

    c(int i) {
        this(new int[]{i}, new String[0]);
    }

    public static c c(Charset charset) {
        return X.get(charset.name());
    }

    public static c e(String str) {
        return X.get(str);
    }

    public int f() {
        return this.d[0];
    }

    c(int i, String... strArr) {
        this.d = new int[]{i};
        this.e = strArr;
    }

    c(int[] iArr, String... strArr) {
        this.d = iArr;
        this.e = strArr;
    }
}
