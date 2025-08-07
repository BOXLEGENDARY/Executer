package w5;

import R3.O6;
import R3.P6;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.C2947b;

public class C2972a {

    private final Rect f24275a;

    private int f24276b;

    private final float f24277c;

    private final float f24278d;

    private final float f24279e;

    private final float f24280f;

    private final float f24281g;

    private final float f24282h;

    private final SparseArray f24283i = new SparseArray();

    private final SparseArray f24284j = new SparseArray();

    public C2972a(zzf zzfVar, Matrix matrix) {
        float f7 = zzfVar.f15655i;
        float f8 = zzfVar.f15657w / 2.0f;
        float f9 = zzfVar.f15656v;
        float f10 = zzfVar.f15658y / 2.0f;
        Rect rect = new Rect((int) (f7 - f8), (int) (f9 - f10), (int) (f7 + f8), (int) (f9 + f10));
        this.f24275a = rect;
        if (matrix != null) {
            C2947b.e(rect, matrix);
        }
        this.f24276b = zzfVar.f15654e;
        for (zzn zznVar : zzfVar.f15647C) {
            if (i(zznVar.f15669v)) {
                PointF pointF = new PointF(zznVar.f15667e, zznVar.f15668i);
                if (matrix != null) {
                    C2947b.c(pointF, matrix);
                }
                SparseArray sparseArray = this.f24283i;
                int i7 = zznVar.f15669v;
                sparseArray.put(i7, new C2977f(i7, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.f15651G) {
            int i8 = zzdVar.f15644e;
            if (h(i8)) {
                PointF[] pointFArr = zzdVar.f15643d;
                pointFArr.getClass();
                long length = pointFArr.length + 5 + (r5 / 10);
                ArrayList arrayList = new ArrayList(length > 2147483647L ? Integer.MAX_VALUE : (int) length);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    C2947b.d(arrayList, matrix);
                }
                this.f24284j.put(i8, new C2973b(i8, arrayList));
            }
        }
        this.f24280f = zzfVar.f15646B;
        this.f24281g = zzfVar.f15659z;
        this.f24282h = zzfVar.f15645A;
        this.f24279e = zzfVar.f15650F;
        this.f24278d = zzfVar.f15648D;
        this.f24277c = zzfVar.f15649E;
    }

    private static boolean h(int i7) {
        return i7 <= 15 && i7 > 0;
    }

    private static boolean i(int i7) {
        return i7 == 0 || i7 == 1 || i7 == 7 || i7 == 3 || i7 == 9 || i7 == 4 || i7 == 10 || i7 == 5 || i7 == 11 || i7 == 6;
    }

    public Rect a() {
        return this.f24275a;
    }

    public C2973b b(int i7) {
        return (C2973b) this.f24284j.get(i7);
    }

    public float c() {
        return this.f24281g;
    }

    public C2977f d(int i7) {
        return (C2977f) this.f24283i.get(i7);
    }

    public final SparseArray e() {
        return this.f24284j;
    }

    public final void f(SparseArray sparseArray) {
        this.f24284j.clear();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            this.f24284j.put(sparseArray.keyAt(i7), (C2973b) sparseArray.valueAt(i7));
        }
    }

    public final void g(int i7) {
        this.f24276b = -1;
    }

    public String toString() {
        O6 o6A = P6.a("Face");
        o6A.c("boundingBox", this.f24275a);
        o6A.b("trackingId", this.f24276b);
        o6A.a("rightEyeOpenProbability", this.f24277c);
        o6A.a("leftEyeOpenProbability", this.f24278d);
        o6A.a("smileProbability", this.f24279e);
        o6A.a(JmBUOGMwkkxg.tSLRyh, this.f24280f);
        o6A.a("eulerY", this.f24281g);
        o6A.a("eulerZ", this.f24282h);
        O6 o6A2 = P6.a("Landmarks");
        for (int i7 = 0; i7 <= 11; i7++) {
            if (i(i7)) {
                o6A2.c("landmark_" + i7, d(i7));
            }
        }
        o6A.c("landmarks", o6A2.toString());
        O6 o6A3 = P6.a("Contours");
        for (int i8 = 1; i8 <= 15; i8++) {
            o6A3.c("Contour_" + i8, b(i8));
        }
        o6A.c("contours", o6A3.toString());
        return o6A.toString();
    }

    public C2972a(zzow zzowVar, Matrix matrix) {
        Rect rectT = zzowVar.t();
        this.f24275a = rectT;
        if (matrix != null) {
            C2947b.e(rectT, matrix);
        }
        this.f24276b = zzowVar.s();
        for (zzpc zzpcVar : zzowVar.w()) {
            if (i(zzpcVar.l())) {
                PointF pointFN = zzpcVar.n();
                if (matrix != null) {
                    C2947b.c(pointFN, matrix);
                }
                this.f24283i.put(zzpcVar.l(), new C2977f(zzpcVar.l(), pointFN));
            }
        }
        for (zzos zzosVar : zzowVar.v()) {
            int iL = zzosVar.l();
            if (h(iL)) {
                List listN = zzosVar.n();
                listN.getClass();
                ArrayList arrayList = new ArrayList(listN);
                if (matrix != null) {
                    C2947b.d(arrayList, matrix);
                }
                this.f24284j.put(iL, new C2973b(iL, arrayList));
            }
        }
        this.f24280f = zzowVar.r();
        this.f24281g = zzowVar.n();
        this.f24282h = -zzowVar.p();
        this.f24279e = zzowVar.q();
        this.f24278d = zzowVar.l();
        this.f24277c = zzowVar.o();
    }
}
