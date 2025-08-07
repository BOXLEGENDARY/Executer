package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_GovernmentIdStepStrokeColorJsonAdapter extends h<StepStyles.GovernmentIdStepStrokeColor> {

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "governmentIdSelectOptionIcon", "governmentIdSelectOptionChevron", "capturePageHintIcon", "governmentIdCaptureFeedBox", "captureOverlayHeaderButton"});

    public StepStyles_GovernmentIdStepStrokeColorJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.GovernmentIdStepStrokeColor");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.GovernmentIdStepStrokeColor m470fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        StyleElements.SimpleElementColor simpleElementColor2 = null;
        StyleElements.SimpleElementColor simpleElementColor3 = null;
        StyleElements.SimpleElementColor simpleElementColor4 = null;
        StyleElements.SimpleElementColor simpleElementColor5 = null;
        StyleElements.SimpleElementColor simpleElementColor6 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 1:
                    simpleElementColor2 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 2:
                    simpleElementColor3 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 3:
                    simpleElementColor4 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 4:
                    simpleElementColor5 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
                case 5:
                    simpleElementColor6 = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new StepStyles.GovernmentIdStepStrokeColor(simpleElementColor, simpleElementColor2, simpleElementColor3, simpleElementColor4, simpleElementColor5, simpleElementColor6);
    }

    public void toJson(@NotNull t tVar, StepStyles.GovernmentIdStepStrokeColor governmentIdStepStrokeColor) {
        if (governmentIdStepStrokeColor == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableSimpleElementColorAdapter.toJson(tVar, governmentIdStepStrokeColor.getBase());
        tVar.Z("governmentIdSelectOptionIcon");
        this.nullableSimpleElementColorAdapter.toJson(tVar, governmentIdStepStrokeColor.getGovernmentIdSelectOptionIcon());
        tVar.Z("governmentIdSelectOptionChevron");
        this.nullableSimpleElementColorAdapter.toJson(tVar, governmentIdStepStrokeColor.getGovernmentIdSelectOptionChevron());
        tVar.Z("capturePageHintIcon");
        this.nullableSimpleElementColorAdapter.toJson(tVar, governmentIdStepStrokeColor.getCapturePageHintIcon());
        tVar.Z("governmentIdCaptureFeedBox");
        this.nullableSimpleElementColorAdapter.toJson(tVar, governmentIdStepStrokeColor.getGovernmentIdCaptureFeedBox());
        tVar.Z("captureOverlayHeaderButton");
        this.nullableSimpleElementColorAdapter.toJson(tVar, governmentIdStepStrokeColor.getCaptureOverlayHeaderButton());
        tVar.y();
    }
}
