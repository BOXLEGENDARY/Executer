package I8;

import androidx.lifecycle.E;

public final class g implements C9.d<E> {
    private final c a;

    public g(c cVar) {
        this.a = cVar;
    }

    public static g a(c cVar) {
        return new g(cVar);
    }

    public static E c(c cVar) {
        return (E) C9.g.d(cVar.getSavedStateHandle());
    }

    public E get() {
        return c(this.a);
    }
}
