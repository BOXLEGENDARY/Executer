package com.google.android.gms.internal.measurement;

import java.util.List;

public final class f7 extends AbstractC1905k {

    private final d7 f15160i;

    public f7(d7 d7Var) {
        super("internal.logger");
        this.f15160i = d7Var;
        this.f15198e.put("log", new e7(this, false, true));
        this.f15198e.put("silent", new C2031z6(this, "silent"));
        ((AbstractC1905k) this.f15198e.get("silent")).k("log", new e7(this, true, true));
        this.f15198e.put("unmonitored", new a7(this, "unmonitored"));
        ((AbstractC1905k) this.f15198e.get("unmonitored")).k("log", new e7(this, false, false));
    }

    @Override
    public final r a(T1 t1, List<r> list) {
        return r.f15282g;
    }
}
