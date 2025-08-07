package n5;

import N3.C0553y;
import N3.C0554z;
import java.util.EnumMap;
import java.util.Map;
import n3.C2649g;
import o5.l;
import p5.EnumC2725a;

public abstract class AbstractC2671b {

    private static final Map f22303d = new EnumMap(EnumC2725a.class);

    public static final Map f22304e = new EnumMap(EnumC2725a.class);

    private final String f22305a;

    private final EnumC2725a f22306b;

    private final l f22307c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2671b)) {
            return false;
        }
        AbstractC2671b abstractC2671b = (AbstractC2671b) obj;
        return C2649g.b(this.f22305a, abstractC2671b.f22305a) && C2649g.b(this.f22306b, abstractC2671b.f22306b) && C2649g.b(this.f22307c, abstractC2671b.f22307c);
    }

    public int hashCode() {
        return C2649g.c(this.f22305a, this.f22306b, this.f22307c);
    }

    public String toString() {
        C0553y c0553yA = C0554z.a("RemoteModel");
        c0553yA.a("modelName", this.f22305a);
        c0553yA.a("baseModel", this.f22306b);
        c0553yA.a("modelType", this.f22307c);
        return c0553yA.toString();
    }
}
