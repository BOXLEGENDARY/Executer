package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ESignatureTitleStylesContainerJsonAdapter extends h<AttributeStyles.ESignatureTitleStylesContainer> {

    @NotNull
    private final h<AttributeStyles.ESignatureBaseTextStyle> nullableESignatureBaseTextStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"dialogTitle"});

    public AttributeStyles_ESignatureTitleStylesContainerJsonAdapter(@NotNull w wVar) {
        this.nullableESignatureBaseTextStyleAdapter = wVar.f(AttributeStyles.ESignatureBaseTextStyle.class, L.d(), "dialogTitle");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ESignatureTitleStylesContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ESignatureTitleStylesContainer m361fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.ESignatureBaseTextStyle eSignatureBaseTextStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                eSignatureBaseTextStyle = (AttributeStyles.ESignatureBaseTextStyle) this.nullableESignatureBaseTextStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ESignatureTitleStylesContainer(eSignatureBaseTextStyle);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer) {
        if (eSignatureTitleStylesContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("dialogTitle");
        this.nullableESignatureBaseTextStyleAdapter.toJson(tVar, eSignatureTitleStylesContainer.getDialogTitle());
        tVar.y();
    }
}
