package androidx.fragment.app;

import H3.QdLC.QcdySgfdST;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.AbstractC1694h;
import android.view.C1683Q;
import android.view.C1703q;
import android.view.ComponentActivity;
import android.view.InterfaceC1684S;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.OnBackPressedDispatcher;
import android.view.View;
import android.view.Window;
import androidx.core.app.b;
import androidx.core.view.InterfaceC1648w;
import androidx.savedstate.a;
import d.InterfaceC2379b;
import e.AbstractC2405e;
import e.InterfaceC2406f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import x0.InterfaceC2984a;

public class ActivityC1663h extends ComponentActivity implements b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1703q mFragmentLifecycleRegistry;
    final C1666k mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends m<ActivityC1663h> implements androidx.core.content.b, androidx.core.content.c, androidx.core.app.q, androidx.core.app.r, InterfaceC1684S, android.view.G, InterfaceC2406f, b1.d, x, InterfaceC1648w {
        public a() {
            super(ActivityC1663h.this);
        }

        @Override
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC1663h.this.onAttachFragment(fragment);
        }

        @Override
        public void addMenuProvider(androidx.core.view.B b2) {
            ActivityC1663h.this.addMenuProvider(b2);
        }

        @Override
        public void addOnConfigurationChangedListener(InterfaceC2984a<Configuration> interfaceC2984a) {
            ActivityC1663h.this.addOnConfigurationChangedListener(interfaceC2984a);
        }

        @Override
        public void addOnMultiWindowModeChangedListener(InterfaceC2984a<androidx.core.app.i> interfaceC2984a) {
            ActivityC1663h.this.addOnMultiWindowModeChangedListener(interfaceC2984a);
        }

        @Override
        public void addOnPictureInPictureModeChangedListener(InterfaceC2984a<androidx.core.app.t> interfaceC2984a) {
            ActivityC1663h.this.addOnPictureInPictureModeChangedListener(interfaceC2984a);
        }

        @Override
        public void addOnTrimMemoryListener(InterfaceC2984a<Integer> interfaceC2984a) {
            ActivityC1663h.this.addOnTrimMemoryListener(interfaceC2984a);
        }

        @Override
        public View c(int i7) {
            return ActivityC1663h.this.findViewById(i7);
        }

        @Override
        public boolean d() {
            Window window = ActivityC1663h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override
        public AbstractC2405e getActivityResultRegistry() {
            return ActivityC1663h.this.getActivityResultRegistry();
        }

        @Override
        public AbstractC1694h getLifecycle() {
            return ActivityC1663h.this.mFragmentLifecycleRegistry;
        }

        @Override
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC1663h.this.getOnBackPressedDispatcher();
        }

        @Override
        public androidx.savedstate.a getSavedStateRegistry() {
            return ActivityC1663h.this.getSavedStateRegistry();
        }

        @Override
        public C1683Q getViewModelStore() {
            return ActivityC1663h.this.getViewModelStore();
        }

        @Override
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC1663h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override
        public LayoutInflater j() {
            return ActivityC1663h.this.getLayoutInflater().cloneInContext(ActivityC1663h.this);
        }

        @Override
        public boolean l(String str) {
            return androidx.core.app.b.w(ActivityC1663h.this, str);
        }

        @Override
        public void o() {
            p();
        }

        public void p() {
            ActivityC1663h.this.invalidateMenu();
        }

        @Override
        public ActivityC1663h i() {
            return ActivityC1663h.this;
        }

        @Override
        public void removeMenuProvider(androidx.core.view.B b2) {
            ActivityC1663h.this.removeMenuProvider(b2);
        }

        @Override
        public void removeOnConfigurationChangedListener(InterfaceC2984a<Configuration> interfaceC2984a) {
            ActivityC1663h.this.removeOnConfigurationChangedListener(interfaceC2984a);
        }

        @Override
        public void removeOnMultiWindowModeChangedListener(InterfaceC2984a<androidx.core.app.i> interfaceC2984a) {
            ActivityC1663h.this.removeOnMultiWindowModeChangedListener(interfaceC2984a);
        }

        @Override
        public void removeOnPictureInPictureModeChangedListener(InterfaceC2984a<androidx.core.app.t> interfaceC2984a) {
            ActivityC1663h.this.removeOnPictureInPictureModeChangedListener(interfaceC2984a);
        }

        @Override
        public void removeOnTrimMemoryListener(InterfaceC2984a<Integer> interfaceC2984a) {
            ActivityC1663h.this.removeOnTrimMemoryListener(interfaceC2984a);
        }
    }

    public ActivityC1663h() {
        this.mFragments = C1666k.b(new a());
        this.mFragmentLifecycleRegistry = new C1703q(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new a.c() {
            @Override
            public final Bundle a() {
                return this.f11195a.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f11196a.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f11197a.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC2379b() {
            @Override
            public final void a(Context context) {
                this.f11198a.lambda$init$3(context);
            }
        });
    }

    public Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.j(AbstractC1694h.a.ON_STOP);
        return new Bundle();
    }

    public void lambda$init$1(Configuration configuration) {
        this.mFragments.m();
    }

    public void lambda$init$2(Intent intent) {
        this.mFragments.m();
    }

    public void lambda$init$3(Context context) {
        this.mFragments.a(null);
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC1694h.b bVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.v0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), bVar);
                }
                F f7 = fragment.mViewLifecycleOwner;
                if (f7 != null && f7.getLifecycle().getState().e(AbstractC1694h.b.STARTED)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getState().e(AbstractC1694h.b.STARTED)) {
                    fragment.mLifecycleRegistry.o(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print(QcdySgfdST.BaLfwizL);
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().Y(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC1694h.b.CREATED)) {
        }
    }

    @Override
    protected void onActivityResult(int i7, int i8, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i7, i8, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.j(AbstractC1694h.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.j(AbstractC1694h.a.ON_DESTROY);
    }

    @Override
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.j(AbstractC1694h.a.ON_PAUSE);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.j(AbstractC1694h.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.j(AbstractC1694h.a.ON_START);
        this.mFragments.i();
    }

    @Override
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.j(AbstractC1694h.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.w wVar) {
        androidx.core.app.b.u(this, wVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.w wVar) {
        androidx.core.app.b.v(this, wVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i7) {
        startActivityFromFragment(fragment, intent, i7, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        if (i7 == -1) {
            androidx.core.app.b.y(this, intentSender, i7, intent, i8, i9, i10, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.p(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.r(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.z(this);
    }

    @Override
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i7) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (i7 == -1) {
            androidx.core.app.b.x(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i7, bundle);
        }
    }

    @Override
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public ActivityC1663h(int i7) {
        super(i7);
        this.mFragments = C1666k.b(new a());
        this.mFragmentLifecycleRegistry = new C1703q(this);
        this.mStopped = true;
        init();
    }
}
