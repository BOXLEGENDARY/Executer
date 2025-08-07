package S6;

import S6.m;
import java.util.ArrayList;
import java.util.Vector;

public class e<T extends m> extends Vector<T> {

    protected a<T> f7410d;

    public interface a<T> {
        boolean c(T t7, T t8);
    }

    public synchronized int d(String str) {
        for (int i7 = 0; i7 < size(); i7++) {
            if (str.equals(get(i7).b())) {
                return i7;
            }
        }
        return -1;
    }

    public boolean e(T t7, T t8) {
        a<T> aVar = this.f7410d;
        return aVar != null ? aVar.c(t7, t8) : t7 == t8;
    }

    public synchronized void g(T t7) {
        int i7 = 0;
        while (true) {
            try {
                if (i7 >= size()) {
                    add(t7);
                    break;
                } else {
                    if (e(t7, get(i7))) {
                        get(i7).c(t7);
                        break;
                    }
                    i7++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void j(String str) {
        int iD = d(str);
        if (iD != -1) {
            remove(iD);
        }
    }

    public synchronized void k(long j7) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < size(); i7++) {
                if (get(i7).a() <= j7) {
                    arrayList.add(get(i7));
                }
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                remove(arrayList.get(i8));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void l(a<T> aVar) {
        this.f7410d = aVar;
    }
}
