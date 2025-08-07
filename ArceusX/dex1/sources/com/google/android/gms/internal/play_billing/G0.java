package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

final class G0 extends AbstractC2075h0 {

    static final AbstractC2075h0 f15803z = new G0(null, new Object[0], 0);

    private final transient Object f15804v;

    final transient Object[] f15805w;

    private final transient int f15806y;

    private G0(Object obj, Object[] objArr, int i7) {
        this.f15804v = obj;
        this.f15805w = objArr;
        this.f15806y = i7;
    }

    static G0 h(int i7, Object[] objArr, C2069g0 c2069g0) {
        short[] sArr;
        char c2;
        char c3;
        Object[] objArr2;
        int i8 = i7;
        Object[] objArrCopyOf = objArr;
        if (i8 == 0) {
            return (G0) f15803z;
        }
        Object obj = null;
        int i9 = 1;
        if (i8 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            L.b(obj2, obj3);
            return new G0(null, objArrCopyOf, 1);
        }
        C2145t.b(i8, objArrCopyOf.length >> 1, "index");
        int iN = AbstractC2099l0.n(i7);
        if (i8 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            L.b(obj4, obj5);
            i8 = 1;
            c2 = 1;
            c3 = 2;
        } else {
            int i10 = iN - 1;
            char c7 = 65535;
            if (iN <= 128) {
                byte[] bArr = new byte[iN];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj6 = objArrCopyOf[i14];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i14 ^ i9];
                    Objects.requireNonNull(obj7);
                    L.b(obj6, obj7);
                    int iA = W.a(obj6.hashCode());
                    while (true) {
                        int i15 = iA & i10;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i13;
                            if (i12 < i11) {
                                objArrCopyOf[i13] = obj6;
                                objArrCopyOf[i13 ^ 1] = obj7;
                            }
                            i12++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i16])) {
                                int i17 = i16 ^ 1;
                                Object obj8 = objArrCopyOf[i17];
                                Objects.requireNonNull(obj8);
                                C2063f0 c2063f0 = new C2063f0(obj6, obj7, obj8);
                                objArrCopyOf[i17] = obj7;
                                obj = c2063f0;
                                break;
                            }
                            iA = i15 + 1;
                        }
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 == i8) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i12), obj};
                    c3 = 2;
                    c2 = 1;
                }
            } else {
                if (iN <= 32768) {
                    sArr = new short[iN];
                    Arrays.fill(sArr, (short) -1);
                    int i18 = 0;
                    for (int i19 = 0; i19 < i8; i19++) {
                        int i20 = i18 + i18;
                        int i21 = i19 + i19;
                        Object obj9 = objArrCopyOf[i21];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i21 ^ 1];
                        Objects.requireNonNull(obj10);
                        L.b(obj9, obj10);
                        int iA2 = W.a(obj9.hashCode());
                        while (true) {
                            int i22 = iA2 & i10;
                            char c8 = (char) sArr[i22];
                            if (c8 == 65535) {
                                sArr[i22] = (short) i20;
                                if (i18 < i19) {
                                    objArrCopyOf[i20] = obj9;
                                    objArrCopyOf[i20 ^ 1] = obj10;
                                }
                                i18++;
                            } else {
                                if (obj9.equals(objArrCopyOf[c8])) {
                                    int i23 = c8 ^ 1;
                                    Object obj11 = objArrCopyOf[i23];
                                    Objects.requireNonNull(obj11);
                                    C2063f0 c2063f02 = new C2063f0(obj9, obj10, obj11);
                                    objArrCopyOf[i23] = obj10;
                                    obj = c2063f02;
                                    break;
                                }
                                iA2 = i22 + 1;
                            }
                        }
                    }
                    if (i18 != i8) {
                        Integer numValueOf = Integer.valueOf(i18);
                        c2 = 1;
                        c3 = 2;
                        objArr2 = new Object[]{sArr, numValueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i24 = 1;
                    sArr = new int[iN];
                    Arrays.fill((int[]) sArr, -1);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i8) {
                        int i27 = i26 + i26;
                        int i28 = i25 + i25;
                        Object obj12 = objArrCopyOf[i28];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i28 ^ i24];
                        Objects.requireNonNull(obj13);
                        L.b(obj12, obj13);
                        int iA3 = W.a(obj12.hashCode());
                        while (true) {
                            int i29 = iA3 & i10;
                            ?? r15 = sArr[i29];
                            if (r15 == c7) {
                                sArr[i29] = i27;
                                if (i26 < i25) {
                                    objArrCopyOf[i27] = obj12;
                                    objArrCopyOf[i27 ^ 1] = obj13;
                                }
                                i26++;
                            } else {
                                if (obj12.equals(objArrCopyOf[r15])) {
                                    int i30 = r15 ^ 1;
                                    Object obj14 = objArrCopyOf[i30];
                                    Objects.requireNonNull(obj14);
                                    C2063f0 c2063f03 = new C2063f0(obj12, obj13, obj14);
                                    objArrCopyOf[i30] = obj13;
                                    obj = c2063f03;
                                    break;
                                }
                                iA3 = i29 + 1;
                                c7 = 65535;
                            }
                        }
                        i25++;
                        i24 = 1;
                        c7 = 65535;
                    }
                    if (i26 != i8) {
                        c2 = 1;
                        c3 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i26), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c2 = 1;
            }
            c3 = 2;
            c2 = 1;
        }
        boolean z7 = obj instanceof Object[];
        Object obj15 = obj;
        if (z7) {
            Object[] objArr3 = (Object[]) obj;
            C2063f0 c2063f04 = (C2063f0) objArr3[c3];
            if (c2069g0 == null) {
                throw c2063f04.a();
            }
            c2069g0.f16056c = c2063f04;
            Object obj16 = objArr3[0];
            int iIntValue = ((Integer) objArr3[c2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i8 = iIntValue;
        }
        return new G0(obj15, objArrCopyOf, i8);
    }

    @Override
    final Z a() {
        return new F0(this.f15805w, 1, this.f15806y);
    }

    @Override
    final AbstractC2099l0 d() {
        return new D0(this, this.f15805w, 0, this.f15806y);
    }

    @Override
    final AbstractC2099l0 f() {
        return new E0(this, new F0(this.f15805w, 0, this.f15806y));
    }

    @Override
    public final java.lang.Object get(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.G0.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.f15806y;
    }
}
