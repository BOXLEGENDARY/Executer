package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class InputMaskedText_AttributesJsonAdapter extends h<InputMaskedText.Attributes> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{"prefill", "mask", "secure", "label", "placeholder", "hidden", "disabled"});

    public InputMaskedText_AttributesJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "prefill");
        this.nullableBooleanAdapter = wVar.f(Boolean.class, L.d(), "secure");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InputMaskedText.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public InputMaskedText.Attributes m268fromJson(@NotNull m mVar) {
        mVar.e();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        String str4 = null;
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
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(mVar);
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(mVar);
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
        return new InputMaskedText.Attributes(str, str2, bool, str3, str4, jsonLogicBoolean, jsonLogicBoolean2);
    }

    public void toJson(@NotNull t tVar, InputMaskedText.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z("prefill");
        this.nullableStringAdapter.toJson(tVar, attributes.getPrefill());
        tVar.Z("mask");
        this.nullableStringAdapter.toJson(tVar, attributes.getMask());
        tVar.Z("secure");
        this.nullableBooleanAdapter.toJson(tVar, attributes.getSecure());
        tVar.Z("label");
        this.nullableStringAdapter.toJson(tVar, attributes.getLabel());
        tVar.Z("placeholder");
        this.nullableStringAdapter.toJson(tVar, attributes.getPlaceholder());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
