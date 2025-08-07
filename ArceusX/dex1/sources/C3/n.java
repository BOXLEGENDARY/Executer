package C3;

public final class n extends Exception {
    public n(String str) {
        super(String.format("User verification requirement %s not supported", str));
    }
}
