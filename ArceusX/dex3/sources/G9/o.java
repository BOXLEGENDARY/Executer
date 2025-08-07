package G9;

import androidx.annotation.NonNull;

public class o<T> {
    private final String a;

    o(@NonNull String str) {
        this.a = str;
    }

    @NonNull
    public static <T> o<T> b(@NonNull String str) {
        return new o<>(str);
    }

    public T a(@NonNull q qVar) {
        return (T) qVar.a(this);
    }

    @NonNull
    public T c(@NonNull q qVar) {
        T tA = a(qVar);
        if (tA != null) {
            return tA;
        }
        throw new NullPointerException(this.a);
    }

    public void d(@NonNull q qVar, T t) {
        qVar.b(this, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((o) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.a + "'}";
    }
}
