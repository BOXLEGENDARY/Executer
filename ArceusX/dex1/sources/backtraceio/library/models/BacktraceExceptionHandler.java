package backtraceio.library.models;

import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.logger.BacktraceLogger;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class BacktraceExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final String LOG_TAG = "BacktraceExceptionHandler";
    private static final Map<String, Object> customAttributes = new HashMap<String, Object>() {
        {
            put(BacktraceAttributeConsts.ErrorType, BacktraceAttributeConsts.UnhandledExceptionAttributeType);
        }
    };
    private final y1.a client;
    private final Thread.UncaughtExceptionHandler rootHandler;
    private final CountDownLatch signal = new CountDownLatch(1);

    private BacktraceExceptionHandler(y1.a aVar) {
        BacktraceLogger.d(LOG_TAG, "BacktraceExceptionHandler initialization");
        this.client = aVar;
        this.rootHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void enable(y1.a aVar) {
        new BacktraceExceptionHandler(aVar);
    }

    private OnServerResponseEventListener getCallbackToDefaultHandler(final Thread thread, final Throwable th) {
        return new OnServerResponseEventListener() {
            @Override
            public final void onEvent(BacktraceResult backtraceResult) {
                this.f12670a.lambda$getCallbackToDefaultHandler$0(thread, th, backtraceResult);
            }
        };
    }

    public void lambda$getCallbackToDefaultHandler$0(Thread thread, Throwable th, BacktraceResult backtraceResult) {
        BacktraceLogger.d(LOG_TAG, "Root handler event callback");
        this.rootHandler.uncaughtException(thread, th);
        this.signal.countDown();
    }

    public static void setCustomAttributes(Map<String, Object> map) {
        customAttributes.putAll(map);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        OnServerResponseEventListener callbackToDefaultHandler = getCallbackToDefaultHandler(thread, th);
        String str = LOG_TAG;
        BacktraceLogger.e(str, "Sending uncaught exception to Backtrace API", th);
        this.client.e(th, customAttributes, callbackToDefaultHandler);
        BacktraceLogger.d(str, "Uncaught exception sent to Backtrace API");
        try {
            BacktraceLogger.d(str, "Default uncaught exception handler");
            this.signal.await();
        } catch (Exception e7) {
            BacktraceLogger.e(LOG_TAG, "Exception during waiting for response", e7);
        }
    }
}
