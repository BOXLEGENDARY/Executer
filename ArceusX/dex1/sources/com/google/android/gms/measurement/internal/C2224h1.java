package com.google.android.gms.measurement.internal;

public final class C2224h1 {

    private final int f16814a;

    private final boolean f16815b;

    private final boolean f16816c;

    final C2234j1 f16817d;

    C2224h1(C2234j1 c2234j1, int i7, boolean z7, boolean z8) {
        this.f16817d = c2234j1;
        this.f16814a = i7;
        this.f16815b = z7;
        this.f16816c = z8;
    }

    public final void a(String str) {
        this.f16817d.F(this.f16814a, this.f16815b, this.f16816c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f16817d.F(this.f16814a, this.f16815b, this.f16816c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f16817d.F(this.f16814a, this.f16815b, this.f16816c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f16817d.F(this.f16814a, this.f16815b, this.f16816c, str, obj, obj2, obj3);
    }
}
