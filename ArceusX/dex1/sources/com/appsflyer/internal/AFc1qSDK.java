package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1qSDK implements AFc1sSDK {
    private final P9.h getMediationNetwork;
    private final AFc1iSDK<SharedPreferences> getMonetizationNetwork;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "l_", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.jvm.internal.l implements Function0<SharedPreferences> {
        AnonymousClass1() {
            super(0);
        }

        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1qSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1qSDK(AFc1iSDK<SharedPreferences> aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFc1iSDK;
        this.getMediationNetwork = P9.i.b(new AnonymousClass1());
    }

    @Override
    public final void getCurrencyIso4217Code(String str, boolean z7) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z7).apply();
    }

    @Override
    public final long getMediationNetwork(String str, long j7) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j7);
        } catch (ClassCastException e7) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, "Unexpected data type found for key " + str, e7, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
            return j7;
        }
    }

    @Override
    public final void getMonetizationNetwork(String str, int i7) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i7).apply();
    }

    @Override
    public final void getRevenue(String str, String str2) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override
    public final String AFAdRevenueData(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e7) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, "Unexpected data type found for key " + str, e7, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
            return str2;
        }
    }

    @Override
    public final boolean getCurrencyIso4217Code(String str) {
        return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
    }

    @Override
    public final void getMediationNetwork(String str) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override
    public final boolean AFAdRevenueData(String str, boolean z7) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z7);
        } catch (ClassCastException e7) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, "Unexpected data type found for key " + str, e7, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
            return z7;
        }
    }

    @Override
    public final void AFAdRevenueData(String str, long j7) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j7).apply();
    }

    @Override
    public final int AFAdRevenueData(String str, int i7) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i7);
        } catch (ClassCastException e7) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, wtzgsqRsIZB.XFnE + str, e7, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
            return i7;
        }
    }
}
