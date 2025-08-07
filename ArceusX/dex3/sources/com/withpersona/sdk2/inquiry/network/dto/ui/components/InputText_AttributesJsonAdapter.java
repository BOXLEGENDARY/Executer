package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputText_AttributesJsonAdapter extends h<InputText.Attributes> {

    @NotNull
    private final h<InputText.InputType> inputTypeAdapter;

    @NotNull
    private final h<InputText.AutofillHint> nullableAutofillHintAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "label", "placeholder", "inputType", "autofillHint", "hidden", "disabled"});

    public InputText_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "prefill");
        this.inputTypeAdapter = wVar.f(InputText.InputType.class, L.d(), "inputType");
        this.nullableAutofillHintAdapter = wVar.f(InputText.AutofillHint.class, L.d(), "autofillHint");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputText.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputText.Attributes m285fromJson(@NotNull m mVar) throws j {
        mVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        InputText.InputType inputType = null;
        InputText.AutofillHint autofillHint = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
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
                    inputType = (InputText.InputType) this.inputTypeAdapter.fromJson(mVar);
                    if (inputType == null) {
                        throw c.x("inputType", "inputType", mVar);
                    }
                    break;
                case 4:
                    autofillHint = (InputText.AutofillHint) this.nullableAutofillHintAdapter.fromJson(mVar);
                    break;
                case 5:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    break;
            }
        }
        mVar.j();
        if (inputType != null) {
            return new InputText.Attributes(str, str2, str3, inputType, autofillHint, jsonLogicBoolean, jsonLogicBoolean2);
        }
        throw c.o("inputType", "inputType", mVar);
    }

    public void toJson(@NotNull t tVar, InputText.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefill());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("placeholder");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholder());
        tVar.Z("inputType");
        this.inputTypeAdapter.toJson(tVar, attributes.getInputType());
        tVar.Z("autofillHint");
        this.nullableAutofillHintAdapter.toJson(tVar, attributes.getAutofillHint());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
