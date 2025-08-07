package okio;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LB1/i;", "", "", "isFlipped", "", "rotationDegrees", "<init>", "(ZI)V", "a", "Z", "b", "()Z", "I", "()I", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    @NotNull
    public static final i d = new i(false, 0);

    private final boolean isFlipped;

    private final int rotationDegrees;

    public i(boolean z, int i) {
        this.isFlipped = z;
        this.rotationDegrees = i;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public final boolean getIsFlipped() {
        return this.isFlipped;
    }
}
