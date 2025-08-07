package androidx.fragment.app;

import android.util.Log;
import android.view.AbstractC1678L;
import android.view.C1681O;
import android.view.C1683Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class w extends AbstractC1678L {

    private static final C1681O.b f11225k = new a();

    private final boolean f11229g;

    private final HashMap<String, Fragment> f11226d = new HashMap<>();

    private final HashMap<String, w> f11227e = new HashMap<>();

    private final HashMap<String, C1683Q> f11228f = new HashMap<>();

    private boolean f11230h = false;

    private boolean f11231i = false;

    private boolean f11232j = false;

    class a implements C1681O.b {
        a() {
        }

        @Override
        public <T extends AbstractC1678L> T a(Class<T> cls) {
            return new w(true);
        }
    }

    w(boolean z7) {
        this.f11229g = z7;
    }

    private void i(String str) {
        w wVar = this.f11227e.get(str);
        if (wVar != null) {
            wVar.d();
            this.f11227e.remove(str);
        }
        C1683Q c1683q = this.f11228f.get(str);
        if (c1683q != null) {
            c1683q.a();
            this.f11228f.remove(str);
        }
    }

    static w l(C1683Q c1683q) {
        return (w) new C1681O(c1683q, f11225k).a(w.class);
    }

    @Override
    protected void d() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f11230h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f11226d.equals(wVar.f11226d) && this.f11227e.equals(wVar.f11227e) && this.f11228f.equals(wVar.f11228f);
    }

    void f(Fragment fragment) {
        if (this.f11232j) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f11226d.containsKey(fragment.mWho)) {
                return;
            }
            this.f11226d.put(fragment.mWho, fragment);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    void g(Fragment fragment) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.mWho);
    }

    void h(String str) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f11226d.hashCode() * 31) + this.f11227e.hashCode()) * 31) + this.f11228f.hashCode();
    }

    Fragment j(String str) {
        return this.f11226d.get(str);
    }

    w k(Fragment fragment) {
        w wVar = this.f11227e.get(fragment.mWho);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.f11229g);
        this.f11227e.put(fragment.mWho, wVar2);
        return wVar2;
    }

    Collection<Fragment> m() {
        return new ArrayList(this.f11226d.values());
    }

    C1683Q n(Fragment fragment) {
        C1683Q c1683q = this.f11228f.get(fragment.mWho);
        if (c1683q != null) {
            return c1683q;
        }
        C1683Q c1683q2 = new C1683Q();
        this.f11228f.put(fragment.mWho, c1683q2);
        return c1683q2;
    }

    boolean o() {
        return this.f11230h;
    }

    void p(Fragment fragment) {
        if (this.f11232j) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f11226d.remove(fragment.mWho) == null || !FragmentManager.J0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void q(boolean z7) {
        this.f11232j = z7;
    }

    boolean r(Fragment fragment) {
        if (this.f11226d.containsKey(fragment.mWho)) {
            return this.f11229g ? this.f11230h : !this.f11231i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f11226d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f11227e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f11228f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
