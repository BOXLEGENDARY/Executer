package R3;

final class G {
    static int a(int i7) {
        return (i7 < 32 ? 4 : 2) * (i7 + 1);
    }

    static int b(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i8;
        int i9;
        int iA = H.a(obj);
        int i10 = iA & i7;
        int iC = c(obj3, i10);
        if (iC != 0) {
            int i11 = ~i7;
            int i12 = iA & i11;
            int i13 = -1;
            while (true) {
                i8 = iC - 1;
                i9 = iArr[i8];
                if ((i9 & i11) != i12 || !Q6.a(obj, objArr[i8]) || (objArr2 != null && !Q6.a(obj2, objArr2[i8]))) {
                    int i14 = i9 & i7;
                    if (i14 == 0) {
                        break;
                    }
                    i13 = i8;
                    iC = i14;
                } else {
                    break;
                }
            }
            int i15 = i9 & i7;
            if (i13 == -1) {
                e(obj3, i10, i15);
            } else {
                iArr[i13] = (i15 & i7) | (iArr[i13] & i11);
            }
            return i8;
        }
        return -1;
    }

    static int c(Object obj, int i7) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i7] : ((int[]) obj)[i7];
    }

    static Object d(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i7);
    }

    static void e(Object obj, int i7, int i8) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }
}
