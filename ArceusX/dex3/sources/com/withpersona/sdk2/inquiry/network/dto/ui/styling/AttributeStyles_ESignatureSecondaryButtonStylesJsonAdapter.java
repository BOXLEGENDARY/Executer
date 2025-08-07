package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ESignatureSecondaryButtonStylesJsonAdapter extends h<AttributeStyles.ESignatureSecondaryButtonStyles> {

    @NotNull
    private final h<AttributeStyles.ESignatureSecondaryButtonStylesContainer> nullableESignatureSecondaryButtonStylesContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"clearSignatureButton"});

    public AttributeStyles_ESignatureSecondaryButtonStylesJsonAdapter(@NotNull w wVar) {
        this.nullableESignatureSecondaryButtonStylesContainerAdapter = wVar.f(AttributeStyles.ESignatureSecondaryButtonStylesContainer.class, L.d(), "clearSignatureButton");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(69);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ESignatureSecondaryButtonStyles");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ESignatureSecondaryButtonStyles m358fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                eSignatureSecondaryButtonStylesContainer = (AttributeStyles.ESignatureSecondaryButtonStylesContainer) this.nullableESignatureSecondaryButtonStylesContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ESignatureSecondaryButtonStyles(eSignatureSecondaryButtonStylesContainer);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles) {
        if (eSignatureSecondaryButtonStyles == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("clearSignatureButton");
        this.nullableESignatureSecondaryButtonStylesContainerAdapter.toJson(tVar, eSignatureSecondaryButtonStyles.getClearSignatureButton());
        tVar.y();
    }
}
