package android.view;

import android.os.Build;
import android.view.AbstractC1694h;
import android.view.InterfaceC1698l;
import android.view.InterfaceC1701o;
import android.view.OnBackPressedDispatcher;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import x0.InterfaceC2984a;
import ya.HnSi.PLHvHoayk;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u000458<!B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00109¨\u0006="}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", BuildConfig.FLAVOR, "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lx0/a;", BuildConfig.FLAVOR, "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Lx0/a;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", BuildConfig.FLAVOR, "p", "(Z)V", "q", "()V", "Landroidx/activity/b;", "backEvent", "n", "(Landroidx/activity/b;)V", "m", "k", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "o", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/E;", "onBackPressedCallback", "Landroidx/activity/c;", "i", "(Landroidx/activity/E;)Landroidx/activity/c;", "Landroidx/lifecycle/o;", "owner", "h", "(Landroidx/lifecycle/o;Landroidx/activity/E;)V", "j", "()Z", "l", "a", "Ljava/lang/Runnable;", "b", "Lx0/a;", "Lkotlin/collections/h;", "c", "Lkotlin/collections/h;", "onBackPressedCallbacks", "d", "Landroidx/activity/E;", "inProgressCallback", "Landroid/window/OnBackInvokedCallback;", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "g", "Z", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "LifecycleOnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {

    private final Runnable fallbackOnBackPressed;

    private final InterfaceC2984a<Boolean> onHasEnabledCallbacksChanged;

    private final kotlin.collections.h<E> onBackPressedCallbacks;

    private E inProgressCallback;

    private OnBackInvokedCallback onBackInvokedCallback;

    private OnBackInvokedDispatcher invokedDispatcher;

    private boolean backInvokedCallbackRegistered;

    private boolean hasEnabledCallbacks;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/l;", "Landroidx/activity/c;", "Landroidx/lifecycle/h;", "lifecycle", "Landroidx/activity/E;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/h;Landroidx/activity/E;)V", "Landroidx/lifecycle/o;", "source", "Landroidx/lifecycle/h$a;", "event", BuildConfig.FLAVOR, "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "cancel", "()V", "d", "Landroidx/lifecycle/h;", "e", "Landroidx/activity/E;", "i", "Landroidx/activity/c;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements InterfaceC1698l, InterfaceC1589c {

        private final AbstractC1694h lifecycle;

        private final E onBackPressedCallback;

        private InterfaceC1589c currentCancellable;

        final OnBackPressedDispatcher f8435v;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC1694h abstractC1694h, E e7) {
            Intrinsics.checkNotNullParameter(abstractC1694h, "lifecycle");
            Intrinsics.checkNotNullParameter(e7, "onBackPressedCallback");
            this.f8435v = onBackPressedDispatcher;
            this.lifecycle = abstractC1694h;
            this.onBackPressedCallback = e7;
            abstractC1694h.a(this);
        }

        @Override
        public void cancel() {
            this.lifecycle.d(this);
            this.onBackPressedCallback.i(this);
            InterfaceC1589c interfaceC1589c = this.currentCancellable;
            if (interfaceC1589c != null) {
                interfaceC1589c.cancel();
            }
            this.currentCancellable = null;
        }

        @Override
        public void j(InterfaceC1701o source, AbstractC1694h.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1694h.a.ON_START) {
                this.currentCancellable = this.f8435v.i(this.onBackPressedCallback);
                return;
            }
            if (event != AbstractC1694h.a.ON_STOP) {
                if (event == AbstractC1694h.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC1589c interfaceC1589c = this.currentCancellable;
                if (interfaceC1589c != null) {
                    interfaceC1589c.cancel();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", BuildConfig.FLAVOR, "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends l implements Function1<C1588b, Unit> {
        a() {
            super(1);
        }

        public final void a(C1588b c1588b) {
            Intrinsics.checkNotNullParameter(c1588b, "backEvent");
            OnBackPressedDispatcher.this.n(c1588b);
        }

        public Object invoke(Object obj) {
            a((C1588b) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", BuildConfig.FLAVOR, "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements Function1<C1588b, Unit> {
        b() {
            super(1);
        }

        public final void a(C1588b c1588b) {
            Intrinsics.checkNotNullParameter(c1588b, "backEvent");
            OnBackPressedDispatcher.this.m(c1588b);
        }

        public Object invoke(Object obj) {
            a((C1588b) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends l implements Function0<Unit> {
        c() {
            super(0);
        }

        public Object invoke() {
            m3invoke();
            return Unit.a;
        }

        public final void m3invoke() {
            OnBackPressedDispatcher.this.l();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        d() {
            super(0);
        }

        public Object invoke() {
            m4invoke();
            return Unit.a;
        }

        public final void m4invoke() {
            OnBackPressedDispatcher.this.k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends l implements Function0<Unit> {
        e() {
            super(0);
        }

        public Object invoke() {
            m5invoke();
            return Unit.a;
        }

        public final void m5invoke() {
            OnBackPressedDispatcher.this.l();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$f;", BuildConfig.FLAVOR, "<init>", "()V", "dispatcher", BuildConfig.FLAVOR, "priority", "callback", BuildConfig.FLAVOR, "d", "(Ljava/lang/Object;ILjava/lang/Object;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f {

        public static final f f8441a = new f();

        private f() {
        }

        public static final void c(Function0 function0) {
            function0.invoke();
        }

        public final OnBackInvokedCallback b(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() {
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int priority, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$g;", BuildConfig.FLAVOR, "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/b;", BuildConfig.FLAVOR, "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g {

        public static final g f8442a = new g();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"androidx/activity/OnBackPressedDispatcher$g$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", BuildConfig.FLAVOR, "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements OnBackAnimationCallback {

            final Function1<C1588b, Unit> f8443a;

            final Function1<C1588b, Unit> f8444b;

            final Function0<Unit> f8445c;

            final Function0<Unit> f8446d;

            a(Function1<? super C1588b, Unit> function1, Function1<? super C1588b, Unit> function12, Function0<Unit> function0, Function0<Unit> function02) {
                this.f8443a = function1;
                this.f8444b = function12;
                this.f8445c = function0;
                this.f8446d = function02;
            }

            public void onBackCancelled() {
                this.f8446d.invoke();
            }

            public void onBackInvoked() {
                this.f8445c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f8444b.invoke(new C1588b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.f8443a.invoke(new C1588b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(Function1<? super C1588b, Unit> onBackStarted, Function1<? super C1588b, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$h;", "Landroidx/activity/c;", "Landroidx/activity/E;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/E;)V", BuildConfig.FLAVOR, "cancel", "()V", "d", "Landroidx/activity/E;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class h implements InterfaceC1589c {

        private final E onBackPressedCallback;

        final OnBackPressedDispatcher f8448e;

        public h(OnBackPressedDispatcher onBackPressedDispatcher, E e7) {
            Intrinsics.checkNotNullParameter(e7, "onBackPressedCallback");
            this.f8448e = onBackPressedDispatcher;
            this.onBackPressedCallback = e7;
        }

        @Override
        public void cancel() {
            this.f8448e.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (Intrinsics.b(this.f8448e.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.c();
                this.f8448e.inProgressCallback = null;
            }
            this.onBackPressedCallback.i(this);
            Function0<Unit> function0B = this.onBackPressedCallback.b();
            if (function0B != null) {
                function0B.invoke();
            }
            this.onBackPressedCallback.k(null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    class i extends kotlin.jvm.internal.j implements Function0<Unit> {
        i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void f() {
            ((OnBackPressedDispatcher) ((kotlin.jvm.internal.d) this).receiver).q();
        }

        public Object invoke() {
            f();
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    class j extends kotlin.jvm.internal.j implements Function0<Unit> {
        j(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void f() {
            ((OnBackPressedDispatcher) ((kotlin.jvm.internal.d) this).receiver).q();
        }

        public Object invoke() {
            f();
            return Unit.a;
        }
    }

    public OnBackPressedDispatcher() {
        Runnable runnable = null;
        this(runnable, 1, runnable);
    }

    public final void k() {
        E ePrevious;
        E e7 = this.inProgressCallback;
        if (e7 == null) {
            kotlin.collections.h<E> hVar = this.onBackPressedCallbacks;
            ListIterator listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    ePrevious = 0;
                    break;
                } else {
                    ePrevious = listIterator.previous();
                    if (((E) ePrevious).getIsEnabled()) {
                        break;
                    }
                }
            }
            e7 = ePrevious;
        }
        this.inProgressCallback = null;
        if (e7 != null) {
            e7.c();
        }
    }

    public final void m(C1588b backEvent) {
        E ePrevious;
        E e7 = this.inProgressCallback;
        if (e7 == null) {
            kotlin.collections.h<E> hVar = this.onBackPressedCallbacks;
            ListIterator listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    ePrevious = 0;
                    break;
                } else {
                    ePrevious = listIterator.previous();
                    if (((E) ePrevious).getIsEnabled()) {
                        break;
                    }
                }
            }
            e7 = ePrevious;
        }
        if (e7 != null) {
            e7.e(backEvent);
        }
    }

    public final void n(C1588b backEvent) {
        Object objPrevious;
        kotlin.collections.h<E> hVar = this.onBackPressedCallbacks;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((E) objPrevious).getIsEnabled()) {
                    break;
                }
            }
        }
        E e7 = (E) objPrevious;
        if (this.inProgressCallback != null) {
            k();
        }
        this.inProgressCallback = e7;
        if (e7 != null) {
            e7.f(backEvent);
        }
    }

    private final void p(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            f.f8441a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            f.f8441a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    public final void q() {
        boolean z7 = this.hasEnabledCallbacks;
        kotlin.collections.h<E> hVar = this.onBackPressedCallbacks;
        boolean z8 = false;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((E) it.next()).getIsEnabled()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z8;
        if (z8 != z7) {
            InterfaceC2984a<Boolean> interfaceC2984a = this.onHasEnabledCallbacksChanged;
            if (interfaceC2984a != null) {
                interfaceC2984a.accept(Boolean.valueOf(z8));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z8);
            }
        }
    }

    public final void h(InterfaceC1701o owner, E onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, PLHvHoayk.BhUvVAtg);
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1694h lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == AbstractC1694h.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.a(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.k(new i(this));
    }

    public final InterfaceC1589c i(E onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        h hVar = new h(this, onBackPressedCallback);
        onBackPressedCallback.a(hVar);
        q();
        onBackPressedCallback.k(new j(this));
        return hVar;
    }

    public final boolean getHasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void l() {
        E ePrevious;
        E e7 = this.inProgressCallback;
        if (e7 == null) {
            kotlin.collections.h<E> hVar = this.onBackPressedCallbacks;
            ListIterator listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    ePrevious = 0;
                    break;
                } else {
                    ePrevious = listIterator.previous();
                    if (((E) ePrevious).getIsEnabled()) {
                        break;
                    }
                }
            }
            e7 = ePrevious;
        }
        this.inProgressCallback = null;
        if (e7 != null) {
            e7.d();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invokedDispatcher = invoker;
        p(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(Runnable runnable, InterfaceC2984a<Boolean> interfaceC2984a) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = interfaceC2984a;
        this.onBackPressedCallbacks = new kotlin.collections.h<>();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.onBackInvokedCallback = i7 >= 34 ? g.f8442a.a(new a(), new b(), new c(), new d()) : f.f8441a.b(new e());
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public OnBackPressedDispatcher(Runnable runnable, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : runnable);
    }
}
