package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import j0.tkB.pkcpMQSgx;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFf1rSDK;", "Lcom/appsflyer/internal/AFi1kSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "p1", "Lcom/appsflyer/internal/AFc1fSDK;", "p2", "Lcom/appsflyer/internal/AFh1lSDK;", "p3", "<init>", "(Lcom/appsflyer/internal/AFi1kSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1fSDK;Lcom/appsflyer/internal/AFh1lSDK;)V", "Lcom/appsflyer/internal/AFh1tSDK;", BuildConfig.FLAVOR, "component2", "(Lcom/appsflyer/internal/AFh1tSDK;)V", BuildConfig.FLAVOR, "getRevenue", "()J", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "equals", "()Ljava/util/Map;", BuildConfig.FLAVOR, "copydefault", "()Z", "getMonetizationNetwork", BuildConfig.FLAVOR, "getMediationNetwork", "(I)V", "Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFi1kSDK;", "AFAdRevenueData"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1eSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int registerClient;

    private final AFi1kSDK AFAdRevenueData;

    private final AFc1kSDK getMediationNetwork;
    private static char[] AFKeystoreWrapper = {45532, 45510, 45531, 45518, 45535, 45513, 45552, 45506, 45514};
    private static char AFInAppEventParameterName = 33846;

    public AFe1eSDK(AFi1kSDK aFi1kSDK, AFc1kSDK aFc1kSDK, AFc1fSDK aFc1fSDK, AFh1lSDK aFh1lSDK, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1kSDK, aFc1kSDK, aFc1fSDK, (i7 & 8) != 0 ? new AFh1lSDK() : aFh1lSDK);
    }

    private static void a(String str, int i7, byte b2, Object[] objArr) {
        int i8;
        char[] cArr = str;
        if (str != null) {
            $11 = ($10 + 73) % 128;
            char[] charArray = str.toCharArray();
            $11 = ($10 + R.styleable.AppCompatTheme_windowFixedWidthMinor) % 128;
            cArr = charArray;
        }
        char[] cArr2 = cArr;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        char[] cArr3 = AFKeystoreWrapper;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            $10 = ($11 + 41) % 128;
            for (int i9 = 0; i9 < length; i9++) {
                cArr4[i9] = (char) (cArr3[i9] ^ (-2775045471812025291L));
            }
            cArr3 = cArr4;
        }
        char c2 = (char) ((-2775045471812025291L) ^ AFInAppEventParameterName);
        char[] cArr5 = new char[i7];
        if (i7 % 2 != 0) {
            int i10 = $11 + 63;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                i8 = i7 + 111;
                cArr5[i8] = (char) (cArr2[i8] * b2);
            } else {
                i8 = i7 - 1;
                cArr5[i8] = (char) (cArr2[i8] - b2);
            }
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
                char c3 = cArr2[i11];
                aFk1rSDK.AFAdRevenueData = c3;
                char c7 = cArr2[i11 + 1];
                aFk1rSDK.getMediationNetwork = c7;
                if (c3 == c7) {
                    cArr5[i11] = (char) (c3 - b2);
                    cArr5[i11 + 1] = (char) (c7 - b2);
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
                        int i16 = ((i12 + c2) - 1) % c2;
                        aFk1rSDK.getMonetizationNetwork = i16;
                        int i17 = ((i14 + c2) - 1) % c2;
                        aFk1rSDK.getCurrencyIso4217Code = i17;
                        cArr5[i11] = cArr3[(i16 * c2) + i13];
                        cArr5[i11 + 1] = cArr3[(i17 * c2) + i15];
                    } else if (i12 == i14) {
                        int i18 = ((i13 + c2) - 1) % c2;
                        aFk1rSDK.component3 = i18;
                        int i19 = ((i15 + c2) - 1) % c2;
                        aFk1rSDK.component2 = i19;
                        cArr5[i11] = cArr3[(i12 * c2) + i18];
                        cArr5[i11 + 1] = cArr3[(i14 * c2) + i19];
                    } else {
                        cArr5[i11] = cArr3[(i12 * c2) + i15];
                        cArr5[i11 + 1] = cArr3[(i14 * c2) + i13];
                    }
                }
                aFk1rSDK.getRevenue = i11 + 2;
            }
        }
        for (int i20 = 0; i20 < i7; i20++) {
            cArr5[i20] = (char) (cArr5[i20] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    private final void component2(AFh1tSDK p02) {
        registerClient = (AFLogger + 19) % 128;
        try {
            Map<String, ?> mapEquals = equals();
            if (mapEquals != null) {
                p02.getCurrencyIso4217Code(mapEquals);
                registerClient = (AFLogger + R.styleable.AppCompatTheme_windowFixedWidthMinor) % 128;
            }
            if (!(!this.AFAdRevenueData.getCurrencyIso4217Code())) {
                return;
            }
            Map<String, Object> mapComponent1 = AFf1tSDK.component1(p02);
            Intrinsics.checkNotNullExpressionValue(mapComponent1, BuildConfig.FLAVOR);
            mapComponent1.put("pia_disabled", Boolean.TRUE);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
    }

    private final Map<String, Object> equals() {
        AFi1nSDK mediationNetwork = this.AFAdRevenueData.getMediationNetwork();
        if (mediationNetwork == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(mediationNetwork.getMonetizationNetwork));
        linkedHashMap2.put("ttr_millis", Long.valueOf(mediationNetwork.getRevenue));
        String str = mediationNetwork.AFAdRevenueData;
        if (str != null) {
            int i7 = AFLogger + 11;
            registerClient = i7 % 128;
            if (i7 % 2 != 0) {
                linkedHashMap2.put("pia_token", str);
                throw null;
            }
            linkedHashMap2.put("pia_token", str);
        }
        String str2 = mediationNetwork.getCurrencyIso4217Code;
        if (str2 != null) {
            linkedHashMap2.put("error_code", str2);
            registerClient = (AFLogger + 73) % 128;
        }
        linkedHashMap.put("pia", linkedHashMap2);
        return linkedHashMap;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFe1eSDK aFe1eSDK = (AFe1eSDK) objArr[0];
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, BuildConfig.FLAVOR);
        Object[] objArr2 = new Object[1];
        a("\u0004\u0003\b\u0000\u0004\u0001\u0006\u0002\u0000\u0005\u0001\u0007", 12 - Color.blue(0), (byte) (15 - Drawable.resolveOpacity(0, 0)), objArr2);
        map.put(((String) objArr2[0]).intern(), String.valueOf(new Date().getTime()));
        super.getRevenue(aFh1tSDK);
        aFe1eSDK.component2(aFh1tSDK);
        AFg1tSDK aFg1tSDK = ((AFf1tSDK) aFe1eSDK).hashCode;
        Map<String, Object> map2 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, BuildConfig.FLAVOR);
        aFg1tSDK.AFAdRevenueData(map2, aFe1eSDK.getMediationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0), aFe1eSDK.getMediationNetwork.getRevenue.AFAdRevenueData("appsFlyerInAppEventCount", 0));
        int i7 = registerClient + 103;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static Object getRevenue(Object[] objArr, int i7, int i8, int i9) {
        return getCurrencyIso4217Code(objArr);
    }

    @Override
    protected final boolean copydefault() {
        int i7 = AFLogger;
        registerClient = (i7 + R.styleable.AppCompatTheme_windowFixedWidthMinor) % 128;
        registerClient = (i7 + 25) % 128;
        return false;
    }

    @Override
    protected final void getMediationNetwork(int p02) {
        int i7 = registerClient + 21;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public final boolean getMonetizationNetwork() {
        int i7 = (AFLogger + 107) % 128;
        registerClient = i7;
        int i8 = i7 + 27;
        AFLogger = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 50 / 0;
        }
        return false;
    }

    @Override
    public final long getRevenue() {
        registerClient = (AFLogger + 57) % 128;
        long millis = TimeUnit.MINUTES.toMillis(1L);
        int i7 = registerClient + 77;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 60 / 0;
        }
        return millis;
    }

    private AFe1eSDK(AFi1kSDK aFi1kSDK, AFc1kSDK aFc1kSDK, AFc1fSDK aFc1fSDK, AFh1lSDK aFh1lSDK) {
        super(aFh1lSDK, aFc1fSDK);
        Intrinsics.checkNotNullParameter(aFi1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFh1lSDK, BuildConfig.FLAVOR);
        this.AFAdRevenueData = aFi1kSDK;
        this.getMediationNetwork = aFc1kSDK;
        this.AFAdRevenueData.add(AFe1uSDK.CONVERSION);
    }

    @Override
    protected final void getRevenue(AFh1tSDK p02) {
        getRevenue(new Object[]{this, p02}, -1391583709, 1391583709, System.identityHashCode(this));
    }

    public AFe1eSDK(AFi1kSDK aFi1kSDK, AFc1kSDK aFc1kSDK, AFc1fSDK aFc1fSDK) {
        this(aFi1kSDK, aFc1kSDK, aFc1fSDK, null, 8, null);
        String str = pkcpMQSgx.ZOGI;
        Intrinsics.checkNotNullParameter(aFi1kSDK, str);
        Intrinsics.checkNotNullParameter(aFc1kSDK, str);
        Intrinsics.checkNotNullParameter(aFc1fSDK, str);
    }
}
