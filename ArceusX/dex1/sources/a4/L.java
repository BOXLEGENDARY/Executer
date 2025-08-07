package a4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class L implements Executor {

    private final Handler f8306d = new T3.a(Looper.getMainLooper());

    @Override
    public final void execute(Runnable runnable) {
        this.f8306d.post(runnable);
    }
}
