package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.e;
import x0.C2985b;

public final class d {
    public static int a(Context context, String str, int i7, int i8, String str2) {
        if (context.checkPermission(str, i7, i8) == -1) {
            return -1;
        }
        String strC = e.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i8);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i8 || !C2985b.a(context.getPackageName(), str2)) ? e.b(context, strC, str2) : e.a(context, i8, strC, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
