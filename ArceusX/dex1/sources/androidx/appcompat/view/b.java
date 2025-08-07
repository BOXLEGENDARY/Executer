package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {

    private Object f8798d;

    private boolean f8799e;

    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f8798d;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f8799e;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i7);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f8798d = obj;
    }

    public abstract void q(int i7);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z7) {
        this.f8799e = z7;
    }
}
