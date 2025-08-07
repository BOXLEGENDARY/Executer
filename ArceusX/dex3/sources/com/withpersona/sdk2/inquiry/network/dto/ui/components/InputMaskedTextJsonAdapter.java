package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputMaskedTextJsonAdapter extends h<InputMaskedText> {

    @NotNull
    private final h<InputMaskedText.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputTextBasedComponentStyle> nullableInputTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "styles", "attributes"});

    @NotNull
    private final h<String> stringAdapter;

    public InputMaskedTextJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableInputTextBasedComponentStyleAdapter = wVar.f(InputTextBasedComponentStyle.class, L.d(), "styles");
        this.nullableAttributesAdapter = wVar.f(InputMaskedText.Attributes.class, L.d(), "attributes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputMaskedText");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputMaskedText m267fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputTextBasedComponentStyle inputTextBasedComponentStyle = null;
        InputMaskedText.Attributes attributes = null;
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
                inputTextBasedComponentStyle = (InputTextBasedComponentStyle) this.nullableInputTextBasedComponentStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                attributes = (InputMaskedText.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputMaskedText(str, inputTextBasedComponentStyle, attributes);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputMaskedText inputMaskedText) {
        if (inputMaskedText == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputMaskedText.getName());
        tVar.Z("styles");
        this.nullableInputTextBasedComponentStyleAdapter.toJson(tVar, inputMaskedText.getStyles());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputMaskedText.getAttributes());
        tVar.y();
    }
}
