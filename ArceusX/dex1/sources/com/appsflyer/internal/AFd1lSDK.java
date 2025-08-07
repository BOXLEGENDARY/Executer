package com.appsflyer.internal;

import H3.QdLC.QcdySgfdST;
import K0.wJ.BtcVLuo;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

public final class AFd1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFAdRevenueData = null;
    private static int component1 = 1;
    private static long component2;
    private static int component4;
    public static String getCurrencyIso4217Code;
    private final AFe1ySDK areAllFieldsValid;
    private final AFj1kSDK component3;
    private final AppsFlyerProperties getMediationNetwork;
    private final AFc1kSDK getMonetizationNetwork;
    private final AFd1nSDK getRevenue;

    static {
        getCurrencyIso4217Code();
        getCurrencyIso4217Code = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFAdRevenueData = "https://%sonelink.%s/shortlink-sdk/v2";
        int i7 = component1 + 87;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 87 / 0;
        }
    }

    public AFd1lSDK(AFd1nSDK aFd1nSDK, AFc1kSDK aFc1kSDK, AppsFlyerProperties appsFlyerProperties, AFe1ySDK aFe1ySDK, AFj1kSDK aFj1kSDK) {
        this.getRevenue = aFd1nSDK;
        this.getMonetizationNetwork = aFc1kSDK;
        this.getMediationNetwork = appsFlyerProperties;
        this.areAllFieldsValid = aFe1ySDK;
        this.component3 = aFj1kSDK;
    }

    public static Object AFAdRevenueData(Object[] objArr, int i7, int i8, int i9) {
        int i10 = (i7 * (-500)) + (i8 * (-500));
        int i11 = ~i8;
        int i12 = ~(i11 | i7);
        int i13 = ~i7;
        int i14 = i10 + ((i12 | (~(i13 | i8 | i9))) * 501) + ((~(i11 | i13)) * 1002) + ((~(i13 | (~i9) | i8)) * 501);
        if (i14 == 1) {
            return getRevenue(objArr);
        }
        if (i14 != 2) {
            return getCurrencyIso4217Code(objArr);
        }
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFd1mSDK aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{aFd1lSDK, AFd1oSDK.getMonetizationNetwork(aFd1lSDK.getMonetizationNetwork.AFAdRevenueData.getMonetizationNetwork.getPackageName(), AFb1kSDK.getMonetizationNetwork(aFd1lSDK.getMonetizationNetwork.getRevenue), (String) objArr[1], (String) objArr[2]), new AFd1fSDK()}, -609567536, 609567536, System.identityHashCode(aFd1lSDK));
        component4 = (component1 + 45) % 128;
        return aFd1mSDK;
    }

    private static void a(java.lang.String r10, int r11, java.lang.Object[] r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public final AFd1mSDK<AFi1zSDK> getCurrencyIso4217Code(boolean z7, boolean z8, String str, int i7) {
        String str2;
        AFe1ySDK aFe1ySDK = this.areAllFieldsValid;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        String str3 = z7 ? AFe1ySDK.getMonetizationNetwork : AFe1ySDK.getRevenue;
        String str4 = z8 ? "stg" : BuildConfig.FLAVOR;
        kotlin.jvm.internal.C c2 = kotlin.jvm.internal.C.a;
        if (AFe1ySDK.getRevenue()) {
            component1 = (component4 + 61) % 128;
            str2 = (String) aFe1ySDK.getMediationNetwork.getValue();
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        String str5 = String.format(str3, Arrays.copyOf(new Object[]{str2, str4, aFe1ySDK.AFAdRevenueData(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(str5, BuildConfig.FLAVOR);
        AFd1aSDK aFd1aSDK = new AFd1aSDK(str5, "GET");
        aFd1aSDK.component2 = 1500;
        AFd1mSDK<AFi1zSDK> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, aFd1aSDK, new AFd1hSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i8 = component1 + 1;
        component4 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 65 / 0;
        }
        return aFd1mSDK;
    }

    public final AFd1mSDK<String> getMediationNetwork(String str) {
        AFd1aSDK aFd1aSDK = new AFd1aSDK(str, null, "GET", Collections.emptyMap(), false);
        aFd1aSDK.component2 = 10000;
        aFd1aSDK.getMonetizationNetwork = false;
        AFd1mSDK<String> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, aFd1aSDK, new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i7 = component1 + 99;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 81 / 0;
        }
        return aFd1mSDK;
    }

    public final AFd1mSDK<String> getMonetizationNetwork(Map<String, Object> map, String str, String str2) {
        String mediationNetwork;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1gSDK.f13584e;
            Object method = map2.get(1923025431);
            if (method == null) {
                method = ((Class) AFa1gSDK.getMonetizationNetwork((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, 198 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (13426 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)))).getMethod("AFAdRevenueData", Map.class, String.class);
                map2.put(1923025431, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1kSDK aFj1kSDK = this.component3;
            if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").d(str2) || new Regex("3.?(\\d+)?.?(\\d+)").d(str2)) {
                component4 = (component1 + 101) % 128;
                mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            } else {
                component4 = (component1 + 11) % 128;
                mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
            }
            return (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFj1kSDK.getRevenue(aFj1kSDK.getMonetizationNetwork(mediationNetwork), false), bArr, "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1zSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1mSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        String mediationNetwork;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1gSDK.f13584e;
            Object method = map2.get(1923025431);
            if (method == null) {
                method = ((Class) AFa1gSDK.getMonetizationNetwork((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, 197 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), (char) (Drawable.resolveOpacity(0, 0) + 13426))).getMethod("AFAdRevenueData", Map.class, String.class);
                map2.put(1923025431, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            int i7 = component1 + 53;
            component4 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            AFj1kSDK aFj1kSDK = this.component3;
            if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").d(str2) || new Regex("3.?(\\d+)?.?(\\d+)").d(str2)) {
                int i8 = component4 + 57;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 43 / 0;
                    mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                } else {
                    mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
                }
            } else {
                mediationNetwork = aFj1kSDK.getRevenue.getMediationNetwork(BtcVLuo.xPsQMUxMiP);
                component1 = (component4 + R.styleable.AppCompatTheme_windowActionBar) % 128;
            }
            return (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFj1kSDK.getRevenue(aFj1kSDK.getMonetizationNetwork(mediationNetwork), false), bArr, "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1zSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    private boolean getMediationNetwork() {
        if (!(!this.getMediationNetwork.getBoolean(AppsFlyerProperties.HTTP_CACHE, true))) {
            return false;
        }
        int i7 = (component1 + 15) % 128;
        component4 = i7;
        int i8 = i7 + 57;
        component1 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 62 / 0;
        }
        return true;
    }

    public final AFd1mSDK<DdlResponse> getMediationNetwork(AFa1pSDK aFa1pSDK) {
        AFd1mSDK<DdlResponse> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFa1pSDK.component2, AFg1mSDK.getMediationNetwork(aFa1pSDK.getMonetizationNetwork).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFa1pSDK.getCurrencyIso4217Code()), new AFa1mSDK()}, -609567536, 609567536, System.identityHashCode(this));
        component1 = (component4 + 75) % 128;
        return aFd1mSDK;
    }

    public final AFd1mSDK<String> AFAdRevenueData(Map<String, Object> map, String str) {
        component1 = (component4 + 83) % 128;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1gSDK.f13584e;
            Object method = map2.get(1923025431);
            if (method == null) {
                method = ((Class) AFa1gSDK.getMonetizationNetwork(38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 198, (char) (13426 - (ViewConfiguration.getWindowTouchSlop() >> 8)))).getMethod("AFAdRevenueData", Map.class, String.class);
                map2.put(1923025431, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            AFj1kSDK aFj1kSDK = this.component3;
            AFd1mSDK<String> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFj1kSDK.getMonetizationNetwork(aFj1kSDK.getRevenue.getMediationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, QcdySgfdST.PIhOdb, Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
            component1 = (component4 + R.styleable.AppCompatTheme_windowActionBar) % 128;
            return aFd1mSDK;
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFh1zSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1mSDK<String> getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        AFd1mSDK<String> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(aFh1rSDK.component2, aFh1rSDK.getRevenue(), "POST", Collections.emptyMap(), true), new AFd1iSDK()}, -609567536, 609567536, System.identityHashCode(this));
        component4 = (component1 + R.styleable.AppCompatTheme_toolbarStyle) % 128;
        return aFd1mSDK;
    }

    private <T> AFd1mSDK<T> getMediationNetwork(AFd1aSDK aFd1aSDK, AFd1dSDK<T> aFd1dSDK) {
        return (AFd1mSDK) AFAdRevenueData(new Object[]{this, aFd1aSDK, aFd1dSDK}, -609567536, 609567536, System.identityHashCode(this));
    }

    private Map<String, Object> getMonetizationNetwork() {
        HashMap map = new HashMap();
        map.put("build_number", "6.16.2");
        map.put("counter", Integer.valueOf(this.getMonetizationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a("勌\uefe9⢥敟ꘞ", Color.alpha(0) + 48437, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.getMonetizationNetwork.AFAdRevenueData.getMonetizationNetwork;
        map.put("app_version_name", AFj1nSDK.getCurrencyIso4217Code(context, context.getPackageName()));
        map.put("app_id", this.getMonetizationNetwork.AFAdRevenueData.getMonetizationNetwork.getPackageName());
        map.put("platformextension", new AFa1ySDK().getMediationNetwork());
        component1 = (component4 + 59) % 128;
        return map;
    }

    public final AFd1mSDK<String> getCurrencyIso4217Code(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", getMonetizationNetwork());
        if (str2 != null) {
            component4 = (component1 + 45) % 128;
            map2.put("brand_domain", str2);
            component1 = (component4 + 27) % 128;
        }
        String string2 = AFg1mSDK.getMediationNetwork(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a("勯먩荁\ue85e\uf143\udeac➆೨ᗒ紲䨖占", 59616 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), objArr);
        map3.put(((String) objArr[0]).intern(), (String) AFAdRevenueData(new Object[]{str3, string, new String[]{"POST", string2}}, -1993823111, 1993823112, (int) System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName()));
        sb.append("/");
        sb.append(str);
        return getRevenue(new AFd1aSDK(sb.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), (AFd1dSDK) new AFd1iSDK(), true);
    }

    public final AFd1qSDK getRevenue(Map<String, Object> map, String str) {
        String str2 = GObvYfBKohxpYX.fpQCVFw;
        component4 = (component1 + 7) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1gSDK.f13584e;
                Object method = map2.get(1923025431);
                if (method == null) {
                    method = ((Class) AFa1gSDK.getMonetizationNetwork(View.getDefaultSize(0, 0) + 37, 197 - ExpandableListView.getPackedPositionChild(0L), (char) (13426 - TextUtils.indexOf(str2, str2, 0)))).getMethod("AFAdRevenueData", Map.class, String.class);
                    map2.put(1923025431, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                    return null;
                }
                AFd1qSDK aFd1qSDK = new AFd1qSDK(this.getMonetizationNetwork, bArr);
                int i7 = component1 + 91;
                component4 = i7 % 128;
                if (i7 % 2 == 0) {
                    return aFd1qSDK;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1zSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    public final com.appsflyer.internal.AFd1mSDK<java.lang.String> AFAdRevenueData(com.appsflyer.internal.AFh1tSDK r18, java.lang.String r19, com.appsflyer.internal.AFc1hSDK r20) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.AFAdRevenueData(com.appsflyer.internal.AFh1tSDK, java.lang.String, com.appsflyer.internal.AFc1hSDK):com.appsflyer.internal.AFd1mSDK");
    }

    private static Object getRevenue(Object[] objArr) throws NoSuchAlgorithmException, InvalidKeyException {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        ArrayList arrayList = new ArrayList(Arrays.asList((String[]) objArr[2]));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String strAFAdRevenueData = AFj1hSDK.AFAdRevenueData(strJoin, sb.toString());
        int i7 = component4 + 49;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            return strAFAdRevenueData;
        }
        throw null;
    }

    private <T> AFd1mSDK<T> getRevenue(AFd1aSDK aFd1aSDK, AFd1dSDK<T> aFd1dSDK, boolean z7) {
        aFd1aSDK.getRevenue = z7;
        AFd1nSDK aFd1nSDK = this.getRevenue;
        AFd1mSDK<T> aFd1mSDK = new AFd1mSDK<>(aFd1aSDK, aFd1nSDK.AFAdRevenueData, aFd1nSDK.getCurrencyIso4217Code, aFd1dSDK);
        component4 = (component1 + 59) % 128;
        return aFd1mSDK;
    }

    public final AFd1mSDK<Map<String, String>> getCurrencyIso4217Code(String str, String str2, UUID uuid, String str3) {
        String string = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.getMonetizationNetwork().getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String string2 = sb.toString();
        Map<String, Object> monetizationNetwork = getMonetizationNetwork();
        String strValueOf = String.valueOf(monetizationNetwork.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(monetizationNetwork.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(monetizationNetwork.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(monetizationNetwork.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(monetizationNetwork.get("sdk")));
        Object[] objArr = new Object[1];
        a("勯먩荁\ue85e\uf143\udeac➆೨ᗒ紲䨖占", TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 59618, objArr);
        map.put(((String) objArr[0]).intern(), (String) AFAdRevenueData(new Object[]{str3, string, new String[]{"GET", string, str, str2, strValueOf}}, -1993823111, 1993823112, (int) System.currentTimeMillis()));
        AFd1mSDK<Map<String, String>> aFd1mSDK = (AFd1mSDK) AFAdRevenueData(new Object[]{this, new AFd1aSDK(string2, null, "GET", map, false), new AFd1eSDK()}, -609567536, 609567536, System.identityHashCode(this));
        int i7 = component4 + R.styleable.AppCompatTheme_windowMinWidthMinor;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            return aFd1mSDK;
        }
        throw null;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFd1aSDK aFd1aSDK = (AFd1aSDK) objArr[1];
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[2];
        component1 = (component4 + 101) % 128;
        AFd1mSDK revenue = aFd1lSDK.getRevenue(aFd1aSDK, aFd1dSDK, aFd1lSDK.getMediationNetwork());
        int i7 = component1 + 77;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 57 / 0;
        }
        return revenue;
    }

    static void getCurrencyIso4217Code() {
        component2 = -4707319230439183927L;
    }

    public final AFd1mSDK<Map<String, Object>> getCurrencyIso4217Code(String str, String str2) {
        return (AFd1mSDK) AFAdRevenueData(new Object[]{this, str, str2}, -957016153, 957016155, System.identityHashCode(this));
    }

    private static String AFAdRevenueData(String str, String str2, String... strArr) {
        return (String) AFAdRevenueData(new Object[]{str, str2, strArr}, -1993823111, 1993823112, (int) System.currentTimeMillis());
    }
}
