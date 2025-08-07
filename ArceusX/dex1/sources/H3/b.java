package H3;

import a4.C1574k;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC1808h;
import com.google.android.gms.tasks.Task;
import g3.AbstractC2461b;
import m3.InterfaceC2578i;

public final class b extends AbstractC2461b {
    public b(Context context) {
        super(context);
    }

    @Override
    public final Task<Void> E() {
        return t(AbstractC1808h.a().b(new InterfaceC2578i() {
            @Override
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((f) ((i) obj).D()).V0(new k(this.f1577a, (C1574k) obj2));
            }
        }).d(c.f1573c).e(1567).a());
    }
}
