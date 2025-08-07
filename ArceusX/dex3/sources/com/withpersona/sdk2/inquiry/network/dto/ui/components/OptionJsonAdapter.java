package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class OptionJsonAdapter extends h<Option> {

    @NotNull
    private final m.b options = m.b.a(new String[]{Text.type, "value"});

    @NotNull
    private final h<String> stringAdapter;

    public OptionJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Text.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Option");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public Option m288fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
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
            } else if (iP0 == 1 && (str2 = (String) this.stringAdapter.fromJson(mVar)) == null) {
                throw c.x("value__", "value", mVar);
            }
        }
        mVar.j();
        if (str == null) {
            throw c.o(Text.type, Text.type, mVar);
        }
        if (str2 != null) {
            return new Option(str, str2);
        }
        throw c.o("value__", "value", mVar);
    }

    public void toJson(@NotNull t tVar, Option option) {
        if (option == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Text.type);
        this.stringAdapter.toJson(tVar, option.getText());
        tVar.Z("value");
        this.stringAdapter.toJson(tVar, option.getValue());
        tVar.y();
    }
}
