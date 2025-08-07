package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import f1.b;
import f1.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    private static volatile a f12106d;

    private static final Object f12107e = new Object();

    final Context f12110c;

    final Set<Class<? extends f1.a<?>>> f12109b = new HashSet();

    final Map<Class<?>, Object> f12108a = new HashMap();

    a(Context context) {
        this.f12110c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends f1.a<?>> cls, Set<Class<?>> set) {
        T t7;
        if (h1.a.d()) {
            try {
                h1.a.a(cls.getSimpleName());
            } catch (Throwable th) {
                h1.a.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f12108a.containsKey(cls)) {
            t7 = (T) this.f12108a.get(cls);
        } else {
            set.add(cls);
            try {
                f1.a<?> aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends f1.a<?>>> listB = aVarNewInstance.b();
                if (!listB.isEmpty()) {
                    for (Class<? extends f1.a<?>> cls2 : listB) {
                        if (!this.f12108a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t7 = (T) aVarNewInstance.a(this.f12110c);
                set.remove(cls);
                this.f12108a.put(cls, t7);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        h1.a.b();
        return t7;
    }

    public static a e(Context context) {
        if (f12106d == null) {
            synchronized (f12107e) {
                try {
                    if (f12106d == null) {
                        f12106d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f12106d;
    }

    void a() {
        try {
            try {
                h1.a.a("Startup");
                b(this.f12110c.getPackageManager().getProviderInfo(new ComponentName(this.f12110c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e7) {
                throw new c(e7);
            }
        } finally {
            h1.a.b();
        }
    }

    void b(Bundle bundle) throws ClassNotFoundException {
        String string = this.f12110c.getString(b.f20461a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (f1.a.class.isAssignableFrom(cls)) {
                            this.f12109b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends f1.a<?>>> it = this.f12109b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e7) {
                throw new c(e7);
            }
        }
    }

    <T> T c(Class<? extends f1.a<?>> cls) {
        T t7;
        synchronized (f12107e) {
            try {
                t7 = (T) this.f12108a.get(cls);
                if (t7 == null) {
                    t7 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t7;
    }

    public <T> T f(Class<? extends f1.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends f1.a<?>> cls) {
        return this.f12109b.contains(cls);
    }
}
