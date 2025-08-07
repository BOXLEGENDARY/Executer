package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class PrivacyPolicyJsonAdapter extends h<PrivacyPolicy> {

    @NotNull
    private final h<PrivacyPolicy.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<TextBasedComponentStyle> nullableTextBasedComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public PrivacyPolicyJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(PrivacyPolicy.Attributes.class, L.d(), "attributes");
        this.nullableTextBasedComponentStyleAdapter = wVar.f(TextBasedComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PrivacyPolicy");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public PrivacyPolicy m290fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        PrivacyPolicy.Attributes attributes = null;
        TextBasedComponentStyle textBasedComponentStyle = null;
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
                attributes = (PrivacyPolicy.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                textBasedComponentStyle = (TextBasedComponentStyle) this.nullableTextBasedComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new PrivacyPolicy(str, attributes, textBasedComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, PrivacyPolicy privacyPolicy) {
        if (privacyPolicy == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, privacyPolicy.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, privacyPolicy.getAttributes());
        tVar.Z("styles");
        this.nullableTextBasedComponentStyleAdapter.toJson(tVar, privacyPolicy.getStyles());
        tVar.y();
    }
}
