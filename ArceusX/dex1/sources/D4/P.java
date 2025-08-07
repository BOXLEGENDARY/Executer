package D4;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class P {

    private final Map f914a;

    public final Map a(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        for (String str : this.f914a.keySet()) {
            if (this.f914a.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.f914a.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.emptySet();
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
