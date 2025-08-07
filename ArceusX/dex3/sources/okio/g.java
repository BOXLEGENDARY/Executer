package okio;

import K1.h;
import P9.m;
import kotlin.Metadata;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u00102\b\b\u0001\u0010\u0007\u001a\u00020\u00102\b\b\u0001\u0010\b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LB1/g;", "", "<init>", "()V", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "LK1/h;", "scale", "a", "(IIIILK1/h;)I", "", "c", "(IIIILK1/h;)D", "", "d", "(FFFFLK1/h;)F", "b", "(DDDDLK1/h;)D", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    @NotNull
    public static final g a = new g();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private g() {
    }

    public static final int a(int srcWidth, int srcHeight, int dstWidth, int dstHeight, @NotNull h scale) throws m {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(srcWidth / dstWidth);
        int iHighestOneBit2 = Integer.highestOneBit(srcHeight / dstHeight);
        int i = a.a[scale.ordinal()];
        if (i == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i != 2) {
                throw new m();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return b.c(iMin, 1);
    }

    public static final double b(double srcWidth, double srcHeight, double dstWidth, double dstHeight, @NotNull h scale) throws m {
        double d = dstWidth / srcWidth;
        double d2 = dstHeight / srcHeight;
        int i = a.a[scale.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i == 2) {
            return Math.min(d, d2);
        }
        throw new m();
    }

    public static final double c(int srcWidth, int srcHeight, int dstWidth, int dstHeight, @NotNull h scale) throws m {
        double d = dstWidth / srcWidth;
        double d2 = dstHeight / srcHeight;
        int i = a.a[scale.ordinal()];
        if (i == 1) {
            return Math.max(d, d2);
        }
        if (i == 2) {
            return Math.min(d, d2);
        }
        throw new m();
    }

    public static final float d(float srcWidth, float srcHeight, float dstWidth, float dstHeight, @NotNull h scale) throws m {
        float f = dstWidth / srcWidth;
        float f2 = dstHeight / srcHeight;
        int i = a.a[scale.ordinal()];
        if (i == 1) {
            return Math.max(f, f2);
        }
        if (i == 2) {
            return Math.min(f, f2);
        }
        throw new m();
    }
}
