package com.withpersona.sdk2.inquiry.document.network;

import P9.p;
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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u0011B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "sessionToken", "Ls8/b;", "service", "documentId", "<init>", "(Ljava/lang/String;Ls8/b;Ljava/lang/String;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ljava/lang/String;", "c", "Ls8/b;", "d", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c implements o<b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final InterfaceC0759b service;

    @NotNull
    private final String documentId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "", "Ls8/b;", "service", "<init>", "(Ls8/b;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/network/c;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/c;", "Ls8/b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final InterfaceC0759b service;

        public a(@NotNull InterfaceC0759b interfaceC0759b) {
            Intrinsics.checkNotNullParameter(interfaceC0759b, "service");
            this.service = interfaceC0759b;
        }

        @NotNull
        public final c a(@NotNull String sessionToken, @NotNull String documentId) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return new c(sessionToken, this.service, documentId, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<init>", "()V", "a", "b", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends b {

            @NotNull
            private final InternalErrorInfo cause;

            public a(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "documents", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0101b extends b {

            @NotNull
            private final List<DocumentFile> documents;

            public C0101b(@NotNull List<? extends DocumentFile> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "documents");
                this.documents = list;
            }

            @NotNull
            public final List<DocumentFile> a() {
                return this.documents;
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1", f = "DocumentLoadWorker.kt", l = {25, 42, 44, 55}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/document/network/c$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0102c extends k implements Function2<h<? super b>, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        private Object i;

        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1$1", f = "DocumentLoadWorker.kt", l = {26}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function1<Continuation<? super t<CreateDocumentResponse>>, Object> {
            int d;
            final c e;

            a(c cVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = cVar;
            }

            public final Object invoke(Continuation<? super t<CreateDocumentResponse>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.e, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    InterfaceC0759b interfaceC0759b = this.e.service;
                    String str = this.e.sessionToken;
                    String documentId = this.e.getDocumentId();
                    this.d = 1;
                    obj = interfaceC0759b.c(str, documentId, this);
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

        C0102c(Continuation<? super C0102c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C0102c c0102c = c.this.new C0102c(continuation);
            c0102c.i = obj;
            return c0102c;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.c.C0102c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(String str, InterfaceC0759b interfaceC0759b, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC0759b, str2);
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (otherWorker instanceof c) {
            c cVar = (c) otherWorker;
            if (Intrinsics.b(this.sessionToken, cVar.sessionToken) && Intrinsics.b(this.documentId, cVar.documentId)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getDocumentId() {
        return this.documentId;
    }

    @Override
    @NotNull
    public g<b> run() {
        return i.v(new C0102c(null));
    }

    private c(String str, InterfaceC0759b interfaceC0759b, String str2) {
        this.sessionToken = str;
        this.service = interfaceC0759b;
        this.documentId = str2;
    }
}
