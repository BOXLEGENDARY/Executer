package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class g7 extends AbstractC1905k {

    private final Callable<Object> f15170i;

    public g7(String str, Callable<Object> callable) {
        super("internal.appMetadata");
        this.f15170i = callable;
    }

    @Override
    public final r a(T1 t1, List<r> list) {
        try {
            return V2.b(this.f15170i.call());
        } catch (Exception unused) {
            return r.f15282g;
        }
    }
}
