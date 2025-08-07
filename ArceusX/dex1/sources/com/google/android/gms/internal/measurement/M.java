package com.google.android.gms.internal.measurement;

import java.util.List;

public final class M extends AbstractC2016y {
    @Override
    public final r a(String str, T1 t1, List<r> list) {
        if (str == null || str.isEmpty() || !t1.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        r rVarD = t1.d(str);
        if (rVarD instanceof AbstractC1905k) {
            return ((AbstractC1905k) rVarD).a(t1, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
