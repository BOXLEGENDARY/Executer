package Y0;

import ha.H;
import ha.q0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, d2 = {"LY0/s;", "Lha/H;", "a", "(LY0/s;)Lha/H;", "b", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final H a(s sVar) {
        Map<String, Object> mapK = sVar.k();
        Object objB = mapK.get("QueryDispatcher");
        if (objB == null) {
            objB = q0.b(sVar.o());
            mapK.put("QueryDispatcher", objB);
        }
        Intrinsics.e(objB, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (H) objB;
    }

    public static final H b(s sVar) {
        Map<String, Object> mapK = sVar.k();
        Object objB = mapK.get("TransactionDispatcher");
        if (objB == null) {
            objB = q0.b(sVar.r());
            mapK.put("TransactionDispatcher", objB);
        }
        Intrinsics.e(objB, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (H) objB;
    }
}
