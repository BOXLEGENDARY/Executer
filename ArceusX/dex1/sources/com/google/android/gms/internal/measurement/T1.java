package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class T1 {

    public final T1 f15032a;

    final C2024z f15033b;

    final Map<String, r> f15034c = new HashMap();

    final Map<String, Boolean> f15035d = new HashMap();

    public T1(T1 t1, C2024z c2024z) {
        this.f15032a = t1;
        this.f15033b = c2024z;
    }

    public final T1 a() {
        return new T1(this, this.f15033b);
    }

    public final r b(r rVar) {
        return this.f15033b.a(this, rVar);
    }

    public final r c(C1865f c1865f) {
        r rVarA = r.f15282g;
        Iterator<Integer> itQ = c1865f.q();
        while (itQ.hasNext()) {
            rVarA = this.f15033b.a(this, c1865f.o(itQ.next().intValue()));
            if (rVarA instanceof C1881h) {
                break;
            }
        }
        return rVarA;
    }

    public final r d(String str) {
        if (this.f15034c.containsKey(str)) {
            return this.f15034c.get(str);
        }
        T1 t1 = this.f15032a;
        if (t1 != null) {
            return t1.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, r rVar) {
        if (this.f15035d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            this.f15034c.remove(str);
        } else {
            this.f15034c.put(str, rVar);
        }
    }

    public final void f(String str, r rVar) {
        e(str, rVar);
        this.f15035d.put(str, Boolean.TRUE);
    }

    public final void g(String str, r rVar) {
        T1 t1;
        if (!this.f15034c.containsKey(str) && (t1 = this.f15032a) != null && t1.h(str)) {
            this.f15032a.g(str, rVar);
        } else {
            if (this.f15035d.containsKey(str)) {
                return;
            }
            if (rVar == null) {
                this.f15034c.remove(str);
            } else {
                this.f15034c.put(str, rVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.f15034c.containsKey(str)) {
            return true;
        }
        T1 t1 = this.f15032a;
        if (t1 != null) {
            return t1.h(str);
        }
        return false;
    }
}
