package y3;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C1823h;
import n3.C2651i;

public abstract class AbstractC3025c<T> {

    private final String f24447a;

    private Object f24448b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected AbstractC3025c(String str) {
        this.f24447a = str;
    }

    protected abstract T a(IBinder iBinder);

    protected final T b(Context context) throws a {
        if (this.f24448b == null) {
            C2651i.l(context);
            Context contextC = C1823h.c(context);
            if (contextC == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f24448b = a((IBinder) contextC.getClassLoader().loadClass(this.f24447a).newInstance());
            } catch (ClassNotFoundException e7) {
                throw new a("Could not load creator class.", e7);
            } catch (IllegalAccessException e8) {
                throw new a("Could not access creator.", e8);
            } catch (InstantiationException e9) {
                throw new a("Could not instantiate creator.", e9);
            }
        }
        return (T) this.f24448b;
    }
}
