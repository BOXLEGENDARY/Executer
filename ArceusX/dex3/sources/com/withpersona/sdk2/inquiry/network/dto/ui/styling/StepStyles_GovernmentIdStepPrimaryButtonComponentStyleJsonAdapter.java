package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_GovernmentIdStepPrimaryButtonComponentStyleJsonAdapter extends h<StepStyles.GovernmentIdStepPrimaryButtonComponentStyle> {

    @NotNull
    private final h<StepStyles.StepSubmitButtonComponentStyleContainer> nullableStepSubmitButtonComponentStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "cancelDialogClose", "submitPhotoButton"});

    public StepStyles_GovernmentIdStepPrimaryButtonComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableStepSubmitButtonComponentStyleContainerAdapter = wVar.f(StepStyles.StepSubmitButtonComponentStyleContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(76);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.GovernmentIdStepPrimaryButtonComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.GovernmentIdStepPrimaryButtonComponentStyle m467fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer = null;
        StepStyles.StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2 = null;
        StepStyles.StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                stepSubmitButtonComponentStyleContainer = (StepStyles.StepSubmitButtonComponentStyleContainer) this.nullableStepSubmitButtonComponentStyleContainerAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                stepSubmitButtonComponentStyleContainer2 = (StepStyles.StepSubmitButtonComponentStyleContainer) this.nullableStepSubmitButtonComponentStyleContainerAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                stepSubmitButtonComponentStyleContainer3 = (StepStyles.StepSubmitButtonComponentStyleContainer) this.nullableStepSubmitButtonComponentStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.GovernmentIdStepPrimaryButtonComponentStyle(stepSubmitButtonComponentStyleContainer, stepSubmitButtonComponentStyleContainer2, stepSubmitButtonComponentStyleContainer3);
    }

    public void toJson(@NotNull t tVar, StepStyles.GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle) {
        if (governmentIdStepPrimaryButtonComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableStepSubmitButtonComponentStyleContainerAdapter.toJson(tVar, governmentIdStepPrimaryButtonComponentStyle.getBase());
        tVar.Z("cancelDialogClose");
        this.nullableStepSubmitButtonComponentStyleContainerAdapter.toJson(tVar, governmentIdStepPrimaryButtonComponentStyle.getCancelDialogClose());
        tVar.Z("submitPhotoButton");
        this.nullableStepSubmitButtonComponentStyleContainerAdapter.toJson(tVar, governmentIdStepPrimaryButtonComponentStyle.getSubmitPhotoButton());
        tVar.y();
    }
}
