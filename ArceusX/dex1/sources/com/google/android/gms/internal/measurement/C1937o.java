package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class C1937o implements r, InterfaceC1929n {

    final Map<String, r> f15218d = new HashMap();

    @Override
    public final r D(String str) {
        return this.f15218d.containsKey(str) ? this.f15218d.get(str) : r.f15282g;
    }

    public final List<String> a() {
        return new ArrayList(this.f15218d.keySet());
    }

    @Override
    public final r d() {
        C1937o c1937o = new C1937o();
        for (Map.Entry<String, r> entry : this.f15218d.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1929n) {
                c1937o.f15218d.put(entry.getKey(), entry.getValue());
            } else {
                c1937o.f15218d.put(entry.getKey(), entry.getValue().d());
            }
        }
        return c1937o;
    }

    @Override
    public final String e() {
        return "[object Object]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1937o) {
            return this.f15218d.equals(((C1937o) obj).f15218d);
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
        return this.f15218d.hashCode();
    }

    @Override
    public final Iterator<r> j() {
        return C1913l.b(this.f15218d);
    }

    @Override
    public final void k(String str, r rVar) {
        if (rVar == null) {
            this.f15218d.remove(str);
        } else {
            this.f15218d.put(str, rVar);
        }
    }

    @Override
    public r l(String str, T1 t1, List<r> list) {
        return "toString".equals(str) ? new C1992v(toString()) : C1913l.a(this, new C1992v(str), t1, list);
    }

    @Override
    public final boolean l0(String str) {
        return this.f15218d.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f15218d.isEmpty()) {
            for (String str : this.f15218d.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f15218d.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
