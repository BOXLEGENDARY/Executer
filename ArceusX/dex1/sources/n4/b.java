package n4;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class b {

    private final View f22300a;

    private boolean f22301b = false;

    private int f22302c = 0;

    public b(InterfaceC2669a interfaceC2669a) {
        this.f22300a = (View) interfaceC2669a;
    }

    private void a() {
        ViewParent parent = this.f22300a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f22300a);
        }
    }

    public int b() {
        return this.f22302c;
    }

    public boolean c() {
        return this.f22301b;
    }

    public void d(Bundle bundle) {
        this.f22301b = bundle.getBoolean("expanded", false);
        this.f22302c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f22301b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f22301b);
        bundle.putInt("expandedComponentIdHint", this.f22302c);
        return bundle;
    }

    public void f(int i7) {
        this.f22302c = i7;
    }
}
