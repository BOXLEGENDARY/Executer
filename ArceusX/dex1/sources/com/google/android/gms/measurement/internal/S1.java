package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import n3.C2651i;

final class S1 {

    private long f16481A;

    private long f16482B;

    private String f16483C;

    private boolean f16484D;

    private long f16485E;

    private long f16486F;

    private final N1 f16487a;

    private final String f16488b;

    private String f16489c;

    private String f16490d;

    private String f16491e;

    private String f16492f;

    private long f16493g;

    private long f16494h;

    private long f16495i;

    private String f16496j;

    private long f16497k;

    private String f16498l;

    private long f16499m;

    private long f16500n;

    private boolean f16501o;

    private long f16502p;

    private boolean f16503q;

    private String f16504r;

    private Boolean f16505s;

    private long f16506t;

    private List<String> f16507u;

    private String f16508v;

    private long f16509w;

    private long f16510x;

    private long f16511y;

    private long f16512z;

    S1(N1 n1, String str) {
        C2651i.l(n1);
        C2651i.f(str);
        this.f16487a = n1;
        this.f16488b = str;
        n1.a().h();
    }

    public final long A() {
        this.f16487a.a().h();
        return this.f16502p;
    }

    public final void B(String str) {
        this.f16487a.a().h();
        this.f16484D |= !i4.Z(this.f16483C, str);
        this.f16483C = str;
    }

    public final void C(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16495i != j7;
        this.f16495i = j7;
    }

    public final void D(long j7) {
        C2651i.a(j7 >= 0);
        this.f16487a.a().h();
        this.f16484D |= this.f16493g != j7;
        this.f16493g = j7;
    }

    public final void E(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16494h != j7;
        this.f16494h = j7;
    }

    public final void F(boolean z7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16501o != z7;
        this.f16501o = z7;
    }

    public final void G(Boolean bool) {
        this.f16487a.a().h();
        boolean z7 = this.f16484D;
        Boolean bool2 = this.f16505s;
        int i7 = i4.f16838i;
        this.f16484D = z7 | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.f16505s = bool;
    }

    public final void H(String str) {
        this.f16487a.a().h();
        this.f16484D |= !i4.Z(this.f16491e, str);
        this.f16491e = str;
    }

    public final void I(List<String> list) {
        this.f16487a.a().h();
        List<String> list2 = this.f16507u;
        int i7 = i4.f16838i;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.f16484D = true;
        this.f16507u = list != null ? new ArrayList(list) : null;
    }

    public final boolean J() {
        this.f16487a.a().h();
        return this.f16503q;
    }

    public final boolean K() {
        this.f16487a.a().h();
        return this.f16501o;
    }

    public final boolean L() {
        this.f16487a.a().h();
        return this.f16484D;
    }

    public final long M() {
        this.f16487a.a().h();
        return this.f16497k;
    }

    public final long N() {
        this.f16487a.a().h();
        return this.f16485E;
    }

    public final long O() {
        this.f16487a.a().h();
        return this.f16512z;
    }

    public final long P() {
        this.f16487a.a().h();
        return this.f16481A;
    }

    public final long Q() {
        this.f16487a.a().h();
        return this.f16511y;
    }

    public final long R() {
        this.f16487a.a().h();
        return this.f16510x;
    }

    public final long S() {
        this.f16487a.a().h();
        return this.f16482B;
    }

    public final long T() {
        this.f16487a.a().h();
        return this.f16509w;
    }

    public final long U() {
        this.f16487a.a().h();
        return this.f16500n;
    }

    public final long V() {
        this.f16487a.a().h();
        return this.f16506t;
    }

    public final long W() {
        this.f16487a.a().h();
        return this.f16486F;
    }

    public final long X() {
        this.f16487a.a().h();
        return this.f16499m;
    }

    public final long Y() {
        this.f16487a.a().h();
        return this.f16495i;
    }

    public final long Z() {
        this.f16487a.a().h();
        return this.f16493g;
    }

