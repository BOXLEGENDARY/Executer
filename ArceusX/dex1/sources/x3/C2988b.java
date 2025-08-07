package x3;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import v3.m;
import x0.C2986c;

public class C2988b {

    protected final Context f24324a;

    public C2988b(Context context) {
        this.f24324a = context;
    }

    public int a(String str) {
        return this.f24324a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    public int b(String str, String str2) {
        return this.f24324a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo c(String str, int i7) throws PackageManager.NameNotFoundException {
        return this.f24324a.getPackageManager().getApplicationInfo(str, i7);
    }

    public CharSequence d(String str) throws PackageManager.NameNotFoundException {
        Context context = this.f24324a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    public C2986c<CharSequence, Drawable> e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f24324a.getPackageManager().getApplicationInfo(str, 0);
        return C2986c.a(this.f24324a.getPackageManager().getApplicationLabel(applicationInfo), this.f24324a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo f(String str, int i7) throws PackageManager.NameNotFoundException {
        return this.f24324a.getPackageManager().getPackageInfo(str, i7);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2987a.a(this.f24324a);
        }
        if (!m.i() || (nameForUid = this.f24324a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f24324a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean h(int i7, String str) {
        if (m.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f24324a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i7, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f24324a.getPackageManager().getPackagesForUid(i7);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
