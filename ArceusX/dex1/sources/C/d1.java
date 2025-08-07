package C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class d1 {

    private final List<e1> f540a = new ArrayList();

    private static void b(List<int[]> list, int i7, int[] iArr, int i8) {
        if (i8 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = 0;
            while (true) {
                if (i10 >= i8) {
                    iArr[i8] = i9;
                    b(list, i7, iArr, i8 + 1);
                    break;
                } else if (i9 == iArr[i10]) {
                    break;
                } else {
                    i10++;
                }
            }
        }
    }

    private List<int[]> c(int i7) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i7, new int[i7], 0);
        return arrayList;
    }

    public boolean a(e1 e1Var) {
        return this.f540a.add(e1Var);
    }

    public List<e1> d(List<e1> list) {
        int i7;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f540a.size()) {
            return null;
        }
        List<int[]> listC = c(this.f540a.size());
        e1[] e1VarArr = new e1[list.size()];
        Iterator<int[]> it = listC.iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean zG = true;
            while (i7 < this.f540a.size()) {
                if (next[i7] < list.size()) {
                    zG &= this.f540a.get(i7).g(list.get(next[i7]));
                    if (!zG) {
                        break;
                    }
                    e1VarArr[next[i7]] = this.f540a.get(i7);
                }
                i7++;
            }
            if (zG) {
                i7 = 1;
                break;
            }
        }
        if (i7 != 0) {
            return Arrays.asList(e1VarArr);
        }
        return null;
    }
}
