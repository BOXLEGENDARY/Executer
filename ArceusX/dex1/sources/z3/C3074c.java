package z3;

import android.os.Process;

final class C3074c extends Thread {
    C3074c(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
