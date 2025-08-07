package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputInternationalDb_InputInternationalDbComponentStyleJsonAdapter extends h<InputInternationalDb.InputInternationalDbComponentStyle> {

    @NotNull
    private final h<InputSelectComponentStyle> nullableInputSelectComponentStyleAdapter;

    @NotNull
    private final h<InputTextBasedComponentStyle> nullableInputTextBasedComponentStyleAdapter;

    @NotNull
    private final h<TextBasedComponentStyle> nullableTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"inputSelectStyle", "inputTextStyle", "textStyle"});

    public InputInternationalDb_InputInternationalDbComponentStyleJsonAdapter(@NotNull w wVar) {
        this.nullableInputSelectComponentStyleAdapter = wVar.f(InputSelectComponentStyle.class, L.d(), "inputSelectStyle");
        this.nullableInputTextBasedComponentStyleAdapter = wVar.f(InputTextBasedComponentStyle.class, L.d(), "inputTextStyle");
        this.nullableTextBasedComponentStyleAdapter = wVar.f(TextBasedComponentStyle.class, L.d(), "textStyle");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(77);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputInternationalDb.InputInternationalDbComponentStyle");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputInternationalDb.InputInternationalDbComponentStyle m266fromJson(@NotNull m mVar) {
        mVar.e();
        InputSelectComponentStyle inputSelectComponentStyle = null;
        InputTextBasedComponentStyle inputTextBasedComponentStyle = null;
        TextBasedComponentStyle textBasedComponentStyle = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                inputSelectComponentStyle = (InputSelectComponentStyle) this.nullableInputSelectComponentStyleAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                inputTextBasedComponentStyle = (InputTextBasedComponentStyle) this.nullableInputTextBasedComponentStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                textBasedComponentStyle = (TextBasedComponentStyle) this.nullableTextBasedComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new InputInternationalDb.InputInternationalDbComponentStyle(inputSelectComponentStyle, inputTextBasedComponentStyle, textBasedComponentStyle);
    }

    public void toJson(@NotNull t tVar, InputInternationalDb.InputInternationalDbComponentStyle inputInternationalDbComponentStyle) {
        if (inputInternationalDbComponentStyle == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("inputSelectStyle");
        this.nullableInputSelectComponentStyleAdapter.toJson(tVar, inputInternationalDbComponentStyle.getInputSelectStyle());
        tVar.Z("inputTextStyle");
        this.nullableInputTextBasedComponentStyleAdapter.toJson(tVar, inputInternationalDbComponentStyle.getInputTextStyle());
        tVar.Z("textStyle");
        this.nullableTextBasedComponentStyleAdapter.toJson(tVar, inputInternationalDbComponentStyle.getTextStyle());
        tVar.y();
    }
}
