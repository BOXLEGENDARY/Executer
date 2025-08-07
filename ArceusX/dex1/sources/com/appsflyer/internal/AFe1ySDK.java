package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u0011\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u00020\u000e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFc1sSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1sSDK;)V", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1kSDK;", "getCurrencyIso4217Code", "AFAdRevenueData", "Lcom/appsflyer/internal/AFc1sSDK;", "component1", BuildConfig.FLAVOR, "component4", "LP9/h;", "getRevenue", BuildConfig.FLAVOR, "()Z", "getMonetizationNetwork", "()Ljava/lang/String;", "areAllFieldsValid", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1ySDK {
    private static AFd1bSDK component1;

    private final AFc1sSDK component1;

    private final P9.h getRevenue;

    public final P9.h getMediationNetwork;

    private final AFc1kSDK getCurrencyIso4217Code;

    public static final Companion INSTANCE = new Companion(null);
    public static String getRevenue = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getMonetizationNetwork = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component2 = CollectionsKt.m(new String[]{"googleplay", "playstore", "googleplaystore"});

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends kotlin.jvm.internal.l implements Function0<String> {
        AnonymousClass4() {
            super(0);
        }

        public final String invoke() {
            String packageName = AFe1ySDK.this.getCurrencyIso4217Code.AFAdRevenueData.getMonetizationNetwork.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, BuildConfig.FLAVOR);
            return AFe1ySDK.getMediationNetwork(packageName, AFe1ySDK.getRevenue(AFe1ySDK.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "AFAdRevenueData", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends kotlin.jvm.internal.l implements Function0<String> {
        AnonymousClass5() {
            super(0);
        }

        public final String invoke() {
            String strAFAdRevenueData = com.appsflyer.internal.AFa1zSDK.AFAdRevenueData(AFe1ySDK.this.component1, AFe1ySDK.this.getCurrencyIso4217Code.component1());
            String str = BuildConfig.FLAVOR;
            if (strAFAdRevenueData != null && !StringsKt.Y(strAFAdRevenueData)) {
                String string = StringsKt.Q0(strAFAdRevenueData).toString();
                List<String> currencyIso4217Code = Companion.getCurrencyIso4217Code();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, BuildConfig.FLAVOR);
                String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, BuildConfig.FLAVOR);
                if (currencyIso4217Code.contains(lowerCase)) {
                    kotlin.jvm.internal.C c2 = kotlin.jvm.internal.C.a;
                    String str2 = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, BuildConfig.FLAVOR);
                    AFLogger.afWarnLog(str2);
                    strAFAdRevenueData = BuildConfig.FLAVOR;
                } else {
                    strAFAdRevenueData = "-" + string;
                }
            }
            if (strAFAdRevenueData != null) {
                str = strAFAdRevenueData;
            }
            return StringsKt.Q0(str).toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK$AFa1vSDK;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "component2", "Ljava/util/List;", "getCurrencyIso4217Code", "()Ljava/util/List;", "AFAdRevenueData", "getRevenue", "Ljava/lang/String;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFd1bSDK;", "component1", "Lcom/appsflyer/internal/AFd1bSDK;", "(Lcom/appsflyer/internal/AFd1bSDK;)V", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<String> getCurrencyIso4217Code() {
            return AFe1ySDK.component2;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) {
            AFe1ySDK.component1 = aFd1bSDK;
        }
    }

    public class AFa1zSDK {
        public static final int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFe1wSDK.values().length];
            try {
                iArr[AFe1wSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1wSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1wSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMediationNetwork = iArr;
        }
    }

    public AFe1ySDK(AFc1kSDK aFc1kSDK, AFc1sSDK aFc1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1sSDK, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.component1 = aFc1sSDK;
        this.getRevenue = P9.i.b(new AnonymousClass5());
        this.getMediationNetwork = P9.i.b(new AnonymousClass4());
    }

    public final String getCurrencyIso4217Code() {
        int i7 = AFa1zSDK.getMediationNetwork[(getRevenue() ? AFe1wSDK.DEFAULT : AFe1wSDK.API).ordinal()];
        if (i7 == 1) {
            return (String) this.getMediationNetwork.getValue();
        }
        if (i7 != 2) {
            if (i7 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new P9.m();
        }
        AFd1bSDK aFd1bSDK = component1;
        String str = aFd1bSDK != null ? aFd1bSDK.getCurrencyIso4217Code : null;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public static boolean getRevenue() {
        return component1 == null;
    }

    public final String AFAdRevenueData() {
        int i7 = AFa1zSDK.getMediationNetwork[(getRevenue() ? AFe1wSDK.DEFAULT : AFe1wSDK.API).ordinal()];
        if (i7 == 1) {
            return "appsflyersdk.com";
        }
        if (i7 != 2) {
            if (i7 == 3) {
                return BuildConfig.FLAVOR;
            }
            throw new P9.m();
        }
        AFd1bSDK aFd1bSDK = component1;
        String str = aFd1bSDK != null ? aFd1bSDK.getRevenue : null;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public static final String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, BuildConfig.FLAVOR);
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, BuildConfig.FLAVOR);
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, BuildConfig.FLAVOR);
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, BuildConfig.FLAVOR);
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, BuildConfig.FLAVOR).substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, BuildConfig.FLAVOR);
        return strSubstring + "-";
    }

    public static final String getRevenue(AFe1ySDK aFe1ySDK) {
        return (String) aFe1ySDK.getRevenue.getValue();
    }

    public static final void getMediationNetwork(AFd1bSDK aFd1bSDK) {
        Companion.getCurrencyIso4217Code(aFd1bSDK);
    }
}
