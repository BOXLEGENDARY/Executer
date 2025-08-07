package Q5;

import D4.AbstractC0374e;
import D4.C0372c;
import D4.C0373d;
import D4.InterfaceC0371b;
import D4.InterfaceC0375f;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import com.appsflyer.AppsFlyerProperties;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.JNIAAssetManagerSetup;
import com.roblox.client.RobloxApplication;
import com.roblox.client.a0;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.universalapp.logging.LoggingProtocol;
import h7.l;
import j0.tkB.pkcpMQSgx;
import j6.d;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class c {

    private static InterfaceC0371b f4870a;

    private static final InterfaceC0375f f4871b = new InterfaceC0375f() {
        @Override
        public final void a(AbstractC0374e abstractC0374e) {
            c.e(abstractC0374e);
        }
    };

    private static final SharedPreferences.OnSharedPreferenceChangeListener f4872c = new SharedPreferences.OnSharedPreferenceChangeListener() {
        @Override
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            c.f(sharedPreferences, str);
        }
    };

    public static void c(Context context) {
        InterfaceC0371b interfaceC0371bA = C0372c.a(context);
        f4870a = interfaceC0371bA;
        interfaceC0371bA.b(f4871b);
        SharedPreferences sharedPreferencesQ = a0.Q(context);
        if (sharedPreferencesQ != null) {
            sharedPreferencesQ.registerOnSharedPreferenceChangeListener(f4872c);
        }
    }

    public static boolean d(String str) {
        if (f4870a != null && str.startsWith("zgooglebinary")) {
            return !f4870a.c().contains(str);
        }
        return false;
    }

    public static void e(AbstractC0374e abstractC0374e) {
        switch (abstractC0374e.i()) {
            case 0:
                l.g("rbx.channel", "sStatus: UNKNOWN for module " + abstractC0374e.f());
                g(pkcpMQSgx.FitN);
                break;
            case 1:
                l.g("rbx.channel", "sStatus: PENDING for module " + abstractC0374e.f());
                g("Pending");
                break;
            case 2:
                if (abstractC0374e.j() == 0) {
                    l.f("Downloading " + abstractC0374e.f());
                } else {
                    l.f("Downloading " + abstractC0374e.f() + ", " + ((abstractC0374e.a() * 100) / abstractC0374e.j()) + "%");
                }
                g("Downloading");
                break;
            case 3:
                l.g("rbx.channel", "sStatus: DOWNLOADED for module " + abstractC0374e.f());
                g("Downloaded");
                break;
            case 4:
                l.g("rbx.channel", "Installing " + abstractC0374e.f());
                g("Installing");
                break;
            case 5:
                l.g("rbx.channel", "Installed " + abstractC0374e.f());
                g("Installed");
                JNIAAssetManagerSetup.a(RobloxApplication.a());
                break;
            case 6:
                l.g("rbx.channel", "sStatus: Failed for module " + abstractC0374e.f());
                g("Failed");
                break;
            case 7:
                l.g("rbx.channel", "sStatus: CANCELED for module " + abstractC0374e.f());
                g("Canceled");
                break;
            case 8:
                l.g("rbx.channel", "REQUIRES_USER_CONFIRMATION is unsupported " + abstractC0374e.f());
                g("Requires User Confirmation");
                break;
            case 9:
                l.g("rbx.channel", "sStatus: CANCELING for module " + abstractC0374e.f());
                g("Canceling");
                break;
        }
    }

    public static void f(SharedPreferences sharedPreferences, String str) {
        if (Objects.equals(str, AppsFlyerProperties.CHANNEL)) {
            String string = sharedPreferences.getString(AppsFlyerProperties.CHANNEL, BuildConfig.FLAVOR);
            if (string.isEmpty() || !string.startsWith("zgooglebinary") || f4870a.c().contains(string)) {
                return;
            }
            f4870a.e(C0373d.c().a(string).b());
        }
    }

    private static void g(String str) {
        if (d.a().z3()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Points");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Pair("fingerprint", Build.FINGERPRINT));
            arrayList2.add(new Pair(KwdswzaUHE.xPhurxnlc, str));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("addOSInfo");
            LoggingProtocol.h().e(RobloxTelemetryEvent.builder().setEventType("RobloxTelemetry").setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(d.a().b0()).setEventName("android_binary_channel_gp").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList3).setCustomStringFields(arrayList2).build()).build());
        }
    }

    public static void h() {
        String strT = a0.T();
        Set<String> setC = f4870a.c();
        if (setC.contains(strT)) {
            com.roblox.client.startup.a.A(strT);
        }
        ArrayList arrayList = new ArrayList();
        String strT2 = a0.T();
        for (String str : setC) {
            if (!str.equalsIgnoreCase(strT2) && str.startsWith("zgooglebinary")) {
                arrayList.add(str);
            }
        }
        f4870a.a(arrayList);
    }
}
