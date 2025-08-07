package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ButtonBasedFontFamilyStyleJsonAdapter extends h<AttributeStyles.ButtonBasedFontFamilyStyle> {

    @NotNull
    private final h<StyleElements.FontName> nullableFontNameAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_ButtonBasedFontFamilyStyleJsonAdapter(@NotNull w wVar) {
        this.nullableFontNameAdapter = wVar.f(StyleElements.FontName.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ButtonBasedFontFamilyStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ButtonBasedFontFamilyStyle m315fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.FontName fontName = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                fontName = (StyleElements.FontName) this.nullableFontNameAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ButtonBasedFontFamilyStyle(fontName);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle) {
        if (buttonBasedFontFamilyStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableFontNameAdapter.toJson(tVar, buttonBasedFontFamilyStyle.getBase());
        tVar.y();
    }
}
