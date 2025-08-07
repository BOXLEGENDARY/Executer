package Pa;

import java.util.List;
import java.util.Map;

public class m implements Ta.b {
    private final List<Va.a> a;
    private final Map<String, Sa.o> b;

    public m(List<Va.a> list, Map<String, Sa.o> map) {
        this.a = list;
        this.b = map;
    }

    @Override
    public Sa.o a(String str) {
        return this.b.get(str);
    }

    @Override
    public List<Va.a> b() {
        return this.a;
    }
}
