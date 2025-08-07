package com.appsflyer.internal;

import P9.o;
import com.github.luben.zstd.BuildConfig;
import d2.C2381a;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1mSDK implements AFj1oSDK {
    @Override
    public final String getMonetizationNetwork() {
        Object objB;
        Object obj = BuildConfig.FLAVOR;
        try {
            o.a aVar = P9.o.e;
            Field declaredField = C2381a.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.e(obj2, BuildConfig.FLAVOR);
            objB = P9.o.b((String) obj2);
        } catch (Throwable th) {
            o.a aVar2 = P9.o.e;
            objB = P9.o.b(P9.p.a(th));
        }
        if (!P9.o.g(objB)) {
            obj = objB;
        }
        return (String) obj;
    }
}
