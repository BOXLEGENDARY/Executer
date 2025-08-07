package ha;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LJ1/e;", "LJ1/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "LJ1/g;", "request", "", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;LJ1/g;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "LJ1/g;", "()LJ1/g;", "c", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0354e extends AbstractC0357h {

    private final Drawable drawable;

    @NotNull
    private final C0356g request;

    @NotNull
    private final Throwable throwable;

    public C0354e(Drawable drawable, @NotNull C0356g c0356g, @NotNull Throwable th) {
        super(null);
        this.drawable = drawable;
        this.request = c0356g;
        this.throwable = th;
    }

    @Override
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override
    @NotNull
    public C0356g getRequest() {
        return this.request;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C0354e) {
            C0354e c0354e = (C0354e) other;
            if (Intrinsics.b(getDrawable(), c0354e.getDrawable()) && Intrinsics.b(getRequest(), c0354e.getRequest()) && Intrinsics.b(this.throwable, c0354e.throwable)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable = getDrawable();
        return ((((drawable != null ? drawable.hashCode() : 0) * 31) + getRequest().hashCode()) * 31) + this.throwable.hashCode();
    }
}
