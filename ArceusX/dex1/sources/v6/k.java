package V6;

import U7.e;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.y;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.qrscanner.CustomCaptureActivity;
import com.roblox.engine.jni.NativeGLInterface;
import e2.vb.oyfFwvPUKctyaG;
import h7.l;

public class k {
    public static void c(Intent intent) {
        e(intent != null ? intent.getStringExtra("QrCodeScanResult") : BuildConfig.FLAVOR);
    }

    public static boolean d(ActivityC1663h activityC1663h) {
        FragmentManager supportFragmentManager = activityC1663h.getSupportFragmentManager();
        if (!(supportFragmentManager.k0("CustomCaptureFragment") instanceof h)) {
            return false;
        }
        l.a("QrCodeScanner", "handleOnBackPressed: Return 'Cancel' using an empty Url.");
        supportFragmentManager.d1();
        e(BuildConfig.FLAVOR);
        return true;
    }

    private static void e(final String str) {
        l.a("QrCodeScanner", "handleUrlString: " + str);
        if (TextUtils.isEmpty(str)) {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "Cancelled");
        } else {
            U7.e.n().e(str, new e.h() {
                public final void a(boolean z7) {
                    k.f(str, z7);
                }
            });
        }
    }

    public static void f(String str, boolean z7) {
        if (z7) {
            U7.e.n().c(str);
        } else {
            NativeGLInterface.nativeBroadcastEventWithNamespace("QrCodeScanResult", str, "InvalidQr");
        }
    }

    public static void g(FragmentManager fragmentManager, String str, Bundle bundle) {
        boolean z7 = bundle.getBoolean("BundleKey_success");
        String string = bundle.getString("BundleKey_urlString");
        l.a("QrCodeScanner", oyfFwvPUKctyaG.zYzsiIL + z7 + ", urlString = " + string);
        fragmentManager.d1();
        e(string);
    }

    public static void h(ActivityC1663h activityC1663h, int i7) {
        l.g("QrCodeScanner", "showFragmentInActivity: containerViewId = " + i7);
        h hVarT = h.t("content/fonts/BuilderSans-Medium.otf");
        final FragmentManager supportFragmentManager = activityC1663h.getSupportFragmentManager();
        supportFragmentManager.p().b(i7, hVarT, "CustomCaptureFragment").f(null).g();
        supportFragmentManager.u1("QrCode_requestKey", activityC1663h, new y() {
            @Override
            public final void a(String str, Bundle bundle) {
                k.g(supportFragmentManager, str, bundle);
            }
        });
    }

    public static void i(Activity activity, int i7) {
        l.g("QrCodeScanner", "startScanActivity: requestCode = " + i7);
        Intent intent = new Intent(activity, (Class<?>) CustomCaptureActivity.class);
        intent.putExtra("FONT_PATH_MESSAGE", "content/fonts/BuilderSans-Medium.otf");
        activity.startActivityForResult(intent, i7);
    }
}
