package K3;

public final class C0480n0 {
    public static byte[] a(byte[]... bArr) {
        int i7 = 0;
        int length = 0;
        while (true) {
            if (i7 >= bArr.length) {
                break;
            }
            length += bArr[i7].length;
            i7++;
        }
        byte[] bArr2 = new byte[length];
        int i8 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i8, length2);
            i8 += length2;
        }
        return bArr2;
    }
}
