package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.squareup.moshi.A;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputRadioGroup_AttributesJsonAdapter extends h<InputRadioGroup.Attributes> {
    private volatile Constructor<InputRadioGroup.Attributes> constructorRef;

    @NotNull
    private final h<List<OptionWithDescription>> listOfOptionWithDescriptionAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "label", "options", "hidden", "disabled"});

    public InputRadioGroup_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "prefill");
        this.listOfOptionWithDescriptionAdapter = wVar.f(A.j(List.class, new Type[]{OptionWithDescription.class}), L.d(), "options");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputRadioGroup.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputRadioGroup.Attributes m276fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        List list = null;
        String str = null;
        String str2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        int i = -1;
        while (mVar.u()) {
            int iP0 = mVar.P0(this.options);
            if (iP0 == -1) {
                mVar.b1();
                mVar.f1();
            } else if (iP0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(mVar);
            } else if (iP0 == 2) {
                list = (List) this.listOfOptionWithDescriptionAdapter.fromJson(mVar);
                if (list == null) {
                    throw c.x("options_", "options", mVar);
                }
            } else if (iP0 == 3) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                i &= -9;
            } else if (iP0 == 4) {
                jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                i &= -17;
            }
        }
        mVar.j();
        if (i == -25) {
            if (list != null) {
                return new InputRadioGroup.Attributes(str, str2, list, jsonLogicBoolean, jsonLogicBoolean2);
            }
            throw c.o("options_", "options", mVar);
        }
        Constructor<InputRadioGroup.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InputRadioGroup.Attributes.class.getDeclaredConstructor(String.class, String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        if (list == null) {
            throw c.o("options_", "options", mVar);
        }
        return declaredConstructor.newInstance(str, str2, list, jsonLogicBoolean, jsonLogicBoolean2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, InputRadioGroup.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefill());
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
