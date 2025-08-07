package L;

import L.c;
import java.util.ArrayDeque;

public class a<T> implements c<T> {

    private final int f1928a;

    private final ArrayDeque<T> f1929b;

    private final Object f1930c;

    final c.a<T> f1931d;

    public a(int i7) {
        this(i7, null);
    }

    @Override
    public T a() {
        T tRemoveLast;
        synchronized (this.f1930c) {
            tRemoveLast = this.f1929b.removeLast();
        }
        return tRemoveLast;
    }

    public void b(T t7) {
        T tA;
        synchronized (this.f1930c) {
            try {
                tA = this.f1929b.size() >= this.f1928a ? a() : null;
                this.f1929b.addFirst(t7);
            } catch (Throwable th) {
                throw th;
            }
        }
        c.a<T> aVar = this.f1931d;
        if (aVar == null || tA == null) {
            return;
        }
        aVar.a(tA);
    }

    @Override
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f1930c) {
            zIsEmpty = this.f1929b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i7, c.a<T> aVar) {
        this.f1930c = new Object();
        this.f1928a = i7;
        this.f1929b = new ArrayDeque<>(i7);
        this.f1931d = aVar;
    }
}
