package K4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class j {

    private static final Object f1912a;

    private static final Method f1913b;

    private static final Method f1914c;

    static {
        Object objB = b();
        f1912a = objB;
        f1913b = objB == null ? null : a();
        f1914c = objB != null ? d(objB) : null;
    }

    private static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodC = c("getStackTraceDepth", Throwable.class);
            if (methodC == null) {
                return null;
            }
            methodC.invoke(obj, new Throwable());
            return methodC;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static void e(Throwable th) {
        g.g(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
