package L3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface b {
    ScheduledExecutorService a(int i7, ThreadFactory threadFactory, int i8);

    ExecutorService b(ThreadFactory threadFactory, int i7);
}
