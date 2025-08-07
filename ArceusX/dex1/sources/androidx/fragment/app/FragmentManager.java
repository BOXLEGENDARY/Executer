package androidx.fragment.app;

import H3.QdLC.QcdySgfdST;
import N0.c;
import S5.Cg.XjqcfAbdbc;
import S9.Gvmm.CAqKeu;
import Y3.qE.KpBmp;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.AbstractC1694h;
import android.view.C1683Q;
import android.view.InterfaceC1684S;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.OnBackPressedDispatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.result.ActivityResult;
import android.view.result.IntentSenderRequest;
import androidx.core.view.InterfaceC1648w;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.fragment.app.B;
import androidx.savedstate.a;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import e.AbstractC2403c;
import e.AbstractC2405e;
import e.InterfaceC2401a;
import e.InterfaceC2406f;
import f.AbstractC2431a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import w7.Jld.EZYiRMRTxKdo;
import x0.InterfaceC2984a;
import z3.AdxZ.bpTQi;

public abstract class FragmentManager {

    private static boolean f11018S;

    private AbstractC2403c<Intent> f11022D;

    private AbstractC2403c<IntentSenderRequest> f11023E;

    private AbstractC2403c<String[]> f11024F;

    private boolean f11026H;

    private boolean f11027I;

    private boolean f11028J;

    private boolean f11029K;

    private boolean f11030L;

    private ArrayList<C1656a> f11031M;

    private ArrayList<Boolean> f11032N;

    private ArrayList<Fragment> f11033O;

    private w f11034P;

    private c.C0040c f11035Q;

    private boolean f11038b;

    ArrayList<C1656a> f11040d;

    private ArrayList<Fragment> f11041e;

    private OnBackPressedDispatcher f11043g;

    private ArrayList<l> f11049m;

    private androidx.fragment.app.m<?> f11058v;

    private AbstractC1665j f11059w;

    private Fragment f11060x;

    Fragment f11061y;

    private final ArrayList<m> f11037a = new ArrayList<>();

    private final A f11039c = new A();

    private final o f11042f = new o(this);

    private final android.view.E f11044h = new b(false);

    private final AtomicInteger f11045i = new AtomicInteger();

    private final Map<String, BackStackState> f11046j = Collections.synchronizedMap(new HashMap());

    private final Map<String, Bundle> f11047k = Collections.synchronizedMap(new HashMap());

    private final Map<String, k> f11048l = Collections.synchronizedMap(new HashMap());

    private final p f11050n = new p(this);

    private final CopyOnWriteArrayList<x> f11051o = new CopyOnWriteArrayList<>();

    private final InterfaceC2984a<Configuration> f11052p = new InterfaceC2984a() {
        @Override
        public final void accept(Object obj) {
            this.f11220a.S0((Configuration) obj);
        }
    };

    private final InterfaceC2984a<Integer> f11053q = new InterfaceC2984a() {
        @Override
        public final void accept(Object obj) {
            this.f11221a.T0((Integer) obj);
        }
    };

    private final InterfaceC2984a<androidx.core.app.i> f11054r = new InterfaceC2984a() {
        @Override
        public final void accept(Object obj) {
            this.f11222a.U0((androidx.core.app.i) obj);
        }
    };

    private final InterfaceC2984a<androidx.core.app.t> f11055s = new InterfaceC2984a() {
        @Override
        public final void accept(Object obj) {
            this.f11223a.V0((androidx.core.app.t) obj);
        }
    };

    private final androidx.core.view.B f11056t = new c();

    int f11057u = -1;

    private androidx.fragment.app.l f11062z = null;

    private androidx.fragment.app.l f11019A = new d();

    private J f11020B = null;

    private J f11021C = new e();

    ArrayDeque<LaunchedFragmentInfo> f11025G = new ArrayDeque<>();

    private Runnable f11036R = new f();

    class a implements InterfaceC2401a<Map<String, Boolean>> {
        a() {
        }

        @Override
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f11025G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", bpTQi.imvCQcGjhUWPE + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f11067d;
            int i8 = launchedFragmentInfoPollFirst.f11068e;
            Fragment fragmentI = FragmentManager.this.f11039c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i8, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends android.view.E {
        b(boolean z7) {
            super(z7);
        }

        @Override
        public void d() {
            FragmentManager.this.F0();
        }
    }

    class c implements androidx.core.view.B {
        c() {
        }

        @Override
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.L(menuItem);
        }

        @Override
        public void b(Menu menu) {
            FragmentManager.this.M(menu);
        }

        @Override
        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.E(menu, menuInflater);
        }

