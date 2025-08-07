package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_GovernmentIdNfcScanInputTextStylesJsonAdapter extends h<AttributeStyles.GovernmentIdNfcScanInputTextStyles> {

    @NotNull
    private final h<AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer> nullableGovernmentIdNfcScanInputTextStylesContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_GovernmentIdNfcScanInputTextStylesJsonAdapter(@NotNull w wVar) {
        this.nullableGovernmentIdNfcScanInputTextStylesContainerAdapter = wVar.f(AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(72);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.GovernmentIdNfcScanInputTextStyles");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.GovernmentIdNfcScanInputTextStyles m368fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                governmentIdNfcScanInputTextStylesContainer = (AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer) this.nullableGovernmentIdNfcScanInputTextStylesContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.GovernmentIdNfcScanInputTextStyles(governmentIdNfcScanInputTextStylesContainer);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles) {
        if (governmentIdNfcScanInputTextStyles == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableGovernmentIdNfcScanInputTextStylesContainerAdapter.toJson(tVar, governmentIdNfcScanInputTextStyles.getBase());
        tVar.y();
    }
}
