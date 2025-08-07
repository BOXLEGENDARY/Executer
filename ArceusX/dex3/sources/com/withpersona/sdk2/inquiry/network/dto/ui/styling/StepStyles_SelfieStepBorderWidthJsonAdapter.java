package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_SelfieStepBorderWidthJsonAdapter extends h<StepStyles.SelfieStepBorderWidth> {

    @NotNull
    private final h<StyleElements.MeasurementSet> nullableMeasurementSetAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"selfieCaptureFeedBox"});

    public StepStyles_SelfieStepBorderWidthJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementSetAdapter = wVar.f(StyleElements.MeasurementSet.class, L.d(), "selfieCaptureFeedBox");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.SelfieStepBorderWidth");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.SelfieStepBorderWidth m476fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.MeasurementSet measurementSet = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                measurementSet = (StyleElements.MeasurementSet) this.nullableMeasurementSetAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.SelfieStepBorderWidth(measurementSet);
    }

    public void toJson(@NotNull t tVar, StepStyles.SelfieStepBorderWidth selfieStepBorderWidth) {
        if (selfieStepBorderWidth == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("selfieCaptureFeedBox");
        this.nullableMeasurementSetAdapter.toJson(tVar, selfieStepBorderWidth.getSelfieCaptureFeedBox());
        tVar.y();
    }
}
