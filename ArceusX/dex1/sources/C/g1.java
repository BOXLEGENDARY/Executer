package C;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

public class g1 {

    private static final g1 f597b = new g1(new ArrayMap());

    protected final Map<String, Object> f598a;

    protected g1(Map<String, Object> map) {
        this.f598a = map;
    }

    public static g1 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new g1(arrayMap);
    }

    public static g1 b() {
        return f597b;
    }

    public static g1 c(g1 g1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : g1Var.e()) {
            arrayMap.put(str, g1Var.d(str));
        }
        return new g1(arrayMap);
    }

    public Object d(String str) {
        return this.f598a.get(str);
    }

    public Set<String> e() {
        return this.f598a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
