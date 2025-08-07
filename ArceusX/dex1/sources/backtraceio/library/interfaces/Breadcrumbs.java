package backtraceio.library.interfaces;

import android.content.Context;
import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import backtraceio.library.events.OnSuccessfulBreadcrumbAddEventListener;
import backtraceio.library.models.json.BacktraceReport;
import java.util.EnumSet;
import java.util.Map;

public interface Breadcrumbs {
    boolean addBreadcrumb(String str);

    boolean addBreadcrumb(String str, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel);

    boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType);

    boolean addBreadcrumb(String str, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel);

    boolean addBreadcrumb(String str, Map<String, Object> map);

    boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel);

    boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType);

    boolean addBreadcrumb(String str, Map<String, Object> map, BacktraceBreadcrumbType backtraceBreadcrumbType, BacktraceBreadcrumbLevel backtraceBreadcrumbLevel);

    boolean clearBreadcrumbs();

    boolean enableBreadcrumbs(Context context);

    boolean enableBreadcrumbs(Context context, int i7);

    boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet);

    boolean enableBreadcrumbs(Context context, EnumSet<BacktraceBreadcrumbType> enumSet, int i7);

    String getBreadcrumbLogPath();

    long getCurrentBreadcrumbId();

    EnumSet<BacktraceBreadcrumbType> getEnabledBreadcrumbTypes();

    boolean isEnabled();

    void processReportBreadcrumbs(BacktraceReport backtraceReport);

    void setCurrentBreadcrumbId(long j7);

    void setOnSuccessfulBreadcrumbAddEventListener(OnSuccessfulBreadcrumbAddEventListener onSuccessfulBreadcrumbAddEventListener);
}
