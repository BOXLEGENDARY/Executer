package okio;

import S9.b;
import ha.n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.h;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", "a", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Call {
    public static final Object a(@NotNull okhttp3.Call call, @NotNull Continuation<? super Response> continuation) {
        n nVar = new n(b.b(continuation), 1);
        nVar.C();
        C0414l c0414l = new C0414l(call, nVar);
        call.enqueue(c0414l);
        nVar.g(c0414l);
        Object objZ = nVar.z();
        if (objZ == b.c()) {
            h.c(continuation);
        }
        return objZ;
    }
}
