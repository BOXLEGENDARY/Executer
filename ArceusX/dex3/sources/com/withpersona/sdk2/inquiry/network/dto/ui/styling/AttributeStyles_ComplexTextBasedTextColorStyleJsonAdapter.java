package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ComplexTextBasedTextColorStyleJsonAdapter extends h<AttributeStyles.ComplexTextBasedTextColorStyle> {

    @NotNull
    private final h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"value", "placeholder", "label", "error"});

    public AttributeStyles_ComplexTextBasedTextColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableComplexElementColorAdapter = wVar.f(StyleElements.ComplexElementColor.class, L.d(), "value");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ComplexTextBasedTextColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ComplexTextBasedTextColorStyle m342fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.ComplexElementColor complexElementColor = null;
        StyleElements.ComplexElementColor complexElementColor2 = null;
        StyleElements.ComplexElementColor complexElementColor3 = null;
        StyleElements.ComplexElementColor complexElementColor4 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                complexElementColor = (StyleElements.ComplexElementColor) this.nullableComplexElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                complexElementColor2 = (StyleElements.ComplexElementColor) this.nullableComplexElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                complexElementColor3 = (StyleElements.ComplexElementColor) this.nullableComplexElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                complexElementColor4 = (StyleElements.ComplexElementColor) this.nullableComplexElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ComplexTextBasedTextColorStyle(complexElementColor, complexElementColor2, complexElementColor3, complexElementColor4);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle) {
        if (complexTextBasedTextColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("value");
        this.nullableComplexElementColorAdapter.toJson(tVar, complexTextBasedTextColorStyle.getValue());
        tVar.Z("placeholder");
        this.nullableComplexElementColorAdapter.toJson(tVar, complexTextBasedTextColorStyle.getPlaceholder());
        tVar.Z("label");
        this.nullableComplexElementColorAdapter.toJson(tVar, complexTextBasedTextColorStyle.getLabel());
        tVar.Z("error");
        this.nullableComplexElementColorAdapter.toJson(tVar, complexTextBasedTextColorStyle.getError());
        tVar.y();
    }
}
