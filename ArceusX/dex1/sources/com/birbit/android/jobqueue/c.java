package com.birbit.android.jobqueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class c {

    private int f13677a;

    private f2.f f13678b;

    private final Set<String> f13679c = new HashSet();

    private final List<String> f13680d = new ArrayList();

    private final List<String> f13681e = new ArrayList();

    private boolean f13682f;

    private Long f13683g;

    private long f13684h;

    void a() {
        this.f13677a = 2;
        this.f13678b = null;
        this.f13679c.clear();
        this.f13680d.clear();
        this.f13681e.clear();
        this.f13682f = false;
        this.f13683g = null;
        this.f13684h = Long.MIN_VALUE;
    }

    public boolean b() {
        return this.f13682f;
    }

    public List<String> c() {
        return this.f13680d;
    }

    public List<String> d() {
        return this.f13681e;
    }

    public int e() {
        return this.f13677a;
    }

    public long f() {
        return this.f13684h;
    }

    public f2.f g() {
        return this.f13678b;
    }

    public Set<String> h() {
        return this.f13679c;
    }

    public Long i() {
        return this.f13683g;
    }

    void j(Collection<String> collection) {
        this.f13680d.clear();
        if (collection != null) {
            this.f13680d.addAll(collection);
        }
    }

    void k(Collection<String> collection) {
        this.f13681e.clear();
        if (collection != null) {
            this.f13681e.addAll(collection);
        }
    }

    void l(boolean z7) {
        this.f13682f = z7;
    }

    void m(int i7) {
        this.f13677a = i7;
    }

    public void n(long j7) {
        this.f13684h = j7;
    }

    void o(f2.f fVar) {
        this.f13678b = fVar;
    }

    void p(String[] strArr) {
        this.f13679c.clear();
        if (strArr != null) {
            Collections.addAll(this.f13679c, strArr);
        }
    }

    void q(Long l7) {
        this.f13683g = l7;
    }
}
