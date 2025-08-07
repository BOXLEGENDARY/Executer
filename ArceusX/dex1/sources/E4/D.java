package E4;

public final class D extends RuntimeException {
    public D(String str) {
        super(str);
    }

    public D(String str, Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
