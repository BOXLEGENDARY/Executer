package G6;

import android.os.Bundle;
import android.view.InterfaceC1700n;
import androidx.fragment.app.ActivityC1663h;
import com.roblox.client.J;
import com.roblox.client.P;
import com.roblox.client.X;
import com.roblox.client.a0;
import l6.C2549e;
import l6.C2552h;

public class b extends a {

    private String f1438b;

    public b(X x7, String str) {
        super(x7.getActivity());
        this.f1438b = str;
    }

    public void c(InterfaceC1700n interfaceC1700n) {
        if (a()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("showPremium", true);
            ActivityC1663h activityC1663h = this.f1437a;
            int i7 = J.f19534k;
            if (activityC1663h.findViewById(i7) == null) {
                E6.h.b().p("robux_buildsclub_no_container_for_purchase");
            }
            if (this.f1437a.findViewById(i7) != null) {
                C2552h c2552h = new C2552h();
                if (interfaceC1700n != null) {
                    c2552h.getLifecycle().a(interfaceC1700n);
                }
                c2552h.setArguments(bundle);
                c2552h.V(a0.q());
                this.f1437a.getSupportFragmentManager().p().f("robuxPurchase").b(i7, c2552h, "dialog").g();
            } else {
                bundle.putInt("dialogHeight", b());
                C2549e c2549e = new C2549e();
                if (interfaceC1700n != null) {
                    c2549e.getLifecycle().a(interfaceC1700n);
                }
                c2549e.setArguments(bundle);
                c2549e.a0(a0.q());
                c2549e.setStyle(1, c2549e.getTheme());
                c2549e.show(this.f1437a.getSupportFragmentManager(), "dialog");
            }
            P.d("nativeMain", "buildersClub", this.f1438b);
        }
    }
}
