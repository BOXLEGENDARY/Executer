package com.withpersona.sdk2.inquiry.nfc;

import C9.e;
import C9.h;
import P8.j;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.b;
import java.util.List;

public final class c implements b.a {
    private final j a;

    c(j jVar) {
        this.a = jVar;
    }

    public static h<b.a> b(j jVar) {
        return e.a(new c(jVar));
    }

    @Override
    public b a(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends P8.b> list, StepStyles.UiStepStyle uiStepStyle, Integer num) {
        return this.a.b(str, mrzKey, passportNfcStrings, list, uiStepStyle, num);
    }
}
