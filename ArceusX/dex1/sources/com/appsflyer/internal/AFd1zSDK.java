package com.appsflyer.internal;

import Z.tNT.PexNRiLSd;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.ExceptionInfo;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1zSDK implements AFc1aSDK {
    private final AFc1hSDK AFAdRevenueData;

    public AFd1zSDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, BuildConfig.FLAVOR);
        this.AFAdRevenueData = aFc1hSDK;
    }

    private final File getRevenue() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), PexNRiLSd.efspm);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override
    public final String getCurrencyIso4217Code(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.16.2");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    ExceptionInfo currencyIso4217Code = AFd1ySDK.getCurrencyIso4217Code(th, str);
                    String str3 = currencyIso4217Code.hashName;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                        ExceptionInfo monetizationNetwork = ExceptionInfo.Companion.getMonetizationNetwork(X9.h.i(file2, (Charset) null, 1, (Object) null));
                        if (monetizationNetwork != null) {
                            monetizationNetwork.counter++;
                            currencyIso4217Code = monetizationNetwork;
                        }
                    }
                    X9.h.k(file2, currencyIso4217Code.AFAdRevenueData(), (Charset) null, 2, (Object) null);
                    str2 = str3;
                } catch (Exception e7) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e7.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override
    public final int getMediationNetwork() {
        Iterator<T> it = getCurrencyIso4217Code().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((ExceptionInfo) it.next()).counter;
        }
        return i7;
    }

    @Override
    public final boolean getMonetizationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override
    public final void getMediationNetwork(int i7, int i8) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, BuildConfig.FLAVOR);
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, BuildConfig.FLAVOR);
                        int currencyIso4217Code = AFj1cSDK.getCurrencyIso4217Code(name);
                        if (i7 > currencyIso4217Code || currencyIso4217Code > i8) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.t(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, BuildConfig.FLAVOR);
                        arrayList2.add(Boolean.valueOf(X9.h.o(file2)));
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean getRevenue(String... strArr) {
        boolean zO;
        Intrinsics.checkNotNullParameter(strArr, BuildConfig.FLAVOR);
        synchronized (this) {
            try {
                File revenue = getRevenue();
                zO = true;
                if (revenue != null) {
                    if (strArr.length == 0) {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zO = X9.h.o(revenue);
                    } else {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + kotlin.collections.i.L(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                        File[] fileArrListFiles = revenue.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, BuildConfig.FLAVOR);
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!kotlin.collections.i.w(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.t(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, BuildConfig.FLAVOR);
                                arrayList2.add(Boolean.valueOf(X9.h.o(file2)));
                            }
                            Set setV0 = CollectionsKt.v0(arrayList2);
                            if (setV0.isEmpty()) {
                                setV0 = kotlin.collections.L.c(Boolean.TRUE);
                            }
                            Set set = setV0;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.L(set)).booleanValue()) {
                                zO = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zO;
    }

    @Override
    public final List<ExceptionInfo> getCurrencyIso4217Code() {
        List<ExceptionInfo> listJ;
        File[] fileArrListFiles;
        ArrayList arrayList;
        File[] fileArrListFiles2;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                listJ = null;
                if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            fileArrListFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (fileArrListFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, BuildConfig.FLAVOR);
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(file2, BuildConfig.FLAVOR);
                                ExceptionInfo monetizationNetwork = ExceptionInfo.Companion.getMonetizationNetwork(X9.h.i(file2, (Charset) null, 1, (Object) null));
                                if (monetizationNetwork != null) {
                                    arrayList.add(monetizationNetwork);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listJ = CollectionsKt.v(arrayList2);
                }
                if (listJ == null) {
                    listJ = CollectionsKt.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listJ;
    }
}
