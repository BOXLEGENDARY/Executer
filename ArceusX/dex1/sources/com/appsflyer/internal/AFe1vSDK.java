package com.appsflyer.internal;

import com.appsflyer.internal.AFe1sSDK.AnonymousClass3;
import com.appsflyer.internal.AFe1zSDK;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1vSDK {
    private final ExecutorService AFAdRevenueData;
    private final AFe1sSDK areAllFieldsValid;
    private final AFf1iSDK component3;
    private final AFg1tSDK getCurrencyIso4217Code;
    public final AFc1sSDK getMediationNetwork;
    public final AFc1hSDK getMonetizationNetwork;
    private final AFc1kSDK getRevenue;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", "p0", BuildConfig.FLAVOR, "AFAdRevenueData", "(Lcom/appsflyer/internal/AFe1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.l implements Function1<AFe1rSDK, Unit> {
        public static final AnonymousClass1 getMediationNetwork = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void AFAdRevenueData(AFe1rSDK aFe1rSDK) {
            Intrinsics.checkNotNullParameter(aFe1rSDK, BuildConfig.FLAVOR);
        }

        public final Object invoke(Object obj) {
            AFAdRevenueData((AFe1rSDK) obj);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", "p0", BuildConfig.FLAVOR, "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFe1rSDK;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends kotlin.jvm.internal.l implements Function1<AFe1rSDK, Unit> {
        AnonymousClass2() {
            super(1);
        }

        public final void getMonetizationNetwork(AFe1rSDK aFe1rSDK) {
            Intrinsics.checkNotNullParameter(aFe1rSDK, BuildConfig.FLAVOR);
            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                AFe1vSDK.this.getMediationNetwork.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", true);
            }
        }

        public final Object invoke(Object obj) {
            getMonetizationNetwork((AFe1rSDK) obj);
            return Unit.a;
        }
    }

    public AFe1vSDK(AFc1sSDK aFc1sSDK, AFc1hSDK aFc1hSDK, AFc1kSDK aFc1kSDK, ExecutorService executorService, AFg1tSDK aFg1tSDK, AFf1iSDK aFf1iSDK, AFe1sSDK aFe1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1sSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1hSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1kSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(executorService, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFg1tSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFf1iSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFe1sSDK, BuildConfig.FLAVOR);
        this.getMediationNetwork = aFc1sSDK;
        this.getMonetizationNetwork = aFc1hSDK;
        this.getRevenue = aFc1kSDK;
        this.AFAdRevenueData = executorService;
        this.getCurrencyIso4217Code = aFg1tSDK;
        this.component3 = aFf1iSDK;
        this.areAllFieldsValid = aFe1sSDK;
    }

    public final void getCurrencyIso4217Code(AFe1zSDK aFe1zSDK, Function1<? super AFe1rSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFe1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        AFe1cSDK aFe1cSDK = new AFe1cSDK(aFe1zSDK, this.AFAdRevenueData, this.getRevenue, this.getMonetizationNetwork, this.getCurrencyIso4217Code, this.component3, function1);
        AFe1sSDK aFe1sSDK = this.areAllFieldsValid;
        aFe1sSDK.getRevenue.execute(aFe1sSDK.new AnonymousClass3(aFe1cSDK));
    }

    public final void getRevenue() {
        if (this.getMediationNetwork.AFAdRevenueData("didSendRevenueTriggerOnLastBackground", true)) {
            return;
        }
        getCurrencyIso4217Code(AFe1zSDK.AFa1uSDK.INSTANCE, new AnonymousClass2());
    }
}
