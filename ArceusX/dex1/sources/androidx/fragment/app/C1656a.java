package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.B;
import androidx.fragment.app.FragmentManager;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.io.PrintWriter;
import java.util.ArrayList;

final class C1656a extends B implements FragmentManager.m {

    final FragmentManager f11139t;

    boolean f11140u;

    int f11141v;

    boolean f11142w;

    C1656a(FragmentManager fragmentManager) {
        super(fragmentManager.u0(), fragmentManager.w0() != null ? fragmentManager.w0().f().getClassLoader() : null);
        this.f11141v = -1;
        this.f11142w = false;
        this.f11139t = fragmentManager;
    }

    androidx.fragment.app.Fragment A(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1656a.A(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override
    public boolean a(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f10909i) {
            return true;
        }
        this.f11139t.i(this);
        return true;
    }

    @Override
    public int g() {
        return s(false);
    }

    @Override
    public int h() {
        return s(true);
    }

    @Override
    public void i() {
        k();
        this.f11139t.d0(this, false);
    }

    @Override
    public void j() {
        k();
        this.f11139t.d0(this, true);
    }

    @Override
    void l(int i7, Fragment fragment, String str, int i8) {
        super.l(i7, fragment, str, i8);
        fragment.mFragmentManager = this.f11139t;
    }

    @Override
    public B m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f11139t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override
    public B q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f11139t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void r(int i7) {
        if (this.f10909i) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = this.f10903c.size();
            for (int i8 = 0; i8 < size; i8++) {
                B.a aVar = this.f10903c.get(i8);
                Fragment fragment = aVar.f10921b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i7;
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f10921b + " to " + aVar.f10921b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int s(boolean z7) {
        if (this.f11140u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new H("FragmentManager"));
            t("  ", printWriter);
            printWriter.close();
        }
        this.f11140u = true;
        if (this.f10909i) {
            this.f11141v = this.f11139t.m();
        } else {
            this.f11141v = -1;
        }
        this.f11139t.a0(this, z7);
        return this.f11141v;
    }

    public void t(String str, PrintWriter printWriter) {
        u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f11141v >= 0) {
            sb.append(" #");
            sb.append(this.f11141v);
        }
        if (this.f10911k != null) {
            sb.append(" ");
            sb.append(this.f10911k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f10911k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f11141v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f11140u);
            if (this.f10908h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f10908h));
            }
            if (this.f10904d != 0 || this.f10905e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10904d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10905e));
            }
            if (this.f10906f != 0 || this.f10907g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10906f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10907g));
            }
            if (this.f10912l != 0 || this.f10913m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10912l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f10913m);
            }
            if (this.f10914n != 0 || this.f10915o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10914n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f10915o);
            }
        }
        if (this.f10903c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f10903c.size();
        for (int i7 = 0; i7 < size; i7++) {
            B.a aVar = this.f10903c.get(i7);
            switch (aVar.f10920a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = wtzgsqRsIZB.JlEiC + aVar.f10920a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f10921b);
            if (z7) {
                if (aVar.f10923d != 0 || aVar.f10924e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f10923d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f10924e));
                }
                if (aVar.f10925f != 0 || aVar.f10926g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f10925f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f10926g));
                }
            }
        }
    }

    void v() {
        int size = this.f10903c.size();
        for (int i7 = 0; i7 < size; i7++) {
            B.a aVar = this.f10903c.get(i7);
            Fragment fragment = aVar.f10921b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f11142w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f10908h);
                fragment.setSharedElementNames(this.f10916p, this.f10917q);
            }
            switch (aVar.f10920a) {
                case 1:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.s1(fragment, false);
                    this.f11139t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f10920a);
                case 3:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.k1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.G0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.s1(fragment, false);
                    this.f11139t.y1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.y(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.s1(fragment, false);
                    this.f11139t.o(fragment);
                    break;
                case 8:
                    this.f11139t.w1(fragment);
                    break;
                case 9:
                    this.f11139t.w1(null);
                    break;
                case 10:
                    this.f11139t.v1(fragment, aVar.f10928i);
                    break;
            }
        }
    }

    void w() {
        for (int size = this.f10903c.size() - 1; size >= 0; size--) {
            B.a aVar = this.f10903c.get(size);
            Fragment fragment = aVar.f10921b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f11142w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.p1(this.f10908h));
                fragment.setSharedElementNames(this.f10917q, this.f10916p);
            }
            switch (aVar.f10920a) {
                case 1:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.s1(fragment, true);
                    this.f11139t.k1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f10920a);
                case 3:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.y1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.s1(fragment, true);
                    this.f11139t.G0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.o(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f10923d, aVar.f10924e, aVar.f10925f, aVar.f10926g);
                    this.f11139t.s1(fragment, true);
                    this.f11139t.y(fragment);
                    break;
                case 8:
                    this.f11139t.w1(null);
                    break;
                case 9:
                    this.f11139t.w1(fragment);
                    break;
                case 10:
                    this.f11139t.v1(fragment, aVar.f10927h);
                    break;
            }
        }
    }

    androidx.fragment.app.Fragment x(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1656a.x(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String y() {
        return this.f10911k;
    }

    public void z() {
        if (this.f10919s != null) {
            for (int i7 = 0; i7 < this.f10919s.size(); i7++) {
                this.f10919s.get(i7).run();
            }
            this.f10919s = null;
        }
    }
}
