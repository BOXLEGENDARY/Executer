package l3;

import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;
import l3.InterfaceC2540o;

public abstract class AbstractC2535j<R extends InterfaceC2540o> {

    public interface a {
        void a(Status status);
    }

    public abstract void a(a aVar);

    @ResultIgnorabilityUnspecified
    public abstract R b(long j7, TimeUnit timeUnit);
}
