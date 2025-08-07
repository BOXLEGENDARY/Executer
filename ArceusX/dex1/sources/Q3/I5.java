package Q3;

import android.os.SystemClock;

public final class I5 {
    public static void a(C1006x5 c1006x5, int i7, int i8, long j7, int i9, int i10, int i11, int i12) {
        c1006x5.c(b(i7, i8, j7, i9, i10, i11, i12), F3.INPUT_IMAGE_CONSTRUCTION);
    }

    private static H5 b(int i7, int i8, long j7, int i9, int i10, int i11, int i12) {
        return new H5(i7, i8, i11, i9, i10, SystemClock.elapsedRealtime() - j7, i12);
    }
}
