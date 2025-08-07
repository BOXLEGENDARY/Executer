package com.appsflyer.internal;

import android.os.Build;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.appsflyer.internal.AFc1bSDK;
import com.github.luben.zstd.BuildConfig;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import g1.kQwt.YGBtcyQ;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import z3.AdxZ.bpTQi;

public final class AFc1dSDK implements AFc1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long copy = -5804734778320964624L;
    private static char copydefault = 46064;
    private static int equals = 347067139;
    private static int hashCode = 0;
    private static int toString = 1;
    private final P9.h AFAdRevenueData;
    private final String areAllFieldsValid;
    private AFc1bSDK.AFa1vSDK component1;
    private final P9.h component2;
    private final P9.h component3;
    private final P9.h component4;
    private final P9.h getCurrencyIso4217Code;
    private final P9.h getMediationNetwork;
    private AFc1fSDK getMonetizationNetwork;
    private final P9.h getRevenue;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getRevenue", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.jvm.internal.l implements Function0<ExecutorService> {
        AnonymousClass1() {
            super(0);
        }

        public final ExecutorService invoke() {
            ExecutorService executorServiceAFAdRevenueData = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(executorServiceAFAdRevenueData, BuildConfig.FLAVOR);
            return executorServiceAFAdRevenueData;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1wSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFd1wSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass10 extends kotlin.jvm.internal.l implements Function0<AFd1wSDK> {
        AnonymousClass10() {
            super(0);
        }

        public final AFd1wSDK invoke() {
            return new AFd1wSDK(AFc1dSDK.this.AFAdRevenueData());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1zSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1zSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends kotlin.jvm.internal.l implements Function0<AFd1zSDK> {
        AnonymousClass2() {
            super(0);
        }

        public final AFd1zSDK invoke() {
            AFc1hSDK aFc1hSDKAFLogger = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFLogger();
            Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFLogger, BuildConfig.FLAVOR);
            return new AFd1zSDK(aFc1hSDKAFLogger);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1mSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1mSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends kotlin.jvm.internal.l implements Function0<AFf1mSDK> {
        AnonymousClass3() {
            super(0);
        }

        public final AFf1mSDK invoke() {
            AFf1mSDK aFf1mSDKComponent4 = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).component4();
            Intrinsics.checkNotNullExpressionValue(aFf1mSDKComponent4, BuildConfig.FLAVOR);
            return aFf1mSDKComponent4;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1sSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1sSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends kotlin.jvm.internal.l implements Function0<AFc1sSDK> {
        AnonymousClass4() {
            super(0);
        }

        public final AFc1sSDK invoke() {
            AFc1sSDK aFc1sSDKComponent1 = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).component1();
            Intrinsics.checkNotNullExpressionValue(aFc1sSDKComponent1, jUbDmI.CKjyzEmSgedAg);
            return aFc1sSDKComponent1;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1kSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFc1kSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends kotlin.jvm.internal.l implements Function0<AFc1kSDK> {
        AnonymousClass5() {
            super(0);
        }

        public final AFc1kSDK invoke() {
            AFc1kSDK revenue = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, BuildConfig.FLAVOR);
            return revenue;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1iSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1iSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass8 extends kotlin.jvm.internal.l implements Function0<AFf1iSDK> {
        AnonymousClass8() {
            super(0);
        }

        public final AFf1iSDK invoke() {
            AFf1iSDK aFf1iSDKAFKeystoreWrapper = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(aFf1iSDKAFKeystoreWrapper, BuildConfig.FLAVOR);
            return aFf1iSDKAFKeystoreWrapper;
        }
    }

    public AFc1dSDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFc1fSDK;
        this.AFAdRevenueData = P9.i.b(new AnonymousClass3());
        this.getMediationNetwork = P9.i.b(new AnonymousClass5());
        this.getRevenue = P9.i.b(new AnonymousClass4());
        this.getCurrencyIso4217Code = P9.i.b(new AnonymousClass8());
        this.component2 = P9.i.b(new AnonymousClass1());
        this.areAllFieldsValid = YGBtcyQ.fBNCHcXoU;
        this.component4 = P9.i.b(new AnonymousClass2());
        this.component3 = P9.i.b(new AnonymousClass10());
    }

    private static Object AFAdRevenueData(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i7 = hashCode + 33;
        toString = i7 % 128;
        int i8 = i7 % 2;
        AFc1kSDK aFc1kSDK = (AFc1kSDK) aFc1dSDK.getMediationNetwork.getValue();
        if (i8 == 0) {
            throw null;
        }
        hashCode = (toString + 47) % 128;
        return aFc1kSDK;
    }

    private final AFf1iSDK areAllFieldsValid() {
        int i7 = toString + 63;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        AFf1iSDK aFf1iSDK = (AFf1iSDK) this.getCurrencyIso4217Code.getValue();
        int i8 = toString + 41;
        hashCode = i8 % 128;
        if (i8 % 2 == 0) {
            return aFf1iSDK;
        }
        throw null;
    }

    private final ExecutorService component1() {
        return (ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this));
    }

    private AFd1vSDK component2() {
        int i7 = toString + 101;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            return (AFd1vSDK) this.component3.getValue();
        }
        int i8 = 50 / 0;
        return (AFd1vSDK) this.component3.getValue();
    }

    private final AFh1gSDK component3() {
        AFi1zSDK aFi1zSDK = getRevenue().getMonetizationNetwork.getMediationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        int i7 = toString;
        hashCode = (i7 + 93) % 128;
        AFh1iSDK aFh1iSDK = aFi1zSDK.getRevenue;
        if (aFh1iSDK == null) {
            return null;
        }
        hashCode = (i7 + 43) % 128;
        return aFh1iSDK.getMediationNetwork;
    }

    private final AFc1sSDK component4() {
        hashCode = (toString + 27) % 128;
        AFc1sSDK aFc1sSDK = (AFc1sSDK) this.getRevenue.getValue();
        int i7 = toString + 81;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            return aFc1sSDK;
        }
        throw null;
    }

    private final synchronized void copy() {
        try {
            AFh1gSDK aFh1gSDKComponent3 = component3();
            boolean zAFAdRevenueData = false;
            if (aFh1gSDKComponent3 != null) {
                hashCode = (toString + 103) % 128;
                if (aFh1gSDKComponent3.getCurrencyIso4217Code == -1) {
                    component4().getMediationNetwork("af_send_exc_to_server_window");
                } else if (component4().getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    int i7 = toString + 51;
                    hashCode = i7 % 128;
                    if (i7 % 2 != 0) {
                        getMonetizationNetwork(aFh1gSDKComponent3);
                        int i8 = 6 / 0;
                    } else {
                        getMonetizationNetwork(aFh1gSDKComponent3);
                    }
                }
                zAFAdRevenueData = AFAdRevenueData(aFh1gSDKComponent3);
            }
            AFc1bSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(zAFAdRevenueData);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void copydefault() {
        toString = (hashCode + 65) % 128;
        AFh1gSDK aFh1gSDKComponent3 = component3();
        if (aFh1gSDKComponent3 != null) {
            if (!getCurrencyIso4217Code(aFh1gSDKComponent3)) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            String revenue = areAllFieldsValid().getRevenue();
            if (revenue != null) {
                String string = new JSONObject(getMediationNetwork((Map) getCurrencyIso4217Code(new Object[]{this, aFh1gSDKComponent3}, -1662256862, 1662256866, System.identityHashCode(this)), AFAdRevenueData().getCurrencyIso4217Code())).toString();
                Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(revenue, BuildConfig.FLAVOR);
                getRevenue(string, revenue);
                return;
            }
            int i7 = hashCode + 89;
            toString = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }
    }

    private final synchronized void equals() {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1dSDK.equals():void");
    }

    public static Object getCurrencyIso4217Code(Object[] objArr, int i7, int i8, int i9) {
        int i10 = ~((~i7) | i8);
        int i11 = ~i8;
        int i12 = ~(i11 | i7);
        int i13 = (i7 * 399) + (i8 * 399) + ((i10 | i12 | (~(i11 | i9))) * 398) + ((i7 | i8) * (-1194)) + (((~((~i9) | i11)) | i10 | i12) * 398);
        if (i13 == 1) {
            return getRevenue(objArr);
        }
        if (i13 == 2) {
            return getMonetizationNetwork(objArr);
        }
        if (i13 != 3) {
            return i13 != 4 ? AFAdRevenueData(objArr) : getCurrencyIso4217Code(objArr);
        }
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        AFh1gSDK aFh1gSDK = (AFh1gSDK) objArr[1];
        hashCode = (toString + 91) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = aFc1dSDK.component4().getMediationNetwork(JmBUOGMwkkxg.xuRe, -1L);
        if (aFh1gSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            return Boolean.FALSE;
        }
        if (mediationNetwork != -1) {
            toString = (hashCode + 55) % 128;
            if (mediationNetwork >= jCurrentTimeMillis) {
                return Boolean.valueOf(aFc1dSDK.getMediationNetwork(aFh1gSDK));
            }
        }
        hashCode = (toString + 13) % 128;
        return Boolean.FALSE;
    }

    private static Object getMonetizationNetwork(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i7 = hashCode + 17;
        toString = i7 % 128;
        int i8 = i7 % 2;
        ExecutorService executorService = (ExecutorService) aFc1dSDK.component2.getValue();
        if (i8 == 0) {
            int i9 = 13 / 0;
        }
        return executorService;
    }

    private final AFf1mSDK getRevenue() {
        hashCode = (toString + 99) % 128;
        AFf1mSDK aFf1mSDK = (AFf1mSDK) this.AFAdRevenueData.getValue();
        int i7 = hashCode + 15;
        toString = i7 % 128;
        if (i7 % 2 != 0) {
            return aFf1mSDK;
        }
        throw null;
    }

    @Override
    public final void getMediationNetwork(AFc1bSDK.AFa1vSDK aFa1vSDK) {
        toString = (hashCode + 79) % 128;
        this.component1 = aFa1vSDK;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() {
            @Override
            public final void run() {
                AFc1dSDK.getMonetizationNetwork(this.f13651d);
            }
        });
        int i7 = toString + 41;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 27 / 0;
        }
    }

    private static void a(String str, String str2, String str3, int i7, char c2, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        if (str3 != null) {
            charArray = str3.toCharArray();
            $10 = ($11 + 15) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
            $11 = ($10 + 31) % 128;
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i7));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFk1oSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i8 = aFk1oSDK.getCurrencyIso4217Code;
            if (i8 >= length3) {
                objArr[0] = new String(cArr5);
                return;
            }
            int i9 = (i8 + 3) % 4;
            int i10 = cArr3[i8 % 4] * 32718;
            char c3 = cArr4[(i8 + 2) % 4];
            char c7 = (char) ((i10 + c3) % 65535);
            aFk1oSDK.getRevenue = c7;
            cArr4[i9] = (char) (((cArr3[i9] * 32718) + c3) / 65535);
            cArr3[i9] = c7;
            cArr5[i8] = (char) ((((cArr2[i8] ^ c7) ^ (copy ^ (-5804734778320964624L))) ^ ((int) (equals ^ (-5804734778320964624L)))) ^ ((char) (copydefault ^ (-5804734778320964624L))));
            aFk1oSDK.getCurrencyIso4217Code = i8 + 1;
        }
    }

    public static final void getMonetizationNetwork(AFc1dSDK aFc1dSDK, Throwable th, String str) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        AFh1gSDK aFh1gSDKComponent3 = aFc1dSDK.component3();
        boolean z7 = false;
        if (aFh1gSDKComponent3 != null) {
            int i7 = hashCode + 53;
            toString = i7 % 128;
            if (i7 % 2 != 0 ? !aFc1dSDK.AFAdRevenueData(aFh1gSDKComponent3) : !aFc1dSDK.AFAdRevenueData(aFh1gSDKComponent3)) {
                hashCode = (toString + 81) % 128;
            } else {
                z7 = true;
            }
        }
        if (z7) {
            aFc1dSDK.AFAdRevenueData().getCurrencyIso4217Code(th, str);
            hashCode = (toString + 55) % 128;
        }
    }

    public final AFc1aSDK AFAdRevenueData() {
        int i7 = hashCode + 81;
        toString = i7 % 128;
        if (i7 % 2 != 0) {
            return (AFc1aSDK) this.component4.getValue();
        }
        throw null;
    }

    @Override
    public final void getRevenue(final Throwable th, final String str) {
        int i7 = hashCode + 55;
        toString = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() {
                @Override
                public final void run() {
                    AFc1dSDK.getMonetizationNetwork(this.f13652d, th, str);
                }
            });
        } else {
            Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() {
                @Override
                public final void run() {
                    AFc1dSDK.getMonetizationNetwork(this.f13652d, th, str);
                }
            });
            int i8 = 49 / 0;
        }
    }

    private final boolean AFAdRevenueData(AFh1gSDK aFh1gSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this, aFh1gSDK}, 943546209, -943546206, System.identityHashCode(this))).booleanValue();
    }

    @Override
    public final void getMediationNetwork() {
        toString = (hashCode + 33) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() {
            @Override
            public final void run() {
                AFc1dSDK.getMediationNetwork(this.f13649d);
            }
        });
        toString = (hashCode + 97) % 128;
    }

    private static Object getRevenue(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i7 = hashCode + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        toString = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
            aFc1dSDK.copydefault();
            return null;
        }
        Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
        aFc1dSDK.copydefault();
        throw null;
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<ExceptionInfo> list) {
        Map<String, Object> mapK;
        int i7 = hashCode + 91;
        toString = i7 % 128;
        if (i7 % 2 == 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[1] = P9.t.a("deviceInfo", map);
            pairArr[0] = P9.t.a("excs", AFd1xSDK.AFAdRevenueData(list));
            mapK = kotlin.collections.F.k(pairArr);
        } else {
            mapK = kotlin.collections.F.k(new Pair[]{P9.t.a("deviceInfo", map), P9.t.a("excs", AFd1xSDK.AFAdRevenueData(list))});
        }
        toString = (hashCode + 35) % 128;
        return mapK;
    }

    public static final void getMonetizationNetwork(AFc1dSDK aFc1dSDK) {
        int i7 = toString + 9;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
            aFc1dSDK.equals();
            hashCode = (toString + 105) % 128;
        } else {
            Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
            aFc1dSDK.equals();
            throw null;
        }
    }

    private final boolean getMediationNetwork(AFh1gSDK aFh1gSDK) {
        new AFd1rSDK();
        String str = this.areAllFieldsValid;
        String str2 = aFh1gSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, BuildConfig.FLAVOR);
        boolean zAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str, str2);
        hashCode = (toString + 13) % 128;
        return zAFAdRevenueData;
    }

    public static final AFc1fSDK getCurrencyIso4217Code(AFc1dSDK aFc1dSDK) {
        int i7 = toString + 37;
        hashCode = i7 % 128;
        int i8 = i7 % 2;
        AFc1fSDK aFc1fSDK = aFc1dSDK.getMonetizationNetwork;
        if (i8 != 0) {
            int i9 = 46 / 0;
        }
        return aFc1fSDK;
    }

    public static final void getMediationNetwork(AFc1dSDK aFc1dSDK) {
        getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 983518343, -983518342, (int) System.currentTimeMillis());
    }

    public static final void getRevenue(AFc1dSDK aFc1dSDK) {
        int i7 = toString + 35;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
            aFc1dSDK.copy();
            int i8 = 9 / 0;
        } else {
            Intrinsics.checkNotNullParameter(aFc1dSDK, BuildConfig.FLAVOR);
            aFc1dSDK.copy();
        }
        toString = (hashCode + 101) % 128;
    }

    @Override
    public final void getCurrencyIso4217Code() {
        int i7 = toString + 87;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() {
                @Override
                public final void run() {
                    AFc1dSDK.getRevenue(this.f13650d);
                }
            });
            int i8 = 89 / 0;
        } else {
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new Runnable() {
                @Override
                public final void run() {
                    AFc1dSDK.getRevenue(this.f13650d);
                }
            });
        }
    }

    private final void getMonetizationNetwork(AFh1gSDK aFh1gSDK) {
        toString = (hashCode + 7) % 128;
        int i7 = aFh1gSDK.AFAdRevenueData;
        long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1gSDK.getCurrencyIso4217Code);
        AFc1sSDK aFc1sSDKComponent4 = component4();
        aFc1sSDKComponent4.AFAdRevenueData(bpTQi.qJiXwPZasMndT, jCurrentTimeMillis);
        aFc1sSDKComponent4.getMonetizationNetwork("af_send_exc_min", i7);
        int i8 = hashCode + 45;
        toString = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        AFh1gSDK aFh1gSDK = (AFh1gSDK) objArr[1];
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "\ua4cc\ude37㘛툓䁡", "ꊀ喂ʙ輌", (ViewConfiguration.getWindowTouchSlop() >> 8) - 1722449246, (char) (AndroidCharacter.getMirror('0') + 3026), objArr2);
        Map mapK = kotlin.collections.F.k(new Pair[]{P9.t.a(((String) objArr2[0]).intern(), Build.BRAND), P9.t.a("model", Build.MODEL), P9.t.a("app_id", ((AFc1kSDK) getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 652478680, -652478680, System.identityHashCode(aFc1dSDK))).AFAdRevenueData.getMonetizationNetwork.getPackageName()), P9.t.a("p_ex", new AFa1ySDK().getMediationNetwork()), P9.t.a("api", String.valueOf(Build.VERSION.SDK_INT)), P9.t.a("sdk", aFc1dSDK.areAllFieldsValid), P9.t.a("uid", AFb1kSDK.getMonetizationNetwork(((AFc1kSDK) getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 652478680, -652478680, System.identityHashCode(aFc1dSDK))).getRevenue)), P9.t.a("exc_config", aFh1gSDK.getMediationNetwork())});
        int i7 = hashCode + 53;
        toString = i7 % 128;
        if (i7 % 2 != 0) {
            return mapK;
        }
        throw null;
    }

    private final void getRevenue(String str, String str2) {
        toString = (hashCode + 81) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, BuildConfig.FLAVOR);
        component2().getMonetizationNetwork(bytes, kotlin.collections.F.f(P9.t.a("Authorization", AFj1hSDK.AFAdRevenueData(str, str2))), 2000);
        hashCode = (toString + 29) % 128;
    }

    private final AFc1kSDK getMonetizationNetwork() {
        return (AFc1kSDK) getCurrencyIso4217Code(new Object[]{this}, 652478680, -652478680, System.identityHashCode(this));
    }

    private final Map<String, String> getRevenue(AFh1gSDK aFh1gSDK) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, aFh1gSDK}, -1662256862, 1662256866, System.identityHashCode(this));
    }

    private final boolean getCurrencyIso4217Code(AFh1gSDK aFh1gSDK) {
        int iAFAdRevenueData;
        int i7 = hashCode + 13;
        toString = i7 % 128;
        if (i7 % 2 != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long mediationNetwork = component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
            if (aFh1gSDK.getMediationNetwork >= TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis) && mediationNetwork != -1) {
                toString = (hashCode + 67) % 128;
                if (mediationNetwork >= jCurrentTimeMillis && (iAFAdRevenueData = component4().AFAdRevenueData("af_send_exc_min", -1)) != -1 && AFAdRevenueData().getMediationNetwork() >= iAFAdRevenueData) {
                    return getMediationNetwork(aFh1gSDK);
                }
            }
            return false;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
        long j7 = aFh1gSDK.getMediationNetwork;
        TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis2);
        throw null;
    }
}
