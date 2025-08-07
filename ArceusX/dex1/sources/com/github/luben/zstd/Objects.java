package com.github.luben.zstd;

final class Objects {
    Objects() {
    }

    static void checkFromIndexSize(int i7, int i8, int i9) {
        if ((i9 | i7 | i8) < 0 || i8 > i9 - i7) {
            throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }
}
