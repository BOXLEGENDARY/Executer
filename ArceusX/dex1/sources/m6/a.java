package M6;

import android.app.Activity;
import com.android.billingclient.api.AbstractC1758b;
import com.android.billingclient.api.C1760d;
import com.android.billingclient.api.C1761e;
import com.android.billingclient.api.C1764h;
import com.android.billingclient.api.Purchase;
import e2.C2412a;
import e2.C2415d;
import e2.InterfaceC2413b;
import e2.InterfaceC2414c;
import e2.InterfaceC2416e;
import e2.InterfaceC2417f;
import e2.InterfaceC2418g;
import java.util.List;

public class a implements l {

    private AbstractC1758b f2378a;

    public static Long k(Purchase purchase) {
        if (purchase.a() != null && purchase.a().b() != null) {
            try {
                return Long.valueOf(Long.parseLong(purchase.a().b()));
            } catch (NumberFormatException e7) {
                h7.l.d("rbx.purchaseflow", "parsing obfuscatedProfileId failed: " + e7);
            }
        }
        return null;
    }

    public static String l(Purchase purchase) {
        List<String> listE = purchase.e();
        if (listE.size() > 0) {
            return listE.get(0);
        }
        return null;
    }

    @Override
    public C1761e a(String str) {
        return this.f2378a.c(str);
    }

    @Override
    public void b(e2.k kVar, e2.h hVar) {
        this.f2378a.i(kVar, hVar);
    }

    @Override
    public void c(C2415d c2415d, InterfaceC2416e interfaceC2416e) {
        this.f2378a.b(c2415d, interfaceC2416e);
    }

    @Override
    public void d(C2412a c2412a, InterfaceC2413b interfaceC2413b) {
        this.f2378a.a(c2412a, interfaceC2413b);
    }

    @Override
    public boolean e() {
        return this.f2378a.d();
    }

    @Override
    public void f(C1764h c1764h, InterfaceC2417f interfaceC2417f) {
        this.f2378a.g(c1764h, interfaceC2417f);
    }

    @Override
    public void g(AbstractC1758b abstractC1758b) {
        this.f2378a = abstractC1758b;
    }

    @Override
    public void h(InterfaceC2414c interfaceC2414c) {
        this.f2378a.j(interfaceC2414c);
    }

    @Override
    public C1761e i(Activity activity, C1760d c1760d) {
        return this.f2378a.e(activity, c1760d);
    }

    @Override
    public void j(e2.j jVar, InterfaceC2418g interfaceC2418g) {
        this.f2378a.h(jVar, interfaceC2418g);
    }
}
