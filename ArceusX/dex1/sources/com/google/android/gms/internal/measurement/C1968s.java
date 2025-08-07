package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C1968s implements r {

    private final String f15301d;

    private final ArrayList<r> f15302e;

    public C1968s(String str, List<r> list) {
        this.f15301d = str;
        ArrayList<r> arrayList = new ArrayList<>();
        this.f15302e = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f15301d;
    }

    public final ArrayList<r> b() {
        return this.f15302e;
    }

    @Override
    public final r d() {
        return this;
    }

    @Override
    public final String e() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1968s)) {
            return false;
        }
        C1968s c1968s = (C1968s) obj;
        String str = this.f15301d;
        if (str == null ? c1968s.f15301d == null : str.equals(c1968s.f15301d)) {
            return this.f15302e.equals(c1968s.f15302e);
        }
        return false;
    }

    @Override
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override
    public final Boolean g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final int hashCode() {
        String str = this.f15301d;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f15302e.hashCode();
    }

    @Override
    public final Iterator<r> j() {
        return null;
    }

    @Override
    public final r l(String str, T1 t1, List<r> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
