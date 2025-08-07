package com.withpersona.sdk2.inquiry.network.dto;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class NextStep_GovernmentId_LocalizationOverrideJsonAdapter extends h<NextStep.GovernmentId.LocalizationOverride> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"countryCode", "idClass", "side", "page", "key", Text.type});

    @NotNull
    private final h<String> stringAdapter;

    public NextStep_GovernmentId_LocalizationOverrideJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "countryCode");
        this.stringAdapter = wVar.f(String.class, L.d(), "page");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NextStep.GovernmentId.LocalizationOverride");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public NextStep.GovernmentId.LocalizationOverride m179fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(mVar);
                    if (str4 == null) {
                        throw c.x("page", "page", mVar);
                    }
                    break;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(mVar);
                    if (str5 == null) {
                        throw c.x("key", "key", mVar);
                    }
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(mVar);
                    if (str6 == null) {
                        throw c.x(Text.type, Text.type, mVar);
                    }
                    break;
            }
        }
        mVar.j();
        if (str4 == null) {
            throw c.o("page", "page", mVar);
        }
        if (str5 == null) {
            throw c.o("key", "key", mVar);
        }
        if (str6 != null) {
            return new NextStep.GovernmentId.LocalizationOverride(str, str2, str3, str4, str5, str6);
        }
        throw c.o(Text.type, Text.type, mVar);
    }

    public void toJson(@NotNull t tVar, NextStep.GovernmentId.LocalizationOverride localizationOverride) {
        if (localizationOverride == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("countryCode");
        this.nullableStringAdapter.toJson(tVar, localizationOverride.getCountryCode());
        tVar.Z("idClass");
        this.nullableStringAdapter.toJson(tVar, localizationOverride.getIdClass());
        tVar.Z("side");
        this.nullableStringAdapter.toJson(tVar, localizationOverride.getSide());
        tVar.Z("page");
        this.stringAdapter.toJson(tVar, localizationOverride.getPage());
        tVar.Z("key");
        this.stringAdapter.toJson(tVar, localizationOverride.getKey());
        tVar.Z(Text.type);
        this.stringAdapter.toJson(tVar, localizationOverride.getText());
        tVar.y();
    }
}
