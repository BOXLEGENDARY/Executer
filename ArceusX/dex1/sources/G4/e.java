package G4;

import java.util.Map;

final class e extends v {

    private final Integer f1390b;

    private final Map f1391c;

    e(Integer num, Map map, d dVar) {
        this.f1390b = num;
        this.f1391c = map;
    }

    @Override
    public final Integer a() {
        return this.f1390b;
    }

    @Override
    public final Map b() {
        return this.f1391c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            Integer num = this.f1390b;
            if (num != null ? num.equals(vVar.a()) : vVar.a() == null) {
                if (this.f1391c.equals(vVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f1390b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f1391c.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f1390b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f1391c) + "}";
    }
}
