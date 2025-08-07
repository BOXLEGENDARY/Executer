package ha;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ln8/o;", "", "", "dynamicRange", "", "previewStabilization", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Z", "()Z", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class ExtraCameraOptions {

    private final long dynamicRange;

    private final boolean previewStabilization;

    public ExtraCameraOptions() {
        this(0L, false, 3, null);
    }

    public final long getDynamicRange() {
        return this.dynamicRange;
    }

    public final boolean getPreviewStabilization() {
        return this.previewStabilization;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraCameraOptions)) {
            return false;
        }
        ExtraCameraOptions extraCameraOptions = (ExtraCameraOptions) other;
        return this.dynamicRange == extraCameraOptions.dynamicRange && this.previewStabilization == extraCameraOptions.previewStabilization;
    }

    public int hashCode() {
        return (Long.hashCode(this.dynamicRange) * 31) + Boolean.hashCode(this.previewStabilization);
    }

    @NotNull
    public String toString() {
        return "ExtraCameraOptions(dynamicRange=" + this.dynamicRange + ", previewStabilization=" + this.previewStabilization + ")";
    }

    public ExtraCameraOptions(long j, boolean z) {
        this.dynamicRange = j;
        this.previewStabilization = z;
    }

    public ExtraCameraOptions(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1L : j, (i & 2) != 0 ? false : z);
    }
}
