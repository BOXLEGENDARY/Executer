package ha;

import com.google.gson.f;
import com.roblox.client.a0;
import ha.C2697c;
import q6.InterfaceC2737a;

public class C2702h implements InterfaceC2700f {
    @Override
    public AsyncTaskC2699e a(String str, InterfaceC2737a interfaceC2737a, C2697c.a[] aVarArr, InterfaceC2706l interfaceC2706l) {
        return new AsyncTaskC2699e(str, new f().t(interfaceC2737a), a0.O(), interfaceC2706l, aVarArr);
    }

    @Override
    public AsyncTaskC2698d b(String str, C2697c.a[] aVarArr, InterfaceC2706l interfaceC2706l) {
        return new AsyncTaskC2698d(str, interfaceC2706l, aVarArr);
    }
}
