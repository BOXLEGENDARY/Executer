package N3;

import java.util.Arrays;
import java.util.Objects;

final class C0546q extends AbstractC0538i {

    static final AbstractC0538i f2631z = new C0546q(null, new Object[0], 0);

    private final transient Object f2632v;

    final transient Object[] f2633w;

    private final transient int f2634y;

    private C0546q(Object obj, Object[] objArr, int i7) {
        this.f2632v = obj;
        this.f2633w = objArr;
        this.f2634y = i7;
    }

    static C0546q h(int i7, Object[] objArr, C0537h c0537h) {
        int iHighestOneBit;
        short[] sArr;
        char c2;
        char c3;
        byte[] bArr;
        int i8 = i7;
        Object[] objArrCopyOf = objArr;
        if (i8 == 0) {
            return (C0546q) f2631z;
        }
        Object obj = null;
        int i9 = 1;
        if (i8 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            b0.a(obj2, obj3);
            return new C0546q(null, objArrCopyOf, 1);
        }
        Y.b(i8, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i8, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i8 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            b0.a(obj4, obj5);
            i8 = 1;
            c2 = 1;
            c3 = 2;
        } else {
            int i10 = iHighestOneBit - 1;
            char c7 = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr2 = new byte[iHighestOneBit];
                Arrays.fill(bArr2, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj6 = objArrCopyOf[i14];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i14 ^ i9];
                    Objects.requireNonNull(obj7);
                    b0.a(obj6, obj7);
                    int iA = d0.a(obj6.hashCode());
                    while (true) {
                        int i15 = iA & i10;
                        int i16 = bArr2[i15] & 255;
                        if (i16 == 255) {
                            bArr2[i15] = (byte) i13;
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
                                C0536g c0536g = new C0536g(obj6, obj7, obj8);
                                objArrCopyOf[i17] = obj7;
                                obj = c0536g;
                                break;
                            }
                            iA = i15 + 1;
                        }
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 == i8) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i12), obj};
                    c3 = 2;
                    c2 = 1;
                    obj = bArr;
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i18 = 0;
                for (int i19 = 0; i19 < i8; i19++) {
                    int i20 = i18 + i18;
                    int i21 = i19 + i19;
                    Object obj9 = objArrCopyOf[i21];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArrCopyOf[i21 ^ 1];
                    Objects.requireNonNull(obj10);
                    b0.a(obj9, obj10);
                    int iA2 = d0.a(obj9.hashCode());
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
                                C0536g c0536g2 = new C0536g(obj9, obj10, obj11);
                                objArrCopyOf[i23] = obj10;
                                obj = c0536g2;
                                break;
                            }
                            iA2 = i22 + 1;
                        }
                    }
                }
                if (i18 != i8) {
                    c3 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i18), obj};
                    c2 = 1;
                }
                bArr = sArr;
            } else {
                int i24 = 1;
                sArr = new int[iHighestOneBit];
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
                    b0.a(obj12, obj13);
                    int iA3 = d0.a(obj12.hashCode());
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
                                C0536g c0536g3 = new C0536g(obj12, obj13, obj14);
                                objArrCopyOf[i30] = obj13;
                                obj = c0536g3;
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
                    obj = new Object[]{sArr, Integer.valueOf(i26), obj};
                }
                bArr = sArr;
            }
            c3 = 2;
            c2 = 1;
            obj = bArr;
        }
        boolean z7 = obj instanceof Object[];
        Object obj15 = obj;
        if (z7) {
            Object[] objArr2 = (Object[]) obj;
            C0536g c0536g4 = (C0536g) objArr2[c3];
            if (c0537h == null) {
                throw c0536g4.a();
            }
            c0537h.f2614c = c0536g4;
            Object obj16 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i8 = iIntValue;
        }
        return new C0546q(obj15, objArrCopyOf, i8);
    }

    @Override
    final AbstractC0532c a() {
        return new C0545p(this.f2633w, 1, this.f2634y);
    }

    @Override
    final AbstractC0539j d() {
        return new C0543n(this, this.f2633w, 0, this.f2634y);
    }

    @Override
    final AbstractC0539j f() {
        return new C0544o(this, new C0545p(this.f2633w, 0, this.f2634y));
    }

    @Override
    public final java.lang.Object get(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: N3.C0546q.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.f2634y;
    }
}
