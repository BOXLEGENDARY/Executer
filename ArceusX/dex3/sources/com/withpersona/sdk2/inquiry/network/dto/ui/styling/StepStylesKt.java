package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import ha.C0476u;
import ha.EnumC0477v;

public final class StepStylesKt {
    public static final Drawable getBackgroundDrawable(Context context, String str) {
        Integer numG;
        if (str == null || (numG = C0476u.g(context, str, EnumC0477v.e)) == null) {
            return null;
        }
        return a.e(context, numG.intValue());
    }
}
