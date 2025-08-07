package W1;

import java.util.Arrays;
import java.util.List;

public class o implements c {
    private final String a;
    private final List<c> b;
    private final boolean c;

    public o(String str, List<c> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.d(aVar, bVar, this);
    }

    public List<c> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
