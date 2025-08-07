package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class A {

    private final ArrayList<Fragment> f10897a = new ArrayList<>();

    private final HashMap<String, z> f10898b = new HashMap<>();

    private final HashMap<String, FragmentState> f10899c = new HashMap<>();

    private w f10900d;

    A() {
    }

    void A(w wVar) {
        this.f10900d = wVar;
    }

    FragmentState B(String str, FragmentState fragmentState) {
        return fragmentState != null ? this.f10899c.put(str, fragmentState) : this.f10899c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f10897a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f10897a) {
            this.f10897a.add(fragment);
        }
        fragment.mAdded = true;
    }

    void b() {
        this.f10898b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f10898b.get(str) != null;
    }

    void d(int i7) {
        for (z zVar : this.f10898b.values()) {
            if (zVar != null) {
                zVar.t(i7);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f10898b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (z zVar : this.f10898b.values()) {
                printWriter.print(str);
                if (zVar != null) {
                    Fragment fragmentK = zVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f10897a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size; i7++) {
                Fragment fragment = this.f10897a.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        z zVar = this.f10898b.get(str);
        if (zVar != null) {
            return zVar.k();
        }
        return null;
    }

    Fragment g(int i7) {
        for (int size = this.f10897a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f10897a.get(size);
            if (fragment != null && fragment.mFragmentId == i7) {
                return fragment;
            }
        }
        for (z zVar : this.f10898b.values()) {
            if (zVar != null) {
                Fragment fragmentK = zVar.k();
                if (fragmentK.mFragmentId == i7) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f10897a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f10897a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (z zVar : this.f10898b.values()) {
            if (zVar != null) {
                Fragment fragmentK = zVar.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (z zVar : this.f10898b.values()) {
            if (zVar != null && (fragmentFindFragmentByWho = zVar.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f10897a.indexOf(fragment);
        for (int i7 = iIndexOf - 1; i7 >= 0; i7--) {
            Fragment fragment2 = this.f10897a.get(i7);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f10897a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f10897a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<z> k() {
        ArrayList arrayList = new ArrayList();
        for (z zVar : this.f10898b.values()) {
            if (zVar != null) {
                arrayList.add(zVar);
            }
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (z zVar : this.f10898b.values()) {
            if (zVar != null) {
                arrayList.add(zVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    ArrayList<FragmentState> m() {
        return new ArrayList<>(this.f10899c.values());
    }

    z n(String str) {
        return this.f10898b.get(str);
    }

    List<Fragment> o() {
        ArrayList arrayList;
        if (this.f10897a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f10897a) {
            arrayList = new ArrayList(this.f10897a);
        }
        return arrayList;
    }

    w p() {
        return this.f10900d;
    }

    FragmentState q(String str) {
        return this.f10899c.get(str);
    }

    void r(z zVar) {
        Fragment fragmentK = zVar.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f10898b.put(fragmentK.mWho, zVar);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f10900d.f(fragmentK);
            } else {
                this.f10900d.p(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void s(z zVar) {
        Fragment fragmentK = zVar.k();
        if (fragmentK.mRetainInstance) {
            this.f10900d.p(fragmentK);
        }
        if (this.f10898b.put(fragmentK.mWho, null) != null && FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void t() {
        Iterator<Fragment> it = this.f10897a.iterator();
        while (it.hasNext()) {
            z zVar = this.f10898b.get(it.next().mWho);
            if (zVar != null) {
                zVar.m();
            }
        }
        for (z zVar2 : this.f10898b.values()) {
            if (zVar2 != null) {
                zVar2.m();
                Fragment fragmentK = zVar2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f10899c.containsKey(fragmentK.mWho)) {
                        zVar2.r();
                    }
                    s(zVar2);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f10897a) {
            this.f10897a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    void v() {
        this.f10898b.clear();
    }

    void w(List<String> list) {
        this.f10897a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void x(ArrayList<FragmentState> arrayList) {
        this.f10899c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.f10899c.put(next.f11101e, next);
        }
    }

    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f10898b.size());
        for (z zVar : this.f10898b.values()) {
            if (zVar != null) {
                Fragment fragmentK = zVar.k();
                zVar.r();
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> z() {
        synchronized (this.f10897a) {
            try {
                if (this.f10897a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f10897a.size());
                Iterator<Fragment> it = this.f10897a.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.mWho);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
