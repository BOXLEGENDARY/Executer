package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_DocumentStepFillColorJsonAdapter extends h<StepStyles.DocumentStepFillColor> {

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "imagePreviewPlusIcon", "imagePreviewXIcon", "imagePreviewMainArea", "imagePreviewCropArea"});

    public StepStyles_DocumentStepFillColorJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.DocumentStepFillColor");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.DocumentStepFillColor m453fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        StyleElements.SimpleElementColor simpleElementColor2 = null;
        StyleElements.SimpleElementColor simpleElementColor3 = null;
        StyleElements.SimpleElementColor simpleElementColor4 = null;
        StyleElements.SimpleElementColor simpleElementColor5 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                simpleElementColor2 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                simpleElementColor3 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                simpleElementColor4 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            } else if (iP0 == 4) {
                simpleElementColor5 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.DocumentStepFillColor(simpleElementColor, simpleElementColor2, simpleElementColor3, simpleElementColor4, simpleElementColor5);
    }

    public void toJson(@NotNull t tVar, StepStyles.DocumentStepFillColor documentStepFillColor) {
        if (documentStepFillColor == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableSimpleElementColorAdapter.toJson(tVar, documentStepFillColor.getBase());
        tVar.Z("imagePreviewPlusIcon");
        this.nullableSimpleElementColorAdapter.toJson(tVar, documentStepFillColor.getImagePreviewPlusIcon());
        tVar.Z("imagePreviewXIcon");
        this.nullableSimpleElementColorAdapter.toJson(tVar, documentStepFillColor.getImagePreviewXIcon());
        tVar.Z("imagePreviewMainArea");
        this.nullableSimpleElementColorAdapter.toJson(tVar, documentStepFillColor.getImagePreviewMainArea());
        tVar.Z("imagePreviewCropArea");
        this.nullableSimpleElementColorAdapter.toJson(tVar, documentStepFillColor.getImagePreviewCropArea());
        tVar.y();
    }
}
