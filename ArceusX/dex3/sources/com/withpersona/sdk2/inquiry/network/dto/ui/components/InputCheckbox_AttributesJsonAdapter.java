package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputCheckbox_AttributesJsonAdapter extends h<InputCheckbox.Attributes> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "label", "descriptionText", "hidden", "disabled"});

    public InputCheckbox_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "prefill");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "label");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputCheckbox.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputCheckbox.Attributes m254fromJson(@NotNull m mVar) {
        mVar.e();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 3) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
            } else if (iP0 == 4) {
                jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
            }
        }
        mVar.j();
        return new InputCheckbox.Attributes(bool, str, str2, jsonLogicBoolean, jsonLogicBoolean2);
    }

    public void toJson(@NotNull t tVar, InputCheckbox.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getPrefill());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("descriptionText");
        this.nullableStringAdapter.toJson(tVar, attributes.getDescriptionText());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
