package K1;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "T", "view", "", "subtractPadding", "LK1/l;", "a", "(Landroid/view/View;Z)LK1/l;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m {
    @NotNull
    public static final <T extends View> l<T> a(@NotNull T t, boolean z) {
        return new g(t, z);
    }

    public static l b(View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return a(view, z);
    }
}
