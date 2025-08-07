package K3;

import java.util.Comparator;

final class C0491t0 implements Comparator {
    C0491t0() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        B0 b02 = (B0) obj;
        B0 b03 = (B0) obj2;
        C0489s0 c0489s0 = new C0489s0(b02);
        C0489s0 c0489s02 = new C0489s0(b03);
        while (c0489s0.hasNext() && c0489s02.hasNext()) {
            int iCompareTo = Integer.valueOf(c0489s0.zza() & 255).compareTo(Integer.valueOf(c0489s02.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(b02.g()).compareTo(Integer.valueOf(b03.g()));
    }
}
