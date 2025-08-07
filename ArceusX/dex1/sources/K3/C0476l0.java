package K3;

import java.math.RoundingMode;

public final class C0476l0 {
    public static int a(int r5, int r6, java.math.RoundingMode r7) {
        throw new UnsupportedOperationException("Method not decompiled: K3.C0476l0.a(int, int, java.math.RoundingMode):int");
    }

    public static int b(int i7, RoundingMode roundingMode) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (C0474k0.f1881a[roundingMode.ordinal()]) {
            case 1:
                C0478m0.a(((i7 + (-1)) & i7) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i7) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }
}
