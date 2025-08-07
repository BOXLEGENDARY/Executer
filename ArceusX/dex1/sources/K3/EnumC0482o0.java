package K3;

import java.util.Comparator;

enum EnumC0482o0 implements Comparator {
    INSTANCE;

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            int i8 = (bArr[i7] & 255) - (bArr2[i7] & 255);
            if (i8 != 0) {
                return i8;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
