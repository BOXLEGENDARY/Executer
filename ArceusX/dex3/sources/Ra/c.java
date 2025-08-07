package Ra;

public class c {
    public static int a(java.lang.CharSequence r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: Ra.c.a(java.lang.CharSequence, int):int");
    }

    private static int b(CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == 0 || cCharAt == ' ') {
                if (i3 != i) {
                    return i3;
                }
                return -1;
            }
            if (cCharAt == '\\') {
                int i4 = i3 + 1;
                if (d.g(charSequence, i4)) {
                    i3 = i4;
                }
            } else if (cCharAt == '(') {
                i2++;
                if (i2 > 32) {
                    return -1;
                }
            } else if (cCharAt != ')') {
                if (Character.isISOControl(cCharAt)) {
                    if (i3 != i) {
                        return i3;
                    }
                    return -1;
                }
            } else {
                if (i2 == 0) {
                    return i3;
                }
                i2--;
            }
            i3++;
        }
        return charSequence.length();
    }

    public static int c(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!d.g(charSequence, i2)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int d(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char cCharAt = charSequence.charAt(i);
        char c = '\"';
        if (cCharAt != '\"') {
            c = '\'';
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c = ')';
            }
        }
        int iE = e(charSequence, i + 1, c);
        if (iE != -1 && iE < charSequence.length() && charSequence.charAt(iE) == c) {
            return iE + 1;
        }
        return -1;
    }

    public static int e(java.lang.CharSequence r3, int r4, char r5) {
        throw new UnsupportedOperationException("Method not decompiled: Ra.c.e(java.lang.CharSequence, int, char):int");
    }
}
