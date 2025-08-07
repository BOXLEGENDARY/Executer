package D4;

import E4.C0401g;
import E4.k0;
import E4.r0;
import a4.C1574k;
import a4.C1576m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class C {

    private static final r0 f893c = new r0("SplitInstallService");

    private static final Intent f894d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    private final String f895a;

    C0401g f896b;

    C(Context context, String str) {
        this.f895a = str;
        if (E4.Q.a(context)) {
            this.f896b = new C0401g(E4.N.a(context), f893c, "SplitInstallService", f894d, r.f974a, null);
        }
    }

    static Bundle b(k0 k0Var) {
        Bundle bundleK = k();
        bundleK.putParcelableArrayList("event_timestamps", new ArrayList<>(k0Var.a()));
        return bundleK;
    }

    static ArrayList i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static ArrayList j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    private static Task l() {
        f893c.b("onError(%d)", -14);
        return C1576m.e(new C0370a(-14));
    }

    public final Task c(int i7) {
        if (this.f896b == null) {
            return l();
        }
        f893c.d("cancelInstall(%d)", Integer.valueOf(i7));
        C1574k c1574k = new C1574k();
        this.f896b.s(new C0390v(this, c1574k, i7, c1574k), c1574k);
        return c1574k.a();
    }

    public final Task d(List list) {
        if (this.f896b == null) {
            return l();
        }
        f893c.d("deferredInstall(%s)", list);
        C1574k c1574k = new C1574k();
        this.f896b.s(new C0389u(this, c1574k, list, c1574k), c1574k);
        return c1574k.a();
    }

    public final Task e(List list) {
        if (this.f896b == null) {
            return l();
        }
        f893c.d("deferredUninstall(%s)", list);
        C1574k c1574k = new C1574k();
        this.f896b.s(new C0388t(this, c1574k, list, c1574k), c1574k);
        return c1574k.a();
    }

    public final Task f(Collection collection, Collection collection2, k0 k0Var) {
        if (this.f896b == null) {
            return l();
        }
        f893c.d("startInstall(%s,%s)", collection, collection2);
        C1574k c1574k = new C1574k();
        this.f896b.s(new C0387s(this, c1574k, collection, collection2, k0Var, c1574k), c1574k);
        return c1574k.a();
    }
}
