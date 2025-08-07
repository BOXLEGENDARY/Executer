package android.view;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractC1678L {

    private final Map<String, Object> f11292a = new HashMap();

    private final Set<Closeable> f11293b = new LinkedHashSet();

    private volatile boolean f11294c = false;

    private static void b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    final void a() {
        this.f11294c = true;
        Map<String, Object> map = this.f11292a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator<Object> it = this.f11292a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set<Closeable> set = this.f11293b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator<Closeable> it2 = this.f11293b.iterator();
                    while (it2.hasNext()) {
                        b(it2.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    <T> T c(String str) {
        T t7;
        Map<String, Object> map = this.f11292a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t7 = (T) this.f11292a.get(str);
        }
        return t7;
    }

    protected void d() {
    }

    <T> T e(String str, T t7) throws IOException {
        Object obj;
        synchronized (this.f11292a) {
            try {
                obj = this.f11292a.get(str);
                if (obj == 0) {
                    this.f11292a.put(str, t7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            t7 = obj;
        }
        if (this.f11294c) {
            b(t7);
        }
        return t7;
    }
}
