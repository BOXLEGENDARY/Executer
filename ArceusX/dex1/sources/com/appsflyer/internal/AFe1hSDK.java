package com.appsflyer.internal;

import J2.a;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.appsflyer.internal.AFb1tSDK;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.C1818c;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u0017*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u000f\u0010\u0015\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u0015\u0010\u001aJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u0014\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0012\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0015\u0010(\u001a\u00020\u00198BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010\u000b\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b$\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFe1hSDK;", "Lcom/appsflyer/internal/AFe1tSDK;", "Lcom/appsflyer/internal/AFh1xSDK;", "Lcom/appsflyer/internal/AFc1fSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1fSDK;)V", BuildConfig.FLAVOR, "copydefault", "()Z", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(I)Z", "Landroid/content/Context;", "getMediationNetwork", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1hSDK$AFa1zSDK;", "p1", "getMonetizationNetwork", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1hSDK$AFa1zSDK;)Z", "AFAdRevenueData", "getRevenue", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "(Lcom/appsflyer/internal/AFh1xSDK;Ljava/lang/String;)V", BuildConfig.FLAVOR, "()J", "Lcom/appsflyer/internal/AFe1rSDK;", "()Lcom/appsflyer/internal/AFe1rSDK;", "Lcom/appsflyer/internal/AFc1hSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFc1hSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "component4", "Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFc1oSDK;", "component2", "Lcom/appsflyer/internal/AFc1oSDK;", "component3", "Lcom/appsflyer/internal/AFh1xSDK;", "component1", "LP9/h;", "hashCode", "AFa1ySDK", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1hSDK extends AFe1tSDK<AdvertisingIdData> {

    private final AFc1hSDK getRevenue;
    private final P9.h component1;

    private final AFc1oSDK component3;

    private final AdvertisingIdData AFAdRevenueData;

    private final AFc1kSDK getMonetizationNetwork;

    private final P9.h getCurrencyIso4217Code;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends kotlin.jvm.internal.l implements Function0<Boolean> {
        AnonymousClass2() {
            super(0);
        }

        public final Boolean m44invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1hSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends kotlin.jvm.internal.l implements Function0<Long> {
        AnonymousClass4() {
            super(0);
        }

        public final Long m45invoke() {
            Long l7;
            String currencyIso4217Code = AFe1hSDK.this.getMonetizationNetwork.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (l7 = StringsKt.l(currencyIso4217Code)) == null) ? 1000L : l7.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", BuildConfig.FLAVOR, "reason", BuildConfig.FLAVOR, "onSuccess", "kinds", BuildConfig.FLAVOR, "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1vSDK implements CloudDevCallback {
        final FetchGaidData $fetchGaidData;
        final CountDownLatch $latch;

        AFa1vSDK(FetchGaidData fetchGaidData, CountDownLatch countDownLatch) {
            this.$fetchGaidData = fetchGaidData;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFg1gSDK.w$default(AFLogger.INSTANCE, AFh1zSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1hSDK$AFa1zSDK;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "advertisingId", BuildConfig.FLAVOR, "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1hSDK$AFa1zSDK;", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class FetchGaidData {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public FetchGaidData() {
            this(null, null, false, null, 15, null);
        }

        public static FetchGaidData copy$default(FetchGaidData fetchGaidData, String str, Boolean bool, boolean z7, StringBuilder sb, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = fetchGaidData.advertisingId;
            }
            if ((i7 & 2) != 0) {
                bool = fetchGaidData.isLimitAdTrackingEnabled;
            }
            if ((i7 & 4) != 0) {
                z7 = fetchGaidData.advertisingIdWithGps;
            }
            if ((i7 & 8) != 0) {
                sb = fetchGaidData.gaidError;
            }
            return fetchGaidData.copy(str, bool, z7, sb);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final FetchGaidData copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new FetchGaidData(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchGaidData)) {
                return false;
            }
            FetchGaidData fetchGaidData = (FetchGaidData) other;
            return Intrinsics.b(this.advertisingId, fetchGaidData.advertisingId) && Intrinsics.b(this.isLimitAdTrackingEnabled, fetchGaidData.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == fetchGaidData.advertisingIdWithGps && Intrinsics.b(this.gaidError, fetchGaidData.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z7 = this.advertisingIdWithGps;
            int i7 = z7;
            if (z7 != 0) {
                i7 = 1;
            }
            return ((iHashCode2 + i7) * 31) + this.gaidError.hashCode();
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z7) {
            this.advertisingIdWithGps = z7;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public FetchGaidData(String str, Boolean bool, boolean z7, StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z7;
            this.gaidError = sb;
        }

        public FetchGaidData(String str, Boolean bool, boolean z7, StringBuilder sb, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : bool, (i7 & 4) != 0 ? false : z7, (i7 & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    public AFe1hSDK(AFc1fSDK aFc1fSDK) {
        super(AFe1uSDK.FETCH_ADVERTISING_ID, new AFe1uSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1fSDK, BuildConfig.FLAVOR);
        AFc1hSDK aFc1hSDKAFLogger = aFc1fSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFLogger, BuildConfig.FLAVOR);
        this.getRevenue = aFc1hSDKAFLogger;
        AFc1kSDK revenue = aFc1fSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(revenue, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = revenue;
        AFc1oSDK aFc1oSDKAfErrorLog = aFc1fSDK.afErrorLog();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAfErrorLog, BuildConfig.FLAVOR);
        this.component3 = aFc1oSDKAfErrorLog;
        this.AFAdRevenueData = new AdvertisingIdData(null, null, null, null, null, null, null, null, 255, null);
        this.component1 = P9.i.b(new AnonymousClass4());
        this.getCurrencyIso4217Code = P9.i.b(new AnonymousClass2());
    }

    private static boolean component1() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.ADVERTISING_ID, str, th, true, false, false, false, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, null);
            return false;
        }
    }

    private final boolean component2() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    private final boolean copydefault() {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1hSDK.copydefault():boolean");
    }

    private final boolean getCurrencyIso4217Code(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1hSDK.getCurrencyIso4217Code(int):boolean");
    }

    private static int getMediationNetwork(Context p02) {
        try {
            return C1818c.n().g(p02);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getRevenue(int p02) {
        return getMediationNetwork(p02);
    }

    @Override
    public final AFe1rSDK AFAdRevenueData() {
        if (this.component3.getRevenue()) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1rSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        AFe1rSDK aFe1rSDK = CollectionsKt.m(new Boolean[]{boolValueOf, bool, bool}).contains(Boolean.TRUE) ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
        AFc1oSDK aFc1oSDK = this.component3;
        AFd1gSDK aFd1gSDK = new AFd1gSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1gSDK.getMonetizationNetwork + "ms", false, 4, null);
        aFc1oSDK.getMediationNetwork(aFd1gSDK);
        return aFe1rSDK;
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override
    public final long getRevenue() {
        return ((Number) this.component1.getValue()).longValue();
    }

    private final boolean getMediationNetwork(int p02) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.ADVERTISING_ID;
        AFg1gSDK.i$default(aFLogger, aFh1zSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component1()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getRevenue.getMonetizationNetwork;
            Intrinsics.d(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                FetchGaidData fetchGaidData = new FetchGaidData(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getRevenue.getMonetizationNetwork;
                    Intrinsics.d(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.d("gaid"), new AFa1vSDK(fetchGaidData, countDownLatch));
                    countDownLatch.await(((Number) this.component1.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.ADVERTISING_ID, str, th, true, false, false, false, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, null);
                        StringBuilder gaidError = fetchGaidData.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (fetchGaidData.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th2) {
                        if (fetchGaidData.getGaidError().length() > 0) {
                            getMonetizationNetwork(this.AFAdRevenueData, fetchGaidData.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
                if (fetchGaidData.getGaidError().length() > 0) {
                    getMonetizationNetwork(this.AFAdRevenueData, fetchGaidData.getGaidError().toString());
                }
                String advertisingId = fetchGaidData.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AdvertisingIdData advertisingIdData = this.AFAdRevenueData;
                advertisingIdData.advertisingId = fetchGaidData.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                advertisingIdData.isLimited = bool;
                Boolean bool2 = Boolean.TRUE;
                advertisingIdData.isEnabled = bool2;
                advertisingIdData.isGaidWithGps = bool;
                advertisingIdData.isGaidWithSamsungCloudDev = bool2;
                advertisingIdData.retry = Boolean.valueOf(p02 != 2);
                return true;
            }
        }
        AFg1gSDK.i$default(aFLogger, aFh1zSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    private final boolean getMonetizationNetwork(Context p02, FetchGaidData p1) throws IllegalStateException {
        try {
            AFb1tSDK.AFa1zSDK revenue = AFb1tSDK.getRevenue(p02);
            p1.setAdvertisingId(revenue.getCurrencyIso4217Code);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(revenue.AFAdRevenueData()));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p1.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.a != null) {
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFh1zSDK, "Failed to fetch GAID: " + th.getMessage(), th, true, false, false, false, 64, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            AFg1gSDK.i$default(aFLogger, aFh1zSDK, localizedMessage == null ? th.toString() : localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean AFAdRevenueData(Context p02, FetchGaidData p1) throws IllegalStateException {
        Unit unit;
        try {
            a.C0027a c0027aB = J2.a.b(p02);
            if (c0027aB != null) {
                p1.setAdvertisingId(c0027aB.a());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(c0027aB.b()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.ADVERTISING_ID;
            AFg1gSDK.e$default(aFLogger, aFh1zSDK, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            StringBuilder gaidError = p1.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1gSDK.i$default(aFLogger, aFh1zSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private static void getMonetizationNetwork(AdvertisingIdData advertisingIdData, String str) {
        if (str == null) {
            return;
        }
        String str2 = advertisingIdData.gaidError;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        advertisingIdData.gaidError = str;
    }
}
