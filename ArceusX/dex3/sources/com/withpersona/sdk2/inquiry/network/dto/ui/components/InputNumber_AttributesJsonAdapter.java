package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputNumber_AttributesJsonAdapter extends h<InputNumber.Attributes> {

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<Number> nullableNumberAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "label", "placeholder", "hidden", "disabled", "precision"});

    public InputNumber_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableNumberAdapter = wVar.f(Number.class, L.d(), "prefill");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "label");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
        this.nullableIntAdapter = wVar.f(Integer.class, L.d(), "precision");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputNumber.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputNumber.Attributes m272fromJson(@NotNull m mVar) {
        mVar.e();
        Number number = null;
        String str = null;
        String str2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        Integer num = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    number = (Number) this.nullableNumberAdapter.fromJson(mVar);
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 3:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case 4:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case 5:
                    num = (Integer) this.nullableIntAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        return new InputNumber.Attributes(number, str, str2, jsonLogicBoolean, jsonLogicBoolean2, num);
    }

    public void toJson(@NotNull t tVar, InputNumber.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableNumberAdapter.toJson(tVar, attributes.getPrefill());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("placeholder");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholder());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.Z("precision");
        this.nullableIntAdapter.toJson(tVar, attributes.getPrecision());
        tVar.y();
    }
}
