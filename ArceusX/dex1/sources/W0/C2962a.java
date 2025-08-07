package w0;

import android.text.SpannableStringBuilder;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;

public final class C2962a {

    static final q f24229d;

    private static final String f24230e;

    private static final String f24231f;

    static final C2962a f24232g;

    static final C2962a f24233h;

    private final boolean f24234a;

    private final int f24235b;

    private final q f24236c;

    public static final class C0236a {

        private boolean f24237a;

        private int f24238b;

        private q f24239c;

        public C0236a() {
            c(C2962a.e(Locale.getDefault()));
        }

        private static C2962a b(boolean z7) {
            return z7 ? C2962a.f24233h : C2962a.f24232g;
        }

        private void c(boolean z7) {
            this.f24237a = z7;
            this.f24239c = C2962a.f24229d;
            this.f24238b = 2;
        }

        public C2962a a() {
            return (this.f24238b == 2 && this.f24239c == C2962a.f24229d) ? b(this.f24237a) : new C2962a(this.f24237a, this.f24238b, this.f24239c);
        }
    }

    private static class b {

        private static final byte[] f24240f = new byte[1792];

        private final CharSequence f24241a;

        private final boolean f24242b;

        private final int f24243c;

        private int f24244d;

        private char f24245e;

        static {
            for (int i7 = 0; i7 < 1792; i7++) {
                f24240f[i7] = Character.getDirectionality(i7);
            }
        }

        b(CharSequence charSequence, boolean z7) {
            this.f24241a = charSequence;
            this.f24242b = z7;
            this.f24243c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f24240f[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char cCharAt;
            int i7 = this.f24244d;
            do {
                int i8 = this.f24244d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f24241a;
                int i9 = i8 - 1;
                this.f24244d = i9;
                cCharAt = charSequence.charAt(i9);
                this.f24245e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f24244d = i7;
            this.f24245e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i7 = this.f24244d;
                if (i7 >= this.f24243c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f24241a;
                this.f24244d = i7 + 1;
                cCharAt = charSequence.charAt(i7);
                this.f24245e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i7 = this.f24244d;
            while (true) {
                int i8 = this.f24244d;
                if (i8 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f24241a;
                int i9 = i8 - 1;
                this.f24244d = i9;
                char cCharAt2 = charSequence.charAt(i9);
                this.f24245e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i10 = this.f24244d;
                        if (i10 > 0) {
                            CharSequence charSequence2 = this.f24241a;
                            int i11 = i10 - 1;
                            this.f24244d = i11;
                            cCharAt = charSequence2.charAt(i11);
                            this.f24245e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f24244d = i7;
            this.f24245e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i7 = this.f24244d;
            while (true) {
                int i8 = this.f24244d;
                if (i8 >= this.f24243c) {
                    this.f24244d = i7;
                    this.f24245e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f24241a;
                this.f24244d = i8 + 1;
                char cCharAt2 = charSequence.charAt(i8);
                this.f24245e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i9 = this.f24244d;
                        if (i9 < this.f24243c) {
                            CharSequence charSequence2 = this.f24241a;
                            this.f24244d = i9 + 1;
                            cCharAt = charSequence2.charAt(i9);
                            this.f24245e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f24241a.charAt(this.f24244d - 1);
            this.f24245e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f24241a, this.f24244d);
                this.f24244d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f24244d--;
            byte bC = c(this.f24245e);
            if (!this.f24242b) {
                return bC;
            }
            char c2 = this.f24245e;
            return c2 == '>' ? h() : c2 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f24241a.charAt(this.f24244d);
            this.f24245e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f24241a, this.f24244d);
                this.f24244d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f24244d++;
            byte bC = c(this.f24245e);
            if (!this.f24242b) {
                return bC;
            }
            char c2 = this.f24245e;
            return c2 == '<' ? i() : c2 == '&' ? g() : bC;
        }

        int d() {
            this.f24244d = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (this.f24244d < this.f24243c && i7 == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i9 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i9++;
                                i8 = -1;
                                continue;
                            case 16:
                            case 17:
                                i9++;
                                i8 = 1;
                                continue;
                            case 18:
                                i9--;
                                i8 = 0;
                                continue;
                        }
                    }
                } else if (i9 == 0) {
                    return -1;
                }
                i7 = i9;
            }
            if (i7 == 0) {
                return 0;
            }
            if (i8 != 0) {
                return i8;
            }
            while (this.f24244d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i7 == i9) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i7 == i9) {
                            return 1;
                        }
                        break;
                    case 18:
                        i9++;
                        continue;
                }
                i9--;
            }
            return 0;
        }

        int e() {
            this.f24244d = this.f24243c;
            int i7 = 0;
            while (true) {
                int i8 = i7;
                while (this.f24244d > 0) {
                    byte bA = a();
                    if (bA != 0) {
                        if (bA == 1 || bA == 2) {
                            if (i7 == 0) {
                                return 1;
                            }
                            if (i8 == 0) {
                                break;
                            }
                        } else if (bA != 9) {
                            switch (bA) {
                                case 14:
                                case 15:
                                    if (i8 == i7) {
                                        return -1;
                                    }
                                    i7--;
                                    break;
                                case 16:
                                case 17:
                                    if (i8 == i7) {
                                        return 1;
                                    }
                                    i7--;
                                    break;
                                case 18:
                                    i7++;
                                    break;
                                default:
                                    if (i8 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i7 == 0) {
                            return -1;
                        }
                        if (i8 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        q qVar = r.f24261c;
        f24229d = qVar;
        f24230e = Character.toString((char) 8206);
        f24231f = Character.toString((char) 8207);
        f24232g = new C2962a(false, 2, qVar);
        f24233h = new C2962a(true, 2, qVar);
    }

    C2962a(boolean z7, int i7, q qVar) {
        this.f24234a = z7;
        this.f24235b = i7;
        this.f24236c = qVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C2962a c() {
        return new C0236a().a();
    }

    static boolean e(Locale locale) {
        return s.a(locale) == 1;
    }

    private String f(CharSequence charSequence, q qVar) {
        boolean zA = qVar.a(charSequence, 0, charSequence.length());
        return (this.f24234a || !(zA || b(charSequence) == 1)) ? this.f24234a ? (!zA || b(charSequence) == -1) ? f24231f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f24230e;
    }

    private String g(CharSequence charSequence, q qVar) {
        boolean zA = qVar.a(charSequence, 0, charSequence.length());
        return (this.f24234a || !(zA || a(charSequence) == 1)) ? this.f24234a ? (!zA || a(charSequence) == -1) ? f24231f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f24230e;
    }

    public boolean d() {
        return (this.f24235b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f24236c, true);
    }

    public CharSequence i(CharSequence charSequence, q qVar, boolean z7) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = qVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z7) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? r.f24260b : r.f24259a));
        }
        if (zA != this.f24234a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z7) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? r.f24260b : r.f24259a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f24236c, true);
    }

    public String k(String str, q qVar, boolean z7) {
        if (str == null) {
            return null;
        }
        return i(str, qVar, z7).toString();
    }
}
