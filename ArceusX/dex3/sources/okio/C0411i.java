package okio;

import K1.c;
import K1.h;
import P9.m;
import android.graphics.Bitmap;
import kotlin.Metadata;
import okio.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lokio/g;", "Lokio/h;", "bytes", "", "fromIndex", "toIndex", "a", "(Lokio/g;Lokio/h;JJ)J", "Landroid/graphics/Bitmap$Config;", "d", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap$Config;", "LK1/c;", "LK1/h;", "scale", "", "c", "(LK1/c;LK1/h;)F", "", "b", "(Landroid/graphics/Bitmap$Config;)Z", "isHardware", "coil-svg_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0411i {

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

    public static final long a(@NotNull g gVar, @NotNull h hVar, long j, long j2) {
        if (hVar.E() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        byte bJ = hVar.j(0);
        long jE = j2 - hVar.E();
        long j3 = j;
        while (j3 < jE) {
            long jV = gVar.V(bJ, j3, jE);
            if (jV == -1 || gVar.r0(jV, hVar)) {
                return jV;
            }
            j3 = jV + 1;
        }
        return -1L;
    }

    public static final boolean b(@NotNull Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final float c(@NotNull c cVar, @NotNull h hVar) throws m {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).px;
        }
        int i = a.a[hVar.ordinal()];
        if (i == 1) {
            return Float.MIN_VALUE;
        }
        if (i == 2) {
            return Float.MAX_VALUE;
        }
        throw new m();
    }

    @NotNull
    public static final Bitmap.Config d(Bitmap.Config config) {
        return (config == null || b(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}
