package com.appsflyer.internal;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

public final class AFi1lSDKE20415$AFa1uSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private AFi1kSDK getMediationNetwork;
    private final long getMonetizationNetwork;

    public AFi1lSDKE20415$AFa1uSDK(AFi1kSDK aFi1kSDK, long j7) {
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = j7;
    }

    @Override
    public final void onComplete(Task<IntegrityTokenResponse> task) throws Throwable {
        Object objInvoke;
        String strA;
        Intrinsics.checkNotNullParameter(task, BuildConfig.FLAVOR);
        if (task.o()) {
            strA = task.k().a();
            objInvoke = null;
        } else {
            try {
                Object[] objArr = {this.getMediationNetwork, task.j()};
                Map map = AFi1mSDK.f13603d;
                Object method = map.get(733517678);
                if (method == null) {
                    method = ((Class) AFi1mSDK.getRevenue((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, 37 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0))).getMethod("getRevenue", (Class) AFi1mSDK.getRevenue((char) (Process.getGidForName(BuildConfig.FLAVOR) + 1), KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36), Exception.class);
                    map.put(733517678, method);
                }
                objInvoke = ((Method) method).invoke(null, objArr);
                strA = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object[] objArr2 = {this.getMediationNetwork, Long.valueOf(this.getMonetizationNetwork), strA, objInvoke};
        Map map2 = AFi1mSDK.f13603d;
        Object method2 = map2.get(693433496);
        if (method2 == null) {
            method2 = ((Class) AFi1mSDK.getRevenue((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", (Class) AFi1mSDK.getRevenue((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - View.resolveSizeAndState(0, 0, 0)), Long.TYPE, String.class, String.class);
            map2.put(693433496, method2);
        }
        ((Method) method2).invoke(null, objArr2);
        Object[] objArr3 = {this.getMediationNetwork};
        Object method3 = map2.get(-1721868629);
        if (method3 == null) {
            method3 = ((Class) AFi1mSDK.getRevenue((char) (ViewConfiguration.getTapTimeout() >> 16), ViewConfiguration.getScrollBarSize() >> 8, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37)).getMethod("getCurrencyIso4217Code", (Class) AFi1mSDK.getRevenue((char) View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 37));
            map2.put(-1721868629, method3);
        }
        ((CountDownLatch) ((Method) method3).invoke(null, objArr3)).countDown();
    }
}
