package w0;

import java.util.Locale;

public final class r {

    public static final q f24259a = new e(null, false);

    public static final q f24260b = new e(null, true);

    public static final q f24261c;

    public static final q f24262d;

    public static final q f24263e;

    public static final q f24264f;

    private static class a implements c {

        static final a f24265b = new a(true);

        private final boolean f24266a;

        private a(boolean z7) {
            this.f24266a = z7;
        }

        @Override
        public int a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            boolean z7 = false;
            while (i7 < i9) {
                int iA = r.a(Character.getDirectionality(charSequence.charAt(i7)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i7++;
                        z7 = z7;
                    } else if (!this.f24266a) {
                        return 1;
                    }
                } else if (this.f24266a) {
                    return 0;
                }
                z7 = true;
                i7++;
                z7 = z7;
            }
            if (z7) {
                return this.f24266a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        static final b f24267a = new b();

        private b() {
        }

        @Override
        public int a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            int iB = 2;
            while (i7 < i9 && iB == 2) {
                iB = r.b(Character.getDirectionality(charSequence.charAt(i7)));
                i7++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i7, int i8);
    }

    private static abstract class d implements q {

        private final c f24268a;

        d(c cVar) {
            this.f24268a = cVar;
        }

        private boolean c(CharSequence charSequence, int i7, int i8) {
            int iA = this.f24268a.a(charSequence, i7, i8);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override
        public boolean a(CharSequence charSequence, int i7, int i8) {
            if (charSequence == null || i7 < 0 || i8 < 0 || charSequence.length() - i8 < i7) {
                throw new IllegalArgumentException();
            }
            return this.f24268a == null ? b() : c(charSequence, i7, i8);
        }

        protected abstract boolean b();
    }

    private static class e extends d {

        private final boolean f24269b;

        e(c cVar, boolean z7) {
            super(cVar);
            this.f24269b = z7;
        }

        @Override
        protected boolean b() {
            return this.f24269b;
        }
    }

    private static class f extends d {

        static final f f24270b = new f();

        f() {
            super(null);
        }

        @Override
        protected boolean b() {
            return s.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f24267a;
        f24261c = new e(bVar, false);
        f24262d = new e(bVar, true);
        f24263e = new e(a.f24265b, false);
        f24264f = f.f24270b;
    }

    static int a(int i7) {
        if (i7 != 0) {
            return (i7 == 1 || i7 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i7) {
        if (i7 != 0) {
            if (i7 == 1 || i7 == 2) {
                return 0;
            }
            switch (i7) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
