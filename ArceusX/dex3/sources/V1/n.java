package V1;

import java.util.Arrays;
import java.util.List;

abstract class n<V, O> implements m<V, O> {
    final List<c2.a<V>> a;

    n(List<c2.a<V>> list) {
        this.a = list;
    }

    @Override
    public List<c2.a<V>> b() {
        return this.a;
    }

    @Override
    public boolean c() {
        if (this.a.isEmpty()) {
            return true;
        }
        return this.a.size() == 1 && this.a.get(0).h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
