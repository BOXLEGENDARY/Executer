package Ua;

public class c {
    protected c() {
    }

    public static c a(int i) {
        return new Pa.b(-1, i, false);
    }

    public static c b(int i) {
        return new Pa.b(i, -1, false);
    }

    public static c c() {
        return new Pa.b(-1, -1, true);
    }

    public static c d() {
        return null;
    }
}
