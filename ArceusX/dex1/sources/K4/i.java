package K4;

import S9.Gvmm.CAqKeu;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class i {
    public static String a(String str) {
        return f.a(str);
    }

    public static boolean b(String str) {
        return f.c(str);
    }

    public static String c(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i7 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i8 = 0; i8 < objArr.length; i8++) {
                objArr[i8] = d(objArr[i8]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i9 = 0;
        while (i7 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) strValueOf, i9, iIndexOf);
            sb.append(objArr[i7]);
            i9 = iIndexOf + 2;
            i7++;
        }
        sb.append((CharSequence) strValueOf, i9, strValueOf.length());
        if (i7 < objArr.length) {
            sb.append(CAqKeu.DMdurQwPZXZm);
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String string = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(string);
            logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e7);
            String name2 = e7.getClass().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
