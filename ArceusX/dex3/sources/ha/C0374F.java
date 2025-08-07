package ha;

import C9.d;
import C9.g;
import androidx.activity.result.IntentSenderRequest;
import e.c;

public final class C0374F implements d<c<IntentSenderRequest>> {
    private final C0371C a;

    public C0374F(C0371C c0371c) {
        this.a = c0371c;
    }

    public static C0374F a(C0371C c0371c) {
        return new C0374F(c0371c);
    }

    public static c<IntentSenderRequest> c(C0371C c0371c) {
        return (c) g.d(c0371c.a());
    }

    public c<IntentSenderRequest> get() {
        return c(this.a);
    }
}
