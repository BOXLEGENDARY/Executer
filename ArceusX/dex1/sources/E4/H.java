package E4;

public final class H extends RuntimeException {
    H(String str) {
        super(str);
    }

    H(String str, Throwable th) {
        super(str, th);
    }
}
