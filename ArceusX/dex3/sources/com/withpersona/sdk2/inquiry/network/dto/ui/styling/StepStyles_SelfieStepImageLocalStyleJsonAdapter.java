package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_SelfieStepImageLocalStyleJsonAdapter extends h<StepStyles.SelfieStepImageLocalStyle> {

    @NotNull
    private final h<StepStyles.SelfieStepImageLocalStyleContainer> nullableSelfieStepImageLocalStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selfieStartIcon"});

    public StepStyles_SelfieStepImageLocalStyleJsonAdapter(@NotNull w wVar) {
        this.nullableSelfieStepImageLocalStyleContainerAdapter = wVar.f(StepStyles.SelfieStepImageLocalStyleContainer.class, L.d(), "selfieStartIcon");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(58);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.SelfieStepImageLocalStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.SelfieStepImageLocalStyle m479fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.SelfieStepImageLocalStyleContainer selfieStepImageLocalStyleContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                selfieStepImageLocalStyleContainer = (StepStyles.SelfieStepImageLocalStyleContainer) this.nullableSelfieStepImageLocalStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.SelfieStepImageLocalStyle(selfieStepImageLocalStyleContainer);
    }

    public void toJson(@NotNull t tVar, StepStyles.SelfieStepImageLocalStyle selfieStepImageLocalStyle) {
        if (selfieStepImageLocalStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selfieStartIcon");
        this.nullableSelfieStepImageLocalStyleContainerAdapter.toJson(tVar, selfieStepImageLocalStyle.getSelfieStartIcon());
        tVar.y();
    }
}
