package x0;

public class C2986c<F, S> {

    public final F f24317a;

    public final S f24318b;

    public C2986c(F f7, S s7) {
        this.f24317a = f7;
        this.f24318b = s7;
    }

    public static <A, B> C2986c<A, B> a(A a2, B b2) {
        return new C2986c<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2986c)) {
            return false;
        }
        C2986c c2986c = (C2986c) obj;
        return C2985b.a(c2986c.f24317a, this.f24317a) && C2985b.a(c2986c.f24318b, this.f24318b);
    }

    public int hashCode() {
        F f7 = this.f24317a;
        int iHashCode = f7 == null ? 0 : f7.hashCode();
        S s7 = this.f24318b;
        return iHashCode ^ (s7 != null ? s7.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f24317a + " " + this.f24318b + "}";
    }
}
