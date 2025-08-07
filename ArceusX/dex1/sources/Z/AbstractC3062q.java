package z;

public abstract class AbstractC3062q {

    public static abstract class a {
        public static a a(int i7) {
            return b(i7, null);
        }

        public static a b(int i7, Throwable th) {
            return new C3040c(i7, th);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC3062q a(b bVar) {
        return b(bVar, null);
    }

    public static AbstractC3062q b(b bVar, a aVar) {
        return new C3038b(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
