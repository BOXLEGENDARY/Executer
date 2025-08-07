package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_GovernmentIdNfcScanPrimaryButtonStylesJsonAdapter extends h<AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles> {

    @NotNull
    private final h<AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer> nullableGovernmentIdNfcScanPrimaryButtonStylesContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_GovernmentIdNfcScanPrimaryButtonStylesJsonAdapter(@NotNull w wVar) {
        this.nullableGovernmentIdNfcScanPrimaryButtonStylesContainerAdapter = wVar.f(AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(76);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles m370fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer governmentIdNfcScanPrimaryButtonStylesContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                governmentIdNfcScanPrimaryButtonStylesContainer = (AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer) this.nullableGovernmentIdNfcScanPrimaryButtonStylesContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles(governmentIdNfcScanPrimaryButtonStylesContainer);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles) {
        if (governmentIdNfcScanPrimaryButtonStyles == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableGovernmentIdNfcScanPrimaryButtonStylesContainerAdapter.toJson(tVar, governmentIdNfcScanPrimaryButtonStyles.getBase());
        tVar.y();
    }
}
