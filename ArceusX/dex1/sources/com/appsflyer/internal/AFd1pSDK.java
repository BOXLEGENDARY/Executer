package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class AFd1pSDK {
    public static final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return "[Exception Manager]: " + str;
    }

    public static final String getCurrencyIso4217Code(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, BuildConfig.FLAVOR);
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, BuildConfig.FLAVOR);
        String str3 = BuildConfig.FLAVOR;
        for (byte b2 : bArrDigest) {
            String str4 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, BuildConfig.FLAVOR);
            str3 = str3 + str4;
        }
        return str3;
    }

    public static final Pair<Integer, Integer> getRevenue(String str) {
        String strA;
        String strA2;
        String strA3;
        String strA4;
        String strA5;
        String strA6;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        MatchResult matchResultC = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").c(str);
        if (matchResultC != null) {
            MatchGroup matchGroup = matchResultC.b().get(1);
            Integer intOrNull = (matchGroup == null || (strA6 = matchGroup.a()) == null) ? null : StringsKt.toIntOrNull(strA6);
            MatchGroup matchGroup2 = matchResultC.b().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (strA5 = matchGroup2.a()) == null) ? null : StringsKt.toIntOrNull(strA5);
            MatchGroup matchGroup3 = matchResultC.b().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (strA4 = matchGroup3.a()) == null) ? null : StringsKt.toIntOrNull(strA4);
            MatchGroup matchGroup4 = matchResultC.b().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (strA3 = matchGroup4.a()) == null) ? null : StringsKt.toIntOrNull(strA3);
            MatchGroup matchGroup5 = matchResultC.b().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (strA2 = matchGroup5.a()) == null) ? null : StringsKt.toIntOrNull(strA2);
            MatchGroup matchGroup6 = matchResultC.b().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (strA = matchGroup6.a()) == null) ? null : StringsKt.toIntOrNull(strA);
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.d(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.d(intOrNull2);
                int iIntValue2 = iIntValue + (intOrNull2.intValue() * 1000);
                Intrinsics.d(intOrNull3);
                Integer numValueOf = Integer.valueOf(iIntValue2 + intOrNull3.intValue());
                Intrinsics.d(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.d(intOrNull5);
                int iIntValue4 = iIntValue3 + (intOrNull5.intValue() * 1000);
                Intrinsics.d(intOrNull6);
                return P9.t.a(numValueOf, Integer.valueOf(iIntValue4 + intOrNull6.intValue()));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(String str) {
        String strA;
        String strA2;
        String strA3;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        MatchResult matchResultC = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").c(str);
        if (matchResultC != null) {
            MatchGroup matchGroup = matchResultC.b().get(1);
            Integer intOrNull = (matchGroup == null || (strA3 = matchGroup.a()) == null) ? null : StringsKt.toIntOrNull(strA3);
            MatchGroup matchGroup2 = matchResultC.b().get(3);
            Integer intOrNull2 = (matchGroup2 == null || (strA2 = matchGroup2.a()) == null) ? null : StringsKt.toIntOrNull(strA2);
            MatchGroup matchGroup3 = matchResultC.b().get(4);
            Integer intOrNull3 = (matchGroup3 == null || (strA = matchGroup3.a()) == null) ? null : StringsKt.toIntOrNull(strA);
            if (intOrNull != null) {
                return P9.t.a(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return P9.t.a(Integer.valueOf((intOrNull2.intValue() * 1000000) + (intOrNull3.intValue() * 1000)), Integer.valueOf(((intOrNull2.intValue() * 1000000) + ((intOrNull3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    private static boolean getRevenue(Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, BuildConfig.FLAVOR);
        return !kotlin.collections.i.w(objArr, (Object) null);
    }
}
