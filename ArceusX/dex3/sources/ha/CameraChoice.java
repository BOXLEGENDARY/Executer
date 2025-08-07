package ha;

import android.util.Range;
import android.util.Size;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.CameraProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b$\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001a\u0010.R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001d\u00102¨\u00064"}, d2 = {"Ln8/l;", "", "", "id", "Landroid/util/Size;", "size", "", "maxFps", "Landroid/util/Range;", "", "targetFpsRange", "rotation", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "Ln8/o;", "additionalOptions", "<init>", "(Ljava/lang/String;Landroid/util/Size;DLandroid/util/Range;ILcom/withpersona/sdk2/camera/CameraProperties$b;Ln8/o;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Landroid/util/Size;", "e", "()Landroid/util/Size;", "D", "getMaxFps", "()D", "d", "Landroid/util/Range;", "f", "()Landroid/util/Range;", "I", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "getFacingMode", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "g", "Ln8/o;", "()Ln8/o;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "h", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CameraChoice {

    @NotNull
    private final String id;

    @NotNull
    private final Size size;

    private final double maxFps;

    @NotNull
    private final Range<Integer> targetFpsRange;

    private final int rotation;

    @NotNull
    private final CameraProperties.b facingMode;

    @NotNull
    private final ExtraCameraOptions additionalOptions;

    @NotNull
    private final CameraProperties cameraProperties;

    public CameraChoice(@NotNull String str, @NotNull Size size, double d, @NotNull Range<Integer> range, int i, @NotNull CameraProperties.b bVar, @NotNull ExtraCameraOptions extraCameraOptions) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(range, "targetFpsRange");
        Intrinsics.checkNotNullParameter(bVar, "facingMode");
        Intrinsics.checkNotNullParameter(extraCameraOptions, "additionalOptions");
        this.id = str;
        this.size = size;
        this.maxFps = d;
        this.targetFpsRange = range;
        this.rotation = i;
        this.facingMode = bVar;
        this.additionalOptions = extraCameraOptions;
        this.cameraProperties = new CameraProperties(str, bVar, size, (int) d);
    }

    @NotNull
    public final ExtraCameraOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    @NotNull
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getRotation() {
        return this.rotation;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChoice)) {
            return false;
        }
        CameraChoice cameraChoice = (CameraChoice) other;
        return Intrinsics.b(this.id, cameraChoice.id) && Intrinsics.b(this.size, cameraChoice.size) && Double.compare(this.maxFps, cameraChoice.maxFps) == 0 && Intrinsics.b(this.targetFpsRange, cameraChoice.targetFpsRange) && this.rotation == cameraChoice.rotation && this.facingMode == cameraChoice.facingMode && Intrinsics.b(this.additionalOptions, cameraChoice.additionalOptions);
    }

    @NotNull
    public final Range<Integer> f() {
        return this.targetFpsRange;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.size.hashCode()) * 31) + Double.hashCode(this.maxFps)) * 31) + this.targetFpsRange.hashCode()) * 31) + Integer.hashCode(this.rotation)) * 31) + this.facingMode.hashCode()) * 31) + this.additionalOptions.hashCode();
    }

    @NotNull
    public String toString() {
        return "CameraChoice(id=" + this.id + ", size=" + this.size + ", maxFps=" + this.maxFps + ", targetFpsRange=" + this.targetFpsRange + ", rotation=" + this.rotation + ", facingMode=" + this.facingMode + ", additionalOptions=" + this.additionalOptions + ")";
    }
}
