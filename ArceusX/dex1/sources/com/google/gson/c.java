package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

public abstract class c implements com.google.gson.d {

    private static final c[] f19148A;

    public static final c f19149d;

    public static final c f19150e;

    public static final c f19151i;

    public static final c f19152v;

    public static final c f19153w;

    public static final c f19154y;

    public static final c f19155z;

    enum a extends c {
        a(String str, int i7) {
            super(str, i7, null);
        }

        @Override
        public String c(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f19149d = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) {
            {
                a aVar2 = null;
            }

            @Override
            public String c(Field field) {
                return c.f(field.getName());
            }
        };
        f19150e = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) {
            {
                a aVar2 = null;
            }

            @Override
            public String c(Field field) {
                return c.f(c.e(field.getName(), ' '));
            }
        };
        f19151i = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) {
            {
                a aVar2 = null;
            }

            @Override
            public String c(Field field) {
                return c.e(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f19152v = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) {
            {
                a aVar2 = null;
            }

            @Override
            public String c(Field field) {
                return c.e(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f19153w = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) {
            {
                a aVar2 = null;
            }

            @Override
            public String c(Field field) {
                return c.e(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f19154y = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) {
            {
                a aVar2 = null;
            }

            @Override
            public String c(Field field) {
                return c.e(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f19155z = cVar6;
        f19148A = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    private c(String str, int i7) {
    }

    static String e(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String f(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i7 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i7) + upperCase + str.substring(i7 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f19148A.clone();
    }

    c(String str, int i7, a aVar) {
        this(str, i7);
    }
}
