package bb;

import P9.p;
import S9.b;
import android.content.Context;
import b9.InterfaceC0482a;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.n;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import f9.InterfaceC0574a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ka.g;
import ka.i;
import ka.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o8.InterfaceC0723a;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import u8.InterfaceC0808a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&+B¥\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020!*\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020%2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"LX8/b;", "Lf8/o;", "LX8/b$b;", "Landroid/content/Context;", "context", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/selfie/n;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "LX8/a;", "service", "fromStep", "fromComponent", "fieldKeySelfie", "Lb9/a;", "dataCollector", "Lu8/a;", "fallbackModeManager", "Lf9/a;", "imageHelper", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lo8/a;", "cameraStatsManager", "", "startSelfieTimestamp", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/n;Ljava/util/List;LX8/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb9/a;Lu8/a;Lf9/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lo8/a;J)V", "", "s", "(Lb9/a;Ljava/util/List;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Landroid/content/Context;", "c", "Ljava/lang/String;", "d", "e", "Lcom/withpersona/sdk2/inquiry/selfie/n;", "f", "Ljava/util/List;", "g", "LX8/a;", "h", "i", "j", "k", "Lb9/a;", "l", "Lu8/a;", "m", "Lf9/a;", "n", "o", "Lcom/withpersona/sdk2/camera/CameraProperties;", "p", "Lo8/a;", "q", "J", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0425b implements o<AbstractC0051b> {

    @NotNull
    private final Context context;

    @NotNull
    private final String sessionToken;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final n selfieType;

    @NotNull
    private final List<Selfie> selfies;

    @NotNull
    private final InterfaceC0424a service;

    @NotNull
    private final String fromStep;

    @NotNull
    private final String fromComponent;

    @NotNull
    private final String fieldKeySelfie;

    @NotNull
    private final InterfaceC0482a dataCollector;

    @NotNull
    private final InterfaceC0808a fallbackModeManager;

    @NotNull
    private final InterfaceC0574a imageHelper;

    private final String webRtcObjectId;

    @NotNull
    private final CameraProperties cameraProperties;

    @NotNull
    private final InterfaceC0723a cameraStatsManager;

    private final long startSelfieTimestamp;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Ju\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LX8/b$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lcom/withpersona/sdk2/inquiry/selfie/n;", "selfieType", "fieldKeySelfie", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "startSelfieTimestamp", "LX8/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/n;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;J)LX8/b;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        C0425b a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, @NotNull n selfieType, @NotNull String fieldKeySelfie, @NotNull List<? extends Selfie> selfies, String webRtcObjectId, @NotNull CameraProperties cameraProperties, long startSelfieTimestamp);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LX8/b$b;", "", "<init>", "()V", "a", "b", "LX8/b$b$a;", "LX8/b$b$b;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class AbstractC0051b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LX8/b$b$a;", "LX8/b$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error extends AbstractC0051b {

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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX8/b$b$b;", "LX8/b$b;", "<init>", "()V", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0052b extends AbstractC0051b {

            @NotNull
            public static final C0052b a = new C0052b();

            private C0052b() {
                super(null);
            }
        }

        public AbstractC0051b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0051b() {
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {250, 271, 273}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "LX8/b$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements Function2<ka.h<? super AbstractC0051b>, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        private Object i;

        @f(c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2", f = "SubmitVerificationWorker.kt", l = {252, 257}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class t extends k implements Function1<Continuation<? super bb.t<? extends Object>>, Object> {
            int d;
            final C0425b e;
            final List<MultipartBody.Part> i;

            t(C0425b c0425b, List<MultipartBody.Part> list, Continuation<? super t> continuation) {
                super(1, continuation);
                this.e = c0425b;
                this.i = list;
            }

            public final Object invoke(Continuation<? super bb.t<? extends Object>> continuation) {
                return create(continuation).invokeSuspend(Unit.a);
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new t(this.e, this.i, continuation);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.d;
                if (i != 0) {
                    if (i == 1) {
                        p.b(obj);
                        return (bb.t) obj;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                    return (bb.t) obj;
                }
                p.b(obj);
                if (this.e.fallbackModeManager.b()) {
                    InterfaceC0808a interfaceC0808a = this.e.fallbackModeManager;
                    String str = this.e.sessionToken;
                    List<MultipartBody.Part> list = this.i;
                    this.d = 1;
                    obj = interfaceC0808a.a(str, list, this);
                    if (obj == objC) {
                        return objC;
                    }
                    return (bb.t) obj;
                }
                InterfaceC0424a interfaceC0424a = this.e.service;
                String str2 = this.e.sessionToken;
                String str3 = this.e.inquiryId;
                List<MultipartBody.Part> list2 = this.i;
                this.d = 2;
                obj = interfaceC0424a.a(str2, str3, list2, this);
                if (obj == objC) {
                    return objC;
                }
                return (bb.t) obj;
            }
        }

        @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public class C0053b {
            public static final int[] a;
            public static final int[] b;

            static {
                int[] iArr = new int[Selfie.b.values().length];
                try {
                    iArr[Selfie.b.d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Selfie.b.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Selfie.b.i.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
                int[] iArr2 = new int[CameraProperties.b.values().length];
                try {
                    iArr2[CameraProperties.b.i.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                b = iArr2;
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        public final Object invoke(@NotNull ka.h<? super AbstractC0051b> hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.a);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            h hVar = C0425b.this.new h(continuation);
            hVar.i = obj;
            return hVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r38) throws P9.m {
            throw new UnsupportedOperationException("Method not decompiled: bb.C0425b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0425b(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull n nVar, @NotNull List<? extends Selfie> list, @NotNull InterfaceC0424a interfaceC0424a, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull InterfaceC0482a interfaceC0482a, @NotNull InterfaceC0808a interfaceC0808a, @NotNull InterfaceC0574a interfaceC0574a, String str6, @NotNull CameraProperties cameraProperties, @NotNull InterfaceC0723a interfaceC0723a, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(nVar, "selfieType");
        Intrinsics.checkNotNullParameter(list, "selfies");
        Intrinsics.checkNotNullParameter(interfaceC0424a, "service");
        Intrinsics.checkNotNullParameter(str3, "fromStep");
        Intrinsics.checkNotNullParameter(str4, "fromComponent");
        Intrinsics.checkNotNullParameter(str5, "fieldKeySelfie");
        Intrinsics.checkNotNullParameter(interfaceC0482a, "dataCollector");
        Intrinsics.checkNotNullParameter(interfaceC0808a, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(interfaceC0574a, "imageHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(interfaceC0723a, "cameraStatsManager");
        this.context = context;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.selfieType = nVar;
        this.selfies = list;
        this.service = interfaceC0424a;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.fieldKeySelfie = str5;
        this.dataCollector = interfaceC0482a;
        this.fallbackModeManager = interfaceC0808a;
        this.imageHelper = interfaceC0574a;
        this.webRtcObjectId = str6;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = interfaceC0723a;
        this.startSelfieTimestamp = j;
    }

    public final void s(InterfaceC0482a interfaceC0482a, List<? extends Selfie> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Selfie.SelfieImage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.b.c(F.e(CollectionsKt.t(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((Selfie.SelfieImage) obj2).getPose(), obj2);
        }
        interfaceC0482a.c(new SelfieStepData(this.fromStep, (Selfie) linkedHashMap.get(Selfie.b.d), (Selfie) linkedHashMap.get(Selfie.b.e), (Selfie) linkedHashMap.get(Selfie.b.i)));
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C0425b) && Intrinsics.b(this.sessionToken, ((C0425b) otherWorker).sessionToken);
    }

    @Override
    @NotNull
    public g<AbstractC0051b> run() {
        return i.v(new h(null));
    }
}
