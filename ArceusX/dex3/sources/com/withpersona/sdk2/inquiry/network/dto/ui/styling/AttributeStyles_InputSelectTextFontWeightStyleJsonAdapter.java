package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_InputSelectTextFontWeightStyleJsonAdapter extends h<AttributeStyles.InputSelectTextFontWeightStyle> {

    @NotNull
    private final h<StyleElements.FontWeightContainer> nullableFontWeightContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "label", "error"});

    public AttributeStyles_InputSelectTextFontWeightStyleJsonAdapter(@NotNull w wVar) {
        this.nullableFontWeightContainerAdapter = wVar.f(StyleElements.FontWeightContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.InputSelectTextFontWeightStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.InputSelectTextFontWeightStyle m404fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.FontWeightContainer fontWeightContainer = null;
        StyleElements.FontWeightContainer fontWeightContainer2 = null;
        StyleElements.FontWeightContainer fontWeightContainer3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                fontWeightContainer = (StyleElements.FontWeightContainer) this.nullableFontWeightContainerAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                fontWeightContainer2 = (StyleElements.FontWeightContainer) this.nullableFontWeightContainerAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                fontWeightContainer3 = (StyleElements.FontWeightContainer) this.nullableFontWeightContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.InputSelectTextFontWeightStyle(fontWeightContainer, fontWeightContainer2, fontWeightContainer3);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle) {
        if (inputSelectTextFontWeightStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableFontWeightContainerAdapter.toJson(tVar, inputSelectTextFontWeightStyle.getBase());
        tVar.Z("label");
        this.nullableFontWeightContainerAdapter.toJson(tVar, inputSelectTextFontWeightStyle.getLabel());
        tVar.Z("error");
        this.nullableFontWeightContainerAdapter.toJson(tVar, inputSelectTextFontWeightStyle.getError());
        tVar.y();
    }
}
