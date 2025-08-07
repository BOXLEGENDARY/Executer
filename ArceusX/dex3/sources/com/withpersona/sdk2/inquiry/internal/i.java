package com.withpersona.sdk2.inquiry.internal;

import J8.q;
import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import d9.InterfaceC0550a;
import ha.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001d!BY\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/internal/i$c;", "", "sessionToken", "inquiryId", "LF8/u;", "pollingMode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Landroid/content/Context;", "applicationContext", "LJ8/q;", "service", "Ld9/a;", "deviceIdProvider", "LT8/c;", "sandboxFlags", "LI8/i;", "fallbackModeManager", "<init>", "(Ljava/lang/String;Ljava/lang/String;LF8/u;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Landroid/content/Context;LJ8/q;Ld9/a;LT8/c;LI8/i;)V", "Lka/g;", "run", "()Lka/g;", "otherWorker", "", "a", "(Lf8/o;)Z", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "c", "h", "d", "LF8/u;", "e", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "f", "Landroid/content/Context;", "g", "LJ8/q;", "Ld9/a;", "LT8/c;", "j", "LI8/i;", "k", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class i implements ka.o<c> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final u pollingMode;

    @NotNull
    private final InquirySessionConfig inquirySessionConfig;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final q service;

    @NotNull
    private final InterfaceC0550a deviceIdProvider;

    @NotNull
    private final T8.c sandboxFlags;

    @NotNull
    private final I8.i fallbackModeManager;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i$b;", "", "", "sessionToken", "inquiryId", "LF8/u;", "pollingMode", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/i;", "a", "(Ljava/lang/String;Ljava/lang/String;LF8/u;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/i;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface b {
        @NotNull
        i a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull u pollingMode, @NotNull InquirySessionConfig inquirySessionConfig);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/internal/i$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/i$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/i$c$c;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/i$c;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends c {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/i$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LF8/u;", "a", "LF8/u;", "()LF8/u;", "newPollingMode", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class PollingModeChanged extends c {

            @NotNull
            private final u newPollingMode;

            @NotNull
            public final u getNewPollingMode() {
                return this.newPollingMode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PollingModeChanged) && this.newPollingMode == ((PollingModeChanged) other).newPollingMode;
            }

            public int hashCode() {
                return this.newPollingMode.hashCode();
            }

            @NotNull
            public String toString() {
                return "PollingModeChanged(newPollingMode=" + this.newPollingMode + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i$c$c;", "Lcom/withpersona/sdk2/inquiry/internal/i$c;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Success extends c {

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

        public c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.PollingWorker$run$1", f = "PollingWorker.kt", l = {39, 49, 88, 97, 103, 106, 110}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/internal/i$c;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<ka.h<? super c>, Continuation<? super Unit>, Object> {
        Object d;
        Object e;
        long i;
        int v;
        private Object w;

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public class a {
            public static final int[] a;

            static {
                int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
                try {
                    iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super c> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            d dVar = i.this.new d(continuation);
            dVar.w = obj;
            return dVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(@NotNull String str, @NotNull String str2, @NotNull u uVar, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull Context context, @NotNull q qVar, @NotNull InterfaceC0550a interfaceC0550a, @NotNull T8.c cVar, @NotNull I8.i iVar) {
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(uVar, "pollingMode");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(qVar, "service");
        Intrinsics.checkNotNullParameter(interfaceC0550a, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(cVar, "sandboxFlags");
        Intrinsics.checkNotNullParameter(iVar, "fallbackModeManager");
        this.sessionToken = str;
        this.inquiryId = str2;
        this.pollingMode = uVar;
        this.inquirySessionConfig = inquirySessionConfig;
        this.applicationContext = context;
        this.service = qVar;
        this.deviceIdProvider = interfaceC0550a;
        this.sandboxFlags = cVar;
        this.fallbackModeManager = iVar;
    }

    @Override
    public boolean a(@NotNull ka.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (otherWorker instanceof i) {
            i iVar = (i) otherWorker;
            if (Intrinsics.b(this.sessionToken, iVar.sessionToken) && Intrinsics.b(this.inquiryId, iVar.inquiryId) && this.pollingMode == iVar.pollingMode) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override
    @NotNull
    public ka.g<c> run() {
        return ka.i.v(new d(null));
    }
}
