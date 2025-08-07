package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_InputRadioGroupFontWeightStyleJsonAdapter extends h<AttributeStyles.InputRadioGroupFontWeightStyle> {

    @NotNull
    private final h<StyleElements.FontWeightContainer> nullableFontWeightContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "description", "error"});

    public AttributeStyles_InputRadioGroupFontWeightStyleJsonAdapter(@NotNull w wVar) {
        this.nullableFontWeightContainerAdapter = wVar.f(StyleElements.FontWeightContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.InputRadioGroupFontWeightStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.InputRadioGroupFontWeightStyle m392fromJson(@NotNull m mVar) {
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
        return new AttributeStyles.InputRadioGroupFontWeightStyle(fontWeightContainer, fontWeightContainer2, fontWeightContainer3);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle) {
        if (inputRadioGroupFontWeightStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableFontWeightContainerAdapter.toJson(tVar, inputRadioGroupFontWeightStyle.getBase());
        tVar.Z("description");
        this.nullableFontWeightContainerAdapter.toJson(tVar, inputRadioGroupFontWeightStyle.getDescription());
        tVar.Z("error");
        this.nullableFontWeightContainerAdapter.toJson(tVar, inputRadioGroupFontWeightStyle.getError());
        tVar.y();
    }
}
