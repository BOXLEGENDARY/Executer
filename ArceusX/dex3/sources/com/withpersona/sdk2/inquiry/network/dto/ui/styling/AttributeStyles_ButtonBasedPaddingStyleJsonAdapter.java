package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class AttributeStyles_ButtonBasedPaddingStyleJsonAdapter extends h<AttributeStyles.ButtonBasedPaddingStyle> {

    @NotNull
    private final h<StyleElements.MeasurementSet> nullableMeasurementSetAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public AttributeStyles_ButtonBasedPaddingStyleJsonAdapter(@NotNull w wVar) {
        this.nullableMeasurementSetAdapter = wVar.f(StyleElements.MeasurementSet.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AttributeStyles.ButtonBasedPaddingStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public AttributeStyles.ButtonBasedPaddingStyle m323fromJson(@NotNull m mVar) {
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
        return new AttributeStyles.ButtonBasedPaddingStyle(measurementSet);
    }

    public void toJson(@NotNull t tVar, AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle) {
        if (buttonBasedPaddingStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableMeasurementSetAdapter.toJson(tVar, buttonBasedPaddingStyle.getBase());
        tVar.y();
    }
}
