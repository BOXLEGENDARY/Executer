package backtraceio.library.models;

import backtraceio.library.services.BacktraceMetrics;
import y1.b;

public class BacktraceMetricsSettings {
    private final String baseUrl;
    private final int timeBetweenRetriesMillis;
    private final long timeIntervalMillis;
    private final String token;
    private final String universe;

    public BacktraceMetricsSettings(b bVar) {
        this(bVar, BacktraceMetrics.defaultBaseUrl, BacktraceMetrics.defaultTimeIntervalMs, 10000);
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getSubmissionUrl(String str) {
        return getBaseUrl() + "/" + str + "/submit?token=" + getToken() + "&universe=" + getUniverseName();
    }

    public int getTimeBetweenRetriesMillis() {
        return this.timeBetweenRetriesMillis;
    }

    public long getTimeIntervalMillis() {
        return this.timeIntervalMillis;
    }

    public String getToken() {
        return this.token;
    }

    public String getUniverseName() {
        return this.universe;
    }

    public boolean isBacktraceServer() {
        return getUniverseName() != null;
    }

    public BacktraceMetricsSettings(b bVar, String str) {
        this(bVar, str, BacktraceMetrics.defaultTimeIntervalMs, 10000);
    }

    public BacktraceMetricsSettings(b bVar, long j7) {
        this(bVar, BacktraceMetrics.defaultBaseUrl, j7, 10000);
    }

    public BacktraceMetricsSettings(b bVar, String str, long j7) {
        this(bVar, str, j7, 10000);
    }

    public BacktraceMetricsSettings(b bVar, String str, long j7, int i7) {
        this.universe = bVar.g();
        this.token = bVar.e();
        this.baseUrl = str;
        this.timeIntervalMillis = j7;
        this.timeBetweenRetriesMillis = i7;
    }
}
