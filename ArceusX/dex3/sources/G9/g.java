package G9;

import androidx.annotation.NonNull;

public class g {
    private final H9.c a;
    private final K9.a b;
    private final M9.a c;
    private final c d;
    private final L9.a e;
    private final K9.d f;
    private final j g;

    public static class b {
        private H9.c a;
        private K9.a b;
        private M9.a c;
        private c d;
        private L9.a e;
        private K9.d f;
        private j g;

        b() {
        }

        @NonNull
        public g h(@NonNull H9.c cVar, @NonNull j jVar) {
            this.a = cVar;
            this.g = jVar;
            if (this.b == null) {
                this.b = K9.a.a();
            }
            if (this.c == null) {
                this.c = new M9.b();
            }
            if (this.d == null) {
                this.d = new d();
            }
            if (this.e == null) {
                this.e = L9.a.a();
            }
            if (this.f == null) {
                this.f = new K9.e();
            }
            return new g(this);
        }
    }

    @NonNull
    public L9.a a() {
        return this.e;
    }

    @NonNull
    public c b() {
        return this.d;
    }

    @NonNull
    public j c() {
        return this.g;
    }

    @NonNull
    public M9.a d() {
        return this.c;
    }

    @NonNull
    public H9.c e() {
        return this.a;
    }

    private g(@NonNull b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
    }
}
