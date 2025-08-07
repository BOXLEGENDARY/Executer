package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepBackgroundColorStyleJsonAdapter extends h<StepStyles.StepBackgroundColorStyle> {

    @NotNull
    private final h<StyleElements.ComplexElementColor> nullableComplexElementColorAdapter;

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "option"});

    public StepStyles_StepBackgroundColorStyleJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "base");
        this.nullableComplexElementColorAdapter = wVar.f(StyleElements.ComplexElementColor.class, L.d(), "option");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepBackgroundColorStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepBackgroundColorStyle m484fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        StyleElements.ComplexElementColor complexElementColor = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                complexElementColor = (StyleElements.ComplexElementColor) this.nullableComplexElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepBackgroundColorStyle(simpleElementColor, complexElementColor);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepBackgroundColorStyle stepBackgroundColorStyle) {
        if (stepBackgroundColorStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableSimpleElementColorAdapter.toJson(tVar, stepBackgroundColorStyle.getBase());
        tVar.Z("option");
        this.nullableComplexElementColorAdapter.toJson(tVar, stepBackgroundColorStyle.getOption());
        tVar.y();
    }
}
