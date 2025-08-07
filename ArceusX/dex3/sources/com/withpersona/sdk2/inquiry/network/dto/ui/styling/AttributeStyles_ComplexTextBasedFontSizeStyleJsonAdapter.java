package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ComplexTextBasedFontSizeStyleJsonAdapter extends h<AttributeStyles.ComplexTextBasedFontSizeStyle> {

    @NotNull
    private final h<StyleElements.Measurement> nullableMeasurementAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"value", "placeholder", "label", "error"});

    public AttributeStyles_ComplexTextBasedFontSizeStyleJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementAdapter = wVar.f(StyleElements.Measurement.class, L.d(), "value");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(67);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ComplexTextBasedFontSizeStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ComplexTextBasedFontSizeStyle m338fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Measurement measurement = null;
        StyleElements.Measurement measurement2 = null;
        StyleElements.Measurement measurement3 = null;
        StyleElements.Measurement measurement4 = null;
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
            } else if (iP0 == 3) {
                measurement4 = (StyleElements.Measurement) this.nullableMeasurementAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.ComplexTextBasedFontSizeStyle(measurement, measurement2, measurement3, measurement4);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle) {
        if (complexTextBasedFontSizeStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("value");
        this.nullableMeasurementAdapter.toJson(tVar, complexTextBasedFontSizeStyle.getValue());
        tVar.Z("placeholder");
        this.nullableMeasurementAdapter.toJson(tVar, complexTextBasedFontSizeStyle.getPlaceholder());
        tVar.Z("label");
        this.nullableMeasurementAdapter.toJson(tVar, complexTextBasedFontSizeStyle.getLabel());
        tVar.Z("error");
        this.nullableMeasurementAdapter.toJson(tVar, complexTextBasedFontSizeStyle.getError());
        tVar.y();
    }
}
