package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ButtonBasedBackgroundColorStyleJsonAdapter extends h<AttributeStyles.ButtonBasedBackgroundColorStyle> {

    @NotNull
    private final h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_ButtonBasedBackgroundColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableComplexElementColorAdapter = wVar.f(StyleElements.ComplexElementColor.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(69);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ButtonBasedBackgroundColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ButtonBasedBackgroundColorStyle m311fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.ComplexElementColor complexElementColor = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                complexElementColor = (StyleElements.ComplexElementColor) this.nullableComplexElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ButtonBasedBackgroundColorStyle(complexElementColor);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle) {
        if (buttonBasedBackgroundColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableComplexElementColorAdapter.toJson(tVar, buttonBasedBackgroundColorStyle.getBase());
        tVar.y();
    }
}
