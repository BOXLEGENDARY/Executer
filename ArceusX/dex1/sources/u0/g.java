package u0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class g {

    private static class a implements Executor {

        private final Handler f23889d;

        a(Handler handler) {
            this.f23889d = (Handler) x0.g.g(handler);
        }

        @Override
        public void execute(Runnable runnable) {
            if (this.f23889d.post((Runnable) x0.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f23889d + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
