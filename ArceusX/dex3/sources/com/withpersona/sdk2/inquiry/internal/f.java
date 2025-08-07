package com.withpersona.sdk2.inquiry.internal;

import P9.p;
import P9.t;
import R0.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.G;
import androidx.lifecycle.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import b9.InterfaceC0482a;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.C;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.WorkflowLayout;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.internal.c;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.c;
import com.withpersona.sdk2.inquiry.network.NetworkModule;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import ha.C0338D;
import ha.C0339a;
import ha.C0371C;
import ha.C0379b;
import ha.C0384g;
import ha.C0392o;
import ha.C0401w;
import ha.C0458f;
import ha.C0479x;
import ha.C0556f;
import ha.InterfaceC0551a;
import ha.InterfaceC0555e;
import ha.L;
import ha.N;
import i9.C0595b;
import ka.x;
import ka.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\u0011\u0010$\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010<\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u000b¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/f;", "Landroidx/fragment/app/Fragment;", "LE8/b;", "<init>", "()V", "", "resetState", "", "u", "(Z)V", "A", "()Z", "LE8/a;", "w", "()LE8/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "onResume", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "getContext", "()Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/d;", "d", "LP9/h;", "v", "()Lcom/withpersona/sdk2/inquiry/internal/d;", "args", "Lcom/withpersona/sdk2/inquiry/internal/h;", "e", "x", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "viewModel", "LF8/D;", "i", "y", "()LF8/D;", "workflowStateViewModel", "LG8/c;", "LG8/c;", "binding", "Landroid/content/Context;", "themedContext", "z", "isInline", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class f extends Fragment implements E8.b {

    @NotNull
    private final P9.h args = P9.i.b(new a());

    @NotNull
    private final P9.h viewModel;

    @NotNull
    private final P9.h workflowStateViewModel;

    private G8.c binding;

    private Context themedContext;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/d;", "a", "()Lcom/withpersona/sdk2/inquiry/internal/d;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<com.withpersona.sdk2.inquiry.internal.d> {
        a() {
            super(0);
        }

        @NotNull
        public final com.withpersona.sdk2.inquiry.internal.d invoke() {
            return new com.withpersona.sdk2.inquiry.internal.d(f.this.getArguments());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$createAndLaunchWorkflow$1", f = "InquiryFragment.kt", l = {283}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ha.m i;

        b(ha.m mVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.i = mVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return f.this.new b(this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                com.withpersona.sdk2.inquiry.internal.h hVarX = f.this.x();
                this.d = 1;
                obj = hVarX.B(this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            InquiryWorkflow.Output output = (InquiryWorkflow.Output) obj;
            String sessionToken = output.getSessionToken();
            if (sessionToken != null) {
                this.i.d().g(sessionToken);
            }
            if (output instanceof InquiryWorkflow.Output.Complete) {
                f fVar = f.this;
                String strN = fVar.v().n();
                Bundle bundle = new Bundle();
                f fVar2 = f.this;
                bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
                InquiryWorkflow.Output.Complete complete = (InquiryWorkflow.Output.Complete) output;
                bundle.putString("INQUIRY_ID_KEY", complete.getInquiryId());
                bundle.putString("INQUIRY_STATUS_KEY", complete.getInquiryStatus());
                bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(complete.a()));
                bundle.putParcelable("COLLECTED_DATA", C0339a.d(fVar2.x().getDataCollector().a()));
                bundle.putString("SESSION_TOKEN_KEY", com.withpersona.sdk2.inquiry.internal.d.INSTANCE.a(output.getSessionToken()));
                Unit unit = Unit.a;
                androidx.fragment.app.n.a(fVar, strN, bundle);
            } else if (output instanceof InquiryWorkflow.Output.ReinitializeWithFallbackMode) {
                f.this.x().o().o(((InquiryWorkflow.Output.ReinitializeWithFallbackMode) output).getInquiryId());
                f.this.x().v().o(output.getSessionToken());
                f.this.x().C(true);
            } else if (output instanceof InquiryWorkflow.Output.Cancel) {
                String sessionToken2 = output.getSessionToken();
                if (sessionToken2 != null) {
                    this.i.d().j(sessionToken2);
                }
                f fVar3 = f.this;
                String strN2 = fVar3.v().n();
                Bundle bundle2 = new Bundle();
                bundle2.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
                InquiryWorkflow.Output.Cancel cancel = (InquiryWorkflow.Output.Cancel) output;
                if (C0458f.f(cancel.getInquiryId())) {
                    bundle2.putString("INQUIRY_ID_KEY", cancel.getInquiryId());
                    bundle2.putString("SESSION_TOKEN_KEY", com.withpersona.sdk2.inquiry.internal.d.INSTANCE.a(output.getSessionToken()));
                }
                Unit unit2 = Unit.a;
                androidx.fragment.app.n.a(fVar3, strN2, bundle2);
            } else if (output instanceof InquiryWorkflow.Output.Error) {
                String sessionToken3 = output.getSessionToken();
                if (sessionToken3 != null) {
                    this.i.d().f(sessionToken3, ((InquiryWorkflow.Output.Error) output).getCause());
                }
                f fVar4 = f.this;
                String strN3 = fVar4.v().n();
                Bundle bundle3 = new Bundle();
                bundle3.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
                InquiryWorkflow.Output.Error error = (InquiryWorkflow.Output.Error) output;
                bundle3.putString("ERROR_DEBUG_MESSAGE_KEY", error.getDebugMessage());
                bundle3.putParcelable("ERROR_CODE_KEY", error.getErrorCode());
                Unit unit3 = Unit.a;
                androidx.fragment.app.n.a(fVar4, strN3, bundle3);
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"com/withpersona/sdk2/inquiry/internal/f$c", "Le9/e;", "Lka/g;", "Le9/a;", "a", "Lka/g;", "c", "()Lka/g;", "controllerRequestFlow", "Lka/y;", "LE8/c;", "b", "Lka/y;", "()Lka/y;", "screenStateFlow", "Lka/x;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "Lka/x;", "()Lka/x;", "eventFlow", "", "d", "Z", "()Z", "isNavBarEnabled", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class c implements InterfaceC0555e {

        @NotNull
        private final ka.g<InterfaceC0551a> controllerRequestFlow;

        @NotNull
        private final y<E8.c> screenStateFlow;

        @NotNull
        private final x<InquiryEvent> eventFlow;

        private final boolean isNavBarEnabled;

        c(f fVar) {
            this.controllerRequestFlow = fVar.x().h();
            this.screenStateFlow = fVar.x().t();
            this.eventFlow = fVar.x().m();
            this.isNavBarEnabled = fVar.v().z();
        }

        @Override
        @NotNull
        public x<InquiryEvent> a() {
            return this.eventFlow;
        }

        @Override
        @NotNull
        public y<E8.c> b() {
            return this.screenStateFlow;
        }

        @Override
        @NotNull
        public ka.g<InterfaceC0551a> c() {
            return this.controllerRequestFlow;
        }

        @Override
        public boolean getIsNavBarEnabled() {
            return this.isNavBarEnabled;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1", f = "InquiryFragment.kt", l = {102}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements ka.h {
            final f d;

            a(f fVar) {
                this.d = fVar;
            }

            public final Object a(boolean z, @NotNull Continuation<? super Unit> continuation) {
                this.d.u(true);
                return Unit.a;
            }

            public Object c(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return f.this.new d(continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.g gVarM = ka.i.m(f.this.x().n(), 1);
                a aVar = new a(f.this);
                this.d = 1;
                if (gVarM.a(aVar, this) == objC) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/O$b;", "a", "()Landroidx/lifecycle/O$b;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class e extends kotlin.jvm.internal.l implements Function0<O.b> {
        final Fragment d;
        final P9.h e;

        public e(Fragment fragment, P9.h hVar) {
            super(0);
            this.d = fragment;
            this.e = hVar;
        }

        @NotNull
        public final O.b invoke() {
            O.b defaultViewModelProviderFactory;
            androidx.lifecycle.g gVarA = G.a(this.e);
            androidx.lifecycle.g gVar = gVarA instanceof androidx.lifecycle.g ? gVarA : null;
            return (gVar == null || (defaultViewModelProviderFactory = gVar.getDefaultViewModelProviderFactory()) == null) ? this.d.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class C0132f extends kotlin.jvm.internal.l implements Function0<Fragment> {
        final Fragment d;

        public C0132f(Fragment fragment) {
            super(0);
            this.d = fragment;
        }

        @NotNull
        public final Fragment invoke() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/S;", "a", "()Landroidx/lifecycle/S;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class g extends kotlin.jvm.internal.l implements Function0<S> {
        final Function0 d;

        public g(Function0 function0) {
            super(0);
            this.d = function0;
        }

        @NotNull
        public final S invoke() {
            return (S) this.d.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/Q;", "a", "()Landroidx/lifecycle/Q;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class h extends kotlin.jvm.internal.l implements Function0<Q> {
        final P9.h d;

        public h(P9.h hVar) {
            super(0);
            this.d = hVar;
        }

        @NotNull
        public final Q invoke() {
            return G.a(this.d).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "LR0/a;", "a", "()LR0/a;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class i extends kotlin.jvm.internal.l implements Function0<R0.a> {
        final Function0 d;
        final P9.h e;

        public i(Function0 function0, P9.h hVar) {
            super(0);
            this.d = function0;
            this.e = hVar;
        }

        @NotNull
        public final R0.a invoke() {
            R0.a aVar;
            Function0 function0 = this.d;
            if (function0 != null && (aVar = (R0.a) function0.invoke()) != null) {
                return aVar;
            }
            androidx.lifecycle.g gVarA = G.a(this.e);
            androidx.lifecycle.g gVar = gVarA instanceof androidx.lifecycle.g ? gVarA : null;
            return gVar != null ? gVar.getDefaultViewModelCreationExtras() : a.a.b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/O$b;", "a", "()Landroidx/lifecycle/O$b;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class j extends kotlin.jvm.internal.l implements Function0<O.b> {
        final Fragment d;
        final P9.h e;

        public j(Fragment fragment, P9.h hVar) {
            super(0);
            this.d = fragment;
            this.e = hVar;
        }

        @NotNull
        public final O.b invoke() {
            O.b defaultViewModelProviderFactory;
            androidx.lifecycle.g gVarA = G.a(this.e);
            androidx.lifecycle.g gVar = gVarA instanceof androidx.lifecycle.g ? gVarA : null;
            return (gVar == null || (defaultViewModelProviderFactory = gVar.getDefaultViewModelProviderFactory()) == null) ? this.d.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class k extends kotlin.jvm.internal.l implements Function0<Fragment> {
        final Fragment d;

        public k(Fragment fragment) {
            super(0);
            this.d = fragment;
        }

        @NotNull
        public final Fragment invoke() {
            return this.d;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/S;", "a", "()Landroidx/lifecycle/S;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class l extends kotlin.jvm.internal.l implements Function0<S> {
        final Function0 d;

        public l(Function0 function0) {
            super(0);
            this.d = function0;
        }

        @NotNull
        public final S invoke() {
            return (S) this.d.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "Landroidx/lifecycle/Q;", "a", "()Landroidx/lifecycle/Q;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class m extends kotlin.jvm.internal.l implements Function0<Q> {
        final P9.h d;

        public m(P9.h hVar) {
            super(0);
            this.d = hVar;
        }

        @NotNull
        public final Q invoke() {
            return G.a(this.d).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/L;", "VM", "LR0/a;", "a", "()LR0/a;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class n extends kotlin.jvm.internal.l implements Function0<R0.a> {
        final Function0 d;
        final P9.h e;

        public n(Function0 function0, P9.h hVar) {
            super(0);
            this.d = function0;
            this.e = hVar;
        }

        @NotNull
        public final R0.a invoke() {
            R0.a aVar;
            Function0 function0 = this.d;
            if (function0 != null && (aVar = (R0.a) function0.invoke()) != null) {
                return aVar;
            }
            androidx.lifecycle.g gVarA = G.a(this.e);
            androidx.lifecycle.g gVar = gVarA instanceof androidx.lifecycle.g ? gVarA : null;
            return gVar != null ? gVar.getDefaultViewModelCreationExtras() : a.a.b;
        }
    }

    public f() {
        C0132f c0132f = new C0132f(this);
        P9.l lVar = P9.l.i;
        P9.h hVarA = P9.i.a(lVar, new g(c0132f));
        this.viewModel = G.b(this, z.b(com.withpersona.sdk2.inquiry.internal.h.class), new h(hVarA), new i(null, hVarA), new j(this, hVarA));
        P9.h hVarA2 = P9.i.a(lVar, new l(new k(this)));
        this.workflowStateViewModel = G.b(this, z.b(C0338D.class), new m(hVarA2), new n(null, hVarA2), new e(this, hVarA2));
    }

    private final boolean A() {
        String strR = v().r();
        if (strR == null || !StringsKt.J(strR, '\n', false, 2, (Object) null)) {
            return true;
        }
        String strN = v().n();
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.y);
        Unit unit = Unit.a;
        androidx.fragment.app.n.a(this, strN, bundle);
        getParentFragmentManager().d1();
        return false;
    }

    public final void u(boolean resetState) {
        com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar;
        InquiryWorkflow.b templateProps;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String packageName = contextRequireContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String strQ = StringsKt.F(packageName, "com.withpersona", false, 2, (Object) null) ? v().q() : "https://withpersona.com";
        String packageName2 = contextRequireContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
        String strY = StringsKt.F(packageName2, "com.withpersona", false, 2, (Object) null) ? v().y() : "https://webrtc-consumer.withpersona.com";
        String packageName3 = contextRequireContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName3, "getPackageName(...)");
        String strI = StringsKt.F(packageName3, "com.withpersona", false, 2, (Object) null) ? v().i() : "https://inquiry-fallback.withpersona.com";
        InterfaceC0482a dataCollector = v().o() ? x().getDataCollector() : new b9.d();
        FallbackMode fallbackModeH = (((Boolean) x().n().getValue()).booleanValue() || v().s() != null) ? FallbackMode.ALWAYS : v().h();
        if (fallbackModeH == FallbackMode.ALWAYS) {
            aVar = new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(c.a.a);
        } else {
            LocalStaticInquiryTemplate localStaticInquiryTemplateS = v().s();
            LocalStaticInquiryTemplate localStaticInquiryTemplate = localStaticInquiryTemplateS instanceof LocalStaticInquiryTemplate ? localStaticInquiryTemplateS : null;
            aVar = localStaticInquiryTemplate != null ? new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(new c.b(localStaticInquiryTemplate.getResourceId())) : new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(c.a.a);
        }
        c cVar = new c(this);
        c.a aVarA = com.withpersona.sdk2.inquiry.internal.c.a();
        androidx.fragment.app.h hVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(hVarRequireActivity, "requireActivity(...)");
        ha.m mVarB = aVarA.i(new ha.i(hVarRequireActivity)).e(new C0384g(x().q(), x().l(), x().u())).f(new C0392o(x().k())).m(new C0401w(x().r())).l(new P8.d(x().p())).c(new C0379b(x().i())).k(new NetworkModule(v().x(), v().p(), v().g(), v().l())).d(new b9.b(dataCollector)).j(new com.withpersona.sdk2.inquiry.internal.network.b(strQ, strY, strI)).a(aVar).g(new C0556f(cVar)).o(new C0479x(v().c(), v().d())).n(new C0371C(x().s())).h(new I8.c(fallbackModeH, v().f(), y().getSavedStateHandle())).b();
        String str = (String) x().o().f();
        String str2 = (String) x().v().f();
        com.withpersona.sdk2.inquiry.internal.h hVarX = x();
        Intrinsics.d(mVarB);
        if (str != null) {
            templateProps = new InquiryWorkflow.b.InquiryProps(str, str2, v().g(), v().f(), v().v(), false, 32, null);
        } else {
            String strT = v().t();
            String strU = v().u();
            String strA = v().a();
            String strM = v().m();
            InquiryFieldsMap inquiryFieldsMapJ = v().j();
            templateProps = new InquiryWorkflow.b.TemplateProps(strT, strU, strA, strM, v().g(), inquiryFieldsMapJ != null ? inquiryFieldsMapJ.a() : null, v().w(), v().s(), v().f(), v().v(), false, 1024, null);
        }
        hVarX.g(mVarB, templateProps, y(), resetState);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        WorkflowLayout workflowLayout = new WorkflowLayout(contextRequireContext2, null, 2, null);
        androidx.lifecycle.h lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        WorkflowLayout.b(workflowLayout, lifecycle, x().A(y()), null, new ViewEnvironment(F.k(new Pair[]{t.a(C.INSTANCE, x().D()), t.a(C0595b.b, mVarB.f())})), 4, null);
        G8.c cVar2 = this.binding;
        if (cVar2 == null) {
            Intrinsics.v("binding");
            cVar2 = null;
        }
        cVar2.a().removeAllViews();
        G8.c cVar3 = this.binding;
        if (cVar3 == null) {
            Intrinsics.v("binding");
            cVar3 = null;
        }
        cVar3.a().addView(workflowLayout);
        androidx.lifecycle.o viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ha.g.d(androidx.lifecycle.p.a(viewLifecycleOwner), (CoroutineContext) null, (N) null, new b(mVarB, null), 3, (Object) null);
    }

    public final com.withpersona.sdk2.inquiry.internal.d v() {
        return (com.withpersona.sdk2.inquiry.internal.d) this.args.getValue();
    }

    private final E8.a w() {
        E8.a parentFragment = getParentFragment();
        E8.a activity = getActivity();
        if (parentFragment instanceof E8.a) {
            return parentFragment;
        }
        if (activity instanceof E8.a) {
            return activity;
        }
        return null;
    }

    public final com.withpersona.sdk2.inquiry.internal.h x() {
        return (com.withpersona.sdk2.inquiry.internal.h) this.viewModel.getValue();
    }

    private final C0338D y() {
        return (C0338D) this.workflowStateViewModel.getValue();
    }

    private final boolean z() {
        return requireActivity().getClass() != InquiryActivity.class;
    }

    public Context getContext() {
        Context context = this.themedContext;
        return context == null ? super.getContext() : context;
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (!z()) {
            this.themedContext = context;
        } else {
            Integer numV = v().v();
            this.themedContext = new androidx.appcompat.view.d(context, (numV == null || numV.intValue() == 0) ? S8.f.b : numV.intValue());
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        H8.c.a(contextRequireContext);
        if (v().e() || v().b()) {
            H8.c.d(contextRequireContext);
        }
    }

    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        G8.c cVarD = G8.c.d(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(cVarD, "inflate(...)");
        this.binding = cVarD;
        if (cVarD == null) {
            Intrinsics.v("binding");
            cVarD = null;
        }
        FrameLayout frameLayoutA = cVarD.a();
        Intrinsics.checkNotNullExpressionValue(frameLayoutA, "getRoot(...)");
        return frameLayoutA;
    }

    public void onDestroy() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        H8.c.e(contextRequireContext);
        E8.a aVarW = w();
        if (aVarW != null) {
            aVarW.a();
        }
        super.onDestroy();
        x().x();
    }

    public void onDetach() {
        super.onDetach();
        this.themedContext = null;
    }

    public void onResume() {
        super.onResume();
        x().y();
    }

    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        try {
            if (A()) {
                x().w(this);
                x().o().o(v().k());
                x().v().o(v().r());
                androidx.lifecycle.o viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                ha.g.d(androidx.lifecycle.p.a(viewLifecycleOwner), (CoroutineContext) null, (N) null, new d(null), 3, (Object) null);
                u(false);
                E8.a aVarW = w();
                if (aVarW != null) {
                    aVarW.b(this);
                }
            }
        } catch (Exception e2) {
            if (!v().b()) {
                throw e2;
            }
            if (v().e()) {
                H8.c.c(contextRequireContext).c(e2);
            }
            String strN = v().n();
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.D);
            Unit unit = Unit.a;
            androidx.fragment.app.n.a(this, strN, bundle);
        }
    }
}
