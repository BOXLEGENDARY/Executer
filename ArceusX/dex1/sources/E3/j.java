package E3;

final class j implements Runnable {

    final l f1081d;

    j(l lVar, i iVar) {
        this.f1081d = lVar;
    }

    @Override
    public final void run() {
        long jA = this.f1081d.a();
        if (jA == -1 || v3.h.c().a() <= jA) {
            return;
        }
        l.f(this.f1081d.f1083a);
    }
}
