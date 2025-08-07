package com.appsflyer.internal;

import H3.QdLC.QcdySgfdST;
import Z.tNT.PexNRiLSd;
import Za.qhkq.dHkZSUxHu;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.appcompat.app.FN.krlBPZZeK;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.R;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.AFj1ySDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.queue.exceptions.tom.sMlEMqrxoGI;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.github.luben.zstd.BuildConfig;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.google.android.gms.common.C1818c;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.gYZ.uCYQMIHsy;
import w7.Jld.EZYiRMRTxKdo;
import z3.AdxZ.bpTQi;

public final class AFa1zSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static int AFInAppEventType = 1;
    private static long AFKeystoreWrapper;
    private static int AFLogger;
    private static AFa1zSDK areAllFieldsValid;
    static AppsFlyerInAppPurchaseValidatorListener getMediationNetwork;
    public static final String getMonetizationNetwork;
    Application component3;
    private boolean copy;
    private AFf1sSDK copydefault;
    private SharedPreferences equals;
    private Map<Long, String> hashCode;
    public volatile AppsFlyerConversionListener getRevenue = null;
    private long component4 = -1;
    long getCurrencyIso4217Code = -1;
    private long component2 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;
    private final AFc1gSDK toString = new AFc1gSDK();

    static class AnonymousClass4 {
        static final int[] getMediationNetwork;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class AFa1vSDK implements Runnable {
        private final AFh1tSDK AFAdRevenueData;

        AFa1vSDK(AFh1tSDK aFh1tSDK) {
            this.AFAdRevenueData = aFh1tSDK;
        }

        @Override
        public final void run() {
            AFa1zSDK.this.getCurrencyIso4217Code(this.AFAdRevenueData);
        }
    }

    static {
        areAllFieldsValid();
        getMonetizationNetwork = "340";
        AFAdRevenueData = "6.16";
        getMediationNetwork = null;
        areAllFieldsValid = new AFa1zSDK();
        AFInAppEventType = (AFLogger + 3) % 128;
    }

    public AFa1zSDK() {
        AFAdRevenueData().force().getRevenue();
        AFAdRevenueData().force().getMediationNetwork();
        AFe1sSDK aFe1sSDKEquals = AFAdRevenueData().equals();
        aFe1sSDKEquals.getMonetizationNetwork.add(new C0145AFa1zSDK());
    }

    public static Object AFAdRevenueData(Object[] objArr, int i7, int i8, int i9) {
        Boolean bool;
        String string;
        String str;
        int i10 = ~i8;
        int i11 = ~i9;
        switch ((i7 * (-830)) + (i8 * 832) + (((~(i10 | i11)) | (~(i7 | i8 | i9))) * (-831)) + ((~(i10 | i7 | i9)) * (-1662)) + (((~(i7 | i9)) | (~((~i7) | i11)) | (~(i8 | i9))) * 831)) {
            case 1:
                return getCurrencyIso4217Code(objArr);
            case 2:
                AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
                Context context = (Context) objArr[1];
                AFLogger = (AFInAppEventType + R.styleable.AppCompatTheme_toolbarStyle) % 128;
                aFa1zSDK.getCurrencyIso4217Code(context);
                aFa1zSDK.AFAdRevenueData().getRevenue();
                boolean revenue = AFc1kSDK.getRevenue(context);
                AFLogger = (AFInAppEventType + 27) % 128;
                return Boolean.valueOf(revenue);
            case 3:
                AFa1zSDK aFa1zSDK2 = (AFa1zSDK) objArr[0];
                AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) objArr[1];
                AFInAppEventType = (AFLogger + 35) % 128;
                Objects.requireNonNull(appsFlyerConsent);
                aFa1zSDK2.AFAdRevenueData().afErrorLog().component4 = appsFlyerConsent;
                AFInAppEventType = (AFLogger + 85) % 128;
                return null;
            case 4:
                AFa1zSDK aFa1zSDK3 = (AFa1zSDK) objArr[0];
                AFInAppEventType = (AFLogger + 75) % 128;
                aFa1zSDK3.AFAdRevenueData().copy().AFAdRevenueData("getSdkVersion", new String[0]);
                String strAreAllFieldsValid = AFc1kSDK.areAllFieldsValid();
                AFLogger = (AFInAppEventType + 111) % 128;
                return strAreAllFieldsValid;
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                ((AFa1zSDK) objArr[0]).getCurrencyIso4217Code(new AFh1oSDK());
                AFInAppEventType = (AFLogger + 15) % 128;
                return null;
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                return getMediationNetwork(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                AFa1zSDK aFa1zSDK4 = (AFa1zSDK) objArr[0];
                String str2 = (String) objArr[1];
                int i12 = AFLogger + R.styleable.AppCompatTheme_toolbarStyle;
                AFInAppEventType = i12 % 128;
                if (i12 % 2 == 0) {
                    AFd1sSDK aFd1sSDKCopy = aFa1zSDK4.AFAdRevenueData().copy();
                    String[] strArr = new String[0];
                    strArr[1] = str2;
                    aFd1sSDKCopy.AFAdRevenueData("setCurrencyCode", strArr);
                } else {
                    aFa1zSDK4.AFAdRevenueData().copy().AFAdRevenueData("setCurrencyCode", str2);
                }
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str2);
                AFLogger = (AFInAppEventType + 47) % 128;
                return null;
            case 11:
                return component2(objArr);
            case 12:
                AFa1zSDK aFa1zSDK5 = (AFa1zSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                String str3 = (String) objArr[2];
                AFh1nSDK aFh1nSDK = new AFh1nSDK();
                aFa1zSDK5.getCurrencyIso4217Code(context2);
                aFh1nSDK.component3 = null;
                aFh1nSDK.getRevenue = null;
                aFh1nSDK.areAllFieldsValid = str3;
                aFh1nSDK.getMediationNetwork = null;
                aFa1zSDK5.getMediationNetwork(aFh1nSDK);
                AFLogger = (AFInAppEventType + 105) % 128;
                return null;
            case 13:
                AFa1zSDK aFa1zSDK6 = (AFa1zSDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str4 = (String) objArr[2];
                final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
                if (aFa1zSDK6.AFAdRevenueData().afDebugLog().AFAdRevenueData()) {
                    return null;
                }
                if (!aFa1zSDK6.copy) {
                    getMediationNetwork("start");
                    if (str4 == null) {
                        if (appsFlyerRequestListener == null) {
                            return null;
                        }
                        appsFlyerRequestListener.onError(41, "No dev key");
                        return null;
                    }
                }
                aFa1zSDK6.getCurrencyIso4217Code(context3);
                final AFh1uSDK aFh1uSDKComponent2 = aFa1zSDK6.AFAdRevenueData().component2();
                aFh1uSDKComponent2.getMediationNetwork(AFg1aSDK.getRevenue(context3));
                if (aFa1zSDK6.component3 == null) {
                    Application applicationM_ = AFj1nSDK.M_(context3);
                    if (applicationM_ == null) {
                        return null;
                    }
                    AFLogger = (AFInAppEventType + 23) % 128;
                    aFa1zSDK6.component3 = applicationM_;
                }
                aFa1zSDK6.AFAdRevenueData().copy().AFAdRevenueData("start", str4);
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.GENERAL;
                String str5 = getMonetizationNetwork;
                aFLogger.i(aFh1zSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.16.2", str5));
                StringBuilder sb = new StringBuilder("Build Number: ");
                sb.append(str5);
                aFLogger.i(aFh1zSDK, sb.toString());
                AppsFlyerProperties.getInstance().loadProperties(aFa1zSDK6.AFAdRevenueData().component1());
                if (!TextUtils.isEmpty(str4)) {
                    AFf1iSDK aFf1iSDKAFKeystoreWrapper = aFa1zSDK6.AFAdRevenueData().AFKeystoreWrapper();
                    AFf1iSDK.AFAdRevenueData(new Object[]{aFf1iSDKAFKeystoreWrapper, str4}, 99232209, -99232207, System.identityHashCode(aFf1iSDKAFKeystoreWrapper));
                } else if (TextUtils.isEmpty(aFa1zSDK6.AFAdRevenueData().AFKeystoreWrapper().getRevenue())) {
                    AFLogger = (AFInAppEventType + 59) % 128;
                    AFAdRevenueData(new Object[0], -847594301, 847594306, (int) System.currentTimeMillis());
                    if (appsFlyerRequestListener == null) {
                        return null;
                    }
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return null;
                }
                aFa1zSDK6.AFAdRevenueData().component4().getMonetizationNetwork(aFa1zSDK6.getMediationNetwork());
                AFAdRevenueData(new Object[]{aFa1zSDK6}, 905210815, -905210799, System.identityHashCode(aFa1zSDK6));
                getMediationNetwork(aFa1zSDK6.component3.getBaseContext());
                aFa1zSDK6.AFAdRevenueData().d().getRevenue();
                aFa1zSDK6.toString.afDebugLog().getMonetizationNetwork(context3, new AFb1aSDK.AFa1uSDK() {
                    @Override
                    public final void getMonetizationNetwork(AFh1vSDK aFh1vSDK) {
                        aFh1uSDKComponent2.AFAdRevenueData();
                        AFc1fSDK aFc1fSDKAFAdRevenueData = AFa1zSDK.this.AFAdRevenueData();
                        aFc1fSDKAFAdRevenueData.component4().getMonetizationNetwork(AFa1zSDK.this.getMediationNetwork());
                        AFa1zSDK aFa1zSDK7 = AFa1zSDK.this;
                        AFa1zSDK.AFAdRevenueData(new Object[]{aFa1zSDK7}, 905210815, -905210799, System.identityHashCode(aFa1zSDK7));
                        int iAFAdRevenueData = aFc1fSDKAFAdRevenueData.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
                        AFLogger.afInfoLog("onBecameForeground");
                        if (iAFAdRevenueData < 2) {
                            AFa1zSDK.this.AFAdRevenueData().copydefault().getMediationNetwork();
                        }
                        AFh1nSDK aFh1nSDK2 = new AFh1nSDK();
                        if (aFh1vSDK != null) {
                            AFa1zSDK.this.AFAdRevenueData().e().e_(AFa1kSDK.getCurrencyIso4217Code(aFh1nSDK2), aFh1vSDK.getCurrencyIso4217Code, aFc1fSDKAFAdRevenueData.AFLogger().getMonetizationNetwork);
                        }
                        AFa1zSDK aFa1zSDK8 = AFa1zSDK.this;
                        aFh1nSDK2.AFAdRevenueData = appsFlyerRequestListener;
                        aFa1zSDK8.AFAdRevenueData(aFh1nSDK2, aFh1vSDK);
                        AFa1zSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getRevenue();
                        AFa1zSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getMediationNetwork.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
                    }

                    @Override
                    public final void getRevenue() {
                        Context context4 = AFa1zSDK.this.AFAdRevenueData().AFLogger().getMonetizationNetwork;
                        AFLogger.afInfoLog("onBecameBackground");
                        AFh1uSDK aFh1uSDK = aFh1uSDKComponent2;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j7 = aFh1uSDK.component3;
                        if (j7 != 0) {
                            long j8 = jCurrentTimeMillis - j7;
                            if (j8 > 0 && j8 < 1000) {
                                j8 = 1000;
                            }
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(j8);
                            aFh1uSDK.copydefault = seconds;
                            aFh1uSDK.getRevenue.AFAdRevenueData(PexNRiLSd.BNyhYzob, seconds);
                        } else {
                            AFLogger.afInfoLog("Metrics: fg ts is missing");
                        }
                        AFLogger.afInfoLog("callStatsBackground background call");
                        AFa1zSDK.this.AFAdRevenueData().afRDLog().getMediationNetwork();
                        AFd1sSDK aFd1sSDKCopy2 = AFa1zSDK.this.AFAdRevenueData().copy();
                        if (aFd1sSDKCopy2.areAllFieldsValid()) {
                            aFd1sSDKCopy2.AFAdRevenueData();
                            if (context4 != null && !AppsFlyerLib.getInstance().isStopped()) {
                                aFd1sSDKCopy2.o_(context4.getPackageName(), context4.getPackageManager());
                            }
                            aFd1sSDKCopy2.getMediationNetwork();
                        } else {
                            AFLogger.afDebugLog("RD status is OFF");
                        }
                        AFa1zSDK.this.AFAdRevenueData().copydefault().getCurrencyIso4217Code();
                        AFa1zSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly().AFAdRevenueData();
                        AFa1zSDK.this.AFAdRevenueData().getCurrencyIso4217Code().getRevenue();
                    }
                });
                AFLogger = (AFInAppEventType + 25) % 128;
                return null;
            case 14:
                AFa1zSDK aFa1zSDK7 = (AFa1zSDK) objArr[0];
                if (aFa1zSDK7.component4 > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - aFa1zSDK7.component4;
                    Locale locale = Locale.US;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
                    String mediationNetwork = getMediationNetwork(simpleDateFormat, aFa1zSDK7.component4);
                    String mediationNetwork2 = getMediationNetwork(simpleDateFormat, aFa1zSDK7.getCurrencyIso4217Code);
                    if (jCurrentTimeMillis < aFa1zSDK7.component2 && !aFa1zSDK7.isStopped()) {
                        int i13 = AFInAppEventType + 63;
                        AFLogger = i13 % 128;
                        if (i13 % 2 != 0) {
                            Object[] objArr2 = new Object[3];
                            objArr2[1] = mediationNetwork;
                            objArr2[1] = mediationNetwork2;
                            objArr2[2] = Long.valueOf(jCurrentTimeMillis);
                            objArr2[2] = Long.valueOf(aFa1zSDK7.component2);
                            AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr2));
                            bool = Boolean.FALSE;
                        } else {
                            AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(aFa1zSDK7.component2)));
                            bool = Boolean.TRUE;
                        }
                        return bool;
                    }
                    if (!aFa1zSDK7.isStopped()) {
                        AFLogger = (AFInAppEventType + 67) % 128;
                        AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", mediationNetwork, mediationNetwork2, Long.valueOf(jCurrentTimeMillis)));
                    }
                } else if (!aFa1zSDK7.isStopped()) {
                    AFLogger.afInfoLog("Sending first launch for this session!");
                    AFInAppEventType = (AFLogger + 5) % 128;
                }
                bool = Boolean.FALSE;
                return bool;
            case 15:
                return component4(objArr);
            case 16:
                AFa1zSDK aFa1zSDK8 = (AFa1zSDK) objArr[0];
                AFInAppEventType = (AFLogger + 61) % 128;
                if (AFe1fSDK.component1()) {
                    return null;
                }
                AFc1fSDK aFc1fSDKAFAdRevenueData = aFa1zSDK8.AFAdRevenueData();
                AFe1sSDK aFe1sSDKEquals = aFc1fSDKAFAdRevenueData.equals();
                aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(new AFe1fSDK(aFc1fSDKAFAdRevenueData)));
                AFLogger = (AFInAppEventType + 109) % 128;
                return null;
            case 17:
                AFa1zSDK aFa1zSDK9 = (AFa1zSDK) objArr[0];
                Context context4 = (Context) objArr[1];
                String str6 = (String) objArr[2];
                String str7 = (String) objArr[3];
                String str8 = (String) objArr[4];
                String str9 = (String) objArr[5];
                String str10 = (String) objArr[6];
                Map map = (Map) objArr[7];
                AFd1sSDK aFd1sSDKCopy2 = aFa1zSDK9.AFAdRevenueData().copy();
                if (map == null) {
                    AFInAppEventType = (AFLogger + 71) % 128;
                    string = BuildConfig.FLAVOR;
                } else {
                    string = map.toString();
                    AFInAppEventType = (AFLogger + 77) % 128;
                }
                aFd1sSDKCopy2.AFAdRevenueData("validateAndTrackInAppPurchase", str6, str7, str8, str9, str10, string);
                if (!aFa1zSDK9.AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFh1zSDK aFh1zSDK2 = AFh1zSDK.PURCHASE_VALIDATION;
                    StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
                    sb2.append(str8);
                    sb2.append(" ");
                    sb2.append(str9);
                    sb2.append(" ");
                    sb2.append(str10);
                    aFLogger2.i(aFh1zSDK2, sb2.toString());
                    AFLogger = (AFInAppEventType + 77) % 128;
                }
                if (str6 != null && str9 != null) {
                    AFLogger = (AFInAppEventType + 105) % 128;
                    if (str7 != null && str10 != null && str8 != null) {
                        new Thread(new com.appsflyer.internal.AFa1vSDK(context4.getApplicationContext(), aFa1zSDK9.AFAdRevenueData().AFKeystoreWrapper().getRevenue(), str6, str7, str8, str9, str10, map)).start();
                        return null;
                    }
                }
                AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getMediationNetwork;
                if (appsFlyerInAppPurchaseValidatorListener == null) {
                    return null;
                }
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return null;
            case 18:
                AFa1zSDK aFa1zSDK10 = (AFa1zSDK) objArr[0];
                String[] strArr2 = (String[]) objArr[1];
                int i14 = AFLogger + 29;
                AFInAppEventType = i14 % 128;
                if (i14 % 2 == 0) {
                    Object[] objArr3 = new Object[0];
                    objArr3[0] = Arrays.toString(strArr2);
                    str = String.format("setOneLinkCustomDomain %s", objArr3);
                } else {
                    str = String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr2));
                }
                AFLogger.afDebugLog(str);
                aFa1zSDK10.AFAdRevenueData().e().component4 = strArr2;
                AFInAppEventType = (AFLogger + 91) % 128;
                return null;
            case 19:
                return component3(objArr);
            case 20:
                return component1(objArr);
            case 21:
                return copydefault(objArr);
            case 22:
                return equals(objArr);
            case 23:
                AFa1zSDK aFa1zSDK11 = (AFa1zSDK) objArr[0];
                String str11 = (String) objArr[1];
                AFLogger = (AFInAppEventType + 57) % 128;
                aFa1zSDK11.AFAdRevenueData().copy().AFAdRevenueData("setExtension", str11);
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str11);
                AFInAppEventType = (AFLogger + 25) % 128;
                return null;
            default:
                return getRevenue(objArr);
        }
    }

    private static java.lang.Object areAllFieldsValid(java.lang.Object[] r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.areAllFieldsValid(java.lang.Object[]):java.lang.Object");
    }

    public static synchronized SharedPreferences c_(Context context) {
        SharedPreferences sharedPreferences;
        try {
            AFInAppEventType = (AFLogger + 11) % 128;
            if (getMonetizationNetwork().equals == null) {
                int i7 = AFLogger + 101;
                AFInAppEventType = i7 % 128;
                StrictMode.ThreadPolicy threadPolicy = i7 % 2;
                try {
                    if (threadPolicy == 0) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        getMonetizationNetwork().equals = context.getApplicationContext().getSharedPreferences("appsflyer-data", 1);
                        threadPolicy = threadPolicyAllowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        getMonetizationNetwork().equals = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = threadPolicyAllowThreadDiskReads2;
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
            sharedPreferences = getMonetizationNetwork().equals;
            int i8 = AFInAppEventType + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            AFLogger = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return sharedPreferences;
    }

    private static Object component1(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        AFInAppEventType = (AFLogger + 53) % 128;
        aFa1zSDK.AFAdRevenueData().copy().AFAdRevenueData("registerConversionListener", new String[0]);
        aFa1zSDK.getRevenue(appsFlyerConversionListener);
        int i7 = AFLogger + 49;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static Object component2(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i7 = AFLogger + 13;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            aFa1zSDK.getCurrencyIso4217Code(context);
            aFa1zSDK.AFAdRevenueData().getRevenue().getMediationNetwork(context);
            throw null;
        }
        aFa1zSDK.getCurrencyIso4217Code(context);
        String mediationNetwork = aFa1zSDK.AFAdRevenueData().getRevenue().getMediationNetwork(context);
        AFLogger = (AFInAppEventType + 79) % 128;
        return mediationNetwork;
    }

    private static Object component3(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFj1pSDK aFj1pSDK = new AFj1pSDK((Intent) objArr[2]);
        String str = dHkZSUxHu.nIlmHxqkknStSyD;
        if (aFj1pSDK.getRevenue(str) != null) {
            int i7 = AFLogger + 93;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 == 0) {
                AFAdRevenueData(new Object[]{aFj1pSDK.getRevenue(str)}, 1419097846, -1419097845, (int) System.currentTimeMillis());
                throw null;
            }
            AFAdRevenueData(new Object[]{aFj1pSDK.getRevenue(str)}, 1419097846, -1419097845, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String revenue = aFj1pSDK.getRevenue("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(revenue)));
        if (revenue != null) {
            ((AFc1sSDK) AFAdRevenueData(new Object[]{aFa1zSDK, context}, -1165261210, 1165261210, System.identityHashCode(aFa1zSDK))).getRevenue("referrer", revenue);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", revenue);
            appsFlyerProperties.getMediationNetwork = revenue;
            if (AppsFlyerProperties.getInstance().getMediationNetwork()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                aFa1zSDK.AFAdRevenueData(context, AFh1wSDK.getMediationNetwork);
                aFa1zSDK.AFAdRevenueData(revenue);
            }
        }
        int i8 = AFInAppEventType + 95;
        AFLogger = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 30 / 0;
        }
        return null;
    }

    private static Object component4(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i7 = AFLogger + R.styleable.AppCompatTheme_windowActionModeOverlay;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            aFa1zSDK.AFAdRevenueData().e().getMonetizationNetwork = deepLinkListener;
            aFa1zSDK.AFAdRevenueData().e().component1 = jLongValue;
            return null;
        }
        aFa1zSDK.AFAdRevenueData().e().getMonetizationNetwork = deepLinkListener;
        aFa1zSDK.AFAdRevenueData().e().component1 = jLongValue;
        throw null;
    }

    public void copy() {
        int i7 = AFLogger + 77;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            AFAdRevenueData().registerClient().getMediationNetwork();
            component4();
            int i8 = 96 / 0;
        } else {
            AFAdRevenueData().registerClient().getMediationNetwork();
            component4();
        }
        int i9 = AFLogger + 55;
        AFInAppEventType = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    private static Object copydefault(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        AFf1qSDK aFf1qSDK = (AFf1qSDK) objArr[1];
        AFc1fSDK aFc1fSDKAFAdRevenueData = aFa1zSDK.AFAdRevenueData();
        if (aFf1qSDK == AFf1qSDK.SUCCESS) {
            aFc1fSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
            AFInAppEventType = (AFLogger + 77) % 128;
        }
        if (aFc1fSDKAFAdRevenueData.copy().getCurrencyIso4217Code()) {
            aFc1fSDKAFAdRevenueData.force().getRevenue();
            int i7 = AFInAppEventType + 33;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i8 = AFInAppEventType + 85;
        AFLogger = i8 % 128;
        if (i8 % 2 == 0) {
            aFc1fSDKAFAdRevenueData.force().getCurrencyIso4217Code();
            return null;
        }
        aFc1fSDKAFAdRevenueData.force().getCurrencyIso4217Code();
        throw null;
    }

    public void d_(android.content.Context r7, android.content.Intent r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.d_(android.content.Context, android.content.Intent):void");
    }

    private static Object equals(Object[] objArr) {
        String str = (String) objArr[0];
        AFInAppEventType = (AFLogger + 107) % 128;
        boolean z7 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i7 = AFInAppEventType + R.styleable.AppCompatTheme_toolbarStyle;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            return Boolean.valueOf(z7);
        }
        throw null;
    }

    public static AFa1zSDK getMonetizationNetwork() {
        int i7 = AFLogger;
        AFa1zSDK aFa1zSDK = areAllFieldsValid;
        AFInAppEventType = (i7 + 105) % 128;
        return aFa1zSDK;
    }

    @Override
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i7 = AFLogger + 63;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            AFAdRevenueData().e().getMediationNetwork.contains(Arrays.asList(strArr));
            throw null;
        }
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFAdRevenueData().e().getMediationNetwork;
        if (list.contains(listAsList)) {
            return;
        }
        AFLogger = (AFInAppEventType + 111) % 128;
        list.add(listAsList);
    }

    @Override
    public final void anonymizeUser(boolean z7) {
        AFInAppEventType = (AFLogger + 63) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("anonymizeUser", String.valueOf(z7));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z7);
        AFInAppEventType = (AFLogger + 65) % 128;
    }

    @Override
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i7 = AFInAppEventType + 51;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            AFa1oSDK aFa1oSDKE = AFAdRevenueData().e();
            aFa1oSDKE.AFAdRevenueData = str;
            aFa1oSDKE.getRevenue = map;
        } else {
            AFa1oSDK aFa1oSDKE2 = AFAdRevenueData().e();
            aFa1oSDKE2.AFAdRevenueData = str;
            aFa1oSDKE2.getRevenue = map;
            throw null;
        }
    }

    final void b_(Context context, Intent intent) {
        AFAdRevenueData(new Object[]{this, context, intent}, -1435995239, 1435995258, System.identityHashCode(this));
    }

    @Override
    public final void enableFacebookDeferredApplinks(boolean z7) {
        AFLogger = (AFInAppEventType + 35) % 128;
        AFAdRevenueData().d().getCurrencyIso4217Code(z7);
        AFInAppEventType = (AFLogger + 101) % 128;
    }

    @Override
    public final void enableTCFDataCollection(boolean z7) {
        int i7 = AFInAppEventType + 75;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z7));
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z7));
            throw null;
        }
    }

    @Override
    public final java.lang.String getAppsFlyerUID(android.content.Context r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    @Override
    public final String getAttributionId(Context context) {
        return (String) AFAdRevenueData(new Object[]{this, context}, 239252226, -239252215, System.identityHashCode(this));
    }

    public final void getCurrencyIso4217Code(android.content.Context r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.getCurrencyIso4217Code(android.content.Context):void");
    }

    @Override
    public final String getHostName() {
        int i7 = AFLogger + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            return AFAdRevenueData().AFInAppEventType().AFAdRevenueData();
        }
        AFAdRevenueData().AFInAppEventType().AFAdRevenueData();
        throw null;
    }

    @Override
    public final String getHostPrefix() {
        return (String) AFAdRevenueData(new Object[]{this}, -545244941, 545244949, System.identityHashCode(this));
    }

    final synchronized AFf1sSDK getMediationNetwork() {
        AFf1sSDK aFf1sSDK;
        try {
            if (this.copydefault == null) {
                int i7 = AFLogger + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                AFInAppEventType = i7 % 128;
                if (i7 % 2 == 0) {
                    this.copydefault = new AFf1sSDK() {
                        @Override
                        public final void onRemoteConfigUpdateFinished(AFf1qSDK aFf1qSDK) {
                            this.f13641a.getMonetizationNetwork(aFf1qSDK);
                        }
                    };
                    throw null;
                }
                this.copydefault = new AFf1sSDK() {
                    @Override
                    public final void onRemoteConfigUpdateFinished(AFf1qSDK aFf1qSDK) {
                        this.f13641a.getMonetizationNetwork(aFf1qSDK);
                    }
                };
            }
            aFf1sSDK = this.copydefault;
            int i8 = AFInAppEventType + 73;
            AFLogger = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFf1sSDK;
    }

    @Override
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(bpTQi.sZiiwbObrWSi);
        if (string != null) {
            int i7 = AFLogger + R.styleable.AppCompatTheme_windowMinWidthMinor;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 != 0) {
                return string;
            }
            throw null;
        }
        String mediationNetwork = getMediationNetwork(context, "AF_STORE");
        if (mediationNetwork == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i8 = AFInAppEventType + 97;
        AFLogger = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 82 / 0;
        }
        return mediationNetwork;
    }

    public final void getRevenue(Context context, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strAFAdRevenueData = ((AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this))).AFAdRevenueData("extraReferrers", (String) null);
            if (strAFAdRevenueData == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(strAFAdRevenueData);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                    AFLogger = (AFInAppEventType + 45) % 128;
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                AFInAppEventType = (AFLogger + 85) % 128;
                jSONArray2.put(jCurrentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                AFLogger = (AFInAppEventType + 111) % 128;
                getMonetizationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray2.toString());
            ((AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this))).getRevenue("extraReferrers", jSONObject.toString());
        } catch (JSONException e7) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e7);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    @Override
    public final String getSdkVersion() {
        return (String) AFAdRevenueData(new Object[]{this}, 424762749, -424762745, System.identityHashCode(this));
    }

    @Override
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (this.copy) {
            return this;
        }
        this.copy = true;
        AFf1iSDK aFf1iSDKAFKeystoreWrapper = AFAdRevenueData().AFKeystoreWrapper();
        AFf1iSDK.AFAdRevenueData(new Object[]{aFf1iSDKAFKeystoreWrapper, str}, 99232209, -99232207, System.identityHashCode(aFf1iSDKAFKeystoreWrapper));
        if (context != null) {
            getCurrencyIso4217Code(context);
            Application applicationM_ = AFj1nSDK.M_(context);
            if (applicationM_ == null) {
                return this;
            }
            AFLogger = (AFInAppEventType + 53) % 128;
            this.component3 = applicationM_;
            AFAdRevenueData().AFAdRevenueData().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f13638d.copy();
                }
            });
            AFAdRevenueData().component2().getCurrencyIso4217Code = System.currentTimeMillis();
            AFe1sSDK aFe1sSDKEquals = AFAdRevenueData().equals();
            aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(new AFe1hSDK(AFAdRevenueData())));
            AFi1ySDK aFi1ySDKW = AFAdRevenueData().w();
            aFi1ySDKW.getRevenue = Build.VERSION.SDK_INT >= 31 ? new AFi1uSDK(aFi1ySDKW.AFAdRevenueData) : new AFi1vSDK(aFi1ySDKW.AFAdRevenueData);
            AFAdRevenueData().afRDLog().getMediationNetwork(new AFc1bSDK.AFa1vSDK() {
                @Override
                public final void onConfigurationChanged(boolean z7) {
                    this.f13639a.getMonetizationNetwork(z7);
                }
            });
            AFAdRevenueData().component4().getMonetizationNetwork(getMediationNetwork());
            AFj1zSDK aFj1zSDKAFInAppEventParameterName = AFAdRevenueData().AFInAppEventParameterName();
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f13640d.equals();
                }
            };
            AFi1iSDK monetizationNetwork = aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork(runnable);
            Runnable mediationNetwork = aFj1zSDKAFInAppEventParameterName.getMediationNetwork(monetizationNetwork, runnable);
            aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork(monetizationNetwork);
            aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork(new AFj1sSDK(aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork.getRevenue(), mediationNetwork));
            aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork(new AFi1dSDK(mediationNetwork, aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork, new AFi1bSDK()));
            aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork(new AFj1wSDK(mediationNetwork, aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork));
            aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork(new AFj1xSDK(aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork.AFAdRevenueData(), aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork.getRevenue(), mediationNetwork));
            aFj1zSDKAFInAppEventParameterName.getMediationNetwork(mediationNetwork);
            if (!aFj1zSDKAFInAppEventParameterName.getMediationNetwork()) {
                Context context2 = aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork.AFLogger().getMonetizationNetwork;
                AFc1fSDK aFc1fSDK = aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork;
                List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        AFInAppEventType = (AFLogger + 15) % 128;
                        ProviderInfo providerInfo = it.next().providerInfo;
                        if (providerInfo != null) {
                            arrayList.add(new AFj1vSDK(providerInfo, mediationNetwork, aFc1fSDK));
                        } else {
                            AFLogger.INSTANCE.w(AFh1zSDK.PREINSTALL, EZYiRMRTxKdo.VbQrPsvLN);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        aFj1zSDKAFInAppEventParameterName.AFAdRevenueData.addAll(arrayList);
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1zSDK aFh1zSDK = AFh1zSDK.PREINSTALL;
                        StringBuilder sb = new StringBuilder("Detected ");
                        sb.append(arrayList.size());
                        sb.append(" valid preinstall provider(s)");
                        aFLogger.d(aFh1zSDK, sb.toString());
                        AFInAppEventType = (AFLogger + 23) % 128;
                    }
                }
            }
            for (AFj1ySDK aFj1ySDK : aFj1zSDKAFInAppEventParameterName.getRevenue()) {
                aFj1ySDK.getRevenue(aFj1zSDKAFInAppEventParameterName.getMonetizationNetwork.AFLogger().getMonetizationNetwork);
            }
            AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code(AFAdRevenueData().getRevenue());
            if (AFAdRevenueData().afLogForce().getRevenue()) {
                AFAdRevenueData().afLogForce().getMediationNetwork();
            }
        } else {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFAdRevenueData().copy().AFAdRevenueData("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
        AFLogger.INSTANCE.force(AFh1zSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.16.2", getMonetizationNetwork));
        this.getRevenue = appsFlyerConversionListener;
        return this;
    }

    @Override
    public final boolean isPreInstalledApp(Context context) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, context}, -790987167, 790987169, System.identityHashCode(this))).booleanValue();
    }

    @Override
    @Deprecated
    public final boolean isStopped() {
        boolean mediationNetwork;
        int i7 = AFInAppEventType + 109;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
            int i8 = 86 / 0;
        } else {
            mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        }
        AFInAppEventType = (AFLogger + 49) % 128;
        return mediationNetwork;
    }

    @Override
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        if (!this.copy) {
            getMediationNetwork("logAdRevenue");
            int i7 = AFLogger + R.styleable.AppCompatTheme_windowMinWidthMinor;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            AFLogger.INSTANCE.w(AFh1zSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            return;
        }
        if (!AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
            if (!(!AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().AFKeystoreWrapper().getRevenue()))) {
                AFAdRevenueData(new Object[0], -847594301, 847594306, (int) System.currentTimeMillis());
                return;
            } else {
                getMediationNetwork(new AFh1pSDK(aFAdRevenueData, map));
                return;
            }
        }
        int i8 = AFInAppEventType + 1;
        AFLogger = i8 % 128;
        if (i8 % 2 == 0) {
            AFLogger.INSTANCE.w(AFh1zSDK.AD_REVENUE, "SDK is stopped");
        } else {
            AFLogger.INSTANCE.w(AFh1zSDK.AD_REVENUE, "SDK is stopped");
            throw null;
        }
    }

    @Override
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i7 = AFInAppEventType + 25;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            logEvent(context, str, map, null);
            throw null;
        }
        logEvent(context, str, map, null);
        AFInAppEventType = (AFLogger + 53) % 128;
    }

    @Override
    public final void logLocation(Context context, double d7, double d8) {
        AFAdRevenueData().copy().AFAdRevenueData("logLocation", String.valueOf(d7), String.valueOf(d8));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d8));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d7));
        getMonetizationNetwork(context, AFInAppEventType.LOCATION_COORDINATES, map);
        AFInAppEventType = (AFLogger + 39) % 128;
    }

    @Override
    public final void logSession(Context context) {
        AFInAppEventType = (AFLogger + 29) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("logSession", new String[0]);
        AFAdRevenueData().copy().getRevenue();
        AFAdRevenueData(context, AFh1wSDK.logSession);
        getMonetizationNetwork(context, null, null);
        int i7 = AFLogger + 29;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void onPause(Context context) {
        int i7 = AFInAppEventType + R.styleable.AppCompatTheme_tooltipFrameBackground;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            AFAdRevenueData().afDebugLog().getCurrencyIso4217Code();
        } else {
            AFAdRevenueData().afDebugLog().getCurrencyIso4217Code();
            throw null;
        }
    }

    @Override
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        if (uri != null) {
            AFLogger = (AFInAppEventType + 63) % 128;
            if (!uri.toString().isEmpty()) {
                if (context != null) {
                    getCurrencyIso4217Code(context);
                    AFAdRevenueData().e().f_(AFa1kSDK.getMonetizationNetwork(AFAdRevenueData().afErrorLogForExcManagerOnly()), Uri.parse(uri.toString()));
                    AFInAppEventType = (AFLogger + 103) % 128;
                    return;
                } else {
                    AFa1oSDK aFa1oSDKE = AFAdRevenueData().e();
                    StringBuilder sb = new StringBuilder("Context is \"");
                    sb.append(context);
                    sb.append("\"");
                    aFa1oSDKE.AFAdRevenueData(sb.toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
            }
        }
        AFa1oSDK aFa1oSDKE2 = AFAdRevenueData().e();
        StringBuilder sb2 = new StringBuilder("Link is \"");
        sb2.append(uri);
        sb2.append("\"");
        aFa1oSDKE2.AFAdRevenueData(sb2.toString(), DeepLinkResult.Error.NETWORK);
        int i7 = AFInAppEventType + 75;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public final void performOnDeepLinking(final Intent intent, Context context) {
        if (intent == null) {
            int i7 = AFLogger + 97;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 != 0) {
                AFAdRevenueData().e().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                AFAdRevenueData().e().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            getCurrencyIso4217Code(applicationContext);
            AFAdRevenueData().AFAdRevenueData().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f13635d.d_(applicationContext, intent);
                }
            });
        } else {
            AFAdRevenueData().e().AFAdRevenueData("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i8 = AFInAppEventType + 31;
            AFLogger = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        AFAdRevenueData(new Object[]{this, context, appsFlyerConversionListener}, 1442055838, -1442055818, System.identityHashCode(this));
    }

    @Override
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFLogger = (AFInAppEventType + 105) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            getMediationNetwork = appsFlyerInAppPurchaseValidatorListener;
            AFInAppEventType = (AFLogger + 69) % 128;
        }
    }

    @Override
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFLogger = (AFInAppEventType + 83) % 128;
        getCurrencyIso4217Code(context);
        PurchaseHandler purchaseHandlerAreAllFieldsValid = AFAdRevenueData().areAllFieldsValid();
        if (purchaseHandlerAreAllFieldsValid.getMediationNetwork(map, purchaseValidationCallback, "purchases")) {
            AFe1bSDK aFe1bSDK = new AFe1bSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getMonetizationNetwork);
            AFe1sSDK aFe1sSDK = purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code;
            aFe1sSDK.getRevenue.execute(aFe1sSDK.new AnonymousClass3(aFe1bSDK));
            AFInAppEventType = (AFLogger + R.styleable.AppCompatTheme_windowFixedHeightMinor) % 128;
        }
    }

    @Override
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler purchaseHandlerAreAllFieldsValid;
        int i7 = AFLogger + 101;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            getCurrencyIso4217Code(context);
            purchaseHandlerAreAllFieldsValid = AFAdRevenueData().areAllFieldsValid();
            String[] strArr = new String[0];
            strArr[0] = "subscriptions";
            if (!purchaseHandlerAreAllFieldsValid.getMediationNetwork(map, purchaseValidationCallback, strArr)) {
                return;
            }
        } else {
            getCurrencyIso4217Code(context);
            purchaseHandlerAreAllFieldsValid = AFAdRevenueData().areAllFieldsValid();
            if (!purchaseHandlerAreAllFieldsValid.getMediationNetwork(map, purchaseValidationCallback, "subscriptions")) {
                return;
            }
        }
        AFe1pSDK aFe1pSDK = new AFe1pSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.getMonetizationNetwork);
        AFe1sSDK aFe1sSDK = purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code;
        aFe1sSDK.getRevenue.execute(aFe1sSDK.new AnonymousClass3(aFe1pSDK));
        AFInAppEventType = (AFLogger + R.styleable.AppCompatTheme_windowFixedHeightMinor) % 128;
    }

    @Override
    public final void sendPushNotificationData(android.app.Activity r18) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override
    public final void setAdditionalData(Map<String, Object> map) {
        AFLogger = (AFInAppEventType + 95) % 128;
        if (map != null) {
            AFAdRevenueData().copy().AFAdRevenueData("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            AFLogger = (AFInAppEventType + 21) % 128;
        }
    }

    @Override
    public final void setAndroidIdData(String str) {
        int i7 = AFInAppEventType + 3;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            AFd1sSDK aFd1sSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1sSDKCopy.AFAdRevenueData("setAndroidIdData", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setAndroidIdData", str);
        }
        AFAdRevenueData().afErrorLog().getCurrencyIso4217Code = str;
        AFLogger = (AFInAppEventType + R.styleable.AppCompatTheme_windowActionModeOverlay) % 128;
    }

    @Override
    public final void setAppId(String str) {
        int i7 = AFLogger + 27;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            AFd1sSDK aFd1sSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1sSDKCopy.AFAdRevenueData("setAppId", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setAppId", str);
        }
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
    }

    @Override
    public final void setAppInviteOneLink(String str) {
        AFLogger = (AFInAppEventType + 111) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
            AFInAppEventType = (AFLogger + 9) % 128;
        }
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
    }

    @Override
    public final void setCollectAndroidID(boolean z7) {
        int i7 = AFLogger + R.styleable.AppCompatTheme_tooltipFrameBackground;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            AFd1sSDK aFd1sSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z7);
            aFd1sSDKCopy.AFAdRevenueData("setCollectAndroidID", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setCollectAndroidID", String.valueOf(z7));
        }
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z7));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z7));
        int i8 = AFInAppEventType + 97;
        AFLogger = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public final void setCollectIMEI(boolean z7) {
        AFInAppEventType = (AFLogger + 95) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("setCollectIMEI", String.valueOf(z7));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z7));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z7));
        int i7 = AFLogger + 67;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    @Deprecated
    public final void setCollectOaid(boolean z7) {
        AFLogger = (AFInAppEventType + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("setCollectOaid", String.valueOf(z7));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z7));
        AFLogger = (AFInAppEventType + 85) % 128;
    }

    @Override
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        AFAdRevenueData(new Object[]{this, appsFlyerConsent}, -683364181, 683364184, System.identityHashCode(this));
    }

    @Override
    public final void setCurrencyCode(String str) {
        AFAdRevenueData(new Object[]{this, str}, 709829413, -709829403, System.identityHashCode(this));
    }

    @Override
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            AFInAppEventType = (AFLogger + 61) % 128;
            if (!getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder(krlBPZZeK.KYdgaOLdNRTy);
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component1());
            AFAdRevenueData(context, AFh1wSDK.getRevenue);
            AFAdRevenueData().AFKeystoreWrapper().getRevenue();
            if (referrer == null) {
                referrer = BuildConfig.FLAVOR;
            }
            if (context instanceof Activity) {
                AFLogger = (AFInAppEventType + 37) % 128;
                ((Activity) context).getIntent();
            }
            AFAdRevenueData(new Object[]{this, context, referrer}, -1040148397, 1040148409, System.identityHashCode(this));
            AFInAppEventType = (AFLogger + 67) % 128;
        }
    }

    @Override
    public final void setCustomerUserId(String str) {
        AFInAppEventType = (AFLogger + 81) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i7 = AFInAppEventType + 111;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 90 / 0;
        }
    }

    @Override
    public final void setDebugLog(boolean z7) {
        AFLogger.LogLevel logLevel;
        AFInAppEventType = (AFLogger + 9) % 128;
        if (z7) {
            logLevel = AFLogger.LogLevel.DEBUG;
            AFLogger = (AFInAppEventType + 55) % 128;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override
    public final void setDisableAdvertisingIdentifiers(boolean z7) {
        AFAdRevenueData(new Object[]{this, Boolean.valueOf(z7)}, -1490728992, 1490729001, System.identityHashCode(this));
    }

    @Override
    public final void setDisableNetworkData(boolean z7) {
        int i7 = AFInAppEventType + 45;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z7)));
            getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z7);
            int i8 = 1 / 0;
        } else {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z7)));
            getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z7);
        }
        AFLogger = (AFInAppEventType + 91) % 128;
    }

    @Override
    public final void setExtension(String str) {
        AFAdRevenueData(new Object[]{this, str}, 153321320, -153321297, System.identityHashCode(this));
    }

    @Override
    public final void setHost(String str, String str2) {
        String strTrim;
        if (!(!AFj1eSDK.AFAdRevenueData(str2))) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            AFLogger = (AFInAppEventType + 67) % 128;
            return;
        }
        int i7 = (AFInAppEventType + 69) % 128;
        AFLogger = i7;
        if (str != null) {
            AFInAppEventType = (i7 + 5) % 128;
            strTrim = str.trim();
        } else {
            strTrim = BuildConfig.FLAVOR;
        }
        AFe1ySDK.getMediationNetwork(new AFd1bSDK(strTrim, str2.trim()));
    }

    @Override
    public final void setImeiData(String str) {
        int i7 = AFInAppEventType + 85;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            AFd1sSDK aFd1sSDKCopy = AFAdRevenueData().copy();
            String[] strArr = new String[0];
            strArr[0] = str;
            aFd1sSDKCopy.AFAdRevenueData("setImeiData", strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setImeiData", str);
        }
        AFAdRevenueData().AFKeystoreWrapper().getRevenue(str);
    }

    @Override
    public final void setIsUpdate(boolean z7) {
        AFLogger = (AFInAppEventType + 3) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("setIsUpdate", String.valueOf(z7));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z7);
        int i7 = AFLogger + 103;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z7;
        AFLogger = (AFInAppEventType + 3) % 128;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            AFLogger = (AFInAppEventType + 65) % 128;
            z7 = true;
        } else {
            z7 = false;
        }
        AFAdRevenueData().copy().AFAdRevenueData("log", String.valueOf(z7));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (!(!z7)) {
            AFAdRevenueData().force().component1();
        } else {
            AFAdRevenueData().force().getMediationNetwork();
        }
    }

    @Override
    public final void setMinTimeBetweenSessions(int i7) {
        AFLogger = (AFInAppEventType + 59) % 128;
        this.component2 = TimeUnit.SECONDS.toMillis(i7);
        int i8 = AFLogger + 23;
        AFInAppEventType = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void setOaidData(String str) {
        AFLogger = (AFInAppEventType + 47) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("setOaidData", str);
        AFb1iSDK.AFAdRevenueData = str;
        int i7 = AFLogger + 59;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 68 / 0;
        }
    }

    @Override
    public final void setOneLinkCustomDomain(String... strArr) {
        AFAdRevenueData(new Object[]{this, strArr}, 1589809094, -1589809076, System.identityHashCode(this));
    }

    @Override
    public final void setOutOfStore(String str) {
        AFLogger = (AFInAppEventType + 83) % 128;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            AFLogger = (AFInAppEventType + 59) % 128;
        } else {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        }
    }

    @Override
    public final void setPartnerData(String str, Map<String, Object> map) {
        String strConcat;
        AFc1oSDK aFc1oSDKAfErrorLog = AFAdRevenueData().afErrorLog();
        if (aFc1oSDKAfErrorLog.AFAdRevenueData == null) {
            aFc1oSDKAfErrorLog.AFAdRevenueData = new AFb1vSDK();
        }
        AFb1vSDK aFb1vSDK = aFc1oSDKAfErrorLog.AFAdRevenueData;
        if (str != null) {
            AFLogger = (AFInAppEventType + R.styleable.AppCompatTheme_windowActionModeOverlay) % 128;
            if (!str.isEmpty()) {
                if (map == null || map.isEmpty()) {
                    if (aFb1vSDK.getMonetizationNetwork.remove(str) == null) {
                        strConcat = "Partner data is missing or `null`";
                    } else {
                        strConcat = "Cleared partner data for ".concat(str);
                        AFInAppEventType = (AFLogger + R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
                    }
                    AFLogger.afWarnLog(strConcat);
                    return;
                }
                StringBuilder sb = new StringBuilder(QcdySgfdST.XZKtvOMQa);
                sb.append(str);
                sb.append(": ");
                sb.append(map);
                AFLogger.afDebugLog(sb.toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFb1vSDK.getMonetizationNetwork.put(str, map);
                    aFb1vSDK.getRevenue.remove(str);
                    AFInAppEventType = (AFLogger + 67) % 128;
                    return;
                } else {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    HashMap map2 = new HashMap();
                    map2.put("error", vxbbqXNtzfMxs.daWrLVJqGKA.concat(String.valueOf(length)));
                    aFb1vSDK.getRevenue.put(str, map2);
                    return;
                }
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
        AFInAppEventType = (AFLogger + 13) % 128;
    }

    @Override
    public final void setPhoneNumber(String str) {
        AFInAppEventType = (AFLogger + 75) % 128;
        AFAdRevenueData().afErrorLog().getMediationNetwork = AFj1hSDK.getCurrencyIso4217Code(str);
        int i7 = AFLogger + 45;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void setPluginInfo(PluginInfo pluginInfo) {
        AFInAppEventType = (AFLogger + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
        Objects.requireNonNull(pluginInfo);
        AFAdRevenueData().i().getMediationNetwork(pluginInfo);
        int i7 = AFLogger + 35;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void setPreinstallAttribution(java.lang.String r5, java.lang.String r6, java.lang.String r7) throws org.json.JSONException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.setPreinstallAttribution(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger = (AFInAppEventType + 51) % 128;
        AFLogger.afDebugLog(String.format(dHkZSUxHu.hknHqD, Arrays.toString(strArr)));
        AFa1oSDK aFa1oSDKE = AFAdRevenueData().e();
        aFa1oSDKE.component3.clear();
        aFa1oSDKE.component3.addAll(Arrays.asList(strArr));
        int i7 = AFLogger + 83;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 74 / 0;
        }
    }

    @Override
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        AFLogger = (AFInAppEventType + 45) % 128;
        setSharingFilterForPartners(strArr);
        AFInAppEventType = (AFLogger + 79) % 128;
    }

    @Override
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i7 = AFLogger + 73;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            setSharingFilterForPartners("all");
            return;
        }
        String[] strArr = new String[1];
        strArr[1] = "all";
        setSharingFilterForPartners(strArr);
    }

    @Override
    public final void setSharingFilterForPartners(String... strArr) {
        AFAdRevenueData().afErrorLog().getMonetizationNetwork = new AFb1qSDK(strArr);
        AFInAppEventType = (AFLogger + 93) % 128;
    }

    @Override
    public final void setUserEmails(String... strArr) {
        int i7 = AFInAppEventType + 87;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            AFAdRevenueData().copy().AFAdRevenueData("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            AFAdRevenueData().copy().AFAdRevenueData("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i8 = 9 / 0;
        }
    }

    @Override
    public final void start(Context context) {
        int i7 = AFLogger + 73;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            start(context, null);
            throw null;
        }
        start(context, null);
        int i8 = AFLogger + 75;
        AFInAppEventType = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 98 / 0;
        }
    }

    @Override
    public final void stop(boolean z7, Context context) {
        getCurrencyIso4217Code(context);
        final AFc1fSDK aFc1fSDKAFAdRevenueData = AFAdRevenueData();
        aFc1fSDKAFAdRevenueData.AFKeystoreWrapper().getRevenue(z7);
        aFc1fSDKAFAdRevenueData.AFAdRevenueData().submit(new Runnable() {
            @Override
            public final void run() {
                AFa1zSDK.getCurrencyIso4217Code(aFc1fSDKAFAdRevenueData);
            }
        });
        if (z7) {
            aFc1fSDKAFAdRevenueData.component1().getCurrencyIso4217Code("is_stop_tracking_used", true);
            AFInAppEventType = (AFLogger + 101) % 128;
        }
        int i7 = AFLogger + 35;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 27 / 0;
        }
    }

    @Override
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i7 = AFLogger + 69;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            throw null;
        }
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i8 = AFInAppEventType + 55;
        AFLogger = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 55 / 0;
        }
    }

    @Override
    public final void unregisterConversionListener() {
        AFInAppEventType = (AFLogger + 51) % 128;
        AFAdRevenueData().copy().AFAdRevenueData("unregisterConversionListener", new String[0]);
        this.getRevenue = null;
        int i7 = AFLogger + 25;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void updateServerUninstallToken(Context context, String str) {
        getCurrencyIso4217Code(context);
        AFg1zSDK aFg1zSDK = new AFg1zSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFh1zSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFh1zSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFf1bSDK mediationNetwork = aFg1zSDK.getMediationNetwork();
        if (mediationNetwork == null || !str.equals(mediationNetwork.AFAdRevenueData)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z7 = mediationNetwork == null || jCurrentTimeMillis - mediationNetwork.getMediationNetwork > TimeUnit.SECONDS.toMillis(2L);
            AFf1bSDK aFf1bSDK = new AFf1bSDK(str, jCurrentTimeMillis, !z7);
            aFg1zSDK.getMediationNetwork.getRevenue("afUninstallToken", aFf1bSDK.AFAdRevenueData);
            aFg1zSDK.getMediationNetwork.AFAdRevenueData("afUninstallToken_received_time", aFf1bSDK.getMediationNetwork);
            aFg1zSDK.getMediationNetwork.getCurrencyIso4217Code("afUninstallToken_queued", aFf1bSDK.getRevenue);
            if (z7) {
                AFc1fSDK aFc1fSDKAFAdRevenueData = getMonetizationNetwork().AFAdRevenueData();
                AFf1vSDK aFf1vSDK = new AFf1vSDK(str, aFc1fSDKAFAdRevenueData);
                AFe1sSDK aFe1sSDKEquals = aFc1fSDKAFAdRevenueData.equals();
                aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFf1vSDK));
            }
        }
    }

    @Override
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1sSDK aFe1sSDKEquals = this.toString.equals();
        aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(new AFe1dSDK(this.toString, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i7 = AFLogger + 9;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void waitForCustomerUserId(boolean z7) {
        int i7 = AFLogger + 105;
        AFInAppEventType = i7 % 128;
        int i8 = i7 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z7)), true);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z7);
    }

    private static void a(String str, int i7, Object[] objArr) {
        int i8 = ($11 + 11) % 128;
        $10 = i8;
        char[] charArray = str;
        if (str != null) {
            $11 = (i8 + 89) % 128;
            charArray = str.toCharArray();
        }
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArrAFAdRevenueData = AFk1nSDK.AFAdRevenueData(AFKeystoreWrapper ^ (-2935546008654967297L), charArray, i7);
        aFk1nSDK.getRevenue = 4;
        while (true) {
            int i9 = aFk1nSDK.getRevenue;
            if (i9 >= cArrAFAdRevenueData.length) {
                objArr[0] = new String(cArrAFAdRevenueData, 4, cArrAFAdRevenueData.length - 4);
                return;
            }
            $11 = ($10 + 93) % 128;
            aFk1nSDK.getMediationNetwork = i9 - 4;
            cArrAFAdRevenueData[i9] = (char) ((cArrAFAdRevenueData[i9] ^ cArrAFAdRevenueData[i9 % 4]) ^ (r2 * (AFKeystoreWrapper ^ (-2935546008654967297L))));
            aFk1nSDK.getRevenue = i9 + 1;
        }
    }

    public void equals() {
        AFAdRevenueData(new Object[]{this}, 1516479698, -1516479692, System.identityHashCode(this));
    }

    private static void getMonetizationNetwork(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            int i7 = 0;
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                while (i7 < jSONArray.length()) {
                    int i8 = AFInAppEventType + 39;
                    AFLogger = i8 % 128;
                    if (i8 % 2 != 0) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i7)));
                        i7 += 74;
                    } else {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i7)));
                        i7++;
                    }
                }
            } catch (JSONException e7) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e7);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (!(!itKeys2.hasNext()) && str == null) {
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    AFLogger = (AFInAppEventType + 39) % 128;
                    int i9 = 0;
                    while (i9 < jSONArray2.length()) {
                        int i10 = AFInAppEventType + 43;
                        AFLogger = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (jSONArray2.getLong(i9) != ((Long) arrayList.get(1)).longValue()) {
                                if (jSONArray2.getLong(i9) != ((Long) arrayList.get(1)).longValue() || jSONArray2.getLong(i9) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                    break;
                                }
                                i9++;
                                str = next;
                            }
                        } else if (jSONArray2.getLong(i9) != ((Long) arrayList.get(0)).longValue()) {
                            if (jSONArray2.getLong(i9) != ((Long) arrayList.get(1)).longValue()) {
                            }
                        }
                    }
                } catch (JSONException e8) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e8);
                }
            }
            break loop2;
        }
        if (str != null) {
            int i11 = AFLogger + 37;
            AFInAppEventType = i11 % 128;
            if (i11 % 2 == 0) {
                jSONObject.remove(str);
                int i12 = 46 / 0;
            } else {
                jSONObject.remove(str);
            }
        }
        int i13 = AFLogger + 99;
        AFInAppEventType = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    private AFj1ySDK[] component1() {
        AFLogger = (AFInAppEventType + 37) % 128;
        AFj1ySDK[] revenue = AFAdRevenueData().AFInAppEventParameterName().getRevenue();
        AFLogger = (AFInAppEventType + 57) % 128;
        return revenue;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i7 = AFInAppEventType + 75;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i8 = 82 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
    }

    @Override
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFAdRevenueData(new Object[]{this, context, str, str2, str3, str4, str5, map}, 1523375125, -1523375108, System.identityHashCode(this));
    }

    final void component2() {
        AFAdRevenueData(new Object[]{this}, 905210815, -905210799, System.identityHashCode(this));
    }

    @Override
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        getCurrencyIso4217Code(context);
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        aFh1mSDK.component3 = str;
        aFh1mSDK.AFAdRevenueData = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFh1zSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1mSDK.getCurrencyIso4217Code(mapSingletonMap);
        }
        aFh1mSDK.getRevenue = map2;
        AFd1sSDK aFd1sSDKCopy = AFAdRevenueData().copy();
        Map map5 = aFh1mSDK.getRevenue;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1sSDKCopy.AFAdRevenueData("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            AFAdRevenueData(context, AFh1wSDK.logEvent);
        }
        AFAdRevenueData(aFh1mSDK, areAllFieldsValid(context));
    }

    @Override
    public final void start(Context context, String str) {
        AFInAppEventType = (AFLogger + 77) % 128;
        start(context, str, null);
        int i7 = AFLogger + 83;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j7) {
        AFAdRevenueData(new Object[]{this, deepLinkListener, Long.valueOf(j7)}, -447082179, 447082194, System.identityHashCode(this));
    }

    @Override
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFAdRevenueData().copy().AFAdRevenueData(sMlEMqrxoGI.txDZXT, (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            AFLogger = (AFInAppEventType + 65) % 128;
            if (AnonymousClass4.getMediationNetwork[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1hSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                AFInAppEventType = (AFLogger + 105) % 128;
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
    }

    private void component4() {
        AFLogger = (AFInAppEventType + 61) % 128;
        try {
            final AFi1kSDK aFi1kSDKAfInfoLog = AFAdRevenueData().afInfoLog();
            if (aFi1kSDKAfInfoLog != null) {
                AFLogger = (AFInAppEventType + 21) % 128;
                if (aFi1kSDKAfInfoLog.getRevenue()) {
                    AFInAppEventType = (AFLogger + 43) % 128;
                    aFi1kSDKAfInfoLog.getMediationNetwork(new AFi1gSDK() {
                        @Override
                        public final void onRequestFinished() {
                            this.f13642a.getRevenue(aFi1kSDKAfInfoLog);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog(uCYQMIHsy.WNan.concat(String.valueOf(th)));
        }
    }

    public static void getCurrencyIso4217Code(AFc1fSDK aFc1fSDK) {
        int i7 = AFLogger + 107;
        AFInAppEventType = i7 % 128;
        int i8 = i7 % 2;
        aFc1fSDK.registerClient().getCurrencyIso4217Code();
        if (i8 == 0) {
            throw null;
        }
    }

    private static void getMediationNetwork(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                AFLogger = (AFInAppEventType + 31) % 128;
                if (Build.VERSION.SDK_INT < 31) {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFInAppEventType = (AFLogger + 41) % 128;
                        AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    }
                }
                AFLogger = (AFInAppEventType + 55) % 128;
                if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                }
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, uCYQMIHsy.cSIs, th);
        }
    }

    @Override
    public final void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        AFAdRevenueData(new Object[]{this, context, str, appsFlyerRequestListener}, -1649362845, 1649362858, System.identityHashCode(this));
    }

    private static void copydefault() {
        AFAdRevenueData(new Object[0], -847594301, 847594306, (int) System.currentTimeMillis());
    }

    private static void getCurrencyIso4217Code(String str, boolean z7) {
        int i7 = AFLogger + 57;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z7);
        } else {
            AppsFlyerProperties.getInstance().set(str, z7);
            throw null;
        }
    }

    public final boolean getCurrencyIso4217Code() {
        if (getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            int i7 = AFLogger + 3;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            if (((String) AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis())) == null) {
                int i8 = AFInAppEventType + 89;
                AFLogger = i8 % 128;
                return i8 % 2 == 0;
            }
        }
        return false;
    }

    private AFh1vSDK areAllFieldsValid(Context context) {
        int i7 = AFLogger + 29;
        int i8 = i7 % 128;
        AFInAppEventType = i8;
        if (i7 % 2 == 0) {
            boolean z7 = context instanceof Activity;
            throw null;
        }
        if (!(context instanceof Activity)) {
            int i9 = i8 + 69;
            AFLogger = i9 % 128;
            if (i9 % 2 == 0) {
                return null;
            }
            throw null;
        }
        AFh1vSDK aFh1vSDK = new AFh1vSDK((Activity) context, AFAdRevenueData().unregisterClient());
        int i10 = AFInAppEventType + 77;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
        return aFh1vSDK;
    }

    final void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        AFj1ySDK[] aFj1ySDKArrComponent1;
        int length;
        Context context = AFAdRevenueData().AFLogger().getMonetizationNetwork;
        boolean z7 = true;
        if (context == null) {
            AFLogger.INSTANCE.d(AFh1zSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
            return;
        }
        String revenue = AFAdRevenueData().AFKeystoreWrapper().getRevenue();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1tSDK.AFAdRevenueData;
        if (revenue != null) {
            AFLogger = (AFInAppEventType + 35) % 128;
            if (revenue.length() != 0) {
                AFc1sSDK aFc1sSDK = (AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this));
                AppsFlyerProperties.getInstance().saveProperties(aFc1sSDK);
                if (!AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1zSDK aFh1zSDK = AFh1zSDK.GENERAL;
                    StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
                    sb.append(context.getClass().getName());
                    aFLogger.i(aFh1zSDK, sb.toString(), true);
                }
                boolean zAFAdRevenueData = aFh1tSDK.AFAdRevenueData();
                Map<String, ?> monetizationNetwork = getMonetizationNetwork(aFh1tSDK);
                if (AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork()) {
                    AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                }
                int revenue2 = getRevenue(aFc1sSDK, false);
                getCurrencyIso4217Code(monetizationNetwork);
                AFa1tSDK aFa1tSDK = new AFa1tSDK(AFAdRevenueData(), aFh1tSDK.getCurrencyIso4217Code(monetizationNetwork).getRevenue(revenue2), AFAdRevenueData().d().getCurrencyIso4217Code());
                if (zAFAdRevenueData) {
                    int i7 = AFLogger + 33;
                    AFInAppEventType = i7 % 128;
                    if (i7 % 2 == 0) {
                        aFj1ySDKArrComponent1 = component1();
                        length = aFj1ySDKArrComponent1.length;
                    } else {
                        aFj1ySDKArrComponent1 = component1();
                        length = aFj1ySDKArrComponent1.length;
                    }
                    boolean z8 = false;
                    for (int i8 = 0; i8 < length; i8++) {
                        AFInAppEventType = (AFLogger + 1) % 128;
                        AFj1ySDK aFj1ySDK = aFj1ySDKArrComponent1[i8];
                        if (aFj1ySDK.component1 == AFj1ySDK.AFa1vSDK.STARTED) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFh1zSDK aFh1zSDK2 = AFh1zSDK.REFERRER;
                            StringBuilder sb2 = new StringBuilder("Failed to get ");
                            sb2.append(aFj1ySDK.component4);
                            sb2.append(" referrer, wait ...");
                            aFLogger2.d(aFh1zSDK2, sb2.toString());
                            z8 = true;
                        }
                    }
                    if (AFAdRevenueData().d().AFAdRevenueData()) {
                        int i9 = AFInAppEventType + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                        AFLogger = i9 % 128;
                        int i10 = i9 % 2;
                        AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                        z8 = true;
                    }
                    if (!AFAdRevenueData().AFKeystoreWrapper().getMonetizationNetwork()) {
                        z7 = z8;
                    }
                } else {
                    z7 = false;
                }
                AFj1gSDK.getMediationNetwork(AFAdRevenueData().getMonetizationNetwork(), aFa1tSDK, !z7 ? 0L : 500L, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger aFLogger3 = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK3 = AFh1zSDK.GENERAL;
        aFLogger3.i(aFh1zSDK3, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        aFLogger3.i(aFh1zSDK3, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    private static void component3(Context context) {
        AFLogger = (AFInAppEventType + 43) % 128;
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i7 = AFLogger + 61;
                AFInAppEventType = i7 % 128;
                if (i7 % 2 != 0) {
                    AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                } else {
                    AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    throw null;
                }
            }
            if (Build.VERSION.SDK_INT > 32) {
                AFInAppEventType = (AFLogger + 15) % 128;
                if (listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                    return;
                }
                AFLogger.INSTANCE.w(AFh1zSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
            }
        } catch (Exception e7) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Exception while validation permissions. ", e7);
        }
    }

    static void areAllFieldsValid() {
        AFKeystoreWrapper = 8149218016702064934L;
    }

    public void getRevenue(AFi1kSDK aFi1kSDK) {
        AFe1eSDK aFe1eSDK = new AFe1eSDK(aFi1kSDK, AFAdRevenueData().getRevenue(), AFAdRevenueData());
        AFe1sSDK aFe1sSDKEquals = AFAdRevenueData().equals();
        aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFe1eSDK));
        int i7 = AFLogger + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static String getMediationNetwork(SimpleDateFormat simpleDateFormat, long j7) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j7));
        int i7 = AFLogger + 79;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private String getMediationNetwork(Context context, String str) {
        int i7 = AFInAppEventType;
        AFLogger = (i7 + R.styleable.AppCompatTheme_toolbarStyle) % 128;
        if (context != null) {
            getCurrencyIso4217Code(context);
            String currencyIso4217Code = AFAdRevenueData().getRevenue().getCurrencyIso4217Code(str);
            AFLogger = (AFInAppEventType + 89) % 128;
            return currencyIso4217Code;
        }
        int i8 = i7 + 81;
        AFLogger = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static String getMonetizationNetwork(String str) {
        AFInAppEventType = (AFLogger + 45) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i7 = AFLogger + 65;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 14 / 0;
        }
        return string;
    }

    private static void getRevenue(AFh1tSDK aFh1tSDK, AFh1vSDK aFh1vSDK) {
        int i7 = (AFInAppEventType + 41) % 128;
        AFLogger = i7;
        if (aFh1vSDK != null) {
            int i8 = i7 + 81;
            AFInAppEventType = i8 % 128;
            if (i8 % 2 != 0) {
                aFh1tSDK.getMediationNetwork = aFh1vSDK.getMediationNetwork;
                aFh1tSDK.component4 = aFh1vSDK.AFAdRevenueData;
            } else {
                aFh1tSDK.getMediationNetwork = aFh1vSDK.getMediationNetwork;
                aFh1tSDK.component4 = aFh1vSDK.AFAdRevenueData;
                throw null;
            }
        }
    }

    private static int getMediationNetwork(AFc1sSDK aFc1sSDK, boolean z7) {
        int i7 = AFLogger + 99;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            return getRevenue(aFc1sSDK, "appsFlyerInAppEventCount", z7);
        }
        getRevenue(aFc1sSDK, "appsFlyerInAppEventCount", z7);
        throw null;
    }

    public void getMonetizationNetwork(boolean z7) {
        if (z7) {
            AFInAppEventType = (AFLogger + 83) % 128;
            AFAdRevenueData().force().getMonetizationNetwork();
            int i7 = AFInAppEventType + 73;
            AFLogger = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        AFAdRevenueData().force().AFAdRevenueData();
    }

    private static Object getMediationNetwork(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        AFLogger = (AFInAppEventType + 79) % 128;
        String currencyIso4217Code = aFa1zSDK.AFAdRevenueData().AFInAppEventType().getCurrencyIso4217Code();
        int i7 = AFInAppEventType + 95;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    class C0145AFa1zSDK implements AFe1qSDK {
        C0145AFa1zSDK() {
        }

        @Override
        public final void AFAdRevenueData(AFe1tSDK<?> aFe1tSDK) {
        }

        @Override
        public final void getMediationNetwork(AFe1tSDK<?> aFe1tSDK) {
            if (aFe1tSDK instanceof AFf1rSDK) {
                AFa1zSDK.this.AFAdRevenueData().component2().getRevenue(((AFf1tSDK) aFe1tSDK).component1.component1);
            }
        }

        @Override
        public final void getRevenue(AFe1tSDK<?> aFe1tSDK, AFe1rSDK aFe1rSDK) {
            JSONObject currencyIso4217Code;
            AFf1bSDK mediationNetwork;
            if (!(aFe1tSDK instanceof AFf1tSDK)) {
                if (!(aFe1tSDK instanceof AFg1nSDK) || aFe1rSDK == AFe1rSDK.SUCCESS) {
                    return;
                }
                AFg1qSDK aFg1qSDK = new AFg1qSDK(AFa1zSDK.this.AFAdRevenueData());
                AFe1sSDK aFe1sSDKEquals = AFa1zSDK.this.AFAdRevenueData().equals();
                aFe1sSDKEquals.getRevenue.execute(aFe1sSDKEquals.new AnonymousClass3(aFg1qSDK));
                return;
            }
            AFf1tSDK aFf1tSDK = (AFf1tSDK) aFe1tSDK;
            boolean z7 = aFe1tSDK instanceof AFf1rSDK;
            if (z7 && getRevenue()) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1tSDK;
                if (aFf1rSDK.getMediationNetwork == AFe1rSDK.SUCCESS || aFf1rSDK.getCurrencyIso4217Code == 1) {
                    AFg1nSDK aFg1nSDK = new AFg1nSDK(aFf1rSDK, AFa1zSDK.this.AFAdRevenueData().component1());
                    AFe1sSDK aFe1sSDKEquals2 = AFa1zSDK.this.AFAdRevenueData().equals();
                    aFe1sSDKEquals2.getRevenue.execute(aFe1sSDKEquals2.new AnonymousClass3(aFg1nSDK));
                }
            }
            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                AFa1zSDK aFa1zSDK = AFa1zSDK.this;
                ((AFc1sSDK) AFa1zSDK.AFAdRevenueData(new Object[]{aFa1zSDK, aFa1zSDK.component3}, -1165261210, 1165261210, System.identityHashCode(aFa1zSDK))).getRevenue("sentSuccessfully", "true");
                if (!(aFe1tSDK instanceof AFf1vSDK) && (mediationNetwork = new AFg1zSDK(AFa1zSDK.this.component3).getMediationNetwork()) != null && mediationNetwork.getRevenue) {
                    String str = mediationNetwork.AFAdRevenueData;
                    AFLogger.INSTANCE.d(AFh1zSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFc1fSDK aFc1fSDKAFAdRevenueData = AFa1zSDK.getMonetizationNetwork().AFAdRevenueData();
                    AFf1vSDK aFf1vSDK = new AFf1vSDK(str, aFc1fSDKAFAdRevenueData);
                    AFe1sSDK aFe1sSDKEquals3 = aFc1fSDKAFAdRevenueData.equals();
                    aFe1sSDKEquals3.getRevenue.execute(aFe1sSDKEquals3.new AnonymousClass3(aFf1vSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1kSDK) aFf1tSDK).component2;
                if (responseNetwork != null && (currencyIso4217Code = AFa1qSDK.getCurrencyIso4217Code((String) responseNetwork.getBody())) != null) {
                    AFa1zSDK.this.component1 = currencyIso4217Code.optBoolean("send_background", false);
                }
                if (z7) {
                    AFa1zSDK.this.getCurrencyIso4217Code = System.currentTimeMillis();
                }
            }
        }

        private boolean getRevenue() {
            return AFa1zSDK.this.getRevenue != null;
        }
    }

    private static void getMediationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFh1zSDK, sb.toString());
        AFInAppEventType = (AFLogger + 37) % 128;
    }

    private void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        boolean z7;
        if (aFh1tSDK.component3 == null) {
            AFInAppEventType = (AFLogger + 3) % 128;
            z7 = true;
        } else {
            z7 = false;
        }
        if (!getCurrencyIso4217Code()) {
            if (z7) {
                int i7 = AFInAppEventType + 87;
                AFLogger = i7 % 128;
                if (i7 % 2 == 0 ? AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true) : AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, false)) {
                    AFInAppEventType = (AFLogger + 25) % 128;
                    if (component3()) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFh1tSDK.AFAdRevenueData;
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            return;
                        }
                        return;
                    }
                } else {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                }
                this.component4 = System.currentTimeMillis();
            }
            AFj1gSDK.getMediationNetwork(AFAdRevenueData().getMonetizationNetwork(), new AFa1vSDK(aFh1tSDK), 0L, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
    }

    private void getMonetizationNetwork(Context context, String str, Map<String, Object> map) {
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        aFh1mSDK.component3 = str;
        aFh1mSDK.getRevenue = map;
        AFAdRevenueData(aFh1mSDK, areAllFieldsValid(context));
        AFLogger = (AFInAppEventType + 109) % 128;
    }

    private boolean component3() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 1228084525, -1228084511, System.identityHashCode(this))).booleanValue();
    }

    private void getRevenue(com.appsflyer.AppsFlyerConversionListener r3) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.getRevenue(com.appsflyer.AppsFlyerConversionListener):void");
    }

    final Map<String, Object> getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        String str;
        Context context = AFAdRevenueData().AFLogger().getMonetizationNetwork;
        AFc1sSDK aFc1sSDK = (AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this));
        AFg1tSDK aFg1tSDKComponent3 = AFAdRevenueData().component3();
        boolean mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        boolean zAFAdRevenueData = aFh1tSDK.AFAdRevenueData();
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a("逘遹욥ꈚ噸龕⣊ص̕婊ଋ\ue956뚤⧚꙯緩", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (mediationNetwork) {
                AFLogger = (AFInAppEventType + 91) % 128;
                AFLogger.INSTANCE.i(AFh1zSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (zAFAdRevenueData) {
                    int i7 = AFLogger + 101;
                    AFInAppEventType = i7 % 128;
                    if (i7 % 2 != 0) {
                        str = "Launch";
                    } else {
                        throw null;
                    }
                } else {
                    str = aFh1tSDK.component3;
                }
                sb.append(str);
                aFLogger.i(aFh1zSDK, sb.toString(), true);
                AFInAppEventType = (AFLogger + 19) % 128;
            }
            component3(context);
            int revenue = getRevenue(aFc1sSDK, zAFAdRevenueData);
            int mediationNetwork2 = getMediationNetwork(aFc1sSDK, aFh1tSDK.component3 != null);
            if (zAFAdRevenueData && revenue == 1) {
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            aFg1tSDKComponent3.AFAdRevenueData(map, revenue, mediationNetwork2);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
        }
        return map;
    }

    private static Object getRevenue(Object[] objArr) {
        AFa1zSDK aFa1zSDK = (AFa1zSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFLogger = (AFInAppEventType + 17) % 128;
        aFa1zSDK.getCurrencyIso4217Code(context);
        AFc1sSDK aFc1sSDKComponent1 = aFa1zSDK.AFAdRevenueData().component1();
        int i7 = AFLogger + 39;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            return aFc1sSDKComponent1;
        }
        throw null;
    }

    public static int getRevenue(AFc1sSDK aFc1sSDK, boolean z7) {
        int i7 = AFLogger + 103;
        AFInAppEventType = i7 % 128;
        int i8 = i7 % 2;
        int revenue = getRevenue(aFc1sSDK, krlBPZZeK.PWambCEpoqLofe, z7);
        if (i8 == 0) {
            int i9 = 50 / 0;
        }
        return revenue;
    }

    private static int getRevenue(AFc1sSDK aFc1sSDK, String str, boolean z7) {
        int iAFAdRevenueData = aFc1sSDK.AFAdRevenueData(str, 0);
        if (z7) {
            int i7 = AFInAppEventType + 7;
            AFLogger = i7 % 128;
            iAFAdRevenueData = i7 % 2 != 0 ? iAFAdRevenueData + 26 : iAFAdRevenueData + 1;
            aFc1sSDK.getMonetizationNetwork(str, iAFAdRevenueData);
        }
        int i8 = AFInAppEventType + 23;
        AFLogger = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 48 / 0;
        }
        return iAFAdRevenueData;
    }

    public final AFc1sSDK getRevenue(Context context) {
        return (AFc1sSDK) AFAdRevenueData(new Object[]{this, context}, -1165261210, 1165261210, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(Map<String, Object> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        int i7 = AFLogger + 33;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                return;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        if (map.get("advertiserId") != null) {
            int i8 = AFLogger + 75;
            AFInAppEventType = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    if (AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().afErrorLog().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                        AFInAppEventType = (AFLogger + 53) % 128;
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    }
                    if (AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().AFKeystoreWrapper().AFAdRevenueData())) {
                        AFLogger = (AFInAppEventType + 51) % 128;
                        if (map.remove("imei") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                            return;
                        }
                        return;
                    }
                    return;
                }
                AFj1eSDK.getCurrencyIso4217Code(AFAdRevenueData().afErrorLog().getCurrencyIso4217Code);
                throw null;
            } catch (Exception e7) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e7);
            }
        }
    }

    private static void getRevenue(String str) {
        AFAdRevenueData(new Object[]{str}, 1419097846, -1419097845, (int) System.currentTimeMillis());
    }

    public static String getRevenue() {
        return (String) AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis());
    }

    public static boolean getMonetizationNetwork(Context context) throws PackageManager.NameNotFoundException {
        try {
            if (C1818c.n().g(context) == 0) {
                AFLogger = (AFInAppEventType + R.styleable.AppCompatTheme_windowFixedHeightMinor) % 128;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i7 = AFLogger + 29;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 94 / 0;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e7) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e7);
            return false;
        }
    }

    private static Object getMonetizationNetwork(Object[] objArr) {
        AFLogger = (AFInAppEventType + 75) % 128;
        AFLogger.INSTANCE.w(AFh1zSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i7 = AFLogger + R.styleable.AppCompatTheme_windowActionBar;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public void getMonetizationNetwork(AFf1qSDK aFf1qSDK) {
        AFAdRevenueData(new Object[]{this, aFf1qSDK}, 26715012, -26714991, System.identityHashCode(this));
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        String string = null;
        if (activity != null) {
            int i7 = AFLogger + 97;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 != 0) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null && (string = extras.getString("af")) != null) {
                            AFLogger = (AFInAppEventType + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
                            AFLogger.INSTANCE.w(AFh1zSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                            extras.remove("af");
                            activity.setIntent(intent.putExtras(extras));
                        }
                        AFLogger = (AFInAppEventType + R.styleable.AppCompatTheme_windowFixedHeightMinor) % 128;
                    } catch (Throwable th) {
                        AFLogger.INSTANCE.e(AFh1zSDK.ENGAGEMENT, th.getMessage(), th);
                    }
                }
            } else {
                activity.getIntent();
                throw null;
            }
        }
        return string;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (new JSONObject(str).has("pid")) {
                AFLogger = (AFInAppEventType + 85) % 128;
                getMediationNetwork("preInstallName", str);
                return null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i7 = AFLogger + R.styleable.AppCompatTheme_tooltipFrameBackground;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (JSONException e7) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e7);
            return null;
        }
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, 2030646709, -2030646687, (int) System.currentTimeMillis())).booleanValue();
    }

    public final AFc1fSDK AFAdRevenueData() {
        int i7 = AFInAppEventType;
        AFc1gSDK aFc1gSDK = this.toString;
        int i8 = i7 + 37;
        AFLogger = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 89 / 0;
        }
        return aFc1gSDK;
    }

    private static Object AFAdRevenueData(Object[] objArr) {
        int i7 = AFLogger + 89;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            return getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
        }
        int i8 = 98 / 0;
        return getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
    }

    private void AFAdRevenueData(Context context, AFh1wSDK aFh1wSDK) {
        AFInAppEventType = (AFLogger + 95) % 128;
        getCurrencyIso4217Code(context);
        AFh1uSDK aFh1uSDKComponent2 = AFAdRevenueData().component2();
        AFg1aSDK revenue = AFg1aSDK.getRevenue(context);
        if (aFh1uSDKComponent2.getCurrencyIso4217Code()) {
            aFh1uSDKComponent2.getMediationNetwork.put("api_name", aFh1wSDK.toString());
            aFh1uSDKComponent2.getMediationNetwork(revenue);
            AFInAppEventType = (AFLogger + 91) % 128;
        }
        aFh1uSDKComponent2.AFAdRevenueData();
        int i7 = AFLogger + 85;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 20 / 0;
        }
    }

    final void AFAdRevenueData(AFh1tSDK aFh1tSDK, AFh1vSDK aFh1vSDK) {
        AFLogger = (AFInAppEventType + 109) % 128;
        getRevenue(aFh1tSDK, aFh1vSDK);
        if (AFAdRevenueData().AFKeystoreWrapper().getRevenue() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1tSDK.AFAdRevenueData;
            if (appsFlyerRequestListener != null) {
                AFInAppEventType = (AFLogger + R.styleable.AppCompatTheme_windowFixedHeightMinor) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component1());
        if (referrer == null) {
            referrer = BuildConfig.FLAVOR;
        }
        aFh1tSDK.areAllFieldsValid = referrer;
        getMediationNetwork(aFh1tSDK);
    }

    private void AFAdRevenueData(String str) {
        AFh1tSDK revenue = new AFh1sSDK().getRevenue(AFAdRevenueData().getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        revenue.areAllFieldsValid = str;
        if (str != null) {
            int i7 = AFInAppEventType + 45;
            AFLogger = i7 % 128;
            if (i7 % 2 != 0) {
                if (str.length() <= 3) {
                    return;
                }
            } else if (str.length() <= 5) {
                return;
            }
            AFInAppEventType = (AFLogger + 71) % 128;
            if (AFAdRevenueData().AFInAppEventParameterName().getRevenue(revenue)) {
                AFj1gSDK.getMediationNetwork(AFAdRevenueData().getMonetizationNetwork(), new AFa1vSDK(revenue), 5L, TimeUnit.MILLISECONDS);
                AFInAppEventType = (AFLogger + 57) % 128;
            }
        }
    }

    public static java.util.Map<java.lang.String, java.lang.Object> AFAdRevenueData(java.util.Map<java.lang.String, java.lang.Object> r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1zSDK.AFAdRevenueData(java.util.Map):java.util.Map");
    }

    public static String AFAdRevenueData(AFc1sSDK aFc1sSDK, String str) {
        int i7 = AFInAppEventType + 41;
        AFLogger = i7 % 128;
        int i8 = i7 % 2;
        String str2 = jUbDmI.fhikn;
        if (i8 == 0) {
            String strAFAdRevenueData = aFc1sSDK.AFAdRevenueData(str2, (String) null);
            if (strAFAdRevenueData != null) {
                AFInAppEventType = (AFLogger + 53) % 128;
                return strAFAdRevenueData;
            }
            aFc1sSDK.getRevenue(str2, str);
            return str;
        }
        aFc1sSDK.AFAdRevenueData(str2, (String) null);
        throw null;
    }

    private void AFAdRevenueData(Context context, String str) {
        AFAdRevenueData(new Object[]{this, context, str}, -1040148397, 1040148409, System.identityHashCode(this));
    }
}
