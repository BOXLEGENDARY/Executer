package Q3;

import java.util.Arrays;

class K3 extends C0922l4 {

    Object[] f4089a = new Object[4];

    int f4090b = 0;

    boolean f4091c;

    K3(int i7) {
    }

    private final void b(int i7) {
        Object[] objArr = this.f4089a;
        int length = objArr.length;
        if (length >= i7) {
            if (this.f4091c) {
                this.f4089a = (Object[]) objArr.clone();
                this.f4091c = false;
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
        this.f4089a = Arrays.copyOf(objArr, i8);
        this.f4091c = false;
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f4090b + 1);
        Object[] objArr = this.f4089a;
        int i7 = this.f4090b;
        this.f4090b = i7 + 1;
        objArr[i7] = obj;
        return this;
    }
}
