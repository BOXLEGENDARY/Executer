package com.withpersona.sdk2.inquiry.internal;

import P9.p;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.E;
import androidx.lifecycle.L;
import androidx.lifecycle.w;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.C;
import com.squareup.workflow1.ui.C0489a;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow;
import com.withpersona.sdk2.inquiry.modal.ModalWorkflow;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import ha.C0338D;
import ha.C0373E;
import ha.C0376H;
import ha.C0378a;
import ha.C0381d;
import ha.C0388k;
import ha.C0394q;
import ha.C0402y;
import ha.InterfaceC0551a;
import ha.InterfaceC0883h;
import ha.N;
import ha.c0;
import ha.t;
import java.util.List;
import ka.B;
import ka.D;
import ka.K;
import ka.M;
import ka.x;
import ka.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001uB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010-R.\u00101\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020/0.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R*\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\u0017\u0010L\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b=\u0010KR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020N0M8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b3\u0010QR#\u0010W\u001a\b\u0012\u0004\u0012\u00020S0,8\u0006¢\u0006\u0012\n\u0004\b8\u0010-\u0012\u0004\bV\u0010$\u001a\u0004\bT\u0010UR#\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0M8\u0006¢\u0006\u0012\n\u0004\b?\u0010P\u0012\u0004\bY\u0010$\u001a\u0004\bO\u0010QR&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020]0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u00110[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010_\u001a\u0004\bd\u0010aR,\u0010j\u001a\u0014\u0012\u0004\u0012\u00020f\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0g0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010_\u001a\u0004\bi\u0010aR2\u0010l\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0k\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0g0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010_\u001a\u0004\bI\u0010aR&\u0010m\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00110[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010_\u001a\u0004\bh\u0010aR.\u0010n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0k\u0012\u0006\u0012\u0004\u0018\u00010c0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010_\u001a\u0004\bD\u0010aR&\u0010q\u001a\u000e\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020p0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010_\u001a\u0004\b^\u0010aR&\u0010t\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020s0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010_\u001a\u0004\b6\u0010a¨\u0006v"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/h;", "Landroidx/lifecycle/L;", "Landroidx/lifecycle/E;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/E;)V", "Le/b;", "activityResultCaller", "", "z", "(Le/b;)V", "LF8/m;", "component", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;", "props", "LF8/D;", "workflowStateViewModel", "", "resetState", "g", "(LF8/m;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$b;LF8/D;Z)V", "w", "newValue", "C", "(Z)V", "Lka/K;", "", "A", "(LF8/D;)Lka/K;", "Lcom/squareup/workflow1/ui/C;", "D", "()Lcom/squareup/workflow1/ui/C;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "B", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x", "()V", "y", "force", "f", "d", "Landroidx/lifecycle/E;", "e", "LF8/m;", "Lka/y;", "Lka/y;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow;", "Lcom/withpersona/sdk2/inquiry/modal/ModalWorkflow;", "workflow", "Lja/d;", "h", "Lja/d;", "result", "i", "Lka/K;", "n", "()Lka/K;", "forceFallbackModeFlow", "Landroidx/lifecycle/w;", "", "j", "Landroidx/lifecycle/w;", "o", "()Landroidx/lifecycle/w;", "setInquiryId", "(Landroidx/lifecycle/w;)V", "inquiryId", "k", "v", "setSessionToken", "sessionToken", "Lb9/e;", "l", "Lb9/e;", "()Lb9/e;", "dataCollector", "Lka/x;", "Le9/a;", "m", "Lka/x;", "()Lka/x;", "controllerRequestFlow", "LE8/c;", "t", "()Lka/y;", "getScreenStateFlow$annotations", "screenStateFlow", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "getEventFlow$annotations", "eventFlow", "LL8/H;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "p", "LL8/H;", "s", "()LL8/H;", "resolvableApiLauncher", "Landroid/net/Uri;", "q", "pictureLaunchResultLauncher", "Le/g;", "", "r", "u", "selectFromPhotoLibraryLauncher", "", "documentsSelectResultLauncher", "requestPermissionResultLauncher", "documentSelectResultLauncher", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "passportNfcReaderLauncher", "LL8/a;", "", "customTabsLauncher", "b", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class h extends L {

    @NotNull
    private final E savedStateHandle;

    private ha.m component;

    private y<InquiryWorkflow.b> props;

    private ModalWorkflow<InquiryWorkflow.b, InquiryWorkflow.Output, Object, InquiryWorkflow> workflow;

    @NotNull
    private final ja.d<InquiryWorkflow.Output> result;

    @NotNull
    private final K<Boolean> forceFallbackModeFlow;

    @NotNull
    private w<String> inquiryId;

    @NotNull
    private w<String> sessionToken;

    @NotNull
    private final b9.e dataCollector;

    @NotNull
    private final x<InterfaceC0551a> controllerRequestFlow;

    @NotNull
    private final y<E8.c> screenStateFlow;

    @NotNull
    private final x<InquiryEvent> eventFlow;

    @NotNull
    private final C0376H<IntentSenderRequest, ActivityResult> resolvableApiLauncher;

    @NotNull
    private final C0376H<Uri, Boolean> pictureLaunchResultLauncher;

    @NotNull
    private final C0376H<e.g, List<Uri>> selectFromPhotoLibraryLauncher;

    @NotNull
    private final C0376H<String[], List<Uri>> documentsSelectResultLauncher;

    @NotNull
    private final C0376H<String, Boolean> requestPermissionResultLauncher;

    @NotNull
    private final C0376H<String[], Uri> documentSelectResultLauncher;

    @NotNull
    private final C0376H<PassportNfcReaderConfig, PassportNfcReaderOutput> passportNfcReaderLauncher;

    @NotNull
    private final C0376H<C0378a, Integer> customTabsLauncher;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", f = "InquiryViewModel.kt", l = {93}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0135a<T> implements ka.h {
            final h d;

            C0135a(h hVar) {
                this.d = hVar;
            }

            public final Object c(@NotNull InquiryActivityEvent inquiryActivityEvent, @NotNull Continuation<? super Unit> continuation) {
                if (inquiryActivityEvent instanceof InquiryActivityEvent.CancelInquiry) {
                    this.d.f(true);
                }
                return Unit.a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return h.this.new a(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws P9.d {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                B eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                C0135a c0135a = new C0135a(h.this);
                this.d = 1;
                if (eventFlow.a(c0135a, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            throw new P9.d();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", f = "InquiryViewModel.kt", l = {185}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final boolean i;

        c(boolean z, Continuation<? super c> continuation) {
            super(2, continuation);
            this.i = z;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return h.this.new c(this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                x<InterfaceC0551a> xVarH = h.this.h();
                InterfaceC0551a.CancelRequest cancelRequest = new InterfaceC0551a.CancelRequest(this.i);
                this.d = 1;
                if (xVarH.c(cancelRequest, this) == objC) {
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

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class d extends kotlin.jvm.internal.j implements Function2<InquiryWorkflow.Output, Continuation<? super Unit>, Object> {
        d(Object obj) {
            super(2, obj, ja.d.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(@NotNull InquiryWorkflow.Output output, @NotNull Continuation<? super Unit> continuation) {
            return ((ja.d) ((kotlin.jvm.internal.d) this).receiver).o(output, continuation);
        }
    }

    public h(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "savedStateHandle");
        this.savedStateHandle = e;
        this.result = ja.g.b(0, (ja.a) null, (Function1) null, 7, (Object) null);
        this.forceFallbackModeFlow = e.h("force_fallback_mode", Boolean.FALSE);
        this.inquiryId = e.f("inquiry_id", (Object) null);
        this.sessionToken = e.f("session_token", (Object) null);
        this.dataCollector = new b9.e(e);
        this.controllerRequestFlow = D.b(0, 0, (ja.a) null, 7, (Object) null);
        this.screenStateFlow = M.a(new E8.c(false, false, true));
        this.eventFlow = D.b(0, 0, (ja.a) null, 7, (Object) null);
        this.resolvableApiLauncher = C0373E.b();
        this.pictureLaunchResultLauncher = C0388k.h();
        this.selectFromPhotoLibraryLauncher = C0388k.f();
        this.documentsSelectResultLauncher = C0388k.d();
        this.requestPermissionResultLauncher = C0402y.b();
        this.documentSelectResultLauncher = C0394q.b();
        this.passportNfcReaderLauncher = P8.f.b();
        this.customTabsLauncher = C0381d.b();
        ha.g.d(androidx.lifecycle.M.a(this), c0.a(), (N) null, new a(null), 2, (Object) null);
    }

    private final void z(e.b activityResultCaller) {
        this.resolvableApiLauncher.e(activityResultCaller);
        this.pictureLaunchResultLauncher.e(activityResultCaller);
        this.selectFromPhotoLibraryLauncher.e(activityResultCaller);
        this.documentsSelectResultLauncher.e(activityResultCaller);
        this.requestPermissionResultLauncher.e(activityResultCaller);
        this.documentSelectResultLauncher.e(activityResultCaller);
        this.passportNfcReaderLauncher.e(activityResultCaller);
        this.customTabsLauncher.e(activityResultCaller);
    }

    @NotNull
    public final K<Object> A(@NotNull C0338D workflowStateViewModel) {
        ModalWorkflow<InquiryWorkflow.b, InquiryWorkflow.Output, Object, InquiryWorkflow> modalWorkflow;
        K k;
        Intrinsics.checkNotNullParameter(workflowStateViewModel, "workflowStateViewModel");
        ModalWorkflow<InquiryWorkflow.b, InquiryWorkflow.Output, Object, InquiryWorkflow> modalWorkflow2 = this.workflow;
        if (modalWorkflow2 == null) {
            Intrinsics.v("workflow");
            modalWorkflow = null;
        } else {
            modalWorkflow = modalWorkflow2;
        }
        ha.L lA = androidx.lifecycle.M.a(this);
        E savedStateHandle = workflowStateViewModel.getSavedStateHandle();
        K k2 = this.props;
        if (k2 == null) {
            Intrinsics.v("props");
            k = null;
        } else {
            k = k2;
        }
        return C0489a.a(modalWorkflow, lA, k, savedStateHandle, t.a.a(), new d(this.result));
    }

    public final Object B(@NotNull Continuation<? super InquiryWorkflow.Output> continuation) {
        return this.result.h(continuation);
    }

    public final void C(boolean newValue) {
        this.savedStateHandle.m("force_fallback_mode", Boolean.valueOf(newValue));
    }

    @NotNull
    public final C D() {
        ha.m mVar = this.component;
        if (mVar != null) {
            return mVar.b();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void f(boolean force) {
        ha.g.d(androidx.lifecycle.M.a(this), c0.a(), (N) null, new c(force, null), 2, (Object) null);
    }

    public final void g(@NotNull ha.m component, @NotNull InquiryWorkflow.b props, @NotNull C0338D workflowStateViewModel, boolean resetState) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(workflowStateViewModel, "workflowStateViewModel");
        this.component = component;
        if (resetState) {
            workflowStateViewModel.g();
        }
        y<InquiryWorkflow.b> yVar = this.props;
        if (yVar != null) {
            if (yVar == null) {
                Intrinsics.v("props");
                yVar = null;
            }
            yVar.setValue(props);
        } else {
            this.props = M.a(props);
        }
        this.workflow = new ModalWorkflow<>(component.a());
    }

    @NotNull
    public final x<InterfaceC0551a> h() {
        return this.controllerRequestFlow;
    }

    @NotNull
    public final C0376H<C0378a, Integer> i() {
        return this.customTabsLauncher;
    }

    @NotNull
    public final b9.e getDataCollector() {
        return this.dataCollector;
    }

    @NotNull
    public final C0376H<String[], Uri> k() {
        return this.documentSelectResultLauncher;
    }

    @NotNull
    public final C0376H<String[], List<Uri>> l() {
        return this.documentsSelectResultLauncher;
    }

    @NotNull
    public final x<InquiryEvent> m() {
        return this.eventFlow;
    }

    @NotNull
    public final K<Boolean> n() {
        return this.forceFallbackModeFlow;
    }

    @NotNull
    public final w<String> o() {
        return this.inquiryId;
    }

    @NotNull
    public final C0376H<PassportNfcReaderConfig, PassportNfcReaderOutput> p() {
        return this.passportNfcReaderLauncher;
    }

    @NotNull
    public final C0376H<Uri, Boolean> q() {
        return this.pictureLaunchResultLauncher;
    }

    @NotNull
    public final C0376H<String, Boolean> r() {
        return this.requestPermissionResultLauncher;
    }

    @NotNull
    public final C0376H<IntentSenderRequest, ActivityResult> s() {
        return this.resolvableApiLauncher;
    }

    @NotNull
    public final y<E8.c> t() {
        return this.screenStateFlow;
    }

    @NotNull
    public final C0376H<e.g, List<Uri>> u() {
        return this.selectFromPhotoLibraryLauncher;
    }

    @NotNull
    public final w<String> v() {
        return this.sessionToken;
    }

    public final void w(@NotNull e.b activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        z(activityResultCaller);
    }

    public final void x() {
        InterfaceC0883h interfaceC0883hE;
        ha.m mVar = this.component;
        if (mVar == null || (interfaceC0883hE = mVar.e()) == null) {
            return;
        }
        interfaceC0883hE.shutdown();
    }

    public final void y() {
        d9.c cVarC;
        ha.m mVar = this.component;
        if (mVar == null || (cVarC = mVar.c()) == null) {
            return;
        }
        cVarC.a();
    }
}
