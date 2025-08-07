package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1pSDK {
    final Intent getCurrencyIso4217Code;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends kotlin.jvm.internal.l implements Function0<String> {
        private String $getMonetizationNetwork;

        AnonymousClass1(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        public final String invoke() {
            return AFj1pSDK.this.getCurrencyIso4217Code.getStringExtra(this.$getMonetizationNetwork);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "I_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends kotlin.jvm.internal.l implements Function0<Intent> {
        private String $AFAdRevenueData;
        private long $getRevenue;

        AnonymousClass2(String str, long j7) {
            super(0);
            this.$AFAdRevenueData = str;
            this.$getRevenue = j7;
        }

        public final Intent invoke() {
            return AFj1pSDK.this.getCurrencyIso4217Code.putExtra(this.$AFAdRevenueData, this.$getRevenue);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "getMonetizationNetwork", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends kotlin.jvm.internal.l implements Function0<Boolean> {
        private String $getRevenue;

        AnonymousClass3(String str) {
            super(0);
            this.$getRevenue = str;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(AFj1pSDK.this.getCurrencyIso4217Code.hasExtra(this.$getRevenue));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "H_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4<T> extends kotlin.jvm.internal.l implements Function0<T> {
        private String $AFAdRevenueData;

        AnonymousClass4(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        public final Parcelable invoke() {
            return AFj1pSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$AFAdRevenueData);
        }
    }

    public AFj1pSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, BuildConfig.FLAVOR);
        this.getCurrencyIso4217Code = intent;
    }

    public final boolean AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Boolean bool = (Boolean) getRevenue(new AnonymousClass3(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final <T extends Parcelable> T F_(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return (T) getRevenue(new AnonymousClass4(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final Intent G_(String str, long j7) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return (Intent) getRevenue(new AnonymousClass2(str, j7), "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final String getRevenue(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return (String) getRevenue(new AnonymousClass1(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    private final <T> T getRevenue(kotlin.jvm.functions.Function0<? extends T> r7, java.lang.String r8, T r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1pSDK.getRevenue(kotlin.jvm.functions.Function0, java.lang.String, java.lang.Object, boolean):java.lang.Object");
    }
}
