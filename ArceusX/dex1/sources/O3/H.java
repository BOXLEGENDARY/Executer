package O3;

import java.util.Map;

abstract class H implements Map.Entry {
    H() {
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (C0720p.a(getKey(), entry.getKey()) && C0720p.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public abstract Object getKey();

    @Override
    public abstract Object getValue();

    @Override
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return String.valueOf(getKey()) + "=" + String.valueOf(getValue());
    }
}
