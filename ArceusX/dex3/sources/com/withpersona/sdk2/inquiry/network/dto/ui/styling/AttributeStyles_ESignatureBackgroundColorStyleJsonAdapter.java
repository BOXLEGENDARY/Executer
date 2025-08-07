package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ESignatureBackgroundColorStyleJsonAdapter extends h<AttributeStyles.ESignatureBackgroundColorStyle> {

    @NotNull
    private final h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "signaturePreview"});

    public AttributeStyles_ESignatureBackgroundColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableComplexElementColorAdapter = wVar.f(StyleElements.ComplexElementColor.class, L.d(), "base");
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "signaturePreview");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ESignatureBackgroundColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ESignatureBackgroundColorStyle m349fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.ComplexElementColor complexElementColor = null;
        StyleElements.SimpleElementColor simpleElementColor = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                complexElementColor = (StyleElements.ComplexElementColor) this.nullableComplexElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ESignatureBackgroundColorStyle(complexElementColor, simpleElementColor);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle) {
        if (eSignatureBackgroundColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableComplexElementColorAdapter.toJson(tVar, eSignatureBackgroundColorStyle.getBase());
        tVar.Z("signaturePreview");
        this.nullableSimpleElementColorAdapter.toJson(tVar, eSignatureBackgroundColorStyle.getSignaturePreview());
        tVar.y();
    }
}
