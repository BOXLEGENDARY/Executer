package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_SelfieStepBorderColorJsonAdapter extends h<StepStyles.SelfieStepBorderColor> {

    @NotNull
    private final h<StyleElements.SimpleElementColor> nullableSimpleElementColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selfieCaptureFeedBox"});

    public StepStyles_SelfieStepBorderColorJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorAdapter = wVar.f(StyleElements.SimpleElementColor.class, L.d(), "selfieCaptureFeedBox");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.SelfieStepBorderColor");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.SelfieStepBorderColor m475fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColor simpleElementColor = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                simpleElementColor = (StyleElements.SimpleElementColor) this.nullableSimpleElementColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.SelfieStepBorderColor(simpleElementColor);
    }

    public void toJson(@NotNull t tVar, StepStyles.SelfieStepBorderColor selfieStepBorderColor) {
        if (selfieStepBorderColor == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selfieCaptureFeedBox");
        this.nullableSimpleElementColorAdapter.toJson(tVar, selfieStepBorderColor.getSelfieCaptureFeedBox());
        tVar.y();
    }
}
