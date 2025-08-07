package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_InputSelectStrokeColorStyleJsonAdapter extends h<AttributeStyles.InputSelectStrokeColorStyle> {

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"chevron", "headerCancelButton"});

    public AttributeStyles_InputSelectStrokeColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "chevron");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(65);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.InputSelectStrokeColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.InputSelectStrokeColorStyle m400fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        StyleElements.SimpleElementColor simpleElementColor2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                simpleElementColor2 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.InputSelectStrokeColorStyle(simpleElementColor, simpleElementColor2);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle) {
        if (inputSelectStrokeColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("chevron");
        this.nullableSimpleElementColorAdapter.toJson(tVar, inputSelectStrokeColorStyle.getChevron());
        tVar.Z("headerCancelButton");
        this.nullableSimpleElementColorAdapter.toJson(tVar, inputSelectStrokeColorStyle.getHeaderCancelButton());
        tVar.y();
    }
}
