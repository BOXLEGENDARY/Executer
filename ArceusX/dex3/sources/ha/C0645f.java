package ha;

import android.content.Context;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o8.InterfaceC0723a;
import org.jetbrains.annotations.NotNull;
import p8.EnumC0732a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ln8/f;", "", "Landroid/content/Context;", "context", "Lo8/a;", "cameraStatsManager", "Ln8/m;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Ln8/b;", "analyzer", "Lp8/a;", "videoCaptureMethod", "LA9/a;", "webRtcManager", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lo8/a;Ln8/m;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Ln8/b;Lp8/a;LA9/a;Z)V", "b", "()Z", "Ln8/d;", "a", "()Ln8/d;", "Landroid/content/Context;", "Lo8/a;", "c", "Ln8/m;", "d", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "e", "Ln8/b;", "f", "Lp8/a;", "g", "LA9/a;", "h", "Z", "", "i", "I", "choiceIndex", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0645f {

    @NotNull
    private final Context context;

    @NotNull
    private final InterfaceC0723a cameraStatsManager;

    @NotNull
    private final CameraChoices cameraChoices;

    @NotNull
    private final Camera2PreviewView previewView;

    @NotNull
    private final InterfaceC0636b analyzer;

    @NotNull
    private final EnumC0732a videoCaptureMethod;

    private final A9.a webRtcManager;

    private final boolean isAudioRequired;

    private int choiceIndex;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ln8/f$a;", "", "Ln8/m;", "cameraChoices", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Ln8/b;", "analyzer", "Lp8/a;", "videoCaptureMethod", "LA9/a;", "webRtcManager", "", "isAudioRequired", "Ln8/f;", "a", "(Ln8/m;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Ln8/b;Lp8/a;LA9/a;Z)Ln8/f;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public interface a {
        @NotNull
        C0645f a(@NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView previewView, @NotNull InterfaceC0636b analyzer, @NotNull EnumC0732a videoCaptureMethod, A9.a webRtcManager, boolean isAudioRequired);
    }

    public C0645f(@NotNull Context context, @NotNull InterfaceC0723a interfaceC0723a, @NotNull CameraChoices cameraChoices, @NotNull Camera2PreviewView camera2PreviewView, @NotNull InterfaceC0636b interfaceC0636b, @NotNull EnumC0732a enumC0732a, A9.a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interfaceC0723a, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(cameraChoices, "cameraChoices");
        Intrinsics.checkNotNullParameter(camera2PreviewView, "previewView");
        Intrinsics.checkNotNullParameter(interfaceC0636b, "analyzer");
        Intrinsics.checkNotNullParameter(enumC0732a, "videoCaptureMethod");
        this.context = context;
        this.cameraStatsManager = interfaceC0723a;
        this.cameraChoices = cameraChoices;
        this.previewView = camera2PreviewView;
        this.analyzer = interfaceC0636b;
        this.videoCaptureMethod = enumC0732a;
        this.webRtcManager = aVar;
        this.isAudioRequired = z;
    }

    @NotNull
    public final C0638d a() {
        return new C0638d(this.context, this.cameraChoices.a().get(this.choiceIndex), this.previewView, this.analyzer, this.videoCaptureMethod, this.webRtcManager, this.isAudioRequired, this.cameraStatsManager);
    }

    public final boolean b() {
        if (this.choiceIndex + 1 >= this.cameraChoices.a().size()) {
            return false;
        }
        this.choiceIndex++;
        return true;
    }
}
