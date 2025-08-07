package backtraceio.library.watchdog;

import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.json.BacktraceReport;
import java.util.HashMap;
import y1.a;

class BacktraceWatchdogShared {
    BacktraceWatchdogShared() {
    }

    static void sendReportCauseBlockedThread(a aVar, Thread thread, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, String str) {
        BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException = new BacktraceWatchdogTimeoutException();
        backtraceWatchdogTimeoutException.setStackTrace(thread.getStackTrace());
        BacktraceLogger.e(str, "Blocked thread detected, sending a report", backtraceWatchdogTimeoutException);
        if (onApplicationNotRespondingEvent != null) {
            onApplicationNotRespondingEvent.onEvent(backtraceWatchdogTimeoutException);
        } else if (aVar != null) {
            aVar.addBreadcrumb("ANR detected - thread is blocked");
            aVar.send(new BacktraceReport(backtraceWatchdogTimeoutException, new HashMap<String, Object>() {
                {
                    put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.AnrAttributeType);
                }
            }));
        }
    }
}
