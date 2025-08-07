package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_SelfieStepTextBasedComponentStyleJsonAdapter extends h<StepStyles.SelfieStepTextBasedComponentStyle> {

    @NotNull
    private final h<StepStyles.StepTextBasedComponentStyleContainer> nullableStepTextBasedComponentStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "selfieProcessingText", "selfieCaptureHintText"});

    public StepStyles_SelfieStepTextBasedComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableStepTextBasedComponentStyleContainerAdapter = wVar.f(StepStyles.StepTextBasedComponentStyleContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(66);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.SelfieStepTextBasedComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.SelfieStepTextBasedComponentStyle m482fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = null;
        StepStyles.StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = null;
        StepStyles.StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                stepTextBasedComponentStyleContainer = (StepStyles.StepTextBasedComponentStyleContainer) this.nullableStepTextBasedComponentStyleContainerAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                stepTextBasedComponentStyleContainer2 = (StepStyles.StepTextBasedComponentStyleContainer) this.nullableStepTextBasedComponentStyleContainerAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                stepTextBasedComponentStyleContainer3 = (StepStyles.StepTextBasedComponentStyleContainer) this.nullableStepTextBasedComponentStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.SelfieStepTextBasedComponentStyle(stepTextBasedComponentStyleContainer, stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3);
    }

    public void toJson(@NotNull t tVar, StepStyles.SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle) {
        if (selfieStepTextBasedComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableStepTextBasedComponentStyleContainerAdapter.toJson(tVar, selfieStepTextBasedComponentStyle.getBase());
        tVar.Z("selfieProcessingText");
        this.nullableStepTextBasedComponentStyleContainerAdapter.toJson(tVar, selfieStepTextBasedComponentStyle.getSelfieProcessingText());
        tVar.Z("selfieCaptureHintText");
        this.nullableStepTextBasedComponentStyleContainerAdapter.toJson(tVar, selfieStepTextBasedComponentStyle.getSelfieCaptureHintText());
        tVar.y();
    }
}
