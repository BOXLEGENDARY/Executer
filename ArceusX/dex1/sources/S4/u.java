package S4;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class u implements Y4.d, Y4.c {

    private final Map<Class<?>, ConcurrentHashMap<Y4.b<Object>, Executor>> f7378a = new HashMap();

    private Queue<Y4.a<?>> f7379b = new ArrayDeque();

    private final Executor f7380c;

    u(Executor executor) {
        this.f7380c = executor;
    }

    private synchronized Set<Map.Entry<Y4.b<Object>, Executor>> e(Y4.a<?> aVar) {
        ConcurrentHashMap<Y4.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f7378a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public static void f(Map.Entry entry, Y4.a aVar) {
        ((Y4.b) entry.getKey()).a(aVar);
    }

    @Override
    public <T> void a(Class<T> cls, Y4.b<? super T> bVar) {
        b(cls, this.f7380c, bVar);
    }

    @Override
    public synchronized <T> void b(Class<T> cls, Executor executor, Y4.b<? super T> bVar) {
        try {
            C.b(cls);
            C.b(bVar);
            C.b(executor);
            if (!this.f7378a.containsKey(cls)) {
                this.f7378a.put(cls, new ConcurrentHashMap<>());
            }
            this.f7378a.get(cls).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void d() {
        Queue<Y4.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f7379b;
                if (queue != null) {
                    this.f7379b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<Y4.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        }
    }

    public void g(final Y4.a<?> aVar) {
        C.b(aVar);
        synchronized (this) {
            try {
                Queue<Y4.a<?>> queue = this.f7379b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<Y4.b<Object>, Executor> entry : e(aVar)) {
                    entry.getValue().execute(new Runnable() {
                        @Override
                        public final void run() {
                            u.f(entry, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
