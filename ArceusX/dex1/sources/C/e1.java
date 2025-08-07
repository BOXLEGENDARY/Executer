package C;

import android.util.Size;

public abstract class e1 {

    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);


        final int f571d;

        a(int i7) {
            this.f571d = i7;
        }

        int e() {
            return this.f571d;
        }
    }

    public enum b {
        PRIV,
        YUV,
        f574i,
        JPEG_R,
        RAW
    }

    e1() {
    }

    public static e1 a(b bVar, a aVar) {
        return new C0341n(bVar, aVar, 0L);
    }

    public static e1 b(b bVar, a aVar, long j7) {
        return new C0341n(bVar, aVar, j7);
    }

    public static b e(int i7) {
        return i7 == 35 ? b.YUV : i7 == 256 ? b.f574i : i7 == 4101 ? b.JPEG_R : i7 == 32 ? b.RAW : b.PRIV;
    }

    public static e1 h(int i7, int i8, Size size, f1 f1Var) {
        b bVarE = e(i8);
        a aVar = a.NOT_SUPPORT;
        int iC = L.d.c(size);
        if (i7 == 1) {
            if (iC <= L.d.c(f1Var.i(i8))) {
                aVar = a.s720p;
            } else if (iC <= L.d.c(f1Var.g(i8))) {
                aVar = a.s1440p;
            }
        } else if (iC <= L.d.c(f1Var.b())) {
            aVar = a.VGA;
        } else if (iC <= L.d.c(f1Var.e())) {
            aVar = a.PREVIEW;
        } else if (iC <= L.d.c(f1Var.f())) {
            aVar = a.RECORD;
        } else if (iC <= L.d.c(f1Var.c(i8))) {
            aVar = a.MAXIMUM;
        } else {
            Size sizeK = f1Var.k(i8);
            if (sizeK != null && iC <= L.d.c(sizeK)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(bVarE, aVar);
    }

    public abstract a c();

    public abstract b d();

    public abstract long f();

    public final boolean g(e1 e1Var) {
        return e1Var.c().e() <= c().e() && e1Var.d() == d();
    }
}
