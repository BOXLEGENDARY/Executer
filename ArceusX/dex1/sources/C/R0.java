package C;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class R0 {

    private final List<N0> f436a;

    public R0(List<N0> list) {
        this.f436a = new ArrayList(list);
    }

    public static String d(R0 r02) {
        ArrayList arrayList = new ArrayList();
        Iterator<N0> it = r02.f436a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public boolean a(Class<? extends N0> cls) {
        Iterator<N0> it = this.f436a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends N0> T b(Class<T> cls) {
        Iterator<N0> it = this.f436a.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (t7.getClass() == cls) {
                return t7;
            }
        }
        return null;
    }

    public <T extends N0> List<T> c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (N0 n02 : this.f436a) {
            if (cls.isAssignableFrom(n02.getClass())) {
                arrayList.add(n02);
            }
        }
        return arrayList;
    }
}
