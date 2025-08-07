package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_InputRadioGroupLineHeightStyleJsonAdapter extends h<AttributeStyles.InputRadioGroupLineHeightStyle> {

    @NotNull
    private final h<StyleElements.Measurement> nullableMeasurementAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "description", "error"});

    public AttributeStyles_InputRadioGroupLineHeightStyleJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementAdapter = wVar.f(StyleElements.Measurement.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(68);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.InputRadioGroupLineHeightStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.InputRadioGroupLineHeightStyle m394fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Measurement measurement = null;
        StyleElements.Measurement measurement2 = null;
        StyleElements.Measurement measurement3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                measurement = (StyleElements.Measurement) this.nullableMeasurementAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                measurement2 = (StyleElements.Measurement) this.nullableMeasurementAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                measurement3 = (StyleElements.Measurement) this.nullableMeasurementAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.InputRadioGroupLineHeightStyle(measurement, measurement2, measurement3);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle) {
        if (inputRadioGroupLineHeightStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableMeasurementAdapter.toJson(tVar, inputRadioGroupLineHeightStyle.getBase());
        tVar.Z("description");
        this.nullableMeasurementAdapter.toJson(tVar, inputRadioGroupLineHeightStyle.getDescription());
        tVar.Z("error");
        this.nullableMeasurementAdapter.toJson(tVar, inputRadioGroupLineHeightStyle.getError());
        tVar.y();
    }
}
