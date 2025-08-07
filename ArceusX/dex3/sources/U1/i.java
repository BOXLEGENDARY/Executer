package U1;

public class i<T> {
    T a;
    T b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x0.c)) {
            return false;
        }
        x0.c cVar = (x0.c) obj;
        return a(cVar.a, this.a) && a(cVar.b, this.b);
    }

    public int hashCode() {
        T t = this.a;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
