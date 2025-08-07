package K3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class K0 extends T0 {

    private final A f1794d;

    private final int f1795e;

    K0(A a2) throws J0 {
        a2.getClass();
        this.f1794d = a2;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            A a3 = this.f1794d;
            if (i7 >= a3.size()) {
                break;
            }
            int iC = ((T0) a3.get(i7)).c();
            if (i8 < iC) {
                i8 = iC;
            }
            i7++;
        }
        int i9 = i8 + 1;
        this.f1795e = i9;
        if (i9 > 4) {
            throw new J0("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override
    protected final int c() {
        return this.f1795e;
    }

    @Override
    public final int compareTo(Object obj) {
        T0 t02 = (T0) obj;
        if (T0.f(Byte.MIN_VALUE) != t02.zza()) {
            return T0.f(Byte.MIN_VALUE) - t02.zza();
        }
        K0 k02 = (K0) t02;
        A a2 = this.f1794d;
        int size = a2.size();
        A a3 = k02.f1794d;
        if (size != a3.size()) {
            return a2.size() - a3.size();
        }
        int i7 = 0;
        while (true) {
            A a8 = this.f1794d;
            if (i7 >= a8.size()) {
                return 0;
            }
            int iCompareTo = ((T0) a8.get(i7)).compareTo((T0) k02.f1794d.get(i7));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K0.class == obj.getClass()) {
            return this.f1794d.equals(((K0) obj).f1794d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(T0.f(Byte.MIN_VALUE)), this.f1794d});
    }

    public final String toString() {
        if (this.f1794d.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        A a2 = this.f1794d;
        int size = a2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((T0) a2.get(i7)).toString().replace("\n", "\n  "));
        }
        C0467h c0467hA = C0467h.a(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        try {
            c0467hA.b(sb, arrayList.iterator());
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override
    protected final int zza() {
        return T0.f(Byte.MIN_VALUE);
    }
}
