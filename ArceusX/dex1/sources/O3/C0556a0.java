package O3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class C0556a0 extends AbstractC0567b0 {

    Object[] f3381a = new Object[4];

    int f3382b = 0;

    boolean f3383c;

    C0556a0(int i7) {
    }

    private final void d(int i7) {
        Object[] objArr = this.f3381a;
        int length = objArr.length;
        if (length >= i7) {
            if (this.f3383c) {
                this.f3381a = (Object[]) objArr.clone();
                this.f3383c = false;
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
        this.f3381a = Arrays.copyOf(objArr, i8);
        this.f3383c = false;
    }

    public final C0556a0 b(Object obj) {
        obj.getClass();
        d(this.f3382b + 1);
        Object[] objArr = this.f3381a;
        int i7 = this.f3382b;
        this.f3382b = i7 + 1;
        objArr[i7] = obj;
        return this;
    }

    public final AbstractC0567b0 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(this.f3382b + collection.size());
            if (collection instanceof AbstractC0578c0) {
                this.f3382b = ((AbstractC0578c0) collection).d(this.f3381a, this.f3382b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
