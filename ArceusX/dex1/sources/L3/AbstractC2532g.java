package l3;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1802b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import l3.C2526a;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import m3.InterfaceC2579j;

@Deprecated
public abstract class AbstractC2532g {

    private static final Set f21802a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends InterfaceC2572c {
    }

    @Deprecated
    public interface b extends InterfaceC2577h {
    }

    public static Set<AbstractC2532g> b() {
        Set<AbstractC2532g> set = f21802a;
        synchronized (set) {
        }
        return set;
    }

    @ResultIgnorabilityUnspecified
    public <A extends C2526a.b, T extends AbstractC1802b<? extends InterfaceC2540o, A>> T a(T t7) {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(InterfaceC2579j interfaceC2579j) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
