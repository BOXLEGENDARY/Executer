package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class ESignatureJsonAdapter extends h<ESignature> {

    @NotNull
    private final h<ESignature.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<ESignature.ESignatureComponentStyle> nullableESignatureComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public ESignatureJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(ESignature.Attributes.class, L.d(), "attributes");
        this.nullableESignatureComponentStyleAdapter = wVar.f(ESignature.ESignatureComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ESignature");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public ESignature m234fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        ESignature.Attributes attributes = null;
        ESignature.ESignatureComponentStyle eSignatureComponentStyle = null;
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
                attributes = (ESignature.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                eSignatureComponentStyle = (ESignature.ESignatureComponentStyle) this.nullableESignatureComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new ESignature(str, attributes, eSignatureComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, ESignature eSignature) {
        if (eSignature == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, eSignature.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, eSignature.getAttributes());
        tVar.Z("styles");
        this.nullableESignatureComponentStyleAdapter.toJson(tVar, eSignature.getStyles());
        tVar.y();
    }
}
