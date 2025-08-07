package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class Branding_AttributesJsonAdapter extends h<Branding.Attributes> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"hideLogo"});

    public Branding_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "hideLogo");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Branding.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Branding.Attributes m217fromJson(@NotNull m mVar) {
        mVar.e();
        Boolean bool = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new Branding.Attributes(bool);
    }

    public void toJson(@NotNull t tVar, Branding.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("hideLogo");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getHideLogo());
        tVar.y();
    }
}
