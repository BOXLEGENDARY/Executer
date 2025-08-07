package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_GovernmentIdNfcScanInputDateStylesContainerJsonAdapter extends h<AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer> {

    @NotNull
    private final h<InputDate.InputDateComponentStyle> nullableInputDateComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_GovernmentIdNfcScanInputDateStylesContainerJsonAdapter(@NotNull w wVar) {
        this.nullableInputDateComponentStyleAdapter = wVar.f(InputDate.InputDateComponentStyle.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(81);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer m365fromJson(@NotNull m mVar) {
        mVar.e();
        InputDate.InputDateComponentStyle inputDateComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                inputDateComponentStyle = (InputDate.InputDateComponentStyle) this.nullableInputDateComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer(inputDateComponentStyle);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer governmentIdNfcScanInputDateStylesContainer) {
        if (governmentIdNfcScanInputDateStylesContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableInputDateComponentStyleAdapter.toJson(tVar, governmentIdNfcScanInputDateStylesContainer.getBase());
        tVar.y();
    }
}
