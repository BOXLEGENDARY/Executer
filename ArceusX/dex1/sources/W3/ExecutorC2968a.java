package w3;

import J3.i;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class ExecutorC2968a implements Executor {

    private final Handler f24271d;

    public ExecutorC2968a(Looper looper) {
        this.f24271d = new i(looper);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f24271d.post(runnable);
    }
}
