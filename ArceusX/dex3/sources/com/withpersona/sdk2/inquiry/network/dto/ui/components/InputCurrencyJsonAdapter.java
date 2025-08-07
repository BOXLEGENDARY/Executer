package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputCurrencyJsonAdapter extends h<InputCurrency> {

    @NotNull
    private final h<InputCurrency.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputTextBasedComponentStyle> nullableInputTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public InputCurrencyJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(InputCurrency.Attributes.class, L.d(), "attributes");
        this.nullableInputTextBasedComponentStyleAdapter = wVar.f(InputTextBasedComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputCurrency");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputCurrency m258fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputCurrency.Attributes attributes = null;
        InputTextBasedComponentStyle inputTextBasedComponentStyle = null;
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
                attributes = (InputCurrency.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                inputTextBasedComponentStyle = (InputTextBasedComponentStyle) this.nullableInputTextBasedComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputCurrency(str, attributes, inputTextBasedComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputCurrency inputCurrency) {
        if (inputCurrency == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputCurrency.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputCurrency.getAttributes());
        tVar.Z("styles");
        this.nullableInputTextBasedComponentStyleAdapter.toJson(tVar, inputCurrency.getStyles());
        tVar.y();
    }
}
