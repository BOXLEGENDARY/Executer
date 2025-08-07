package K1;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LK1/g;", "Landroid/view/View;", "T", "LK1/l;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/view/View;", "()Landroid/view/View;", "b", "Z", "g", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g<T extends View> implements l<T> {

    @NotNull
    private final T view;

    private final boolean subtractPadding;

    public g(@NotNull T t, boolean z) {
        this.view = t;
        this.subtractPadding = z;
    }

    @Override
    @NotNull
    public T a() {
        return this.view;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof g) {
            g gVar = (g) other;
            if (Intrinsics.b(a(), gVar.a()) && getSubtractPadding() == gVar.getSubtractPadding()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + Boolean.hashCode(getSubtractPadding());
    }
}
