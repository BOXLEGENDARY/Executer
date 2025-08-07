package com.withpersona.sdk2.inquiry.network.dto;

import android.graphics.Color;
import com.squareup.moshi.f;
import com.squareup.moshi.z;
import java.util.Locale;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class RgbaHexColorAdapter {

    @NotNull
    public static final RgbaHexColorAdapter INSTANCE = new RgbaHexColorAdapter();

    private RgbaHexColorAdapter() {
    }

    @f
    @RgbaHexColor
    public final Integer fromJson(@NotNull String str) {
        Long lM;
        String strN0 = StringsKt.n0(StringsKt.Q0(str).toString().toUpperCase(Locale.ROOT), "#");
        int length = strN0.length();
        if (length != 6) {
            if (length != 8 || (lM = StringsKt.m(strN0, 16)) == null) {
                return null;
            }
            long jLongValue = lM.longValue();
            return Integer.valueOf(Color.argb((int) (jLongValue & 255), (int) ((jLongValue >> 24) & 255), (int) ((jLongValue >> 16) & 255), (int) ((jLongValue >> 8) & 255)));
        }
        Integer numK = StringsKt.k(strN0, 16);
        if (numK == null) {
            return null;
        }
        int iIntValue = numK.intValue();
        return Integer.valueOf(Color.rgb((iIntValue >> 16) & 255, (iIntValue >> 8) & 255, iIntValue & 255));
    }

    @z
    @NotNull
    public final String toJson(@RgbaHexColor Integer num) {
        throw new IllegalStateException("Should not be called");
    }
}
