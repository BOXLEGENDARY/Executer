package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C1841c {

    private C1833b f15112a;

    private C1833b f15113b;

    private final List<C1833b> f15114c;

    public C1841c() {
        this.f15112a = new C1833b(BuildConfig.FLAVOR, 0L, null);
        this.f15113b = new C1833b(BuildConfig.FLAVOR, 0L, null);
        this.f15114c = new ArrayList();
    }

    public final C1833b a() {
        return this.f15112a;
    }

    public final C1833b b() {
        return this.f15113b;
    }

    public final List<C1833b> c() {
        return this.f15114c;
    }

    public final Object clone() throws CloneNotSupportedException {
        C1841c c1841c = new C1841c(this.f15112a.clone());
        Iterator<C1833b> it = this.f15114c.iterator();
        while (it.hasNext()) {
            c1841c.f15114c.add(it.next().clone());
        }
        return c1841c;
    }

    public final void d(C1833b c1833b) {
        this.f15112a = c1833b;
        this.f15113b = c1833b.clone();
        this.f15114c.clear();
    }

    public final void e(String str, long j7, Map<String, Object> map) {
        this.f15114c.add(new C1833b(str, j7, map));
    }

    public final void f(C1833b c1833b) {
        this.f15113b = c1833b;
    }

    public C1841c(C1833b c1833b) {
        this.f15112a = c1833b;
        this.f15113b = c1833b.clone();
        this.f15114c = new ArrayList();
    }
}
