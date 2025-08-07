package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputTextJsonAdapter extends h<InputText> {

    @NotNull
    private final h<InputText.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputTextBasedComponentStyle> nullableInputTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public InputTextJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(InputText.Attributes.class, L.d(), "attributes");
        this.nullableInputTextBasedComponentStyleAdapter = wVar.f(InputTextBasedComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputText");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputText m284fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputText.Attributes attributes = null;
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
                attributes = (InputText.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                inputTextBasedComponentStyle = (InputTextBasedComponentStyle) this.nullableInputTextBasedComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputText(str, attributes, inputTextBasedComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputText inputText) {
        if (inputText == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputText.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputText.getAttributes());
        tVar.Z("styles");
        this.nullableInputTextBasedComponentStyleAdapter.toJson(tVar, inputText.getStyles());
        tVar.y();
    }
}
