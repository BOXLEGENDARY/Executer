package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonActionComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ActionButtonJsonAdapter extends h<ActionButton> {

    @NotNull
    private final h<BasicButtonAttributes> nullableBasicButtonAttributesAdapter;

    @NotNull
    private final h<ButtonActionComponentStyle> nullableButtonActionComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public ActionButtonJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableBasicButtonAttributesAdapter = wVar.f(BasicButtonAttributes.class, L.d(), "attributes");
        this.nullableButtonActionComponentStyleAdapter = wVar.f(ButtonActionComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ActionButton");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ActionButton m215fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        BasicButtonAttributes basicButtonAttributes = null;
        ButtonActionComponentStyle buttonActionComponentStyle = null;
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
                basicButtonAttributes = (BasicButtonAttributes) this.nullableBasicButtonAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                buttonActionComponentStyle = (ButtonActionComponentStyle) this.nullableButtonActionComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new ActionButton(str, basicButtonAttributes, buttonActionComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, ActionButton actionButton) {
        if (actionButton == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, actionButton.getName());
        tVar.Z("attributes");
        this.nullableBasicButtonAttributesAdapter.toJson(tVar, actionButton.getAttributes());
        tVar.Z("styles");
        this.nullableButtonActionComponentStyleAdapter.toJson(tVar, actionButton.getStyles());
        tVar.y();
    }
}
