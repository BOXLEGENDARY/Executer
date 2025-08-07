package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import p0.e;
import p0.h;
import v0.k;
import z.F;

public class f {

    private static final k f10579a;

    private static final g0.j<String, Typeface> f10580b;

    public static class a extends k.c {

        private h.f f10581a;

        public a(h.f fVar) {
            this.f10581a = fVar;
        }

        @Override
        public void a(int i7) {
            h.f fVar = this.f10581a;
            if (fVar != null) {
                fVar.f(i7);
            }
        }

        @Override
        public void b(Typeface typeface) {
            h.f fVar = this.f10581a;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        h1.a.a("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f10579a = new j();
        } else if (i7 >= 28) {
            f10579a = new i();
        } else {
            f10579a = new h();
        }
        f10580b = new g0.j<>(16);
        h1.a.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i7) {
        if (context != null) {
            return Typeface.create(typeface, i7);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i7) {
        h1.a.a("TypefaceCompat.createFromFontInfo");
        try {
            return f10579a.b(context, cancellationSignal, bVarArr, i7);
        } finally {
            h1.a.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i7) {
        h1.a.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f10579a.c(context, cancellationSignal, list, i7);
        } finally {
            h1.a.b();
        }
    }

    public static Typeface d(Context context, e.b bVar, Resources resources, int i7, String str, int i8, int i9, h.f fVar, Handler handler, boolean z7) {
        Typeface typefaceA;
        if (bVar instanceof e.C0216e) {
            e.C0216e c0216e = (e.C0216e) bVar;
            Typeface typefaceH = h(c0216e.d());
            if (typefaceH != null) {
                if (fVar != null) {
                    fVar.d(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceA = v0.k.c(context, c0216e.a() != null ? F.a(new Object[]{c0216e.c(), c0216e.a()}) : F.a(new Object[]{c0216e.c()}), i9, !z7 ? fVar != null : c0216e.b() != 0, z7 ? c0216e.e() : -1, h.f.e(handler), new a(fVar));
        } else {
            typefaceA = f10579a.a(context, (e.c) bVar, resources, i9);
            if (fVar != null) {
                if (typefaceA != null) {
                    fVar.d(typefaceA, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f10580b.f(f(resources, i7, str, i8, i9), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i7, String str, int i8, int i9) {
        Typeface typefaceD = f10579a.d(context, resources, i7, str, i9);
        if (typefaceD != null) {
            f10580b.f(f(resources, i7, str, i8, i9), typefaceD);
        }
        return typefaceD;
    }

    private static String f(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }

    public static Typeface g(Resources resources, int i7, String str, int i8, int i9) {
        return f10580b.d(f(resources, i7, str, i8, i9));
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
