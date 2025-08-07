package android.view;

import H3.QdLC.QcdySgfdST;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.AbstractC1694h;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ya.HnSi.PLHvHoayk;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0003\r\u0007\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/B;", "Landroid/app/Fragment;", "<init>", "()V", "Landroidx/lifecycle/B$a;", "listener", BuildConfig.FLAVOR, "b", "(Landroidx/lifecycle/B$a;)V", "d", "c", "Landroidx/lifecycle/h$a;", "event", "a", "(Landroidx/lifecycle/h$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "processListener", "e", "Landroidx/lifecycle/B$a;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FragmentC1668B extends Fragment {

    public static final Companion INSTANCE = new Companion(null);

    private a processListener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/B$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "onCreate", "()V", "a", "onResume", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a();

        void onCreate();

        void onResume();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\u00020\r*\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/B$b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "activity", BuildConfig.FLAVOR, "c", "(Landroid/app/Activity;)V", "Landroidx/lifecycle/h$a;", "event", "a", "(Landroid/app/Activity;Landroidx/lifecycle/h$a;)V", "Landroidx/lifecycle/B;", "b", "(Landroid/app/Activity;)Landroidx/lifecycle/B;", "get$annotations", "reportFragment", BuildConfig.FLAVOR, "REPORT_FRAGMENT_TAG", "Ljava/lang/String;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity, AbstractC1694h.a event) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(event, "event");
            if (activity instanceof InterfaceC1704r) {
                ((InterfaceC1704r) activity).getLifecycle().j(event);
            } else if (activity instanceof InterfaceC1701o) {
                AbstractC1694h lifecycle = ((InterfaceC1701o) activity).getLifecycle();
                if (lifecycle instanceof C1703q) {
                    ((C1703q) lifecycle).j(event);
                }
            }
        }

        public final FragmentC1668B b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(PLHvHoayk.Rbcl);
            Intrinsics.e(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC1668B) fragmentFindFragmentByTag;
        }

        public final void c(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.INSTANCE.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC1668B(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000e¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/B$c;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", BuildConfig.FLAVOR, "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "savedInstanceState", "onActivityPostCreated", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion", "a", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Application.ActivityLifecycleCallbacks {

        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/B$c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "activity", BuildConfig.FLAVOR, "a", "(Landroid/app/Activity;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            private Companion() {
            }
        }

        public static final void registerIn(Activity activity) {
            INSTANCE.a(activity);
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, QcdySgfdST.mWbgYrHilPt);
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override
        public void onActivityPostCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC1668B.INSTANCE.a(activity, AbstractC1694h.a.ON_CREATE);
        }

        @Override
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC1668B.INSTANCE.a(activity, AbstractC1694h.a.ON_RESUME);
        }

        @Override
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC1668B.INSTANCE.a(activity, AbstractC1694h.a.ON_START);
        }

        @Override
        public void onActivityPreDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC1668B.INSTANCE.a(activity, AbstractC1694h.a.ON_DESTROY);
        }

        @Override
        public void onActivityPrePaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC1668B.INSTANCE.a(activity, AbstractC1694h.a.ON_PAUSE);
        }

        @Override
        public void onActivityPreStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC1668B.INSTANCE.a(activity, AbstractC1694h.a.ON_STOP);
        }

        @Override
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    private final void a(AbstractC1694h.a event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion companion = INSTANCE;
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            companion.a(activity, event);
        }
    }

    private final void b(a listener) {
        if (listener != null) {
            listener.onCreate();
        }
    }

    private final void c(a listener) {
        if (listener != null) {
            listener.onResume();
        }
    }

    private final void d(a listener) {
        if (listener != null) {
            listener.a();
        }
    }

    public final void e(a processListener) {
        this.processListener = processListener;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b(this.processListener);
        a(AbstractC1694h.a.ON_CREATE);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        a(AbstractC1694h.a.ON_DESTROY);
        this.processListener = null;
    }

    @Override
    public void onPause() {
        super.onPause();
        a(AbstractC1694h.a.ON_PAUSE);
    }

    @Override
    public void onResume() {
        super.onResume();
        c(this.processListener);
        a(AbstractC1694h.a.ON_RESUME);
    }

    @Override
    public void onStart() {
        super.onStart();
        d(this.processListener);
        a(AbstractC1694h.a.ON_START);
    }

    @Override
    public void onStop() {
        super.onStop();
        a(AbstractC1694h.a.ON_STOP);
    }
}
