package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_InputTextBackgroundColorStyleJsonAdapter extends h<AttributeStyles.InputTextBackgroundColorStyle> {

    @NotNull
    private final h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_InputTextBackgroundColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableComplexElementColorAdapter = wVar.f(StyleElements.ComplexElementColor.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.InputTextBackgroundColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.InputTextBackgroundColorStyle m407fromJson(@NotNull m mVar) {
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
        return new AttributeStyles.InputTextBackgroundColorStyle(complexElementColor);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle) {
        if (inputTextBackgroundColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableComplexElementColorAdapter.toJson(tVar, inputTextBackgroundColorStyle.getBase());
        tVar.y();
    }
}
