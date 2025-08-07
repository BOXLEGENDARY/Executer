package ha;

import P9.p;
import S9.b;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.Surface;
import com.roblox.client.personasdk.R;
import ha.C0456d;
import ha.c0;
import ha.g;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u5.AudioConfiguration;
import u5.C0617d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0011\u0010:\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b3\u00109¨\u0006;"}, d2 = {"Ln8/r;", "", "Landroid/content/Context;", "context", "Ln8/l;", "cameraChoice", "", "fps", "orientationHint", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Ln8/l;IIZ)V", "isInitialPrepare", "", "m", "(Z)V", "k", "Ljava/io/File;", "i", "()Ljava/io/File;", "Landroid/media/MediaRecorder;", "j", "()Landroid/media/MediaRecorder;", "g", "()I", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "f", "()V", "l", "a", "Landroid/content/Context;", "b", "Ln8/l;", "c", "I", "d", "e", "Z", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnSurfaceChanged", "()Lkotlin/jvm/functions/Function0;", "n", "(Lkotlin/jvm/functions/Function0;)V", "onSurfaceChanged", "Landroid/view/Surface;", "Landroid/view/Surface;", "_surface", "h", "Ljava/io/File;", "currentFile", "Landroid/media/MediaRecorder;", "mediaRecorder", "isPrepared", "()Landroid/view/Surface;", "surface", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0657r {
    private static final boolean l = true;

    @NotNull
    private final Context context;

    @NotNull
    private final CameraChoice cameraChoice;

    private final int fps;

    private final int orientationHint;

    private final boolean isAudioRequired;

    private Function0<Unit> onSurfaceChanged;

    private final Surface _surface;

    @NotNull
    private File currentFile;

    @NotNull
    private MediaRecorder mediaRecorder;

    private boolean isPrepared;

    @f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$startRecording$2", f = "MediaRecorderWrapper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class L extends k implements Function2<ha.L, Continuation<? super Unit>, Object> {
        int d;

        L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0657r.this.new L(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws IllegalStateException {
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            C0657r.this.mediaRecorder.start();
            return Unit.a;
        }
    }

    @f(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2", f = "MediaRecorderWrapper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "Ljava/io/File;", "<anonymous>", "(Lha/L;)Ljava/io/File;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class C0658c extends k implements Function2<ha.L, Continuation<? super File>, Object> {
        int d;

        C0658c(Continuation<? super C0658c> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return C0657r.this.new C0658c(continuation);
        }

        public final Object invoke(@NotNull ha.L l, Continuation<? super File> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            File file;
            b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            try {
                C0657r.this.mediaRecorder.stop();
                file = C0657r.this.currentFile;
            } catch (RuntimeException unused) {
                C0657r.this.currentFile.delete();
                file = null;
            }
            C0657r.this.mediaRecorder.release();
            C0657r c0657r = C0657r.this;
            c0657r.mediaRecorder = c0657r.j();
            C0657r.this.k(false);
            return file;
        }
    }

    public C0657r(@NotNull Context context, @NotNull CameraChoice cameraChoice, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.fps = i;
        this.orientationHint = i2;
        this.isAudioRequired = z;
        this._surface = l ? MediaCodec.createPersistentInputSurface() : null;
        this.currentFile = i();
        this.mediaRecorder = j();
    }

    private final int g() {
        int width = this.cameraChoice.getSize().getWidth() * this.cameraChoice.getSize().getHeight();
        if (width <= 172800) {
            return 400000;
        }
        if (width <= 409920) {
            return 500000;
        }
        if (width <= 921600) {
            return 1500000;
        }
        if (width <= 2073600) {
            return 3000000;
        }
        return width <= 3686400 ? 6000000 : 10000000;
    }

    private final File i() {
        return new File(this.context.getCacheDir(), "video_recording_" + System.currentTimeMillis() + ".mp4");
    }

    public final MediaRecorder j() {
        if (Build.VERSION.SDK_INT < 31) {
            return new MediaRecorder();
        }
        C0656q.a();
        return C0655p.a(this.context);
    }

    public final void k(boolean isInitialPrepare) throws Throwable {
        if (!isInitialPrepare) {
            this.currentFile = i();
        }
        m(isInitialPrepare);
    }

    private final void m(boolean isInitialPrepare) throws Throwable {
        Function0<Unit> function0;
        boolean z = C0456d.f(this.context) && this.isAudioRequired;
        this.mediaRecorder.setVideoSource(2);
        if (z) {
            this.mediaRecorder.setAudioSource(1);
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setVideoFrameRate(this.fps);
        this.mediaRecorder.setVideoSize(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight());
        this.mediaRecorder.setVideoEncoder(2);
        this.mediaRecorder.setVideoEncodingBitRate(g());
        if (z) {
            AudioConfiguration audioConfigurationA = C0617d.a();
            if (audioConfigurationA != null) {
                this.mediaRecorder.setAudioSamplingRate(audioConfigurationA.getSampleRateInHz());
                this.mediaRecorder.setAudioChannels(1);
            }
            this.mediaRecorder.setAudioEncoder(3);
        }
        this.mediaRecorder.setOrientationHint(this.orientationHint);
        boolean z2 = l;
        if (z2) {
            this.mediaRecorder.setInputSurface(h());
        }
        this.mediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
        this.mediaRecorder.prepare();
        if (z2 || isInitialPrepare || (function0 = this.onSurfaceChanged) == null) {
            return;
        }
        function0.invoke();
    }

    public final void f() {
        try {
            h().release();
        } catch (RuntimeException unused) {
        }
        try {
            this.mediaRecorder.stop();
        } catch (RuntimeException unused2) {
        } catch (Throwable th) {
            this.currentFile.delete();
            throw th;
        }
        this.currentFile.delete();
    }

    @NotNull
    public final Surface h() {
        Surface surface = this._surface;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.mediaRecorder.getSurface();
        Intrinsics.checkNotNullExpressionValue(surface2, "getSurface(...)");
        return surface2;
    }

    public final void l() throws Throwable {
        if (this.isPrepared) {
            return;
        }
        this.isPrepared = true;
        k(true);
    }

    public final void n(Function0<Unit> function0) {
        this.onSurfaceChanged = function0;
    }

    public final Object o(@NotNull Continuation<? super Unit> continuation) {
        Object objG = g.g(c0.a(), new L(null), continuation);
        return objG == b.c() ? objG : Unit.a;
    }

    public final Object p(@NotNull Continuation<? super File> continuation) {
        return g.g(c0.a(), new C0658c(null), continuation);
    }
}
