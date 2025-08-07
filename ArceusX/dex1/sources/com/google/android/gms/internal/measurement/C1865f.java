package com.google.android.gms.internal.measurement;

import androidx.room.kU.HguUe;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class C1865f implements Iterable<r>, r, InterfaceC1929n {

    final SortedMap<Integer, r> f15152d;

    final Map<String, r> f15153e;

    public C1865f() {
        this.f15152d = new TreeMap();
        this.f15153e = new TreeMap();
    }

    @Override
    public final r D(String str) {
        r rVar;
        return "length".equals(str) ? new C1897j(Double.valueOf(n())) : (!l0(str) || (rVar = this.f15153e.get(str)) == null) ? r.f15282g : rVar;
    }

    @Override
    public final r d() {
        C1865f c1865f = new C1865f();
        for (Map.Entry<Integer, r> entry : this.f15152d.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1929n) {
                c1865f.f15152d.put(entry.getKey(), entry.getValue());
            } else {
                c1865f.f15152d.put(entry.getKey(), entry.getValue().d());
            }
        }
        return c1865f;
    }

    @Override
    public final String e() {
        return p(HguUe.zhyaLuiyUOLtC);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1865f)) {
            return false;
        }
        C1865f c1865f = (C1865f) obj;
        if (n() != c1865f.n()) {
            return false;
        }
        if (this.f15152d.isEmpty()) {
            return c1865f.f15152d.isEmpty();
        }
        for (int iIntValue = this.f15152d.firstKey().intValue(); iIntValue <= this.f15152d.lastKey().intValue(); iIntValue++) {
            if (!o(iIntValue).equals(c1865f.o(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Double f() {
        return this.f15152d.size() == 1 ? o(0).f() : this.f15152d.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override
    public final Boolean g() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f15152d.hashCode() * 31;
    }

    @Override
    public final Iterator<r> iterator() {
        return new C1857e(this);
    }

    @Override
    public final Iterator<r> j() {
        return new C1849d(this, this.f15152d.keySet().iterator(), this.f15153e.keySet().iterator());
    }

    @Override
    public final void k(String str, r rVar) {
        if (rVar == null) {
            this.f15153e.remove(str);
        } else {
            this.f15153e.put(str, rVar);
        }
    }

    @Override
    public final r l(String str, T1 t1, List<r> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? E.a(str, this, t1, list) : C1913l.a(this, new C1992v(str), t1, list);
    }

    @Override
    public final boolean l0(String str) {
        return "length".equals(str) || this.f15153e.containsKey(str);
    }

    public final int m() {
        return this.f15152d.size();
    }

    public final int n() {
        if (this.f15152d.isEmpty()) {
            return 0;
        }
        return this.f15152d.lastKey().intValue() + 1;
    }

    public final r o(int i7) {
        r rVar;
        if (i7 < n()) {
            return (!w(i7) || (rVar = this.f15152d.get(Integer.valueOf(i7))) == null) ? r.f15282g : rVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String p(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f15152d.isEmpty()) {
            for (int i7 = 0; i7 < n(); i7++) {
                r rVarO = o(i7);
                sb.append(str);
                if (!(rVarO instanceof C2000w) && !(rVarO instanceof C1945p)) {
                    sb.append(rVarO.e());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator<Integer> q() {
        return this.f15152d.keySet().iterator();
    }

    public final List<r> r() {
        ArrayList arrayList = new ArrayList(n());
        for (int i7 = 0; i7 < n(); i7++) {
            arrayList.add(o(i7));
        }
        return arrayList;
    }

    public final void s() {
        this.f15152d.clear();
    }

    public final void t(int i7, r rVar) {
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i7);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i7 >= n()) {
            v(i7, rVar);
            return;
        }
        for (int iIntValue = this.f15152d.lastKey().intValue(); iIntValue >= i7; iIntValue--) {
            SortedMap<Integer, r> sortedMap = this.f15152d;
            Integer numValueOf = Integer.valueOf(iIntValue);
            r rVar2 = sortedMap.get(numValueOf);
            if (rVar2 != null) {
                v(iIntValue + 1, rVar2);
                this.f15152d.remove(numValueOf);
            }
        }
        v(i7, rVar);
    }

    public final String toString() {
        return p(",");
    }

    public final void u(int i7) {
        int iIntValue = this.f15152d.lastKey().intValue();
        if (i7 > iIntValue || i7 < 0) {
            return;
        }
        this.f15152d.remove(Integer.valueOf(i7));
        if (i7 == iIntValue) {
            SortedMap<Integer, r> sortedMap = this.f15152d;
            int i8 = i7 - 1;
            Integer numValueOf = Integer.valueOf(i8);
            if (sortedMap.containsKey(numValueOf) || i8 < 0) {
                return;
            }
            this.f15152d.put(numValueOf, r.f15282g);
            return;
        }
        while (true) {
            i7++;
            if (i7 > this.f15152d.lastKey().intValue()) {
                return;
            }
            SortedMap<Integer, r> sortedMap2 = this.f15152d;
            Integer numValueOf2 = Integer.valueOf(i7);
            r rVar = sortedMap2.get(numValueOf2);
            if (rVar != null) {
                this.f15152d.put(Integer.valueOf(i7 - 1), rVar);
                this.f15152d.remove(numValueOf2);
            }
        }
    }

    public final void v(int i7, r rVar) {
        if (i7 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i7);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (rVar == null) {
            this.f15152d.remove(Integer.valueOf(i7));
        } else {
            this.f15152d.put(Integer.valueOf(i7), rVar);
        }
    }

    public final boolean w(int i7) {
        if (i7 >= 0 && i7 <= this.f15152d.lastKey().intValue()) {
            return this.f15152d.containsKey(Integer.valueOf(i7));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i7);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public C1865f(List<r> list) {
        this();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                v(i7, list.get(i7));
            }
        }
    }
}
