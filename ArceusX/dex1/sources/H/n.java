package H;

import C.S0;
import C.X;
import java.util.concurrent.Executor;

public interface n extends S0 {

    public static final X.a<Executor> f1525H = X.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor V(Executor executor) {
        return (Executor) a(f1525H, executor);
    }
}
