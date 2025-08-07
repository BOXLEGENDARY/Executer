package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_InputTextStrokeColorStyleJsonAdapter extends h<AttributeStyles.InputTextStrokeColorStyle> {

    @NotNull
    private final h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"maskToggle"});

    public AttributeStyles_InputTextStrokeColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableComplexElementColorAdapter = wVar.f(StyleElements.ComplexElementColor.class, L.d(), "maskToggle");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.InputTextStrokeColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.InputTextStrokeColorStyle m411fromJson(@NotNull m mVar) {
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
        return new AttributeStyles.InputTextStrokeColorStyle(complexElementColor);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle) {
        if (inputTextStrokeColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("maskToggle");
        this.nullableComplexElementColorAdapter.toJson(tVar, inputTextStrokeColorStyle.getMaskToggle());
        tVar.y();
    }
}
