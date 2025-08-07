package U4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c {

    private final String f7507a;

    private final Map<Class<?>, Object> f7508b;

    public static final class b {

        private final String f7509a;

        private Map<Class<?>, Object> f7510b = null;

        b(String str) {
            this.f7509a = str;
        }

        public c a() {
            return new c(this.f7509a, this.f7510b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f7510b)));
        }

        public <T extends Annotation> b b(T t7) {
            if (this.f7510b == null) {
                this.f7510b = new HashMap();
            }
            this.f7510b.put(t7.annotationType(), t7);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f7507a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f7508b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7507a.equals(cVar.f7507a) && this.f7508b.equals(cVar.f7508b);
    }

    public int hashCode() {
        return (this.f7507a.hashCode() * 31) + this.f7508b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f7507a + ", properties=" + this.f7508b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f7507a = str;
        this.f7508b = map;
    }
}
