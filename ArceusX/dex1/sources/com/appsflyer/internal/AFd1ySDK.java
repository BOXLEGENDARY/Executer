package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AFd1ySDK {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", BuildConfig.FLAVOR, "getCurrencyIso4217Code", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends kotlin.jvm.internal.l implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass2 AFAdRevenueData = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, BuildConfig.FLAVOR);
            return "at " + stackTraceElement;
        }
    }

    public static final ExceptionInfo getCurrencyIso4217Code(Throwable th, String str) {
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        String name = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, BuildConfig.FLAVOR);
        return new ExceptionInfo(name + ": " + str, getMonetizationNetwork(th), P9.a.b(th), 0, 8, null);
    }

    private static String getMonetizationNetwork(Throwable th) {
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, BuildConfig.FLAVOR);
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, BuildConfig.FLAVOR);
            if (!StringsKt.F(className, "com.appsflyer", false, 2, (Object) null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th + "\n" + CollectionsKt.U(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, AnonymousClass2.AFAdRevenueData, 30, (Object) null);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return AFd1pSDK.getCurrencyIso4217Code(str, "SHA-256");
    }
}
