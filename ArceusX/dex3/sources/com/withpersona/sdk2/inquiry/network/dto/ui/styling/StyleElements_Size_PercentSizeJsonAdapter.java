package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_Size_PercentSizeJsonAdapter extends h<StyleElements.Size.PercentSize> {

    @NotNull
    private final h<Double> doubleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"percent"});

    public StyleElements_Size_PercentSizeJsonAdapter(@NotNull w wVar) {
        this.doubleAdapter = wVar.f(Double.TYPE, L.d(), "percent");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.Size.PercentSize");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.Size.PercentSize m519fromJson(@NotNull m mVar) throws j {
        mVar.e();
        Double d = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0 && (d = (Double) this.doubleAdapter.fromJson(mVar)) == null) {
                throw c.x("percent", "percent", mVar);
            }
        }
        mVar.j();
        if (d != null) {
            return new StyleElements.Size.PercentSize(d.doubleValue());
        }
        throw c.o("percent", "percent", mVar);
    }

    public void toJson(@NotNull t tVar, StyleElements.Size.PercentSize percentSize) {
        if (percentSize == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("percent");
        this.doubleAdapter.toJson(tVar, Double.valueOf(percentSize.getPercent()));
        tVar.y();
    }
}
