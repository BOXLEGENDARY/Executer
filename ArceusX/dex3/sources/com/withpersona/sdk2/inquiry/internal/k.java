package com.withpersona.sdk2.inquiry.internal;

import J8.q;
import P9.p;
import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0018B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "", "sessionToken", "inquiryId", "fromStep", "LJ8/q;", "service", "LI8/i;", "fallbackModeManager", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJ8/q;LI8/i;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "Lka/g;", "k", "()Lka/g;", "j", "run", "otherWorker", "", "a", "(Lf8/o;)Z", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "c", "g", "d", "f", "e", "LJ8/q;", "LI8/i;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "h", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class k implements ka.o<b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final String fromStep;

    @NotNull
    private final q service;

    @NotNull
    private final I8.i fallbackModeManager;

    @NotNull
    private final InquirySessionConfig inquirySessionConfig;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$a;", "", "LJ8/q;", "service", "LI8/i;", "fallbackModeManager", "<init>", "(LJ8/q;LI8/i;)V", "", "sessionToken", "inquiryId", "fromStep", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/k;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/k;", "LJ8/q;", "b", "LI8/i;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final q service;

        @NotNull
        private final I8.i fallbackModeManager;

        public a(@NotNull q qVar, @NotNull I8.i iVar) {
            Intrinsics.checkNotNullParameter(qVar, "service");
            Intrinsics.checkNotNullParameter(iVar, "fallbackModeManager");
            this.service = qVar;
            this.fallbackModeManager = iVar;
        }

        @NotNull
        public final k a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull InquirySessionConfig inquirySessionConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
            return new k(sessionToken, inquiryId, fromStep, this.service, this.fallbackModeManager, inquirySessionConfig);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/internal/k$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/k$b$b;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends b {

            @NotNull
            private final InternalErrorInfo cause;

            public Error(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.b(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/k$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Success extends b {

            @NotNull
            private final InquiryState nextState;

            public Success(@NotNull InquiryState inquiryState) {
                super(null);
                Intrinsics.checkNotNullParameter(inquiryState, "nextState");
                this.nextState = inquiryState;
            }

            @NotNull
            public final InquiryState getNextState() {
                return this.nextState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.b(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                return this.nextState.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$run$1", f = "TransitionBackWorker.kt", l = {29, 31}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = k.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                ka.h hVar = (ka.h) this.e;
                if (k.this.fallbackModeManager.b()) {
                    ka.g gVarJ = k.this.j();
                    this.d = 1;
                    if (ka.i.p(hVar, gVarJ, this) == objC) {
                        return objC;
                    }
                } else {
                    ka.g gVarK = k.this.k();
                    this.d = 2;
                    if (ka.i.p(hVar, gVarK, this) == objC) {
                        return objC;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$runFallbackTransitionBack$1", f = "TransitionBackWorker.kt", l = {68, 76, 78, 84, 87}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            d dVar = k.this.new d(continuation);
            dVar.e = obj;
            return dVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            ka.h hVar;
            Object objC = S9.b.c();
            ?? r1 = this.d;
            try {
            } catch (SocketTimeoutException e) {
                b.Error error = new b.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
                this.e = null;
                this.d = 5;
                if (r1.c(error, this) == objC) {
                    return objC;
                }
            }
            if (r1 == 0) {
                p.b(obj);
                hVar = (ka.h) this.e;
                I8.i iVar = k.this.fallbackModeManager;
                String sessionToken = k.this.getSessionToken();
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(k.this.getFromStep());
                this.e = hVar;
                this.d = 1;
                obj = iVar.f(sessionToken, transitionBackRequestA, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3 || r1 == 4) {
                        p.b(obj);
                        return Unit.a;
                    }
                    if (r1 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.a;
                }
                hVar = (ka.h) this.e;
                p.b(obj);
            }
            t tVar = (t) obj;
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = k.this.fallbackModeManager.getCurrentSession();
            if (!tVar.g()) {
                b.Error error2 = new b.Error(NetworkUtilsKt.toErrorInfo(tVar));
                this.e = hVar;
                this.d = 2;
                if (hVar.c(error2, this) == objC) {
                    return objC;
                }
            } else if (currentSession == null) {
                b.Error error3 = new b.Error(new InternalErrorInfo.UnknownErrorInfo("Current fallback session is unexpectedly null."));
                this.e = hVar;
                this.d = 3;
                if (hVar.c(error3, this) == objC) {
                    return objC;
                }
            } else {
                b.Success success = new b.Success(currentSession.a());
                this.e = hVar;
                this.d = 4;
                if (hVar.c(success, this) == objC) {
                    return objC;
                }
            }
            return Unit.a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.TransitionBackWorker$runTransitionBack$1", f = "TransitionBackWorker.kt", l = {37, 46, 55, 58}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/k$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            e eVar = k.this.new e(continuation);
            eVar.e = obj;
            return eVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            ka.h hVar;
            Object objC = S9.b.c();
            ?? r1 = this.d;
            try {
            } catch (SocketTimeoutException e) {
                b.Error error = new b.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e));
                this.e = null;
                this.d = 4;
                if (r1.c(error, this) == objC) {
                    return objC;
                }
            }
            if (r1 == 0) {
                p.b(obj);
                hVar = (ka.h) this.e;
                q qVar = k.this.service;
                String sessionToken = k.this.getSessionToken();
                String inquiryId = k.this.getInquiryId();
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(k.this.getFromStep());
                this.e = hVar;
                this.d = 1;
                obj = qVar.f(sessionToken, inquiryId, transitionBackRequestA, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (r1 != 1) {
                    if (r1 == 2 || r1 == 3) {
                        p.b(obj);
                        return Unit.a;
                    }
                    if (r1 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.a;
                }
                hVar = (ka.h) this.e;
                p.b(obj);
            }
            t tVar = (t) obj;
            if (tVar.g()) {
                Object objA = tVar.a();
                Intrinsics.d(objA);
                b.Success success = new b.Success(J8.a.n((CheckInquiryResponse) objA, k.this.getSessionToken(), k.this.getInquirySessionConfig()));
                this.e = hVar;
                this.d = 2;
                if (hVar.c(success, this) == objC) {
                    return objC;
                }
            } else {
                b.Error error2 = new b.Error(NetworkUtilsKt.toErrorInfo(tVar));
                this.e = hVar;
                this.d = 3;
                if (hVar.c(error2, this) == objC) {
                    return objC;
                }
            }
            return Unit.a;
        }
    }

    public k(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull q qVar, @NotNull I8.i iVar, @NotNull InquirySessionConfig inquirySessionConfig) {
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(str3, "fromStep");
        Intrinsics.checkNotNullParameter(qVar, "service");
        Intrinsics.checkNotNullParameter(iVar, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        this.sessionToken = str;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.service = qVar;
        this.fallbackModeManager = iVar;
        this.inquirySessionConfig = inquirySessionConfig;
    }

    public final ka.g<b> j() {
        return ka.i.v(new d(null));
    }

    public final ka.g<b> k() {
        return ka.i.v(new e(null));
    }

    @Override
    public boolean a(@NotNull ka.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (otherWorker instanceof k) {
            k kVar = (k) otherWorker;
            if (Intrinsics.b(this.sessionToken, kVar.sessionToken) && Intrinsics.b(this.inquiryId, kVar.inquiryId)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getFromStep() {
        return this.fromStep;
    }

    @NotNull
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    public final InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    @NotNull
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override
    @NotNull
    public ka.g<b> run() {
        return ka.i.v(new c(null));
    }
}
