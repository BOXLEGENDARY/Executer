package com.roblox.client;

import Q6.QtA.QXojhh;
import S9.Gvmm.CAqKeu;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.universalapp.logging.JNILoggingProtocol;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import z3.AdxZ.bpTQi;

public class q0 {

    public static DisplayMetrics f20220a;

    public static void c(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager;
        if (Build.VERSION.SDK_INT <= j6.d.a().Z2() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            Parcel parcelObtain = Parcel.obtain();
            memoryInfo.writeToParcel(parcelObtain, 0);
            if (parcelObtain.dataSize() < 32) {
                return;
            }
            parcelObtain.setDataPosition(parcelObtain.dataSize() - 32);
            long j7 = parcelObtain.readLong();
            parcelObtain.readLong();
            parcelObtain.readLong();
            long j8 = parcelObtain.readLong();
            deviceParams.lowMemoryKillerBackgroundAppThreshold = j7;
            deviceParams.lowMemoryKillerForegroundAppThreshold = j8;
        }
    }

    public static void d(Context context, DeviceParams deviceParams) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return;
        }
        int memoryClass = activityManager.getMemoryClass();
        int largeMemoryClass = activityManager.getLargeMemoryClass();
        boolean zIsLowRamDevice = activityManager.isLowRamDevice();
        deviceParams.memoryClass = memoryClass;
        deviceParams.largeMemoryClass = largeMemoryClass;
        deviceParams.isLowRamDevice = zIsLowRamDevice;
    }

    public static androidx.appcompat.app.c e(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextAppearance(context, R.style.TextAppearance.DeviceDefault.Large);
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        androidx.appcompat.app.c cVarA = new c.a(context).a();
        cVarA.n(textView, 150, 100, 150, 100);
        cVarA.setCanceledOnTouchOutside(true);
        try {
            cVarA.show();
        } catch (WindowManager.BadTokenException unused) {
        }
        return cVarA;
    }

    public static float f(Context context, int i7) {
        return i7 * g(context).density;
    }

    public static DisplayMetrics g(Context context) {
        DisplayMetrics displayMetrics = f20220a;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        f20220a = displayMetrics2;
        return displayMetrics2;
    }

    public static String h(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return BuildConfig.FLAVOR;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return "WiFi";
        }
        String str = QXojhh.IhChKAvaHQUOORI;
        if (type != 0) {
            return str;
        }
        switch (activeNetworkInfo.getSubtype()) {
        }
        return BuildConfig.FLAVOR;
    }

    public static Point i(Context context) {
        return B7.a.h(context);
    }

    public static void j(Activity activity) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        }
    }

    public static void k(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static boolean l(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static void m(boolean z7) {
        String str = z7 ? "true" : "false";
        h7.l.a("rbx.utils", String.format("Log show keyboard result %s", str));
        ArrayList arrayList = new ArrayList();
        arrayList.add("Points");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Pair(CAqKeu.SnYsuHUYDDIvp, Build.FINGERPRINT));
        arrayList2.add(new Pair("show_keyboard_result", str));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("addOSInfo");
        JNILoggingProtocol.nativeLogRobloxTelemetryEvent(RobloxTelemetryEvent.builder().setEventType("RobloxTelemetry").setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(arrayList).setThrottlingHundredthPercentage(j6.d.a().S2()).setEventName("android_force_show_keyboard").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(arrayList3).setCustomStringFields(arrayList2).build()).build());
    }

    public static void n(View view, int i7) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(bpTQi.XLBYZ);
        if (inputMethodManager == null) {
            return;
        }
        final boolean zShowSoftInput = inputMethodManager.showSoftInput(view, i7);
        if (j6.d.a().q3()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() {
                @Override
                public final void run() {
                    q0.m(zShowSoftInput);
                }
            });
        }
    }

    public static void o(final View view, final int i7) {
        if (view != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public final void run() {
                    q0.n(view, i7);
                }
            });
        }
    }
}
