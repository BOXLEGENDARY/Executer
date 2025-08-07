package ha;

import E8.c;
import P9.p;
import S9.b;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import ha.InterfaceC0555e;
import ha.M;
import ha.N;
import ha.V0;
import ha.c0;
import ha.g;
import ha.z0;
import ka.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR*\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 \"\u0004\b\u001b\u0010!R\u0011\u0010#\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\"¨\u0006$"}, d2 = {"Lh9/a;", "", "Le9/e;", "externalInquiryController", "<init>", "(Le9/e;)V", "", "f", "()V", "", "shouldShowBackButton", "shouldShowCancelButton", "isEnabled", "c", "(ZZZ)V", "a", "Le9/e;", "Lha/L;", "b", "Lha/L;", "coroutineScope", "Lka/y;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Lka/y;", "navigationStateFlow", "d", "Z", "e", "isNavigationEnabled", "value", "g", "isTransitioningBack", "()Z", "(Z)V", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0586a {

    @NotNull
    private final InterfaceC0555e externalInquiryController;

    @NotNull
    private final ha.L coroutineScope;

    @NotNull
    private final y<NavigationState> navigationStateFlow;

    private boolean shouldShowBackButton;

    private boolean shouldShowCancelButton;

    private boolean isNavigationEnabled;

    private boolean isTransitioningBack;

    @f(c = "com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1", f = "NavigationStateManager.kt", l = {72}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final NavigationState i;

        L(NavigationState navigationState, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = navigationState;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0586a.this.new L(this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                y<c> yVarB = C0586a.this.externalInquiryController.b();
                c cVar = new c(this.i.getShowBackButton(), this.i.getShowCancelButton(), this.i.getIsNavigationEnabled());
                this.d = 1;
                if (yVarB.c(cVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    public C0586a(@NotNull InterfaceC0555e interfaceC0555e) {
        Intrinsics.checkNotNullParameter(interfaceC0555e, "externalInquiryController");
        this.externalInquiryController = interfaceC0555e;
        this.coroutineScope = M.a(c0.a().K(V0.b((z0) null, 1, (Object) null)));
        this.navigationStateFlow = ka.M.a(new NavigationState(true, true, interfaceC0555e.d(), true));
        this.isNavigationEnabled = true;
    }

    public static void d(C0586a c0586a, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = true;
        }
        c0586a.c(z, z2, z3);
    }

    private final void f() {
        NavigationState navigationState = new NavigationState(this.shouldShowBackButton, this.shouldShowCancelButton, this.externalInquiryController.d(), this.isNavigationEnabled && !this.isTransitioningBack);
        if (Intrinsics.b(this.navigationStateFlow.getValue(), navigationState)) {
            return;
        }
        this.navigationStateFlow.setValue(navigationState);
        g.d(this.coroutineScope, (CoroutineContext) null, (N) null, new L(navigationState, null), 3, (Object) null);
    }

    @NotNull
    public final NavigationState b() {
        return (NavigationState) this.navigationStateFlow.getValue();
    }

    public final void c(boolean shouldShowBackButton, boolean shouldShowCancelButton, boolean isEnabled) {
        this.shouldShowBackButton = shouldShowBackButton;
        this.shouldShowCancelButton = shouldShowCancelButton;
        this.isNavigationEnabled = isEnabled;
        f();
    }

    public final void e(boolean z) {
        this.isTransitioningBack = z;
        f();
    }
}
