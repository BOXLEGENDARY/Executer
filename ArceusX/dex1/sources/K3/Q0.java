package K3;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Q0 extends T0 {

    private final int f1804d;

    private final I f1805e;

    Q0(I i7) throws J0 {
        i7.getClass();
        this.f1805e = i7;
        AbstractC0460d0 it = i7.c().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iC = ((T0) entry.getKey()).c();
            i8 = i8 < iC ? iC : i8;
            int iC2 = ((T0) entry.getValue()).c();
            if (i8 < iC2) {
                i8 = iC2;
            }
        }
        int i9 = i8 + 1;
        this.f1804d = i9;
        if (i9 > 4) {
            throw new J0("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override
    protected final int c() {
        return this.f1804d;
    }

    @Override
    public final int compareTo(Object obj) {
        int iCompareTo;
        int size;
        int size2;
        T0 t02 = (T0) obj;
        if (T0.f((byte) -96) != t02.zza()) {
            size2 = t02.zza();
            size = T0.f((byte) -96);
        } else {
            Q0 q02 = (Q0) t02;
            if (this.f1805e.size() == q02.f1805e.size()) {
                AbstractC0460d0 it = this.f1805e.c().iterator();
                AbstractC0460d0 it2 = q02.f1805e.c().iterator();
                do {
                    if (!it.hasNext() && !it2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    int iCompareTo2 = ((T0) entry.getKey()).compareTo((T0) entry2.getKey());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                    iCompareTo = ((T0) entry.getValue()).compareTo((T0) entry2.getValue());
                } while (iCompareTo == 0);
                return iCompareTo;
            }
            size = this.f1805e.size();
            size2 = q02.f1805e.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q0.class == obj.getClass()) {
            return this.f1805e.equals(((Q0) obj).f1805e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(T0.f((byte) -96)), this.f1805e});
    }

    public final I n() {
        return this.f1805e;
    }

    public final String toString() {
        if (this.f1805e.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC0460d0 it = this.f1805e.c().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((T0) entry.getKey()).toString().replace("\n", "\n  "), ((T0) entry.getValue()).toString().replace("\n", "\n  "));
        }
        C0467h c0467hA = C0467h.a(",\n  ");
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            C0465g.a(sb, linkedHashMap.entrySet().iterator(), c0467hA, " : ");
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override
    protected final int zza() {
        return T0.f((byte) -96);
    }
}
