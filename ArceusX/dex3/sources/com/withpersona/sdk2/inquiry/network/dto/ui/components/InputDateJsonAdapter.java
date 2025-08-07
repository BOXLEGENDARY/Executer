package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputDateJsonAdapter extends h<InputDate> {

    @NotNull
    private final h<InputDate.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<InputDate.InputDateComponentStyle> nullableInputDateComponentStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "styles", "attributes"});

    @NotNull
    private final h<String> stringAdapter;

    public InputDateJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableInputDateComponentStyleAdapter = wVar.f(InputDate.InputDateComponentStyle.class, L.d(), "styles");
        this.nullableAttributesAdapter = wVar.f(InputDate.Attributes.class, L.d(), "attributes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputDate");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputDate m260fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        InputDate.InputDateComponentStyle inputDateComponentStyle = null;
        InputDate.Attributes attributes = null;
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
                inputDateComponentStyle = (InputDate.InputDateComponentStyle) this.nullableInputDateComponentStyleAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                attributes = (InputDate.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new InputDate(str, inputDateComponentStyle, attributes);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, InputDate inputDate) {
        if (inputDate == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, inputDate.getName());
        tVar.Z("styles");
        this.nullableInputDateComponentStyleAdapter.toJson(tVar, inputDate.getStyles());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, inputDate.getAttributes());
        tVar.y();
    }
}
