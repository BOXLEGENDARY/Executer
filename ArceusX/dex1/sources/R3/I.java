package R3;

import java.util.Arrays;

class I extends J {

    Object[] f5239a = new Object[4];

    int f5240b = 0;

    boolean f5241c;

    I(int i7) {
    }

    private final void b(int i7) {
        Object[] objArr = this.f5239a;
        int length = objArr.length;
        if (length >= i7) {
            if (this.f5241c) {
                this.f5239a = (Object[]) objArr.clone();
                this.f5241c = false;
                return;
            }
            return;
        }
        int i8 = length + (length >> 1) + 1;
        if (i8 < i7) {
            int iHighestOneBit = Integer.highestOneBit(i7 - 1);
            i8 = iHighestOneBit + iHighestOneBit;
        }
        if (i8 < 0) {
            i8 = Integer.MAX_VALUE;
        }
        this.f5239a = Arrays.copyOf(objArr, i8);
        this.f5241c = false;
    }

    public final I a(Object obj) {
        obj.getClass();
        b(this.f5240b + 1);
        Object[] objArr = this.f5239a;
        int i7 = this.f5240b;
        this.f5240b = i7 + 1;
        objArr[i7] = obj;
        return this;
    }
}
