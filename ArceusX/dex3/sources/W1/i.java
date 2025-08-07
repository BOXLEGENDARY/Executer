package W1;

public class i implements c {
    private final String a;
    private final a b;
    private final boolean c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a c(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public i(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        if (aVar.o()) {
            return new R1.l(this);
        }
        b2.d.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }
}
