package K1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "width", "height", "LK1/i;", "a", "(II)LK1/i;", "", "b", "(LK1/i;)Z", "isOriginal", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    @NotNull
    public static final Size a(int i, int i2) {
        return new Size(a.a(i), a.a(i2));
    }

    public static final boolean b(@NotNull Size size) {
        return Intrinsics.b(size, Size.d);
    }
}
