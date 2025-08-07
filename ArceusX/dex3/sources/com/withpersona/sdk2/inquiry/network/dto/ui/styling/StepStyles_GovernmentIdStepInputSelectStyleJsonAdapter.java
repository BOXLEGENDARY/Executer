package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_GovernmentIdStepInputSelectStyleJsonAdapter extends h<StepStyles.GovernmentIdStepInputSelectStyle> {

    @NotNull
    private final h<StepStyles.InputSelectStyleContainer> nullableInputSelectStyleContainerAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StepStyles_GovernmentIdStepInputSelectStyleJsonAdapter(@NotNull w wVar) {
        this.nullableInputSelectStyleContainerAdapter = wVar.f(StepStyles.InputSelectStyleContainer.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(65);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.GovernmentIdStepInputSelectStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.GovernmentIdStepInputSelectStyle m466fromJson(@NotNull m mVar) {
        mVar.e();
        StepStyles.InputSelectStyleContainer inputSelectStyleContainer = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                inputSelectStyleContainer = (StepStyles.InputSelectStyleContainer) this.nullableInputSelectStyleContainerAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.GovernmentIdStepInputSelectStyle(inputSelectStyleContainer);
    }

    public void toJson(@NotNull t tVar, StepStyles.GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle) {
        if (governmentIdStepInputSelectStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableInputSelectStyleContainerAdapter.toJson(tVar, governmentIdStepInputSelectStyle.getBase());
        tVar.y();
    }
}
