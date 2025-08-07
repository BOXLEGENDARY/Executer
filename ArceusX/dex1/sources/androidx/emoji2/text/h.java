package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public class h {

    private static final ThreadLocal<J0.a> f10847d = new ThreadLocal<>();

    private final int f10848a;

    private final n f10849b;

    private volatile int f10850c = 0;

    h(n nVar, int i7) {
        this.f10849b = nVar;
        this.f10848a = i7;
    }

    private J0.a g() {
        ThreadLocal<J0.a> threadLocal = f10847d;
        J0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new J0.a();
            threadLocal.set(aVar);
        }
        this.f10849b.d().j(aVar, this.f10848a);
        return aVar;
    }

    public void a(Canvas canvas, float f7, float f8, Paint paint) {
        Typeface typefaceG = this.f10849b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f10849b.c(), this.f10848a * 2, 2, f7, f8, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i7) {
        return g().h(i7);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f10850c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z7) {
        this.f10850c = z7 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i7 = 0; i7 < iC; i7++) {
            sb.append(Integer.toHexString(b(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
