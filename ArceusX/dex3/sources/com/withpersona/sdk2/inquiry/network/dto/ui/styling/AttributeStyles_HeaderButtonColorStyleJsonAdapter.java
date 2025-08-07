package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_HeaderButtonColorStyleJsonAdapter extends h<AttributeStyles.HeaderButtonColorStyle> {

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"headerButton"});

    public AttributeStyles_HeaderButtonColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "headerButton");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.HeaderButtonColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.HeaderButtonColorStyle m371fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.HeaderButtonColorStyle(simpleElementColor);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle) {
        if (headerButtonColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("headerButton");
        this.nullableSimpleElementColorAdapter.toJson(tVar, headerButtonColorStyle.getHeaderButton());
        tVar.y();
    }
}
