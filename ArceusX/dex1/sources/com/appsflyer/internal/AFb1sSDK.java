package com.appsflyer.internal;

import K0.wJ.BtcVLuo;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", BuildConfig.FLAVOR, "Lcom/appsflyer/internal/AFh1tSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFh1tSDK;)V", BuildConfig.FLAVOR, "afInfoLog", "()V", "getMediationNetwork", "Lcom/appsflyer/internal/AFh1tSDK;", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFb1sSDK {

    private final AFh1tSDK getMonetizationNetwork;

    public AFb1sSDK(AFh1tSDK aFh1tSDK) {
        Intrinsics.checkNotNullParameter(aFh1tSDK, BuildConfig.FLAVOR);
        this.getMonetizationNetwork = aFh1tSDK;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Map map = AFa1gSDK.f13584e;
            Object declaredConstructor = map.get(601993545);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1gSDK.getMonetizationNetwork(37 - (ViewConfiguration.getTouchSlop() >> 8), 87 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16))).getDeclaredConstructor(null);
                map.put(601993545, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.getMonetizationNetwork};
            Object method = map.get(-1823987507);
            if (method == null) {
                method = ((Class) AFa1gSDK.getMonetizationNetwork(37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 87 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (char) Color.alpha(0))).getMethod(BtcVLuo.WgQEjsrfcsywXk, AFh1tSDK.class);
                map.put(-1823987507, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
