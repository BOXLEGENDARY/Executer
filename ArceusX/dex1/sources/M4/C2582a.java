package m4;

import android.content.Context;
import android.graphics.Color;
import c4.C1746b;
import k4.C2517a;
import r4.C2753b;

public class C2582a {

    private static final int f22051f = (int) Math.round(5.1000000000000005d);

    private final boolean f22052a;

    private final int f22053b;

    private final int f22054c;

    private final int f22055d;

    private final float f22056e;

    public C2582a(Context context) {
        this(C2753b.b(context, C1746b.f12755r, false), C2517a.b(context, C1746b.f12754q, 0), C2517a.b(context, C1746b.f12753p, 0), C2517a.b(context, C1746b.f12751n, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i7) {
        return androidx.core.graphics.a.l(i7, 255) == this.f22055d;
    }

    public float a(float f7) {
        if (this.f22056e <= 0.0f || f7 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f7 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i7, float f7) {
        int i8;
        float fA = a(f7);
        int iAlpha = Color.alpha(i7);
        int iJ = C2517a.j(androidx.core.graphics.a.l(i7, 255), this.f22053b, fA);
        if (fA > 0.0f && (i8 = this.f22054c) != 0) {
            iJ = C2517a.i(iJ, androidx.core.graphics.a.l(i8, f22051f));
        }
        return androidx.core.graphics.a.l(iJ, iAlpha);
    }

    public int c(int i7, float f7) {
        return (this.f22052a && e(i7)) ? b(i7, f7) : i7;
    }

    public boolean d() {
        return this.f22052a;
    }

    public C2582a(boolean z7, int i7, int i8, int i9, float f7) {
        this.f22052a = z7;
        this.f22053b = i7;
        this.f22054c = i8;
        this.f22055d = i9;
        this.f22056e = f7;
    }
}
