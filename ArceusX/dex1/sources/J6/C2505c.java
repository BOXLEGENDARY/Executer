package j6;

import com.roblox.client.flags.FlagJniInterface;
import h7.l;
import java.util.concurrent.atomic.AtomicBoolean;

public class C2505c {

    static int f21153a;

    static AtomicBoolean f21154b = new AtomicBoolean(false);

    public static int a() {
        return f21153a;
    }

    public static void b() {
        if (f21154b.getAndSet(true)) {
            l.a("FlagSettings", "initializeNativeFlags called already, ignoring");
        } else {
            f21153a = FlagJniInterface.nativeRegisterJavaFlagProvider();
        }
    }

    public static boolean c() {
        return f21154b.get();
    }
}
