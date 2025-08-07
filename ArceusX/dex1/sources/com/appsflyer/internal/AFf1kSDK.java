package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import k0.BAKp.xAQOwX;

public final class AFf1kSDK {
    private static AFf1kSDK AFAdRevenueData;
    private final Map<String, String> getMediationNetwork = new HashMap<String, String>() {
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put(GObvYfBKohxpYX.tXBGfYIA, "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put(vxbbqXNtzfMxs.ibUYrZpuuBceo, "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", xAQOwX.heQC);
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    enum AFa1tSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getRevenue;

        AFa1tSDK(String str) {
            this.getRevenue = str;
        }
    }

    enum AFa1zSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMediationNetwork;

        AFa1zSDK(String str) {
            this.getMediationNetwork = str;
        }
    }

    private AFf1kSDK() {
    }

    public static AFf1kSDK AFAdRevenueData() {
        if (AFAdRevenueData == null) {
            AFAdRevenueData = new AFf1kSDK();
        }
        return AFAdRevenueData;
    }

    private static String getCurrencyIso4217Code() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i7 = 0;
            int i8 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i8 <= 2) {
                        i8++;
                        sb.append(AFa1tSDK.XPOSED.getRevenue);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb.append("+h");
                        }
                        sb.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i7++;
                    }
                }
            }
            if (i7 > 1) {
                sb.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            StringBuilder sb2 = new StringBuilder("/proc/");
            sb2.append(Process.myPid());
            sb2.append("/maps");
            if (getMonetizationNetwork(sb2.toString(), "frida")) {
                sb.append(AFa1tSDK.FRIDA.getRevenue);
                if (Build.VERSION.SDK_INT < 29 && getMonetizationNetwork("/proc/net/tcp", "69A2")) {
                    sb.append("+prt");
                }
            }
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e7);
            sb.append(e7.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb.append(";");
        return sb.toString();
    }

    private static boolean getMonetizationNetwork(String str) {
        return str.matches("\\d+");
    }

    public final Object getMediationNetwork(Context context, String str) throws Throwable {
        if (str != null) {
            try {
                str = getMonetizationNetwork(str) ? null : "invalid timestamp";
            } catch (Exception e7) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e7);
                return str;
            }
        }
        AFg1lSDK aFg1lSDK = new AFg1lSDK();
        aFg1lSDK.getRevenue("pr", getMonetizationNetwork());
        aFg1lSDK.getRevenue("an", getMonetizationNetwork(context));
        return aFg1lSDK;
    }

    private AFg1lSDK getMonetizationNetwork(Context context) {
        AFg1lSDK aFg1lSDK = new AFg1lSDK();
        try {
            aFg1lSDK.getRevenue(AFa1zSDK.HOOKING.getMediationNetwork, getCurrencyIso4217Code());
            aFg1lSDK.getRevenue(AFa1zSDK.DEBUGGABLE.getMediationNetwork, Boolean.valueOf(AFAdRevenueData(context)));
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly(tAjeAKSIqDqzNP.zmWDnwpWySLzdlp, th);
        }
        return aFg1lSDK;
    }

    private static boolean AFAdRevenueData(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String getMediationNetwork(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e7);
            return null;
        }
    }

    private AFg1lSDK getMonetizationNetwork() throws Throwable {
        AFg1lSDK aFg1lSDK = new AFg1lSDK();
        try {
            for (Map.Entry<String, String> entry : this.getMediationNetwork.entrySet()) {
                String mediationNetwork = getMediationNetwork(entry.getValue());
                if (mediationNetwork != null && !mediationNetwork.equals(BuildConfig.FLAVOR)) {
                    aFg1lSDK.getRevenue(entry.getKey(), mediationNetwork);
                }
            }
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e7);
        }
        return aFg1lSDK;
    }

    private static boolean getMonetizationNetwork(String str, String str2) throws Exception {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e7) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e7);
            throw new Exception("FNF");
        } catch (IOException e8) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e8);
            throw new Exception("IOF");
        } catch (Exception e9) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e9);
            throw new Exception("GF");
        }
    }
}
