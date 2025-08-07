package backtraceio.library.models.database;

import Q6.QtA.QXojhh;
import android.content.Context;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.FileHelper;
import backtraceio.library.interfaces.DatabaseRecordWriter;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.json.BacktraceReport;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class BacktraceDatabaseRecord {
    private static final transient String LOG_TAG = "BacktraceDatabaseRecord";
    transient DatabaseRecordWriter RecordWriter;
    private final transient String _path;

    @SerializedName("DataPath")
    private String diagnosticDataPath;

    @SerializedName("Id")
    public UUID id;
    public transient boolean locked;
    private transient BacktraceData record;

    @SerializedName("RecordName")
    private String recordPath;

    @SerializedName("ReportPath")
    private String reportPath;

    @SerializedName("Size")
    private long size;

    BacktraceDatabaseRecord() {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.id = uuidRandomUUID;
        this.locked = false;
        this._path = BuildConfig.FLAVOR;
        this.recordPath = String.format("%s-record.json", uuidRandomUUID);
        this.diagnosticDataPath = String.format("%s-attachment", this.id);
    }

    public static BacktraceDatabaseRecord readFromFile(File file) {
        String str = LOG_TAG;
        BacktraceLogger.d(str, "Reading JSON from passed file");
        String file2 = FileHelper.readFile(file);
        if (!BacktraceStringHelper.isNullOrEmpty(file2)) {
            return (BacktraceDatabaseRecord) BacktraceSerializeHelper.fromJson(file2, BacktraceDatabaseRecord.class);
        }
        BacktraceLogger.w(str, "JSON from passed file is null or empty");
        return null;
    }

    public boolean close() {
        String str = LOG_TAG;
        BacktraceLogger.d(str, "Trying unlock database record");
        try {
            this.locked = false;
            this.record = null;
            BacktraceLogger.d(str, "Record unlocked");
            return true;
        } catch (Exception unused) {
            BacktraceLogger.e(LOG_TAG, "Can not unlock record");
            return false;
        }
    }

    public void delete() {
        BacktraceLogger.d(LOG_TAG, "Trying delete files from database");
        delete(this.reportPath);
        delete(this.diagnosticDataPath);
        delete(this.recordPath);
    }

    public BacktraceData getBacktraceData(Context context) {
        BacktraceData backtraceData = this.record;
        if (backtraceData != null) {
            return backtraceData;
        }
        if (!valid()) {
            BacktraceLogger.w(LOG_TAG, "Database record is invalid");
            return null;
        }
        String file = FileHelper.readFile(new File(this.diagnosticDataPath));
        String file2 = FileHelper.readFile(new File(this.reportPath));
        try {
            BacktraceLogger.d(LOG_TAG, "Deserialization diagnostic data");
            BacktraceData backtraceData2 = (BacktraceData) BacktraceSerializeHelper.fromJson(file, BacktraceData.class);
            backtraceData2.report = (BacktraceReport) BacktraceSerializeHelper.fromJson(file2, BacktraceReport.class);
            backtraceData2.context = context;
            return backtraceData2;
        } catch (Exception e7) {
            BacktraceLogger.e(LOG_TAG, "Exception occurs on deserialization of diagnostic data", e7);
            return null;
        }
    }

    public String getDiagnosticDataPath() {
        return this.diagnosticDataPath;
    }

    public String getRecordPath() {
        return this.recordPath;
    }

    public String getReportPath() {
        return this.reportPath;
    }

    public long getSize() {
        return this.size;
    }

    public boolean save() {
        try {
            String str = LOG_TAG;
            BacktraceLogger.d(str, "Trying saving data to internal app storage");
            this.diagnosticDataPath = save(this.record, String.format("%s-attachment", this.id));
            this.reportPath = save(this.record.getReport(), String.format("%s-report", this.id));
            this.recordPath = new File(this._path, String.format("%s-record.json", this.id)).getAbsolutePath();
            this.size += BacktraceSerializeHelper.toJson(this).getBytes(StandardCharsets.UTF_8).length;
            this.RecordWriter.write(this, String.format("%s-record", this.id));
            BacktraceLogger.d(str, "Saving data to internal app storage successful");
            return true;
        } catch (Exception e7) {
            BacktraceLogger.e(LOG_TAG, JmBUOGMwkkxg.GCXI, e7);
            return false;
        }
    }

    public void setSize(long j7) {
        this.size = j7;
    }

    public boolean valid() {
        return FileHelper.isFileExists(this.diagnosticDataPath) && FileHelper.isFileExists(this.reportPath);
    }

    private void delete(String str) {
        try {
            if (FileHelper.isFileExists(str)) {
                BacktraceLogger.d(LOG_TAG, "Passed path exist, trying delete file on database record");
                new File(str).delete();
            }
        } catch (Exception e7) {
            BacktraceLogger.e(LOG_TAG, String.format(QXojhh.ITehRNfG, str), e7);
        }
    }

    public BacktraceDatabaseRecord(BacktraceData backtraceData, String str) {
        this.id = UUID.randomUUID();
        this.locked = false;
        this.id = UUID.fromString(backtraceData.uuid);
        this.record = backtraceData;
        this._path = str;
        this.RecordWriter = new BacktraceDatabaseRecordWriter(str);
    }

    private String save(Object obj, String str) {
        try {
            if (obj == null) {
                BacktraceLogger.w(LOG_TAG, "Passed data parameter is null");
                return BuildConfig.FLAVOR;
            }
            byte[] bytes = BacktraceSerializeHelper.toJson(obj).getBytes(StandardCharsets.UTF_8);
            this.size += bytes.length;
            return this.RecordWriter.write(bytes, str);
        } catch (Exception e7) {
            BacktraceLogger.e(LOG_TAG, "Received IOException while saving data to database", e7);
            return BuildConfig.FLAVOR;
        }
    }
}
