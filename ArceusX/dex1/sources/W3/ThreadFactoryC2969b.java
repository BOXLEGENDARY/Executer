package w3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import n3.C2651i;

public class ThreadFactoryC2969b implements ThreadFactory {

    private final String f24272a;

    private final ThreadFactory f24273b = Executors.defaultThreadFactory();

    public ThreadFactoryC2969b(String str) {
        C2651i.m(str, "Name must not be null");
        this.f24272a = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f24273b.newThread(new RunnableC2970c(runnable, 0));
        threadNewThread.setName(this.f24272a);
        return threadNewThread;
    }
}
