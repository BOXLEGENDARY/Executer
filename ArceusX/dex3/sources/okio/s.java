package okio;

import kotlin.Metadata;
import okio.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"LB1/s;", "LB1/o$a;", "", "packageName", "", "resId", "density", "<init>", "(Ljava/lang/String;II)V", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "I", "getResId", "()I", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s extends o.a {

    @NotNull
    private final String packageName;

    private final int resId;

    private final int density;

    public s(@NotNull String str, int i, int i2) {
        this.packageName = str;
        this.resId = i;
        this.density = i2;
    }

    public final int getDensity() {
        return this.density;
    }
}
