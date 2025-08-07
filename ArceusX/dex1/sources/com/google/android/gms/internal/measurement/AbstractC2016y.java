package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractC2016y {

    final List<O> f15378a = new ArrayList();

    protected AbstractC2016y() {
    }

    public abstract r a(String str, T1 t1, List<r> list);

    final r b(String str) {
        if (!this.f15378a.contains(C1987u2.e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        String strValueOf = String.valueOf(str);
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Command not implemented: ".concat(strValueOf) : new String("Command not implemented: "));
    }
}
