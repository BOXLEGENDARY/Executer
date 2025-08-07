package com.appsflyer.internal;

import S5.Cg.XjqcfAbdbc;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import g1.kQwt.YGBtcyQ;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class AFd1tSDK implements AFd1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AFAdRevenueData;
    private static int component3 = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private final AFc1fSDK areAllFieldsValid;
    private List<String> getMediationNetwork = new ArrayList();
    private boolean getRevenue = true;
    private final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    private SecureRandom component1 = new SecureRandom();
    private boolean component4 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component2 = false;

    static {
        component4();
        AFAdRevenueData = 98166;
        copydefault = (equals + 99) % 128;
    }

    public AFd1tSDK(AFc1fSDK aFc1fSDK) {
        this.areAllFieldsValid = aFc1fSDK;
    }

    private boolean AFLogger() {
        AFc1sSDK aFc1sSDKComponent1;
        boolean z7;
        int i7 = equals + 33;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            aFc1sSDKComponent1 = this.areAllFieldsValid.component1();
            z7 = true;
        } else {
            aFc1sSDKComponent1 = this.areAllFieldsValid.component1();
            z7 = false;
        }
        return aFc1sSDKComponent1.AFAdRevenueData("participantInProxy", z7);
    }

    private static void a(boolean z7, String str, int i7, int i8, int i9, Object[] objArr) {
        $10 = ($11 + 89) % 128;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr2 = new char[i9];
        aFk1qSDK.getRevenue = 0;
        $10 = ($11 + 103) % 128;
        while (true) {
            int i10 = aFk1qSDK.getRevenue;
            if (i10 >= i9) {
                break;
            }
            char c2 = cArr[i10];
            aFk1qSDK.getMediationNetwork = c2;
            char c3 = (char) (c2 + i7);
            cArr2[i10] = c3;
            cArr2[i10] = (char) (c3 - ((int) (component3 ^ 6822747700087044992L)));
            aFk1qSDK.getRevenue = i10 + 1;
        }
        if (i8 > 0) {
            aFk1qSDK.getMonetizationNetwork = i8;
            char[] cArr3 = new char[i9];
            System.arraycopy(cArr2, 0, cArr3, 0, i9);
            int i11 = aFk1qSDK.getMonetizationNetwork;
            System.arraycopy(cArr3, 0, cArr2, i9 - i11, i11);
            int i12 = aFk1qSDK.getMonetizationNetwork;
            System.arraycopy(cArr3, i12, cArr2, 0, i9 - i12);
        }
        if (z7) {
            char[] cArr4 = new char[i9];
            aFk1qSDK.getRevenue = 0;
            while (true) {
                int i13 = aFk1qSDK.getRevenue;
                if (i13 >= i9) {
                    break;
                }
                int i14 = $10 + 67;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr4[i13] = cArr2[i9 >> i13];
                } else {
                    cArr4[i13] = cArr2[(i9 - i13) - 1];
                    i13++;
                }
                aFk1qSDK.getRevenue = i13;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static String component1() {
        int i7 = copydefault;
        int i8 = i7 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        equals = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 59 / 0;
        }
        equals = (i7 + 61) % 128;
        return "6.16.2";
    }

    private synchronized void component2() {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1tSDK.component2():void");
    }

    private float component3() {
        equals = (copydefault + 5) % 128;
        float fNextFloat = this.component1.nextFloat();
        int i7 = copydefault + 83;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return fNextFloat;
        }
        throw null;
    }

    static void component4() {
        component3 = 2144156640;
    }

    private synchronized void copy() {
        this.getMediationNetwork = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (equals + 77) % 128;
    }

    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        copydefault = (equals + 81) % 128;
        this.getCurrencyIso4217Code.put("data", this.getMediationNetwork);
        copy();
        map = this.getCurrencyIso4217Code;
        copydefault = (equals + 33) % 128;
        return map;
    }

    private boolean equals() {
        if (!this.component4) {
            return false;
        }
        if (!this.getRevenue) {
            copydefault = (equals + 53) % 128;
            if (!this.component2) {
                return false;
            }
        }
        int i7 = copydefault + 81;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static Object getMediationNetwork(Object[] objArr) {
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        int i7 = equals + 17;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            aFd1tSDK.getMonetizationNetwork((AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.getMediationNetwork}, -778147058, 778147060, (int) System.currentTimeMillis()), (AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.AFAdRevenueData}, -778147058, 778147060, (int) System.currentTimeMillis()));
            throw null;
        }
        boolean monetizationNetwork = aFd1tSDK.getMonetizationNetwork((AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.getMediationNetwork}, -778147058, 778147060, (int) System.currentTimeMillis()), (AFh1bSDK) getRevenue(new Object[]{aFd1tSDK.areAllFieldsValid.component4().getMonetizationNetwork.AFAdRevenueData}, -778147058, 778147060, (int) System.currentTimeMillis()));
        if (monetizationNetwork) {
            aFd1tSDK.component2();
        } else {
            aFd1tSDK.getMonetizationNetwork();
            aFd1tSDK.AFAdRevenueData();
            copydefault = (equals + 61) % 128;
        }
        return Boolean.valueOf(monetizationNetwork);
    }

    public static Object getRevenue(Object[] objArr, int i7, int i8, int i9) {
        int i10 = ~i7;
        int i11 = (i7 * 273) + (i8 * (-271)) + (((~((~i8) | i10 | (~i9))) | (~(i7 | i8 | i9))) * (-272)) + (((~(i10 | i9)) | (~(i10 | i8))) * (-272)) + (((~(i7 | i9)) | i8) * 272);
        if (i11 == 1) {
            return getMonetizationNetwork(objArr);
        }
        if (i11 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i11 == 3) {
            return getMediationNetwork(objArr);
        }
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        int i12 = copydefault + 15;
        equals = i12 % 128;
        if (i12 % 2 == 0) {
            aFd1tSDK.component4 = true;
        } else {
            aFd1tSDK.component4 = false;
        }
        return null;
    }

    private Map<String, Object> p_(String str, PackageManager packageManager) {
        int i7 = copydefault + 111;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            q_(str, packageManager, this.areAllFieldsValid.AFKeystoreWrapper(), this.areAllFieldsValid.afErrorLog());
            copydefault();
            throw null;
        }
        q_(str, packageManager, this.areAllFieldsValid.AFKeystoreWrapper(), this.areAllFieldsValid.afErrorLog());
        Map<String, Object> mapCopydefault = copydefault();
        equals = (copydefault + 109) % 128;
        return mapCopydefault;
    }

    private synchronized void q_(String str, PackageManager packageManager, AFf1iSDK aFf1iSDK, AFc1oSDK aFc1oSDK) {
        copydefault = (equals + 7) % 128;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.getCurrencyIso4217Code.clear();
        if (string != null) {
            try {
                this.getCurrencyIso4217Code.putAll(AFg1mSDK.getMonetizationNetwork(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
            getCurrencyIso4217Code(AFa1zSDK.getMonetizationNetwork().AFAdRevenueData().getRevenue().getCurrencyIso4217Code(), aFf1iSDK.AFAdRevenueData(), aFc1oSDK.getCurrencyIso4217Code);
            StringBuilder sb = new StringBuilder("6.16.2.");
            sb.append(AFa1zSDK.getMonetizationNetwork);
            getMonetizationNetwork(sb.toString(), monetizationNetwork.AFAdRevenueData().AFKeystoreWrapper().getRevenue(), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i7 = packageManager.getPackageInfo(str, 0).versionCode;
                getCurrencyIso4217Code(str, String.valueOf(i7), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getCurrencyIso4217Code).toString());
            copydefault = (equals + 19) % 128;
        }
        this.getCurrencyIso4217Code.put("launch_counter", String.valueOf(this.areAllFieldsValid.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0)));
    }

    private void registerClient() {
        equals = (copydefault + 23) % 128;
        this.areAllFieldsValid.component1().getMediationNetwork("participantInProxy");
        equals = (copydefault + 41) % 128;
    }

    @Override
    public final synchronized void AFAdRevenueData() {
        if (this.component2) {
            this.component2 = false;
            this.getRevenue = false;
            getMediationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        }
        int i7 = equals;
        int i8 = i7 + 95;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        if (!this.getRevenue) {
            copydefault = (i7 + 3) % 128;
            return;
        }
        this.component2 = false;
        this.getRevenue = false;
        try {
            getMediationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.PROXY, XjqcfAbdbc.AhlsryLMytXP, th, true, true, true);
            return;
        }
    }

    @Override
    public final boolean areAllFieldsValid() {
        return ((Boolean) getRevenue(new Object[]{this}, -1674862948, 1674862949, System.identityHashCode(this))).booleanValue();
    }

    @Override
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i7 = equals + 105;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getMediationNetwork("server_request", str, strArr);
        } else {
            getMediationNetwork("server_request", str, str2);
        }
        int i8 = copydefault + 19;
        equals = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 43 / 0;
        }
    }

    @Override
    public final void getMonetizationNetwork(String str, int i7, String str2) {
        equals = (copydefault + 111) % 128;
        getMediationNetwork("server_response", str, String.valueOf(i7), str2);
        int i8 = equals + 9;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public final void o_(String str, PackageManager packageManager) {
        int i7 = equals + R.styleable.AppCompatTheme_windowActionBar;
        copydefault = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                this.areAllFieldsValid.getMediationNetwork().getRevenue(p_(str, packageManager), this.areAllFieldsValid.AFKeystoreWrapper().getRevenue());
                throw null;
            }
            final AFd1qSDK revenue = this.areAllFieldsValid.getMediationNetwork().getRevenue(p_(str, packageManager), this.areAllFieldsValid.AFKeystoreWrapper().getRevenue());
            if (revenue != null) {
                this.areAllFieldsValid.AFAdRevenueData().execute(new Runnable() {
                    @Override
                    public final void run() {
                        revenue.getCurrencyIso4217Code();
                    }
                });
                return;
            }
            AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException(wtzgsqRsIZB.QCEACtgesm));
            int i8 = equals + 65;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 98 / 0;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a(false, "\u0007�\ufffb\u000b\ufffa", 198 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, 4 - Process.getGidForName(BuildConfig.FLAVOR), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getCurrencyIso4217Code.put("model", Build.MODEL);
            this.getCurrencyIso4217Code.put("platform", "Android");
            this.getCurrencyIso4217Code.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    equals = (copydefault + 49) % 128;
                    if (str.length() > 0) {
                        int i7 = copydefault + 83;
                        equals = i7 % 128;
                        if (i7 % 2 != 0) {
                            this.getCurrencyIso4217Code.put("advertiserId", str);
                        } else {
                            this.getCurrencyIso4217Code.put("advertiserId", str);
                            throw null;
                        }
                    }
                } finally {
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.getCurrencyIso4217Code.put("imei", str2);
            }
            if (str3 != null) {
                int i8 = equals + 99;
                copydefault = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 21 / 0;
                    if (str3.length() > 0) {
                        copydefault = (equals + 49) % 128;
                        this.getCurrencyIso4217Code.put(YGBtcyQ.SLFT, str3);
                    }
                } else if (str3.length() > 0) {
                    copydefault = (equals + 49) % 128;
                    this.getCurrencyIso4217Code.put(YGBtcyQ.SLFT, str3);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override
    public final void getMonetizationNetwork(String str, String str2) {
        int i7 = copydefault + 23;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            getMediationNetwork(null, str, str2);
        } else {
            getMediationNetwork(null, str, str2);
        }
        int i8 = equals + 87;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public final void getRevenue() {
        getRevenue(new Object[]{this}, 2011204770, -2011204770, System.identityHashCode(this));
    }

    @Override
    public final synchronized void getMonetizationNetwork() {
        try {
            int i7 = equals + 11;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                this.getRevenue = true;
                getMediationNetwork();
            } else {
                this.getRevenue = false;
                getMediationNetwork();
            }
            copy();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final void AFAdRevenueData(String str, String... strArr) {
        equals = (copydefault + 61) % 128;
        getMediationNetwork("public_api_call", str, strArr);
        copydefault = (equals + 13) % 128;
    }

    private static Object getMonetizationNetwork(Object[] objArr) {
        AFd1tSDK aFd1tSDK = (AFd1tSDK) objArr[0];
        int i7 = copydefault;
        equals = (i7 + 35) % 128;
        boolean z7 = aFd1tSDK.component2;
        int i8 = i7 + 97;
        equals = i8 % 128;
        if (i8 % 2 != 0) {
            return Boolean.valueOf(z7);
        }
        throw null;
    }

    @Override
    public final void AFAdRevenueData(Throwable th) {
        StackTraceElement[] stackTrace;
        copydefault = (equals + 99) % 128;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            copydefault = (equals + 19) % 128;
        }
        getMediationNetwork("exception", simpleName, getMonetizationNetwork(message, stackTrace));
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        try {
            int i7 = copydefault + R.styleable.AppCompatTheme_tooltipFrameBackground;
            equals = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    this.getCurrencyIso4217Code.put("sdk_version", str);
                    if (str2 != null && str2.length() > 0) {
                        int i8 = copydefault + 25;
                        equals = i8 % 128;
                        if (i8 % 2 != 0) {
                            this.getCurrencyIso4217Code.put("devkey", str2);
                        } else {
                            this.getCurrencyIso4217Code.put("devkey", str2);
                            throw null;
                        }
                    }
                    if (str3 != null && str3.length() > 0) {
                        copydefault = (equals + 3) % 128;
                        this.getCurrencyIso4217Code.put("originalAppsFlyerId", str3);
                    }
                    if (str4 != null && str4.length() > 0) {
                        this.getCurrencyIso4217Code.put("uid", str4);
                    }
                } else {
                    this.getCurrencyIso4217Code.put("sdk_version", str);
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    private synchronized void getCurrencyIso4217Code(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1tSDK.getCurrencyIso4217Code(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private boolean AFAdRevenueData(AFh1bSDK aFh1bSDK, AFh1bSDK aFh1bSDK2) {
        boolean zAFLogger;
        if (!aFh1bSDK.equals(aFh1bSDK2)) {
            zAFLogger = AFAdRevenueData(aFh1bSDK.getMonetizationNetwork);
            getCurrencyIso4217Code(zAFLogger);
        } else {
            int i7 = copydefault + R.styleable.AppCompatTheme_tooltipFrameBackground;
            equals = i7 % 128;
            if (i7 % 2 != 0) {
                zAFLogger = AFLogger();
            } else {
                AFLogger();
                throw null;
            }
        }
        equals = (copydefault + 107) % 128;
        return zAFLogger;
    }

    @Override
    public final synchronized void getMediationNetwork() {
        copydefault = (equals + 87) % 128;
        this.getCurrencyIso4217Code.clear();
        this.getMediationNetwork.clear();
        this.getMonetizationNetwork = 0;
        int i7 = equals + 41;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static String[] getMonetizationNetwork(String str, StackTraceElement[] stackTraceElementArr) {
        equals = (copydefault + 39) % 128;
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        int i7 = 1;
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        while (i7 < stackTraceElementArr.length) {
            int i8 = copydefault + 33;
            equals = i8 % 128;
            if (i8 % 2 == 0) {
                strArr[i7] = stackTraceElementArr[i7].toString();
                i7 += 104;
            } else {
                strArr[i7] = stackTraceElementArr[i7].toString();
                i7++;
            }
        }
        copydefault = (equals + 81) % 128;
        return strArr;
    }

    private boolean AFAdRevenueData(float f7) {
        double d7 = f7;
        if (d7 < 1.0d) {
            if (d7 > 0.0d) {
                return component3() <= f7;
            }
            copydefault = (equals + 107) % 128;
            return false;
        }
        int i7 = copydefault + 67;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private synchronized void getMediationNetwork(String str, String str2, String... strArr) {
        String string;
        equals = (copydefault + 95) % 128;
        if (equals()) {
            equals = (copydefault + 63) % 128;
            if (this.getMonetizationNetwork < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(jCurrentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_6.16.2 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(strJoin);
                        string = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_6.16.2 ");
                        sb2.append(strJoin);
                        string = sb2.toString();
                        copydefault = (equals + 71) % 128;
                    }
                    int length = this.getMonetizationNetwork + (string.length() << 1);
                    int i7 = AFAdRevenueData;
                    boolean z7 = false;
                    if (length > i7) {
                        string = string.substring(0, (i7 - this.getMonetizationNetwork) / 2);
                        copydefault = (equals + 95) % 128;
                        z7 = true;
                    }
                    this.getMediationNetwork.add(string);
                    this.getMonetizationNetwork += string.length() << 1;
                    if (z7) {
                        int i8 = equals + 89;
                        copydefault = i8 % 128;
                        if (i8 % 2 != 0) {
                            this.getMediationNetwork.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMonetizationNetwork >>= 24906;
                        } else {
                            this.getMediationNetwork.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMonetizationNetwork += 138;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private synchronized boolean getMonetizationNetwork(AFh1bSDK aFh1bSDK, AFh1bSDK aFh1bSDK2) {
        if (aFh1bSDK == null) {
            registerClient();
            return false;
        }
        if (!aFh1bSDK.getCurrencyIso4217Code()) {
            copydefault = (equals + 21) % 128;
            return false;
        }
        if (this.areAllFieldsValid.getRevenue().getRevenue.AFAdRevenueData("appsFlyerCount", 0) > aFh1bSDK.getMediationNetwork) {
            int i7 = copydefault + 63;
            equals = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!AFAdRevenueData(aFh1bSDK, aFh1bSDK2)) {
            copydefault = (equals + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
            return false;
        }
        if (!getCurrencyIso4217Code(aFh1bSDK.getCurrencyIso4217Code)) {
            int i8 = copydefault + 67;
            equals = i8 % 128;
            return i8 % 2 == 0;
        }
        if (getMonetizationNetwork(aFh1bSDK.getRevenue)) {
            return true;
        }
        copydefault = (equals + 63) % 128;
        return false;
    }

    private boolean getCurrencyIso4217Code(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1tSDK.getCurrencyIso4217Code(java.lang.String):boolean");
    }

    private static java.lang.Object getCurrencyIso4217Code(java.lang.Object[] r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1tSDK.getCurrencyIso4217Code(java.lang.Object[]):java.lang.Object");
    }

    private static AFh1bSDK getMediationNetwork(AFi1zSDK aFi1zSDK) {
        return (AFh1bSDK) getRevenue(new Object[]{aFi1zSDK}, -778147058, 778147060, (int) System.currentTimeMillis());
    }

    private void getCurrencyIso4217Code(boolean z7) {
        equals = (copydefault + 75) % 128;
        this.areAllFieldsValid.component1().getCurrencyIso4217Code("participantInProxy", z7);
        int i7 = copydefault + 49;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static boolean getMonetizationNetwork(String str) {
        int i7 = copydefault + 105;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            if (AFj1eSDK.AFAdRevenueData(str)) {
                return true;
            }
            new AFd1rSDK();
            boolean zAFAdRevenueData = AFd1rSDK.AFAdRevenueData(component1(), str);
            equals = (copydefault + 7) % 128;
            return zAFAdRevenueData;
        }
        AFj1eSDK.AFAdRevenueData(str);
        throw null;
    }

    @Override
    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) getRevenue(new Object[]{this}, 1641812601, -1641812598, System.identityHashCode(this))).booleanValue();
    }
}
