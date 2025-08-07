package w3;

import android.os.Process;

final class RunnableC2970c implements Runnable {

    private final Runnable f24274d;

    public RunnableC2970c(Runnable runnable, int i7) {
        this.f24274d = runnable;
    }

    @Override
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f24274d.run();
    }
}
