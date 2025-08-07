package N3;

public class C0531b {
    static int a(int i7, int i8) {
        if (i8 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i9 = i7 + (i7 >> 1) + 1;
        if (i9 < i8) {
            int iHighestOneBit = Integer.highestOneBit(i8 - 1);
            i9 = iHighestOneBit + iHighestOneBit;
        }
        if (i9 < 0) {
            return Integer.MAX_VALUE;
        }
        return i9;
    }
}
