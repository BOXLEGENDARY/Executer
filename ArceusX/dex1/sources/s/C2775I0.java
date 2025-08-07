package s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s.C2797b1;

public class C2775I0 implements C.T0 {

    private C2797b1 f22980b;

    private List<C.a1> f22981c;

    private volatile C.X0 f22983e;

    private final Object f22979a = new Object();

    private volatile boolean f22982d = false;

    public C2775I0(C2797b1 c2797b1, List<C.a1> list) {
        x0.g.b(c2797b1.f23279i == C2797b1.c.OPENED, "CaptureSession state must be OPENED. Current state:" + c2797b1.f23279i);
        this.f22980b = c2797b1;
        this.f22981c = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        synchronized (this.f22979a) {
            this.f22982d = true;
            this.f22980b = null;
            this.f22983e = null;
            this.f22981c = null;
        }
    }

    public void b(C.X0 x02) {
        synchronized (this.f22979a) {
            this.f22983e = x02;
        }
    }
}
