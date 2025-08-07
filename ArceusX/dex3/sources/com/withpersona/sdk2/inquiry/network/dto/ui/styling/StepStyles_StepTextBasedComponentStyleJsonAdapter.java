package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepTextBasedComponentStyleJsonAdapter extends h<StepStyles.StepTextBasedComponentStyle> {

    @NotNull
    private final h<StepStyles.StepTextBasedComponentStyleContainer> nullableStepTextBasedComponentStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StepStyles_StepTextBasedComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableStepTextBasedComponentStyleContainerAdapter = wVar.f(StepStyles.StepTextBasedComponentStyleContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepTextBasedComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepTextBasedComponentStyle m496fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                stepTextBasedComponentStyleContainer = (StepStyles.StepTextBasedComponentStyleContainer) this.nullableStepTextBasedComponentStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepTextBasedComponentStyle(stepTextBasedComponentStyleContainer);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepTextBasedComponentStyle stepTextBasedComponentStyle) {
        if (stepTextBasedComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableStepTextBasedComponentStyleContainerAdapter.toJson(tVar, stepTextBasedComponentStyle.getBase());
        tVar.y();
    }
}
