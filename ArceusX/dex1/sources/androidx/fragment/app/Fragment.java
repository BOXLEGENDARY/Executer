package androidx.fragment.app;

import K0.wJ.BtcVLuo;
import Q6.QtA.QXojhh;
import S5.Cg.XjqcfAbdbc;
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbstractC1694h;
import android.view.C1672F;
import android.view.C1675I;
import android.view.C1681O;
import android.view.C1683Q;
import android.view.C1685T;
import android.view.C1686U;
import android.view.C1703q;
import android.view.C1709w;
import android.view.ContextMenu;
import android.view.InterfaceC1684S;
import android.view.InterfaceC1693g;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.LayoutInflater;
import android.view.LiveData;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.C1644u;
import androidx.room.kU.HguUe;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import e.AbstractC2403c;
import e.AbstractC2405e;
import e.InterfaceC2401a;
import e.InterfaceC2402b;
import e.InterfaceC2406f;
import f.AbstractC2431a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n.InterfaceC2621a;
import t4.gYZ.uCYQMIHsy;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1701o, InterfaceC1684S, InterfaceC1693g, b1.d, InterfaceC2402b {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    C1681O.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.m<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1703q mLifecycleRegistry;
    AbstractC1694h.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    b1.c mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    F mViewLifecycleOwner;
    C1709w<InterfaceC1701o> mViewLifecycleOwnerLiveData;
    String mWho;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        final Bundle f10975d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f10975d = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeBundle(this.f10975d);
        }
    }

    class a<I> extends AbstractC2403c<I> {

        final AtomicReference f10976a;

        final AbstractC2431a f10977b;

        a(AtomicReference atomicReference, AbstractC2431a abstractC2431a) {
            this.f10976a = atomicReference;
            this.f10977b = abstractC2431a;
        }

        @Override
        public AbstractC2431a<I, ?> a() {
            return this.f10977b;
        }

        @Override
        public void c(I i7, androidx.core.app.c cVar) {
            AbstractC2403c abstractC2403c = (AbstractC2403c) this.f10976a.get();
            if (abstractC2403c == null) {
                throw new IllegalStateException(QXojhh.HzrvoCAjdsqpq);
            }
            abstractC2403c.c(i7, cVar);
        }

        @Override
        public void d() {
            AbstractC2403c abstractC2403c = (AbstractC2403c) this.f10976a.getAndSet(null);
            if (abstractC2403c != null) {
                abstractC2403c.d();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    class c extends m {
        c() {
            super(null);
        }

        @Override
        void a() {
            Fragment.this.mSavedStateRegistryController.c();
            C1672F.c(Fragment.this);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    class e implements Runnable {

        final I f10982d;

        e(I i7) {
            this.f10982d = i7;
        }

        @Override
        public void run() {
            this.f10982d.g();
        }
    }

    class f extends AbstractC1665j {
        f() {
        }

        @Override
        public View c(int i7) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    class g implements InterfaceC2621a<Void, AbstractC2405e> {
        g() {
        }

        @Override
        public AbstractC2405e apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC2406f ? ((InterfaceC2406f) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    class h implements InterfaceC2621a<Void, AbstractC2405e> {

        final AbstractC2405e f10986a;

        h(AbstractC2405e abstractC2405e) {
            this.f10986a = abstractC2405e;
        }

        @Override
        public AbstractC2405e apply(Void r1) {
            return this.f10986a;
        }
    }

    class i extends m {

        final InterfaceC2621a f10988a;

        final AtomicReference f10989b;

        final AbstractC2431a f10990c;

        final InterfaceC2401a f10991d;

        i(InterfaceC2621a interfaceC2621a, AtomicReference atomicReference, AbstractC2431a abstractC2431a, InterfaceC2401a interfaceC2401a) {
            super(null);
            this.f10988a = interfaceC2621a;
            this.f10989b = atomicReference;
            this.f10990c = abstractC2431a;
            this.f10991d = interfaceC2401a;
        }

        @Override
        void a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f10989b.set(((AbstractC2405e) this.f10988a.apply(null)).l(strGenerateActivityResultKey, Fragment.this, this.f10990c, this.f10991d));
        }
    }

    static class j {

        View f10993a;

        boolean f10994b;

        int f10995c;

        int f10996d;

        int f10997e;

        int f10998f;

        int f10999g;

        ArrayList<String> f11000h;

        ArrayList<String> f11001i;

        Object f11002j = null;

        Object f11003k;

        Object f11004l;

        Object f11005m;

        Object f11006n;

        Object f11007o;

        Boolean f11008p;

        Boolean f11009q;

        float f11010r;

        View f11011s;

        boolean f11012t;

        j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f11003k = obj;
            this.f11004l = null;
            this.f11005m = obj;
            this.f11006n = null;
            this.f11007o = obj;
            this.f11010r = 1.0f;
            this.f11011s = null;
        }
    }

    static class k {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class m {
        private m() {
        }

        abstract void a();

        m(b bVar) {
            this();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new v();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = AbstractC1694h.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C1709w<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC1694h.b bVar = this.mMaxState;
        return (bVar == AbstractC1694h.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C1703q(this);
        this.mSavedStateRegistryController = b1.c.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> AbstractC2403c<I> prepareCallInternal(AbstractC2431a<I, O> abstractC2431a, InterfaceC2621a<Void, AbstractC2405e> interfaceC2621a, InterfaceC2401a<O> interfaceC2401a) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new i(interfaceC2621a, atomicReference, abstractC2431a, interfaceC2401a));
            return new a(atomicReference, abstractC2431a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    void callStartTransitionListener(boolean z7) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f11012t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        I iN = I.n(viewGroup, fragmentManager);
        iN.p();
        if (z7) {
            this.mHost.g().post(new e(iN));
        } else {
            iN.g();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    AbstractC1665j createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print(BtcVLuo.pAZJZ);
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.l0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC1663h getActivity() {
        androidx.fragment.app.m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return (ActivityC1663h) mVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f11009q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f11008p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f10993a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        androidx.fragment.app.m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.f();
    }

    @Override
    public R0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.J0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        R0.d dVar = new R0.d();
        if (application != null) {
            dVar.c(C1681O.a.f11332h, application);
        }
        dVar.c(C1672F.f11269a, this);
        dVar.c(C1672F.f11270b, this);
        if (getArguments() != null) {
            dVar.c(C1672F.f11271c, getArguments());
        }
        return dVar;
    }

    @Override
    public C1681O.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.J0(3)) {
                Log.d("FragmentManager", uCYQMIHsy.cKzAMAE + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C1675I(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10995c;
    }

    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f11002j;
    }

    androidx.core.app.w getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10996d;
    }

    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f11004l;
    }

    androidx.core.app.w getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f11011s;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        androidx.fragment.app.m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override
    public AbstractC1694h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10999g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f10994b;
    }

    int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10997e;
    }

    int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f10998f;
    }

    float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f11010r;
    }

    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f11005m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        N0.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f11003k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f11006n;
    }

    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f11007o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f11000h) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f11001i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i7) {
        return getResources().getString(i7);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        N0.c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i7) {
        return getResources().getText(i7);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1701o getViewLifecycleOwner() {
        F f7 = this.mViewLifecycleOwner;
        if (f7 != null) {
            return f7;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<InterfaceC1701o> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override
    public C1683Q getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != AbstractC1694h.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.E0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new v();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.M0(this.mParentFragment));
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.N0(this.mParentFragment));
    }

    boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f11012t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Q0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.a1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        androidx.fragment.app.m<?> mVar = this.mHost;
        Activity activityE = mVar == null ? null : mVar.e();
        if (activityE != null) {
            this.mCalled = false;
            onAttach(activityE);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.P0(1)) {
            return;
        }
        this.mChildFragmentManager.D();
    }

    public Animation onCreateAnimation(int i7, boolean z7, int i8) {
        return null;
    }

    public Animator onCreateAnimator(int i7, boolean z7, int i8) {
        return null;
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.mContentLayoutId;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z7) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        androidx.fragment.app.m<?> mVar = this.mHost;
        Activity activityE = mVar == null ? null : mVar.e();
        if (activityE != null) {
            this.mCalled = false;
            onInflate(activityE, attributeSet, bundle);
        }
    }

    @Override
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z7) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z7) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z7) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.z();
        } else {
            throw new K("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.J(this);
            this.mChildFragmentManager.A();
        } else {
            throw new K(HguUe.hVebWj + this + XjqcfAbdbc.RtCgLyBQ);
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.C(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new InterfaceC1698l() {
            @Override
            public void j(InterfaceC1701o interfaceC1701o, AbstractC1694h.a aVar) {
                View view;
                if (aVar != AbstractC1694h.a.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                k.a(view);
            }
        });
        this.mSavedStateRegistryController.d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.j(AbstractC1694h.a.ON_CREATE);
            return;
        }
        throw new K("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z7 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z7 = true;
        }
        return z7 | this.mChildFragmentManager.E(menu, menuInflater);
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new F(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.b();
            C1685T.b(this.mView, this.mViewLifecycleOwner);
            C1686U.a(this.mView, this.mViewLifecycleOwner);
            b1.e.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.o(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.F();
        this.mLifecycleRegistry.j(AbstractC1694h.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new K("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getState().e(AbstractC1694h.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC1694h.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).d();
            this.mPerformedCreateView = false;
        } else {
            throw new K("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.I0()) {
                return;
            }
            this.mChildFragmentManager.F();
            this.mChildFragmentManager = new v();
            return;
        }
        throw new K("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z7) {
        onMultiWindowModeChanged(z7);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.L(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.M(menu);
    }

    void performPause() {
        this.mChildFragmentManager.O();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1694h.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.j(AbstractC1694h.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new K("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z7) {
        onPictureInPictureModeChanged(z7);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z7 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z7 = true;
        }
        return z7 | this.mChildFragmentManager.Q(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zO0 = this.mFragmentManager.O0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zO0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zO0);
            onPrimaryNavigationFragmentChanged(zO0);
            this.mChildFragmentManager.R();
        }
    }

    void performResume() {
        this.mChildFragmentManager.a1();
        this.mChildFragmentManager.c0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new K("Fragment " + this + " did not call through to super.onResume()");
        }
        C1703q c1703q = this.mLifecycleRegistry;
        AbstractC1694h.a aVar = AbstractC1694h.a.ON_RESUME;
        c1703q.j(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.S();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
        Bundle bundleQ1 = this.mChildFragmentManager.R0();
        if (bundleQ1 != null) {
            bundle.putParcelable("android:support:fragments", bundleQ1);
        }
    }

    void performStart() {
        this.mChildFragmentManager.a1();
        this.mChildFragmentManager.c0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new K(JmBUOGMwkkxg.HzM + this + " did not call through to super.onStart()");
        }
        C1703q c1703q = this.mLifecycleRegistry;
        AbstractC1694h.a aVar = AbstractC1694h.a.ON_START;
        c1703q.j(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.T();
    }

    void performStop() {
        this.mChildFragmentManager.V();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1694h.a.ON_STOP);
        }
        this.mLifecycleRegistry.j(AbstractC1694h.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new K("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.W();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f11012t = true;
    }

    @Override
    public final <I, O> AbstractC2403c<I> registerForActivityResult(AbstractC2431a<I, O> abstractC2431a, InterfaceC2401a<O> interfaceC2401a) {
        return prepareCallInternal(abstractC2431a, new g(), interfaceC2401a);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i7) {
        if (this.mHost != null) {
            getParentFragmentManager().W0(this, strArr, i7);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final ActivityC1663h requireActivity() {
        ActivityC1663h activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.o1(parcelable);
        this.mChildFragmentManager.D();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC1694h.a.ON_CREATE);
            }
        } else {
            throw new K("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z7) {
        ensureAnimationInfo().f11009q = Boolean.valueOf(z7);
    }

    public void setAllowReturnTransitionOverlap(boolean z7) {
        ensureAnimationInfo().f11008p = Boolean.valueOf(z7);
    }

    void setAnimations(int i7, int i8, int i9, int i10) {
        if (this.mAnimationInfo == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        ensureAnimationInfo().f10995c = i7;
        ensureAnimationInfo().f10996d = i8;
        ensureAnimationInfo().f10997e = i9;
        ensureAnimationInfo().f10998f = i10;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.w wVar) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f11002j = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.w wVar) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f11004l = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f11011s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z7) {
        if (this.mHasMenu != z7) {
            this.mHasMenu = z7;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.o();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f10975d) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z7) {
        if (this.mMenuVisible != z7) {
            this.mMenuVisible = z7;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.o();
            }
        }
    }

    void setNextTransition(int i7) {
        if (this.mAnimationInfo == null && i7 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f10999g = i7;
    }

    void setPopDirection(boolean z7) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f10994b = z7;
    }

    void setPostOnViewCreatedAlpha(float f7) {
        ensureAnimationInfo().f11010r = f7;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f11005m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z7) {
        N0.c.k(this);
        this.mRetainInstance = z7;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z7) {
            fragmentManager.l(this);
        } else {
            fragmentManager.m1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f11003k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f11006n = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        jVar.f11000h = arrayList;
        jVar.f11001i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f11007o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i7) {
        if (fragment != null) {
            N0.c.l(this, fragment, i7);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i7;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z7) {
        N0.c.m(this, z7);
        if (!this.mUserVisibleHint && z7 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.c1(fragmentManager.x(this));
        }
        this.mUserVisibleHint = z7;
        this.mDeferStart = this.mState < 5 && !z7;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z7);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        androidx.fragment.app.m<?> mVar = this.mHost;
        if (mVar != null) {
            return mVar.l(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i7) {
        startActivityForResult(intent, i7, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i7 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().Y0(this, intentSender, i7, intent, i8, i9, i10, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f11012t) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f11012t = false;
        } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
            this.mHost.g().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    private Fragment getTargetFragment(boolean z7) {
        String str;
        if (z7) {
            N0.c.j(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.h0(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = androidx.fragment.app.l.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e7) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }

    public final String getString(int i7, Object... objArr) {
        return getResources().getString(i7, objArr);
    }

    public final void postponeEnterTransition(long j7, TimeUnit timeUnit) {
        ensureAnimationInfo().f11012t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.w0().g();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j7));
    }

    public final <I, O> AbstractC2403c<I> registerForActivityResult(AbstractC2431a<I, O> abstractC2431a, AbstractC2405e abstractC2405e, InterfaceC2401a<O> interfaceC2401a) {
        return prepareCallInternal(abstractC2431a, new h(abstractC2405e), interfaceC2401a);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        androidx.fragment.app.m<?> mVar = this.mHost;
        if (mVar != null) {
            mVar.m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().X0(this, intent, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        androidx.fragment.app.m<?> mVar = this.mHost;
        if (mVar != null) {
            LayoutInflater layoutInflaterJ = mVar.j();
            C1644u.a(layoutInflaterJ, this.mChildFragmentManager.x0());
            return layoutInflaterJ;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i7) {
        this();
        this.mContentLayoutId = i7;
    }
}
