package t2;

public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        f23803v
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static g d() {
        return new b(a.f23803v, -1L);
    }

    public static g e(long j7) {
        return new b(a.OK, j7);
    }

    public static g f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
