package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i7 extends AbstractC1905k {

    private final C2004w3 f15193i;

    final Map<String, AbstractC1905k> f15194v;

    public i7(C2004w3 c2004w3) {
        super("require");
        this.f15194v = new HashMap();
        this.f15193i = c2004w3;
    }

    @Override
    public final r a(T1 t1, List<r> list) throws Exception {
        AbstractC1905k abstractC1905kCall;
        C1987u2.h("require", 1, list);
        String strE = t1.b(list.get(0)).e();
        if (this.f15194v.containsKey(strE)) {
            return this.f15194v.get(strE);
        }
        C2004w3 c2004w3 = this.f15193i;
        if (c2004w3.f15367a.containsKey(strE)) {
            try {
                abstractC1905kCall = c2004w3.f15367a.get(strE).call();
            } catch (Exception unused) {
                String strValueOf = String.valueOf(strE);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Failed to create API implementation: ".concat(strValueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            abstractC1905kCall = r.f15282g;
        }
        if (abstractC1905kCall instanceof AbstractC1905k) {
            this.f15194v.put(strE, (AbstractC1905k) abstractC1905kCall);
        }
        return abstractC1905kCall;
    }
}
