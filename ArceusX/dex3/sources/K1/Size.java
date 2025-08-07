package K1;

import K1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"LK1/i;", "", "LK1/c;", "width", "height", "<init>", "(LK1/c;LK1/c;)V", "a", "()LK1/c;", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/c;", "d", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Size {

    @NotNull
    public static final Size d;

    @NotNull
    private final c width;

    @NotNull
    private final c height;

    static {
        c.b bVar = c.b.a;
        d = new Size(bVar, bVar);
    }

    public Size(@NotNull c cVar, @NotNull c cVar2) {
        this.width = cVar;
        this.height = cVar2;
    }

    @NotNull
    public final c getWidth() {
        return this.width;
    }

    @NotNull
    public final c getHeight() {
        return this.height;
    }

    @NotNull
    public final c c() {
        return this.height;
    }

    @NotNull
    public final c d() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Size)) {
            return false;
        }
        Size size = (Size) other;
        return Intrinsics.b(this.width, size.width) && Intrinsics.b(this.height, size.height);
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }
}
