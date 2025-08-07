package G5;

public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int[] d;
    private final int e;

    b(int[] iArr, int i) {
        this.d = iArr;
        this.e = i;
    }

    public int c() {
        return this.e;
    }

    public int e(c cVar) {
        int iF = cVar.f();
        return this.d[iF <= 9 ? (char) 0 : iF <= 26 ? (char) 1 : (char) 2];
    }
}
