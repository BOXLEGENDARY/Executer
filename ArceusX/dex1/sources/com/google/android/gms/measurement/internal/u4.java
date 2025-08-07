package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

final class u4 extends T3 {

    private String f17055d;

    private Set<Integer> f17056e;

    private Map<Integer, p4> f17057f;

    private Long f17058g;

    private Long f17059h;

    u4(c4 c4Var) {
        super(c4Var);
    }

    private final p4 n(Integer num) {
        if (this.f17057f.containsKey(num)) {
            return this.f17057f.get(num);
        }
        p4 p4Var = new p4(this, this.f17055d, null);
        this.f17057f.put(num, p4Var);
        return p4Var;
    }

    private final boolean o(int i7, int i8) {
        p4 p4Var = this.f17057f.get(Integer.valueOf(i7));
        if (p4Var == null) {
            return false;
        }
        return p4Var.f16967d.get(i8);
    }

    @Override
    protected final boolean l() {
        return false;
    }

    final java.util.List<com.google.android.gms.internal.measurement.D1> m(java.lang.String r66, java.util.List<com.google.android.gms.internal.measurement.H1> r67, java.util.List<com.google.android.gms.internal.measurement.C1836b2> r68, java.lang.Long r69, java.lang.Long r70) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u4.m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
