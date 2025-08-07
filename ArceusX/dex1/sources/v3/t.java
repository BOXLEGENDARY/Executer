package v3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import n3.C2651i;
import x3.C2989c;

public class t {

    private static final int f24151a = Process.myUid();

    private static final Method f24152b;

    private static final Method f24153c;

    private static final Method f24154d;

    private static final Method f24155e;

    private static final Method f24156f;

    private static final Method f24157g;

    private static final Method f24158h;

    private static final Method f24159i;

    private static Boolean f24160j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f24152b = method;
        if (m.c()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
            }
        } else {
            method2 = null;
        }
        f24153c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f24154d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f24155e = method4;
        if (m.c()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
            }
        } else {
            method5 = null;
        }
        f24156f = method5;
        if (m.j()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e7) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e7);
            }
        } else {
            method6 = null;
        }
        f24157g = method6;
        if (m.j()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e8) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e8);
            }
        } else {
            method7 = null;
        }
        f24158h = method7;
        if (m.j()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        f24159i = method8;
        f24160j = null;
    }

    public static void a(WorkSource workSource, int i7, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f24153c;
        if (method != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i7), str);
                return;
            } catch (Exception e7) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                return;
            }
        }
        Method method2 = f24152b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i7));
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = C2989c.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i7 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i7, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static String c(WorkSource workSource, int i7) {
        Method method = f24156f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i7));
        } catch (Exception e7) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
            return null;
        }
    }

    public static List<String> d(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int iF = workSource == null ? 0 : f(workSource);
        if (iF != 0) {
            for (int i7 = 0; i7 < iF; i7++) {
                String strC = c(workSource, i7);
                if (!r.a(strC)) {
                    C2651i.l(strC);
                    arrayList.add(strC);
                }
            }
        }
        return arrayList;
    }

    public static synchronized boolean e(Context context) {
        Boolean bool = f24160j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z7 = androidx.core.content.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f24160j = Boolean.valueOf(z7);
        return z7;
    }

    public static int f(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f24154d;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            C2651i.l(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e7) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
            return 0;
        }
    }
}
