package C;

import C.T;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import z.C3043d0;
import z.r0;

public final class M implements W0 {

    private final z.r0 f406d;

    class a implements z.r0 {

        final long f407d;

        a(long j7) {
            this.f407d = j7;
        }

        @Override
        public long b() {
            return this.f407d;
        }

        @Override
        public r0.c f(r0.b bVar) {
            return bVar.d() == 1 ? r0.c.f24703d : r0.c.f24704e;
        }
    }

    public static final class b implements W0 {

        private final z.r0 f409d;

        public b(long j7) {
            this.f409d = new M(j7);
        }

        @Override
        public long b() {
            return this.f409d.b();
        }

        @Override
        public z.r0 e(long j7) {
            return new b(j7);
        }

        @Override
        public r0.c f(r0.b bVar) {
            if (this.f409d.f(bVar).d()) {
                return r0.c.f24704e;
            }
            Throwable thA = bVar.a();
            if (thA instanceof T.b) {
                C3043d0.c("CameraX", jUbDmI.vpqtEuoCtpP);
                if (((T.b) thA).a() > 0) {
                    return r0.c.f24706g;
                }
            }
            return r0.c.f24703d;
        }
    }

    public M(long j7) {
        this.f406d = new i1(j7, new a(j7));
    }

    @Override
    public long b() {
        return this.f406d.b();
    }

    @Override
    public z.r0 e(long j7) {
        return new M(j7);
    }

    @Override
    public r0.c f(r0.b bVar) {
        return this.f406d.f(bVar);
    }
}
