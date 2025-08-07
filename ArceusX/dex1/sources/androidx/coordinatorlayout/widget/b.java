package androidx.coordinatorlayout.widget;

import g0.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import x0.d;
import x0.e;

public final class b<T> {

    private final d<ArrayList<T>> f10349a = new e(10);

    private final k<T, ArrayList<T>> f10350b = new k<>();

    private final ArrayList<T> f10351c = new ArrayList<>();

    private final HashSet<T> f10352d = new HashSet<>();

    private void e(T t7, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t7)) {
            return;
        }
        if (hashSet.contains(t7)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t7);
        ArrayList<T> arrayList2 = this.f10350b.get(t7);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                e(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(t7);
        arrayList.add(t7);
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f10349a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f10349a.a(arrayList);
    }

    public void a(T t7, T t8) {
        if (!this.f10350b.containsKey(t7) || !this.f10350b.containsKey(t8)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f10350b.get(t7);
        if (arrayListF == null) {
            arrayListF = f();
            this.f10350b.put(t7, arrayListF);
        }
        arrayListF.add(t8);
    }

    public void b(T t7) {
        if (this.f10350b.containsKey(t7)) {
            return;
        }
        this.f10350b.put(t7, null);
    }

    public void c() {
        int size = this.f10350b.getSize();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList<T> arrayListK = this.f10350b.k(i7);
            if (arrayListK != null) {
                k(arrayListK);
            }
        }
        this.f10350b.clear();
    }

    public boolean d(T t7) {
        return this.f10350b.containsKey(t7);
    }

    public List g(T t7) {
        return this.f10350b.get(t7);
    }

    public List<T> h(T t7) {
        int size = this.f10350b.getSize();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList<T> arrayListK = this.f10350b.k(i7);
            if (arrayListK != null && arrayListK.contains(t7)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f10350b.g(i7));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f10351c.clear();
        this.f10352d.clear();
        int size = this.f10350b.getSize();
        for (int i7 = 0; i7 < size; i7++) {
            e(this.f10350b.g(i7), this.f10351c, this.f10352d);
        }
        return this.f10351c;
    }

    public boolean j(T t7) {
        int size = this.f10350b.getSize();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList<T> arrayListK = this.f10350b.k(i7);
            if (arrayListK != null && arrayListK.contains(t7)) {
                return true;
            }
        }
        return false;
    }
}
