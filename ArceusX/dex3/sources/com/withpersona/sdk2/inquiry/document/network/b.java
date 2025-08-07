package com.withpersona.sdk2.inquiry.document.network;

import P9.p;
import bb.C0760c;
import bb.InterfaceC0759b;
import bb.t;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import ha.D0;
import ha.InterfaceC0459g;
import ha.L;
import ha.M;
import ha.N;
import ha.T;
import ha.c0;
import ha.z0;
import java.io.File;
import java.util.List;
import ka.g;
import ka.h;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0015B1\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b;", "Lf8/o;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "sessionToken", "Ls8/b;", "service", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "La9/g;", "fileHelper", "<init>", "(Ljava/lang/String;Ls8/b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;La9/g;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Ljava/lang/String;", "c", "Ls8/b;", "d", "e", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "f", "La9/g;", "Lha/L;", "g", "Lha/L;", "serviceCoroutineScope", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class b implements o<AbstractC0095b> {

    @NotNull
    private final String sessionToken;

    @NotNull
    private final InterfaceC0759b service;

    @NotNull
    private final String documentId;

    @NotNull
    private final DocumentFile.Local localDocument;

    @NotNull
    private final InterfaceC0459g fileHelper;

    @NotNull
    private final L serviceCoroutineScope;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$a;", "", "Ls8/b;", "service", "La9/g;", "fileHelper", "<init>", "(Ls8/b;La9/g;)V", "", "sessionToken", "documentId", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "localDocument", "Lcom/withpersona/sdk2/inquiry/document/network/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;)Lcom/withpersona/sdk2/inquiry/document/network/b;", "Ls8/b;", "b", "La9/g;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final InterfaceC0759b service;

        @NotNull
        private final InterfaceC0459g fileHelper;

        public a(@NotNull InterfaceC0759b interfaceC0759b, @NotNull InterfaceC0459g interfaceC0459g) {
            Intrinsics.checkNotNullParameter(interfaceC0759b, "service");
            Intrinsics.checkNotNullParameter(interfaceC0459g, "fileHelper");
            this.service = interfaceC0759b;
            this.fileHelper = interfaceC0459g;
        }

        @NotNull
        public final b a(@NotNull String sessionToken, @NotNull String documentId, @NotNull DocumentFile.Local localDocument) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(localDocument, "localDocument");
            return new b(sessionToken, this.service, documentId, localDocument, this.fileHelper, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$d;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0095b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$a;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends AbstractC0095b {

            @NotNull
            private final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            public a(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(documentErrorResponse, "cause");
                this.cause = documentErrorResponse;
            }

            @NotNull
            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$b;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0096b extends AbstractC0095b {

            @NotNull
            private final InternalErrorInfo cause;

            public C0096b(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$c;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "progressPercentage", "<init>", "(I)V", "a", "I", "()I", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class c extends AbstractC0095b {

            private final int progressPercentage;

            public c(int i) {
                super(null);
                this.progressPercentage = i;
            }

            public final int getProgressPercentage() {
                return this.progressPercentage;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b$d;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "oldLocalDocument", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "newRemoteDocument", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "b", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class d extends AbstractC0095b {

            @NotNull
            private final DocumentFile.Local oldLocalDocument;

            @NotNull
            private final DocumentFile.Remote newRemoteDocument;

            public d(@NotNull DocumentFile.Local local, @NotNull DocumentFile.Remote remote) {
                super(null);
                Intrinsics.checkNotNullParameter(local, "oldLocalDocument");
                Intrinsics.checkNotNullParameter(remote, "newRemoteDocument");
                this.oldLocalDocument = local;
                this.newRemoteDocument = remote;
            }

            @NotNull
            public final DocumentFile.Remote getNewRemoteDocument() {
                return this.newRemoteDocument;
            }

            @NotNull
            public final DocumentFile.Local getOldLocalDocument() {
                return this.oldLocalDocument;
            }
        }

        public AbstractC0095b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0095b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1", f = "DocumentFileUploadWorker.kt", l = {151}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends k implements Function2<h<? super AbstractC0095b>, Continuation<? super Unit>, Object> {
        int d;
        private Object e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "it", "", "a", "(Lcom/withpersona/sdk2/inquiry/document/network/b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements h {
            final h<AbstractC0095b> d;

            @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$1", f = "DocumentFileUploadWorker.kt", l = {152}, m = "emit")
            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class C0097a extends kotlin.coroutines.jvm.internal.d {
                Object d;
                Object e;
                final a<T> i;
                int v;

                C0097a(a<? super T> aVar, Continuation<? super C0097a> continuation) {
                    super(continuation);
                    this.i = aVar;
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    this.e = obj;
                    this.v |= Integer.MIN_VALUE;
                    return this.i.c(null, this);
                }
            }

            a(h<? super AbstractC0095b> hVar) {
                this.d = hVar;
            }

            public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.document.network.b.AbstractC0095b r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.b.c.a.c(com.withpersona.sdk2.inquiry.document.network.b$b, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1", f = "DocumentFileUploadWorker.kt", l = {143, 147}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b$c;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0098b extends k implements Function2<h<? super AbstractC0095b.c>, Continuation<? super Unit>, Object> {
            int d;
            private Object e;
            final C0760c i;

            @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$progressFlow$1$1", f = "DocumentFileUploadWorker.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            static final class a extends k implements Function2<Integer, Continuation<? super Boolean>, Object> {
                int d;
                int e;

                a(Continuation<? super a> continuation) {
                    super(2, continuation);
                }

                public final Object a(int i, Continuation<? super Boolean> continuation) {
                    return create(Integer.valueOf(i), continuation).invokeSuspend(Unit.a);
                }

                @NotNull
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    a aVar = new a(continuation);
                    aVar.e = ((Number) obj).intValue();
                    return aVar;
                }

                public Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).intValue(), (Continuation) obj2);
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    S9.b.c();
                    if (this.d != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.e < 100);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0099b<T> implements h {
                final h<AbstractC0095b.c> d;

                C0099b(h<? super AbstractC0095b.c> hVar) {
                    this.d = hVar;
                }

                public final Object a(int i, @NotNull Continuation<? super Unit> continuation) {
                    Object objC = this.d.c(new AbstractC0095b.c(i), continuation);
                    return objC == S9.b.c() ? objC : Unit.a;
                }

                public Object c(Object obj, Continuation continuation) {
                    return a(((Number) obj).intValue(), continuation);
                }
            }

            C0098b(C0760c c0760c, Continuation<? super C0098b> continuation) {
                super(2, continuation);
                this.i = c0760c;
            }

            public final Object invoke(@NotNull h<? super AbstractC0095b.c> hVar, Continuation<? super Unit> continuation) {
                return create(hVar, continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                C0098b c0098b = new C0098b(this.i, continuation);
                c0098b.e = obj;
                return c0098b;
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                h hVar;
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    hVar = (h) this.e;
                    g gVarG = i.G(this.i.a(), new a(null));
                    C0099b c0099b = new C0099b(hVar);
                    this.e = hVar;
                    this.d = 1;
                    if (gVarG.a(c0099b, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p.b(obj);
                        return Unit.a;
                    }
                    hVar = (h) this.e;
                    p.b(obj);
                }
                AbstractC0095b.c cVar = new AbstractC0095b.c(100);
                this.e = null;
                this.d = 2;
                if (hVar.c(cVar, this) == objC) {
                    return objC;
                }
                return Unit.a;
            }
        }

        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1", f = "DocumentFileUploadWorker.kt", l = {54}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "(Lha/L;)Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0100c extends k implements Function2<L, Continuation<? super NetworkCallResult<DocumentFileUploadResponse>>, Object> {
            int d;
            final b e;
            final C0760c i;

            @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1", f = "DocumentFileUploadWorker.kt", l = {55}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class a extends k implements Function1<Continuation<? super t<DocumentFileUploadResponse>>, Object> {
                int d;
                final b e;
                final C0760c i;

                a(b bVar, C0760c c0760c, Continuation<? super a> continuation) {
                    super(1, continuation);
                    this.e = bVar;
                    this.i = c0760c;
                }

                public final Object invoke(Continuation<? super t<DocumentFileUploadResponse>> continuation) {
                    return create(continuation).invokeSuspend(Unit.a);
                }

                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new a(this.e, this.i, continuation);
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objC = S9.b.c();
                    int i = this.d;
                    if (i == 0) {
                        p.b(obj);
                        InterfaceC0759b interfaceC0759b = this.e.service;
                        String str = this.e.sessionToken;
                        MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
                        MultipartBody.Part partCreateFormData = companion.createFormData("data[type]", "document-file");
                        MultipartBody.Part partCreateFormData2 = companion.createFormData("data[attributes][document-id]", this.e.documentId);
                        MultipartBody.Part partCreateFormData3 = companion.createFormData("data[attributes][capture-method]", this.e.localDocument.getCaptureMethod().getType());
                        MultipartBody.Part partCreateFormData4 = companion.createFormData("data[attributes][originals][]", this.e.localDocument.getAbsoluteFilePath(), this.i);
                        String name = new File(this.e.localDocument.getAbsoluteFilePath()).getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        List<MultipartBody.Part> listM = CollectionsKt.m(new MultipartBody.Part[]{partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, companion.createFormData("data[attributes][name]", name)});
                        this.d = 1;
                        obj = interfaceC0759b.b(str, listM, this);
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

            C0100c(b bVar, C0760c c0760c, Continuation<? super C0100c> continuation) {
                super(2, continuation);
                this.e = bVar;
                this.i = c0760c;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0100c(this.e, this.i, continuation);
            }

            public final Object invoke(@NotNull L l, Continuation<? super NetworkCallResult<DocumentFileUploadResponse>> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    a aVar = new a(this.e, this.i, null);
                    this.d = 1;
                    obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
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

        @f(c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1", f = "DocumentFileUploadWorker.kt", l = {80, 84, 96, 121, 123, 130, 136}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lcom/withpersona/sdk2/inquiry/document/network/b$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class d extends k implements Function2<h<? super AbstractC0095b>, Continuation<? super Unit>, Object> {
            Object d;
            int e;
            private Object i;
            final T<NetworkCallResult<DocumentFileUploadResponse>> v;
            final b w;

            d(T<? extends NetworkCallResult<DocumentFileUploadResponse>> t, b bVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.v = t;
                this.w = bVar;
            }

            public final Object invoke(@NotNull h<? super AbstractC0095b> hVar, Continuation<? super Unit> continuation) {
                return create(hVar, continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                d dVar = new d(this.v, this.w, continuation);
                dVar.i = obj;
                return dVar;
            }

            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.network.b.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull h<? super AbstractC0095b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            c cVar = b.this.new c(continuation);
            cVar.e = obj;
            return cVar;
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                h hVar = (h) this.e;
                C0760c c0760c = new C0760c(new File(b.this.localDocument.getAbsoluteFilePath()), MediaType.Companion.parse(b.this.fileHelper.a(b.this.localDocument.getAbsoluteFilePath())));
                g gVarB = i.B(new g[]{i.v(new d(ha.g.b(b.this.serviceCoroutineScope, c0.b(), (N) null, new C0100c(b.this, c0760c, null), 2, (Object) null), b.this, null)), i.v(new C0098b(c0760c, null))});
                a aVar = new a(hVar);
                this.d = 1;
                if (gVarB.a(aVar, this) == objC) {
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

    public b(String str, InterfaceC0759b interfaceC0759b, String str2, DocumentFile.Local local, InterfaceC0459g interfaceC0459g, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC0759b, str2, local, interfaceC0459g);
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        if (otherWorker instanceof b) {
            b bVar = (b) otherWorker;
            if (Intrinsics.b(this.sessionToken, bVar.sessionToken) && Intrinsics.b(this.localDocument, bVar.localDocument)) {
                return true;
            }
        }
        return false;
    }

    @Override
    @NotNull
    public g<AbstractC0095b> run() {
        return i.v(new c(null));
    }

    private b(String str, InterfaceC0759b interfaceC0759b, String str2, DocumentFile.Local local, InterfaceC0459g interfaceC0459g) {
        this.sessionToken = str;
        this.service = interfaceC0759b;
        this.documentId = str2;
        this.localDocument = local;
        this.fileHelper = interfaceC0459g;
        this.serviceCoroutineScope = M.a(c0.a().K(D0.b((z0) null, 1, (Object) null)));
    }
}