        @Override
        public void d(Menu menu) {
            FragmentManager.this.Q(menu);
        }
    }

    class d extends androidx.fragment.app.l {
        d() {
        }

        @Override
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.w0().b(FragmentManager.this.w0().f(), str, null);
        }
    }

    class e implements J {
        e() {
        }

        @Override
        public I a(ViewGroup viewGroup) {
            return new C1657b(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override
        public void run() {
            FragmentManager.this.c0(true);
        }
    }

    class g implements x {

        final Fragment f11075d;

        g(Fragment fragment) {
            this.f11075d = fragment;
        }

        @Override
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f11075d.onAttachFragment(fragment);
        }
    }

    class h implements InterfaceC2401a<ActivityResult> {
        h() {
        }

        @Override
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f11025G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f11067d;
            int i7 = launchedFragmentInfoPollFirst.f11068e;
            Fragment fragmentI = FragmentManager.this.f11039c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i7, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements InterfaceC2401a<ActivityResult> {
        i() {
        }

        @Override
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f11025G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f11067d;
            int i7 = launchedFragmentInfoPollFirst.f11068e;
            Fragment fragmentI = FragmentManager.this.f11039c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i7, activityResult.getResultCode(), activityResult.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends AbstractC2431a<IntentSenderRequest, ActivityResult> {
        j() {
        }

        @Override
        public Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.getIntentSender()).b(null).c(intentSenderRequest.getFlagsValues(), intentSenderRequest.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override
        public ActivityResult parseResult(int i7, Intent intent) {
            return new ActivityResult(i7, intent);
        }
    }

    private static class k implements y {

        private final AbstractC1694h f11079a;

        private final y f11080b;

        private final InterfaceC1698l f11081c;

        k(AbstractC1694h abstractC1694h, y yVar, InterfaceC1698l interfaceC1698l) {
            this.f11079a = abstractC1694h;
            this.f11080b = yVar;
            this.f11081c = interfaceC1698l;
        }

        @Override
        public void a(String str, Bundle bundle) {
            this.f11080b.a(str, bundle);
        }

        public boolean b(AbstractC1694h.b bVar) {
            return this.f11079a.getState().e(bVar);
        }

        public void c() {
            this.f11079a.d(this.f11081c);
        }
    }

    public interface l {
        void a();
    }

    interface m {
        boolean a(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class n implements m {

        final String f11082a;

        final int f11083b;

        final int f11084c;

        n(String str, int i7, int i8) {
            this.f11082a = str;
            this.f11083b = i7;
            this.f11084c = i8;
        }

        @Override
        public boolean a(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f11061y;
            if (fragment == null || this.f11083b >= 0 || this.f11082a != null || !fragment.getChildFragmentManager().g1()) {
                return FragmentManager.this.j1(arrayList, arrayList2, this.f11082a, this.f11083b, this.f11084c);
            }
            return false;
        }
    }

    private void A1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new H("FragmentManager"));
        androidx.fragment.app.m<?> mVar = this.f11058v;
        if (mVar != null) {
            try {
                mVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw runtimeException;
            }
        }
        try {
            Y("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw runtimeException;
        }
    }

    private void B1() {
        synchronized (this.f11037a) {
            try {
                if (this.f11037a.isEmpty()) {
                    this.f11044h.j(q0() > 0 && O0(this.f11060x));
                } else {
                    this.f11044h.j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Fragment D0(View view) {
        Object tag = view.getTag(M0.b.f2344a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean J0(int i7) {
        return f11018S || Log.isLoggable("FragmentManager", i7);
    }

    private boolean K0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.q();
    }

    private boolean L0() {
        Fragment fragment = this.f11060x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f11060x.getParentFragmentManager().L0();
    }

    private void N(Fragment fragment) {
        if (fragment == null || !fragment.equals(h0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public void S0(Configuration configuration) {
        if (L0()) {
            B(configuration, false);
        }
    }

    public void T0(Integer num) {
        if (L0() && num.intValue() == 80) {
            H(false);
        }
    }

    private void U(int i7) {
        try {
            this.f11038b = true;
            this.f11039c.d(i7);
            Z0(i7, false);
            Iterator<I> it = v().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
            this.f11038b = false;
            c0(true);
        } catch (Throwable th) {
            this.f11038b = false;
            throw th;
        }
    }

    public void U0(androidx.core.app.i iVar) {
        if (L0()) {
            I(iVar.getIsInMultiWindowMode(), false);
        }
    }

    public void V0(androidx.core.app.t tVar) {
        if (L0()) {
            P(tVar.getIsInPictureInPictureMode(), false);
        }
    }

    private void X() {
        if (this.f11030L) {
            this.f11030L = false;
            z1();
        }
    }

    private void Z() {
        Iterator<I> it = v().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    private void b0(boolean z7) {
        if (this.f11038b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f11058v == null) {
            if (!this.f11029K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f11058v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7) {
            r();
        }
        if (this.f11031M == null) {
            this.f11031M = new ArrayList<>();
            this.f11032N = new ArrayList<>();
        }
    }

    private static void e0(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2, int i7, int i8) {
        while (i7 < i8) {
            C1656a c1656a = arrayList.get(i7);
            if (arrayList2.get(i7).booleanValue()) {
                c1656a.r(-1);
                c1656a.w();
            } else {
                c1656a.r(1);
                c1656a.v();
            }
            i7++;
        }
    }

    private void f0(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2, int i7, int i8) {
        boolean z7 = arrayList.get(i7).f10918r;
        ArrayList<Fragment> arrayList3 = this.f11033O;
        if (arrayList3 == null) {
            this.f11033O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f11033O.addAll(this.f11039c.o());
        Fragment fragmentA0 = A0();
        boolean z8 = false;
        for (int i9 = i7; i9 < i8; i9++) {
            C1656a c1656a = arrayList.get(i9);
            fragmentA0 = !arrayList2.get(i9).booleanValue() ? c1656a.x(this.f11033O, fragmentA0) : c1656a.A(this.f11033O, fragmentA0);
            z8 = z8 || c1656a.f10909i;
        }
        this.f11033O.clear();
        if (!z7 && this.f11057u >= 1) {
            for (int i10 = i7; i10 < i8; i10++) {
                Iterator<B.a> it = arrayList.get(i10).f10903c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f10921b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f11039c.r(x(fragment));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i7, i8);
        boolean zBooleanValue = arrayList2.get(i8 - 1).booleanValue();
        for (int i11 = i7; i11 < i8; i11++) {
            C1656a c1656a2 = arrayList.get(i11);
            if (zBooleanValue) {
                for (int size = c1656a2.f10903c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c1656a2.f10903c.get(size).f10921b;
                    if (fragment2 != null) {
                        x(fragment2).m();
                    }
                }
            } else {
                Iterator<B.a> it2 = c1656a2.f10903c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().f10921b;
                    if (fragment3 != null) {
                        x(fragment3).m();
                    }
                }
            }
        }
        Z0(this.f11057u, true);
        for (I i12 : w(arrayList, i7, i8)) {
            i12.r(zBooleanValue);
            i12.p();
            i12.g();
        }
        while (i7 < i8) {
            C1656a c1656a3 = arrayList.get(i7);
            if (arrayList2.get(i7).booleanValue() && c1656a3.f11141v >= 0) {
                c1656a3.f11141v = -1;
            }
            c1656a3.z();
            i7++;
        }
        if (z8) {
            n1();
        }
    }

    private int i0(String str, int i7, boolean z7) {
        ArrayList<C1656a> arrayList = this.f11040d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i7 < 0) {
            if (z7) {
                return 0;
            }
            return this.f11040d.size() - 1;
        }
        int size = this.f11040d.size() - 1;
        while (size >= 0) {
            C1656a c1656a = this.f11040d.get(size);
            if ((str != null && str.equals(c1656a.y())) || (i7 >= 0 && i7 == c1656a.f11141v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z7) {
            if (size == this.f11040d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1656a c1656a2 = this.f11040d.get(size - 1);
            if ((str == null || !str.equals(c1656a2.y())) && (i7 < 0 || i7 != c1656a2.f11141v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    private boolean i1(String str, int i7, int i8) {
        c0(false);
        b0(true);
        Fragment fragment = this.f11061y;
        if (fragment != null && i7 < 0 && str == null && fragment.getChildFragmentManager().g1()) {
            return true;
        }
        boolean zJ1 = j1(this.f11031M, this.f11032N, str, i7, i8);
        if (zJ1) {
            this.f11038b = true;
            try {
                l1(this.f11031M, this.f11032N);
            } finally {
                s();
            }
        }
        B1();
        X();
        this.f11039c.b();
        return zJ1;
    }

    private void l1(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!arrayList.get(i7).f10918r) {
                if (i8 != i7) {
                    f0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (arrayList2.get(i7).booleanValue()) {
                    while (i8 < size && arrayList2.get(i8).booleanValue() && !arrayList.get(i8).f10918r) {
                        i8++;
                    }
                }
                f0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            f0(arrayList, arrayList2, i8, size);
        }
    }

    static FragmentManager m0(View view) {
        ActivityC1663h activityC1663h;
        Fragment fragmentN0 = n0(view);
        if (fragmentN0 != null) {
            if (fragmentN0.isAdded()) {
                return fragmentN0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentN0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activityC1663h = null;
                break;
            }
            if (context instanceof ActivityC1663h) {
                activityC1663h = (ActivityC1663h) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activityC1663h != null) {
            return activityC1663h.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment n0(View view) {
        while (view != null) {
            Fragment fragmentD0 = D0(view);
            if (fragmentD0 != null) {
                return fragmentD0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void n1() {
        if (this.f11049m != null) {
            for (int i7 = 0; i7 < this.f11049m.size(); i7++) {
                this.f11049m.get(i7).a();
            }
        }
    }

    private void o0() {
        Iterator<I> it = v().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    private boolean p0(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f11037a) {
            if (this.f11037a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f11037a.size();
                boolean zA = false;
                for (int i7 = 0; i7 < size; i7++) {
                    zA |= this.f11037a.get(i7).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f11037a.clear();
                this.f11058v.g().removeCallbacks(this.f11036R);
            }
        }
    }

    static int p1(int i7) {
        int i8 = 4097;
        if (i7 == 4097) {
            return 8194;
        }
        if (i7 != 8194) {
            i8 = 8197;
            if (i7 == 8197) {
                return 4100;
            }
            if (i7 == 4099) {
                return 4099;
            }
            if (i7 != 4100) {
                return 0;
            }
        }
        return i8;
    }

    private void r() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private w r0(Fragment fragment) {
        return this.f11034P.k(fragment);
    }

    private void s() {
        this.f11038b = false;
        this.f11032N.clear();
        this.f11031M.clear();
    }

    private void t() {
        androidx.fragment.app.m<?> mVar = this.f11058v;
        if (mVar instanceof InterfaceC1684S ? this.f11039c.p().o() : mVar.f() instanceof Activity ? !((Activity) this.f11058v.f()).isChangingConfigurations() : true) {
            Iterator<BackStackState> it = this.f11046j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f10943d.iterator();
                while (it2.hasNext()) {
                    this.f11039c.p().h(it2.next());
                }
            }
        }
    }

    private ViewGroup t0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f11059w.d()) {
            View viewC = this.f11059w.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private Set<I> v() {
        HashSet hashSet = new HashSet();
        Iterator<z> it = this.f11039c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(I.o(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    private Set<I> w(ArrayList<C1656a> arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator<B.a> it = arrayList.get(i7).f10903c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f10921b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(I.n(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    private void x1(Fragment fragment) {
        ViewGroup viewGroupT0 = t0(fragment);
        if (viewGroupT0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i7 = M0.b.f2346c;
        if (viewGroupT0.getTag(i7) == null) {
            viewGroupT0.setTag(i7, fragment);
        }
        ((Fragment) viewGroupT0.getTag(i7)).setPopDirection(fragment.getPopDirection());
    }

    private void z1() {
        Iterator<z> it = this.f11039c.k().iterator();
        while (it.hasNext()) {
            c1(it.next());
        }
    }

    void A() {
        this.f11027I = false;
        this.f11028J = false;
        this.f11034P.q(false);
        U(0);
    }

    public Fragment A0() {
        return this.f11061y;
    }

    void B(Configuration configuration, boolean z7) {
        if (z7 && (this.f11058v instanceof androidx.core.content.b)) {
            A1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z7) {
                    fragment.mChildFragmentManager.B(configuration, true);
                }
            }
        }
    }

    J B0() {
        J j7 = this.f11020B;
        if (j7 != null) {
            return j7;
        }
        Fragment fragment = this.f11060x;
        return fragment != null ? fragment.mFragmentManager.B0() : this.f11021C;
    }

    boolean C(MenuItem menuItem) {
        if (this.f11057u < 1) {
            return false;
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public c.C0040c C0() {
        return this.f11035Q;
    }

    void D() {
        this.f11027I = false;
        this.f11028J = false;
        this.f11034P.q(false);
        U(1);
    }

    boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f11057u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z7 = false;
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null && N0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z7 = true;
            }
        }
        if (this.f11041e != null) {
            for (int i7 = 0; i7 < this.f11041e.size(); i7++) {
                Fragment fragment2 = this.f11041e.get(i7);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f11041e = arrayList;
        return z7;
    }

    C1683Q E0(Fragment fragment) {
        return this.f11034P.n(fragment);
    }

    void F() {
        this.f11029K = true;
        c0(true);
        Z();
        t();
        U(-1);
        Object obj = this.f11058v;
        if (obj instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj).removeOnTrimMemoryListener(this.f11053q);
        }
        Object obj2 = this.f11058v;
        if (obj2 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj2).removeOnConfigurationChangedListener(this.f11052p);
        }
        Object obj3 = this.f11058v;
        if (obj3 instanceof androidx.core.app.q) {
            ((androidx.core.app.q) obj3).removeOnMultiWindowModeChangedListener(this.f11054r);
        }
        Object obj4 = this.f11058v;
        if (obj4 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj4).removeOnPictureInPictureModeChangedListener(this.f11055s);
        }
        Object obj5 = this.f11058v;
        if ((obj5 instanceof InterfaceC1648w) && this.f11060x == null) {
            ((InterfaceC1648w) obj5).removeMenuProvider(this.f11056t);
        }
        this.f11058v = null;
        this.f11059w = null;
        this.f11060x = null;
        if (this.f11043g != null) {
            this.f11044h.h();
            this.f11043g = null;
        }
        AbstractC2403c<Intent> abstractC2403c = this.f11022D;
        if (abstractC2403c != null) {
            abstractC2403c.d();
            this.f11023E.d();
            this.f11024F.d();
        }
    }

    void F0() {
        c0(true);
        if (this.f11044h.getIsEnabled()) {
            g1();
        } else {
            this.f11043g.l();
        }
    }

    void G() {
        U(1);
    }

    void G0(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        x1(fragment);
    }

    void H(boolean z7) {
        if (z7 && (this.f11058v instanceof androidx.core.content.c)) {
            A1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z7) {
                    fragment.mChildFragmentManager.H(true);
                }
            }
        }
    }

    void H0(Fragment fragment) {
        if (fragment.mAdded && K0(fragment)) {
            this.f11026H = true;
        }
    }

    void I(boolean z7, boolean z8) {
        if (z8 && (this.f11058v instanceof androidx.core.app.q)) {
            A1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z7);
                if (z8) {
                    fragment.mChildFragmentManager.I(z7, true);
                }
            }
        }
    }

    public boolean I0() {
        return this.f11029K;
    }

    void J(Fragment fragment) {
        Iterator<x> it = this.f11051o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    void K() {
        for (Fragment fragment : this.f11039c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.K();
            }
        }
    }

    boolean L(MenuItem menuItem) {
        if (this.f11057u < 1) {
            return false;
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void M(Menu menu) {
        if (this.f11057u < 1) {
            return;
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    boolean M0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    boolean N0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    void O() {
        U(5);
    }

    boolean O0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.A0()) && O0(fragmentManager.f11060x);
    }

    void P(boolean z7, boolean z8) {
        if (z8 && (this.f11058v instanceof androidx.core.app.r)) {
            A1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z7);
                if (z8) {
                    fragment.mChildFragmentManager.P(z7, true);
                }
            }
        }
    }

    boolean P0(int i7) {
        return this.f11057u >= i7;
    }

    boolean Q(Menu menu) {
        boolean z7 = false;
        if (this.f11057u < 1) {
            return false;
        }
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null && N0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z7 = true;
            }
        }
        return z7;
    }

    public boolean Q0() {
        return this.f11027I || this.f11028J;
    }

    void R() {
        B1();
        N(this.f11061y);
    }

    void S() {
        this.f11027I = false;
        this.f11028J = false;
        this.f11034P.q(false);
        U(7);
    }

    void T() {
        this.f11027I = false;
        this.f11028J = false;
        this.f11034P.q(false);
        U(5);
    }

    void V() {
        this.f11028J = true;
        this.f11034P.q(true);
        U(4);
    }

    void W() {
        U(2);
    }

    void W0(Fragment fragment, String[] strArr, int i7) {
        if (this.f11024F == null) {
            this.f11058v.k(fragment, strArr, i7);
            return;
        }
        this.f11025G.addLast(new LaunchedFragmentInfo(fragment.mWho, i7));
        this.f11024F.b(strArr);
    }

    void X0(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (this.f11022D == null) {
            this.f11058v.m(fragment, intent, i7, bundle);
            return;
        }
        this.f11025G.addLast(new LaunchedFragmentInfo(fragment.mWho, i7));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f11022D.b(intent);
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f11039c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f11041e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                Fragment fragment = this.f11041e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C1656a> arrayList2 = this.f11040d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                C1656a c1656a = this.f11040d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c1656a.toString());
                c1656a.t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println(QcdySgfdST.oPXRGVhBKuMSs + this.f11045i.get());
        synchronized (this.f11037a) {
            try {
                int size3 = this.f11037a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size3; i9++) {
                        m mVar = this.f11037a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f11058v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f11059w);
        if (this.f11060x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f11060x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f11057u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f11027I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f11028J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f11029K);
        if (this.f11026H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f11026H);
        }
    }

    void Y0(Fragment fragment, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f11023E == null) {
            this.f11058v.n(fragment, intentSender, i7, intent, i8, i9, i10, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (J0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestA = new IntentSenderRequest.a(intentSender).b(intent2).c(i9, i8).a();
        this.f11025G.addLast(new LaunchedFragmentInfo(fragment.mWho, i7));
        if (J0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f11023E.b(intentSenderRequestA);
    }

    void Z0(int i7, boolean z7) {
        androidx.fragment.app.m<?> mVar;
        if (this.f11058v == null && i7 != -1) {
            throw new IllegalStateException(XjqcfAbdbc.wmqsQtKGWeQpef);
        }
        if (z7 || i7 != this.f11057u) {
            this.f11057u = i7;
            this.f11039c.t();
            z1();
            if (this.f11026H && (mVar = this.f11058v) != null && this.f11057u == 7) {
                mVar.o();
                this.f11026H = false;
            }
        }
    }

    void a0(m mVar, boolean z7) {
        if (!z7) {
            if (this.f11058v == null) {
                if (!this.f11029K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.f11037a) {
            try {
                if (this.f11058v == null) {
                    if (!z7) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f11037a.add(mVar);
                    r1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a1() {
        if (this.f11058v == null) {
            return;
        }
        this.f11027I = false;
        this.f11028J = false;
        this.f11034P.q(false);
        for (Fragment fragment : this.f11039c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void b1(FragmentContainerView fragmentContainerView) {
        View view;
        for (z zVar : this.f11039c.k()) {
            Fragment fragmentK = zVar.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                zVar.b();
            }
        }
    }

    boolean c0(boolean z7) {
        b0(z7);
        boolean z8 = false;
        while (p0(this.f11031M, this.f11032N)) {
            z8 = true;
            this.f11038b = true;
            try {
                l1(this.f11031M, this.f11032N);
            } finally {
                s();
            }
        }
        B1();
        X();
        this.f11039c.b();
        return z8;
    }

    void c1(z zVar) {
        Fragment fragmentK = zVar.k();
        if (fragmentK.mDeferStart) {
            if (this.f11038b) {
                this.f11030L = true;
            } else {
                fragmentK.mDeferStart = false;
                zVar.m();
            }
        }
    }

    void d0(m mVar, boolean z7) {
        if (z7 && (this.f11058v == null || this.f11029K)) {
            return;
        }
        b0(z7);
        if (mVar.a(this.f11031M, this.f11032N)) {
            this.f11038b = true;
            try {
                l1(this.f11031M, this.f11032N);
            } finally {
                s();
            }
        }
        B1();
        X();
        this.f11039c.b();
    }

    public void d1() {
        a0(new n(null, -1, 0), false);
    }

    void e1(int i7, int i8, boolean z7) {
        if (i7 >= 0) {
            a0(new n(null, i7, i8), z7);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    public void f1(String str, int i7) {
        a0(new n(str, -1, i7), false);
    }

    public boolean g0() {
        boolean zC0 = c0(true);
        o0();
        return zC0;
    }

    public boolean g1() {
        return i1(null, -1, 0);
    }

    Fragment h0(String str) {
        return this.f11039c.f(str);
    }

    public boolean h1(int i7, int i8) {
        if (i7 >= 0) {
            return i1(null, i7, i8);
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    void i(C1656a c1656a) {
        if (this.f11040d == null) {
            this.f11040d = new ArrayList<>();
        }
        this.f11040d.add(c1656a);
    }

    z j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            N0.c.f(fragment, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        z zVarX = x(fragment);
        fragment.mFragmentManager = this;
        this.f11039c.r(zVarX);
        if (!fragment.mDetached) {
            this.f11039c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (K0(fragment)) {
                this.f11026H = true;
            }
        }
        return zVarX;
    }

    public Fragment j0(int i7) {
        return this.f11039c.g(i7);
    }

    boolean j1(ArrayList<C1656a> arrayList, ArrayList<Boolean> arrayList2, String str, int i7, int i8) {
        int iI0 = i0(str, i7, (i8 & 1) != 0);
        if (iI0 < 0) {
            return false;
        }
        for (int size = this.f11040d.size() - 1; size >= iI0; size--) {
            arrayList.add(this.f11040d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void k(x xVar) {
        this.f11051o.add(xVar);
    }

    public Fragment k0(String str) {
        return this.f11039c.h(str);
    }

    void k1(Fragment fragment) {
        if (J0(2)) {
            Log.v(EZYiRMRTxKdo.Ummd, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f11039c.u(fragment);
        if (K0(fragment)) {
            this.f11026H = true;
        }
        fragment.mRemoving = true;
        x1(fragment);
    }

    void l(Fragment fragment) {
        this.f11034P.f(fragment);
    }

    Fragment l0(String str) {
        return this.f11039c.i(str);
    }

    int m() {
        return this.f11045i.getAndIncrement();
    }

    void m1(Fragment fragment) {
        this.f11034P.p(fragment);
    }

    void n(androidx.fragment.app.m<?> mVar, AbstractC1665j abstractC1665j, Fragment fragment) {
        String str;
        if (this.f11058v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f11058v = mVar;
        this.f11059w = abstractC1665j;
        this.f11060x = fragment;
        if (fragment != null) {
            k(new g(fragment));
        } else if (mVar instanceof x) {
            k((x) mVar);
        }
        if (this.f11060x != null) {
            B1();
        }
        if (mVar instanceof android.view.G) {
            android.view.G g7 = (android.view.G) mVar;
            OnBackPressedDispatcher onBackPressedDispatcher = g7.getOnBackPressedDispatcher();
            this.f11043g = onBackPressedDispatcher;
            InterfaceC1701o interfaceC1701o = g7;
            if (fragment != null) {
                interfaceC1701o = fragment;
            }
            onBackPressedDispatcher.h(interfaceC1701o, this.f11044h);
        }
        if (fragment != null) {
            this.f11034P = fragment.mFragmentManager.r0(fragment);
        } else if (mVar instanceof InterfaceC1684S) {
            this.f11034P = w.l(((InterfaceC1684S) mVar).getViewModelStore());
        } else {
            this.f11034P = new w(false);
        }
        this.f11034P.q(Q0());
        this.f11039c.A(this.f11034P);
        Object obj = this.f11058v;
        if ((obj instanceof b1.d) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((b1.d) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new a.c() {
                @Override
                public final Bundle a() {
                    return this.f11224a.R0();
                }
            });
            Bundle bundleB = savedStateRegistry.b("android:support:fragments");
            if (bundleB != null) {
                o1(bundleB);
            }
        }
        Object obj2 = this.f11058v;
        if (obj2 instanceof InterfaceC2406f) {
            AbstractC2405e activityResultRegistry = ((InterfaceC2406f) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str2 = "FragmentManager:" + str;
            this.f11022D = activityResultRegistry.m(str2 + "StartActivityForResult", new f.k(), new h());
            this.f11023E = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f11024F = activityResultRegistry.m(str2 + KwdswzaUHE.mnAMxnl, new f.i(), new a());
        }
        Object obj3 = this.f11058v;
        if (obj3 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj3).addOnConfigurationChangedListener(this.f11052p);
        }
        Object obj4 = this.f11058v;
        if (obj4 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj4).addOnTrimMemoryListener(this.f11053q);
        }
        Object obj5 = this.f11058v;
        if (obj5 instanceof androidx.core.app.q) {
            ((androidx.core.app.q) obj5).addOnMultiWindowModeChangedListener(this.f11054r);
        }
        Object obj6 = this.f11058v;
        if (obj6 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj6).addOnPictureInPictureModeChangedListener(this.f11055s);
        }
        Object obj7 = this.f11058v;
        if ((obj7 instanceof InterfaceC1648w) && fragment == null) {
            ((InterfaceC1648w) obj7).addMenuProvider(this.f11056t);
        }
    }

    void o(Fragment fragment) {
        boolean zJ0 = J0(2);
        String str = CAqKeu.zKnpER;
        if (zJ0) {
            Log.v(str, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f11039c.a(fragment);
            if (J0(2)) {
                Log.v(str, "add from attach: " + fragment);
            }
            if (K0(fragment)) {
                this.f11026H = true;
            }
        }
    }

    void o1(Parcelable parcelable) {
        z zVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f11058v.f().getClassLoader());
                this.f11047k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f11058v.f().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        this.f11039c.x(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f11039c.v();
        Iterator<String> it = fragmentManagerState.f11087d.iterator();
        while (it.hasNext()) {
            FragmentState fragmentStateB = this.f11039c.B(it.next(), null);
            if (fragmentStateB != null) {
                Fragment fragmentJ = this.f11034P.j(fragmentStateB.f11101e);
                if (fragmentJ != null) {
                    if (J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentJ);
                    }
                    zVar = new z(this.f11050n, this.f11039c, fragmentJ, fragmentStateB);
                } else {
                    zVar = new z(this.f11050n, this.f11039c, this.f11058v.f().getClassLoader(), u0(), fragmentStateB);
                }
                Fragment fragmentK = zVar.k();
                fragmentK.mFragmentManager = this;
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                zVar.o(this.f11058v.f().getClassLoader());
                this.f11039c.r(zVar);
                zVar.t(this.f11057u);
            }
        }
        for (Fragment fragment : this.f11034P.m()) {
            if (!this.f11039c.c(fragment.mWho)) {
                if (J0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f11087d);
                }
                this.f11034P.p(fragment);
                fragment.mFragmentManager = this;
                z zVar2 = new z(this.f11050n, this.f11039c, fragment);
                zVar2.t(1);
                zVar2.m();
                fragment.mRemoving = true;
                zVar2.m();
            }
        }
        this.f11039c.w(fragmentManagerState.f11088e);
        if (fragmentManagerState.f11089i != null) {
            this.f11040d = new ArrayList<>(fragmentManagerState.f11089i.length);
            int i7 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f11089i;
                if (i7 >= backStackRecordStateArr.length) {
                    break;
                }
                C1656a c1656aB = backStackRecordStateArr[i7].b(this);
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + c1656aB.f11141v + "): " + c1656aB);
                    PrintWriter printWriter = new PrintWriter(new H("FragmentManager"));
                    c1656aB.u(KpBmp.ZyisTiPQlZALR, printWriter, false);
                    printWriter.close();
                }
                this.f11040d.add(c1656aB);
                i7++;
            }
        } else {
            this.f11040d = null;
        }
        this.f11045i.set(fragmentManagerState.f11090v);
        String str3 = fragmentManagerState.f11091w;
        if (str3 != null) {
            Fragment fragmentH0 = h0(str3);
            this.f11061y = fragmentH0;
            N(fragmentH0);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f11092y;
        if (arrayList2 != null) {
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.f11046j.put(arrayList2.get(i8), fragmentManagerState.f11093z.get(i8));
            }
        }
        this.f11025G = new ArrayDeque<>(fragmentManagerState.f11086A);
    }

    public B p() {
        return new C1656a(this);
    }

    boolean q() {
        boolean zK0 = false;
        for (Fragment fragment : this.f11039c.l()) {
            if (fragment != null) {
                zK0 = K0(fragment);
            }
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    public int q0() {
        ArrayList<C1656a> arrayList = this.f11040d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Bundle R0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        o0();
        Z();
        c0(true);
        this.f11027I = true;
        this.f11034P.q(true);
        ArrayList<String> arrayListY = this.f11039c.y();
        ArrayList<FragmentState> arrayListM = this.f11039c.m();
        if (!arrayListM.isEmpty()) {
            ArrayList<String> arrayListZ = this.f11039c.z();
            ArrayList<C1656a> arrayList = this.f11040d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i7 = 0; i7 < size; i7++) {
                    backStackRecordStateArr[i7] = new BackStackRecordState(this.f11040d.get(i7));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i7 + ": " + this.f11040d.get(i7));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f11087d = arrayListY;
            fragmentManagerState.f11088e = arrayListZ;
            fragmentManagerState.f11089i = backStackRecordStateArr;
            fragmentManagerState.f11090v = this.f11045i.get();
            Fragment fragment = this.f11061y;
            if (fragment != null) {
                fragmentManagerState.f11091w = fragment.mWho;
            }
            fragmentManagerState.f11092y.addAll(this.f11046j.keySet());
            fragmentManagerState.f11093z.addAll(this.f11046j.values());
            fragmentManagerState.f11086A = new ArrayList<>(this.f11025G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f11047k.keySet()) {
                bundle.putBundle("result_" + str, this.f11047k.get(str));
            }
            Iterator<FragmentState> it = arrayListM.iterator();
            while (it.hasNext()) {
                FragmentState next = it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", next);
                bundle.putBundle("fragment_" + next.f11101e, bundle2);
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    void r1() {
        synchronized (this.f11037a) {
            try {
                if (this.f11037a.size() == 1) {
                    this.f11058v.g().removeCallbacks(this.f11036R);
                    this.f11058v.g().post(this.f11036R);
                    B1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    AbstractC1665j s0() {
        return this.f11059w;
    }

    void s1(Fragment fragment, boolean z7) {
        ViewGroup viewGroupT0 = t0(fragment);
        if (viewGroupT0 == null || !(viewGroupT0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupT0).setDrawDisappearingViewsLast(!z7);
    }

    public final void t1(String str, Bundle bundle) {
        k kVar = this.f11048l.get(str);
        if (kVar == null || !kVar.b(AbstractC1694h.b.STARTED)) {
            this.f11047k.put(str, bundle);
        } else {
            kVar.a(str, bundle);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f11060x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f11060x)));
            sb.append("}");
        } else {
            androidx.fragment.app.m<?> mVar = this.f11058v;
            if (mVar != null) {
                sb.append(mVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f11058v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str) {
        this.f11047k.remove(str);
        if (J0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public androidx.fragment.app.l u0() {
        androidx.fragment.app.l lVar = this.f11062z;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f11060x;
        return fragment != null ? fragment.mFragmentManager.u0() : this.f11019A;
    }

    public final void u1(final String str, InterfaceC1701o interfaceC1701o, final y yVar) {
        final AbstractC1694h lifecycle = interfaceC1701o.getLifecycle();
        if (lifecycle.getState() == AbstractC1694h.b.DESTROYED) {
            return;
        }
        InterfaceC1698l interfaceC1698l = new InterfaceC1698l() {
            @Override
            public void j(InterfaceC1701o interfaceC1701o2, AbstractC1694h.a aVar) {
                Bundle bundle;
                if (aVar == AbstractC1694h.a.ON_START && (bundle = (Bundle) FragmentManager.this.f11047k.get(str)) != null) {
                    yVar.a(str, bundle);
                    FragmentManager.this.u(str);
                }
                if (aVar == AbstractC1694h.a.ON_DESTROY) {
                    lifecycle.d(this);
                    FragmentManager.this.f11048l.remove(str);
                }
            }
        };
        k kVarPut = this.f11048l.put(str, new k(lifecycle, yVar, interfaceC1698l));
        if (kVarPut != null) {
            kVarPut.c();
        }
        if (J0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + yVar);
        }
        lifecycle.a(interfaceC1698l);
    }

    public List<Fragment> v0() {
        return this.f11039c.o();
    }

    void v1(Fragment fragment, AbstractC1694h.b bVar) {
        if (fragment.equals(h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public androidx.fragment.app.m<?> w0() {
        return this.f11058v;
    }

    void w1(Fragment fragment) {
        if (fragment == null || (fragment.equals(h0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f11061y;
            this.f11061y = fragment;
            N(fragment2);
            N(this.f11061y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + GObvYfBKohxpYX.xCmGsQX + this);
    }

    z x(Fragment fragment) {
        z zVarN = this.f11039c.n(fragment.mWho);
        if (zVarN != null) {
            return zVarN;
        }
        z zVar = new z(this.f11050n, this.f11039c, fragment);
        zVar.o(this.f11058v.f().getClassLoader());
        zVar.t(this.f11057u);
        return zVar;
    }

    LayoutInflater.Factory2 x0() {
        return this.f11042f;
    }

    void y(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (J0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f11039c.u(fragment);
            if (K0(fragment)) {
                this.f11026H = true;
            }
            x1(fragment);
        }
    }

    p y0() {
        return this.f11050n;
    }

    void y1(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void z() {
        this.f11027I = false;
        this.f11028J = false;
        this.f11034P.q(false);
        U(4);
    }

    Fragment z0() {
        return this.f11060x;
    }

    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        String f11067d;

        int f11068e;

        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override
            public LaunchedFragmentInfo[] newArray(int i7) {
                return new LaunchedFragmentInfo[i7];
            }
        }

        LaunchedFragmentInfo(String str, int i7) {
            this.f11067d = str;
            this.f11068e = i7;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f11067d);
            parcel.writeInt(this.f11068e);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f11067d = parcel.readString();
            this.f11068e = parcel.readInt();
        }
    }
}
