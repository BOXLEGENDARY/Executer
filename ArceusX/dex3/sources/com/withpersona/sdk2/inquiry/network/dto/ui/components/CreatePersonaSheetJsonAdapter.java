package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class CreatePersonaSheetJsonAdapter extends h<CreatePersonaSheet> {

    @NotNull
    private final h<CreatePersonaSheet.Attributes> nullableAttributesAdapter;

    @NotNull
    private final h<CreatePersonaSheet.CreatePersonaSheetStyle> nullableCreatePersonaSheetStyleAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"name", "attributes", "styles"});

    @NotNull
    private final h<String> stringAdapter;

    public CreatePersonaSheetJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), "name");
        this.nullableAttributesAdapter = wVar.f(CreatePersonaSheet.Attributes.class, L.d(), "attributes");
        this.nullableCreatePersonaSheetStyleAdapter = wVar.f(CreatePersonaSheet.CreatePersonaSheetStyle.class, L.d(), "styles");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CreatePersonaSheet");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public CreatePersonaSheet m228fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        CreatePersonaSheet.Attributes attributes = null;
        CreatePersonaSheet.CreatePersonaSheetStyle createPersonaSheetStyle = null;
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
                attributes = (CreatePersonaSheet.Attributes) this.nullableAttributesAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                createPersonaSheetStyle = (CreatePersonaSheet.CreatePersonaSheetStyle) this.nullableCreatePersonaSheetStyleAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (str != null) {
            return new CreatePersonaSheet(str, attributes, createPersonaSheetStyle);
        }
        throw c.o("name", "name", mVar);
    }

    public void toJson(@NotNull t tVar, CreatePersonaSheet createPersonaSheet) {
        if (createPersonaSheet == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("name");
        this.stringAdapter.toJson(tVar, createPersonaSheet.getName());
        tVar.Z("attributes");
        this.nullableAttributesAdapter.toJson(tVar, createPersonaSheet.getAttributes());
        tVar.Z("styles");
        this.nullableCreatePersonaSheetStyleAdapter.toJson(tVar, createPersonaSheet.getStyles());
        tVar.y();
    }
}
