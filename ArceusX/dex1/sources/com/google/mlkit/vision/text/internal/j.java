package com.google.mlkit.vision.text.internal;

import S3.AbstractC1442s0;
import S3.InterfaceC1408o9;
import S3.J;
import S3.M;
import S3.M9;
import S3.V9;
import S3.X;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z5.C3082a;

final class j {

    static final M9 f19358a = M9.a("\n");

    private static final Comparator f19359b = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            M9 m9 = j.f19358a;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    static C3082a a(zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.f15713C);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.f15713C, sparseArray2);
            }
            sparseArray2.append(zzlVar.f15714D, zzlVar);
        }
        J j7 = new J();
        int i8 = 0;
        while (i8 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i8);
            J j8 = new J();
            for (int i9 = i7; i9 < sparseArray3.size(); i9++) {
                j8.a((zzl) sparseArray3.valueAt(i9));
            }
            M mB = j8.b();
            List listA = X.a(mB, new InterfaceC1408o9() {
                @Override
                public final Object a(Object obj) {
                    zzl zzlVar2 = (zzl) obj;
                    M9 m9 = j.f19358a;
                    List listB = d.b(zzlVar2.f15716e);
                    String str = V9.b(zzlVar2.f15719w) ? KwdswzaUHE.EgyLcAzvhMXMyH : zzlVar2.f15719w;
                    Rect rectA = d.a(listB);
                    String str2 = V9.b(zzlVar2.f15721z) ? "und" : zzlVar2.f15721z;
                    final Matrix matrix2 = matrix;
                    return new C3082a.b(str, rectA, listB, str2, matrix2, X.a(Arrays.asList(zzlVar2.f15715d), new InterfaceC1408o9() {
                        @Override
                        public final Object a(Object obj2) {
                            zzr zzrVar = (zzr) obj2;
                            M9 m92 = j.f19358a;
                            List listB2 = d.b(zzrVar.f15724e);
                            return new C3082a.C0242a(V9.b(zzrVar.f15726v) ? BuildConfig.FLAVOR : zzrVar.f15726v, d.a(listB2), listB2, V9.b(zzrVar.f15728y) ? "und" : zzrVar.f15728y, matrix2, zzrVar.f15727w, zzrVar.f15724e.f15710w, M.m());
                        }
                    }), zzlVar2.f15720y, zzlVar2.f15716e.f15710w);
                }
            });
            zzf zzfVar = ((zzl) mB.get(i7)).f15716e;
            AbstractC1442s0 abstractC1442s0ListIterator = mB.listIterator(i7);
            int iMax = Integer.MIN_VALUE;
            int iMin = Integer.MAX_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            int iMax2 = Integer.MIN_VALUE;
            while (abstractC1442s0ListIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) abstractC1442s0ListIterator.next()).f15716e;
                int i10 = -zzfVar.f15706d;
                int i11 = -zzfVar.f15707e;
                List list = listA;
                double dSin = Math.sin(Math.toRadians(zzfVar.f15710w));
                AbstractC1442s0 abstractC1442s0 = abstractC1442s0ListIterator;
                double dCos = Math.cos(Math.toRadians(zzfVar.f15710w));
                SparseArray sparseArray4 = sparseArray;
                int i12 = i8;
                J j9 = j7;
                Point point = new Point(zzfVar2.f15706d, zzfVar2.f15707e);
                point.offset(i10, i11);
                Point[] pointArr = {point, new Point(zzfVar2.f15708i + i, i), new Point(zzfVar2.f15708i + i, zzfVar2.f15709v + i), new Point(i, i + zzfVar2.f15709v)};
                Point point2 = pointArr[0];
                int i13 = point2.x;
                int i14 = point2.y;
                int i15 = iMax;
                double d7 = i14 * dSin;
                int i16 = iMin;
                double d8 = (-i13) * dSin;
                double d9 = i14 * dCos;
                int i17 = (int) ((i13 * dCos) + d7);
                point2.x = i17;
                int i18 = (int) (d8 + d9);
                point2.y = i18;
                iMax = i15;
                iMax2 = iMax2;
                iMin = i16;
                iMin2 = iMin2;
                int i19 = 0;
                for (int i20 = 4; i19 < i20; i20 = 4) {
                    Point point3 = pointArr[i19];
                    iMin = Math.min(iMin, point3.x);
                    iMax = Math.max(iMax, point3.x);
                    iMin2 = Math.min(iMin2, point3.y);
                    iMax2 = Math.max(iMax2, point3.y);
                    i19++;
                }
                listA = list;
                abstractC1442s0ListIterator = abstractC1442s0;
                sparseArray = sparseArray4;
                i8 = i12;
                j7 = j9;
            }
            J j10 = j7;
            SparseArray sparseArray5 = sparseArray;
            int i21 = i8;
            int i22 = iMax;
            int i23 = iMax2;
            int i24 = iMin;
            List list2 = listA;
            int i25 = zzfVar.f15706d;
            int i26 = zzfVar.f15707e;
            double dSin2 = Math.sin(Math.toRadians(zzfVar.f15710w));
            double dCos2 = Math.cos(Math.toRadians(zzfVar.f15710w));
            Point[] pointArr2 = {new Point(i24, iMin2), new Point(i22, iMin2), new Point(i22, i23), new Point(i24, i23)};
            int i27 = 0;
            for (int i28 = 4; i27 < i28; i28 = 4) {
                Point point4 = pointArr2[i27];
                int i29 = point4.x;
                int i30 = point4.y;
                point4.x = (int) ((i29 * dCos2) - (i30 * dSin2));
                point4.y = (int) ((i29 * dSin2) + (i30 * dCos2));
                point4.offset(i25, i26);
                i27++;
                dSin2 = dSin2;
            }
            List listAsList = Arrays.asList(pointArr2);
            j10.a(new C3082a.e(f19358a.b(X.a(list2, new InterfaceC1408o9() {
                @Override
                public final Object a(Object obj) {
                    return ((C3082a.b) obj).c();
                }
            })), d.a(listAsList), listAsList, b(list2), matrix, list2));
            i8 = i21 + 1;
            j7 = j10;
            sparseArray = sparseArray5;
            i7 = 0;
        }
        M mB2 = j7.b();
        return new C3082a(f19358a.b(X.a(mB2, new InterfaceC1408o9() {
            @Override
            public final Object a(Object obj) {
                return ((C3082a.e) obj).d();
            }
        })), mB2);
    }

    private static String b(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strA = ((C3082a.b) it.next()).a();
            map.put(strA, Integer.valueOf((map.containsKey(strA) ? ((Integer) map.get(strA)).intValue() : 0) + 1));
        }
        Set setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(setEntrySet, f19359b)).getKey();
        return !V9.b(str) ? str : "und";
    }
}
