package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class StyleElements_ComplexElementColorJsonAdapter extends h<StyleElements.ComplexElementColor> {

    @NotNull
    private final h<StyleElements.SimpleElementColorValue> nullableSimpleElementColorValueAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"base", "focused", "active", "disabled", "errored"});

    public StyleElements_ComplexElementColorJsonAdapter(@NotNull w wVar) {
        this.nullableSimpleElementColorValueAdapter = wVar.f(StyleElements.SimpleElementColorValue.class, L.d(), "_base");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("StyleElements.ComplexElementColor");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public StyleElements.ComplexElementColor m511fromJson(@NotNull m mVar) {
        mVar.e();
        StyleElements.SimpleElementColorValue simpleElementColorValue = null;
        StyleElements.SimpleElementColorValue simpleElementColorValue2 = null;
        StyleElements.SimpleElementColorValue simpleElementColorValue3 = null;
        StyleElements.SimpleElementColorValue simpleElementColorValue4 = null;
        StyleElements.SimpleElementColorValue simpleElementColorValue5 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                simpleElementColorValue = (StyleElements.SimpleElementColorValue) this.nullableSimpleElementColorValueAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                simpleElementColorValue2 = (StyleElements.SimpleElementColorValue) this.nullableSimpleElementColorValueAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                simpleElementColorValue3 = (StyleElements.SimpleElementColorValue) this.nullableSimpleElementColorValueAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                simpleElementColorValue4 = (StyleElements.SimpleElementColorValue) this.nullableSimpleElementColorValueAdapter.fromJson(mVar);
            } else if (iP0 == 4) {
                simpleElementColorValue5 = (StyleElements.SimpleElementColorValue) this.nullableSimpleElementColorValueAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new StyleElements.ComplexElementColor(simpleElementColorValue, simpleElementColorValue2, simpleElementColorValue3, simpleElementColorValue4, simpleElementColorValue5);
    }

    public void toJson(@NotNull t tVar, StyleElements.ComplexElementColor complexElementColor) {
        if (complexElementColor == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("base");
        this.nullableSimpleElementColorValueAdapter.toJson(tVar, complexElementColor.get_base());
        tVar.Z("focused");
        this.nullableSimpleElementColorValueAdapter.toJson(tVar, complexElementColor.get_focused());
        tVar.Z("active");
        this.nullableSimpleElementColorValueAdapter.toJson(tVar, complexElementColor.get_active());
        tVar.Z("disabled");
        this.nullableSimpleElementColorValueAdapter.toJson(tVar, complexElementColor.get_disabled());
        tVar.Z("errored");
        this.nullableSimpleElementColorValueAdapter.toJson(tVar, complexElementColor.get_errored());
        tVar.y();
    }
}
