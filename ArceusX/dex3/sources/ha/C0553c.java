package ha;

import P9.p;
import S9.b;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import ha.M;
import ha.N;
import ha.V0;
import ha.c0;
import ha.g;
import ha.z0;
import ka.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Le9/c;", "", "Le9/e;", "externalInquiryController", "<init>", "(Le9/e;)V", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "inquiryEvent", "", "b", "(Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;)V", "Le9/i;", "page", "c", "(Le9/i;)V", "a", "Le9/e;", "Lha/L;", "Lha/L;", "coroutineScope", "Le9/i;", "currentPage", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0553c {

    @NotNull
    private final InterfaceC0555e externalInquiryController;

    @NotNull
    private final ha.L coroutineScope;

    private AbstractC0559i currentPage;

    @f(c = "com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger$logEvent$1", f = "ExternalEventLogger.kt", l = {23}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final InquiryEvent i;

        L(InquiryEvent inquiryEvent, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = inquiryEvent;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0553c.this.new L(this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                x<InquiryEvent> xVarA = C0553c.this.externalInquiryController.a();
                InquiryEvent inquiryEvent = this.i;
                this.d = 1;
                if (xVarA.c(inquiryEvent, this) == objC) {
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

    public C0553c(@NotNull InterfaceC0555e interfaceC0555e) {
        Intrinsics.checkNotNullParameter(interfaceC0555e, "externalInquiryController");
        this.externalInquiryController = interfaceC0555e;
        this.coroutineScope = M.a(c0.a().K(V0.b((z0) null, 1, (Object) null)));
    }

    public final void b(@NotNull InquiryEvent inquiryEvent) {
        Intrinsics.checkNotNullParameter(inquiryEvent, "inquiryEvent");
        g.d(this.coroutineScope, (CoroutineContext) null, (N) null, new L(inquiryEvent, null), 3, (Object) null);
    }

    public final void c(@NotNull AbstractC0559i page) {
        Intrinsics.checkNotNullParameter(page, "page");
        if (Intrinsics.b(this.currentPage, page)) {
            return;
        }
        this.currentPage = page;
        b(new InquiryEvent.PageChange(page.getStepName(), page.toString()));
    }
}
