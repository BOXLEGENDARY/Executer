package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p0.e;
import v0.k;

class k {

    private ConcurrentHashMap<Long, e.c> f10594a = new ConcurrentHashMap<>();

    class a implements b<k.b> {
        a() {
        }

        @Override
        public int a(k.b bVar) {
            return bVar.e();
        }

        @Override
        public boolean b(k.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        int a(T t7);

        boolean b(T t7);
    }

    k() {
    }

    private static <T> T e(T[] tArr, int i7, b<T> bVar) {
        return (T) f(tArr, (i7 & 1) == 0 ? 400 : 700, (i7 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i7, boolean z7, b<T> bVar) {
        T t7 = null;
        int i8 = Integer.MAX_VALUE;
        for (T t8 : tArr) {
            int iAbs = (Math.abs(bVar.a(t8) - i7) * 2) + (bVar.b(t8) == z7 ? 0 : 1);
            if (t7 == null || i8 > iAbs) {
                t7 = t8;
                i8 = iAbs;
            }
        }
        return t7;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i7) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i7) {
        throw null;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i7, String str, int i8) {
        File fileD = l.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (l.b(fileD, resources, i7)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    protected k.b g(k.b[] bVarArr, int i7) {
        return (k.b) e(bVarArr, i7, new a());
    }
}
