package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_SelfieStepStrokeColorJsonAdapter extends h<StepStyles.SelfieStepStrokeColor> {

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "selfieCaptureIconStrokeColor", "captureOverlayHeaderButton"});

    public StepStyles_SelfieStepStrokeColorJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.SelfieStepStrokeColor");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.SelfieStepStrokeColor m480fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        StyleElements.SimpleElementColor simpleElementColor2 = null;
        StyleElements.SimpleElementColor simpleElementColor3 = null;
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
            }
        }
        mVar.j();
        return new StepStyles.SelfieStepStrokeColor(simpleElementColor, simpleElementColor2, simpleElementColor3);
    }

    public void toJson(@NotNull t tVar, StepStyles.SelfieStepStrokeColor selfieStepStrokeColor) {
        if (selfieStepStrokeColor == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableSimpleElementColorAdapter.toJson(tVar, selfieStepStrokeColor.getBase());
        tVar.Z("selfieCaptureIconStrokeColor");
        this.nullableSimpleElementColorAdapter.toJson(tVar, selfieStepStrokeColor.getSelfieCaptureIconStrokeColor());
        tVar.Z("captureOverlayHeaderButton");
        this.nullableSimpleElementColorAdapter.toJson(tVar, selfieStepStrokeColor.getCaptureOverlayHeaderButton());
        tVar.y();
    }
}
