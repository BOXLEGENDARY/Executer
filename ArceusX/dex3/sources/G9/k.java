package G9;

import G9.j;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class k implements j {
    private final Map<Class<? extends Sa.r>, s> a;

    static class a implements j.a {
        private final Map<Class<? extends Sa.r>, s> a = new HashMap(3);

        a() {
        }

        @Override
        @NonNull
        public j a() {
            return new k(Collections.unmodifiableMap(this.a));
        }

        @Override
        @NonNull
        public <N extends Sa.r> j.a b(@NonNull Class<N> cls, s sVar) {
            if (sVar == null) {
                this.a.remove(cls);
            } else {
                this.a.put(cls, sVar);
            }
            return this;
        }
    }

    k(@NonNull Map<Class<? extends Sa.r>, s> map) {
        this.a = map;
    }

    @Override
    public <N extends Sa.r> s a(@NonNull Class<N> cls) {
        return this.a.get(cls);
    }
}
