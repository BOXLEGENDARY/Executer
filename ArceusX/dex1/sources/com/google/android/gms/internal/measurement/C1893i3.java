package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class C1893i3 extends AbstractC1861e3<Boolean> implements RandomAccess, InterfaceC1830a4, F4 {

    private static final C1893i3 f15179v;

    private boolean[] f15180e;

    private int f15181i;

    static {
        C1893i3 c1893i3 = new C1893i3(new boolean[0], 0);
        f15179v = c1893i3;
        c1893i3.zzb();
    }

    C1893i3() {
        this(new boolean[10], 0);
    }

    private final String g(int i7) {
        int i8 = this.f15181i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void j(int i7) {
        if (i7 < 0 || i7 >= this.f15181i) {
            throw new IndexOutOfBoundsException(g(i7));
        }
    }

    @Override
    public final void add(int i7, Object obj) {
        int i8;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i7 < 0 || i7 > (i8 = this.f15181i)) {
            throw new IndexOutOfBoundsException(g(i7));
        }
        boolean[] zArr = this.f15180e;
        if (i8 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i7 + 1, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            System.arraycopy(this.f15180e, i7, zArr2, i7 + 1, this.f15181i - i7);
            this.f15180e = zArr2;
        }
        this.f15180e[i7] = zBooleanValue;
        this.f15181i++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        C1838b4.e(collection);
        if (!(collection instanceof C1893i3)) {
            return super.addAll(collection);
        }
        C1893i3 c1893i3 = (C1893i3) collection;
        int i7 = c1893i3.f15181i;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f15181i;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.f15180e;
        if (i9 > zArr.length) {
            this.f15180e = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(c1893i3.f15180e, 0, this.f15180e, this.f15181i, c1893i3.f15181i);
        this.f15181i = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z7) {
        d();
        int i7 = this.f15181i;
        boolean[] zArr = this.f15180e;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[((i7 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            this.f15180e = zArr2;
        }
        boolean[] zArr3 = this.f15180e;
        int i8 = this.f15181i;
        this.f15181i = i8 + 1;
        zArr3[i8] = z7;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1893i3)) {
            return super.equals(obj);
        }
        C1893i3 c1893i3 = (C1893i3) obj;
        if (this.f15181i != c1893i3.f15181i) {
            return false;
        }
        boolean[] zArr = c1893i3.f15180e;
        for (int i7 = 0; i7 < this.f15181i; i7++) {
            if (this.f15180e[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i7) {
        j(i7);
        return Boolean.valueOf(this.f15180e[i7]);
    }

    @Override
    public final InterfaceC1830a4 h(int i7) {
        if (i7 >= this.f15181i) {
            return new C1893i3(Arrays.copyOf(this.f15180e, i7), this.f15181i);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final int hashCode() {
        int iA = 1;
        for (int i7 = 0; i7 < this.f15181i; i7++) {
            iA = (iA * 31) + C1838b4.a(this.f15180e[i7]);
        }
        return iA;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.f15181i;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f15180e[i8] == zBooleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override
    public final Object remove(int i7) {
        d();
        j(i7);
        boolean[] zArr = this.f15180e;
        boolean z7 = zArr[i7];
        if (i7 < this.f15181i - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.f15181i--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override
    protected final void removeRange(int i7, int i8) {
        d();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f15180e;
        System.arraycopy(zArr, i8, zArr, i7, this.f15181i - i8);
        this.f15181i -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        j(i7);
        boolean[] zArr = this.f15180e;
        boolean z7 = zArr[i7];
        zArr[i7] = zBooleanValue;
        return Boolean.valueOf(z7);
    }

    @Override
    public final int size() {
        return this.f15181i;
    }

    private C1893i3(boolean[] zArr, int i7) {
        this.f15180e = zArr;
        this.f15181i = i7;
    }

    @Override
    public final boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
