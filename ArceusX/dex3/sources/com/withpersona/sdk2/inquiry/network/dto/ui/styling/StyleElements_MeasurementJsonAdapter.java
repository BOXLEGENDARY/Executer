package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_MeasurementJsonAdapter extends h<StyleElements.Measurement> {

    @NotNull
    private final h<StyleElements.Size> nullableSizeAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StyleElements_MeasurementJsonAdapter(@NotNull w wVar) {
        this.nullableSizeAdapter = wVar.f(StyleElements.Size.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.Measurement");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.Measurement m513fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Size size = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                size = (StyleElements.Size) this.nullableSizeAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StyleElements.Measurement(size);
    }

    public void toJson(@NotNull t tVar, StyleElements.Measurement measurement) {
        if (measurement == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableSizeAdapter.toJson(tVar, measurement.getBase());
        tVar.y();
    }
}
