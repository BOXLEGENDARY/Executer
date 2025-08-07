package com.appsflyer.internal;

import a4.InterfaceC1570g;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import d3.C2382a;
import d3.C2384c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t4.gYZ.uCYQMIHsy;

public final class AFb1bSDK implements AFb1hSDK {
    private final AFf1iSDK getCurrencyIso4217Code;
    private final AFc1oSDK getMonetizationNetwork;
    private final AFc1hSDK getRevenue;

    public AFb1bSDK(AFc1oSDK aFc1oSDK, AFc1hSDK aFc1hSDK, AFf1iSDK aFf1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFc1hSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFf1iSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFc1oSDK;
        this.getRevenue = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1iSDK;
    }

    public static final void getCurrencyIso4217Code(AFb1bSDK aFb1bSDK, C2384c c2384c) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, BuildConfig.FLAVOR);
        AFc1oSDK aFc1oSDK = aFb1bSDK.getMonetizationNetwork;
        int iB = c2384c.b();
        String strA = c2384c.a();
        Intrinsics.checkNotNullExpressionValue(strA, BuildConfig.FLAVOR);
        aFc1oSDK.areAllFieldsValid = new AFb1cSDK(iB, strA);
    }

    @Override
    public final void getMediationNetwork() {
        Context context = this.getRevenue.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(C2382a.a(context).b().e(new InterfaceC1570g() {
                    @Override
                    public final void onSuccess(Object obj) {
                        AFb1bSDK.getCurrencyIso4217Code(this.f13644a, (C2384c) obj);
                    }
                }), BuildConfig.FLAVOR);
            } catch (Throwable th) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.APP_SET_ID, uCYQMIHsy.JufuoPhCu, th, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
                Unit unit = Unit.a;
            }
        }
    }

    @Override
    public final boolean getRevenue() {
        return !this.getCurrencyIso4217Code.getMediationNetwork() && AFj1nSDK.getRevenue(this.getRevenue.getMonetizationNetwork) && AFj1nSDK.AFAdRevenueData(this.getRevenue.getMonetizationNetwork);
    }
}
