package androidx.fragment.app;

import S9.Gvmm.CAqKeu;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbstractC1694h;
import android.view.InterfaceC1684S;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.Z;
import androidx.fragment.app.I;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import t2.Dbl.hgESaf;
import ya.HnSi.PLHvHoayk;

class z {

    private final p f11233a;

    private final A f11234b;

    private final Fragment f11235c;

    private boolean f11236d = false;

    private int f11237e = -1;

    class a implements View.OnAttachStateChangeListener {

        final View f11238d;

        a(View view) {
            this.f11238d = view;
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            this.f11238d.removeOnAttachStateChangeListener(this);
            Z.k0(this.f11238d);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class b {

        static final int[] f11240a;

        static {
            int[] iArr = new int[AbstractC1694h.b.values().length];
            f11240a = iArr;
            try {
                iArr[AbstractC1694h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11240a[AbstractC1694h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11240a[AbstractC1694h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11240a[AbstractC1694h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    z(p pVar, A a2, Fragment fragment) {
        this.f11233a = pVar;
        this.f11234b = a2;
        this.f11235c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f11235c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f11235c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f11235c.performSaveInstanceState(bundle);
        this.f11233a.j(this.f11235c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f11235c.mView != null) {
            s();
        }
        if (this.f11235c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f11235c.mSavedViewState);
        }
        if (this.f11235c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f11235c.mSavedViewRegistryState);
        }
        if (!this.f11235c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f11235c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f11235c);
        }
        Fragment fragment = this.f11235c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        p pVar = this.f11233a;
        Fragment fragment2 = this.f11235c;
        pVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    void b() {
        int iJ = this.f11234b.j(this.f11235c);
        Fragment fragment = this.f11235c;
        fragment.mContainer.addView(fragment.mView, iJ);
    }

    void c() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f11235c);
        }
        Fragment fragment = this.f11235c;
        Fragment fragment2 = fragment.mTarget;
        z zVarN = null;
        if (fragment2 != null) {
            z zVarN2 = this.f11234b.n(fragment2.mWho);
            if (zVarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f11235c + " declared target fragment " + this.f11235c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f11235c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            zVarN = zVarN2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (zVarN = this.f11234b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f11235c + " declared target fragment " + this.f11235c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (zVarN != null) {
            zVarN.m();
        }
        Fragment fragment4 = this.f11235c;
        fragment4.mHost = fragment4.mFragmentManager.w0();
        Fragment fragment5 = this.f11235c;
        fragment5.mParentFragment = fragment5.mFragmentManager.z0();
        this.f11233a.g(this.f11235c, false);
        this.f11235c.performAttach();
        this.f11233a.b(this.f11235c, false);
    }

    int d() {
        Fragment fragment = this.f11235c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f11237e;
        int i7 = b.f11240a[fragment.mMaxState.ordinal()];
        if (i7 != 1) {
            iMin = i7 != 2 ? i7 != 3 ? i7 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f11235c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f11237e, 2);
                View view = this.f11235c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f11237e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f11235c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f11235c;
        ViewGroup viewGroup = fragment3.mContainer;
        I.e.b bVarL = viewGroup != null ? I.n(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (bVarL == I.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == I.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f11235c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f11235c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f11235c);
        }
        return iMin;
    }

    void e() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f11235c);
        }
        Fragment fragment = this.f11235c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f11235c.mState = 1;
            return;
        }
        this.f11233a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f11235c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        p pVar = this.f11233a;
        Fragment fragment3 = this.f11235c;
        pVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    void f() throws Resources.NotFoundException {
        String resourceName;
        if (this.f11235c.mFromLayout) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f11235c);
        }
        Fragment fragment = this.f11235c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f11235c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i7 = fragment2.mContainerId;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f11235c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.s0().c(this.f11235c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f11235c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f11235c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f11235c.mContainerId) + PLHvHoayk.BiHSVUe + resourceName + hgESaf.qAAAgGI + this.f11235c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    N0.c.n(this.f11235c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f11235c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f11235c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f11235c;
            fragment5.mView.setTag(M0.b.f2344a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f11235c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (Z.Q(this.f11235c.mView)) {
                Z.k0(this.f11235c.mView);
            } else {
                View view2 = this.f11235c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f11235c.performViewCreated();
            p pVar = this.f11233a;
            Fragment fragment7 = this.f11235c;
            pVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f11235c.mView.getVisibility();
            this.f11235c.setPostOnViewCreatedAlpha(this.f11235c.mView.getAlpha());
            Fragment fragment8 = this.f11235c;
            if (fragment8.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment8.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f11235c.setFocusedView(viewFindFocus);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f11235c);
                    }
                }
                this.f11235c.mView.setAlpha(0.0f);
            }
        }
        this.f11235c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f11235c);
        }
        Fragment fragment = this.f11235c;
        boolean zIsChangingConfigurations = true;
        boolean z7 = fragment.mRemoving && !fragment.isInBackStack();
        if (z7) {
            Fragment fragment2 = this.f11235c;
            if (!fragment2.mBeingSaved) {
                this.f11234b.B(fragment2.mWho, null);
            }
        }
        if (!z7 && !this.f11234b.p().r(this.f11235c)) {
            String str = this.f11235c.mTargetWho;
            if (str != null && (fragmentF = this.f11234b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f11235c.mTarget = fragmentF;
            }
            this.f11235c.mState = 0;
            return;
        }
        m<?> mVar = this.f11235c.mHost;
        if (mVar instanceof InterfaceC1684S) {
            zIsChangingConfigurations = this.f11234b.p().o();
        } else if (mVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) mVar.f()).isChangingConfigurations();
        }
        if ((z7 && !this.f11235c.mBeingSaved) || zIsChangingConfigurations) {
            this.f11234b.p().g(this.f11235c);
        }
        this.f11235c.performDestroy();
        this.f11233a.d(this.f11235c, false);
        for (z zVar : this.f11234b.k()) {
            if (zVar != null) {
                Fragment fragmentK = zVar.k();
                if (this.f11235c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f11235c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f11235c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f11234b.f(str2);
        }
        this.f11234b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f11235c);
        }
        Fragment fragment = this.f11235c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f11235c.performDestroyView();
        this.f11233a.n(this.f11235c, false);
        Fragment fragment2 = this.f11235c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.o(null);
        this.f11235c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f11235c);
        }
        this.f11235c.performDetach();
        this.f11233a.e(this.f11235c, false);
        Fragment fragment = this.f11235c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f11234b.p().r(this.f11235c)) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f11235c);
        }
        this.f11235c.initState();
    }

    void j() {
        Fragment fragment = this.f11235c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f11235c);
            }
            Fragment fragment2 = this.f11235c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f11235c.mSavedFragmentState);
            View view = this.f11235c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f11235c;
                fragment3.mView.setTag(M0.b.f2344a, fragment3);
                Fragment fragment4 = this.f11235c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f11235c.performViewCreated();
                p pVar = this.f11233a;
                Fragment fragment5 = this.f11235c;
                pVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f11235c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.f11235c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f11236d) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f11236d = true;
            boolean z7 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f11235c;
                int i7 = fragment.mState;
                if (iD == i7) {
                    if (!z7 && i7 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f11235c.mBeingSaved) {
                        if (FragmentManager.J0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f11235c);
                        }
                        this.f11234b.p().g(this.f11235c);
                        this.f11234b.s(this);
                        if (FragmentManager.J0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f11235c);
                        }
                        this.f11235c.initState();
                    }
                    Fragment fragment2 = this.f11235c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            I iN = I.n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f11235c.mHidden) {
                                iN.c(this);
                            } else {
                                iN.e(this);
                            }
                        }
                        Fragment fragment3 = this.f11235c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.H0(fragment3);
                        }
                        Fragment fragment4 = this.f11235c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f11235c.mChildFragmentManager.K();
                    }
                    this.f11236d = false;
                    return;
                }
                if (iD <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f11234b.q(fragment.mWho) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f11235c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.J0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f11235c);
                            }
                            Fragment fragment5 = this.f11235c;
                            if (fragment5.mBeingSaved) {
                                r();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f11235c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                I.n(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.f11235c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                I.n(viewGroup3, fragment.getParentFragmentManager()).b(I.e.c.e(this.f11235c.mView.getVisibility()), this);
                            }
                            this.f11235c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z7 = true;
            }
        } catch (Throwable th) {
            this.f11236d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f11235c);
        }
        this.f11235c.performPause();
        this.f11233a.f(this.f11235c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f11235c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f11235c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f11235c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f11235c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f11235c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f11235c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f11235c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f11235c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    void p() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f11235c);
        }
        View focusedView = this.f11235c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.J0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? GObvYfBKohxpYX.snBsHDbRwPPOb : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f11235c);
                sb.append(" resulting in focused view ");
                sb.append(this.f11235c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f11235c.setFocusedView(null);
        this.f11235c.performResume();
        this.f11233a.i(this.f11235c, false);
        Fragment fragment = this.f11235c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    void r() {
        FragmentState fragmentState = new FragmentState(this.f11235c);
        Fragment fragment = this.f11235c;
        if (fragment.mState <= -1 || fragmentState.f11099F != null) {
            fragmentState.f11099F = fragment.mSavedFragmentState;
        } else {
            Bundle bundleQ = q();
            fragmentState.f11099F = bundleQ;
            if (this.f11235c.mTargetWho != null) {
                if (bundleQ == null) {
                    fragmentState.f11099F = new Bundle();
                }
                fragmentState.f11099F.putString("android:target_state", this.f11235c.mTargetWho);
                int i7 = this.f11235c.mTargetRequestCode;
                if (i7 != 0) {
                    fragmentState.f11099F.putInt("android:target_req_state", i7);
                }
            }
        }
        this.f11234b.B(this.f11235c.mWho, fragmentState);
    }

    void s() {
        if (this.f11235c.mView == null) {
            return;
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f11235c + " with view " + this.f11235c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f11235c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f11235c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f11235c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f11235c.mSavedViewRegistryState = bundle;
    }

    void t(int i7) {
        this.f11237e = i7;
    }

    void u() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f11235c);
        }
        this.f11235c.performStart();
        this.f11233a.k(this.f11235c, false);
    }

    void v() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f11235c);
        }
        this.f11235c.performStop();
        this.f11233a.l(this.f11235c, false);
    }

    z(p pVar, A a2, ClassLoader classLoader, l lVar, FragmentState fragmentState) {
        this.f11233a = pVar;
        this.f11234b = a2;
        Fragment fragmentA = fragmentState.a(lVar, classLoader);
        this.f11235c = fragmentA;
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", CAqKeu.XXa + fragmentA);
        }
    }

    z(p pVar, A a2, Fragment fragment, FragmentState fragmentState) {
        this.f11233a = pVar;
        this.f11234b = a2;
        this.f11235c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f11099F;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
