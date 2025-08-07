package com.withpersona.sdk2.inquiry.network.dto;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

public final class NextStep$GovernmentId$LocalizationOverride$precedenceScore$2 extends l implements Function0<Integer> {
    final NextStep.GovernmentId.LocalizationOverride this$0;

    public NextStep$GovernmentId$LocalizationOverride$precedenceScore$2(NextStep.GovernmentId.LocalizationOverride localizationOverride) {
        super(0);
        this.this$0 = localizationOverride;
    }

    @NotNull
    public final Integer m143invoke() {
        int i = (this.this$0.getCountryCode() != null ? 1 : 0) * 2;
        if (this.this$0.getIdClass() != null) {
            i++;
        }
        int i2 = i * 2;
        if (this.this$0.getSide() != null) {
            i2++;
        }
        return Integer.valueOf(i2);
    }
}
