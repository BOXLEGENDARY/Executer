package S1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public class h {
    private final List<a<W1.m, Path>> a;
    private final List<a<Integer, Integer>> b;
    private final List<W1.h> c;

    public h(List<W1.h> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<a<W1.m, Path>> a() {
        return this.a;
    }

    public List<W1.h> b() {
        return this.c;
    }

    public List<a<Integer, Integer>> c() {
        return this.b;
    }
}
