package ha;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001a"}, d2 = {"Ln8/m;", "", "Ln8/l;", "primaryChoice", "", "backupChoices", "<init>", "(Ln8/l;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln8/l;", "b", "()Ln8/l;", "Ljava/util/List;", "getBackupChoices", "()Ljava/util/List;", "allChoices", "camera_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class CameraChoices {

    @NotNull
    private final CameraChoice primaryChoice;

    @NotNull
    private final List<CameraChoice> backupChoices;

    public CameraChoices(@NotNull CameraChoice cameraChoice, @NotNull List<CameraChoice> list) {
        Intrinsics.checkNotNullParameter(cameraChoice, "primaryChoice");
        Intrinsics.checkNotNullParameter(list, "backupChoices");
        this.primaryChoice = cameraChoice;
        this.backupChoices = list;
    }

    @NotNull
    public final List<CameraChoice> a() {
        return CollectionsKt.e0(CollectionsKt.d(this.primaryChoice), this.backupChoices);
    }

    @NotNull
    public final CameraChoice getPrimaryChoice() {
        return this.primaryChoice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChoices)) {
            return false;
        }
        CameraChoices cameraChoices = (CameraChoices) other;
        return Intrinsics.b(this.primaryChoice, cameraChoices.primaryChoice) && Intrinsics.b(this.backupChoices, cameraChoices.backupChoices);
    }

    public int hashCode() {
        return (this.primaryChoice.hashCode() * 31) + this.backupChoices.hashCode();
    }

    @NotNull
    public String toString() {
        return "CameraChoices(primaryChoice=" + this.primaryChoice + ", backupChoices=" + this.backupChoices + ")";
    }
}
