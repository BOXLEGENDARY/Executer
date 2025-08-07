package com.withpersona.sdk2.inquiry.document.network;

import P9.p;
import b9.InterfaceC0482a;
import bb.InterfaceC0759b;
import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import java.util.List;
import ka.g;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u8.InterfaceC0808a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u001aBO\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "", "sessionToken", "Ls8/b;", "service", "inquiryId", "fromStep", "fromComponent", "Lu8/a;", "fallbackModeManager", "Lb9/a;", "dataCollector", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Ljava/lang/String;Ls8/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/a;Lb9/a;Ljava/util/List;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ljava/lang/String;", "c", "Ls8/b;", "d", "e", "f", "g", "Lu8/a;", "h", "Lb9/a;", "i", "Ljava/util/List;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d implements o<b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final InterfaceC0759b service;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final String fromStep;

    @NotNull
    private final String fromComponent;

    @NotNull
    private final InterfaceC0808a fallbackModeManager;

    @NotNull
    private final InterfaceC0482a dataCollector;

    @NotNull
    private final List<DocumentFile> documents;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$a;", "", "Ls8/b;", "service", "Lu8/a;", "fallbackModeManager", "Lb9/a;", "dataCollector", "<init>", "(Ls8/b;Lu8/a;Lb9/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "Lcom/withpersona/sdk2/inquiry/document/network/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/document/network/d;", "Ls8/b;", "b", "Lu8/a;", "c", "Lb9/a;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final InterfaceC0759b service;

        @NotNull
        private final InterfaceC0808a fallbackModeManager;

        @NotNull
        private final InterfaceC0482a dataCollector;

        public a(@NotNull InterfaceC0759b interfaceC0759b, @NotNull InterfaceC0808a interfaceC0808a, @NotNull InterfaceC0482a interfaceC0482a) {
            Intrinsics.checkNotNullParameter(interfaceC0759b, "service");
            Intrinsics.checkNotNullParameter(interfaceC0808a, "fallbackModeManager");
            Intrinsics.checkNotNullParameter(interfaceC0482a, "dataCollector");
            this.service = interfaceC0759b;
            this.fallbackModeManager = interfaceC0808a;
            this.dataCollector = interfaceC0482a;
        }

        @NotNull
        public final d a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromStep, @NotNull String fromComponent, @NotNull List<? extends DocumentFile> documents) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(documents, "documents");
            return new d(sessionToken, this.service, inquiryId, fromStep, fromComponent, this.fallbackModeManager, this.dataCollector, documents, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/network/d$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b$b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/d$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "<init>", "()V", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0103b extends b {

            @NotNull
            public static final C0103b a = new C0103b();

            private C0103b() {
                super(null);
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1", f = "DocumentSubmitWorker.kt", l = {37, 58, 60}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/document/network/d$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends k implements Function2<h<? super b>, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        private Object i;

        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1$1", f = "DocumentSubmitWorker.kt", l = {40, 48}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function1<Continuation<? super t<? extends Object>>, Object> {
            int d;
            final d e;

            a(d dVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = dVar;
            }

            public final Object invoke(Continuation<? super t<? extends Object>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.e, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i != 0) {
                    if (i == 1) {
                        p.b(obj);
                        return (t) obj;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return (t) obj;
                }
                p.b(obj);
                if (this.e.fallbackModeManager.b()) {
                    InterfaceC0808a interfaceC0808a = this.e.fallbackModeManager;
                    String str = this.e.sessionToken;
                    SubmitDocumentRequest submitDocumentRequestA = SubmitDocumentRequest.INSTANCE.a(this.e.fromStep, this.e.fromComponent);
                    this.d = 1;
                    obj = interfaceC0808a.a(str, submitDocumentRequestA, this);
                    if (obj == objC) {
                        return objC;
                    }
                    return (t) obj;
                }
                InterfaceC0759b interfaceC0759b = this.e.service;
                String str2 = this.e.sessionToken;
                String str3 = this.e.inquiryId;
                SubmitDocumentRequest submitDocumentRequestA2 = SubmitDocumentRequest.INSTANCE.a(this.e.fromStep, this.e.fromComponent);
                this.d = 2;
                obj = interfaceC0759b.e(str2, str3, submitDocumentRequestA2, this);
                if (obj == objC) {
                    return objC;
                }
                return (t) obj;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = d.this.new c(continuation);
            cVar.i = obj;
            return cVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(String str, InterfaceC0759b interfaceC0759b, String str2, String str3, String str4, InterfaceC0808a interfaceC0808a, InterfaceC0482a interfaceC0482a, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC0759b, str2, str3, str4, interfaceC0808a, interfaceC0482a, list);
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof d) && Intrinsics.b(this.sessionToken, ((d) otherWorker).sessionToken);
    }

    @Override
    @NotNull
    public g<b> run() {
        return i.v(new c(null));
    }

    private d(String str, InterfaceC0759b interfaceC0759b, String str2, String str3, String str4, InterfaceC0808a interfaceC0808a, InterfaceC0482a interfaceC0482a, List<? extends DocumentFile> list) {
        this.sessionToken = str;
        this.service = interfaceC0759b;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.fallbackModeManager = interfaceC0808a;
        this.dataCollector = interfaceC0482a;
        this.documents = list;
    }
}
