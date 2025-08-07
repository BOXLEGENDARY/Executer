package com.roblox.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import j0.tkB.pkcpMQSgx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class C2368p {

    public static final String[] f20150g = {"libroblox.so", "libtrampoline.so"};

    private AtomicBoolean f20151a;

    private SharedPreferences f20152b;

    private int f20153c;

    private String f20154d;

    private r f20155e;

    private b f20156f;

    private static class a extends AsyncTask<String[], Integer, String> {

        private String f20157a;

        private String f20158b;

        private C2368p f20159c;

        a(String str, String str2, C2368p c2368p) {
            this.f20157a = str;
            this.f20158b = str2;
            this.f20159c = c2368p;
        }

        @Override
        public String doInBackground(String[]... strArr) throws Throwable {
            InputStream inputStream;
            FileOutputStream fileOutputStream;
            ArrayList arrayList = new ArrayList(Arrays.asList(strArr[0]));
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            File file = new File(this.f20158b);
            FileOutputStream fileOutputStream2 = null;
            if (!file.exists()) {
                this.f20159c.f20155e = r.ERROR_APK_FILE_NOT_FOUND;
                return null;
            }
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                byte[] bArr = new byte[32768];
                while (enumerationEntries.hasMoreElements() && !arrayList.isEmpty()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (zipEntryNextElement.getName().contains(str)) {
                            File file2 = new File(this.f20157a + "/" + str);
                            if (file2.exists()) {
                                file2.delete();
                            }
                            try {
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    inputStream = zipFile.getInputStream(zipEntryNextElement);
                                    while (true) {
                                        try {
                                            try {
                                                int i7 = inputStream.read(bArr);
                                                if (i7 > 0) {
                                                    fileOutputStream.write(bArr, 0, i7);
                                                } else {
                                                    try {
                                                        break;
                                                    } catch (IOException e7) {
                                                        h7.l.d("CrashLibFileHelper", e7.getMessage());
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                fileOutputStream2 = fileOutputStream;
                                                if (fileOutputStream2 != null) {
                                                    try {
                                                        fileOutputStream2.close();
                                                    } catch (IOException e8) {
                                                        h7.l.d("CrashLibFileHelper", e8.getMessage());
                                                    }
                                                }
                                                if (inputStream == null) {
                                                    throw th;
                                                }
                                                try {
                                                    inputStream.close();
                                                    throw th;
                                                } catch (IOException e9) {
                                                    h7.l.d("CrashLibFileHelper", e9.getMessage());
                                                    throw th;
                                                }
                                            }
                                        } catch (IOException e10) {
                                            e = e10;
                                            h7.l.d("CrashLibFileHelper", e.getMessage());
                                            this.f20159c.f20155e = r.ERROR_COPYING_FILE_TO_CACHE;
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException e11) {
                                                    h7.l.d("CrashLibFileHelper", e11.getMessage());
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (IOException e12) {
                                                    h7.l.d("CrashLibFileHelper", e12.getMessage());
                                                }
                                            }
                                        }
                                    }
                                    fileOutputStream.close();
                                    try {
                                        inputStream.close();
                                    } catch (IOException e13) {
                                        h7.l.d("CrashLibFileHelper", e13.getMessage());
                                    }
                                    it.remove();
                                } catch (IOException e14) {
                                    e = e14;
                                    inputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = null;
                                }
                            } catch (IOException e15) {
                                e = e15;
                                fileOutputStream = null;
                                inputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f20159c.f20155e = r.ERROR_SO_FILE_MISSING;
                    return null;
                }
                h7.l.a("CrashLibFileHelper", "Copy duration : " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                this.f20159c.j();
                return this.f20157a;
            } catch (IOException unused) {
                this.f20159c.f20155e = r.ERROR_APK_ZIP_FILE_CANT_OPEN;
                return null;
            }
        }

        @Override
        public void onPostExecute(String str) {
            this.f20159c.k(str);
            synchronized (C2368p.class) {
                try {
                    if (this.f20159c.f20156f != null) {
                        this.f20159c.f20156f.a(str, this.f20159c.f20155e);
                    }
                    this.f20159c.f20156f = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        void a(String str, r rVar);
    }

    private static class c {

        private static final C2368p f20160a = new C2368p();
    }

    private static String g(String[] strArr) {
        String[] strArr2 = Build.SUPPORTED_ABIS;
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr[i7];
            if (str != null) {
                for (String str2 : strArr2) {
                    if (str.contains(str2) || str.contains(str2.replace("-", "_"))) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static void h(b bVar) {
        synchronized (C2368p.class) {
            try {
                C2368p c2368p = c.f20160a;
                String str = c2368p.f20154d;
                if (str == null && c2368p.f20155e == null) {
                    c2368p.f20156f = bVar;
                } else {
                    bVar.a(str, c2368p.f20155e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(Context context, String[] strArr, String str) throws RuntimeException {
        String strG;
        C2368p c2368p = c.f20160a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo.nativeLibraryDir != null) {
            String[] strArr2 = f20150g;
            if (strArr2.length > 0) {
                for (String str2 : strArr2) {
                    if (!new File(applicationInfo.nativeLibraryDir + "/" + str2).exists()) {
                        h7.l.d("CrashLibFileHelper", "Failed to find the library: " + str2 + " in nativeLibraryDir");
                    }
                }
                h7.l.g("CrashLibFileHelper", "All library files exist, using nativeLibraryDir");
                c2368p.k(applicationInfo.nativeLibraryDir);
                return;
            }
        }
        String[] strArr3 = applicationInfo.splitSourceDirs;
        if (strArr3 == null || (strG = g(strArr3)) == null) {
            h7.l.a("CrashLibFileHelper", "Use the native lib path.");
            c2368p.k(applicationInfo.nativeLibraryDir);
        } else {
            if (c2368p.f20151a.getAndSet(true)) {
                throw new RuntimeException("Helper inited.");
            }
            if (!c2368p.l(context)) {
                new a(str, strG, c2368p).execute(strArr);
            } else {
                h7.l.a("CrashLibFileHelper", "SO files copied.");
                c2368p.k(str);
            }
        }
    }

    public void j() {
        SharedPreferences sharedPreferences = this.f20152b;
        if (sharedPreferences == null || this.f20153c <= 0) {
            return;
        }
        sharedPreferences.edit().putInt(pkcpMQSgx.oVgpKIFBDOS, this.f20153c).commit();
    }

    public void k(String str) {
        synchronized (C2368p.class) {
            this.f20154d = str;
        }
    }

    private boolean l(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            SharedPreferences sharedPreferences = context.getSharedPreferences("crash_lib_file_helper", 0);
            this.f20152b = sharedPreferences;
            this.f20153c = packageInfo.versionCode;
            return sharedPreferences.getInt("latest_copied_version", 0) == packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
            h7.l.d("CrashLibFileHelper", e7.getMessage());
            return false;
        }
    }

    private C2368p() {
        this.f20151a = new AtomicBoolean(false);
    }
}
