package ha;

import A9.a;
import P9.d;
import P9.o;
import P9.p;
import S9.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.SurfaceHolder;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import ha.C0638d;
import ha.H;
import ha.M;
import ha.N;
import ha.V0;
import ha.c0;
import ha.z0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.CancellationException;
import ka.D;
import ka.K;
import ka.i;
import ka.x;
import ka.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import o8.InterfaceC0723a;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;
import u5.z;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u00039;?BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0014H\u0083@¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b$\u0010\u0018J,\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0083@¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00142\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u0004\u0018\u00010\u001a*\u000201H\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010N\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010LR\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010FR\u0016\u0010t\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010FR\u0016\u0010v\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010FR\u0016\u0010x\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010FR\"\u0010|\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020}0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010{R#\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020}0\u0080\u00018\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010FR\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010$R\u0019\u0010\u0091\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u0002010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0019\u0010\u0098\u0001\u001a\u00030\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b$\u0010\u0097\u0001\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0099\u0001"}, d2 = {"Ln8/d;", "", "Landroid/content/Context;", "context", "Ln8/l;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Ln8/b;", "analyzer", "Lp8/a;", "videoCaptureMethod", "LA9/a;", "webRtcManager", "", "isAudioRequired", "Lo8/a;", "cameraStatsManager", "<init>", "(Landroid/content/Context;Ln8/l;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Ln8/b;Lp8/a;LA9/a;ZLo8/a;)V", "", "T", "()V", "V", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LP9/o;", "Ljava/io/File;", "W", "Q", "analyzerEnabled", "S", "(Z)V", "enable", "G", "H", "L", "F", "Landroid/hardware/camera2/CameraManager;", "manager", "", "cameraId", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", "O", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/media/ImageReader;", "M", "()Landroid/media/ImageReader;", "Landroid/media/Image;", "image", "P", "(Landroid/media/Image;)V", "R", "(Landroid/media/Image;)Ljava/io/File;", "a", "Landroid/content/Context;", "b", "Ln8/l;", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "J", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "d", "Ln8/b;", "e", "Lp8/a;", "f", "LA9/a;", "g", "Z", "h", "Lo8/a;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "I", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lha/L;", "j", "Lha/L;", "coroutineScope", "k", "Ljava/lang/String;", "l", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraCharacteristics;", "m", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "", "n", "orientation", "Ln8/r;", "o", "Ln8/r;", "mediaRecorderWrapper", "p", "Landroid/hardware/camera2/CameraDevice;", "camera", "Landroid/os/HandlerThread;", "q", "Landroid/os/HandlerThread;", "cameraThread", "r", "Landroid/os/Handler;", "cameraHandler", "Ln8/k;", "s", "Ln8/k;", "session", "t", "recordingStarted", "u", "isAnalyzerEnabled", "v", "isImageCaptureRequested", "w", "isPreviewSurfaceAvailable", "Lka/y;", "x", "Lka/y;", "imageCaptureResult", "Ln8/d$d;", "y", "_state", "Lka/K;", "z", "Lka/K;", "K", "()Lka/K;", "state", "A", "isPreviewStarted", "Landroid/view/SurfaceHolder$Callback;", "B", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolderCallback", "", "C", "analysisSizeScaling", "D", "Landroid/media/ImageReader;", "imageReader", "Lka/x;", "E", "Lka/x;", "imageProcessingFlow", "Landroid/os/ConditionVariable;", "Landroid/os/ConditionVariable;", "processImageHaltedCv", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0638d {

    private boolean isPreviewStarted;

    private SurfaceHolder.Callback surfaceHolderCallback;

    private float analysisSizeScaling;

    @NotNull
    private ImageReader imageReader;

    @NotNull
    private x<Image> imageProcessingFlow;

    @NotNull
    private ConditionVariable processImageHaltedCv;

    @NotNull
    private final Context context;

    @NotNull
    private final CameraChoice cameraChoice;

    @NotNull
    private final Camera2PreviewView previewView;

    @NotNull
    private final InterfaceC0636b analyzer;

    @NotNull
    private final EnumC0732a videoCaptureMethod;

    private final a webRtcManager;

    private final boolean isAudioRequired;

    @NotNull
    private final InterfaceC0723a cameraStatsManager;

    @NotNull
    private final CameraProperties cameraProperties;

    @NotNull
    private final ha.L coroutineScope;

    @NotNull
    private final String cameraId;

    @NotNull
    private final CameraManager cameraManager;

    @NotNull
    private final CameraCharacteristics characteristics;

    private final int orientation;

    @NotNull
    private final C0657r mediaRecorderWrapper;

    private CameraDevice camera;

    @NotNull
    private final HandlerThread cameraThread;

    @NotNull
    private final Handler cameraHandler;

    private C0650k session;

    private volatile boolean recordingStarted;

    private volatile boolean isAnalyzerEnabled;

    private volatile boolean isImageCaptureRequested;

    private volatile boolean isPreviewSurfaceAvailable;

    @NotNull
    private final y<o<File>> imageCaptureResult;

    @NotNull
    private final y<InterfaceC0249d> _state;

    @NotNull
    private final K<InterfaceC0249d> state;

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", f = "Camera2Manager.kt", l = {144}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/media/Image;", "it", "", "a", "(Landroid/media/Image;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a<T> implements ka.h {
            final C0638d d;

            a(C0638d c0638d) {
                this.d = c0638d;
            }

            public final Object c(@NotNull Image image, @NotNull Continuation<? super Unit> continuation) {
                this.d.P(image);
                return Unit.a;
            }
        }

        L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0638d.this.new L(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws d {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                x xVar = C0638d.this.imageProcessingFlow;
                a aVar = new a(C0638d.this);
                this.d = 1;
                if (xVar.a(aVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            throw new d();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Ln8/d$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "b", "Ln8/d$c$a;", "Ln8/d$c$b;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class c extends Exception {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln8/d$c$a;", "Ln8/d$c;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a extends c {
            public a(@NotNull String str, @NotNull Throwable th) {
                super(str, th, null);
                Intrinsics.checkNotNullParameter(str, "message");
                Intrinsics.checkNotNullParameter(th, "cause");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln8/d$c$b;", "Ln8/d$c;", "<init>", "()V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b extends c {
            public b() {
                super(null);
            }
        }

        public c(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }

        private c(String str, Throwable th) {
            super(str, th);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ln8/d$d;", "", "a", "b", "c", "d", "Ln8/d$d$a;", "Ln8/d$d$b;", "Ln8/d$d$c;", "Ln8/d$d$d;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface InterfaceC0249d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln8/d$d$a;", "Ln8/d$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class a implements InterfaceC0249d {

            @NotNull
            public static final a a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1835001754;
            }

            @NotNull
            public String toString() {
                return "Created";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln8/d$d$b;", "Ln8/d$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class b implements InterfaceC0249d {

            @NotNull
            public static final b a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1111701481;
            }

            @NotNull
            public String toString() {
                return "Destroyed";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln8/d$d$c;", "Ln8/d$d;", "Ln8/d$c;", "error", "<init>", "(Ln8/d$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln8/d$c;", "()Ln8/d$c;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Error implements InterfaceC0249d {

            @NotNull
            private final c error;

            public Error(@NotNull c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "error");
                this.error = cVar;
            }

            @NotNull
            public final c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.b(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(error=" + this.error + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln8/d$d$d;", "Ln8/d$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class C0250d implements InterfaceC0249d {

            @NotNull
            public static final C0250d a = new C0250d();

            private C0250d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0250d);
            }

            public int hashCode() {
                return -465774081;
            }

            @NotNull
            public String toString() {
                return "Started";
            }
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", f = "Camera2Manager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0639e extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        C0639e(Continuation<? super C0639e> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0638d.this.new C0639e(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            Object value = C0638d.this._state.getValue();
            InterfaceC0249d.b bVar = InterfaceC0249d.b.a;
            if (Intrinsics.b(value, bVar)) {
                return Unit.a;
            }
            C0638d.this._state.setValue(bVar);
            C0638d.this.getPreviewView().getHolder().removeCallback(C0638d.this.surfaceHolderCallback);
            C0638d.this.processImageHaltedCv.block(2000L);
            C0638d.this.mediaRecorderWrapper.f();
            C0638d.this.imageReader.close();
            C0650k c0650k = C0638d.this.session;
            if (c0650k != null) {
                c0650k.e();
            }
            C0638d.this.session = null;
            CameraDevice cameraDevice = C0638d.this.camera;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            C0638d.this.camera = null;
            C0638d.this.cameraStatsManager.c();
            M.e(C0638d.this.coroutineScope, (CancellationException) null, 1, (Object) null);
            return Unit.a;
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", f = "Camera2Manager.kt", l = {238, 256, 281}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0640f extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        Object d;
        int e;

        C0640f(Continuation<? super C0640f> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0638d.this.new C0640f(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) throws java.lang.Throwable {
            throw new UnsupportedOperationException("Method not decompiled: ha.C0638d.C0640f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"n8/d$g", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", "device", "", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "", "error", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class g extends CameraDevice.StateCallback {
        final ha.m<CameraDevice> a;
        final C0638d b;
        final String c;

        g(ha.m<? super CameraDevice> mVar, C0638d c0638d, String str) {
            this.a = mVar;
            this.b = c0638d;
            this.c = str;
        }

        @Override
        public void onDisconnected(@NotNull CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.b.camera = null;
        }

        @Override
        public void onError(@NotNull CameraDevice device, int error) {
            Intrinsics.checkNotNullParameter(device, "device");
            String str = error != 1 ? error != 2 ? error != 3 ? error != 4 ? error != 5 ? "Unknown" : "Fatal (service)" : "Fatal (device)" : "Device policy" : "Maximum cameras in use" : "Camera in use";
            RuntimeException runtimeException = new RuntimeException("Camera " + this.c + " error: (" + error + ") " + str);
            if (this.a.b()) {
                ha.m<CameraDevice> mVar = this.a;
                o.a aVar = o.e;
                mVar.resumeWith(o.b(p.a(runtimeException)));
            }
        }

        @Override
        public void onOpened(@NotNull CameraDevice device) {
            Intrinsics.checkNotNullParameter(device, "device");
            this.a.resumeWith(o.b(device));
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {327}, m = "requestImageCapture-IoAF18A")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class h extends kotlin.coroutines.jvm.internal.d {
        Object d;
        int i;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.i |= Integer.MIN_VALUE;
            Object objQ = C0638d.this.Q(this);
            return objQ == b.c() ? objQ : o.a(objQ);
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", f = "Camera2Manager.kt", l = {337}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "LP9/o;", "Ljava/io/File;", "<anonymous>", "(Lha/L;)LP9/o;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0641i extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super o<? extends File>>, Object> {
        int d;

        @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2$imageResult$1", f = "Camera2Manager.kt", l = {338}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "LP9/o;", "Ljava/io/File;", "<anonymous>", "(Lha/L;)LP9/o;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0251a extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super o<? extends File>>, Object> {
            int d;
            final C0638d e;

            @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2$imageResult$1$1", f = "Camera2Manager.kt", l = {341}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lha/L;", "LP9/o;", "Ljava/io/File;", "<anonymous>", "(Lha/L;)LP9/o;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0252a extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super o<? extends File>>, Object> {
                int d;
                final C0638d e;

                C0252a(C0638d c0638d, Continuation<? super C0252a> continuation) {
                    super(2, continuation);
                    this.e = c0638d;
                }

                @NotNull
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    return new C0252a(this.e, continuation);
                }

                public final Object invoke(@NotNull ha.L l, Continuation<? super o<? extends File>> continuation) {
                    return create(l, continuation).invokeSuspend(Unit.a);
                }

                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objC = b.c();
                    int i = this.d;
                    if (i == 0) {
                        p.b(obj);
                        ka.g gVarR = i.r(this.e.imageCaptureResult);
                        this.d = 1;
                        obj = i.s(gVarR, this);
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

            C0251a(C0638d c0638d, Continuation<? super C0251a> continuation) {
                super(2, continuation);
                this.e = c0638d;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0251a(this.e, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super o<? extends File>> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    CoroutineContext coroutineContextH0 = this.e.coroutineScope.H0();
                    C0252a c0252a = new C0252a(this.e, null);
                    this.d = 1;
                    obj = ha.g.g(coroutineContextH0, c0252a, this);
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

        C0641i(Continuation<? super C0641i> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0638d.this.new C0641i(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super o<? extends File>> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            Object objC = b.c();
            int i = this.d;
            if (i == 0) {
                p.b(obj);
                if (C0638d.this.isImageCaptureRequested) {
                    o.a aVar = o.e;
                    return o.a(o.b(p.a(new RuntimeException("Image capture already requested."))));
                }
                C0638d.this.imageCaptureResult.setValue((Object) null);
                C0638d.this.isImageCaptureRequested = true;
                H hB = c0.b();
                C0251a c0251a = new C0251a(C0638d.this, null);
                this.d = 1;
                obj = ha.g.g(hB, c0251a, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            Object objJ = ((o) obj).j();
            C0638d.this.isImageCaptureRequested = false;
            return o.a(objJ);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"n8/d$j", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceCreated", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class j implements SurfaceHolder.Callback {

        @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1$surfaceCreated$1$1", f = "Camera2Manager.kt", l = {208}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class L extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
            int d;
            final C0638d e;

            L(C0638d c0638d, Continuation<? super L> continuation) {
                super(2, continuation);
                this.e = c0638d;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new L(this.e, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    C0638d c0638d = this.e;
                    this.d = 1;
                    if (C0638d.U(c0638d, this) == objC) {
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

        @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1$surfaceDestroyed$1", f = "Camera2Manager.kt", l = {186}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class C0642b extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
            int d;
            final C0638d e;

            C0642b(C0638d c0638d, Continuation<? super C0642b> continuation) {
                super(2, continuation);
                this.e = c0638d;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C0642b(this.e, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    C0638d c0638d = this.e;
                    this.d = 1;
                    if (c0638d.F(this) == objC) {
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

        j() {
        }

        public static final void b(C0638d c0638d) {
            Intrinsics.checkNotNullParameter(c0638d, "this$0");
            ha.g.d(c0638d.coroutineScope, (CoroutineContext) null, (N) null, new L(c0638d, null), 3, (Object) null);
        }

        @Override
        public void surfaceChanged(@NotNull SurfaceHolder holder, int format, int width, int height) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        @Override
        public void surfaceCreated(@NotNull SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            C0638d.this.isPreviewSurfaceAvailable = true;
            C0638d.this.getPreviewView().b(C0638d.this.cameraChoice.getSize().getWidth(), C0638d.this.cameraChoice.getSize().getHeight(), C0638d.this.orientation);
            Camera2PreviewView previewView = C0638d.this.getPreviewView();
            final C0638d c0638d = C0638d.this;
            previewView.post(new Runnable() {
                @Override
                public final void run() {
                    C0638d.j.b(c0638d);
                }
            });
        }

        @Override
        public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            C0638d.this.isPreviewSurfaceAvailable = false;
            ha.g.d(C0638d.this.coroutineScope, (CoroutineContext) null, (N) null, new C0642b(C0638d.this, null), 3, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class k extends l implements Function0<Unit> {

        @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$1", f = "Camera2Manager.kt", l = {217}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class L extends kotlin.coroutines.jvm.internal.k implements Function2<ha.L, Continuation<? super Unit>, Object> {
            int d;
            final C0638d e;

            L(C0638d c0638d, Continuation<? super L> continuation) {
                super(2, continuation);
                this.e = c0638d;
            }

            @NotNull
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new L(this.e, continuation);
            }

            public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
                return create(l, continuation).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(@NotNull Object obj) {
                Object objC = b.c();
                int i = this.d;
                if (i == 0) {
                    p.b(obj);
                    C0638d c0638d = this.e;
                    this.d = 1;
                    if (C0638d.U(c0638d, this) == objC) {
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

        k() {
            super(0);
        }

        public Object invoke() {
            m615invoke();
            return Unit.a;
        }

        public final void m615invoke() {
            if (C0638d.this.isPreviewSurfaceAvailable) {
                ha.g.d(C0638d.this.coroutineScope, (CoroutineContext) null, (N) null, new L(C0638d.this, null), 3, (Object) null);
            }
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {172}, m = "start$initializeCameraAndSetState")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class C0643l extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        int i;

        C0643l(Continuation<? super C0643l> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.i |= Integer.MIN_VALUE;
            return C0638d.U(null, this);
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {301}, m = "startVideo")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class m extends kotlin.coroutines.jvm.internal.d {
        Object d;
        Object e;
        int v;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.v |= Integer.MIN_VALUE;
            return C0638d.this.V(this);
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", l = {318}, m = "stopVideo-IoAF18A")
    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class n extends kotlin.coroutines.jvm.internal.d {
        Object d;
        int i;

        n(Continuation<? super n> continuation) {
            super(continuation);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.i |= Integer.MIN_VALUE;
            Object objW = C0638d.this.W(this);
            return objW == b.c() ? objW : o.a(objW);
        }
    }

    public C0638d(@NotNull Context context, @NotNull CameraChoice cameraChoice, @NotNull Camera2PreviewView camera2PreviewView, @NotNull InterfaceC0636b interfaceC0636b, @NotNull EnumC0732a enumC0732a, a aVar, boolean z, @NotNull InterfaceC0723a interfaceC0723a) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        Intrinsics.checkNotNullParameter(camera2PreviewView, "previewView");
        Intrinsics.checkNotNullParameter(interfaceC0636b, "analyzer");
        Intrinsics.checkNotNullParameter(enumC0732a, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(interfaceC0723a, "cameraStatsManager");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.previewView = camera2PreviewView;
        this.analyzer = interfaceC0636b;
        this.videoCaptureMethod = enumC0732a;
        this.webRtcManager = aVar;
        this.isAudioRequired = z;
        this.cameraStatsManager = interfaceC0723a;
        this.cameraProperties = cameraChoice.getCameraProperties();
        ha.L lA = M.a(c0.a().K(V0.b((z0) null, 1, (Object) null)));
        this.coroutineScope = lA;
        String id = cameraChoice.getId();
        this.cameraId = id;
        Object systemService = context.getSystemService("camera");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        this.cameraManager = cameraManager;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(id);
        Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
        this.characteristics = cameraCharacteristics;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = ((Number) obj).intValue();
        this.orientation = iIntValue;
        Object upper = cameraChoice.f().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new C0657r(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z);
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = ka.M.a((Object) null);
        y<InterfaceC0249d> yVarA = ka.M.a(InterfaceC0249d.a.a);
        this._state = yVarA;
        this.state = yVarA;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = M();
        this.imageProcessingFlow = D.b(0, 1, ja.a.d, 1, (Object) null);
        this.processImageHaltedCv = new ConditionVariable();
        ha.g.d(lA, (CoroutineContext) null, (N) null, new L(null), 3, (Object) null);
    }

    public final Object F(Continuation<? super Unit> continuation) {
        Object objG = ha.g.g(c0.a(), new C0639e(null), continuation);
        return objG == b.c() ? objG : Unit.a;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final Object L(Continuation<? super Unit> continuation) {
        Object objG = ha.g.g(c0.c(), new C0640f(null), continuation);
        return objG == b.c() ? objG : Unit.a;
    }

    public final ImageReader M() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() {
            @Override
            public final void onImageAvailable(ImageReader imageReader) {
                C0638d.N(this.a, imageReader);
            }
        }, this.cameraHandler);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "also(...)");
        return imageReaderNewInstance;
    }

    public static final void N(C0638d c0638d, ImageReader imageReader) {
        a aVar;
        Intrinsics.checkNotNullParameter(c0638d, "this$0");
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        int rotation = c0638d.cameraChoice.getRotation();
        if (c0638d.videoCaptureMethod == EnumC0732a.d && (aVar = c0638d.webRtcManager) != null) {
            aVar.i(imageAcquireNextImage, rotation);
        }
        if (imageAcquireNextImage == null || c0638d.imageProcessingFlow.f(imageAcquireNextImage)) {
            return;
        }
        imageAcquireNextImage.close();
    }

    @SuppressLint({"MissingPermission"})
    public final Object O(CameraManager cameraManager, String str, Handler handler, Continuation<? super CameraDevice> continuation) throws CameraAccessException {
        ha.n nVar = new ha.n(b.b(continuation), 1);
        nVar.C();
        cameraManager.openCamera(str, new g(nVar, this, str), handler);
        Object objZ = nVar.z();
        if (objZ == b.c()) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return objZ;
    }

    public final void P(Image image) {
        try {
            if (Intrinsics.b(this._state.getValue(), InterfaceC0249d.b.a)) {
                this.processImageHaltedCv.open();
                Y9.a.a(image, (Throwable) null);
                return;
            }
            if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                Y9.a.a(image, (Throwable) null);
                return;
            }
            if (this.isImageCaptureRequested) {
                File fileR = R(image);
                if (fileR != null) {
                    this.imageCaptureResult.setValue(o.a(o.b(fileR)));
                }
            } else if (this.isAnalyzerEnabled) {
                try {
                    this.analyzer.g(image, this.orientation);
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.a;
            Y9.a.a(image, (Throwable) null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Y9.a.a(image, th);
                throw th2;
            }
        }
    }

    private final File R(Image image) {
        Bitmap bitmapC = z.c(image, this.orientation);
        if (bitmapC == null) {
            return null;
        }
        File file = new File(this.context.getCacheDir(), "persona_camera_" + System.currentTimeMillis() + ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmapC.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            X9.c.a(fileOutputStream, (Throwable) null);
            bitmapC.recycle();
            return file;
        } finally {
        }
    }

    public static final java.lang.Object U(ha.C0638d r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0638d.U(n8.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void G(boolean enable) throws CameraAccessException {
        C0650k c0650k = this.session;
        if (c0650k != null) {
            c0650k.i(enable);
            c0650k.l();
        }
    }

    public final void H() throws CameraAccessException {
        C0650k c0650k = this.session;
        if (c0650k != null) {
            c0650k.j(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (this.cameraChoice.getSize().getWidth() * 0.15d), (int) (this.cameraChoice.getSize().getHeight() * 0.15d)), 5000L);
            c0650k.l();
        }
    }

    @NotNull
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    @NotNull
    public final Camera2PreviewView getPreviewView() {
        return this.previewView;
    }

    @NotNull
    public final K<InterfaceC0249d> K() {
        return this.state;
    }

    public final java.lang.Object Q(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends java.io.File>> r6) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0638d.Q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void S(boolean analyzerEnabled) {
        this.isAnalyzerEnabled = analyzerEnabled;
    }

    public final void T() {
        boolean z = this.isAudioRequired && androidx.core.content.a.a(this.context, "android.permission.RECORD_AUDIO") != 0;
        if (androidx.core.content.a.a(this.context, "android.permission.CAMERA") != 0 || z) {
            this._state.setValue(new InterfaceC0249d.Error(new c.b()));
            return;
        }
        if (this.isPreviewStarted) {
            return;
        }
        this.isPreviewStarted = true;
        this.isPreviewSurfaceAvailable = false;
        this.surfaceHolderCallback = new j();
        this.mediaRecorderWrapper.n(new k());
        this.previewView.a();
        this.previewView.getHolder().addCallback(this.surfaceHolderCallback);
        this.cameraStatsManager.d();
    }

    public final java.lang.Object V(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0638d.V(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object W(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super P9.o<? extends java.io.File>> r5) {
        throw new UnsupportedOperationException("Method not decompiled: ha.C0638d.W(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
