package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import J8.InquiryAttributes;
import P9.m;
import P9.o;
import P9.p;
import bb.t;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import com.withpersona.sdk2.inquiry.network.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.NetworkUtilsKt;
import ha.L;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "LI8/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "service", "Lcom/squareup/moshi/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lcom/squareup/moshi/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V", "", "f", "()I", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "LI8/h;", "endpoint", "Lbb/t;", "h", "(Ljava/lang/String;Lokhttp3/RequestBody;LI8/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LJ8/c;", "attributes", "LP9/o;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(LJ8/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "g", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lcom/squareup/moshi/w;", "getMoshi", "()Lcom/squareup/moshi/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "requestCount", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class d implements I8.a {

    @NotNull
    private final FallbackModeService service;

    @NotNull
    private final w moshi;

    @NotNull
    private final i.a staticTemplateSessionFactory;

    private int requestCount;

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {83, 119}, m = "createSession-gIAlu-s")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int w;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws m {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            Object objC = d.this.c(null, this);
            return objC == S9.b.c() ? objC : o.a(objC);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", f = "ApiController.kt", l = {84}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "(Lha/L;)Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends k implements Function2<L, Continuation<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {
        int d;
        final InquiryAttributes e;
        final d i;

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", f = "ApiController.kt", l = {87}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function1<Continuation<? super t<FallbackModeService.StatusResponse>>, Object> {
            int d;
            final InquiryAttributes e;
            final d i;

            a(InquiryAttributes inquiryAttributes, d dVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = inquiryAttributes;
                this.i = dVar;
            }

            public final Object invoke(Continuation<? super t<FallbackModeService.StatusResponse>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.e, this.i, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                String str;
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    String sessionToken = this.e.getSessionToken();
                    if (sessionToken == null || sessionToken.length() == 0) {
                        str = null;
                    } else {
                        str = "Bearer " + com.withpersona.sdk2.inquiry.internal.d.INSTANCE.a(this.e.getSessionToken());
                    }
                    FallbackModeService service = this.i.getService();
                    FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.e.getTemplateId());
                    this.d = 1;
                    obj = service.c(str, statusRequest, this);
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

        b(InquiryAttributes inquiryAttributes, d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.e = inquiryAttributes;
            this.i = dVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.e, this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super NetworkCallResult<FallbackModeService.StatusResponse>> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                a aVar = new a(this.e, this.i, null);
                this.d = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", f = "ApiController.kt", l = {120}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "(Lha/L;)Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends k implements Function2<L, Continuation<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {
        int d;
        final InquiryAttributes i;

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", f = "ApiController.kt", l = {121}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function1<Continuation<? super t<FallbackModeService.SessionIdResponse>>, Object> {
            int d;
            final d e;
            final InquiryAttributes i;

            a(d dVar, InquiryAttributes inquiryAttributes, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = dVar;
                this.i = inquiryAttributes;
            }

            public final Object invoke(Continuation<? super t<FallbackModeService.SessionIdResponse>> continuation) {
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
                    FallbackModeService service = this.e.getService();
                    FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.i.getTemplateId(), this.i.getTemplateVersion(), this.i.getInquiryId(), this.i.getReferenceId(), this.i.getAccountId(), J8.b.a(this.i.getEnvironment()), this.i.getEnvironmentId(), this.i.d() != null ? new InquiryFieldMap(this.i.d()) : null, this.i.getThemeSetId());
                    this.d = 1;
                    obj = service.a(sessionIdRequest, this);
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

        c(InquiryAttributes inquiryAttributes, Continuation<? super c> continuation) {
            super(2, continuation);
            this.i = inquiryAttributes;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return d.this.new c(this.i, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                a aVar = new a(d.this, this.i, null);
                this.d = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {170, 205}, m = "transition")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0133d extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        Object i;
        int w;

        C0133d(Continuation<? super C0133d> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.w |= Integer.MIN_VALUE;
            return d.this.h(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", f = "ApiController.kt", l = {171}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "(Lha/L;)Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends k implements Function2<L, Continuation<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {
        int d;
        final String i;
        final I8.h v;
        final RequestBody w;

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", f = "ApiController.kt", l = {172}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function1<Continuation<? super t<FallbackModeService.UploadUrlResponse>>, Object> {
            int d;
            final d e;
            final String i;
            final I8.h v;
            final RequestBody w;

            a(d dVar, String str, I8.h hVar, RequestBody requestBody, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = dVar;
                this.i = str;
                this.v = hVar;
                this.w = requestBody;
            }

            public final Object invoke(Continuation<? super t<FallbackModeService.UploadUrlResponse>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.e, this.i, this.v, this.w, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                String string;
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    FallbackModeService service = this.e.getService();
                    String str = this.i;
                    I8.h hVar = this.v;
                    int iF = this.e.f();
                    long jContentLength = this.w.contentLength();
                    MediaType mediaTypeContentType = this.w.contentType();
                    if (mediaTypeContentType == null || (string = mediaTypeContentType.toString()) == null) {
                        string = "application/json";
                    }
                    FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jContentLength, string);
                    this.d = 1;
                    obj = service.b(str, hVar, iF, uploadUrlRequest, this);
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

        e(String str, I8.h hVar, RequestBody requestBody, Continuation<? super e> continuation) {
            super(2, continuation);
            this.i = str;
            this.v = hVar;
            this.w = requestBody;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return d.this.new e(this.i, this.v, this.w, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                a aVar = new a(d.this, this.i, this.v, this.w, null);
                this.d = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", f = "ApiController.kt", l = {206}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "", "<anonymous>", "(Lha/L;)Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends k implements Function2<L, Continuation<? super NetworkCallResult<Object>>, Object> {
        int d;
        final String i;
        final RequestBody v;

        @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", f = "ApiController.kt", l = {207}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends k implements Function1<Continuation<? super t<Object>>, Object> {
            int d;
            final d e;
            final String i;
            final RequestBody v;

            a(d dVar, String str, RequestBody requestBody, Continuation<? super a> continuation) {
                super(1, continuation);
                this.e = dVar;
                this.i = str;
                this.v = requestBody;
            }

            public final Object invoke(Continuation<? super t<Object>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.e, this.i, this.v, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = S9.b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    FallbackModeService service = this.e.getService();
                    String str = this.i;
                    RequestBody requestBody = this.v;
                    this.d = 1;
                    obj = service.d(str, requestBody, this);
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

        f(String str, RequestBody requestBody, Continuation<? super f> continuation) {
            super(2, continuation);
            this.i = str;
            this.v = requestBody;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return d.this.new f(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super NetworkCallResult<Object>> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = S9.b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                a aVar = new a(d.this, this.i, this.v, null);
                this.d = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
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

    public d(@NotNull FallbackModeService fallbackModeService, @NotNull w wVar, @NotNull i.a aVar) {
        Intrinsics.checkNotNullParameter(fallbackModeService, "service");
        Intrinsics.checkNotNullParameter(wVar, "moshi");
        Intrinsics.checkNotNullParameter(aVar, "staticTemplateSessionFactory");
        this.service = fallbackModeService;
        this.moshi = wVar;
        this.staticTemplateSessionFactory = aVar;
    }

    public final int f() {
        int i = this.requestCount + 1;
        this.requestCount = i;
        return i;
    }

    public final java.lang.Object h(java.lang.String r19, okhttp3.RequestBody r20, I8.h r21, kotlin.coroutines.Continuation<? super bb.t<?>> r22) throws P9.m {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.fallbackmode.d.h(java.lang.String, okhttp3.RequestBody, I8.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull Continuation<? super t<?>> continuation) {
        return h(str, requestBody, I8.h.d, continuation);
    }

    @Override
    public Object b(@NotNull String str, @NotNull RequestBody requestBody, @NotNull Continuation<? super t<?>> continuation) {
        return h(str, requestBody, I8.h.e, continuation);
    }

    @Override
    public java.lang.Object c(@org.jetbrains.annotations.NotNull J8.InquiryAttributes r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<com.withpersona.sdk2.inquiry.internal.fallbackmode.i>> r10) throws P9.m {
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.fallbackmode.d.c(J8.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final FallbackModeService getService() {
        return this.service;
    }
}
