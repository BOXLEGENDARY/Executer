package com.withpersona.sdk2.inquiry.ui;

import P9.p;
import bb.InterfaceC0875b;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import d9.InterfaceC0550a;
import ha.C0378a;
import ha.L;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0018BQ\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/ui/g$b;", "Le/c;", "LL8/a;", "customTabsLauncher", "Ly9/b;", "uiService", "Ld9/a;", "deviceIdProvider", "", "sessionToken", "inquiryId", "url", "componentName", "<init>", "(Le/c;Ly9/b;Ld9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Le/c;", "c", "Ly9/b;", "d", "Ld9/a;", "e", "Ljava/lang/String;", "f", "g", "h", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class g implements o<b> {

    @NotNull
    private final e.c<C0378a> customTabsLauncher;

    @NotNull
    private final InterfaceC0875b uiService;

    @NotNull
    private final InterfaceC0550a deviceIdProvider;

    @NotNull
    private final String sessionToken;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final String url;

    @NotNull
    private final String componentName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g$a;", "", "", "sessionToken", "inquiryId", "url", "componentName", "Lcom/withpersona/sdk2/inquiry/ui/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/g;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        g a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String url, @NotNull String componentName);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g$b;", "", "a", "b", "Lcom/withpersona/sdk2/inquiry/ui/g$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/g$b$b;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/g$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements b {

            @NotNull
            public static final a a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1215598964;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/g$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "ui_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error implements b {

            @NotNull
            private final InternalErrorInfo errorInfo;

            public Error(@NotNull InternalErrorInfo internalErrorInfo) {
                Intrinsics.checkNotNullParameter(internalErrorInfo, "errorInfo");
                this.errorInfo = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getErrorInfo() {
                return this.errorInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.b(this.errorInfo, ((Error) other).errorInfo);
            }

            public int hashCode() {
                return this.errorInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorInfo=" + this.errorInfo + ")";
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1", f = "VerifyReusablePersonaWorker.kt", l = {40, 45, 50, 57, 67, 76, 78}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/ui/g$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1$1", f = "VerifyReusablePersonaWorker.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function2<L, Continuation<? super Unit>, Object> {
            int d;
            final g e;
            final String i;

            a(g gVar, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.e = gVar;
                this.i = str;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.e, this.i, continuation);
            }

            public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                S9.b.c();
                if (this.d != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                e.c cVar = this.e.customTabsLauncher;
                p.d dVarA = new d.a().a();
                Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
                cVar.b(new C0378a(dVarA, w9.e.a(this.e.url, this.i, this.e.componentName)));
                return Unit.a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = g.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(@NotNull e.c<C0378a> cVar, @NotNull InterfaceC0875b interfaceC0875b, @NotNull InterfaceC0550a interfaceC0550a, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(cVar, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(interfaceC0875b, "uiService");
        Intrinsics.checkNotNullParameter(interfaceC0550a, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(str3, "url");
        Intrinsics.checkNotNullParameter(str4, "componentName");
        this.customTabsLauncher = cVar;
        this.uiService = interfaceC0875b;
        this.deviceIdProvider = interfaceC0550a;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.url = str3;
        this.componentName = str4;
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return o.b.a(this, otherWorker) && Intrinsics.b(((g) otherWorker).url, this.url);
    }

    @Override
    @NotNull
    public ka.g<b> run() {
        return i.v(new c(null));
    }
}
