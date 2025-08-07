package t3;

import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class C2910a {

    private static InterfaceC0228a f23818a;

    public interface InterfaceC0228a {
        @Deprecated
        ScheduledExecutorService a();
    }

    @Deprecated
    public static synchronized InterfaceC0228a a() {
        try {
            if (f23818a == null) {
                f23818a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f23818a;
    }
}
