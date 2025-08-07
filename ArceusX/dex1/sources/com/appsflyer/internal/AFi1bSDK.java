package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.github.luben.zstd.BuildConfig;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1bSDK implements AFi1hSDK {
    private static ProviderInfo y_(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = BuildConfig.FLAVOR;
            }
            AFg1gSDK.e$default(aFLogger, aFh1zSDK, message, th, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override
    public final boolean AFAdRevenueData(Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        ProviderInfo providerInfoY_ = y_(context);
        if (providerInfoY_ == null) {
            return false;
        }
        try {
            return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) providerInfoY_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1zSDK aFh1zSDK = AFh1zSDK.REFERRER;
            String message = th.getMessage();
            AFg1gSDK.e$default(aFLogger, aFh1zSDK, message == null ? BuildConfig.FLAVOR : message, th, false, false, false, false, 96, null);
            return false;
        }
    }

    @Override
    public final boolean getMediationNetwork(Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        return y_(context) != null;
    }
}
