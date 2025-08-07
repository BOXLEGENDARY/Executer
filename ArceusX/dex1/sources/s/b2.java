package s;

import C.p1;

public class b2 {

    static class a {

        static final int[] f23301a;

        static {
            int[] iArr = new int[p1.b.values().length];
            f23301a = iArr;
            try {
                iArr[p1.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23301a[p1.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23301a[p1.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23301a[p1.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23301a[p1.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(p1.b bVar, int i7) {
        int i8 = a.f23301a[bVar.ordinal()];
        return i8 != 1 ? i8 != 2 ? 1 : 3 : i7 == 2 ? 5 : 2;
    }

    public static int b(p1.b bVar, int i7) {
        int i8 = a.f23301a[bVar.ordinal()];
        return i8 != 1 ? i8 != 2 ? 1 : 3 : i7 == 2 ? 5 : 1;
    }
}
