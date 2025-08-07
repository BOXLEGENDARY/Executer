package l3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import l3.InterfaceC2540o;

final class t<R extends InterfaceC2540o> extends BasePendingResult<R> {

    private final InterfaceC2540o f21804o;

    public t(AbstractC2532g abstractC2532g, InterfaceC2540o interfaceC2540o) {
        super(abstractC2532g);
        this.f21804o = interfaceC2540o;
    }

    @Override
    protected final R c(Status status) {
        return (R) this.f21804o;
    }
}
