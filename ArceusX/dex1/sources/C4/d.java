package C4;

import java.util.concurrent.ThreadFactory;

final class d implements ThreadFactory {
    d() {
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
