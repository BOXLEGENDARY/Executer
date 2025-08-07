package com.appsflyer.internal;

import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFg1gSDK;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/appsflyer/internal/AFh1zSDK;", "tag", BuildConfig.FLAVOR, "msg", BuildConfig.FLAVOR, "shouldRemoteDebug", BuildConfig.FLAVOR, "d", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Z)V", BuildConfig.FLAVOR, "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getMonetizationNetwork", "(Ljava/lang/String;Lcom/appsflyer/internal/AFh1zSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AFg1gSDK {
    public static long getMediationNetwork = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static void d$default(AFg1gSDK aFg1gSDK, AFh1zSDK aFh1zSDK, String str, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        aFg1gSDK.d(aFh1zSDK, str, z7);
    }

    public static void e$default(AFg1gSDK aFg1gSDK, AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9, boolean z10, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        aFg1gSDK.e(aFh1zSDK, str, th, (i7 & 8) != 0 ? true : z7, (i7 & 16) != 0 ? true : z8, (i7 & 32) != 0 ? true : z9, (i7 & 64) != 0 ? true : z10);
    }

    public static void i$default(AFg1gSDK aFg1gSDK, AFh1zSDK aFh1zSDK, String str, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        aFg1gSDK.i(aFh1zSDK, str, z7);
    }

    public static void v$default(AFg1gSDK aFg1gSDK, AFh1zSDK aFh1zSDK, String str, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        aFg1gSDK.v(aFh1zSDK, str, z7);
    }

    public static void w$default(AFg1gSDK aFg1gSDK, AFh1zSDK aFh1zSDK, String str, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        aFg1gSDK.w(aFh1zSDK, str, z7);
    }

    public void d(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
    }

    public void e(AFh1zSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(throwable, BuildConfig.FLAVOR);
    }

    public void force(AFh1zSDK tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
    }

    protected final String getMonetizationNetwork(String str, AFh1zSDK aFh1zSDK) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        if (str == null || StringsKt.Y(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFh1zSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - getMediationNetwork) + ") [" + Thread.currentThread().getName() + "] " + strWithTag$SDK_prodRelease;
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public void i(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
    }

    public void v(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
    }

    public void w(AFh1zSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(msg, BuildConfig.FLAVOR);
    }

    public final String withTag$SDK_prodRelease(String str, AFh1zSDK aFh1zSDK) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        return "[" + aFh1zSDK.getCurrencyIso4217Code + "] " + str;
    }

    public final void d(AFh1zSDK aFh1zSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        d$default(this, aFh1zSDK, str, false, 4, null);
    }

    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        e$default(this, aFh1zSDK, str, th, false, false, false, false, R.styleable.AppCompatTheme_windowFixedHeightMajor, null);
    }

    public final void i(AFh1zSDK aFh1zSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        i$default(this, aFh1zSDK, str, false, 4, null);
    }

    public final void v(AFh1zSDK aFh1zSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        v$default(this, aFh1zSDK, str, false, 4, null);
    }

    public final void w(AFh1zSDK aFh1zSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        w$default(this, aFh1zSDK, str, false, 4, null);
    }

    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z7) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        e$default(this, aFh1zSDK, str, th, z7, false, false, false, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, null);
    }

    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        e$default(this, aFh1zSDK, str, th, z7, z8, false, false, 96, null);
    }

    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        e$default(this, aFh1zSDK, str, th, z7, z8, z9, false, 64, null);
    }
}
