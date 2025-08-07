package D4;

final class c0 implements Runnable {

    final AbstractC0374e f935d;

    final int f936e;

    final int f937i;

    final d0 f938v;

    c0(d0 d0Var, AbstractC0374e abstractC0374e, int i7, int i8) {
        this.f938v = d0Var;
        this.f935d = abstractC0374e;
        this.f936e = i7;
        this.f937i = i8;
    }

    @Override
    public final void run() {
        d0 d0Var = this.f938v;
        AbstractC0374e abstractC0374e = this.f935d;
        d0Var.j(new C0376g(abstractC0374e.h(), this.f936e, this.f937i, abstractC0374e.a(), abstractC0374e.j(), abstractC0374e.l(), abstractC0374e.k(), abstractC0374e.g(), abstractC0374e.m()));
    }
}
