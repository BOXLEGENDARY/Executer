package com.withpersona.sdk2.inquiry.internal;

import J8.q;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import d9.InterfaceC0550a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0014B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/internal/a$b;", "", "inquiryId", "LJ8/q;", "service", "Ld9/a;", "deviceIdProvider", "LI8/i;", "fallbackModeManager", "<init>", "(Ljava/lang/String;LJ8/q;Ld9/a;LI8/i;)V", "Lka/g;", "run", "()Lka/g;", "otherWorker", "", "a", "(Lf8/o;)Z", "b", "Ljava/lang/String;", "c", "LJ8/q;", "d", "Ld9/a;", "e", "LI8/i;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a implements ka.o<b> {

    @NotNull
    private final String inquiryId;

    @NotNull
    private final q service;

    @NotNull
    private final InterfaceC0550a deviceIdProvider;

    @NotNull
    private final I8.i fallbackModeManager;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$a;", "", "LJ8/q;", "service", "Ld9/a;", "deviceIdProvider", "LI8/i;", "fallbackModeManager", "<init>", "(LJ8/q;Ld9/a;LI8/i;)V", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/internal/a;", "a", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/a;", "LJ8/q;", "b", "Ld9/a;", "c", "LI8/i;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0126a {

        @NotNull
        private final q service;

        @NotNull
        private final InterfaceC0550a deviceIdProvider;

        @NotNull
        private final I8.i fallbackModeManager;

        public C0126a(@NotNull q qVar, @NotNull InterfaceC0550a interfaceC0550a, @NotNull I8.i iVar) {
            Intrinsics.checkNotNullParameter(qVar, "service");
            Intrinsics.checkNotNullParameter(interfaceC0550a, "deviceIdProvider");
            Intrinsics.checkNotNullParameter(iVar, "fallbackModeManager");
            this.service = qVar;
            this.deviceIdProvider = interfaceC0550a;
            this.fallbackModeManager = iVar;
        }

        @NotNull
        public final a a(@NotNull String inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            return new a(inquiryId, this.service, this.deviceIdProvider, this.fallbackModeManager);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/internal/a$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/a$b$b;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/a$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/a$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/a$b;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Success extends b {

            @NotNull
            private final String sessionToken;

            @NotNull
            private final InquirySessionConfig inquirySessionConfig;

            public Success(@NotNull String str, @NotNull InquirySessionConfig inquirySessionConfig) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "sessionToken");
                Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
                this.sessionToken = str;
                this.inquirySessionConfig = inquirySessionConfig;
            }

            @NotNull
            public final InquirySessionConfig getInquirySessionConfig() {
                return this.inquirySessionConfig;
            }

            @NotNull
            public final String getSessionToken() {
                return this.sessionToken;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.b(this.sessionToken, success.sessionToken) && Intrinsics.b(this.inquirySessionConfig, success.inquirySessionConfig);
            }

            public int hashCode() {
                return (this.sessionToken.hashCode() * 31) + this.inquirySessionConfig.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(sessionToken=" + this.sessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker$run$1", f = "CreateInquirySessionWorker.kt", l = {31, 40, 49, 60}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/a$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
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
            c cVar = a.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(@NotNull String str, @NotNull q qVar, @NotNull InterfaceC0550a interfaceC0550a, @NotNull I8.i iVar) {
        Intrinsics.checkNotNullParameter(str, "inquiryId");
        Intrinsics.checkNotNullParameter(qVar, "service");
        Intrinsics.checkNotNullParameter(interfaceC0550a, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(iVar, "fallbackModeManager");
        this.inquiryId = str;
        this.service = qVar;
        this.deviceIdProvider = interfaceC0550a;
        this.fallbackModeManager = iVar;
    }

    @Override
    public boolean a(@NotNull ka.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof a) && Intrinsics.b(this.inquiryId, ((a) otherWorker).inquiryId);
    }

    @Override
    @NotNull
    public ka.g<b> run() {
        return ka.i.v(new c(null));
    }
}
