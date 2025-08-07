package backtraceio.library.breadcrumbs;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import backtraceio.library.enums.BacktraceBreadcrumbType;

public class BacktraceActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final BacktraceBreadcrumbs backtraceBreadcrumbs;

    public BacktraceActivityLifecycleListener(BacktraceBreadcrumbs backtraceBreadcrumbs) {
        this.backtraceBreadcrumbs = backtraceBreadcrumbs;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityCreated()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityDestroyed()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override
    public void onActivityPaused(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityPaused()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override
    public void onActivityResumed(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityResumed()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivitySaveInstanceState()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override
    public void onActivityStarted(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityStarted()", BacktraceBreadcrumbType.SYSTEM);
    }

    @Override
    public void onActivityStopped(Activity activity) {
        this.backtraceBreadcrumbs.addBreadcrumb(activity.getLocalClassName() + " onActivityStopped()", BacktraceBreadcrumbType.SYSTEM);
    }
}
