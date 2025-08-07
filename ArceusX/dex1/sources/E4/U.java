package E4;

import com.appsflyer.R;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class U extends RuntimeException {
    private U(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    public static Object c(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception e8) {
            throw new U(e8);
        }
    }

    @Override
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception b(Class cls) {
        int iIndexOf;
        String string;
        Class[] clsArr = {cls};
        int i7 = 0;
        for (int i8 = 0; i8 <= 0; i8++) {
            Class cls2 = clsArr[i8];
            if (RuntimeException.class.isAssignableFrom(cls2)) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i9 = 0; i9 < 2; i9++) {
                    Object obj = objArr[i9];
                    if (obj == null) {
                        string = "null";
                    } else {
                        try {
                            string = obj.toString();
                        } catch (Exception e7) {
                            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e7);
                            string = "<" + str + " threw " + e7.getClass().getName() + ">";
                        }
                    }
                    objArr[i9] = string;
                }
                StringBuilder sb = new StringBuilder(R.styleable.AppCompatTheme_windowActionBarOverlay);
                int i10 = 0;
                while (i7 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i10)) != -1) {
                    sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i10, iIndexOf);
                    sb.append(objArr[i7]);
                    i10 = iIndexOf + 2;
                    i7++;
                }
                sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i10, 86);
                if (i7 < 2) {
                    sb.append(" [");
                    sb.append(objArr[i7]);
                    for (int i11 = i7 + 1; i11 < 2; i11++) {
                        sb.append(", ");
                        sb.append(objArr[i11]);
                    }
                    sb.append(']');
                }
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", cls));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
