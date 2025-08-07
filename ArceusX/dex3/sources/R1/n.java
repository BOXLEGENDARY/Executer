package R1;

import S1.a;
import W1.j;
import W1.r;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public class n implements m, a.b, k {
    private final String b;
    private final com.airbnb.lottie.a c;
    private final j.a d;
    private final boolean e;
    private final S1.a<?, Float> f;
    private final S1.a<?, PointF> g;
    private final S1.a<?, Float> h;
    private final S1.a<?, Float> i;
    private final S1.a<?, Float> j;
    private final S1.a<?, Float> k;
    private final S1.a<?, Float> l;
    private boolean n;
    private final Path a = new Path();
    private final b m = new b();

    static class a {
        static final int[] a;

        static {
            int[] iArr = new int[j.a.values().length];
            a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.a aVar, X1.b bVar, W1.j jVar) {
        this.c = aVar;
        this.b = jVar.d();
        j.a aVarJ = jVar.j();
        this.d = aVarJ;
        this.e = jVar.k();
        S1.a<Float, Float> aVarA = jVar.g().a();
        this.f = aVarA;
        S1.a<PointF, PointF> aVarA2 = jVar.h().a();
        this.g = aVarA2;
        S1.a<Float, Float> aVarA3 = jVar.i().a();
        this.h = aVarA3;
        S1.a<Float, Float> aVarA4 = jVar.e().a();
        this.j = aVarA4;
        S1.a<Float, Float> aVarA5 = jVar.f().a();
        this.l = aVarA5;
        j.a aVar2 = j.a.STAR;
        if (aVarJ == aVar2) {
            this.i = jVar.b().a();
            this.k = jVar.c().a();
        } else {
            this.i = null;
            this.k = null;
        }
        bVar.h(aVarA);
        bVar.h(aVarA2);
        bVar.h(aVarA3);
        bVar.h(aVarA4);
        bVar.h(aVarA5);
        if (aVarJ == aVar2) {
            bVar.h(this.i);
            bVar.h(this.k);
        }
        aVarA.a(this);
        aVarA2.a(this);
        aVarA3.a(this);
        aVarA4.a(this);
        aVarA5.a(this);
        if (aVarJ == aVar2) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    private void e() {
        int i;
        double d;
        double d2;
        double d3;
        int iFloor = (int) Math.floor(this.f.h().floatValue());
        double radians = Math.toRadians((this.h == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d4 = iFloor;
        float fFloatValue = this.l.h().floatValue() / 100.0f;
        float fFloatValue2 = this.j.h().floatValue();
        double d5 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d5);
        float fSin = (float) (Math.sin(radians) * d5);
        this.a.moveTo(fCos, fSin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double dCeil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < dCeil) {
            float fCos2 = (float) (Math.cos(d7) * d5);
            double d8 = dCeil;
            float fSin2 = (float) (d5 * Math.sin(d7));
            if (fFloatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                d3 = d6;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.a.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan22)) * f), fSin2 + (f * ((float) Math.sin(dAtan22))), fCos2, fSin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.a.lineTo(fCos2, fSin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF pointFH = this.g.h();
        this.a.offset(pointFH.x, pointFH.y);
        this.a.close();
    }

    private void h() {
        int i;
        float f;
        float f2;
        double d;
        float fSin;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f10;
        double d3;
        float fFloatValue = this.f.h().floatValue();
        double radians = Math.toRadians((this.h == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d4 = fFloatValue;
        float f11 = (float) (6.283185307179586d / d4);
        float f12 = f11 / 2.0f;
        float f13 = fFloatValue - ((int) fFloatValue);
        int i2 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f13) * f12;
        }
        float fFloatValue2 = this.j.h().floatValue();
        float fFloatValue3 = this.i.h().floatValue();
        S1.a<?, Float> aVar = this.k;
        float fFloatValue4 = aVar != null ? aVar.h().floatValue() / 100.0f : 0.0f;
        S1.a<?, Float> aVar2 = this.l;
        float fFloatValue5 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f3 = ((fFloatValue2 - fFloatValue3) * f13) + fFloatValue3;
            i = i2;
            double d5 = f3;
            float fCos = (float) (d5 * Math.cos(radians));
            fSin = (float) (d5 * Math.sin(radians));
            this.a.moveTo(fCos, fSin);
            d = radians + ((f11 * f13) / 2.0f);
            f = fCos;
            f2 = f12;
        } else {
            i = i2;
            double d6 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d6);
            float fSin2 = (float) (d6 * Math.sin(radians));
            this.a.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f12;
            d = radians + f2;
            fSin = fSin2;
            f3 = 0.0f;
        }
        double dCeil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f14 = f2;
        float f15 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 >= dCeil) {
                PointF pointFH = this.g.h();
                this.a.offset(pointFH.x, pointFH.y);
                this.a.close();
                return;
            }
            float f16 = z ? fFloatValue2 : fFloatValue3;
            if (f3 == 0.0f || d7 != dCeil - 2.0d) {
                f4 = f11;
                f5 = f14;
            } else {
                f4 = f11;
                f5 = (f11 * f13) / 2.0f;
            }
            if (f3 == 0.0f || d7 != dCeil - 1.0d) {
                d2 = d7;
                f6 = f3;
                f3 = f16;
            } else {
                d2 = d7;
                f6 = f3;
            }
            double d8 = f3;
            double d10 = dCeil;
            float fCos3 = (float) (d8 * Math.cos(d));
            float fSin3 = (float) (d8 * Math.sin(d));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.a.lineTo(fCos3, fSin3);
                d3 = d;
                f7 = fFloatValue4;
                f10 = fFloatValue5;
            } else {
                f7 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f15) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f10 = fFloatValue5;
                d3 = d;
                double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin5 = (float) Math.sin(dAtan22);
                float f17 = z ? f7 : f10;
                float f18 = z ? f10 : f7;
                float f19 = (z ? fFloatValue3 : fFloatValue2) * f17 * 0.47829f;
                float f20 = fCos4 * f19;
                float f21 = f19 * fSin4;
                float f22 = (z ? fFloatValue2 : fFloatValue3) * f18 * 0.47829f;
                float f23 = fCos5 * f22;
                float f24 = f22 * fSin5;
                if (i != 0) {
                    if (i3 == 0) {
                        f20 *= f13;
                        f21 *= f13;
                    } else if (d2 == d10 - 1.0d) {
                        f23 *= f13;
                        f24 *= f13;
                    }
                }
                this.a.cubicTo(f15 - f20, fSin - f21, fCos3 + f23, fSin3 + f24, fCos3, fSin3);
            }
            d = d3 + f5;
            z = !z;
            i3++;
            f15 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f10;
            fFloatValue4 = f7;
            f3 = f6;
            f11 = f4;
            dCeil = d10;
        }
    }

    private void i() {
        this.n = false;
        this.c.invalidateSelf();
    }

    @Override
    public void a() {
        i();
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.m.a(sVar);
                    sVar.d(this);
                }
            }
        }
    }

    @Override
    public void d(U1.e eVar, int i, List<U1.e> list, U1.e eVar2) {
        b2.g.m(eVar, i, list, eVar2, this);
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        S1.a<?, Float> aVar;
        S1.a<?, Float> aVar2;
        if (t == P1.j.w) {
            this.f.n(cVar);
            return;
        }
        if (t == P1.j.x) {
            this.h.n(cVar);
            return;
        }
        if (t == P1.j.n) {
            this.g.n(cVar);
            return;
        }
        if (t == P1.j.y && (aVar2 = this.i) != null) {
            aVar2.n(cVar);
            return;
        }
        if (t == P1.j.z) {
            this.j.n(cVar);
            return;
        }
        if (t == P1.j.A && (aVar = this.k) != null) {
            aVar.n(cVar);
        } else if (t == P1.j.B) {
            this.l.n(cVar);
        }
    }

    @Override
    public String getName() {
        return this.b;
    }

    @Override
    public Path getPath() {
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.n = true;
            return this.a;
        }
        int i = a.a[this.d.ordinal()];
        if (i == 1) {
            h();
        } else if (i == 2) {
            e();
        }
        this.a.close();
        this.m.b(this.a);
        this.n = true;
        return this.a;
    }
}
