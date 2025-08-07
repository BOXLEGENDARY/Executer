package G9;

import G9.l;
import androidx.annotation.NonNull;

abstract class m {

    class a extends m {
        final l.b a;
        final g b;

        a(l.b bVar, g gVar) {
            this.a = bVar;
            this.b = gVar;
        }

        @Override
        @NonNull
        l a() {
            return this.a.b(this.b, new r());
        }
    }

    m() {
    }

    @NonNull
    static m b(@NonNull l.b bVar, @NonNull g gVar) {
        return new a(bVar, gVar);
    }

    @NonNull
    abstract l a();
}
