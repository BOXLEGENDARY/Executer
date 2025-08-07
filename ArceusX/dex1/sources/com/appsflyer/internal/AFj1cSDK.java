package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import f6.ck.ZJZXBWla;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public final class AFj1cSDK {
    public static final int getCurrencyIso4217Code(String str) {
        String strA;
        Integer intOrNull;
        String strA2;
        Integer intOrNull2;
        String strA3;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        MatchResult matchResultC = new Regex("(\\d+).(\\d+).(\\d+).*").c(str);
        if (matchResultC == null) {
            return -1;
        }
        MatchGroup matchGroup = matchResultC.b().get(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroup == null || (strA3 = matchGroup.a()) == null || (intOrNull3 = StringsKt.toIntOrNull(strA3)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroup2 = matchResultC.b().get(2);
        int iIntValue3 = iIntValue2 + (((matchGroup2 == null || (strA2 = matchGroup2.a()) == null || (intOrNull2 = StringsKt.toIntOrNull(strA2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
        MatchGroup matchGroup3 = matchResultC.b().get(3);
        if (matchGroup3 != null && (strA = matchGroup3.a()) != null && (intOrNull = StringsKt.toIntOrNull(strA)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }

    public static final String getMonetizationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        String str3 = ZJZXBWla.PKMlGD;
        Intrinsics.checkNotNullExpressionValue(bytes, str3);
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, str3);
        String str4 = str3;
        for (byte b2 : bArrDigest) {
            String str5 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, str3);
            str4 = str4 + str5;
        }
        return str4;
    }
}
