package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

public class b extends androidx.core.content.a {

    static class a {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    static class C0081b {
        static void a(Activity activity, String[] strArr, int i7) {
            activity.requestPermissions(strArr, i7);
        }

        static boolean b(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    static class c {
        static boolean a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class d {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface e {
        void validateRequestPermissionsRequestCode(int i7);
    }

    public static void o(Activity activity) {
        activity.finishAffinity();
    }

    public static void p(Activity activity) {
        a.a(activity);
    }

    public static void q(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void r(Activity activity) {
        a.b(activity);
    }

    public static void s(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() {
                @Override
                public final void run() {
                    b.q(activity);
                }
            });
        }
    }

    public static void t(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (TextUtils.isEmpty(strArr[i8])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i8));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof e) {
            ((e) activity).validateRequestPermissionsRequestCode(i7);
        }
        C0081b.a(activity, strArr, i7);
    }

    public static void u(Activity activity, w wVar) {
        a.c(activity, null);
    }

    public static void v(Activity activity, w wVar) {
        a.d(activity, null);
    }

    public static boolean w(Activity activity, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i7 >= 32 ? d.a(activity, str) : i7 == 31 ? c.a(activity, str) : C0081b.b(activity, str);
        }
        return false;
    }

    public static void x(Activity activity, Intent intent, int i7, Bundle bundle) {
        activity.startActivityForResult(intent, i7, bundle);
    }

    public static void y(Activity activity, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    public static void z(Activity activity) {
        a.e(activity);
    }
}
