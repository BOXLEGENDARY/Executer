package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_GovernmentIdNfcScanInputTextStylesContainerJsonAdapter extends h<AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer> {

    @NotNull
    private final h<InputTextBasedComponentStyle> nullableInputTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_GovernmentIdNfcScanInputTextStylesContainerJsonAdapter(@NotNull w wVar) {
        this.nullableInputTextBasedComponentStyleAdapter = wVar.f(InputTextBasedComponentStyle.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(81);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer m367fromJson(@NotNull m mVar) {
        mVar.e();
        InputTextBasedComponentStyle inputTextBasedComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                inputTextBasedComponentStyle = (InputTextBasedComponentStyle) this.nullableInputTextBasedComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer(inputTextBasedComponentStyle);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer) {
        if (governmentIdNfcScanInputTextStylesContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableInputTextBasedComponentStyleAdapter.toJson(tVar, governmentIdNfcScanInputTextStylesContainer.getBase());
        tVar.y();
    }
}
