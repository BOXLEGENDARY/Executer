package com.withpersona.sdk2.inquiry.internal;

import J8.InquiryAttributes;
import J8.q;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0014B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/b;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/internal/b$b;", "LJ8/c;", "attributes", "LJ8/q;", "service", "LI8/i;", "fallbackModeManager", "LT8/c;", "sandboxFlags", "<init>", "(LJ8/c;LJ8/q;LI8/i;LT8/c;)V", "Lka/g;", "run", "()Lka/g;", "otherWorker", "", "a", "(Lf8/o;)Z", "b", "LJ8/c;", "e", "()LJ8/c;", "c", "LJ8/q;", "d", "LI8/i;", "LT8/c;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b implements ka.o<AbstractC0129b> {

    @NotNull
    private final InquiryAttributes attributes;

    @NotNull
    private final q service;

    @NotNull
    private final I8.i fallbackModeManager;

    @NotNull
    private final T8.c sandboxFlags;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/b$a;", "", "LJ8/q;", "service", "LI8/i;", "fallbackModeManager", "LT8/c;", "sandboxFlags", "<init>", "(LJ8/q;LI8/i;LT8/c;)V", "LJ8/c;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/b;", "a", "(LJ8/c;)Lcom/withpersona/sdk2/inquiry/internal/b;", "LJ8/q;", "b", "LI8/i;", "c", "LT8/c;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final q service;

        @NotNull
        private final I8.i fallbackModeManager;

        @NotNull
        private final T8.c sandboxFlags;

        public a(@NotNull q qVar, @NotNull I8.i iVar, @NotNull T8.c cVar) {
            Intrinsics.checkNotNullParameter(qVar, "service");
            Intrinsics.checkNotNullParameter(iVar, "fallbackModeManager");
            Intrinsics.checkNotNullParameter(cVar, "sandboxFlags");
            this.service = qVar;
            this.fallbackModeManager = iVar;
            this.sandboxFlags = cVar;
        }

        @NotNull
        public final b a(@NotNull InquiryAttributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return new b(attributes, this.service, this.fallbackModeManager, this.sandboxFlags);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/b$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/internal/b$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/b$b$b;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0129b {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/b$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/b$b;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends AbstractC0129b {

            private final String debugMessage;

            @NotNull
            private final InternalErrorInfo cause;

            public Error(String str, @NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.debugMessage = str;
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public final String getDebugMessage() {
                return this.debugMessage;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.b(this.debugMessage, error.debugMessage) && Intrinsics.b(this.cause, error.cause);
            }

            public int hashCode() {
                String str = this.debugMessage;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(debugMessage=" + this.debugMessage + ", cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/b$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/b$b;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "nextStep", "fallbackSessionToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "c", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Success extends AbstractC0129b {

            @NotNull
            private final String inquiryId;

            @NotNull
            private final NextStep nextStep;

            private final String fallbackSessionToken;

            public Success(String str, NextStep nextStep, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, nextStep, (i & 4) != 0 ? null : str2);
            }

            public final String getFallbackSessionToken() {
                return this.fallbackSessionToken;
            }

            @NotNull
            public final String getInquiryId() {
                return this.inquiryId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.b(this.inquiryId, success.inquiryId) && Intrinsics.b(this.nextStep, success.nextStep) && Intrinsics.b(this.fallbackSessionToken, success.fallbackSessionToken);
            }

            public int hashCode() {
                int iHashCode = ((this.inquiryId.hashCode() * 31) + this.nextStep.hashCode()) * 31;
                String str = this.fallbackSessionToken;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "Success(inquiryId=" + this.inquiryId + ", nextStep=" + this.nextStep + ", fallbackSessionToken=" + this.fallbackSessionToken + ")";
            }

            public Success(@NotNull String str, @NotNull NextStep nextStep, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "inquiryId");
                Intrinsics.checkNotNullParameter(nextStep, "nextStep");
                this.inquiryId = str;
                this.nextStep = nextStep;
                this.fallbackSessionToken = str2;
            }
        }

        public AbstractC0129b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0129b() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker$run$1", f = "CreateInquiryWorker.kt", l = {32, 45, 48, 51, 61, 76, 80, 88}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/b$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super AbstractC0129b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super AbstractC0129b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) throws java.lang.Exception {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(@NotNull InquiryAttributes inquiryAttributes, @NotNull q qVar, @NotNull I8.i iVar, @NotNull T8.c cVar) {
        Intrinsics.checkNotNullParameter(inquiryAttributes, "attributes");
        Intrinsics.checkNotNullParameter(qVar, "service");
        Intrinsics.checkNotNullParameter(iVar, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(cVar, "sandboxFlags");
        this.attributes = inquiryAttributes;
        this.service = qVar;
        this.fallbackModeManager = iVar;
        this.sandboxFlags = cVar;
    }

    @Override
    public boolean a(@NotNull ka.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (otherWorker instanceof b) {
            b bVar = (b) otherWorker;
            if (Intrinsics.b(this.attributes.getTemplateId(), bVar.attributes.getTemplateId()) && Intrinsics.b(this.attributes.getTemplateVersion(), bVar.attributes.getTemplateVersion()) && this.attributes.getEnvironment() == bVar.attributes.getEnvironment()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final InquiryAttributes getAttributes() {
        return this.attributes;
    }

    @Override
    @NotNull
    public ka.g<AbstractC0129b> run() {
        return ka.i.v(new c(null));
    }
}
