package bb;

import P9.p;
import S9.b;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
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

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\fB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lz9/b;", "Lf8/o;", "Lz9/b$b;", "Lz9/a;", "service", "", "jwt", "<init>", "(Lz9/a;Ljava/lang/String;)V", "Lka/g;", "run", "()Lka/g;", "b", "Lz9/a;", "c", "Ljava/lang/String;", "a", "webrtc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0896b implements o<AbstractC0322b> {

    @NotNull
    private final InterfaceC0895a service;

    private final String jwt;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz9/b$a;", "", "Lz9/a;", "service", "<init>", "(Lz9/a;)V", "", "jwt", "Lz9/b;", "a", "(Ljava/lang/String;)Lz9/b;", "Lz9/a;", "b", "()Lz9/a;", "webrtc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final InterfaceC0895a service;

        public a(@NotNull InterfaceC0895a interfaceC0895a) {
            Intrinsics.checkNotNullParameter(interfaceC0895a, "service");
            this.service = interfaceC0895a;
        }

        @NotNull
        public final C0896b a(String jwt) {
            return new C0896b(this.service, jwt);
        }

        @NotNull
        public final InterfaceC0895a getService() {
            return this.service;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lz9/b$b;", "", "<init>", "()V", "a", "b", "Lz9/b$b$a;", "Lz9/b$b$b;", "webrtc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0322b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lz9/b$b$a;", "Lz9/b$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "webrtc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends AbstractC0322b {

            @NotNull
            private final InternalErrorInfo cause;

            public Error(@NotNull InternalErrorInfo internalErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(internalErrorInfo, "cause");
                this.cause = internalErrorInfo;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lz9/b$b$b;", "Lz9/b$b;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "webrtc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0323b extends AbstractC0322b {

            @NotNull
            private final AuthorizeWebRtcResponse result;

            public C0323b(@NotNull AuthorizeWebRtcResponse authorizeWebRtcResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(authorizeWebRtcResponse, "result");
                this.result = authorizeWebRtcResponse;
            }

            @NotNull
            public final AuthorizeWebRtcResponse getResult() {
                return this.result;
            }
        }

        public AbstractC0322b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0322b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1", f = "WebRtcWorker.kt", l = {36, 40, 42, 53}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "Lz9/b$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements Function2<ka.h<? super AbstractC0322b>, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        private Object i;

        @f(c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1", f = "WebRtcWorker.kt", l = {37}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class t extends k implements Function1<Continuation<? super bb.t<AuthorizeWebRtcResponse>>, Object> {
            int d;
            final C0896b e;

            t(C0896b c0896b, Continuation<? super t> continuation) {
                super(1, continuation);
                this.e = c0896b;
            }

            public final Object invoke(Continuation<? super bb.t<AuthorizeWebRtcResponse>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new t(this.e, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    InterfaceC0895a interfaceC0895a = this.e.service;
                    String str = this.e.jwt;
                    this.d = 1;
                    obj = interfaceC0895a.a(str, this);
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

        public final Object invoke(@NotNull ka.h<? super AbstractC0322b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            h hVar = C0896b.this.new h(continuation);
            hVar.i = obj;
            return hVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
            throw new UnsupportedOperationException("Method not decompiled: bb.C0896b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0896b(@NotNull InterfaceC0895a interfaceC0895a, String str) {
        Intrinsics.checkNotNullParameter(interfaceC0895a, "service");
        this.service = interfaceC0895a;
        this.jwt = str;
    }

    @Override
    public boolean a(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override
    @NotNull
    public g<AbstractC0322b> run() {
        return i.v(new h(null));
    }
}
