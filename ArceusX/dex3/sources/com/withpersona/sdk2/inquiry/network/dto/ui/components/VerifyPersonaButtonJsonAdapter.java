package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonVerifyPersonaComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class VerifyPersonaButtonJsonAdapter extends h<VerifyPersonaButton> {

    @NotNull
    private final h<VerifyPersonaButton.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<ButtonVerifyPersonaComponentStyle> nullableButtonVerifyPersonaComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public VerifyPersonaButtonJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(VerifyPersonaButton.Attributes.class, L.d(), "attributes");
        this.nullableButtonVerifyPersonaComponentStyleAdapter = wVar.f(ButtonVerifyPersonaComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyPersonaButton");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public VerifyPersonaButton m307fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        VerifyPersonaButton.Attributes attributes = null;
        ButtonVerifyPersonaComponentStyle buttonVerifyPersonaComponentStyle = null;
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
                attributes = (VerifyPersonaButton.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                buttonVerifyPersonaComponentStyle = (ButtonVerifyPersonaComponentStyle) this.nullableButtonVerifyPersonaComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new VerifyPersonaButton(str, attributes, buttonVerifyPersonaComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, VerifyPersonaButton verifyPersonaButton) {
        if (verifyPersonaButton == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, verifyPersonaButton.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, verifyPersonaButton.getAttributes());
        tVar.Z("styles");
        this.nullableButtonVerifyPersonaComponentStyleAdapter.toJson(tVar, verifyPersonaButton.getStyles());
        tVar.y();
    }
}
