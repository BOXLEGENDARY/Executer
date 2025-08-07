package backtraceio.library.services;

import W0.JWp.kNUgEaOjcPdX;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceResult;

public class BacktraceHandlerThread extends HandlerThread {
    private static final transient String LOG_TAG = "BacktraceHandlerThread";
    private BacktraceHandler mHandler;
    private SummedEventsHandler mSummedEventsHandler;
    private UniqueEventsHandler mUniqueEventsHandler;
    private final String url;

    private class BacktraceHandler extends Handler {
        private final transient String LOG_TAG;
        String url;

        @Override
        public void handleMessage(Message message) throws Throwable {
            BacktraceResult backtraceResultSendReport;
            BacktraceHandlerInputReport backtraceHandlerInputReport = (BacktraceHandlerInputReport) message.obj;
            if (backtraceHandlerInputReport.requestHandler != null) {
                BacktraceLogger.d(this.LOG_TAG, "Sending using custom request handler");
                backtraceResultSendReport = backtraceHandlerInputReport.requestHandler.onRequest(backtraceHandlerInputReport.data);
            } else {
                BacktraceLogger.d(this.LOG_TAG, "Sending report using default request handler");
                backtraceResultSendReport = BacktraceReportSender.sendReport(this.url, BacktraceSerializeHelper.toJson(backtraceHandlerInputReport.data), backtraceHandlerInputReport.data.getAttachments(), backtraceHandlerInputReport.data.report, backtraceHandlerInputReport.serverErrorEventListener);
            }
            if (backtraceHandlerInputReport.serverResponseEventListener != null) {
                BacktraceLogger.d(this.LOG_TAG, kNUgEaOjcPdX.GoCyF);
                backtraceHandlerInputReport.serverResponseEventListener.onEvent(backtraceResultSendReport);
            }
        }

        private BacktraceHandler(Looper looper, String str) {
            super(looper);
            this.LOG_TAG = BacktraceHandler.class.getSimpleName();
            this.url = str;
        }
    }

    BacktraceHandlerThread(String str, String str2) {
        super(str);
        this.url = str2;
        start();
    }

    Message createMessage(BacktraceHandlerInput backtraceHandlerInput) {
        Message message = new Message();
        message.obj = backtraceHandlerInput;
        return message;
    }

    SummedEventsHandler createSummedEventsHandler(BacktraceMetrics backtraceMetrics, Api api) {
        SummedEventsHandler summedEventsHandler = new SummedEventsHandler(backtraceMetrics, api, this);
        this.mSummedEventsHandler = summedEventsHandler;
        return summedEventsHandler;
    }

    UniqueEventsHandler createUniqueEventsHandler(BacktraceMetrics backtraceMetrics, Api api) {
        UniqueEventsHandler uniqueEventsHandler = new UniqueEventsHandler(backtraceMetrics, api, this);
        this.mUniqueEventsHandler = uniqueEventsHandler;
        return uniqueEventsHandler;
    }

    @Override
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        if (this.mHandler == null) {
            this.mHandler = new BacktraceHandler(getLooper(), this.url);
        }
    }

    void sendReport(BacktraceHandlerInputReport backtraceHandlerInputReport) {
        if (this.mHandler == null) {
            this.mHandler = new BacktraceHandler(getLooper(), this.url);
        }
        this.mHandler.sendMessage(createMessage(backtraceHandlerInputReport));
    }

    void sendSummedEvents(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        this.mSummedEventsHandler.sendMessage(createMessage(backtraceHandlerInputEvents));
    }

    void sendUniqueEvents(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        this.mUniqueEventsHandler.sendMessage(createMessage(backtraceHandlerInputEvents));
    }
}
