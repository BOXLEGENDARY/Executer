package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1zSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010%\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Lcom/appsflyer/internal/AFe1cSDK;", "Lcom/appsflyer/internal/AFe1tSDK;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFe1zSDK;", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lcom/appsflyer/internal/AFc1kSDK;", "p2", "Lcom/appsflyer/internal/AFc1hSDK;", "p3", "Lcom/appsflyer/internal/AFg1tSDK;", "p4", "Lcom/appsflyer/internal/AFf1iSDK;", "p5", "Lkotlin/Function1;", "Lcom/appsflyer/internal/AFe1rSDK;", "p6", "<init>", "(Lcom/appsflyer/internal/AFe1zSDK;Ljava/util/concurrent/Executor;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFf1iSDK;Lkotlin/jvm/functions/Function1;)V", BuildConfig.FLAVOR, "getRevenue", "()J", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFe1rSDK;", "getCurrencyIso4217Code", "()V", BuildConfig.FLAVOR, "getMonetizationNetwork", "()Z", "component3", "Ljava/util/concurrent/Executor;", "component1", "Lcom/appsflyer/internal/AFc1hSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1zSDK;", "getMediationNetwork", "component2", "Lcom/appsflyer/internal/AFg1tSDK;", "component4", "Lcom/appsflyer/internal/AFc1kSDK;", "copy", "Lkotlin/jvm/functions/Function1;", "copydefault", "Lcom/appsflyer/internal/AFf1iSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1cSDK extends AFe1tSDK<Unit> {

    public AFe1zSDK getMediationNetwork;

    public AFc1hSDK AFAdRevenueData;

    public AFg1tSDK getRevenue;

    public Executor getMonetizationNetwork;

    public AFc1kSDK getCurrencyIso4217Code;

    public Function1<AFe1rSDK, Unit> component3;

    public AFf1iSDK component2;

    public static final class AFa1vSDK implements OutcomeReceiver {
        private CountDownLatch getCurrencyIso4217Code;
        private AFe1cSDK getMediationNetwork;
        private kotlin.jvm.internal.y<AFe1rSDK> getRevenue;

        AFa1vSDK(kotlin.jvm.internal.y<AFe1rSDK> yVar, CountDownLatch countDownLatch, AFe1cSDK aFe1cSDK) {
            this.getRevenue = yVar;
            this.getCurrencyIso4217Code = countDownLatch;
            this.getMediationNetwork = aFe1cSDK;
        }

        public final void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, BuildConfig.FLAVOR);
            AFe1cSDK.AFAdRevenueData(exc);
            this.getCurrencyIso4217Code.countDown();
        }

        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
            this.getRevenue.d = AFe1rSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFh1zSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getCurrencyIso4217Code.countDown();
        }
    }

    public AFe1cSDK(AFe1zSDK aFe1zSDK, Executor executor, AFc1kSDK aFc1kSDK, AFc1hSDK aFc1hSDK, AFg1tSDK aFg1tSDK, AFf1iSDK aFf1iSDK, Function1<? super AFe1rSDK, Unit> function1) {
        super(AFe1uSDK.REGISTER_TRIGGER, new AFe1uSDK[]{AFe1uSDK.RC_CDN, AFe1uSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(executor, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1hSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFg1tSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFf1iSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        this.getMediationNetwork = aFe1zSDK;
        this.getMonetizationNetwork = executor;
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.AFAdRevenueData = aFc1hSDK;
        this.getRevenue = aFg1tSDK;
        this.component2 = aFf1iSDK;
        this.component3 = function1;
        if (aFe1zSDK instanceof AFe1zSDK.AFa1ySDK) {
            this.AFAdRevenueData.add(AFe1uSDK.CONVERSION);
        }
        if (this.getMediationNetwork instanceof AFe1zSDK.AFa1uSDK) {
            this.getRevenue.add(AFe1uSDK.CONVERSION);
        }
        if (this.getMediationNetwork instanceof AFe1zSDK.AFa1vSDK) {
            this.getRevenue.add(AFe1uSDK.INAPP);
        }
    }

    @Override
    public final AFe1rSDK AFAdRevenueData() {
        MeasurementManager measurementManagerA;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.d = AFe1rSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            if (context != null && (measurementManagerA = C1799u.a(context.getSystemService(C1798t.a()))) != null) {
                new AFj1kSDK(this.getCurrencyIso4217Code, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1kSDK.getMediationNetwork()).buildUpon();
                String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code();
                if (currencyIso4217Code == null) {
                    currencyIso4217Code = BuildConfig.FLAVOR;
                }
                Pair pairA = P9.t.a("event_name", this.getMediationNetwork.getMonetizationNetwork);
                Pair pairA2 = P9.t.a("app_id", this.getCurrencyIso4217Code.AFAdRevenueData.getMonetizationNetwork.getPackageName());
                Context context2 = this.getCurrencyIso4217Code.AFAdRevenueData.getMonetizationNetwork;
                Map mapL = kotlin.collections.F.l(new Pair[]{pairA, pairA2, P9.t.a("app_version", AFj1nSDK.getCurrencyIso4217Code(context2, context2.getPackageName())), P9.t.a("sdk_version", AFc1kSDK.getRevenue()), P9.t.a("api_version", AFc1kSDK.getMonetizationNetwork()), P9.t.a("timestamp", String.valueOf(this.getRevenue.AFAdRevenueData())), P9.t.a("request_id", AFc1kSDK.AFAdRevenueData()), P9.t.a("gaid", currencyIso4217Code)});
                String monetizationNetwork = AFb1kSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.getRevenue);
                if (monetizationNetwork != null) {
                    mapL.put("appsflyer_id", monetizationNetwork);
                }
                Long currencyIso4217Code2 = this.getRevenue.getCurrencyIso4217Code();
                if (currencyIso4217Code2 != null) {
                    mapL.put("install_time", String.valueOf(currencyIso4217Code2.longValue()));
                }
                AFe1zSDK aFe1zSDK = this.getMediationNetwork;
                if (aFe1zSDK instanceof AFe1zSDK.AFa1vSDK) {
                    Float f7 = ((AFe1zSDK.AFa1vSDK) aFe1zSDK).getMediationNetwork;
                    if (f7 != null) {
                        mapL.put("event_revenue", String.valueOf(f7.floatValue()));
                    }
                    Integer num = ((AFe1zSDK.AFa1vSDK) this.getMediationNetwork).getMonetizationNetwork;
                    if (num != null) {
                        mapL.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : mapL.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, BuildConfig.FLAVOR);
                measurementManagerA.registerTrigger(uriBuild, this.getMonetizationNetwork, B0.M.a(new AFa1vSDK(yVar, countDownLatch, this)));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            yVar.d = AFe1rSDK.TIMEOUT;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
        }
        return (AFe1rSDK) yVar.d;
    }

    @Override
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1rSDK aFe1rSDK = this.getMediationNetwork;
        if (aFe1rSDK != null) {
            this.component3.invoke(aFe1rSDK);
        }
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override
    public final long getRevenue() {
        return 20000L;
    }

    public static final void AFAdRevenueData(Throwable th) {
        AFLogger.INSTANCE.e(AFh1zSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }
}
