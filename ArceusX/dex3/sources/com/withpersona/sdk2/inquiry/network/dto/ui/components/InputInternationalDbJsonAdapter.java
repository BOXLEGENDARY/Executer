package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputInternationalDbJsonAdapter extends h<InputInternationalDb> {

    @NotNull
    private final h<InputInternationalDb.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputInternationalDb.InputInternationalDbComponentStyle> nullableInputInternationalDbComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public InputInternationalDbJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(InputInternationalDb.Attributes.class, L.d(), "attributes");
        this.nullableInputInternationalDbComponentStyleAdapter = wVar.f(InputInternationalDb.InputInternationalDbComponentStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputInternationalDb");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputInternationalDb m263fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputInternationalDb.Attributes attributes = null;
        InputInternationalDb.InputInternationalDbComponentStyle inputInternationalDbComponentStyle = null;
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
                attributes = (InputInternationalDb.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                inputInternationalDbComponentStyle = (InputInternationalDb.InputInternationalDbComponentStyle) this.nullableInputInternationalDbComponentStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputInternationalDb(str, attributes, inputInternationalDbComponentStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputInternationalDb inputInternationalDb) {
        if (inputInternationalDb == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputInternationalDb.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputInternationalDb.getAttributes());
        tVar.Z("styles");
        this.nullableInputInternationalDbComponentStyleAdapter.toJson(tVar, inputInternationalDb.getStyles());
        tVar.y();
    }
}
