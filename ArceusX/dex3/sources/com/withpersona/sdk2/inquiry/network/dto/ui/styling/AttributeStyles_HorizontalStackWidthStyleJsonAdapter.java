package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_HorizontalStackWidthStyleJsonAdapter extends h<AttributeStyles.HorizontalStackWidthStyle> {

    @NotNull
    private final h<StyleElements.Measurement> nullableMeasurementAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_HorizontalStackWidthStyleJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementAdapter = wVar.f(StyleElements.Measurement.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.HorizontalStackWidthStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.HorizontalStackWidthStyle m382fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Measurement measurement = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                measurement = (StyleElements.Measurement) this.nullableMeasurementAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new AttributeStyles.HorizontalStackWidthStyle(measurement);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle) {
        if (horizontalStackWidthStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableMeasurementAdapter.toJson(tVar, horizontalStackWidthStyle.getBase());
        tVar.y();
    }
}
