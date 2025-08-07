package backtraceio.library.watchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import backtraceio.library.logger.BacktraceLogger;
import g1.kQwt.YGBtcyQ;
import java.util.Calendar;
import y1.a;

public class BacktraceANRWatchdog extends Thread {
    private static final transient int DEFAULT_ANR_TIMEOUT = 5000;
    private static final transient String LOG_TAG = "BacktraceANRWatchdog";
    private final a backtraceClient;
    private final boolean debug;
    private final Handler mainThreadHandler;
    private OnApplicationNotRespondingEvent onApplicationNotRespondingEvent;
    private volatile boolean shouldStop;
    private final int timeout;

    public BacktraceANRWatchdog(a aVar) {
        this(aVar, DEFAULT_ANR_TIMEOUT);
    }

    @Override
    public void run() throws InterruptedException {
        if (this.debug && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
            BacktraceLogger.w(LOG_TAG, YGBtcyQ.PvWzibZtsjz);
            return;
        }
        Boolean bool = Boolean.FALSE;
        while (!this.shouldStop && !isInterrupted()) {
            String string = Calendar.getInstance().getTime().toString();
            String str = LOG_TAG;
            BacktraceLogger.d(str, "ANR WATCHDOG - " + string);
            final BacktraceThreadWatcher backtraceThreadWatcher = new BacktraceThreadWatcher(0, 0);
            this.mainThreadHandler.post(new Runnable() {
                @Override
                public void run() {
                    backtraceThreadWatcher.tickCounter();
                }
            });
            try {
                Thread.sleep(this.timeout);
                backtraceThreadWatcher.tickPrivateCounter();
                if (backtraceThreadWatcher.getCounter() == backtraceThreadWatcher.getPrivateCounter()) {
                    bool = Boolean.FALSE;
                    BacktraceLogger.d(str, "ANR is not detected");
                } else if (!bool.booleanValue()) {
                    bool = Boolean.TRUE;
                    BacktraceWatchdogShared.sendReportCauseBlockedThread(this.backtraceClient, Looper.getMainLooper().getThread(), this.onApplicationNotRespondingEvent, str);
                }
            } catch (InterruptedException e7) {
                BacktraceLogger.e(LOG_TAG, "Thread is interrupted", e7);
                return;
            }
        }
    }

    public void setOnApplicationNotRespondingEvent(OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        this.onApplicationNotRespondingEvent = onApplicationNotRespondingEvent;
    }

    public void stopMonitoringAnr() {
        BacktraceLogger.d(LOG_TAG, "Stop monitoring ANR");
        this.shouldStop = true;
    }

    public BacktraceANRWatchdog(a aVar, int i7) {
        this(aVar, i7, false);
    }

    public BacktraceANRWatchdog(a aVar, int i7, boolean z7) {
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        this.shouldStop = false;
        BacktraceLogger.d(LOG_TAG, "Start monitoring ANR");
        this.backtraceClient = aVar;
        this.timeout = i7;
        this.debug = z7;
        start();
    }
}
