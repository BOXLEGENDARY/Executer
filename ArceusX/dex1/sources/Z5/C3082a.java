package z5;

import S3.InterfaceC1408o9;
import S3.X;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.C2947b;
import z5.C3082a;

public class C3082a {

    private final List f24858a;

    private final String f24859b;

    public static class c extends d {

        private final float f24866e;

        private final float f24867f;

        c(zzvj zzvjVar, Matrix matrix) {
            super(zzvjVar.p(), zzvjVar.o(), zzvjVar.q(), BuildConfig.FLAVOR, matrix);
            this.f24866e = zzvjVar.n();
            this.f24867f = zzvjVar.l();
        }
    }

    public static class d {

        private final String f24868a;

        private final Rect f24869b;

        private final Point[] f24870c;

        private final String f24871d;

        d(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f24868a = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                C2947b.e(rect2, matrix);
            }
            this.f24869b = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i7 = 0; i7 < list.size(); i7++) {
                pointArr[i7] = new Point((Point) list.get(i7));
            }
            if (matrix != null) {
                C2947b.b(pointArr, matrix);
            }
            this.f24870c = pointArr;
            this.f24871d = str2;
        }

        public String a() {
            return this.f24871d;
        }

        protected final String b() {
            String str = this.f24868a;
            return str == null ? BuildConfig.FLAVOR : str;
        }
    }

    public C3082a(zzvf zzvfVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f24858a = arrayList;
        this.f24859b = zzvfVar.l();
        arrayList.addAll(X.a(zzvfVar.n(), new InterfaceC1408o9() {
            @Override
            public final Object a(Object obj) {
                return new C3082a.e((zzuz) obj, matrix);
            }
        }));
    }

    public String a() {
        return this.f24859b;
    }

    public List<e> b() {
        return Collections.unmodifiableList(this.f24858a);
    }

    public C3082a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f24858a = arrayList;
        arrayList.addAll(list);
        this.f24859b = str;
    }

    public static class b extends d {

        private final List f24863e;

        private final float f24864f;

        private final float f24865g;

        b(zzvd zzvdVar, final Matrix matrix, float f7, float f8) {
            super(zzvdVar.q(), zzvdVar.o(), zzvdVar.r(), zzvdVar.p(), matrix);
            this.f24863e = X.a(zzvdVar.s(), new InterfaceC1408o9() {
                @Override
                public final Object a(Object obj) {
                    return new C3082a.C0242a((zzvb) obj, matrix);
                }
            });
            this.f24864f = f7;
            this.f24865g = f8;
        }

        public String c() {
            return b();
        }

        public b(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f7, float f8) {
            super(str, rect, list, str2, matrix);
            this.f24863e = list2;
            this.f24864f = f7;
            this.f24865g = f8;
        }
    }

    public static class e extends d {

        private final List f24872e;

        e(zzuz zzuzVar, final Matrix matrix) {
            super(zzuzVar.o(), zzuzVar.l(), zzuzVar.p(), zzuzVar.n(), matrix);
            this.f24872e = X.a(zzuzVar.q(), new InterfaceC1408o9() {
                @Override
                public final Object a(Object obj) {
                    zzvd zzvdVar = (zzvd) obj;
                    return new C3082a.b(zzvdVar, matrix, zzvdVar.n(), zzvdVar.l());
                }
            });
        }

        public synchronized List<b> c() {
            return this.f24872e;
        }

        public String d() {
            return b();
        }

        public e(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.f24872e = list2;
        }
    }

    public static class C0242a extends d {

        private final List f24860e;

        private final float f24861f;

        private final float f24862g;

        C0242a(zzvb zzvbVar, final Matrix matrix) {
            super(zzvbVar.q(), zzvbVar.o(), zzvbVar.r(), zzvbVar.p(), matrix);
            this.f24861f = zzvbVar.n();
            this.f24862g = zzvbVar.l();
            List listS = zzvbVar.s();
            this.f24860e = X.a(listS == null ? new ArrayList() : listS, new InterfaceC1408o9() {
                @Override
                public final Object a(Object obj) {
                    return new C3082a.c((zzvj) obj, matrix);
                }
            });
        }

        public C0242a(String str, Rect rect, List list, String str2, Matrix matrix, float f7, float f8, List list2) {
            super(str, rect, list, str2, matrix);
            this.f24861f = f7;
            this.f24862g = f8;
            this.f24860e = list2;
        }
    }
}
