package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepBackgroundImageStyleContainerJsonAdapter extends h<StepStyles.StepBackgroundImageStyleContainer> {

    @NotNull
    private final h<StepStyles.StepBackgroundImageNameContainer> nullableStepBackgroundImageNameContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StepStyles_StepBackgroundImageStyleContainerJsonAdapter(@NotNull w wVar) {
        this.nullableStepBackgroundImageNameContainerAdapter = wVar.f(StepStyles.StepBackgroundImageNameContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(66);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepBackgroundImageStyleContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepBackgroundImageStyleContainer m486fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.StepBackgroundImageNameContainer stepBackgroundImageNameContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                stepBackgroundImageNameContainer = (StepStyles.StepBackgroundImageNameContainer) this.nullableStepBackgroundImageNameContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepBackgroundImageStyleContainer(stepBackgroundImageNameContainer);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepBackgroundImageStyleContainer stepBackgroundImageStyleContainer) {
        if (stepBackgroundImageStyleContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableStepBackgroundImageNameContainerAdapter.toJson(tVar, stepBackgroundImageStyleContainer.getBase());
        tVar.y();
    }
}
