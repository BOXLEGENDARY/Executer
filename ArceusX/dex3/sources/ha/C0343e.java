package ha;

import J8.q;
import P9.p;
import S9.b;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.a;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import ha.C0462j;
import ha.M;
import ha.N;
import ha.V0;
import ha.c0;
import ha.g;
import ha.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LF8/e;", "", "LJ8/q;", "inquiryService", "Lcom/squareup/moshi/w;", "moshi", "La9/j;", "logger", "<init>", "(LJ8/q;Lcom/squareup/moshi/w;La9/j;)V", "", "sessionToken", "", "i", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "Lha/z0;", "j", "(Ljava/lang/String;)Lha/z0;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "errorInfo", "f", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)Lha/z0;", "g", "a", "LJ8/q;", "b", "Lcom/squareup/moshi/w;", "c", "La9/j;", "Lha/L;", "d", "Lha/L;", "coroutineScope", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0343e {

    @NotNull
    private final q inquiryService;

    @NotNull
    private final w moshi;

    @NotNull
    private final C0462j logger;

    @NotNull
    private final ha.L coroutineScope;

    @f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", f = "ErrorReportingManager.kt", l = {37}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final String i;
        final InternalErrorInfo v;

        L(String str, InternalErrorInfo internalErrorInfo, Continuation<? super L> continuation) {
            super(2, continuation);
            this.i = str;
            this.v = internalErrorInfo;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0343e.this.new L(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                q qVar = C0343e.this.inquiryService;
                String str = this.i;
                ErrorRequest errorRequest = new ErrorRequest(a.a(this.v), C0343e.this.moshi.c(InternalErrorInfo.class).toJsonValue(this.v));
                this.d = 1;
                if (qVar.e(str, errorRequest, this) == objC) {
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

    @f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", f = "ErrorReportingManager.kt", l = {47, 48, 50}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0344b extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final String i;

        C0344b(String str, Continuation<? super C0344b> continuation) {
            super(2, continuation);
            this.i = str;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0343e.this.new C0344b(this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: ha.C0343e.C0344b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", f = "ErrorReportingManager.kt", l = {73, 78}, m = "reportNetworkError")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int w;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            return C0343e.this.h(null, this);
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", f = "ErrorReportingManager.kt", l = {56, 61}, m = "reportNfcScanError")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int w;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            return C0343e.this.i(null, this);
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", f = "ErrorReportingManager.kt", l = {30}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0345e extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;
        final String i;

        C0345e(String str, Continuation<? super C0345e> continuation) {
            super(2, continuation);
            this.i = str;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0343e.this.new C0345e(this.i, continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                q qVar = C0343e.this.inquiryService;
                String str = this.i;
                this.d = 1;
                if (qVar.d(str, this) == objC) {
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

    public C0343e(@NotNull q qVar, @NotNull w wVar, @NotNull C0462j c0462j) {
        Intrinsics.checkNotNullParameter(qVar, "inquiryService");
        Intrinsics.checkNotNullParameter(wVar, "moshi");
        Intrinsics.checkNotNullParameter(c0462j, "logger");
        this.inquiryService = qVar;
        this.moshi = wVar;
        this.logger = c0462j;
        this.coroutineScope = M.a(c0.a().K(V0.b((z0) null, 1, (Object) null)));
    }

    public final java.lang.Object h(java.lang.String r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0343e.h(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object i(java.lang.String r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0343e.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final z0 f(@NotNull String sessionToken, @NotNull InternalErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        return g.d(this.coroutineScope, c0.b(), (N) null, new L(sessionToken, errorInfo, null), 2, (Object) null);
    }

    @NotNull
    public final z0 g(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return g.d(this.coroutineScope, c0.b(), (N) null, new C0344b(sessionToken, null), 2, (Object) null);
    }

    @NotNull
    public final z0 j(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return g.d(this.coroutineScope, c0.b(), (N) null, new C0345e(sessionToken, null), 2, (Object) null);
    }
}
