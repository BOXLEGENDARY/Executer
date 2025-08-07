package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import c8.c;
import com.roblox.client.personasdk.R;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import java.lang.reflect.Constructor;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

public final class VerifyPersonaButton_AttributesJsonAdapter extends h<VerifyPersonaButton.Attributes> {
    private volatile Constructor<VerifyPersonaButton.Attributes> constructorRef;

    @NotNull
    private final h<Button.ButtonType> nullableButtonTypeAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(new String[]{Text.type, "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "url", "hidden", "disabled"});

    @NotNull
    private final h<String> stringAdapter;

    public VerifyPersonaButton_AttributesJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, L.d(), Text.type);
        this.nullableButtonTypeAdapter = wVar.f(Button.ButtonType.class, L.d(), "buttonType");
        this.nullableStringAdapter = wVar.f(String.class, L.d(), "autoSubmitCountdownText");
        this.nullableIntAdapter = wVar.f(Integer.class, L.d(), "autoSubmitIntervalSeconds");
        this.nullableJsonLogicBooleanAdapter = wVar.f(JsonLogicBoolean.class, L.d(), "hidden");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyPersonaButton.Attributes");
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public VerifyPersonaButton.Attributes m308fromJson(@NotNull m mVar) throws j, NoSuchMethodException, SecurityException {
        mVar.e();
        String str = null;
        int i = -1;
        Button.ButtonType buttonType = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (mVar.u()) {
            switch (mVar.P0(this.options)) {
                case -1:
                    mVar.b1();
                    mVar.f1();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(mVar);
                    if (str == null) {
                        throw c.x(Text.type, Text.type, mVar);
                    }
                    break;
                case 1:
                    buttonType = (Button.ButtonType) this.nullableButtonTypeAdapter.fromJson(mVar);
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 3:
                    num = (Integer) this.nullableIntAdapter.fromJson(mVar);
                    break;
                case 4:
                    str3 = (String) this.nullableStringAdapter.fromJson(mVar);
                    break;
                case 5:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    i &= -33;
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(mVar);
                    i &= -65;
                    break;
            }
        }
        mVar.j();
        if (i == -97) {
            if (str != null) {
                return new VerifyPersonaButton.Attributes(str, buttonType, str2, num, str3, jsonLogicBoolean, jsonLogicBoolean2);
            }
            throw c.o(Text.type, Text.type, mVar);
        }
        Constructor<VerifyPersonaButton.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = VerifyPersonaButton.Attributes.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, String.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.c);
            this.constructorRef = declaredConstructor;
        }
        Constructor<VerifyPersonaButton.Attributes> constructor = declaredConstructor;
        if (str == null) {
            throw c.o(Text.type, Text.type, mVar);
        }
        return constructor.newInstance(str, buttonType, str2, num, str3, jsonLogicBoolean, jsonLogicBoolean2, Integer.valueOf(i), null);
    }

    public void toJson(@NotNull t tVar, VerifyPersonaButton.Attributes attributes) {
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.f();
        tVar.Z(Text.type);
        this.stringAdapter.toJson(tVar, attributes.getText());
        tVar.Z("buttonType");
        this.nullableButtonTypeAdapter.toJson(tVar, attributes.getButtonType());
        tVar.Z("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(tVar, attributes.getAutoSubmitCountdownText());
        tVar.Z("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(tVar, attributes.getAutoSubmitIntervalSeconds());
        tVar.Z("url");
        this.nullableStringAdapter.toJson(tVar, attributes.getUrl());
        tVar.Z("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getHidden());
        tVar.Z("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(tVar, attributes.getDisabled());
        tVar.y();
    }
}
