package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class BrandingJsonAdapter extends h<Branding> {

    @NotNull
    private final h<Branding.Attributes> nullableAttributesAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes"});

    @NotNull
    private final h<String> stringAdapter;

    public BrandingJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(Branding.Attributes.class, L.d(), "attributes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Branding");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Branding m216fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        Branding.Attributes attributes = null;
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
                attributes = (Branding.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new Branding(str, attributes);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, Branding branding) {
        if (branding == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, branding.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, branding.getAttributes());
        tVar.y();
    }
}
