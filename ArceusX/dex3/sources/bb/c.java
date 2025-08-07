package bb;

import P9.m;
import P9.p;
import android.content.Context;
import b9.InterfaceC0482a;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData;
import com.withpersona.sdk2.inquiry.network.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import d9.d;
import d9.n;
import f9.InterfaceC0574a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.g;
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
import kotlin.text.StringsKt;
import o8.InterfaceC0723a;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import u8.InterfaceC0808a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#(B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u001e*\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\"2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"LB8/c;", "Lf8/o;", "LB8/c$b;", "Landroid/content/Context;", "context", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "service", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "Lb9/a;", "dataCollector", "Lu8/a;", "fallbackModeManager", "Lf9/a;", "imageHelper", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lo8/a;", "cameraStatsManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Lb9/a;Lu8/a;Lf9/a;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Lo8/a;)V", "", "Lokhttp3/MultipartBody$Part;", "body", "", "l", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "otherWorker", "", "a", "(Lf8/o;)Z", "Lka/g;", "run", "()Lka/g;", "b", "Landroid/content/Context;", "c", "Ljava/lang/String;", "d", "e", "f", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "i", "Lb9/a;", "j", "Lu8/a;", "k", "Lf9/a;", "m", "Lcom/withpersona/sdk2/camera/CameraProperties;", "n", "Lo8/a;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c implements o<b> {

    @NotNull
    private final Context context;

    @NotNull
    private final String sessionToken;

    @NotNull
    private final String inquiryId;

    @NotNull
    private final String fromStep;

    @NotNull
    private final String fromComponent;

    @NotNull
    private final com.withpersona.sdk2.inquiry.governmentid.network.a service;

    private final GovernmentIdRequestArguments governmentIdRequestArguments;

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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JW\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LB8/c$a;", "", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "LB8/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)LB8/c;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, GovernmentIdRequestArguments governmentIdRequestArguments, String webRtcObjectId, @NotNull CameraProperties cameraProperties);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LB8/c$b;", "", "<init>", "()V", "a", "b", "c", "LB8/c$b$a;", "LB8/c$b$b;", "LB8/c$b$c;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LB8/c$b$a;", "LB8/c$b;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends b {

            @NotNull
            private final InternalErrorInfo.NetworkErrorInfo cause;

            public a(@NotNull InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(networkErrorInfo, "cause");
                this.cause = networkErrorInfo;
            }

            @NotNull
            public final InternalErrorInfo.NetworkErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LB8/c$b$b;", "LB8/c$b;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "()Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0005b extends b {

            @NotNull
            private final GenericFileUploadErrorResponse.DocumentErrorResponse cause;

            public C0005b(@NotNull GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse) {
                super(null);
                Intrinsics.checkNotNullParameter(documentErrorResponse, "cause");
                this.cause = documentErrorResponse;
            }

            @NotNull
            public final GenericFileUploadErrorResponse.DocumentErrorResponse getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LB8/c$b$c;", "LB8/c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0006c extends b {

            @NotNull
            public static final C0006c a = new C0006c();

            private C0006c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0006c);
            }

            public int hashCode() {
                return 1775834809;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class C0007c {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] iArr = new int[CameraProperties.b.values().length];
            try {
                iArr[CameraProperties.b.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[GovernmentId.b.values().length];
            try {
                iArr2[GovernmentId.b.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GovernmentId.b.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GovernmentId.b.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1", f = "SubmitVerificationWorker.kt", l = {67, 89, 107, 109, 116}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lka/h;", "LB8/c$b;", "", "<anonymous>", "(Lka/h;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends k implements Function2<ka.h<? super b>, Continuation<? super Unit>, Object> {
        Object d;
        int e;
        private Object i;

        @f(c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$1", f = "SubmitVerificationWorker.kt", l = {69, 74}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/t;", "", "<anonymous>", "()Lbb/t;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class t extends k implements Function1<Continuation<? super bb.t<? extends Object>>, Object> {
            int d;
            final c e;
            final List<MultipartBody.Part> i;

            t(c cVar, List<MultipartBody.Part> list, Continuation<? super t> continuation) {
                super(1, continuation);
                this.e = cVar;
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
                Object objC = S9.b.c();
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
                com.withpersona.sdk2.inquiry.governmentid.network.a aVar = this.e.service;
                String str2 = this.e.sessionToken;
                String str3 = this.e.inquiryId;
                List<MultipartBody.Part> list2 = this.i;
                this.d = 2;
                obj = aVar.a(str2, str3, list2, this);
                if (obj == objC) {
                    return objC;
                }
                return (bb.t) obj;
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
            h hVar = c.this.new h(continuation);
            hVar.i = obj;
            return hVar;
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r16) throws P9.m {
            throw new UnsupportedOperationException("Method not decompiled: bb.c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull com.withpersona.sdk2.inquiry.governmentid.network.a aVar, GovernmentIdRequestArguments governmentIdRequestArguments, @NotNull InterfaceC0482a interfaceC0482a, @NotNull InterfaceC0808a interfaceC0808a, @NotNull InterfaceC0574a interfaceC0574a, String str5, @NotNull CameraProperties cameraProperties, @NotNull InterfaceC0723a interfaceC0723a) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "sessionToken");
        Intrinsics.checkNotNullParameter(str2, "inquiryId");
        Intrinsics.checkNotNullParameter(str3, "fromStep");
        Intrinsics.checkNotNullParameter(str4, "fromComponent");
        Intrinsics.checkNotNullParameter(aVar, "service");
        Intrinsics.checkNotNullParameter(interfaceC0482a, "dataCollector");
        Intrinsics.checkNotNullParameter(interfaceC0808a, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(interfaceC0574a, "imageHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(interfaceC0723a, "cameraStatsManager");
        this.context = context;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.fromStep = str3;
        this.fromComponent = str4;
        this.service = aVar;
        this.governmentIdRequestArguments = governmentIdRequestArguments;
        this.dataCollector = interfaceC0482a;
        this.fallbackModeManager = interfaceC0808a;
        this.imageHelper = interfaceC0574a;
        this.webRtcObjectId = str5;
        this.cameraProperties = cameraProperties;
        this.cameraStatsManager = interfaceC0723a;
    }

    public final void l(GovernmentIdRequestArguments governmentIdRequestArguments, List<MultipartBody.Part> list, CameraProperties cameraProperties) throws m {
        String lowerCase;
        GovernmentId governmentId;
        String idClassKey;
        this.dataCollector.c(new GovernmentIdStepData(this.fromStep, governmentIdRequestArguments.c()));
        MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
        MultipartBody.Part partCreateFormData = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][label]", cameraProperties.getLabel());
        String str = "data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][facing_mode]";
        if (C0007c.a[cameraProperties.getFacingMode().ordinal()] == 1) {
            lowerCase = "";
        } else {
            lowerCase = cameraProperties.getFacingMode().toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        MultipartBody.Part partCreateFormData2 = companion.createFormData(str, lowerCase);
        MultipartBody.Part partCreateFormData3 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][width]", String.valueOf(cameraProperties.getSize().getWidth()));
        MultipartBody.Part partCreateFormData4 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][height]", String.valueOf(cameraProperties.getSize().getHeight()));
        MultipartBody.Part partCreateFormData5 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][aspectRatio]", String.valueOf(cameraProperties.a()));
        MultipartBody.Part partCreateFormData6 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][frameRate]", String.valueOf(cameraProperties.getFrameRate()));
        MultipartBody.Part partCreateFormData7 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][kind]", "");
        MultipartBody.Part partCreateFormData8 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][selectedCameraIndex]", "");
        MultipartBody.Part partCreateFormData9 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][streamStability]", "");
        MultipartBody.Part partCreateFormData10 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][allCameraLabels]", "");
        MultipartBody.Part partCreateFormData11 = companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][client]", n.j(this.context) ? "mobile" : "mobile_sdk");
        list.addAll(CollectionsKt.m(new MultipartBody.Part[]{partCreateFormData, partCreateFormData2, partCreateFormData3, partCreateFormData4, partCreateFormData5, partCreateFormData6, partCreateFormData7, partCreateFormData8, partCreateFormData9, partCreateFormData10, partCreateFormData11, companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][platform]", d.a() ? "android" : "android_sdk"), companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][cameraProperties][factor]", String.valueOf(this.cameraStatsManager.a().getAverageRotation()))}));
        List<GovernmentId> listC = governmentIdRequestArguments.c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            governmentId = (GovernmentId) CollectionsKt.firstOrNull(governmentIdRequestArguments.c());
            if (governmentId != null) {
                list.add(MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyIdClass() + "]", idClassKey));
            }
        } else {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                if (Intrinsics.b(((GovernmentId) it.next()).getIdClassKey(), "auto-classification")) {
                    break;
                }
            }
            governmentId = (GovernmentId) CollectionsKt.firstOrNull(governmentIdRequestArguments.c());
            if (governmentId != null && (idClassKey = governmentId.getIdClassKey()) != null) {
                list.add(MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyIdClass() + "]", idClassKey));
            }
        }
        Iterator it2 = governmentIdRequestArguments.c().iterator();
        while (true) {
            String str2 = "front_and_back";
            if (!it2.hasNext()) {
                if (this.webRtcObjectId != null) {
                    MultipartBody.Part.Companion companion2 = MultipartBody.Part.Companion;
                    MultipartBody.Part partCreateFormData12 = companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][name]", "video");
                    String str3 = "data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][capture-method]";
                    String lowerCase2 = GovernmentIdCapture.a.e.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    list.addAll(CollectionsKt.m(new MultipartBody.Part[]{partCreateFormData12, companion2.createFormData(str3, lowerCase2), companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][type]", "video"), companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][page]", "front_and_back"), companion2.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][objectId]", this.webRtcObjectId)}));
                    return;
                }
                return;
            }
            GovernmentId governmentId2 = (GovernmentId) it2.next();
            for (Frame frame : governmentId2.b1()) {
                Iterator it3 = it2;
                if (StringsKt.F(frame.getMimeType(), "image/", false, 2, (Object) null)) {
                    this.imageHelper.a(new File(frame.getAbsoluteFilePath()));
                }
                it2 = it3;
            }
            Iterator it4 = it2;
            int i = C0007c.b[governmentId2.getSide().ordinal()];
            if (i == 1) {
                str2 = "front";
            } else if (i == 2) {
                str2 = "back";
            } else if (i != 3) {
                throw new m();
            }
            MultipartBody.Part.Companion companion3 = MultipartBody.Part.Companion;
            list.addAll(CollectionsKt.m(new MultipartBody.Part[]{companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][page]", str2), companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][capture_method]", governmentId2.getCaptureMethod().toString())}));
            list.addAll(m(governmentIdRequestArguments, governmentId2.b1()));
            if (governmentId2 instanceof GovernmentId.GovernmentIdImage) {
                RawExtraction rawExtraction = ((GovernmentId.GovernmentIdImage) governmentId2).getRawExtraction();
                if (rawExtraction != null) {
                    List<MultipartBody.Part> list2 = list;
                    list2.add(companion3.createFormData("data[attributes][client-extraction-raws][][type]", rawExtraction.getType()));
                    list2.add(companion3.createFormData("data[attributes][client-extraction-raws][][value]", rawExtraction.getValue()));
                }
                list.add(companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][type]", "image"));
            } else if (governmentId2 instanceof GovernmentId.GovernmentIdVideo) {
                list.add(companion3.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][type]", "video"));
            }
            it2 = it4;
        }
    }

    private static final List<MultipartBody.Part> m(GovernmentIdRequestArguments governmentIdRequestArguments, List<Frame> list) {
        ArrayList arrayList = new ArrayList();
        for (Frame frame : list) {
            CollectionsKt.y(arrayList, CollectionsKt.d(MultipartBody.Part.Companion.createFormData("data[attributes][fields][" + governmentIdRequestArguments.getFieldKeyDocument() + "][files][][frames][]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.Companion.create(new File(frame.getAbsoluteFilePath()), MediaType.Companion.parse(frame.getMimeType())))));
        }
        return arrayList;
    }

    @Override
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof c) && Intrinsics.b(this.sessionToken, ((c) otherWorker).sessionToken);
    }

    @Override
    @NotNull
    public g<b> run() {
        return i.v(new h(null));
    }
}
