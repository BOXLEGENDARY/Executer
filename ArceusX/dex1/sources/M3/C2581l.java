package m3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import l3.AbstractC2532g;
import l3.InterfaceC2540o;

public class C2581l extends BasePendingResult<Status> {
    public C2581l(AbstractC2532g abstractC2532g) {
        super(abstractC2532g);
    }

    @Override
    protected final InterfaceC2540o c(Status status) {
        return status;
    }
}
