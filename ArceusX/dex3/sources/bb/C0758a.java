package bb;

import P9.p;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import ka.g;
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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\u0013B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Ls8/a;", "Lf8/o;", "Ls8/a$b;", "", "sessionToken", "Ls8/b;", "service", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "<init>", "(Ljava/lang/String;Ls8/b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ljava/lang/String;", "c", "Ls8/b;", "d", "getDocumentId", "()Ljava/lang/String;", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0758a implements o<b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final InterfaceC0759b service;

    @NotNull
    private final String documentId;

    @NotNull
    private final DocumentFile.Remote remoteDocument;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Ls8/a$a;", "", "Ls8/b;", "service", "<init>", "(Ls8/b;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "remoteDocument", "Ls8/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Ls8/a;", "Ls8/b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0268a {

        @NotNull
        private final InterfaceC0759b service;

        public C0268a(@NotNull InterfaceC0759b interfaceC0759b) {
            Intrinsics.checkNotNullParameter(interfaceC0759b, "service");
            this.service = interfaceC0759b;
        }

        @NotNull
        public final C0758a a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Remote remoteDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(remoteDocument, "remoteDocument");
            return new C0758a(sessionToken, this.service, documentId, remoteDocument, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ls8/a$b;", "", "<init>", "()V", "a", "b", "Ls8/a$b$a;", "Ls8/a$b$b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls8/a$b$a;", "Ls8/a$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls8/a$b$b;", "Ls8/a$b;", "<init>", "()V", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0270b extends b {

            @NotNull
            public static final C0270b a = new C0270b();

            private C0270b() {
                super(null);
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1", f = "DocumentFileDeleteWorker.kt", l = {25, 31, 33}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Ls8/a$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        private Object i;

        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker$run$1$1", f = "DocumentFileDeleteWorker.kt", l = {26}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbb/t;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class t extends k implements Function1<Continuation<? super bb.t<?>>, Object> {
            int d;
            final C0758a e;

            t(C0758a c0758a, Continuation<? super t> continuation) {
                super(1, continuation);
                this.e = c0758a;
            }

            public final Object invoke(Continuation<? super bb.t<?>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new t(this.e, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    InterfaceC0759b interfaceC0759b = this.e.service;
                    String str = this.e.sessionToken;
                    String documentFileId = this.e.getRemoteDocument().getDocumentFileId();
                    this.d = 1;
                    obj = interfaceC0759b.d(str, documentFileId, this);
                    if (obj == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return obj;
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            h hVar = C0758a.this.new h(continuation);
            hVar.i = obj;
            return hVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            throw new UnsupportedOperationException("Method not decompiled: bb.C0758a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0758a(String str, InterfaceC0759b interfaceC0759b, String str2, DocumentFile.Remote remote, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC0759b, str2, remote);
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (otherWorker instanceof C0758a) {
            C0758a c0758a = (C0758a) otherWorker;
            if (Intrinsics.b(this.sessionToken, c0758a.sessionToken) && Intrinsics.b(this.remoteDocument, c0758a.remoteDocument)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final DocumentFile.Remote getRemoteDocument() {
        return this.remoteDocument;
    }

    @Override
    @NotNull
    public g<b> run() {
        return i.v(new h(null));
    }

    private C0758a(String str, InterfaceC0759b interfaceC0759b, String str2, DocumentFile.Remote remote) {
        this.sessionToken = str;
        this.service = interfaceC0759b;
        this.documentId = str2;
        this.remoteDocument = remote;
    }
}
