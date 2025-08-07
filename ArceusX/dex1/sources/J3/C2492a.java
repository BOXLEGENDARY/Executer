package j3;

public class C2492a {

    private int f21126a = 1;

    public C2492a a(Object obj) {
        this.f21126a = (this.f21126a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f21126a;
    }

    public final C2492a c(boolean z7) {
        this.f21126a = (this.f21126a * 31) + (z7 ? 1 : 0);
        return this;
    }
}
