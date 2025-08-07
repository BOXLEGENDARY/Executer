package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class C1881h implements r {

    private final r f15171d;

    private final String f15172e;

    public C1881h(String str) {
        this.f15171d = r.f15282g;
        this.f15172e = str;
    }

    public final r a() {
        return this.f15171d;
    }

    public final String b() {
        return this.f15172e;
    }

    @Override
    public final r d() {
        return new C1881h(this.f15172e, this.f15171d.d());
    }

    @Override
    public final String e() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1881h)) {
            return false;
        }
        C1881h c1881h = (C1881h) obj;
        return this.f15172e.equals(c1881h.f15172e) && this.f15171d.equals(c1881h.f15171d);
    }

    @Override
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override
    public final Boolean g() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final int hashCode() {
        return (this.f15172e.hashCode() * 31) + this.f15171d.hashCode();
    }

    @Override
    public final Iterator<r> j() {
        return null;
    }

    @Override
    public final r l(String str, T1 t1, List<r> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C1881h(String str, r rVar) {
        this.f15171d = rVar;
        this.f15172e = str;
    }

    public C1881h() {
        throw null;
    }
}
