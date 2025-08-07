package backtraceio.library.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.appcompat.app.FN.krlBPZZeK;
import backtraceio.library.logger.BacktraceLogger;

public class ApplicationMetadataCache {
    private static final transient String LOG_TAG = "ApplicationMetadataCache";
    private static volatile ApplicationMetadataCache instance;
    private String applicationName;
    private String applicationVersion;
    private final Context context;
    private String packageName;

    private ApplicationMetadataCache(Context context) {
        this.context = context;
    }

    public static ApplicationMetadataCache getInstance(Context context) {
        if (instance == null) {
            synchronized (ApplicationMetadataCache.class) {
                try {
                    if (instance == null) {
                        instance = new ApplicationMetadataCache(context);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public String getApplicationName() {
        if (!BacktraceStringHelper.isNullOrEmpty(this.applicationName)) {
            return this.applicationName;
        }
        String string = this.context.getApplicationInfo().loadLabel(this.context.getPackageManager()).toString();
        this.applicationName = string;
        return string;
    }

    public String getApplicationVersion() throws PackageManager.NameNotFoundException {
        if (!BacktraceStringHelper.isNullOrEmpty(this.applicationVersion)) {
            return this.applicationVersion;
        }
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            String strValueOf = BacktraceStringHelper.isNullOrEmpty(packageInfo.versionName) ? String.valueOf(packageInfo.versionCode) : packageInfo.versionName;
            this.applicationVersion = strValueOf;
            return strValueOf;
        } catch (PackageManager.NameNotFoundException e7) {
            BacktraceLogger.e(LOG_TAG, "Could not resolve application version", e7);
            return krlBPZZeK.Flo;
        }
    }

    public String getPackageName() {
        if (!BacktraceStringHelper.isNullOrEmpty(this.packageName)) {
            return this.packageName;
        }
        String packageName = this.context.getApplicationContext().getPackageName();
        this.packageName = packageName;
        return packageName;
    }
}
