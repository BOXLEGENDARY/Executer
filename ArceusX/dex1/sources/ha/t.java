package ha;

import java.net.CookiePolicy;
import t7.a;
import t7.i;

public class t implements a {

    private static final Object f22566b = new Object();

    private s f22567a;

    public i a() {
        s sVar;
        synchronized (f22566b) {
            try {
                if (this.f22567a == null) {
                    this.f22567a = new s(CookiePolicy.ACCEPT_ALL);
                }
                sVar = this.f22567a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
