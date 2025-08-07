package com.google.android.gms.internal.play_billing;

final class q5 extends n5 {

    final r5 f16141A;

    q5(r5 r5Var) {
        this.f16141A = r5Var;
    }

    @Override
    protected final String a() {
        o5 o5Var = (o5) this.f16141A.f16145d.get();
        if (o5Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(o5Var.f16110a) + "]";
    }
}
