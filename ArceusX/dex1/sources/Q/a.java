package Q;

import C.o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import z.C3070z;

public class a {
    private static C3070z a(List<C3070z> list) {
        if (list.isEmpty()) {
            return null;
        }
        C3070z c3070z = list.get(0);
        Integer numValueOf = Integer.valueOf(c3070z.b());
        Integer numValueOf2 = Integer.valueOf(c3070z.a());
        for (int i7 = 1; i7 < list.size(); i7++) {
            C3070z c3070z2 = list.get(i7);
            numValueOf = c(numValueOf, Integer.valueOf(c3070z2.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(c3070z2.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new C3070z(numValueOf.intValue(), numValueOf2.intValue());
    }

    private static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(2) && !num2.equals(1)) {
            return num2;
        }
        if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
            return null;
        }
        return num;
    }

    public static C3070z d(Set<o1<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<o1<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().o());
        }
        return a(arrayList);
    }
}
