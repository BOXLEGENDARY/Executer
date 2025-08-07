package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AbstractC1905k implements r, InterfaceC1929n {

    protected final String f15197d;

    protected final Map<String, r> f15198e = new HashMap();

    public AbstractC1905k(String str) {
        this.f15197d = str;
    }

    @Override
    public final r D(String str) {
        return this.f15198e.containsKey(str) ? this.f15198e.get(str) : r.f15282g;
    }

    public abstract r a(T1 t1, List<r> list);

    public final String b() {
        return this.f15197d;
    }

    @Override
    public r d() {
        return this;
    }

    @Override
    public final String e() {
        return this.f15197d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1905k)) {
            return false;
        }
        AbstractC1905k abstractC1905k = (AbstractC1905k) obj;
        String str = this.f15197d;
        if (str != null) {
            return str.equals(abstractC1905k.f15197d);
        }
        return false;
    }

    @Override
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override
    public final Boolean g() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        String str = this.f15197d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override
    public final Iterator<r> j() {
        return C1913l.b(this.f15198e);
    }

    @Override
    public final void k(String str, r rVar) {
        if (rVar == null) {
            this.f15198e.remove(str);
        } else {
            this.f15198e.put(str, rVar);
        }
    }

    @Override
    public final r l(String str, T1 t1, List<r> list) {
        return "toString".equals(str) ? new C1992v(this.f15197d) : C1913l.a(this, new C1992v(str), t1, list);
    }

    @Override
    public final boolean l0(String str) {
        return this.f15198e.containsKey(str);
    }
}
