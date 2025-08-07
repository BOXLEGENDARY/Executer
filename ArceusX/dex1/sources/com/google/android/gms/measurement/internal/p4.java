package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.Z5;
import g0.C2457a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class p4 {

    private String f16964a;

    private boolean f16965b;

    private com.google.android.gms.internal.measurement.X1 f16966c;

    private BitSet f16967d;

    private BitSet f16968e;

    private Map<Integer, Long> f16969f;

    private Map<Integer, List<Long>> f16970g;

    final u4 f16971h;

    p4(u4 u4Var, String str, W3.x xVar) {
        this.f16971h = u4Var;
        this.f16964a = str;
        this.f16965b = true;
        this.f16967d = new BitSet();
        this.f16968e = new BitSet();
        this.f16969f = new C2457a();
        this.f16970g = new C2457a();
    }

    final com.google.android.gms.internal.measurement.D1 a(int i7) {
        ArrayList arrayList;
        List listEmptyList;
        com.google.android.gms.internal.measurement.C1 c1X = com.google.android.gms.internal.measurement.D1.x();
        c1X.s(i7);
        c1X.v(this.f16965b);
        com.google.android.gms.internal.measurement.X1 x1 = this.f16966c;
        if (x1 != null) {
            c1X.w(x1);
        }
        com.google.android.gms.internal.measurement.W1 w1C = com.google.android.gms.internal.measurement.X1.C();
        w1C.t(e4.J(this.f16967d));
        w1C.w(e4.J(this.f16968e));
        Map<Integer, Long> map = this.f16969f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f16969f.keySet()) {
                int iIntValue = num.intValue();
                Long l7 = this.f16969f.get(num);
                if (l7 != null) {
                    com.google.android.gms.internal.measurement.E1 e1Y = com.google.android.gms.internal.measurement.F1.y();
                    e1Y.t(iIntValue);
                    e1Y.s(l7.longValue());
                    arrayList2.add(e1Y.l());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            w1C.s(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f16970g;
        if (map2 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f16970g.keySet()) {
                com.google.android.gms.internal.measurement.Y1 y1Z = com.google.android.gms.internal.measurement.Z1.z();
                y1Z.t(num2.intValue());
                List<Long> list = this.f16970g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    y1Z.s(list);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.Z1) y1Z.l());
            }
            listEmptyList = arrayList3;
        }
        w1C.v(listEmptyList);
        c1X.t(w1C);
        return c1X.l();
    }

    final void c(s4 s4Var) {
        int iA = s4Var.a();
        Boolean bool = s4Var.f17017c;
        if (bool != null) {
            this.f16968e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = s4Var.f17018d;
        if (bool2 != null) {
            this.f16967d.set(iA, bool2.booleanValue());
        }
        if (s4Var.f17019e != null) {
            Map<Integer, Long> map = this.f16969f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l7 = map.get(numValueOf);
            long jLongValue = s4Var.f17019e.longValue() / 1000;
            if (l7 == null || jLongValue > l7.longValue()) {
                this.f16969f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (s4Var.f17020f != null) {
            Map<Integer, List<Long>> map2 = this.f16970g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List<Long> arrayList = map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f16970g.put(numValueOf2, arrayList);
            }
            if (s4Var.c()) {
                arrayList.clear();
            }
            Z5.b();
            C2212f c2212fZ = this.f16971h.f16818a.z();
            String str = this.f16964a;
            X0<Boolean> x02 = Y0.f16607a0;
            if (c2212fZ.B(str, x02) && s4Var.b()) {
                arrayList.clear();
            }
            Z5.b();
            if (!this.f16971h.f16818a.z().B(this.f16964a, x02)) {
                arrayList.add(Long.valueOf(s4Var.f17020f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(s4Var.f17020f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    p4(u4 u4Var, String str, com.google.android.gms.internal.measurement.X1 x1, BitSet bitSet, BitSet bitSet2, Map map, Map map2, W3.x xVar) {
        this.f16971h = u4Var;
        this.f16964a = str;
        this.f16967d = bitSet;
        this.f16968e = bitSet2;
        this.f16969f = map;
        this.f16970g = new C2457a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f16970g.put(num, arrayList);
        }
        this.f16965b = false;
        this.f16966c = x1;
    }
}
