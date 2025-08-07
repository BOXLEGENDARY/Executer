package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class Footer_FooterComponentStyleJsonAdapter extends h<Footer.FooterComponentStyle> {

    @NotNull
    private final h<AttributeStyles.FooterBorderWidthStyle> nullableFooterBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.FooterColorStyle> nullableFooterColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.FooterPaddingStyle> nullableFooterPaddingStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"backgroundColor", "padding", "borderWidth"});

    public Footer_FooterComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableFooterColorStyleAdapter = wVar.f(AttributeStyles.FooterColorStyle.class, L.d(), "backgroundColor");
        this.nullableFooterPaddingStyleAdapter = wVar.f(AttributeStyles.FooterPaddingStyle.class, L.d(), "padding");
        this.nullableFooterBorderWidthStyleAdapter = wVar.f(AttributeStyles.FooterBorderWidthStyle.class, L.d(), "borderWidth");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Footer.FooterComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Footer.FooterComponentStyle m239fromJson(@NotNull m mVar) {
        mVar.e();
        AttributeStyles.FooterColorStyle footerColorStyle = null;
        AttributeStyles.FooterPaddingStyle footerPaddingStyle = null;
        AttributeStyles.FooterBorderWidthStyle footerBorderWidthStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                footerColorStyle = (AttributeStyles.FooterColorStyle) this.nullableFooterColorStyleAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                footerPaddingStyle = (AttributeStyles.FooterPaddingStyle) this.nullableFooterPaddingStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                footerBorderWidthStyle = (AttributeStyles.FooterBorderWidthStyle) this.nullableFooterBorderWidthStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new Footer.FooterComponentStyle(footerColorStyle, footerPaddingStyle, footerBorderWidthStyle);
    }

    public void toJson(@NotNull t tVar, Footer.FooterComponentStyle footerComponentStyle) {
        if (footerComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("backgroundColor");
        this.nullableFooterColorStyleAdapter.toJson(tVar, footerComponentStyle.getBackgroundColor());
        tVar.Z("padding");
        this.nullableFooterPaddingStyleAdapter.toJson(tVar, footerComponentStyle.getPadding());
        tVar.Z("borderWidth");
        this.nullableFooterBorderWidthStyleAdapter.toJson(tVar, footerComponentStyle.getBorderWidth());
        tVar.y();
    }
}
