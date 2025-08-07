package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_StepPaddingStyleJsonAdapter extends h<StepStyles.StepPaddingStyle> {

    @NotNull
    private final h<StepStyles.StepPaddingStyleContainer> nullableStepPaddingStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"modal"});

    public StepStyles_StepPaddingStyleJsonAdapter(@NotNull w wVar) {
        this.nullableStepPaddingStyleContainerAdapter = wVar.f(StepStyles.StepPaddingStyleContainer.class, L.d(), "modal");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.StepPaddingStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.StepPaddingStyle m491fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.StepPaddingStyleContainer stepPaddingStyleContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                stepPaddingStyleContainer = (StepStyles.StepPaddingStyleContainer) this.nullableStepPaddingStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.StepPaddingStyle(stepPaddingStyleContainer);
    }

    public void toJson(@NotNull t tVar, StepStyles.StepPaddingStyle stepPaddingStyle) {
        if (stepPaddingStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("modal");
        this.nullableStepPaddingStyleContainerAdapter.toJson(tVar, stepPaddingStyle.getModal());
        tVar.y();
    }
}
