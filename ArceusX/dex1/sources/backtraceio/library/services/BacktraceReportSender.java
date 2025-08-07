package backtraceio.library.services;

import Q6.QtA.QXojhh;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.MultiFormRequestHelper;
import backtraceio.library.common.RequestHelper;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.http.HttpHelper;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.models.types.HttpException;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import t2.Dbl.hgESaf;

class BacktraceReportSender {
    private static final int CHUNK_SIZE = 131072;
    private static final String LOG_TAG = "BacktraceReportSender";

    BacktraceReportSender() {
    }

    public static EventsResult sendEvents(String str, String str2, EventsPayload eventsPayload, OnServerErrorEventListener onServerErrorEventListener) throws Throwable {
        EventsResult eventsResultOnError;
        HttpURLConnection httpURLConnection;
        String str3;
        HttpURLConnection httpURLConnection2 = null;
        int responseCode = -1;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e7) {
                e = e7;
            }
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Content-Type", RequestHelper.getContentType());
                str3 = LOG_TAG;
                BacktraceLogger.d(str3, "HttpURLConnection successfully initialized");
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                RequestHelper.addJson(dataOutputStream, str2);
                RequestHelper.addEndOfRequest(dataOutputStream);
                dataOutputStream.flush();
                dataOutputStream.close();
                responseCode = httpURLConnection.getResponseCode();
                BacktraceLogger.d(str3, "Received response status from Backtrace API for HTTP request is: " + responseCode);
            } catch (Exception e8) {
                e = e8;
                httpURLConnection2 = httpURLConnection;
                if (onServerErrorEventListener != null) {
                    BacktraceLogger.d(LOG_TAG, "Custom handler on server error");
                    onServerErrorEventListener.onEvent(e);
                }
                String str4 = LOG_TAG;
                BacktraceLogger.e(str4, "Sending HTTP request failed to Backtrace API", e);
                BacktraceLogger.e(str4, "Failed HTTP request URL " + str);
                eventsResultOnError = EventsResult.OnError(eventsPayload, e, -1);
                if (httpURLConnection2 == null) {
                    return eventsResultOnError;
                }
                httpURLConnection2.disconnect();
                BacktraceLogger.d(str4, "Disconnecting HttpUrlConnection successful");
                return eventsResultOnError;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                        BacktraceLogger.d(LOG_TAG, "Disconnecting HttpUrlConnection successful");
                    } catch (Exception e9) {
                        BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e9);
                        EventsResult.OnError(eventsPayload, e9, -1);
                    }
                }
                throw th;
            }
            if (responseCode == 200) {
                eventsResultOnError = new EventsResult(eventsPayload, httpURLConnection.getResponseMessage(), BacktraceResultStatus.Ok, responseCode);
                httpURLConnection.disconnect();
                BacktraceLogger.d(str3, "Disconnecting HttpUrlConnection successful");
                return eventsResultOnError;
            }
            String responseMessage = HttpHelper.getResponseMessage(httpURLConnection);
            if (BacktraceStringHelper.isNullOrEmpty(responseMessage)) {
                responseMessage = httpURLConnection.getResponseMessage();
            }
            throw new HttpException(Integer.valueOf(responseCode), String.format("%s: %s", Integer.valueOf(responseCode), responseMessage));
        } catch (Exception e10) {
            BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e10);
            return EventsResult.OnError(eventsPayload, e10, responseCode);
        }
    }

    static BacktraceResult sendReport(String str, String str2, List<String> list, BacktraceReport backtraceReport, OnServerErrorEventListener onServerErrorEventListener) throws Throwable {
        BacktraceResult backtraceResultOnError;
        HttpURLConnection httpURLConnection;
        String str3;
        int responseCode;
        String str4 = hgESaf.ODcWPbA;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (Exception e7) {
                    BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e7);
                    return BacktraceResult.OnError(backtraceReport, e7);
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setChunkedStreamingMode(CHUNK_SIZE);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty(QXojhh.gHUwsByuJ, "no-cache");
            httpURLConnection.setRequestProperty("Content-Type", MultiFormRequestHelper.getContentType());
            str3 = LOG_TAG;
            BacktraceLogger.d(str3, "HttpURLConnection successfully initialized");
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            MultiFormRequestHelper.addJson(dataOutputStream, str2);
            MultiFormRequestHelper.addFiles(dataOutputStream, list);
            MultiFormRequestHelper.addEndOfRequest(dataOutputStream);
            dataOutputStream.flush();
            dataOutputStream.close();
            responseCode = httpURLConnection.getResponseCode();
            BacktraceLogger.d(str3, "Received response status from Backtrace API for HTTP request is: " + responseCode);
        } catch (Exception e9) {
            e = e9;
            httpURLConnection2 = httpURLConnection;
            if (onServerErrorEventListener != null) {
                BacktraceLogger.d(LOG_TAG, "Custom handler on server error");
                onServerErrorEventListener.onEvent(e);
            }
            String str5 = LOG_TAG;
            BacktraceLogger.e(str5, "Sending HTTP request failed to Backtrace API", e);
            backtraceResultOnError = BacktraceResult.OnError(backtraceReport, e);
            if (httpURLConnection2 == null) {
                return backtraceResultOnError;
            }
            httpURLConnection2.disconnect();
            BacktraceLogger.d(str5, str4);
            return backtraceResultOnError;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                try {
                    httpURLConnection2.disconnect();
                    BacktraceLogger.d(LOG_TAG, str4);
                } catch (Exception e10) {
                    BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e10);
                    BacktraceResult.OnError(backtraceReport, e10);
                }
            }
            throw th;
        }
        if (responseCode != 200) {
            String responseMessage = HttpHelper.getResponseMessage(httpURLConnection);
            if (BacktraceStringHelper.isNullOrEmpty(responseMessage)) {
                responseMessage = httpURLConnection.getResponseMessage();
            }
            throw new HttpException(Integer.valueOf(responseCode), String.format("%s: %s", Integer.valueOf(responseCode), responseMessage));
        }
        backtraceResultOnError = (BacktraceResult) BacktraceSerializeHelper.fromJson(HttpHelper.getResponseMessage(httpURLConnection), BacktraceResult.class);
        backtraceResultOnError.setBacktraceReport(backtraceReport);
        httpURLConnection.disconnect();
        BacktraceLogger.d(str3, str4);
        return backtraceResultOnError;
    }
}
