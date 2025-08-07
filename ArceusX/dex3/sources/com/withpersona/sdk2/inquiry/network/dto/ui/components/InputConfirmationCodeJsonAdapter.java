package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputConfirmationCodeJsonAdapter extends h<InputConfirmationCode> {

    @NotNull
    private final h<InputConfirmationCode.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputTextBasedComponentStyle> nullableInputTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "styles", "attributes"});

    @NotNull
    private final h<String> stringAdapter;

    public InputConfirmationCodeJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableInputTextBasedComponentStyleAdapter = wVar.f(InputTextBasedComponentStyle.class, L.d(), "styles");
        this.nullableAttributesAdapter = wVar.f(InputConfirmationCode.Attributes.class, L.d(), "attributes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputConfirmationCode");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputConfirmationCode m256fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputTextBasedComponentStyle inputTextBasedComponentStyle = null;
        InputConfirmationCode.Attributes attributes = null;
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
                attributes = (InputConfirmationCode.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputConfirmationCode(str, inputTextBasedComponentStyle, attributes);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputConfirmationCode inputConfirmationCode) {
        if (inputConfirmationCode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputConfirmationCode.getName());
        tVar.Z("styles");
        this.nullableInputTextBasedComponentStyleAdapter.toJson(tVar, inputConfirmationCode.getStyles());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputConfirmationCode.getAttributes());
        tVar.y();
    }
}
