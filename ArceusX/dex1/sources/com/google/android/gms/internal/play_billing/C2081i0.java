package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class C2081i0 {

    private final List f16068a = new ArrayList();

    public final C2081i0 a(C2176y0 c2176y0) {
        if (c2176y0.d()) {
            throw new IllegalArgumentException(C2151u.a("range must not be empty, but was %s", c2176y0));
        }
        this.f16068a.add(c2176y0);
        return this;
    }

    final C2081i0 b(C2081i0 c2081i0) {
        Iterator it = c2081i0.f16068a.iterator();
        while (it.hasNext()) {
            a((C2176y0) it.next());
        }
        return this;
    }

    public final C2087j0 c() {
        C2033a0 c2033a0 = new C2033a0(this.f16068a.size());
        Collections.sort(this.f16068a, C2170x0.f16161d);
        Iterator it = this.f16068a.iterator();
        C2117o0 c2117o0 = it instanceof C2117o0 ? (C2117o0) it : new C2117o0(it);
        while (c2117o0.hasNext()) {
            C2176y0 c2176y0C = (C2176y0) c2117o0.next();
            while (c2117o0.hasNext()) {
                C2176y0 c2176y0 = (C2176y0) c2117o0.zza();
                if (c2176y0C.f16189d.compareTo(c2176y0.f16190e) > 0 || c2176y0.f16189d.compareTo(c2176y0C.f16190e) > 0) {
                    break;
                }
                C2145t.d(c2176y0C.b(c2176y0).d(), "Overlapping ranges not permitted but found %s overlapping %s", c2176y0C, c2176y0);
                c2176y0C = c2176y0C.c((C2176y0) c2117o0.next());
            }
            c2033a0.e(c2176y0C);
        }
        AbstractC2057e0 abstractC2057e0F = c2033a0.f();
        if (abstractC2057e0F.isEmpty()) {
            return C2087j0.c();
        }
        if (abstractC2057e0F.size() == 1) {
            O0 o0ListIterator = abstractC2057e0F.listIterator(0);
            Object next = o0ListIterator.next();
            if (o0ListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("expected one element but was: <");
                sb.append(next);
                for (int i7 = 0; i7 < 4 && o0ListIterator.hasNext(); i7++) {
                    sb.append(", ");
                    sb.append(o0ListIterator.next());
                }
                if (o0ListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            if (((C2176y0) next).equals(C2176y0.a())) {
                return C2087j0.b();
            }
        }
        return new C2087j0(abstractC2057e0F);
    }
}
