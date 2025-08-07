package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class I2 {

    private static final I2 f15819d = new I2(true);

    final O3 f15820a = new J3();

    private boolean f15821b;

    private boolean f15822c;

    private I2() {
    }

    static int a(EnumC2055d4 enumC2055d4, int i7, Object obj) {
        AbstractC2172x2.B(i7 << 3);
        if (EnumC2055d4.f16008D == null) {
            byte[] bArr = W2.f15951b;
            if (((InterfaceC2155u3) obj) instanceof AbstractC2041b2) {
                throw null;
            }
        }
        EnumC2061e4 enumC2061e4 = EnumC2061e4.INT;
        throw null;
    }

    public static int b(H2 h22, Object obj) {
        EnumC2055d4 enumC2055d4Zzb = h22.zzb();
        int iZza = h22.zza();
        if (!h22.b()) {
            return a(enumC2055d4Zzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!h22.d()) {
            int iA = 0;
            for (int i7 = 0; i7 < size; i7++) {
                iA += a(enumC2055d4Zzb, iZza, list.get(i7));
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return AbstractC2172x2.B(iZza << 3) + AbstractC2172x2.B(0);
        }
        list.get(0);
        EnumC2055d4 enumC2055d4 = EnumC2055d4.f16018e;
        EnumC2061e4 enumC2061e4 = EnumC2061e4.INT;
        throw null;
    }

    public static I2 d() {
        return f15819d;
    }

    private static boolean i(Map.Entry entry) {
        H2 h22 = (H2) entry.getKey();
        if (h22.a() != EnumC2061e4.MESSAGE) {
            return true;
        }
        if (!h22.b()) {
            return j(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!j(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    private static boolean j(Object obj) {
        if (obj instanceof InterfaceC2161v3) {
            return ((InterfaceC2161v3) obj).j();
        }
        if (obj instanceof C2054d3) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int k(Map.Entry entry) {
        int i7;
        int iB;
        int iB2;
        int iH;
        int iB3;
        H2 h22 = (H2) entry.getKey();
        Object value = entry.getValue();
        if (h22.a() != EnumC2061e4.MESSAGE || h22.b() || h22.d()) {
            return b(h22, value);
        }
        if (value instanceof C2054d3) {
            int iZza = ((H2) entry.getKey()).zza();
            int iB4 = AbstractC2172x2.B(8);
            i7 = iB4 + iB4;
            iB = AbstractC2172x2.B(16) + AbstractC2172x2.B(iZza);
            iB2 = AbstractC2172x2.B(24);
            iH = ((C2054d3) value).a();
            iB3 = AbstractC2172x2.B(iH);
        } else {
            int iZza2 = ((H2) entry.getKey()).zza();
            int iB5 = AbstractC2172x2.B(8);
            i7 = iB5 + iB5;
            iB = AbstractC2172x2.B(16) + AbstractC2172x2.B(iZza2);
            iB2 = AbstractC2172x2.B(24);
            iH = ((InterfaceC2155u3) value).h();
            iB3 = AbstractC2172x2.B(iH);
        }
        return i7 + iB + iB2 + iB3 + iH;
    }

    private static final void l(com.google.android.gms.internal.play_billing.H2 r2, java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.I2.l(com.google.android.gms.internal.play_billing.H2, java.lang.Object):void");
    }

    public final int c() {
        int iC = this.f15820a.c();
        int iK = 0;
        for (int i7 = 0; i7 < iC; i7++) {
            iK += k(this.f15820a.h(i7));
        }
        Iterator it = this.f15820a.d().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final Object clone() throws CloneNotSupportedException {
        I2 i22 = new I2();
        int iC = this.f15820a.c();
        for (int i7 = 0; i7 < iC; i7++) {
            Map.Entry entryH = this.f15820a.h(i7);
            i22.g((H2) ((K3) entryH).c(), entryH.getValue());
        }
        for (Map.Entry entry : this.f15820a.d()) {
            i22.g((H2) entry.getKey(), entry.getValue());
        }
        i22.f15822c = this.f15822c;
        return i22;
    }

    public final Iterator e() {
        return this.f15820a.isEmpty() ? Collections.emptyIterator() : this.f15822c ? new C2042b3(this.f15820a.entrySet().iterator()) : this.f15820a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I2) {
            return this.f15820a.equals(((I2) obj).f15820a);
        }
        return false;
    }

    public final void f() {
        if (this.f15821b) {
            return;
        }
        int iC = this.f15820a.c();
        for (int i7 = 0; i7 < iC; i7++) {
            Object value = this.f15820a.h(i7).getValue();
            if (value instanceof R2) {
                ((R2) value).x();
            }
        }
        Iterator it = this.f15820a.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof R2) {
                ((R2) value2).x();
            }
        }
        this.f15820a.a();
        this.f15821b = true;
    }

    public final void g(H2 h22, Object obj) {
        if (!h22.b()) {
            l(h22, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                l(h22, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C2054d3) {
            this.f15822c = true;
        }
        this.f15820a.put(h22, obj);
    }

    public final boolean h() {
        int iC = this.f15820a.c();
        for (int i7 = 0; i7 < iC; i7++) {
            if (!i(this.f15820a.h(i7))) {
                return false;
            }
        }
        Iterator it = this.f15820a.d().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f15820a.hashCode();
    }

    private I2(boolean z7) {
        f();
        f();
    }
}
