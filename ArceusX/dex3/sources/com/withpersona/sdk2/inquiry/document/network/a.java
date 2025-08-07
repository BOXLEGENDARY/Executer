package com.withpersona.sdk2.inquiry.document.network;

import P9.p;
import bb.InterfaceC0759b;
import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import ka.g;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0014B1\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "sessionToken", "Ls8/b;", "service", "documentKind", "", "fileLimit", "fieldKeyDocument", "<init>", "(Ljava/lang/String;Ls8/b;Ljava/lang/String;ILjava/lang/String;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ljava/lang/String;", "c", "Ls8/b;", "d", "()Ljava/lang/String;", "e", "I", "f", "()I", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a implements o<b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final InterfaceC0759b service;

    @NotNull
    private final String documentKind;

    private final int fileLimit;

    @NotNull
    private final String fieldKeyDocument;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "", "Ls8/b;", "service", "<init>", "(Ls8/b;)V", "", "sessionToken", "documentKind", "fieldKeyDocument", "", "fileLimit", "Lcom/withpersona/sdk2/inquiry/document/network/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/document/network/a;", "Ls8/b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class C0092a {

        @NotNull
        private final InterfaceC0759b service;

        public C0092a(@NotNull InterfaceC0759b interfaceC0759b) {
            Intrinsics.checkNotNullParameter(interfaceC0759b, "service");
            this.service = interfaceC0759b;
        }

        @NotNull
        public final a a(@NotNull String sessionToken, @NotNull String documentKind, @NotNull String fieldKeyDocument, int fileLimit) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentKind, "documentKind");
            Intrinsics.checkNotNullParameter(fieldKeyDocument, "fieldKeyDocument");
            return new a(sessionToken, this.service, documentKind, fileLimit, fieldKeyDocument, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends b {

            @NotNull
            private final InternalErrorInfo.NetworkErrorInfo cause;

            public Error(@NotNull InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(networkErrorInfo, "cause");
                this.cause = networkErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo.NetworkErrorInfo getCause() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0094b extends b {

            @NotNull
            private final String documentId;

            public C0094b(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "documentId");
                this.documentId = str;
            }

            @NotNull
            public final String getDocumentId() {
                return this.documentId;
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker$run$1", f = "DocumentCreateWorker.kt", l = {23, 34, 36}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/document/network/a$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends k implements Function2<h<? super b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            h hVar;
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                hVar = (h) this.e;
                InterfaceC0759b interfaceC0759b = a.this.service;
                String str = a.this.sessionToken;
                CreateDocumentRequest createDocumentRequestA = CreateDocumentRequest.INSTANCE.a("document", a.this.getDocumentKind(), a.this.getFileLimit(), a.this.getFieldKeyDocument());
                this.e = hVar;
                this.d = 1;
                obj = interfaceC0759b.a(str, createDocumentRequestA, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return Unit.a;
                }
                hVar = (h) this.e;
                p.b(obj);
            }
            t tVar = (t) obj;
            if (tVar.g()) {
                Object objA = tVar.a();
                Intrinsics.d(objA);
                b.C0094b c0094b = new b.C0094b(((CreateDocumentResponse) objA).getData().getId());
                this.e = null;
                this.d = 2;
                if (hVar.c(c0094b, this) == objC) {
                    return objC;
                }
            } else {
                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(tVar));
                this.e = null;
                this.d = 3;
                if (hVar.c(error, this) == objC) {
                    return objC;
                }
            }
            return Unit.a;
        }
    }

    public a(String str, InterfaceC0759b interfaceC0759b, String str2, int i, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC0759b, str2, i, str3);
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (otherWorker instanceof a) {
            a aVar = (a) otherWorker;
            if (Intrinsics.b(this.sessionToken, aVar.sessionToken) && Intrinsics.b(this.fieldKeyDocument, aVar.fieldKeyDocument)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getDocumentKind() {
        return this.documentKind;
    }

    @NotNull
    public final String getFieldKeyDocument() {
        return this.fieldKeyDocument;
    }

    public final int getFileLimit() {
        return this.fileLimit;
    }

    @Override
    @NotNull
    public g<b> run() {
        return i.v(new c(null));
    }

    private a(String str, InterfaceC0759b interfaceC0759b, String str2, int i, String str3) {
        this.sessionToken = str;
        this.service = interfaceC0759b;
        this.documentKind = str2;
        this.fileLimit = i;
        this.fieldKeyDocument = str3;
    }
}
