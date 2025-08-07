package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_DocumentStepBorderRadiusJsonAdapter extends h<StepStyles.DocumentStepBorderRadius> {

    @NotNull
    private final h<StyleElements.Measurement> nullableMeasurementAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"modal", "imagePreview"});

    public StepStyles_DocumentStepBorderRadiusJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementAdapter = wVar.f(StyleElements.Measurement.class, L.d(), "modal");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.DocumentStepBorderRadius");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.DocumentStepBorderRadius m451fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Measurement measurement = null;
        StyleElements.Measurement measurement2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                measurement = (StyleElements.Measurement) this.nullableMeasurementAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                measurement2 = (StyleElements.Measurement) this.nullableMeasurementAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StepStyles.DocumentStepBorderRadius(measurement, measurement2);
    }

    public void toJson(@NotNull t tVar, StepStyles.DocumentStepBorderRadius documentStepBorderRadius) {
        if (documentStepBorderRadius == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("modal");
        this.nullableMeasurementAdapter.toJson(tVar, documentStepBorderRadius.getModal());
        tVar.Z("imagePreview");
        this.nullableMeasurementAdapter.toJson(tVar, documentStepBorderRadius.getImagePreview());
        tVar.y();
    }
}
