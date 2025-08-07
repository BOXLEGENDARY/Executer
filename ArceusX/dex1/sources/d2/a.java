package D2;

import android.util.SparseArray;
import java.util.HashMap;
import q2.d;

public final class a {

    private static SparseArray<d> f886a = new SparseArray<>();

    private static HashMap<d, Integer> f887b;

    static {
        HashMap<d, Integer> map = new HashMap<>();
        f887b = map;
        map.put(d.DEFAULT, 0);
        f887b.put(d.VERY_LOW, 1);
        f887b.put(d.HIGHEST, 2);
        for (d dVar : f887b.keySet()) {
            f886a.append(f887b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f887b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = f886a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i7);
    }
}
