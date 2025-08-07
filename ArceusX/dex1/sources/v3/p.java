package v3;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import n3.C2651i;

public class p {

    private static String f24148a;

    private static int f24149b;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f24148a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f24148a = Application.getProcessName();
            } else {
                int iMyPid = f24149b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f24149b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                C2651i.l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                k.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    k.a(bufferedReader);
                }
                f24148a = strTrim;
            }
        }
        return f24148a;
    }
}
