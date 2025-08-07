package C;

import C.O0;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import n.InterfaceC2621a;
import z.C3043d0;

public class Q0 implements InterfaceC2621a<Context, O0> {

    public static class a extends Service {
        private a() {
        }

        @Override
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    private static O0 b(Context context, Bundle bundle) {
        boolean z7 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        C3043d0.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        C3043d0.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z7);
        C3043d0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrC));
        C3043d0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrC2));
        return new O0.b().d(z7).c(e(strArrC)).b(e(strArrC2)).a();
    }

    private static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i7 = bundle.getInt(str, -1);
        if (i7 == -1) {
            C3043d0.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i7);
        } catch (Resources.NotFoundException e7) {
            C3043d0.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i7, e7);
            return new String[0];
        }
    }

    private static Class<? extends N0> d(String str) throws ClassNotFoundException {
        try {
            Class cls = Class.forName(str);
            if (N0.class.isAssignableFrom(cls)) {
                return cls;
            }
            C3043d0.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e7) {
            C3043d0.m("QuirkSettingsLoader", "Class not found: " + str, e7);
            return null;
        }
    }

    private static Set<Class<? extends N0>> e(String[] strArr) throws ClassNotFoundException {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends N0> clsD = d(str);
            if (clsD != null) {
                hashSet.add(clsD);
            }
        }
        return hashSet;
    }

    @Override
    public O0 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            C3043d0.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            C3043d0.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
