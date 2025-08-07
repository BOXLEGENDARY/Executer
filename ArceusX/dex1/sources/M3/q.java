package m3;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1802b;
import l3.AbstractC2531f;
import l3.C2526a;
import l3.InterfaceC2540o;

public final class q extends n {

    private final AbstractC2531f f22038c;

    public q(AbstractC2531f abstractC2531f) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f22038c = abstractC2531f;
    }

    @Override
    public final <A extends C2526a.b, T extends AbstractC1802b<? extends InterfaceC2540o, A>> T a(T t7) {
        return (T) this.f22038c.s(t7);
    }

    @Override
    public final Looper c() {
        return this.f22038c.x();
    }
}
