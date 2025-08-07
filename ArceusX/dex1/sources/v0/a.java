package v0;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import v0.i;
import v0.k;

class a {

    private final k.c f24044a;

    private final Executor f24045b;

    class RunnableC0231a implements Runnable {

        final k.c f24046d;

        final Typeface f24047e;

        RunnableC0231a(k.c cVar, Typeface typeface) {
            this.f24046d = cVar;
            this.f24047e = typeface;
        }

        @Override
        public void run() {
            this.f24046d.b(this.f24047e);
        }
    }

    class b implements Runnable {

        final k.c f24049d;

        final int f24050e;

        b(k.c cVar, int i7) {
            this.f24049d = cVar;
            this.f24050e = i7;
        }

        @Override
        public void run() {
            this.f24049d.a(this.f24050e);
        }
    }

    a(k.c cVar, Executor executor) {
        this.f24044a = cVar;
        this.f24045b = executor;
    }

    private void a(int i7) {
        this.f24045b.execute(new b(this.f24044a, i7));
    }

    private void c(Typeface typeface) {
        this.f24045b.execute(new RunnableC0231a(this.f24044a, typeface));
    }

    void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f24078a);
        } else {
            a(eVar.f24079b);
        }
    }
}
