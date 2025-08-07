package okio;

import K1.d;
import K1.e;
import K1.l;
import L1.b;
import P9.m;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ha.C0351b;
import ha.C0356g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u0010\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"LJ1/g;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "resId", "default", "c", "(LJ1/g;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "LJ1/b;", "a", "LJ1/b;", "b", "()LJ1/b;", "DEFAULT_REQUEST_OPTIONS", "", "(LJ1/g;)Z", "allowInexactSize", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0410h {

    @NotNull
    private static final C0351b a = new C0351b(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final boolean a(@NotNull C0356g c0356g) throws m {
        int i = a.a[c0356g.getPrecision().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                throw new m();
            }
            if ((c0356g.getDefined().getSizeResolver() != null || !(c0356g.getSizeResolver() instanceof d)) && (!(c0356g.getTarget() instanceof b) || !(c0356g.getSizeResolver() instanceof l) || !(((b) c0356g.getTarget()).getView() instanceof ImageView) || ((b) c0356g.getTarget()).getView() != ((l) c0356g.getSizeResolver()).a())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final C0351b b() {
        return a;
    }

    public static final Drawable c(@NotNull C0356g c0356g, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return C0406d.a(c0356g.getContext(), num.intValue());
    }
}
