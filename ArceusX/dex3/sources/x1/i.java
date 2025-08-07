package X1;

import P1.j;
import S1.o;
import S1.q;
import U1.b;
import V1.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i extends X1.b {
    private final StringBuilder B;
    private final RectF C;
    private final Matrix D;
    private final Paint E;
    private final Paint F;
    private final Map<U1.d, List<R1.d>> G;
    private final g0.h<String> H;
    private final o I;
    private final com.airbnb.lottie.a J;
    private final P1.d K;
    private S1.a<Integer, Integer> L;
    private S1.a<Integer, Integer> M;
    private S1.a<Integer, Integer> N;
    private S1.a<Integer, Integer> O;
    private S1.a<Float, Float> P;
    private S1.a<Float, Float> Q;
    private S1.a<Float, Float> R;
    private S1.a<Float, Float> S;
    private S1.a<Float, Float> T;
    private S1.a<Typeface, Typeface> U;

    class a extends Paint {
        a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    static class c {
        static final int[] a;

        static {
            int[] iArr = new int[b.a.values().length];
            a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(com.airbnb.lottie.a aVar, e eVar) {
        V1.b bVar;
        V1.b bVar2;
        V1.a aVar2;
        V1.a aVar3;
        super(aVar, eVar);
        this.B = new StringBuilder(2);
        this.C = new RectF();
        this.D = new Matrix();
        this.E = new a(1);
        this.F = new b(1);
        this.G = new HashMap();
        this.H = new g0.h<>();
        this.J = aVar;
        this.K = eVar.b();
        o oVarA = eVar.s().a();
        this.I = oVarA;
        oVarA.a(this);
        h(oVarA);
        k kVarT = eVar.t();
        if (kVarT != null && (aVar3 = kVarT.a) != null) {
            S1.a<Integer, Integer> aVarA = aVar3.a();
            this.L = aVarA;
            aVarA.a(this);
            h(this.L);
        }
        if (kVarT != null && (aVar2 = kVarT.b) != null) {
            S1.a<Integer, Integer> aVarA2 = aVar2.a();
            this.N = aVarA2;
            aVarA2.a(this);
            h(this.N);
        }
        if (kVarT != null && (bVar2 = kVarT.c) != null) {
            S1.a<Float, Float> aVarA3 = bVar2.a();
            this.P = aVarA3;
            aVarA3.a(this);
            h(this.P);
        }
        if (kVarT == null || (bVar = kVarT.d) == null) {
            return;
        }
        S1.a<Float, Float> aVarA4 = bVar.a();
        this.R = aVarA4;
        aVarA4.a(this);
        h(this.R);
    }

    private void N(b.a aVar, Canvas canvas, float f) {
        int i = c.a[aVar.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private String O(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!b0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.H.c(j)) {
            return (String) this.H.d(j);
        }
        this.B.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.B.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.B.toString();
        this.H.h(j, string);
        return string;
    }

    private void P(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void Q(U1.d dVar, Matrix matrix, float f, U1.b bVar, Canvas canvas) {
        List<R1.d> listX = X(dVar);
        for (int i = 0; i < listX.size(); i++) {
            Path path = listX.get(i).getPath();
            path.computeBounds(this.C, false);
            this.D.set(matrix);
            this.D.preTranslate(0.0f, (-bVar.g) * b2.h.e());
            this.D.preScale(f, f);
            path.transform(this.D);
            if (bVar.k) {
                T(path, this.E, canvas);
                T(path, this.F, canvas);
            } else {
                T(path, this.F, canvas);
                T(path, this.E, canvas);
            }
        }
    }

    private void R(String str, U1.b bVar, Canvas canvas) {
        if (bVar.k) {
            P(str, this.E, canvas);
            P(str, this.F, canvas);
        } else {
            P(str, this.F, canvas);
            P(str, this.E, canvas);
        }
    }

    private void S(String str, U1.b bVar, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strO = O(str, length);
            length += strO.length();
            R(strO, bVar, canvas);
            canvas.translate(this.E.measureText(strO) + f, 0.0f);
        }
    }

    private void T(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void U(String str, U1.b bVar, Matrix matrix, U1.c cVar, Canvas canvas, float f, float f2) {
        float fFloatValue;
        for (int i = 0; i < str.length(); i++) {
            U1.d dVar = (U1.d) this.K.c().d(U1.d.c(str.charAt(i), cVar.a(), cVar.c()));
            if (dVar != null) {
                Q(dVar, matrix, f2, bVar, canvas);
                float fB = ((float) dVar.b()) * f2 * b2.h.e() * f;
                float f3 = bVar.e / 10.0f;
                S1.a<Float, Float> aVar = this.S;
                if (aVar != null) {
                    fFloatValue = aVar.h().floatValue();
                } else {
                    S1.a<Float, Float> aVar2 = this.R;
                    if (aVar2 != null) {
                        fFloatValue = aVar2.h().floatValue();
                    }
                    canvas.translate(fB + (f3 * f), 0.0f);
                }
                f3 += fFloatValue;
                canvas.translate(fB + (f3 * f), 0.0f);
            }
        }
    }

    private void V(U1.b bVar, Matrix matrix, U1.c cVar, Canvas canvas) {
        S1.a<Float, Float> aVar = this.T;
        float fFloatValue = (aVar != null ? aVar.h().floatValue() : bVar.c) / 100.0f;
        float fG = b2.h.g(matrix);
        String str = bVar.a;
        float fE = bVar.f * b2.h.e();
        List<String> listZ = Z(str);
        int size = listZ.size();
        for (int i = 0; i < size; i++) {
            String str2 = listZ.get(i);
            float fY = Y(str2, cVar, fFloatValue, fG);
            canvas.save();
            N(bVar.d, canvas, fY);
            canvas.translate(0.0f, (i * fE) - (((size - 1) * fE) / 2.0f));
            U(str2, bVar, matrix, cVar, canvas, fG, fFloatValue);
            canvas.restore();
        }
    }

    private void W(U1.b r8, U1.c r9, android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: X1.i.W(U1.b, U1.c, android.graphics.Canvas):void");
    }

    private List<R1.d> X(U1.d dVar) {
        if (this.G.containsKey(dVar)) {
            return this.G.get(dVar);
        }
        List<W1.o> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new R1.d(this.J, this, listA.get(i)));
        }
        this.G.put(dVar, arrayList);
        return arrayList;
    }

    private float Y(String str, U1.c cVar, float f, float f2) {
        float fB = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            U1.d dVar = (U1.d) this.K.c().d(U1.d.c(str.charAt(i), cVar.a(), cVar.c()));
            if (dVar != null) {
                fB = (float) (fB + (dVar.b() * f * b2.h.e() * f2));
            }
        }
        return fB;
    }

    private List<String> Z(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface a0(U1.c cVar) {
        Typeface typefaceH;
        S1.a<Typeface, Typeface> aVar = this.U;
        if (aVar != null && (typefaceH = aVar.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceH2 = this.J.H(cVar.a(), cVar.c());
        return typefaceH2 != null ? typefaceH2 : cVar.d();
    }

    private boolean b0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.K.b().width(), this.K.b().height());
    }

    @Override
    public <T> void g(T t, c2.c<T> cVar) {
        super.g(t, cVar);
        if (t == j.a) {
            S1.a<Integer, Integer> aVar = this.M;
            if (aVar != null) {
                F(aVar);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            q qVar = new q(cVar);
            this.M = qVar;
            qVar.a(this);
            h(this.M);
            return;
        }
        if (t == j.b) {
            S1.a<Integer, Integer> aVar2 = this.O;
            if (aVar2 != null) {
                F(aVar2);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.O = qVar2;
            qVar2.a(this);
            h(this.O);
            return;
        }
        if (t == j.s) {
            S1.a<Float, Float> aVar3 = this.Q;
            if (aVar3 != null) {
                F(aVar3);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            q qVar3 = new q(cVar);
            this.Q = qVar3;
            qVar3.a(this);
            h(this.Q);
            return;
        }
        if (t == j.t) {
            S1.a<Float, Float> aVar4 = this.S;
            if (aVar4 != null) {
                F(aVar4);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            q qVar4 = new q(cVar);
            this.S = qVar4;
            qVar4.a(this);
            h(this.S);
            return;
        }
        if (t == j.F) {
            S1.a<Float, Float> aVar5 = this.T;
            if (aVar5 != null) {
                F(aVar5);
            }
            if (cVar == null) {
                this.T = null;
                return;
            }
            q qVar5 = new q(cVar);
            this.T = qVar5;
            qVar5.a(this);
            h(this.T);
            return;
        }
        if (t == j.M) {
            S1.a<Typeface, Typeface> aVar6 = this.U;
            if (aVar6 != null) {
                F(aVar6);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            q qVar6 = new q(cVar);
            this.U = qVar6;
            qVar6.a(this);
            h(this.U);
        }
    }

    @Override
    void s(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.J.p0()) {
            canvas.concat(matrix);
        }
        U1.b bVarH = this.I.h();
        U1.c cVar = this.K.g().get(bVarH.b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        S1.a<Integer, Integer> aVar = this.M;
        if (aVar != null) {
            this.E.setColor(aVar.h().intValue());
        } else {
            S1.a<Integer, Integer> aVar2 = this.L;
            if (aVar2 != null) {
                this.E.setColor(aVar2.h().intValue());
            } else {
                this.E.setColor(bVarH.h);
            }
        }
        S1.a<Integer, Integer> aVar3 = this.O;
        if (aVar3 != null) {
            this.F.setColor(aVar3.h().intValue());
        } else {
            S1.a<Integer, Integer> aVar4 = this.N;
            if (aVar4 != null) {
                this.F.setColor(aVar4.h().intValue());
            } else {
                this.F.setColor(bVarH.i);
            }
        }
        int iIntValue = ((this.v.h() == null ? 100 : this.v.h().h().intValue()) * 255) / 100;
        this.E.setAlpha(iIntValue);
        this.F.setAlpha(iIntValue);
        S1.a<Float, Float> aVar5 = this.Q;
        if (aVar5 != null) {
            this.F.setStrokeWidth(aVar5.h().floatValue());
        } else {
            S1.a<Float, Float> aVar6 = this.P;
            if (aVar6 != null) {
                this.F.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.F.setStrokeWidth(bVarH.j * b2.h.e() * b2.h.g(matrix));
            }
        }
        if (this.J.p0()) {
            V(bVarH, matrix, cVar, canvas);
        } else {
            W(bVarH, cVar, canvas);
        }
        canvas.restore();
    }
}
