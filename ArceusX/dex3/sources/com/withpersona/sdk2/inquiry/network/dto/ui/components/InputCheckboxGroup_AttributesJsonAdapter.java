package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputCheckboxGroup_AttributesJsonAdapter extends h<InputCheckboxGroup.Attributes> {

    @NotNull
    private final h<List<OptionWithDescription>> listOfOptionWithDescriptionAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "label", "options", "hidden", "disabled"});

    public InputCheckboxGroup_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableListOfStringAdapter = wVar.f(A.j(List.class, new Type[]{String.class}), L.d(), "prefill");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "label");
        this.listOfOptionWithDescriptionAdapter = wVar.f(A.j(List.class, new Type[]{OptionWithDescription.class}), L.d(), "options");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputCheckboxGroup.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputCheckboxGroup.Attributes m251fromJson(@NotNull m mVar) throws j {
        mVar.e();
        List list = null;
        String str = null;
        List list2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                list = (List) this.nullableListOfStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                list2 = (List) this.listOfOptionWithDescriptionAdapter.fromJson(mVar);
                if (list2 == null) {
                    throw c.x("options_", "options", mVar);
                }
            } else if (iP0 == 3) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
            } else if (iP0 == 4) {
                jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        if (list2 != null) {
            return new InputCheckboxGroup.Attributes(list, str, list2, jsonLogicBoolean, jsonLogicBoolean2);
        }
        throw c.o("options_", "options", mVar);
    }

    public void toJson(@NotNull t tVar, InputCheckboxGroup.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableListOfStringAdapter.toJson(tVar, attributes.getPrefill());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("options");
        this.listOfOptionWithDescriptionAdapter.toJson(tVar, attributes.getOptions());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
