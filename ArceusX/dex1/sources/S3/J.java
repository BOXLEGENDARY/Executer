package S3;

import java.util.Arrays;

public final class J extends F {
    public J() {
        super(4);
    }

    public final J a(Object obj) {
        obj.getClass();
        int i7 = this.f6459b;
        int i8 = i7 + 1;
        Object[] objArr = this.f6458a;
        int length = objArr.length;
        if (length < i8) {
            int i9 = length + (length >> 1) + 1;
            if (i9 < i8) {
                int iHighestOneBit = Integer.highestOneBit(i7);
                i9 = iHighestOneBit + iHighestOneBit;
            }
            if (i9 < 0) {
                i9 = Integer.MAX_VALUE;
            }
            this.f6458a = Arrays.copyOf(objArr, i9);
            this.f6460c = false;
        } else if (this.f6460c) {
            this.f6458a = (Object[]) objArr.clone();
            this.f6460c = false;
        }
        Object[] objArr2 = this.f6458a;
        int i10 = this.f6459b;
        this.f6459b = i10 + 1;
        objArr2[i10] = obj;
        return this;
    }

    public final M b() {
        this.f6460c = true;
        return M.l(this.f6458a, this.f6459b);
    }
}
