package G6;

import E6.c;
import android.app.Activity;
import android.view.InterfaceC1700n;
import androidx.fragment.app.ActivityC1663h;
import com.roblox.client.B;
import com.roblox.client.P;
import com.roblox.client.X;

public class c {

    private X f1439a;

    class a implements B.d {

        final ActivityC1663h f1440a;

        a(ActivityC1663h activityC1663h) {
            this.f1440a = activityC1663h;
        }

        @Override
        public void a() {
            c.this.b(this.f1440a);
        }
    }

    public interface b {
        void a();
    }

    public c(X x7) {
        this.f1439a = x7;
    }

    public void b(Activity activity) {
        if (activity != null) {
            E6.c.e().h(activity, c.d.LOGOUT_BY_USER_IN_NATIVE);
        }
    }

    public void c(InterfaceC1700n interfaceC1700n) {
        if (this.f1439a == null) {
            return;
        }
        P.r("logout");
        ActivityC1663h activity = this.f1439a.getActivity();
        B b2 = new B();
        b2.setStyle(2, 0);
        if (interfaceC1700n != null) {
            b2.getLifecycle().a(interfaceC1700n);
        }
        b2.y(new a(activity));
        b2.show(activity.getSupportFragmentManager(), "dialog");
    }
}
