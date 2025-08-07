package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputSelectJsonAdapter extends h<InputSelect> {

    @NotNull
    private final h<InputSelect.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputSelectComponentStyle> nullableInputSelectComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public InputSelectJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(InputSelect.Attributes.class, L.d(), "attributes");
        this.nullableInputSelectComponentStyleAdapter = wVar.f(InputSelectComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputSelect");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputSelect m278fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputSelect.Attributes attributes = null;
        InputSelectComponentStyle inputSelectComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (iP0 == 1) {
                attributes = (InputSelect.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                inputSelectComponentStyle = (InputSelectComponentStyle) this.nullableInputSelectComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputSelect(str, attributes, inputSelectComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputSelect inputSelect) {
        if (inputSelect == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputSelect.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputSelect.getAttributes());
        tVar.Z("styles");
        this.nullableInputSelectComponentStyleAdapter.toJson(tVar, inputSelect.getStyles());
        tVar.y();
    }
}
