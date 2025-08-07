package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_InputSelectTextFontFamilyStyleJsonAdapter extends h<AttributeStyles.InputSelectTextFontFamilyStyle> {

    @NotNull
    private final h<StyleElements.FontName> nullableFontNameAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "label", "error"});

    public AttributeStyles_InputSelectTextFontFamilyStyleJsonAdapter(@NotNull w wVar) {
        this.nullableFontNameAdapter = wVar.f(StyleElements.FontName.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.InputSelectTextFontFamilyStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.InputSelectTextFontFamilyStyle m402fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.FontName fontName = null;
        StyleElements.FontName fontName2 = null;
        StyleElements.FontName fontName3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                fontName = (StyleElements.FontName) this.nullableFontNameAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                fontName2 = (StyleElements.FontName) this.nullableFontNameAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                fontName3 = (StyleElements.FontName) this.nullableFontNameAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.InputSelectTextFontFamilyStyle(fontName, fontName2, fontName3);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle) {
        if (inputSelectTextFontFamilyStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableFontNameAdapter.toJson(tVar, inputSelectTextFontFamilyStyle.getBase());
        tVar.Z("label");
        this.nullableFontNameAdapter.toJson(tVar, inputSelectTextFontFamilyStyle.getLabel());
        tVar.Z("error");
        this.nullableFontNameAdapter.toJson(tVar, inputSelectTextFontFamilyStyle.getError());
        tVar.y();
    }
}