    public final String a() {
        this.f16487a.a().h();
        return this.f16483C;
    }

    public final long a0() {
        this.f16487a.a().h();
        return this.f16494h;
    }

    public final String b() {
        this.f16487a.a().h();
        return this.f16491e;
    }

    public final Boolean b0() {
        this.f16487a.a().h();
        return this.f16505s;
    }

    public final List<String> c() {
        this.f16487a.a().h();
        return this.f16507u;
    }

    public final String c0() {
        this.f16487a.a().h();
        return this.f16504r;
    }

    public final void d() {
        this.f16487a.a().h();
        this.f16484D = false;
    }

    public final String d0() {
        this.f16487a.a().h();
        String str = this.f16483C;
        B(null);
        return str;
    }

    public final void e() {
        this.f16487a.a().h();
        long j7 = this.f16493g + 1;
        if (j7 > 2147483647L) {
            this.f16487a.b().w().b("Bundle index overflow. appId", C2234j1.z(this.f16488b));
            j7 = 0;
        }
        this.f16484D = true;
        this.f16493g = j7;
    }

    public final String e0() {
        this.f16487a.a().h();
        return this.f16488b;
    }

    public final void f(String str) {
        this.f16487a.a().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16484D |= true ^ i4.Z(this.f16504r, str);
        this.f16504r = str;
    }

    public final String f0() {
        this.f16487a.a().h();
        return this.f16489c;
    }

    public final void g(boolean z7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16503q != z7;
        this.f16503q = z7;
    }

    public final String g0() {
        this.f16487a.a().h();
        return this.f16498l;
    }

    public final void h(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16502p != j7;
        this.f16502p = j7;
    }

    public final String h0() {
        this.f16487a.a().h();
        return this.f16496j;
    }

    public final void i(String str) {
        this.f16487a.a().h();
        this.f16484D |= !i4.Z(this.f16489c, str);
        this.f16489c = str;
    }

    public final String i0() {
        this.f16487a.a().h();
        return this.f16492f;
    }

    public final void j(String str) {
        this.f16487a.a().h();
        this.f16484D |= !i4.Z(this.f16498l, str);
        this.f16498l = str;
    }

    public final String j0() {
        this.f16487a.a().h();
        return this.f16508v;
    }

    public final void k(String str) {
        this.f16487a.a().h();
        this.f16484D |= !i4.Z(this.f16496j, str);
        this.f16496j = str;
    }

    public final String k0() {
        this.f16487a.a().h();
        return this.f16490d;
    }

    public final void l(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16497k != j7;
        this.f16497k = j7;
    }

    public final void m(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16485E != j7;
        this.f16485E = j7;
    }

    public final void n(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16512z != j7;
        this.f16512z = j7;
    }

    public final void o(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16481A != j7;
        this.f16481A = j7;
    }

    public final void p(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16511y != j7;
        this.f16511y = j7;
    }

    public final void q(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16510x != j7;
        this.f16510x = j7;
    }

    public final void r(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16482B != j7;
        this.f16482B = j7;
    }

    public final void s(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16509w != j7;
        this.f16509w = j7;
    }

    public final void t(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16500n != j7;
        this.f16500n = j7;
    }

    public final void u(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16506t != j7;
        this.f16506t = j7;
    }

    public final void v(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16486F != j7;
        this.f16486F = j7;
    }

    public final void w(String str) {
        this.f16487a.a().h();
        this.f16484D |= !i4.Z(this.f16492f, str);
        this.f16492f = str;
    }

    public final void x(String str) {
        this.f16487a.a().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16484D |= true ^ i4.Z(this.f16508v, str);
        this.f16508v = str;
    }

    public final void y(String str) {
        this.f16487a.a().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f16484D |= true ^ i4.Z(this.f16490d, str);
        this.f16490d = str;
    }

    public final void z(long j7) {
        this.f16487a.a().h();
        this.f16484D |= this.f16499m != j7;
        this.f16499m = j7;
    }
}
