package D4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class N {

    private final Map f913a = new HashMap();

    public final N a(String str, String str2, String str3) {
        if (!this.f913a.containsKey(str2)) {
            this.f913a.put(str2, new HashMap());
        }
        ((Map) this.f913a.get(str2)).put(str, str3);
        return this;
    }

    public final P b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f913a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new P(Collections.unmodifiableMap(map), null);
    }
}
