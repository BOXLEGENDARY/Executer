package com.google.android.gms.internal.play_billing;

public final class o5 {

    Object f16110a;

    r5 f16111b;

    private t5 f16112c = t5.j();

    private boolean f16113d;

    o5() {
    }

    final void a() {
        this.f16110a = null;
        this.f16111b = null;
        this.f16112c.d(null);
    }

    public final boolean b(Object obj) {
        this.f16113d = true;
        r5 r5Var = this.f16111b;
        boolean z7 = r5Var != null && r5Var.a(obj);
        if (z7) {
            this.f16110a = null;
            this.f16111b = null;
            this.f16112c = null;
        }
        return z7;
    }

    protected final void finalize() {
        t5 t5Var;
        r5 r5Var = this.f16111b;
        if (r5Var != null && !r5Var.isDone()) {
            r5Var.b(new p5("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f16110a))));
        }
        if (this.f16113d || (t5Var = this.f16112c) == null) {
            return;
        }
        t5Var.d(null);
    }
}
