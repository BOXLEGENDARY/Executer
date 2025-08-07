package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputMultiSelect_AttributesJsonAdapter extends h<InputMultiSelect.Attributes> {

    @NotNull
    private final h<List<Option>> listOfOptionAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "label", "placeholder", "options", "hidden", "disabled"});

    public InputMultiSelect_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableListOfStringAdapter = wVar.f(A.j(List.class, new Type[]{String.class}), L.d(), "prefill");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "label");
        this.listOfOptionAdapter = wVar.f(A.j(List.class, new Type[]{Option.class}), L.d(), "options");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputMultiSelect.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputMultiSelect.Attributes m270fromJson(@NotNull m mVar) throws j {
        mVar.e();
        List list = null;
        String str = null;
        String str2 = null;
        List list2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    list = (List) this.nullableListOfStringAdapter.fromJson(mVar);
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 3:
                    list2 = (List) this.listOfOptionAdapter.fromJson(mVar);
                    if (list2 == null) {
                        throw c.x("options_", "options", mVar);
                    }
                    break;
                case 4:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case 5:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        if (list2 != null) {
            return new InputMultiSelect.Attributes(list, str, str2, list2, jsonLogicBoolean, jsonLogicBoolean2);
        }
        throw c.o("options_", "options", mVar);
    }

    public void toJson(@NotNull t tVar, InputMultiSelect.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableListOfStringAdapter.toJson(tVar, attributes.getPrefill());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("placeholder");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholder());
        tVar.Z("options");
        this.listOfOptionAdapter.toJson(tVar, attributes.getOptions());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
