package u5;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z.T;
import z.i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll8/r;", "", "Lz/i;", "camera", "Lz/T;", "imageCapture", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "<init>", "(Lz/i;Lz/T;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "a", "Lz/i;", "()Lz/i;", "b", "Lz/T;", "c", "()Lz/T;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class r {

    @NotNull
    private final i camera;

    private final T imageCapture;

    @NotNull
    private final CameraProperties cameraProperties;

    public r(@NotNull i iVar, T t, @NotNull CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(iVar, "camera");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        this.camera = iVar;
        this.imageCapture = t;
        this.cameraProperties = cameraProperties;
    }

    @NotNull
    public final i getCamera() {
        return this.camera;
    }

    @NotNull
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    public final T getImageCapture() {
        return this.imageCapture;
    }
}
