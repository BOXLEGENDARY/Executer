package backtraceio.library.breadcrumbs;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import backtraceio.library.enums.BacktraceBreadcrumbLevel;
import backtraceio.library.enums.BacktraceBreadcrumbType;
import java.util.HashMap;

public class BacktraceComponentListener implements ComponentCallbacks2 {
    private final BacktraceBreadcrumbs backtraceBreadcrumbs;

    public BacktraceComponentListener(BacktraceBreadcrumbs backtraceBreadcrumbs) {
        this.backtraceBreadcrumbs = backtraceBreadcrumbs;
    }

    private BacktraceBreadcrumbLevel getMemoryWarningLevel(int i7) {
        if (i7 != 5 && i7 != 10) {
            if (i7 != 15) {
                if (i7 != 40) {
                    if (i7 != 60 && i7 != 80) {
                        return BacktraceBreadcrumbLevel.WARNING;
                    }
                }
            }
            return BacktraceBreadcrumbLevel.FATAL;
        }
        return BacktraceBreadcrumbLevel.ERROR;
    }

    private String getMemoryWarningString(int i7) {
        return i7 != 5 ? i7 != 10 ? i7 != 15 ? i7 != 20 ? i7 != 40 ? i7 != 60 ? i7 != 80 ? "Generic memory warning" : "TRIM MEMORY COMPLETE" : "TRIM MEMORY MODERATE" : "TRIM MEMORY BACKGROUND" : "TRIM MEMORY UI HIDDEN" : "TRIM MEMORY RUNNING CRITICAL" : "TRIM MEMORY RUNNING LOW" : "TRIM MEMORY RUNNING MODERATE";
    }

    private String stringifyOrientation(int i7) {
        return i7 != 1 ? i7 != 2 ? "unknown orientation" : "landscape" : "portrait";
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        HashMap map = new HashMap();
        map.put("orientation", stringifyOrientation(configuration.orientation));
        this.backtraceBreadcrumbs.addBreadcrumb("Configuration changed", map, BacktraceBreadcrumbType.SYSTEM, BacktraceBreadcrumbLevel.INFO);
    }

    @Override
    public void onLowMemory() {
        this.backtraceBreadcrumbs.addBreadcrumb("Critical low memory warning!", BacktraceBreadcrumbType.SYSTEM, BacktraceBreadcrumbLevel.FATAL);
    }

    @Override
    public void onTrimMemory(int i7) {
        this.backtraceBreadcrumbs.addBreadcrumb(getMemoryWarningString(i7), BacktraceBreadcrumbType.SYSTEM, getMemoryWarningLevel(i7));
    }
}
