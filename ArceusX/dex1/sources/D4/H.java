package D4;

public final class H {

    private C0379j f900a;

    H(C0394z c0394z) {
    }

    public final H a(C0379j c0379j) {
        this.f900a = c0379j;
        return this;
    }

    public final V b() {
        C0379j c0379j = this.f900a;
        if (c0379j != null) {
            return new J(c0379j, null);
        }
        throw new IllegalStateException(String.valueOf(C0379j.class.getCanonicalName()).concat(" must be set"));
    }
}
