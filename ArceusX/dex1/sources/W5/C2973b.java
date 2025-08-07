package w5;

import R3.O6;
import R3.P6;
import java.util.List;

public class C2973b {

    private final int f24285a;

    private final List f24286b;

    public C2973b(int i7, List list) {
        this.f24285a = i7;
        this.f24286b = list;
    }

    public String toString() {
        O6 o6A = P6.a("FaceContour");
        o6A.b("type", this.f24285a);
        o6A.c("points", this.f24286b.toArray());
        return o6A.toString();
    }
}
