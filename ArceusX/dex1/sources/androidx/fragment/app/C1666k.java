package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

public class C1666k {

    private final m<?> f11207a;

    private C1666k(m<?> mVar) {
        this.f11207a = mVar;
    }

    public static C1666k b(m<?> mVar) {
        return new C1666k((m) x0.g.h(mVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        m<?> mVar = this.f11207a;
        mVar.f11213w.n(mVar, mVar, fragment);
    }

    public void c() {
        this.f11207a.f11213w.z();
    }

    public boolean d(MenuItem menuItem) {
        return this.f11207a.f11213w.C(menuItem);
    }

    public void e() {
        this.f11207a.f11213w.D();
    }

    public void f() {
        this.f11207a.f11213w.F();
    }

    public void g() {
        this.f11207a.f11213w.O();
    }

    public void h() {
        this.f11207a.f11213w.S();
    }

    public void i() {
        this.f11207a.f11213w.T();
    }

    public void j() {
        this.f11207a.f11213w.V();
    }

    public boolean k() {
        return this.f11207a.f11213w.c0(true);
    }

    public FragmentManager l() {
        return this.f11207a.f11213w;
    }

    public void m() {
        this.f11207a.f11213w.a1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f11207a.f11213w.x0().onCreateView(view, str, context, attributeSet);
    }
}
