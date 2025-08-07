package com.appsflyer.internal;

import Z.tNT.PexNRiLSd;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.appsflyer.internal.AFf1aSDK;
import com.github.luben.zstd.BuildConfig;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import z3.AdxZ.bpTQi;

public final class AFg1uSDK implements AFg1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFInAppEventParameterName = {100, -122, -120, 73, -112, 96, 108, -127, Byte.MIN_VALUE, 77, -108, -108, -100, -106, 99, -104, 122, -123, -107, -107};
    private static int AFKeystoreWrapper = 828425900;
    private static int AFLogger = -463888315;

    private static short[] f13595d = null;

    private static int f13596i = 1;
    private static int registerClient = 586908576;

    private static int f13597w;
    private final Context AFAdRevenueData;
    private final P9.h AFInAppEventType;
    private final AFc1sSDK areAllFieldsValid;
    private final AFh1uSDK component1;
    private final AFi1ySDK component2;
    private final AFc1kSDK component3;
    private final AFg1vSDK component4;
    private final AFc1oSDK copy;
    private final AFc1hSDK copydefault;
    private final AFf1iSDK equals;
    private final String getCurrencyIso4217Code;
    private final AFj1rSDK getMediationNetwork;
    private final AFf1aSDK getMonetizationNetwork;
    private final AFi1sSDK getRevenue;
    private final AFg1ySDK hashCode;
    private final P9.h toString;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "getCurrencyIso4217Code", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.jvm.internal.l implements Function0<SimpleDateFormat> {
        public static final AnonymousClass1 getRevenue = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getRevenue", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends kotlin.jvm.internal.l implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass3 getMonetizationNetwork = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1uSDK(String str, Context context, AFi1sSDK aFi1sSDK, AFf1aSDK aFf1aSDK, AFj1rSDK aFj1rSDK, AFg1vSDK aFg1vSDK, AFh1uSDK aFh1uSDK, AFc1sSDK aFc1sSDK, AFc1kSDK aFc1kSDK, AFi1ySDK aFi1ySDK, AFf1iSDK aFf1iSDK, AFc1hSDK aFc1hSDK, AFg1ySDK aFg1ySDK, AFc1oSDK aFc1oSDK) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFi1sSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFf1aSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFj1rSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFg1vSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFh1uSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1sSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFi1ySDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFf1iSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1hSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFg1ySDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1oSDK, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = context;
        this.getRevenue = aFi1sSDK;
        this.getMonetizationNetwork = aFf1aSDK;
        this.getMediationNetwork = aFj1rSDK;
        this.component4 = aFg1vSDK;
        this.component1 = aFh1uSDK;
        this.areAllFieldsValid = aFc1sSDK;
        this.component3 = aFc1kSDK;
        this.component2 = aFi1ySDK;
        this.equals = aFf1iSDK;
        this.copydefault = aFc1hSDK;
        this.hashCode = aFg1ySDK;
        this.copy = aFc1oSDK;
        this.toString = P9.i.b(AnonymousClass3.getMonetizationNetwork);
        this.AFInAppEventType = P9.i.b(AnonymousClass1.getRevenue);
    }

    private final void AFAdRevenueData(Map<String, Object> map) {
        try {
            long j7 = this.AFAdRevenueData.getPackageManager().getPackageInfo(this.AFAdRevenueData.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j7)));
            int i7 = f13597w + 21;
            f13596i = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        } catch (Exception e7) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e7);
        }
    }

    private static void AFInAppEventParameterName(Map<String, Object> map) {
        getRevenue(new Object[]{map}, 1729638864, -1729638864, (int) System.currentTimeMillis());
    }

    private final boolean AFInAppEventType() throws PackageManager.NameNotFoundException {
        if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            f13596i = (f13597w + 19) % 128;
            if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i7 = f13597w + 93;
                f13596i = i7 % 128;
                int i8 = i7 % 2;
                AFa1zSDK.getMonetizationNetwork();
                if (i8 == 0) {
                    AFa1zSDK.getMonetizationNetwork(this.AFAdRevenueData);
                    throw null;
                }
                if (AFa1zSDK.getMonetizationNetwork(this.AFAdRevenueData)) {
                    return false;
                }
            }
        }
        int i9 = f13597w + R.styleable.AppCompatTheme_windowActionBar;
        f13596i = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private void AFKeystoreWrapper(java.util.Map<java.lang.String, java.lang.Object> r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.AFKeystoreWrapper(java.util.Map):void");
    }

    private final String AFLogger() {
        String strAFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.AFAdRevenueData.getContentResolver(), "android_id");
            if (string != null) {
                f13597w = (f13596i + 33) % 128;
                return string;
            }
        } catch (Exception e7) {
            AFLogger.afErrorLog(e7.getMessage(), e7);
        }
        if (strAFAdRevenueData == null) {
            return null;
        }
        int i7 = f13597w + 43;
        f13596i = i7 % 128;
        if (i7 % 2 != 0) {
            AFLogger.afDebugLog("use cached AndroidId: " + strAFAdRevenueData);
            return strAFAdRevenueData;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + strAFAdRevenueData);
        throw null;
    }

    private static void a(int i7, int i8, int i9, byte b2, short s7, Object[] objArr) {
        int i10;
        boolean z7;
        char c2;
        int length;
        byte[] bArr;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        StringBuilder sb = new StringBuilder();
        int i11 = ((int) (registerClient ^ (-1123129136953719915L))) + i9;
        boolean z8 = i11 == -1;
        if (z8) {
            byte[] bArr2 = AFInAppEventParameterName;
            if (bArr2 != null) {
                int i12 = $10 + 59;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                }
                for (int i13 = 0; i13 < length; i13++) {
                    bArr[i13] = (byte) (bArr2[i13] ^ (-1123129136953719915L));
                }
                bArr2 = bArr;
            }
            i11 = bArr2 != null ? (byte) (((byte) (AFInAppEventParameterName[((int) (AFLogger ^ (-1123129136953719915L))) + i8] ^ (-1123129136953719915L))) + ((int) (registerClient ^ (-1123129136953719915L)))) : (short) (((short) (f13595d[((int) (AFLogger ^ (-1123129136953719915L))) + i8] ^ (-1123129136953719915L))) + ((int) (registerClient ^ (-1123129136953719915L))));
        }
        if (i11 > 0) {
            int i14 = ((i8 + i11) - 2) + ((int) (AFLogger ^ (-1123129136953719915L)));
            if (z8) {
                $11 = ($10 + 105) % 128;
                i10 = 1;
            } else {
                i10 = 0;
            }
            aFk1pSDK.getCurrencyIso4217Code = i14 + i10;
            char c3 = (char) (((int) (AFKeystoreWrapper ^ (-1123129136953719915L))) + i7);
            aFk1pSDK.AFAdRevenueData = c3;
            sb.append(c3);
            aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
            byte[] bArr3 = AFInAppEventParameterName;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                $10 = ($11 + 79) % 128;
                for (int i15 = 0; i15 < length2; i15++) {
                    bArr4[i15] = (byte) (bArr3[i15] ^ (-1123129136953719915L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $11 = ($10 + 35) % 128;
                z7 = true;
            } else {
                z7 = false;
            }
            aFk1pSDK.getMediationNetwork = 1;
            while (aFk1pSDK.getMediationNetwork < i11) {
                if (z7) {
                    int i16 = $10 + R.styleable.AppCompatTheme_windowFixedWidthMinor;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        byte[] bArr5 = AFInAppEventParameterName;
                        int i17 = aFk1pSDK.getCurrencyIso4217Code;
                        aFk1pSDK.getCurrencyIso4217Code = 0;
                        c2 = (char) (aFk1pSDK.getMonetizationNetwork >>> (((byte) (((byte) (bArr5[i17] - (-1123129136953719915L))) >>> s7)) ^ b2));
                    } else {
                        byte[] bArr6 = AFInAppEventParameterName;
                        aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                        c2 = (char) (aFk1pSDK.getMonetizationNetwork + (((byte) (((byte) (bArr6[r9] ^ (-1123129136953719915L))) + s7)) ^ b2));
                    }
                    aFk1pSDK.AFAdRevenueData = c2;
                } else {
                    short[] sArr = f13595d;
                    aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                    aFk1pSDK.AFAdRevenueData = (char) (aFk1pSDK.getMonetizationNetwork + (((short) (((short) (sArr[r9] ^ (-1123129136953719915L))) + s7)) ^ b2));
                }
                sb.append(aFk1pSDK.AFAdRevenueData);
                aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
                aFk1pSDK.getMediationNetwork++;
            }
        }
        objArr[0] = sb.toString();
    }

    private void afDebugLog(Map<String, Object> map) {
        int i7 = f13596i + 59;
        f13597w = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
            this.areAllFieldsValid.getCurrencyIso4217Code("is_stop_tracking_used");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        if (this.areAllFieldsValid.getCurrencyIso4217Code("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.areAllFieldsValid.AFAdRevenueData("is_stop_tracking_used", false)));
            f13596i = (f13597w + 35) % 128;
        }
        f13597w = (f13596i + 49) % 128;
    }

    private void afErrorLog(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        AFb1cSDK aFb1cSDK = this.copy.areAllFieldsValid;
        if (aFb1cSDK != null) {
            map.put("app_set_id", kotlin.collections.F.k(new Pair[]{P9.t.a("scope", Integer.valueOf(aFb1cSDK.getCurrencyIso4217Code)), P9.t.a("id", aFb1cSDK.AFAdRevenueData)}));
            int i7 = f13596i + 73;
            f13597w = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i8 = f13597w + 27;
        f13596i = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 49 / 0;
        }
    }

    private void afInfoLog(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1072860105, -1072860098, System.identityHashCode(this));
    }

    private String areAllFieldsValid() {
        String str = null;
        if (this.areAllFieldsValid.getCurrencyIso4217Code("INSTALL_STORE")) {
            f13596i = (f13597w + 43) % 128;
            return this.areAllFieldsValid.AFAdRevenueData("INSTALL_STORE", (String) null);
        }
        if (equals()) {
            f13596i = (f13597w + 91) % 128;
            str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
        }
        this.areAllFieldsValid.getRevenue("INSTALL_STORE", str);
        return str;
    }

    private final void component1(Map<String, Object> map) {
        int i7 = f13597w + 79;
        f13596i = i7 % 128;
        if (i7 % 2 == 0) {
            map.put("btl", String.valueOf(this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
            throw null;
        }
        AFf1aSDK.AFa1ySDK monetizationNetwork = this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData);
        float f7 = monetizationNetwork.getMediationNetwork;
        String str = monetizationNetwork.getRevenue;
        map.put("btl", String.valueOf(f7));
        if (str != null) {
            f13596i = (f13597w + 59) % 128;
            map.put("btch", str);
        }
    }

    private static java.lang.Object component2(java.lang.Object[] r5) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.component2(java.lang.Object[]):java.lang.Object");
    }

    private static long component3() {
        int i7 = f13597w + 39;
        f13596i = i7 % 128;
        return i7 % 2 == 0 ? System.currentTimeMillis() + SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private static Object component4(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        f13597w = (f13596i + 27) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) aFg1uSDK.AFInAppEventType.getValue();
        int i7 = f13596i + 105;
        f13597w = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 79 / 0;
        }
        return simpleDateFormat;
    }

    private boolean copy() {
        int i7 = f13596i + 57;
        f13597w = i7 % 128;
        if (i7 % 2 != 0) {
            Boolean.parseBoolean(this.areAllFieldsValid.AFAdRevenueData("sentSuccessfully", (String) null));
            throw null;
        }
        boolean z7 = Boolean.parseBoolean(this.areAllFieldsValid.AFAdRevenueData("sentSuccessfully", (String) null));
        int i8 = f13596i + R.styleable.AppCompatTheme_toolbarStyle;
        f13597w = i8 % 128;
        if (i8 % 2 == 0) {
            return z7;
        }
        throw null;
    }

    private String copydefault() {
        String string = getMonetizationNetwork().getString("preInstallName");
        if (string != null) {
            f13596i = (f13597w + 23) % 128;
            return string;
        }
        if (this.areAllFieldsValid.getCurrencyIso4217Code("preInstallName")) {
            string = this.areAllFieldsValid.AFAdRevenueData("preInstallName", (String) null);
        } else {
            if (equals()) {
                f13597w = (f13596i + 99) % 128;
                string = registerClient();
                if (string == null) {
                    f13597w = (f13596i + 29) % 128;
                    string = getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                }
            }
            if (string != null) {
                this.areAllFieldsValid.getRevenue("preInstallName", string);
            }
        }
        if (string != null) {
            getMonetizationNetwork().set("preInstallName", string);
        }
        f13596i = (f13597w + 103) % 128;
        return string;
    }

    private void d(Map<String, Object> map) {
        f13596i = (f13597w + 91) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        map.put("af_preinstalled", String.valueOf(AFc1kSDK.getRevenue(this.AFAdRevenueData)));
        f13597w = (f13596i + 79) % 128;
    }

    private void e(Map<String, Object> map) {
        f13596i = (f13597w + 21) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        AFb1lSDK aFb1lSDKK_ = AFb1iSDK.k_(this.AFAdRevenueData.getContentResolver());
        if (aFb1lSDKK_ == null) {
            f13597w = (f13596i + 37) % 128;
            return;
        }
        int i7 = f13596i + 77;
        f13597w = i7 % 128;
        if (i7 % 2 == 0) {
            map.put("amazon_aid", aFb1lSDKK_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(aFb1lSDKK_.getCurrencyIso4217Code));
        } else {
            map.put("amazon_aid", aFb1lSDKK_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(aFb1lSDKK_.getCurrencyIso4217Code));
            int i8 = 47 / 0;
        }
    }

    private boolean equals() {
        int i7 = f13596i + 61;
        f13597w = i7 % 128;
        if (i7 % 2 == 0 ? this.component3.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 1 : this.component3.getRevenue.AFAdRevenueData("appsFlyerCount", 1) <= 1) {
            return true;
        }
        int i8 = f13596i + 23;
        f13597w = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 48 / 0;
        }
        return false;
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, boolean z7) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        map2.put("arch", getMediationNetwork("os.arch"));
        map2.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z7) {
            f13597w = (f13596i + 61) % 128;
            component1(map2);
            if (this.component3.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                int i7 = f13596i + R.styleable.AppCompatTheme_windowActionModeOverlay;
                f13597w = i7 % 128;
                if (i7 % 2 != 0) {
                    map2.putAll(this.getMediationNetwork.getRevenue());
                    throw null;
                }
                map2.putAll(this.getMediationNetwork.getRevenue());
            }
        }
        map2.put("dim", this.component4.getCurrencyIso4217Code(this.AFAdRevenueData));
        map.put("deviceData", map2);
    }

    private static List<AFe1uSDK> getMediationNetwork() {
        f13596i = (f13597w + 19) % 128;
        List<AFe1uSDK> listM = CollectionsKt.m(new AFe1uSDK[]{AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH, AFe1uSDK.INAPP, AFe1uSDK.MANUAL_PURCHASE_VALIDATION, AFe1uSDK.ARS_VALIDATE, AFe1uSDK.PURCHASE_VALIDATE});
        f13596i = (f13597w + 71) % 128;
        return listM;
    }

    private final AppsFlyerProperties getMonetizationNetwork() {
        f13596i = (f13597w + 19) % 128;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.toString.getValue();
        int i7 = f13596i + 19;
        f13597w = i7 % 128;
        if (i7 % 2 == 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    public static Object getRevenue(Object[] objArr, int i7, int i8, int i9) {
        int i10 = ~((~i7) | (~i8));
        int i11 = ~i9;
        switch ((i7 * 221) + (i8 * (-219)) + ((i10 | (~(i11 | i7 | i8))) * 220) + (((~(i11 | i8)) | i7) * (-440)) + ((i7 | i8 | i9) * 220)) {
            case 1:
                return getRevenue(objArr);
            case 2:
                AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
                AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
                Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
                if (aFg1uSDK.component3.component3()) {
                    AdvertisingIdData advertisingIdData = aFg1uSDK.component3.getMediationNetwork.component2;
                    if (advertisingIdData == null) {
                        return null;
                    }
                    String str = advertisingIdData.gaidError;
                    if (str != null && str.length() != 0) {
                        f13597w = (f13596i + 73) % 128;
                        aFh1tSDK.getMonetizationNetwork("gaidError", advertisingIdData.gaidError);
                    }
                    String str2 = advertisingIdData.advertisingId;
                    if (str2 != null) {
                        f13596i = (f13597w + 45) % 128;
                        if (advertisingIdData.isEnabled != null) {
                            aFh1tSDK.getMonetizationNetwork(PexNRiLSd.IZDeuERMGcKZEKj, str2);
                            aFh1tSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                            aFh1tSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
                            f13596i = (f13597w + 99) % 128;
                        }
                    }
                } else {
                    Map<String, Object> mapAFAdRevenueData = AFa1zSDK.AFAdRevenueData(aFh1tSDK.getMonetizationNetwork);
                    Intrinsics.checkNotNullExpressionValue(mapAFAdRevenueData, BuildConfig.FLAVOR);
                    mapAFAdRevenueData.put("ad_ids_disabled", Boolean.TRUE);
                    f13597w = (f13596i + 53) % 128;
                }
                AdvertisingIdData advertisingIdData2 = aFg1uSDK.component3.getMediationNetwork.component2;
                aFh1tSDK.getMonetizationNetwork("GAID_retry", String.valueOf(advertisingIdData2 != null ? Intrinsics.b(advertisingIdData2.retry, Boolean.TRUE) : false));
                if (!CollectionsKt.m(new AFe1uSDK[]{AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH}).contains(aFh1tSDK.getMediationNetwork())) {
                    return null;
                }
                int i12 = f13596i;
                f13597w = (i12 + 19) % 128;
                AFd1gSDK aFd1gSDK = aFg1uSDK.copy.component1;
                if (aFd1gSDK == null) {
                    return null;
                }
                f13597w = (i12 + 87) % 128;
                Map<String, Object> mapAFAdRevenueData2 = AFa1zSDK.AFAdRevenueData(aFh1tSDK.getMonetizationNetwork);
                Intrinsics.checkNotNullExpressionValue(mapAFAdRevenueData2, BuildConfig.FLAVOR);
                mapAFAdRevenueData2.put("fetchAdIdLatency", Long.valueOf(aFd1gSDK.getMonetizationNetwork));
                return null;
            case 3:
                return getMonetizationNetwork(objArr);
            case 4:
                AFg1uSDK aFg1uSDK2 = (AFg1uSDK) objArr[0];
                Map map = (Map) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                f13596i = (f13597w + R.styleable.AppCompatTheme_toolbarStyle) % 128;
                Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
                map.put("platformextension", aFg1uSDK2.getCurrencyIso4217Code);
                if (!zBooleanValue) {
                    return null;
                }
                f13596i = (f13597w + 95) % 128;
                map.put("platform_extension_v2", aFg1uSDK2.getRevenue.getRevenue());
                f13596i = (f13597w + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
                return null;
            case 5:
                return getMediationNetwork(objArr);
            case 6:
                AFg1uSDK aFg1uSDK3 = (AFg1uSDK) objArr[0];
                AFh1tSDK aFh1tSDK2 = (AFh1tSDK) objArr[1];
                f13596i = (f13597w + 25) % 128;
                Intrinsics.checkNotNullParameter(aFh1tSDK2, BuildConfig.FLAVOR);
                Map<String, Object> map2 = aFh1tSDK2.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(map2, BuildConfig.FLAVOR);
                aFg1uSDK3.getCurrencyIso4217Code(map2, aFh1tSDK2.AFAdRevenueData());
                getRevenue(new Object[]{map2}, -260988684, 260988687, (int) System.currentTimeMillis());
                unregisterClient(map2);
                aFg1uSDK3.getRevenue(map2);
                aFg1uSDK3.getMediationNetwork(map2, aFg1uSDK3.copy.getCurrencyIso4217Code);
                aFg1uSDK3.e(map2);
                map2.put("cell", kotlin.collections.F.k(new Pair[]{P9.t.a("mcc", Integer.valueOf(aFg1uSDK3.AFAdRevenueData.getResources().getConfiguration().mcc)), P9.t.a("mnc", Integer.valueOf(aFg1uSDK3.AFAdRevenueData.getResources().getConfiguration().mnc))}));
                map2.put("sig", aFg1uSDK3.component4());
                map2.put("last_boot_time", Long.valueOf(component3()));
                map2.put("disk", component2());
                f13597w = (f13596i + 77) % 128;
                return null;
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                return component4(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                return component2(objArr);
            case 11:
                return component3(objArr);
            case 12:
                return component1(objArr);
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    private final void hashCode(Map<String, Object> map) {
        int i7 = f13597w + 1;
        f13596i = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 62 / 0;
            if (getMonetizationNetwork().isOtherSdkStringDisabled()) {
                return;
            }
        } else if (getMonetizationNetwork().isOtherSdkStringDisabled()) {
            return;
        }
        int i9 = f13597w + 81;
        f13596i = i9 % 128;
        if (i9 % 2 != 0) {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
        } else {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
            int i10 = 14 / 0;
        }
    }

    private void i(Map<String, Object> map) {
        f13597w = (f13596i + 27) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        boolean zAFAdRevenueData = AFg1zSDK.AFAdRevenueData(this.AFAdRevenueData);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + zAFAdRevenueData);
        if (!zAFAdRevenueData) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            f13596i = (f13597w + 25) % 128;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1zSDK.getRevenue(this.areAllFieldsValid)));
    }

    private void registerClient(Map<String, Object> map) {
        f13597w = (f13596i + 11) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        long j7 = this.component1.copydefault;
        if (j7 != 0) {
            f13597w = (f13596i + 65) % 128;
            map.put("prev_session_dur", Long.valueOf(j7));
        }
    }

    private static PackageInfo s_(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        f13597w = (f13596i + 109) % 128;
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, BuildConfig.FLAVOR);
            return packageInfo;
        }
        f13597w = (f13596i + 45) % 128;
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
        Intrinsics.checkNotNullExpressionValue(packageInfo2, BuildConfig.FLAVOR);
        return packageInfo2;
    }

    private final void toString(Map<String, Object> map) {
        int i7 = f13596i + 51;
        f13597w = i7 % 128;
        if (i7 % 2 != 0) {
            AFg1rSDK.getCurrencyIso4217Code(this.AFAdRevenueData);
            throw null;
        }
        if (AFg1rSDK.getCurrencyIso4217Code(this.AFAdRevenueData)) {
            f13597w = (f13596i + 73) % 128;
            map.put("inst_app", Boolean.TRUE);
        }
    }

    private static void unregisterClient(Map<String, Object> map) {
        f13596i = (f13597w + 13) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e7) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e7);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e8) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e8);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            f13596i = (f13597w + R.styleable.AppCompatTheme_windowFixedWidthMinor) % 128;
        } catch (Exception e9) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e9);
        }
    }

    private void v(Map<String, Object> map) {
        String mediationNetwork;
        AFc1kSDK aFc1kSDK;
        f13596i = (f13597w + 19) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i7 = f13597w + 37;
            f13596i = i7 % 128;
            try {
                if (i7 % 2 == 0) {
                    this.AFAdRevenueData.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    aFc1kSDK = this.component3;
                } else {
                    this.AFAdRevenueData.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    aFc1kSDK = this.component3;
                }
                mediationNetwork = aFc1kSDK.getMediationNetwork(this.AFAdRevenueData);
            } catch (Throwable unused) {
                mediationNetwork = null;
            }
            if (mediationNetwork != null) {
                int i8 = f13596i + 55;
                f13597w = i8 % 128;
                if (i8 % 2 == 0) {
                    map.put("fb", mediationNetwork);
                } else {
                    map.put("fb", mediationNetwork);
                    int i9 = 64 / 0;
                }
            }
        }
    }

    private void w(Map<String, Object> map) {
        f13597w = (f13596i + 79) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        try {
            String monetizationNetwork = AFb1kSDK.getMonetizationNetwork(this.areAllFieldsValid);
            if (monetizationNetwork != null) {
                map.put("uid", monetizationNetwork);
                return;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("ERROR: could not get uid ");
            sb.append(th.getMessage());
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            AFLogger.afErrorLog(string, th);
        }
        f13597w = (f13596i + 3) % 128;
    }

    private static Object component3(Object[] objArr) throws NumberFormatException {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i7 = f13596i + 73;
        f13597w = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
            AFf1iSDK aFf1iSDK = aFg1uSDK.equals;
            AFf1iSDK.getRevenue(map, aFg1uSDK.component3);
            return null;
        }
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        AFf1iSDK aFf1iSDK2 = aFg1uSDK.equals;
        AFf1iSDK.getRevenue(map, aFg1uSDK.component3);
        throw null;
    }

    private String component4() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        int i7 = f13597w + 103;
        f13596i = i7 % 128;
        if (i7 % 2 != 0) {
            return AFj1nSDK.L_(this.AFAdRevenueData.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
        }
        AFj1nSDK.L_(this.AFAdRevenueData.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
        throw null;
    }

    private final void copy(Map<String, Object> map) {
        f13596i = (f13597w + 87) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.AFAdRevenueData.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            f13597w = (f13596i + 37) % 128;
            if (uiModeManager.getCurrentModeType() == 4) {
                f13597w = (f13596i + 7) % 128;
                map.put("tv", Boolean.TRUE);
            }
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map) {
        try {
            PackageInfo packageInfo = this.AFAdRevenueData.getPackageManager().getPackageInfo(this.AFAdRevenueData.getPackageName(), 0);
            int iAFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("versionCode", 0);
            int i7 = packageInfo.versionCode;
            if (i7 > iAFAdRevenueData) {
                int i8 = f13596i + 3;
                f13597w = i8 % 128;
                if (i8 % 2 != 0) {
                    this.areAllFieldsValid.getMonetizationNetwork("versionCode", i7);
                    throw null;
                }
                this.areAllFieldsValid.getMonetizationNetwork("versionCode", i7);
                f13596i = (f13597w + 31) % 128;
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            Context context = this.component3.AFAdRevenueData.getMonetizationNetwork;
            map.put("app_version_name", AFj1nSDK.getCurrencyIso4217Code(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.component3.AFAdRevenueData.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            long j7 = packageInfo.firstInstallTime;
            long j8 = packageInfo.lastUpdateTime;
            map.put("date1", ((SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this))).format(new Date(j7)));
            map.put("date2", ((SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this))).format(new Date(j8)));
            Object[] objArr = new Object[1];
            a((-328942803) - View.MeasureSpec.getSize(0), View.getDefaultSize(0, 0) + 962452528, (ViewConfiguration.getWindowTouchSlop() >> 8) - 38, (byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this));
            Intrinsics.checkNotNullExpressionValue(simpleDateFormat, BuildConfig.FLAVOR);
            map.put(strIntern, getMonetizationNetwork(simpleDateFormat));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    private void component4(Map<String, ? extends Object> map) {
        boolean z7;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        AFh1uSDK aFh1uSDK = this.component1;
        HashMap map2 = new HashMap(aFh1uSDK.getMonetizationNetwork);
        aFh1uSDK.getMonetizationNetwork.clear();
        this.component1.getRevenue.getMediationNetwork("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, BuildConfig.FLAVOR);
        if (map2.isEmpty()) {
            f13597w = (f13596i + 67) % 128;
            z7 = false;
        } else {
            f13596i = (f13597w + 37) % 128;
            z7 = true;
        }
        if (z7) {
            f13596i = (f13597w + 85) % 128;
            Map<String, Object> mapAFAdRevenueData = AFa1zSDK.AFAdRevenueData(map);
            Intrinsics.checkNotNullExpressionValue(mapAFAdRevenueData, BuildConfig.FLAVOR);
            mapAFAdRevenueData.put("gcd", map2);
        }
    }

    private void AFInAppEventType(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -952054668, 952054677, System.identityHashCode(this));
    }

    private void equals(Map<String, Object> map) {
        int i7 = f13597w + 91;
        f13596i = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
            map.put("is_pc", Boolean.valueOf(this.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
            map.put("is_pc", Boolean.valueOf(this.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
    }

    private static Object areAllFieldsValid(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        AppsFlyerProperties monetizationNetwork = aFg1uSDK.getMonetizationNetwork();
        String str = bpTQi.UjSLnISFt;
        String string = monetizationNetwork.getString(str);
        if (string != null) {
            int i7 = f13597w + 17;
            f13596i = i7 % 128;
            if (i7 % 2 != 0) {
                if (string.length() != 0) {
                    map.put(str, string);
                }
            } else {
                throw null;
            }
        }
        int i8 = f13596i + 19;
        f13597w = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void component3(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -260988684, 260988687, (int) System.currentTimeMillis());
    }

    private final String registerClient() {
        File fileAFAdRevenueData = AFAdRevenueData(getMediationNetwork("ro.appsflyer.preinstall.path"));
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            f13596i = (f13597w + 41) % 128;
            fileAFAdRevenueData = AFAdRevenueData(getCurrencyIso4217Code("AF_PRE_INSTALL_PATH"));
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            int i7 = f13597w + 87;
            f13596i = i7 % 128;
            if (i7 % 2 != 0) {
                fileAFAdRevenueData = AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
            } else {
                AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
                throw null;
            }
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            int i8 = f13596i + 45;
            f13597w = i8 % 128;
            if (i8 % 2 != 0) {
                fileAFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
                int i9 = 57 / 0;
            } else {
                fileAFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
            }
            f13597w = (f13596i + 109) % 128;
        }
        if (getMonetizationNetwork(fileAFAdRevenueData)) {
            return null;
        }
        String packageName = this.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, BuildConfig.FLAVOR);
        return getCurrencyIso4217Code(fileAFAdRevenueData, packageName);
    }

    private void AFLogger(Map<String, Object> map) {
        int i7 = f13596i + 17;
        f13597w = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
            map.putAll(this.hashCode.getRevenue());
            int i8 = f13597w + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            f13596i = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        map.putAll(this.hashCode.getRevenue());
        throw null;
    }

    private static String component2() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        f13596i = (f13597w + 87) % 128;
        return str;
    }

    @Override
    public final long AFAdRevenueData() {
        int i7 = f13597w + 83;
        f13596i = i7 % 128;
        if (i7 % 2 == 0) {
            System.currentTimeMillis();
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        f13597w = (f13596i + 55) % 128;
        return jCurrentTimeMillis;
    }

    @Override
    public final void getMediationNetwork(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        } else {
            f13597w = (f13596i + 51) % 128;
        }
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                String string3 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string3, BuildConfig.FLAVOR);
                AFLogger.afWarnLog(string3);
            }
            map.put("currency", string2);
        }
        String string4 = getMonetizationNetwork().getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            f13596i = (f13597w + 73) % 128;
            map.put("isUpdate", string4);
        } else {
            f13596i = (f13597w + 21) % 128;
        }
        String string5 = getMonetizationNetwork().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            map.put("customData", string5);
        }
        String string6 = getMonetizationNetwork().getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            map.put("appUserId", string6);
        }
        String string7 = getMonetizationNetwork().getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            map.put("user_emails", string7);
        }
        AFb1qSDK aFb1qSDK = this.copy.getMonetizationNetwork;
        if (aFb1qSDK != null) {
            int i7 = f13596i + 21;
            f13597w = i7 % 128;
            if (i7 % 2 == 0) {
                String[] strArr = aFb1qSDK.getRevenue;
                if (strArr != null) {
                    map.put("sharing_filter", strArr);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override
    public final void AFAdRevenueData(Map<String, Object> map, int i7, int i8) {
        boolean z7;
        f13596i = (f13597w + 17) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        map.put("counter", String.valueOf(i7));
        map.put("iaecounter", String.valueOf(i8));
        if (copy()) {
            f13596i = (f13597w + 93) % 128;
            z7 = false;
        } else {
            z7 = true;
        }
        map.put("isFirstCall", String.valueOf(z7));
    }

    private void areAllFieldsValid(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 252198665, -252198654, System.identityHashCode(this));
    }

    private static Object component1(Object[] objArr) throws JSONException {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        f13596i = (f13597w + 89) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        try {
            String strAFAdRevenueData = aFg1uSDK.areAllFieldsValid.AFAdRevenueData("prev_event_name", (String) null);
            if (strAFAdRevenueData != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1uSDK.areAllFieldsValid.getMediationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", strAFAdRevenueData);
                map.put("prev_event", jSONObject);
            }
            aFg1uSDK.areAllFieldsValid.getRevenue("prev_event_name", str);
            aFg1uSDK.areAllFieldsValid.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
            int i7 = f13597w + R.styleable.AppCompatTheme_windowActionModeOverlay;
            f13596i = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e7) {
            AFLogger.afErrorLog(GObvYfBKohxpYX.QJVHBr, e7);
            return null;
        }
    }

    private void copydefault(java.util.Map<java.lang.String, java.lang.Object> r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.copydefault(java.util.Map):void");
    }

    @Override
    public final void getCurrencyIso4217Code(java.util.Map<java.lang.String, java.lang.Object> r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.getCurrencyIso4217Code(java.util.Map):void");
    }

    private void component2(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            f13597w = (f13596i + 87) % 128;
            map.put("onelink_id", string);
            f13596i = (f13597w + 39) % 128;
        }
        if (string2 != null) {
            int i7 = f13596i + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            f13597w = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("onelink_ver", string2);
                int i8 = 61 / 0;
            } else {
                map.put("onelink_ver", string2);
            }
        }
    }

    private static java.lang.Object AFAdRevenueData(java.lang.Object[] r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.AFAdRevenueData(java.lang.Object[]):java.lang.Object");
    }

    private String component1() {
        return (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
    }

    private static File AFAdRevenueData(String str) {
        if (str != null) {
            try {
                if (StringsKt.Q0(str).toString().length() > 0) {
                    int i7 = f13596i + 21;
                    f13597w = i7 % 128;
                    if (i7 % 2 == 0) {
                        return new File(StringsKt.Q0(str).toString());
                    }
                } else {
                    f13596i = (f13597w + 27) % 128;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        f13597w = (f13596i + R.styleable.AppCompatTheme_windowFixedWidthMinor) % 128;
        return null;
    }

    private String getMonetizationNetwork(SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, BuildConfig.FLAVOR);
        String strAFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
        if (strAFAdRevenueData == null) {
            f13596i = (f13597w + 79) % 128;
            if (equals()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                strAFAdRevenueData = simpleDateFormat.format(new Date());
            } else {
                strAFAdRevenueData = BuildConfig.FLAVOR;
            }
            this.areAllFieldsValid.getRevenue("appsFlyerFirstInstall", strAFAdRevenueData);
            f13597w = (f13596i + 89) % 128;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFh1zSDK.GENERAL, "AppsFlyer: first launch date: " + strAFAdRevenueData, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(strAFAdRevenueData, BuildConfig.FLAVOR);
        return strAFAdRevenueData;
    }

    private void AFAdRevenueData(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 22668144, -22668132, System.identityHashCode(this));
    }

    @Override
    public final void AFAdRevenueData(AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 919507137, -919507136, System.identityHashCode(this));
    }

    private static Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        f13596i = (f13597w + 17) % 128;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        Object[] objArr2 = new Object[1];
        a((-328942807) - View.MeasureSpec.makeMeasureSpec(0, 0), Color.argb(0, 0, 0, 0) + 962452542, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) - 47, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        map.put(((String) objArr2[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i7 = f13596i + 27;
        f13597w = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 73 / 0;
        }
        return null;
    }

    private static void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        f13597w = (f13596i + 55) % 128;
        Intrinsics.checkNotNullParameter(map, jUbDmI.IuOnKTBmzBKi);
        if (str != null) {
            int i7 = f13597w + 57;
            f13596i = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("phone", str);
            } else {
                map.put("phone", str);
                throw null;
            }
        }
    }

    private static Object getMediationNetwork(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        String string = aFg1uSDK.getMonetizationNetwork().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        int i7 = f13597w + 21;
        f13596i = i7 % 128;
        if (i7 % 2 == 0) {
            aFg1uSDK.getCurrencyIso4217Code("AF_STORE");
            throw null;
        }
        String currencyIso4217Code = aFg1uSDK.getCurrencyIso4217Code("AF_STORE");
        f13597w = (f13596i + 25) % 128;
        return currencyIso4217Code;
    }

    private void getMediationNetwork(java.util.Map<java.lang.String, java.lang.Object> r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.getMediationNetwork(java.util.Map, java.lang.String):void");
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) throws NumberFormatException {
        Map map = (Map) objArr[0];
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        String monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
        String strAFAdRevenueData = AFa1uSDK.AFAdRevenueData();
        if (monetizationNetwork != null && strAFAdRevenueData != null) {
            int i7 = f13596i + 49;
            f13597w = i7 % 128;
            if (i7 % 2 == 0) {
                if (Integer.parseInt(strAFAdRevenueData) > 0) {
                    map.put("reinstallCounter", strAFAdRevenueData);
                    map.put("originalAppsflyerId", monetizationNetwork);
                    f13597w = (f13596i + 11) % 128;
                }
            } else {
                Integer.parseInt(strAFAdRevenueData);
                throw null;
            }
        }
        return null;
    }

    private static String getMonetizationNetwork(AFc1sSDK aFc1sSDK, String str) {
        String strAFAdRevenueData = aFc1sSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (strAFAdRevenueData != null) {
            int i7 = f13596i + R.styleable.AppCompatTheme_tooltipFrameBackground;
            int i8 = i7 % 128;
            f13597w = i8;
            if (i7 % 2 != 0) {
                throw null;
            }
            f13596i = (i8 + 85) % 128;
            return strAFAdRevenueData;
        }
        aFc1sSDK.getRevenue("CACHED_CHANNEL", str);
        f13597w = (f13596i + 65) % 128;
        return str;
    }

    private final String getCurrencyIso4217Code(String str) {
        int i7 = f13596i + 63;
        f13597w = i7 % 128;
        if (i7 % 2 == 0) {
            return this.component3.getCurrencyIso4217Code(str);
        }
        this.component3.getCurrencyIso4217Code(str);
        throw null;
    }

    private static boolean getMonetizationNetwork(File file) {
        int i7 = f13596i;
        int i8 = i7 + 35;
        f13597w = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i9 = i7 + 15;
        f13597w = i9 % 128;
        int i10 = i9 % 2;
        boolean zExists = file.exists();
        if (i10 != 0) {
            int i11 = 72 / 0;
            if (!zExists) {
                return true;
            }
        } else if (!zExists) {
            return true;
        }
        return false;
    }

    private static String getCurrencyIso4217Code(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        int i7 = f13596i + R.styleable.AppCompatTheme_windowFixedHeightMinor;
        f13597w = i7 % 128;
        if (i7 % 2 == 0) {
            try {
                try {
                    if (file == null) {
                        return null;
                    }
                    try {
                        properties = new Properties();
                        inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    } catch (FileNotFoundException unused) {
                        inputStreamReader = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = null;
                    }
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th2) {
                            AFLogger.afErrorLog(th2.getMessage(), th2);
                        }
                        return property;
                    } catch (FileNotFoundException unused2) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            return null;
                        }
                        f13597w = (f13596i + 93) % 128;
                        return null;
                    }
                } catch (Throwable th4) {
                    AFLogger.afErrorLog(th4.getMessage(), th4);
                }
            } catch (Throwable th5) {
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th6) {
                        AFLogger.afErrorLog(th6.getMessage(), th6);
                    }
                }
                throw th5;
            }
        } else {
            throw null;
        }
    }

    @Override
    public final void getMonetizationNetwork(AFh1tSDK aFh1tSDK) {
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        if (aFh1tSDK.AFAdRevenueData()) {
            int i7 = f13597w + 13;
            f13596i = i7 % 128;
            if (i7 % 2 != 0) {
                String str = aFh1tSDK.areAllFieldsValid;
                AFc1oSDK aFc1oSDK = this.copy;
                getCurrencyIso4217Code(aFh1tSDK, str, aFc1oSDK.getMediationNetwork, aFc1oSDK.AFAdRevenueData);
            } else {
                String str2 = aFh1tSDK.areAllFieldsValid;
                AFc1oSDK aFc1oSDK2 = this.copy;
                getCurrencyIso4217Code(aFh1tSDK, str2, aFc1oSDK2.getMediationNetwork, aFc1oSDK2.AFAdRevenueData);
                throw null;
            }
        } else if (!(aFh1tSDK instanceof AFh1jSDK)) {
            Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
            String str3 = aFh1tSDK.component3;
            Intrinsics.checkNotNullExpressionValue(str3, BuildConfig.FLAVOR);
            getRevenue(new Object[]{this, map, str3}, 22668144, -22668132, System.identityHashCode(this));
            f13596i = (f13597w + 43) % 128;
        }
        if (CollectionsKt.m(new AFe1uSDK[]{AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH, AFe1uSDK.INAPP}).contains(aFh1tSDK.getMediationNetwork())) {
            Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
            equals(map);
        }
        if (aFh1tSDK.getMonetizationNetwork()) {
            f13597w = (f13596i + 61) % 128;
            Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
            getRevenue(new Object[]{this, map}, 252198665, -252198654, System.identityHashCode(this));
        }
        Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
        getRevenue(new Object[]{this, map}, 1072860105, -1072860098, System.identityHashCode(this));
        getRevenue(new Object[]{map}, 1729638864, -1729638864, (int) System.currentTimeMillis());
        AFLogger(map);
        getRevenue(new Object[]{this, map}, -952054668, 952054677, System.identityHashCode(this));
        w(map);
        getRevenue(new Object[]{this, map, Boolean.valueOf(aFh1tSDK.AFAdRevenueData())}, 491464520, -491464516, System.identityHashCode(this));
        i(map);
        afDebugLog(map);
        getCurrencyIso4217Code(map, aFh1tSDK);
        map.put("af_events_api", "1");
    }

    @Override
    public final void getRevenue(Map<String, Object> map) {
        AFi1wSDK mediationNetwork;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        AFi1xSDK aFi1xSDK = this.component2.getRevenue;
        if (aFi1xSDK != null) {
            f13597w = (f13596i + 33) % 128;
            mediationNetwork = aFi1xSDK.getMediationNetwork();
        } else {
            mediationNetwork = null;
        }
        if (mediationNetwork != null) {
            map.put("network", mediationNetwork.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(mediationNetwork.getMediationNetwork()));
            if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            f13597w = (f13596i + 25) % 128;
            String str = mediationNetwork.getCurrencyIso4217Code;
            if (str != null) {
                map.put("operator", str);
                f13596i = (f13597w + R.styleable.AppCompatTheme_windowActionBar) % 128;
            }
            String str2 = mediationNetwork.getMonetizationNetwork;
            if (str2 != null) {
                map.put("carrier", str2);
                return;
            }
            return;
        }
        int i7 = f13597w + 107;
        f13596i = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static String getMediationNetwork(String str) {
        f13597w = (f13596i + 97) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.e(objInvoke, BuildConfig.FLAVOR);
            String str2 = (String) objInvoke;
            int i7 = f13596i + 35;
            f13597w = i7 % 128;
            if (i7 % 2 == 0) {
                return str2;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static void getCurrencyIso4217Code(Map<String, Object> map, AFh1tSDK aFh1tSDK) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        String str = aFh1tSDK.component3;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1tSDK.getRevenue;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK, String str, String str2, AFb1vSDK aFb1vSDK) {
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        if (aFh1tSDK.getMediationNetwork() == AFe1uSDK.CONVERSION) {
            int i7 = f13596i + 71;
            f13597w = i7 % 128;
            if (i7 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
                hashCode(map);
                copy(map);
                toString(map);
                AFa1uSDK.getMonetizationNetwork(this.copydefault, this.areAllFieldsValid);
            } else {
                Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
                hashCode(map);
                copy(map);
                toString(map);
                AFa1uSDK.getMonetizationNetwork(this.copydefault, this.areAllFieldsValid);
                throw null;
            }
        }
        Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
        copydefault(map);
        component2(map);
        component4((Map<String, ? extends Object>) map);
        getCurrencyIso4217Code(map, str2);
        getRevenue(map, str);
        registerClient(map);
        if (aFb1vSDK != null) {
            f13597w = (f13596i + 67) % 128;
            aFb1vSDK.getRevenue(map);
        }
    }

    @Override
    public final void getMediationNetwork(AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 773674548, -773674546, System.identityHashCode(this));
    }

    private final java.lang.String getRevenue(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.getRevenue(java.lang.String):java.lang.String");
    }

    private void getRevenue(Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        if (str != null && str.length() != 0) {
            f13596i = (f13597w + 85) % 128;
            map.put("referrer", str);
        }
        String strAFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("extraReferrers", (String) null);
        if (strAFAdRevenueData != null) {
            map.put("extraReferrers", strAFAdRevenueData);
        }
        String referrer = getMonetizationNetwork().getReferrer(this.areAllFieldsValid);
        if (referrer == null || referrer.length() == 0) {
            return;
        }
        f13597w = (f13596i + 111) % 128;
        if (map.get("referrer") == null) {
            map.put("referrer", referrer);
            f13597w = (f13596i + 1) % 128;
        }
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z7) {
        getRevenue(new Object[]{this, map, Boolean.valueOf(z7)}, 491464520, -491464516, System.identityHashCode(this));
    }

    @Override
    public final Long getCurrencyIso4217Code() {
        return (Long) getRevenue(new Object[]{this}, 544119822, -544119812, System.identityHashCode(this));
    }

    @Override
    public final void getCurrencyIso4217Code(AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 2099834135, -2099834129, System.identityHashCode(this));
    }

    @Override
    public final void getRevenue(AFh1tSDK aFh1tSDK) {
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
        AFAdRevenueData(map);
        Map<String, Object> map2 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, BuildConfig.FLAVOR);
        getMonetizationNetwork(map2);
        Map<String, Object> map3 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map3, BuildConfig.FLAVOR);
        AFKeystoreWrapper(map3);
        Map<String, Object> map4 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map4, BuildConfig.FLAVOR);
        d(map4);
        Map<String, Object> map5 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map5, BuildConfig.FLAVOR);
        v(map5);
        if (!(!getMediationNetwork().contains(aFh1tSDK.getMediationNetwork()))) {
            int i7 = f13596i + 55;
            f13597w = i7 % 128;
            if (i7 % 2 != 0) {
                Map<String, Object> map6 = aFh1tSDK.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(map6, BuildConfig.FLAVOR);
                afErrorLog(map6);
                int i8 = 66 / 0;
            } else {
                Map<String, Object> map7 = aFh1tSDK.getMonetizationNetwork;
                Intrinsics.checkNotNullExpressionValue(map7, BuildConfig.FLAVOR);
                afErrorLog(map7);
            }
        }
        f13596i = (f13597w + 15) % 128;
    }

    private static Object getRevenue(Object[] objArr) {
        int i7;
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
        map.put("open_referrer", aFh1tSDK.getMediationNetwork);
        String str = aFh1tSDK.component4;
        if (str == null || StringsKt.Y(str)) {
            i7 = f13597w + 87;
        } else {
            int i8 = f13596i + 31;
            f13597w = i8 % 128;
            if (i8 % 2 == 0) {
                map.put("af_web_referrer", aFh1tSDK.component4);
                i7 = f13597w + 17;
            } else {
                map.put("af_web_referrer", aFh1tSDK.component4);
                throw null;
            }
        }
        f13596i = i7 % 128;
        return null;
    }

    private final SimpleDateFormat getRevenue() {
        return (SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this));
    }
}
