package E1;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"LE1/g;", "LE1/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "LB1/e;", "dataSource", "<init>", "(Landroid/graphics/drawable/Drawable;ZLB1/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "Z", "c", "()Z", "LB1/e;", "()LB1/e;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends h {

    @NotNull
    private final Drawable drawable;

    private final boolean isSampled;

    @NotNull
    private final okio.e dataSource;

    public g(@NotNull Drawable drawable, boolean z, @NotNull okio.e eVar) {
        super(null);
        this.drawable = drawable;
        this.isSampled = z;
        this.dataSource = eVar;
    }

    @NotNull
    public final okio.e getDataSource() {
        return this.dataSource;
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof g) {
            g gVar = (g) other;
            if (Intrinsics.b(this.drawable, gVar.drawable) && this.isSampled == gVar.isSampled && this.dataSource == gVar.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.drawable.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode();
    }
}
