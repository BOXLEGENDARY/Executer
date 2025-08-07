package G9;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

class r implements q {
    private final Map<o, Object> a = new HashMap(3);

    r() {
    }

    @Override
    public <T> T a(@NonNull o<T> oVar) {
        return (T) this.a.get(oVar);
    }

    @Override
    public <T> void b(@NonNull o<T> oVar, T t) {
        if (t == null) {
            this.a.remove(oVar);
        } else {
            this.a.put(oVar, t);
        }
    }
}
