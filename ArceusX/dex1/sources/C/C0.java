package C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class C0<C> {

    private Set<C> f381a = new HashSet();

    public void a(List<C> list) {
        this.f381a.addAll(list);
    }

    public abstract C0<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f381a));
    }
}
