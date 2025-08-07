package k5;

import n3.C2651i;

public class C2518a extends Exception {

    private final int f21312d;

    public C2518a(String str, int i7) {
        super(C2651i.g(str, "Provided message must not be empty."));
        this.f21312d = i7;
    }

    public int a() {
        return this.f21312d;
    }

    public C2518a(String str, int i7, Throwable th) {
        super(C2651i.g(str, "Provided message must not be empty."), th);
        this.f21312d = i7;
    }
}
