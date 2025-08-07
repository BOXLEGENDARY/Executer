package D4;

import E4.r0;
import S9.Gvmm.CAqKeu;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Y {

    private static final r0 f925c = new r0("SplitInstallInfoProvider");

    public static final int f926d = 0;

    private final Context f927a;

    private final String f928b;

    Y(Context context) {
        this.f927a = context;
        this.f928b = context.getPackageName();
    }

    public static String b(String str) {
        return str.startsWith(vxbbqXNtzfMxs.bKtdPNymZiEPdu) ? BuildConfig.FLAVOR : str.split("\\.config\\.", 2)[0];
    }

    public static boolean e(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set f(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : h(packageInfo)) {
            if (!e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private final PackageInfo g() {
        try {
            return this.f927a.getPackageManager().getPackageInfo(this.f928b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f925c.b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    private static final Set h(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f925c.a(CAqKeu.SgXi, new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove(BuildConfig.FLAVOR);
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f925c.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f925c.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        W wA = X.a();
        if (wA != null) {
            hashSet.addAll(wA.zza());
        }
        return hashSet;
    }

    public final P a(Bundle bundle) throws Resources.NotFoundException {
        if (bundle == null) {
            f925c.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i7 = bundle.getInt("com.android.vending.splits");
        if (i7 == 0) {
            f925c.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            P pA = G.a(this.f927a.getResources().getXml(i7), new N());
            if (pA == null) {
                f925c.e("Can't parse languages metadata.", new Object[0]);
            }
            return pA;
        } catch (Resources.NotFoundException unused) {
            f925c.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set c() {
        PackageInfo packageInfoG = g();
        return (packageInfoG == null || packageInfoG.applicationInfo == null) ? new HashSet() : f(packageInfoG);
    }

    public final Set d() throws Resources.NotFoundException {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoG = g();
        HashSet hashSet = null;
        if (packageInfoG != null && (applicationInfo = packageInfoG.applicationInfo) != null) {
            P pA = a(applicationInfo.metaData);
            if (pA == null) {
                return null;
            }
            hashSet = new HashSet();
            Set setH = h(packageInfoG);
            setH.add(BuildConfig.FLAVOR);
            Set setF = f(packageInfoG);
            setF.add(BuildConfig.FLAVOR);
            for (Map.Entry entry : pA.a(setF).entrySet()) {
                if (setH.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
