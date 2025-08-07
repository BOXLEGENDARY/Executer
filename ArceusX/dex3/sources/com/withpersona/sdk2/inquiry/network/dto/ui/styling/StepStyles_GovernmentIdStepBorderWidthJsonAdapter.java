package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_GovernmentIdStepBorderWidthJsonAdapter extends h<StepStyles.GovernmentIdStepBorderWidth> {

    @NotNull
    private final h<StyleElements.MeasurementSet> nullableMeasurementSetAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"governmentIdSelectOption", "governmentIdCaptureFeedBox", "governmentIdReviewImageBox"});

    public StepStyles_GovernmentIdStepBorderWidthJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementSetAdapter = wVar.f(StyleElements.MeasurementSet.class, L.d(), "governmentIdSelectOption");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.GovernmentIdStepBorderWidth");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.GovernmentIdStepBorderWidth m462fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.MeasurementSet measurementSet = null;
        StyleElements.MeasurementSet measurementSet2 = null;
        StyleElements.MeasurementSet measurementSet3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                measurementSet = (StyleElements.MeasurementSet) this.nullableMeasurementSetAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                measurementSet2 = (StyleElements.MeasurementSet) this.nullableMeasurementSetAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                measurementSet3 = (StyleElements.MeasurementSet) this.nullableMeasurementSetAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.GovernmentIdStepBorderWidth(measurementSet, measurementSet2, measurementSet3);
    }

    public void toJson(@NotNull t tVar, StepStyles.GovernmentIdStepBorderWidth governmentIdStepBorderWidth) {
        if (governmentIdStepBorderWidth == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("governmentIdSelectOption");
        this.nullableMeasurementSetAdapter.toJson(tVar, governmentIdStepBorderWidth.getGovernmentIdSelectOption());
        tVar.Z("governmentIdCaptureFeedBox");
        this.nullableMeasurementSetAdapter.toJson(tVar, governmentIdStepBorderWidth.getGovernmentIdCaptureFeedBox());
        tVar.Z("governmentIdReviewImageBox");
        this.nullableMeasurementSetAdapter.toJson(tVar, governmentIdStepBorderWidth.getGovernmentIdReviewImageBox());
        tVar.y();
    }
}
