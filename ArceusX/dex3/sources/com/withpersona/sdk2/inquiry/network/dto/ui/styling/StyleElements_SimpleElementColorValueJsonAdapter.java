package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColor;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_SimpleElementColorValueJsonAdapter extends h<StyleElements.SimpleElementColorValue> {

    @NotNull
    private final h<Integer> nullableIntAtRgbaHexColorAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"value"});

    public StyleElements_SimpleElementColorValueJsonAdapter(@NotNull w wVar) {
        this.nullableIntAtRgbaHexColorAdapter = wVar.f(Integer.class, L.c(new RgbaHexColor() {
            @Override
            public final Class annotationType() {
                return RgbaHexColor.class;
            }

            @Override
            public final boolean equals(Object obj) {
                return obj instanceof RgbaHexColor;
            }

            @Override
            public final int hashCode() {
                return 0;
            }

            @Override
            @NotNull
            public final String toString() {
                return "@com.withpersona.sdk2.inquiry.network.dto.RgbaHexColor()";
            }
        }), "value");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.SimpleElementColorValue");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.SimpleElementColorValue m517fromJson(@NotNull m mVar) {
        mVar.e();
        Integer num = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                num = (Integer) this.nullableIntAtRgbaHexColorAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StyleElements.SimpleElementColorValue(num);
    }

    public void toJson(@NotNull t tVar, StyleElements.SimpleElementColorValue simpleElementColorValue) {
        if (simpleElementColorValue == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("value");
        this.nullableIntAtRgbaHexColorAdapter.toJson(tVar, simpleElementColorValue.getValue());
        tVar.y();
    }
}
