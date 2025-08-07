package r2;

import java.util.List;

final class d extends j {

    private final List<m> f22791a;

    d(List<m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f22791a = list;
    }

    @Override
    public List<m> c() {
        return this.f22791a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f22791a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f22791a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f22791a + "}";
    }
}
