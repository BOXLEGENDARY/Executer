package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.github.luben.zstd.BuildConfig;
import f6.ck.ZJZXBWla;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public class f {

    private static final c f11469a = new a();

    static final c f11470b = new b();

    class a implements c {
        a() {
        }

        @Override
        public void a(int i7, Object obj) {
        }

        @Override
        public void b(int i7, Object obj) {
        }
    }

    class b implements c {
        b() {
        }

        @Override
        public void a(int i7, Object obj) {
            Log.d("ProfileInstaller", i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? BuildConfig.FLAVOR : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : ZJZXBWla.pZh : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override
        public void b(int i7, Object obj) {
            String str;
            switch (i7) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = BuildConfig.FLAVOR;
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i7 == 6 || i7 == 7 || i7 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    public interface c {
        void a(int i7, Object obj);

        void b(int i7, Object obj);
    }

    static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static void c(Context context, Executor executor, c cVar) {
        b(context.getFilesDir());
        g(executor, cVar, 11, null);
    }

    static boolean d(PackageInfo packageInfo, File file, c cVar) throws IOException {
        File file2 = new File(file, KwdswzaUHE.SaMIyvfn);
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j7 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z7 = j7 == packageInfo.lastUpdateTime;
                if (z7) {
                    cVar.b(2, null);
                }
                return z7;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    static void f(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    static void g(Executor executor, final c cVar, final int i7, final Object obj) {
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                cVar.b(i7, obj);
            }
        });
    }

    private static boolean h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) throws IOException {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zN = bVar.i().m().n();
        if (zN) {
            f(packageInfo, file);
        }
        return zN;
    }

    public static void i(Context context) throws PackageManager.NameNotFoundException {
        j(context, new W0.b(), f11469a);
    }

    public static void j(Context context, Executor executor, c cVar) throws PackageManager.NameNotFoundException {
        k(context, executor, cVar, false);
    }

    static void k(Context context, Executor executor, c cVar, boolean z7) throws PackageManager.NameNotFoundException {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z8 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z7 && d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                h.c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z7) {
                z8 = true;
            }
            h.c(context, z8);
        } catch (PackageManager.NameNotFoundException e7) {
            cVar.b(7, e7);
            h.c(context, false);
        }
    }

    static void l(Context context, Executor executor, c cVar) throws PackageManager.NameNotFoundException, IOException {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e7) {
            g(executor, cVar, 7, e7);
        }
    }
}
