package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CreatePersonaSheet_CreatePersonaSheetStyleJsonAdapter extends h<CreatePersonaSheet.CreatePersonaSheetStyle> {

    @NotNull
    private final h<AttributeStyles.FooterBorderWidthStyle> nullableFooterBorderWidthStyleAdapter;

    @NotNull
    private final h<AttributeStyles.FooterColorStyle> nullableFooterColorStyleAdapter;

    @NotNull
    private final h<AttributeStyles.FooterPaddingStyle> nullableFooterPaddingStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"backgroundColor", "padding", "borderWidth"});

    public CreatePersonaSheet_CreatePersonaSheetStyleJsonAdapter(@NotNull w wVar) {
        this.nullableFooterColorStyleAdapter = wVar.f(AttributeStyles.FooterColorStyle.class, L.d(), "backgroundColor");
        this.nullableFooterPaddingStyleAdapter = wVar.f(AttributeStyles.FooterPaddingStyle.class, L.d(), "padding");
        this.nullableFooterBorderWidthStyleAdapter = wVar.f(AttributeStyles.FooterBorderWidthStyle.class, L.d(), "borderWidth");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CreatePersonaSheet.CreatePersonaSheetStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CreatePersonaSheet.CreatePersonaSheetStyle m232fromJson(@NotNull m mVar) {
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
        return new CreatePersonaSheet.CreatePersonaSheetStyle(footerColorStyle, footerPaddingStyle, footerBorderWidthStyle);
    }

    public void toJson(@NotNull t tVar, CreatePersonaSheet.CreatePersonaSheetStyle createPersonaSheetStyle) {
        if (createPersonaSheetStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("backgroundColor");
        this.nullableFooterColorStyleAdapter.toJson(tVar, createPersonaSheetStyle.getBackgroundColor());
        tVar.Z("padding");
        this.nullableFooterPaddingStyleAdapter.toJson(tVar, createPersonaSheetStyle.getPadding());
        tVar.Z("borderWidth");
        this.nullableFooterBorderWidthStyleAdapter.toJson(tVar, createPersonaSheetStyle.getBorderWidth());
        tVar.y();
    }
}
