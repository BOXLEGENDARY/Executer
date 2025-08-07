package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StepStyles_DocumentStepBorderWidthJsonAdapter extends h<StepStyles.DocumentStepBorderWidth> {

    @NotNull
    private final h<StyleElements.MeasurementSet> nullableMeasurementSetAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"imagePreview"});

    public StepStyles_DocumentStepBorderWidthJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementSetAdapter = wVar.f(StyleElements.MeasurementSet.class, L.d(), "imagePreview");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(56);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StepStyles.DocumentStepBorderWidth");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StepStyles.DocumentStepBorderWidth m452fromJson(@NotNull m mVar) {
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
        return new StepStyles.DocumentStepBorderWidth(measurementSet);
    }

    public void toJson(@NotNull t tVar, StepStyles.DocumentStepBorderWidth documentStepBorderWidth) {
        if (documentStepBorderWidth == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("imagePreview");
        this.nullableMeasurementSetAdapter.toJson(tVar, documentStepBorderWidth.getImagePreview());
        tVar.y();
    }
}
