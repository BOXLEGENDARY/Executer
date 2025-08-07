package X;

import C.h1;
import X.C1532c;
import android.media.MediaFormat;
import android.util.Size;

public abstract class i0 implements InterfaceC1540k {

    public static abstract class a {
        a() {
        }

        public abstract i0 a();

        public abstract a b(int i7);

        public abstract a c(int i7);

        public abstract a d(j0 j0Var);

        public abstract a e(int i7);

        public abstract a f(int i7);

        public abstract a g(h1 h1Var);

        public abstract a h(String str);

        public abstract a i(int i7);

        public abstract a j(Size size);
    }

    i0() {
    }

    public static a d() {
        return new C1532c.b().i(-1).f(1).c(2130708361).d(j0.f7856a);
    }

    @Override
    public MediaFormat a() {
        Size sizeK = k();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(c(), sizeK.getWidth(), sizeK.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", f());
        mediaFormatCreateVideoFormat.setInteger("bitrate", e());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", h());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i());
        if (j() != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", j());
        }
        j0 j0VarG = g();
        if (j0VarG.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", j0VarG.c());
        }
        if (j0VarG.d() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", j0VarG.d());
        }
        if (j0VarG.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", j0VarG.b());
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override
    public abstract h1 b();

    @Override
    public abstract String c();

    public abstract int e();

    public abstract int f();

    public abstract j0 g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract Size k();
}
