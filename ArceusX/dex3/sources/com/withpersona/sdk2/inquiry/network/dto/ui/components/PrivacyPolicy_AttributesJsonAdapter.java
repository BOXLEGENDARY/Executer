package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class PrivacyPolicy_AttributesJsonAdapter extends h<PrivacyPolicy.Attributes> {

    @NotNull
    private final m.b options = m.b.a(new String[]{Text.type});

    @NotNull
    private final h<String> stringAdapter;

    public PrivacyPolicy_AttributesJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Text.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PrivacyPolicy.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public PrivacyPolicy.Attributes m291fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0 && (str = (String) this.stringAdapter.fromJson(mVar)) == null) {
                throw c.x(Text.type, Text.type, mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new PrivacyPolicy.Attributes(str);
        }
        throw c.o(Text.type, Text.type, mVar);
    }

    public void toJson(@NotNull t tVar, PrivacyPolicy.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Text.type);
        this.stringAdapter.toJson(tVar, attributes.getText());
        tVar.y();
    }
}
