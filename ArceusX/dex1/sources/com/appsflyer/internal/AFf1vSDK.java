package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class AFf1vSDK extends AFf1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 1;
    private static int AFInAppEventType;
    private static char[] AFKeystoreWrapper = {33841, 33847, 45515, 45518, 33844, 45533, 33846, 45505, 45517};
    private static char registerClient = 33846;
    private final AFg1tSDK AFLogger;
    private final AFc1hSDK copy;
    private final AFc1kSDK copydefault;
    private final String equals;

    public AFf1vSDK(String str, AFc1fSDK aFc1fSDK) {
        super(new AFg1xSDK(), aFc1fSDK, str);
        this.copydefault = aFc1fSDK.getRevenue();
        this.copy = aFc1fSDK.AFLogger();
        this.equals = str;
        this.AFLogger = aFc1fSDK.component3();
    }

    private static void a(String str, int i7, byte b2, Object[] objArr) {
        int i8;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        char[] cArr = AFKeystoreWrapper;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + R.styleable.AppCompatTheme_windowActionModeOverlay;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2[i9] = (char) (cArr[i9] ^ (-2775045471812025291L));
                } else {
                    cArr2[i9] = (char) (cArr[i9] ^ (-2775045471812025291L));
                    i9++;
                }
            }
            cArr = cArr2;
        }
        char c2 = (char) ((-2775045471812025291L) ^ registerClient);
        char[] cArr3 = new char[i7];
        if (i7 % 2 != 0) {
            i8 = i7 - 1;
            cArr3[i8] = (char) (charArray[i8] - b2);
        } else {
            i8 = i7;
        }
        if (i8 > 1) {
            aFk1rSDK.getRevenue = 0;
            while (true) {
                int i11 = aFk1rSDK.getRevenue;
                if (i11 >= i8) {
                    break;
                }
                char c3 = charArray[i11];
                aFk1rSDK.AFAdRevenueData = c3;
                char c7 = charArray[i11 + 1];
                aFk1rSDK.getMediationNetwork = c7;
                if (c3 == c7) {
                    cArr3[i11] = (char) (c3 - b2);
                    cArr3[i11 + 1] = (char) (c7 - b2);
                } else {
                    int i12 = c3 / c2;
                    aFk1rSDK.getMonetizationNetwork = i12;
                    int i13 = c3 % c2;
                    aFk1rSDK.component3 = i13;
                    int i14 = c7 / c2;
                    aFk1rSDK.getCurrencyIso4217Code = i14;
                    int i15 = c7 % c2;
                    aFk1rSDK.component2 = i15;
                    if (i13 == i15) {
                        $10 = ($11 + 105) % 128;
                        int i16 = ((i12 + c2) - 1) % c2;
                        aFk1rSDK.getMonetizationNetwork = i16;
                        int i17 = ((i14 + c2) - 1) % c2;
                        aFk1rSDK.getCurrencyIso4217Code = i17;
                        cArr3[i11] = cArr[(i16 * c2) + i13];
                        cArr3[i11 + 1] = cArr[(i17 * c2) + i15];
                    } else if (i12 == i14) {
                        $11 = ($10 + 85) % 128;
                        int i18 = ((i13 + c2) - 1) % c2;
                        aFk1rSDK.component3 = i18;
                        int i19 = ((i15 + c2) - 1) % c2;
                        aFk1rSDK.component2 = i19;
                        cArr3[i11] = cArr[(i12 * c2) + i18];
                        cArr3[i11 + 1] = cArr[(i14 * c2) + i19];
                    } else {
                        cArr3[i11] = cArr[(i12 * c2) + i15];
                        cArr3[i11 + 1] = cArr[(i14 * c2) + i13];
                    }
                }
                aFk1rSDK.getRevenue = i11 + 2;
            }
        }
        int i20 = 0;
        while (i20 < i7) {
            cArr3[i20] = (char) (cArr3[i20] ^ 13722);
            i20++;
            $10 = ($11 + 101) % 128;
        }
        objArr[0] = new String(cArr3);
    }

    private void equals() {
        AFc1sSDK aFc1sSDK;
        boolean z7;
        int i7 = AFInAppEventType + 97;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            aFc1sSDK = this.toString;
            z7 = false;
        } else {
            aFc1sSDK = this.toString;
            z7 = true;
        }
        aFc1sSDK.getCurrencyIso4217Code("sentRegisterRequestToAF", z7);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    public static Object getMonetizationNetwork(Object[] objArr, int i7, int i8, int i9) {
        return getRevenue(objArr);
    }

    @Override
    protected final void AFAdRevenueData(AFh1tSDK aFh1tSDK) {
        getMonetizationNetwork(new Object[]{this, aFh1tSDK}, -1677420347, 1677420347, System.identityHashCode(this));
    }

    @Override
    protected final void component3(AFh1tSDK aFh1tSDK) {
        String currencyIso4217Code = this.copydefault.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            AFInAppEventType = (AFInAppEventParameterName + 11) % 128;
            aFh1tSDK.getMonetizationNetwork("advertiserId", currencyIso4217Code);
        }
        AFInAppEventParameterName = (AFInAppEventType + 57) % 128;
    }

    @Override
    protected final boolean copydefault() {
        AFInAppEventParameterName = (AFInAppEventType + R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
        return false;
    }

    @Override
    public final void getCurrencyIso4217Code() {
        AFInAppEventParameterName = (AFInAppEventType + 101) % 128;
        super.getCurrencyIso4217Code();
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).component2;
        if (responseNetwork != null) {
            int i7 = AFInAppEventType + 11;
            AFInAppEventParameterName = i7 % 128;
            if (i7 % 2 == 0) {
                responseNetwork.isSuccessful();
                throw null;
            }
            if (responseNetwork.isSuccessful()) {
                equals();
            }
        }
        int i8 = AFInAppEventType + 47;
        AFInAppEventParameterName = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override
    protected final void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        int i7 = AFInAppEventParameterName + 67;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 48 / 0;
        }
    }

    @Override
    protected final void getRevenue(AFh1tSDK aFh1tSDK) {
        super.getRevenue(aFh1tSDK);
        Context context = this.copy.getMonetizationNetwork;
        AFa1zSDK monetizationNetwork = AFa1zSDK.getMonetizationNetwork();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (monetizationNetwork.getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFh1tSDK.getMonetizationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFh1tSDK.getMonetizationNetwork("app_version_name", packageInfo.versionName);
            aFh1tSDK.getMonetizationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFh1tSDK.getMonetizationNetwork("installDate", AFa1zSDK.getMediationNetwork(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFLogger.getRevenue(aFh1tSDK.getMonetizationNetwork);
        aFh1tSDK.getMonetizationNetwork.remove("ivc");
        String str = (String) AFa1zSDK.AFAdRevenueData(new Object[0], -775349742, 775349749, (int) System.currentTimeMillis());
        if (str != null) {
            aFh1tSDK.getMonetizationNetwork("appUserId", str);
        }
        try {
            aFh1tSDK.getMonetizationNetwork("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a("\u0002\b\u0004\u0006㘕", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, (byte) (23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr);
            aFh1tSDK.getMonetizationNetwork(((String) objArr[0]).intern(), Build.BRAND);
            AFInAppEventParameterName = (AFInAppEventType + 43) % 128;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFh1tSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFb1lSDK aFb1lSDKK_ = AFb1iSDK.k_(context.getContentResolver());
        if (aFb1lSDKK_ != null) {
            AFInAppEventType = (AFInAppEventParameterName + R.styleable.AppCompatTheme_toolbarStyle) % 128;
            aFh1tSDK.getMonetizationNetwork("amazon_aid", aFb1lSDKK_.getMonetizationNetwork);
            aFh1tSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(aFb1lSDKK_.getCurrencyIso4217Code));
        }
        aFh1tSDK.getMonetizationNetwork("devkey", ((AFe1kSDK) this).component4.getRevenue());
        aFh1tSDK.getMonetizationNetwork("uid", AFb1kSDK.getMonetizationNetwork(this.toString));
        aFh1tSDK.getMonetizationNetwork("af_gcm_token", this.equals);
        aFh1tSDK.getMonetizationNetwork("launch_counter", Integer.toString(this.toString.AFAdRevenueData("appsFlyerCount", 0)));
        aFh1tSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strComponent1 = this.copydefault.component1();
        if (strComponent1 != null) {
            int i7 = AFInAppEventType + 81;
            AFInAppEventParameterName = i7 % 128;
            if (i7 % 2 == 0) {
                aFh1tSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, strComponent1);
                int i8 = 82 / 0;
            } else {
                aFh1tSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, strComponent1);
            }
        }
        int i9 = AFInAppEventParameterName + 67;
        AFInAppEventType = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override
    protected final void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        int i7 = AFInAppEventParameterName + 95;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override
    protected final void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        int i7 = AFInAppEventParameterName + R.styleable.AppCompatTheme_toolbarStyle;
        AFInAppEventType = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static Object getRevenue(Object[] objArr) {
        int i7 = AFInAppEventType + 43;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
