package android.view;

import android.window.BackEvent;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0010B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/activity/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "touchX", "touchY", "progress", BuildConfig.FLAVOR, "swipeEdge", "<init>", "(FFFI)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "F", "getTouchX", "()F", "b", "getTouchY", "c", "getProgress", "d", "I", "getSwipeEdge", "()I", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C1588b {

    private final float touchX;

    private final float touchY;

    private final float progress;

    private final int swipeEdge;

    public C1588b(float f7, float f8, float f9, int i7) {
        this.touchX = f7;
        this.touchY = f8;
        this.progress = f9;
        this.swipeEdge = i7;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + '}';
    }

    public C1588b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C1587a c1587a = C1587a.f8449a;
        this(c1587a.c(backEvent), c1587a.d(backEvent), c1587a.a(backEvent), c1587a.b(backEvent));
    }
}
