package android.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.AbstractC1694h;
import android.view.FragmentC1668B;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002./B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Landroidx/lifecycle/A;", "Landroidx/lifecycle/o;", "<init>", "()V", BuildConfig.FLAVOR, "f", "e", "d", "g", "j", "k", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "I", "startedCounter", "resumedCounter", BuildConfig.FLAVOR, "i", "Z", "pauseSent", "v", "stopSent", "Landroid/os/Handler;", "w", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/q;", "y", "Landroidx/lifecycle/q;", "registry", "Ljava/lang/Runnable;", "z", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/B$a;", "A", "Landroidx/lifecycle/B$a;", "initializationListener", "Landroidx/lifecycle/h;", "getLifecycle", "()Landroidx/lifecycle/h;", "lifecycle", "B", "a", "b", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1667A implements InterfaceC1701o {

    public static final Companion INSTANCE = new Companion(null);

    private static final C1667A f11242C = new C1667A();

    private int startedCounter;

    private int resumedCounter;

    private Handler handler;

    private boolean pauseSent = true;

    private boolean stopSent = true;

    private final C1703q registry = new C1703q(this);

    private final Runnable delayedPauseRunnable = new Runnable() {
        @Override
        public final void run() {
            C1667A.i(this.f11425d);
        }
    };

    private final FragmentC1668B.a initializationListener = new d();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/A$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", BuildConfig.FLAVOR, "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        public static final a f11251a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/A$b;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/o;", "a", "()Landroidx/lifecycle/o;", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;)V", "Landroidx/lifecycle/A;", "newInstance", "Landroidx/lifecycle/A;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC1701o a() {
            return C1667A.f11242C;
        }

        public final void b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C1667A.f11242C.h(context);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/A$c", "Landroidx/lifecycle/e;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends C1691e {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/A$c$a", "Landroidx/lifecycle/e;", "Landroid/app/Activity;", "activity", BuildConfig.FLAVOR, "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends C1691e {
            final C1667A this$0;

            a(C1667A c1667a) {
                this.this$0 = c1667a;
            }

            @Override
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC1668B.INSTANCE.b(activity).e(C1667A.this.initializationListener);
            }
        }

        @Override
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C1667A.this.d();
        }

        @Override
        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(C1667A.this));
        }

        @Override
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C1667A.this.g();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"androidx/lifecycle/A$d", "Landroidx/lifecycle/B$a;", BuildConfig.FLAVOR, "onCreate", "()V", "a", "onResume", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements FragmentC1668B.a {
        d() {
        }

        @Override
        public void a() {
            C1667A.this.f();
        }

        @Override
        public void onCreate() {
        }

        @Override
        public void onResume() {
            C1667A.this.e();
        }
    }

    private C1667A() {
    }

    public static final void i(C1667A c1667a) {
        Intrinsics.checkNotNullParameter(c1667a, "this$0");
        c1667a.j();
        c1667a.k();
    }

    public static final InterfaceC1701o l() {
        return INSTANCE.a();
    }

    public final void d() {
        int i7 = this.resumedCounter - 1;
        this.resumedCounter = i7;
        if (i7 == 0) {
            Handler handler = this.handler;
            Intrinsics.d(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void e() {
        int i7 = this.resumedCounter + 1;
        this.resumedCounter = i7;
        if (i7 == 1) {
            if (this.pauseSent) {
                this.registry.j(AbstractC1694h.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                Intrinsics.d(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void f() {
        int i7 = this.startedCounter + 1;
        this.startedCounter = i7;
        if (i7 == 1 && this.stopSent) {
            this.registry.j(AbstractC1694h.a.ON_START);
            this.stopSent = false;
        }
    }

    public final void g() {
        this.startedCounter--;
        k();
    }

    @Override
    public AbstractC1694h getLifecycle() {
        return this.registry;
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler();
        this.registry.j(AbstractC1694h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.j(AbstractC1694h.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.j(AbstractC1694h.a.ON_STOP);
            this.stopSent = true;
        }
    }
}
