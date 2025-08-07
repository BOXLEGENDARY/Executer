package backtraceio.library.models;

import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.types.BacktraceResultStatus;
import com.google.gson.annotations.SerializedName;

public class BacktraceResult {
    private BacktraceReport backtraceReport;
    public String message;

    @SerializedName("_rxid")
    public String rxId;
    public BacktraceResultStatus status;

    public BacktraceResult() {
        this.status = BacktraceResultStatus.Ok;
    }

    public static BacktraceResult OnError(BacktraceReport backtraceReport, Exception exc) {
        return new BacktraceResult(backtraceReport, exc.getMessage(), BacktraceResultStatus.ServerError);
    }

    public BacktraceReport getBacktraceReport() {
        return this.backtraceReport;
    }

    public void setBacktraceReport(BacktraceReport backtraceReport) {
        this.backtraceReport = backtraceReport;
    }

    public BacktraceResult(BacktraceReport backtraceReport, String str, BacktraceResultStatus backtraceResultStatus) {
        this.status = BacktraceResultStatus.Ok;
        setBacktraceReport(backtraceReport);
        this.message = str;
        this.status = backtraceResultStatus;
    }
}
