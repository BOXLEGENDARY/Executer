package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_AxisContainerJsonAdapter extends h<StyleElements.AxisContainer> {

    @NotNull
    private final h<StyleElements.Axis> nullableAxisAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base"});

    public StyleElements_AxisContainerJsonAdapter(@NotNull w wVar) {
        this.nullableAxisAdapter = wVar.f(StyleElements.Axis.class, L.d(), "base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.AxisContainer");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.AxisContainer m509fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.Axis axis = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                axis = (StyleElements.Axis) this.nullableAxisAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StyleElements.AxisContainer(axis);
    }

    public void toJson(@NotNull t tVar, StyleElements.AxisContainer axisContainer) {
        if (axisContainer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableAxisAdapter.toJson(tVar, axisContainer.getBase());
        tVar.y();
    }
}
