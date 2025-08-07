package h5;

public class b implements a {

    private static b f21040a;

    private b() {
    }

    public static b b() {
        if (f21040a == null) {
            f21040a = new b();
        }
        return f21040a;
    }

    @Override
    public long a() {
        return System.currentTimeMillis();
    }
}
