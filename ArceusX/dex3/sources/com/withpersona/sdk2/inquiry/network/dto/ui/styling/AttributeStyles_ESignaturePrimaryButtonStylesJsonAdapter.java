package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ESignaturePrimaryButtonStylesJsonAdapter extends h<AttributeStyles.ESignaturePrimaryButtonStyles> {

    @NotNull
    private final h<AttributeStyles.ESignaturePrimaryButtonStylesContainer> nullableESignaturePrimaryButtonStylesContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"saveSignatureButton"});

    public AttributeStyles_ESignaturePrimaryButtonStylesJsonAdapter(@NotNull w wVar) {
        this.nullableESignaturePrimaryButtonStylesContainerAdapter = wVar.f(AttributeStyles.ESignaturePrimaryButtonStylesContainer.class, L.d(), "saveSignatureButton");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ESignaturePrimaryButtonStyles");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ESignaturePrimaryButtonStyles m356fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.ESignaturePrimaryButtonStylesContainer eSignaturePrimaryButtonStylesContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                eSignaturePrimaryButtonStylesContainer = (AttributeStyles.ESignaturePrimaryButtonStylesContainer) this.nullableESignaturePrimaryButtonStylesContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ESignaturePrimaryButtonStyles(eSignaturePrimaryButtonStylesContainer);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles) {
        if (eSignaturePrimaryButtonStyles == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("saveSignatureButton");
        this.nullableESignaturePrimaryButtonStylesContainerAdapter.toJson(tVar, eSignaturePrimaryButtonStyles.getSaveSignatureButton());
        tVar.y();
    }
}
