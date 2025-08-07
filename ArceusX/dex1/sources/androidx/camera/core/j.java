package androidx.camera.core;

import C.InterfaceC0353t0;

final class j extends i {

    class a implements G.c<Void> {

        final n f9484a;

        a(n nVar) {
            this.f9484a = nVar;
        }

        @Override
        public void onSuccess(Void r1) {
        }

        @Override
        public void onFailure(Throwable th) {
            this.f9484a.close();
        }
    }

    j() {
    }

    @Override
    n d(InterfaceC0353t0 interfaceC0353t0) {
        return interfaceC0353t0.h();
    }

    @Override
    void g() {
    }

    @Override
    void o(n nVar) {
        G.n.j(e(nVar), new a(nVar), F.a.a());
    }
}
