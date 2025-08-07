package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class OptionWithDescriptionJsonAdapter extends h<OptionWithDescription> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Text.type, "value", "descriptionText"});

    @NotNull
    private final h<String> stringAdapter;

    public OptionWithDescriptionJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Text.type);
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "descriptionText");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OptionWithDescription");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public OptionWithDescription m289fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.fromJson(mVar);
                if (str == null) {
                    throw c.x(Text.type, Text.type, mVar);
                }
            } else if (iP0 == 1) {
                str2 = (String) this.stringAdapter.fromJson(mVar);
                if (str2 == null) {
                    throw c.x("value__", "value", mVar);
                }
            } else if (iP0 == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o(Text.type, Text.type, mVar);
        }
        if (str2 != null) {
            return new OptionWithDescription(str, str2, str3);
        }
        throw c.o("value__", "value", mVar);
    }

    public void toJson(@NotNull t tVar, OptionWithDescription optionWithDescription) {
        if (optionWithDescription == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Text.type);
        this.stringAdapter.toJson(tVar, optionWithDescription.getText());
        tVar.Z("value");
        this.stringAdapter.toJson(tVar, optionWithDescription.getValue());
        tVar.Z("descriptionText");
        this.nullableStringAdapter.toJson(tVar, optionWithDescription.getDescriptionText());
        tVar.y();
    }
}
