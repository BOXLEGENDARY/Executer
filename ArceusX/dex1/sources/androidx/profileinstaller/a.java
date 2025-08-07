package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

class a {

    private static class C0109a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z7 = true;
        for (File file2 : fileArrListFiles) {
            z7 = a(file2) && z7;
        }
        return z7;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(Build.VERSION.SDK_INT >= 34 ? b.a(context).getCacheDir() : C0109a.a(b.a(context)))) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
