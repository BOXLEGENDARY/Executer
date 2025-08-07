package G6;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.InterfaceC1700n;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.FragmentManager;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.H;
import com.roblox.client.I;
import com.roblox.client.J;
import com.roblox.client.L;
import com.roblox.client.N;
import com.roblox.client.P;
import com.roblox.client.X;
import com.roblox.client.a0;
import h7.l;
import h7.n;
import l6.C2549e;
import l6.C2552h;

public class e extends G6.a {

    private String f1451b;

    private e7.c f1452c;

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) throws Resources.NotFoundException {
            e.this.f();
        }
    }

    static class b {

        static final int[] f1454a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f1454a = iArr;
            try {
                iArr[e7.f.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1454a[e7.f.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1454a[e7.f.v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(X x7, String str) {
        super(x7.getActivity());
        this.f1451b = str;
        this.f1452c = new e7.g();
    }

    private int c(e7.f fVar) {
        return b.f1454a[fVar.ordinal()] != 1 ? N.f19693b : N.f19692a;
    }

    private int d(e7.f fVar) {
        return I.f19482y;
    }

    public MenuItem e(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(L.f19577b, menu);
        MenuItem menuItemFindItem = menu.findItem(J.f19516b);
        View actionView = menuItemFindItem.getActionView();
        actionView.setOnClickListener(new a());
        ((ImageView) actionView.findViewById(J.f19489B)).setImageResource(d(this.f1452c.getTheme()));
        return menuItemFindItem;
    }

    public void f() throws Resources.NotFoundException {
        g(null);
    }

    public void g(InterfaceC1700n interfaceC1700n) throws Resources.NotFoundException {
        String strD0;
        int iB;
        if (a()) {
            ActivityC1663h activityC1663h = this.f1437a;
            if (activityC1663h == null || activityC1663h.isFinishing() || this.f1437a.getSupportFragmentManager().Q0()) {
                E6.h.b().p("robux_menuoption_attempt_after_state_save");
                return;
            }
            if (n.i() && j6.d.a().g()) {
                iB = this.f1437a.getResources().getDimensionPixelSize(H.f19455e);
                strD0 = BuildConfig.FLAVOR;
            } else {
                strD0 = a0.D0();
                iB = b();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("showRobux", true);
            ActivityC1663h activityC1663h2 = this.f1437a;
            int i7 = J.f19534k;
            if (activityC1663h2.findViewById(i7) == null) {
                E6.h.b().p("robux_menuoption_no_container_for_purchase");
            }
            FragmentManager supportFragmentManager = this.f1437a.getSupportFragmentManager();
            if (this.f1437a.findViewById(i7) != null) {
                C2552h c2552h = new C2552h();
                c2552h.setArguments(bundle);
                c2552h.V(strD0);
                if (interfaceC1700n != null) {
                    c2552h.getLifecycle().a(interfaceC1700n);
                }
                if (supportFragmentManager.Q0()) {
                    E6.h.b().p("robux_menuoption_committed_after_state_save");
                    l.d("RobuxMenuOption", "State has already been saved. Attempting to show premium fragment, allowing state loss.");
                }
                supportFragmentManager.p().f("robuxPurchase").b(i7, c2552h, "dialog").h();
            } else {
                bundle.putInt("dialogHeight", iB);
                C2549e c2549e = new C2549e();
                c2549e.setArguments(bundle);
                c2549e.a0(strD0);
                c2549e.setStyle(1, c(this.f1452c.getTheme()));
                if (interfaceC1700n != null) {
                    c2549e.getLifecycle().a(interfaceC1700n);
                }
                if (supportFragmentManager.Q0()) {
                    E6.h.b().p("robux_menuoption_not_shown_after_state_save");
                    l.d("RobuxMenuOption", "State has already been saved. Do not show premium dialog fragment.");
                } else {
                    c2549e.show(supportFragmentManager, "dialog");
                }
            }
            P.d("nativeMain", "robux", this.f1451b);
        }
    }
}
