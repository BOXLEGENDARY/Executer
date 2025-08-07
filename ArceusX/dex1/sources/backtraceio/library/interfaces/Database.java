package backtraceio.library.interfaces;

import backtraceio.library.base.BacktraceBase;
import backtraceio.library.enums.UnwindingMode;
import backtraceio.library.models.database.BacktraceDatabaseRecord;
import backtraceio.library.models.database.BacktraceDatabaseSettings;
import backtraceio.library.models.json.BacktraceReport;
import java.util.Map;
import y1.b;

public interface Database {
    BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map);

    BacktraceDatabaseRecord add(BacktraceReport backtraceReport, Map<String, Object> map, boolean z7);

    Boolean addNativeAttribute(String str, Object obj);

    void clear();

    void delete(BacktraceDatabaseRecord backtraceDatabaseRecord);

    void disableNativeIntegration();

    void flush();

    Iterable<BacktraceDatabaseRecord> get();

    Breadcrumbs getBreadcrumbs();

    long getDatabaseSize();

    BacktraceDatabaseSettings getSettings();

    void setApi(Api api);

    Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar);

    Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z7);

    Boolean setupNativeIntegration(BacktraceBase backtraceBase, b bVar, boolean z7, UnwindingMode unwindingMode);

    void start();

    boolean validConsistency();
}
